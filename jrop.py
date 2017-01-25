"""
dddsfsdfJpype Project (Java execution program)
   Copyright(C) 2016 MIRO Ha Hyeon soo
sdfdsdfsdfsdføsf[CAUTION!] Execuation javac file save at "data" folder!! 

Packgename, Classname, same class name and integrate "super();"
and must contain to "public void output()" method!!!
"""

#Github test commit test7234

#import python module

import subprocess
from os import *
from jpype import *
from time import sleep
import datetime
import sys
from javabuilder import javabuilder

"""

Global variable
NOTE : Don't Custom This area

"""

#User data 
	#TODO : "Packagename.ClassName"
data = []
javaList = []	
#global variable
importClassList = []
instClassList = []
inputErrorCheck = []
"""
JVM setup section
TODO: you can custom path
"""

#set JVM
def setup():

    global inputErrorCheck
    print("\n\033[1;36m Jrop 0.0.2 \n")
    #Setup Java virtual Machine
    print("\n==========================================\n[MIRO Python-Java Project]")
    print("Copyright(C)2016 Ha Hyeon soo")
    print((str)(datetime.datetime.now())+"\n==========================================\n")
    print("Setting JVM...")
    sleep(2)
    startJVM(getDefaultJVMPath())
    isThreadAttachedToJVM()
     
    #Read file lists
    print("\n==========================================\n[output class file list]")
    #XXX : quiz - > data
    filelist = listdir(path.realpath('jrop_data'))
    
    for i in filelist:
        check = i.split('.')
        inputErrorCheck.append(check[0])
        
    print("\033[1;32m\n " + (str)(filelist)  + " \033[1;36m \n==========================================\n")

"""
User select JAVA class file
HACK: add user input error avoid system
"""


#User set import class files
def userImport():
    global inputErrorCheck
    while(1):
        flag = False
        counter = 0
        var = raw_input("\n[Insert Class Name] :")
        print("User input class : " + var )
        
        #user in put error check
        for cmp in inputErrorCheck:
            if(cmp == var):
                flag = True
            else:
                pass
        if(flag == True):
            data.append("jrop_data." + (str)(var))
            counter = counter + 1
            print("\n")
        else:
            print("\033[1;31m You Insert wrong Name \033[1;36m \n")           
                  
        var2 = raw_input("\033[1;32m ------> Will you continue? [Y/N]  \033[1;36m ")
        if((var2 == 'Y') or (var2 == 'y')):
            pass
        else:
            if(counter == 0):
                print("\n\n\033[1;31mYou didn't insert JavaClass File!")
                print("after 5 sec auto exit...\033[1;m\n\n")
                sleep(5)
                sys.exit(0)
            print(data)
            print("\n================end import==================\n")    
            break

"""
Import Class & storage on global variable data
"""

#import class
def importClass():
	global data
	global importClassList
	global instClassList

	for i in data:        
		importClassList.append(JClass(i))
	for i in range(len(importClassList)):
		instClassList.append(importClassList[i]())
	
	print("\n=================info=====================\n")
	sleep(1)
	print(importClassList)		
	sleep(1)
	print(instClassList)
	sleep(1)
	print("\n==========================================\n\033[1;m")

"""
Execuation java
"""

#output section
#TODO: you must know about class-method
def output():
	global instClassList
	global param
	
	print("\033[1;33m\n[OUTPUT]\n==========================================\n")
	sleep(2)
	for i in range(len(instClassList)):
		print("\n==========================================\n TEST class = [" + (str)(i) + "]\n==========================================\n")
		instClassList[i].output()
		print("\n...DONE...\n==========================================\n")

#user select exit
def exitCheck():
    var = raw_input("\033[1;41m Do you wanna exit? [Y/N] :\033[1;m")
    if(var == "Y"):
        sys.exit(0)
    else:
        output()
        exitCheck()    
        
#app run
if __name__ == '__main__':
    javabuilder()
    setup()
    userImport()
    importClass()
    output()
    print("\n================Finish====================\n\033[1;m")
    exitCheck()
