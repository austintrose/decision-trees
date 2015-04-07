@echo off

rem Edit this file to setup AjaxSwing environment and your application parameters

rem JAVA_HOME   	- optional environment variable
rem AJAXSWING_HOME 	- can be set to explicitly specify AjaxSwing installation directory. 
rem 			  If not set, AjaxSwing will attempt to locate it automatically
rem JAVA_OPTS      	- Add your application options such as -D parameters to JVM here, 
rem 			  for example JAVA_OPTS=-Dajaxswing.home=c:\ajaxswing4.0
rem KEEP_CURRENT_DIR 	- If set to any value, for example "true", AjaxSwing will preserve the current directory,
rem 			  otherwise AjaxSwing will change directory to %AJAXSWING_HOME%\wcapps
rem                       Note, that if this variable is used AJAXSWING_HOME must be set to a full path to 
rem 			  AjaxSwing installation directory.


rem set JAVA_HOME=C:\Java\jdk1.5
rem set AJAXSWING_HOME=C:\Java\AjaxSwing
rem set JAVA_OPTS=
rem set KEEP_CURRENT_DIR=true

rem -------------------------------------------------------------------------------------------------------


if not "%JAVA_HOME%" == "" goto gotJavaHome
   echo The JAVA_HOME environment variable is not defined
   echo This environment variable is needed to run this program
   set ERROR_LEVEL=1
   pause
   goto end

:gotJavaHome
if not exist "%JAVA_HOME%\bin\java.exe" goto noJavaHome
if not exist "%JAVA_HOME%\bin\javaw.exe" goto noJavaHome
goto okJavaHome

:noJavaHome
   echo The JAVA_HOME environment variable is not defined correctly
   echo This environment variable is needed to run this program
   set ERROR_LEVEL=1
   pause
   goto end
:okJavaHome


if "%JAVA_HOME%" == "" goto doneJavaHome
   if exist "%JAVA_HOME%\bin\javaw.exe" goto doneJavaHome
      echo JAVA_HOME does not point to valid Java installation directory. Try setting it manually in AjaxSwing\bin\setEnv.bat
      set ERROR_LEVEL=1
      pause
      goto end
:doneJavaHome


if exist "%AJAXSWING_HOME%\bin\startServer.bat" goto foundAjaxSwing
  echo AJAXSWING_HOME does not point to AjaxSwing installation directory. Try setting it manually in AjaxSwing\bin\setEnv.bat
  set ERROR_LEVEL=1
  pause
  goto end
:foundAjaxSwing




rem Change to the apps directory for AjaxSwing
if not "%KEEP_CURRENT_DIR%" == "" goto noChangeDirToApps
  cd "%AJAXSWING_HOME%\wcapps"
:noChangeDirToApps


set CATALINA_HOME=%AJAXSWING_HOME%\tomcat
set JAVA_OPTS=%JAVA_OPTS% -Xbootclasspath/p:"%AJAXSWING_HOME%\lib\boot\asboot.jar" -Xmx512m -Dajaxswing.home="%AJAXSWING_HOME%" 

rem Uncomment for remote debugging
rem set JAVA_OPTS=%JAVA_OPTS% -Xdebug -Xrunjdwp:transport=dt_socket,address=8000,server=y,suspend=n

call "%AJAXSWING_HOME%\bin\_setcp.bat"


:end

