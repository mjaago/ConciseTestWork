In order to run this application from the command line you have to make sure to have path to your java jdk valued as your system variable
under the variable JAVA_HOME. In addition Docker has to be installed.

To run the application you would first have to run the Docker Postgres container which would also map the port 5432 of the container to your servers port 5432.
Next up you would like to package the maven project to a jar file and after that run that jar file. When executing the packaging command make sure that you
are in the working folder.


Given commands in correct order:
    1)docker run --name concise -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=concisedb -d -p 5432:5432 postgres:9.6
    2)mvn package
    3)java -jar target/app.jar

In order to close the application and remove the container you would have to run the following commands:
    1)jps
    From the given output check what is the process id (PID) of the application running named app.jar.
    2)taskkill /F /PID *the PID of that application*
    3)docker ps
    From the given output check what is the CONTAINER ID of the container running named concise.
    4)docker stop *that containers id*
    5)docker rm *that containers id*