import subprocess
from os import *
from time import sleep

javaList = []

def javabuilder():
	print("\n\033[1;37m javabuilder 0.1.1 \n")
	#build section
	print("\n==========================================\n[java compiling...]\n==========================================\n")
	global javaList
	javaList = listdir(path.realpath('source'))
	
	print(javaList)
	for index in range(len(javaList)):
		target = javaList[index]
		print("Target is --- > " + target)
		lenge = len(target)
		check = target[lenge-4:lenge]
		sleep(0.5)
		if(check == "java"):
			cmd = ["javac", "-d", "." , "./source/" + (str)(target)]
			p = subprocess.Popen(cmd)
			print(target + "...done")
		else:
			pass
	
	print("\n==============build done=============\n\033[1;m")

