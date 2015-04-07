#! /bin/sh
#
# Shell script to install AjaxSwing libraries for JDK 1.5

# resolve links - $0 may be a softlink
PRG="$0"

while [ -h "$PRG" ]; do
  ls=`ls -ld "$PRG"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '.*/.*' > /dev/null; then
    PRG="$link"
  else
    PRG=`dirname "$PRG"`/"$link"
  fi
done

# Get standard environment variables
PRGDIR=`dirname "$PRG"`

# Only set AJAXSWING_HOME if not already set
[ -z "$AJAXSWING_HOME" ] && AJAXSWING_HOME=`cd "$PRGDIR/../.." ; pwd`

if [ -r "$AJAXSWING_HOME"/bin/setEnv.sh ]; then
  . "$AJAXSWING_HOME"/bin/setEnv.sh
fi

cd "$AJAXSWING_HOME/lib/boot"

"$JAVA_HOME/bin/java" -version

echo Extracting platform files...
RT_JAR_PATH="$JAVA_HOME"/jre/lib/rt.jar
if [ ! -f $RT_JAR_PATH ] ;  then
    RT_JAR_PATH="$JAVA_HOME"/lib/rt.jar
fi 
if [ ! -f $RT_JAR_PATH ] ;  then
    echo Unable to autodetect path to JDK rt.jar. Please set manually in applyPatches script
    exit 1
fi 

"$JAVA_HOME/bin/jar" xf "$RT_JAR_PATH" java/awt/Component

echo Applying patches...
"$JAVA_HOME/bin/java" -Dcom.creamtec.home="$AJAXSWING_HOME" -cp "$AJAXSWING_HOME/lib/boot/asboot.jar:$AJAXSWING_HOME/lib/asm-all-3.1.jar" com.creamtec.core.ClassPatcher

echo Repackaging jars...
"$JAVA_HOME/bin/jar" uf asboot.jar java

echo Deleting temporary files...
rm -r java

echo Done
