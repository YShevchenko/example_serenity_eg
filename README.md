# text_task
Prerequisites: 
1) Install Java 
2) Install maven
3) Install git

Add Environment variables:
For Java:
1) JAVA_HOME=[Path to your JDK folder. For example:"C:\Program Files\Java\jdk1.8.0_60"]
2) add "%JAVA_HOME%\bin;" to "Path" System variable

For Maven
1) M2_HOME = [Path to your maven folder: the one you choose to unzip maven zip. For example: "D:\Software\apache-maven-3.1.1" ]
2) add "%M2_HOME%\bin;" to "Path" System variable


To run tests:
1) Clone repository:
git clone https://github.com/YShevchenko/test-task-evolution-gaming

2) Invoke maven commands:
mvn clean compile - to compile TAF
mvn verify - to run tests 


To see the report:
1) Open {repository_path}/target/site/serenity/index.html
*You can open each each test by clicking on its name (bottom of the main reports page)
Also you can expand steps of test by clicking on the first step (bottom of each test page)

