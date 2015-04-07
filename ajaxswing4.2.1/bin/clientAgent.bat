@echo off
rem SYNTAX: ClientAgent <appName> <rmiPort> <id>

if not "%AJAXSWING_HOME%" == "" goto noSetAjaxSwingHome
    set ORIGINAL_DIR=%cd%
    %~d0
    cd %~dp0..
    set AJAXSWING_HOME=%cd%
    cd %ORIGINAL_DIR%
:noSetAjaxSwingHome

call "%AJAXSWING_HOME%\bin\setEnv.bat"
if "%ERROR_LEVEL%"=="1" goto end

rem Make sure AjaxSwing libraries are compatible with the current JDK version
"%JAVA_HOME%\bin\java" -Dajaxswing.home=%AJAXSWING_HOME% -classpath "%AJAXSWING_HOME%\lib\bootstrap.jar" com.creamtec.core.Bootstrapper
if "%ERROR_LEVEL%"=="1" goto end

set JAVA_OPTS=%JAVA_OPTS% -Djava.rmi.dgc.leaseValue=5000
set JAVA_OPTS=%JAVA_OPTS% %JVM_OPTS%

start /B "AjaxSwing Client Agent" "%JAVA_HOME%\bin\java" %JAVA_OPTS% com.creamtec.ajaxswing.JVMProcess %1 %2 %3 > "%AJAXSWING_HOME%\logs\%1_%3.out" 2>&1

@echo on

:end
