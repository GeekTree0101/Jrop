[Jrop Project 0.0.2]

Copyright(C) 2016 MIRO Ha Hyeon soo

MIRO?
KyeonBuk Univ Electronics Science study group MIRO
IT2 - 244 

[source site] 
http://cafe.naver.com/knumiro/208
update : 2016.3.30

Before you must download Python moulde & system check

1. install jpype
   https://pypi.python.org/pypi/JPype1
   unzip JPype1-0.6.1.tar.gz -> python setup.py build or install

2. JAVA path check -> JAVA_HOME path

   Window -> Envirment -> JAVA_HOME path or jdk path

   Linux  -> sudo vi /etc/bash.bashrc -> 
          insert : export JAVA_HOME=/usr/lib/jvm/java-7-openjdk-amd64
                   export PATH=$PATH:$JAVA_HOME/bin
   	  -> source /etc/bash.bashrc


[1] Java source file dir -> source
    Compiled javac file dir -> jrop_data

[2] run -> python jrop.py

https://github.com/GeekTree0101/Jrop/blob/master/icon.png
