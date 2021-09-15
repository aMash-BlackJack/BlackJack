# BlackJack
Premise: 
	Produce a mock of BlackJack game with additions such as:
Front/back end
		Microservices
		Testing
    
Contents

Architecture:
	Front end: powered using HTML, Javascript, CSS. Uses React to create the application.
 Selenium – web framework that allows execution of cross-browser tests
	Back end: 
Springboot – helps create applications that can run without relying on an external webserver, by embedding a web server (Tomcat) into applicatoin
SonarCloud – Static analysis code reviewing tool
Junit – Unit testing framework for Java
TestNG – Testing framework 
JacCoCo – provides coverage reports for SonarCloud to analyse
Selenium – web framework that allows execution of cross-browser tests

Development environment	

Tools & Specification
IntelliJ 2021.1 – Used to write code and provides a static analysis of code while being written
JacCoCo
Junit
SonarCloud
Springboot
Selenium
Git
GitHub
Cucumber/Gherkin
Apache Maven 3.8.1

# Documentation

Created: September 14, 2021 11:34 PM
Reviewed: No

# BlackJack

## Premise:

```
Produce a BlackJack game using a microservice architecture, utilising development methods such as TDD & BDD with a pure focus on the testing of the services.
```

Contents

## Project Management:

We've decided to proceed with using the Kanban agile methodology because it supports our pair  well, this is can be sumed up to:

it means we aren't locked into roles, 

it means we can factor in change during the production process as we are introduced to new tools

# Architecture:

## Service 1:

React front end that provides the UI for the card game
Front end: powered using HTML, JavaScript, CSS. Uses React and Material-UI library to create the application.

## Service 2:

Card deck Generator: Generates a deck of cards, returns a JSON that's passed into the game rules Which then is separated into hands and passed into the front end.

## Development Environments:

**Development Environment 1**

OS: MS Windows 10 Pro - Build 19043

CPU: I9-9900KF

RAM: 32GB DDR4 

Storage: 250GB NVMe SSD, 500GB NVMe, 1TB Sata SSD

GPU: Nvidia RTX 3080

IDE: InteliJ IDEA Community 2021.2

**Development Environment 2**

OS: Windows 10 Home Build 19042

CPU: Intel Core i7-8750H @2.20GHz

RAM: 8GB DDR4 

Storage: 1TB SSD 

GPU: NVIDIA GeForce GTX 1050 Ti

IDE: InteliJ IDEA Community 2021.2

# CI/CD Pipeline Setup

## AWS:

We are using Amazon Web Services in order to host the services and the instance of Jenkins in order to automate the CI/CD pipeline. 

**Creating the instance:**

1. Navigate to the AWS console.
2. Navigate to EC2.
3. Click instances.
4. Click launch instance .
5. Search for Ubuntu server 18.04 - LTS.
6. Select t2.micro.
7. Add a new tag with the key name and value Jenkins. (This is strictly for ease of access and not a necessary step in order to complete the creation)
8. Add a new security group of type SSH, TCP Protocol and port 8080, Source to anywhere and add a short description.
9. Add a new security group of type SSH, TCP Protocol and port 3000, Source to anywhere and add a short description.
10. After this you can launch your instance and log into the AWS instance CLI and proceed with the next steps.

### Java installation:

```bash
sudo apt-get install openjdk-11-jdk
```

Wait for the installation to complete then begin installing Jenkins

### Jenkins:

**What is it?**

Jenkins is an open source automation server. 

**Why is it used?**

it helps automate the parts of software development related to building, testing, and deploying, facilitating continuous integration and continuous delivery. 

**Prerequisites:** Java installation process has completed

**Installation:**

```bash
wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add -
sudo sh -c 'echo deb https://pkg.jenkins.io/debian-stable binary/ > \
    /etc/apt/sources.list.d/jenkins.list'
sudo apt-get update
sudo apt-get install jenkins
```

**Starting Jenkins:**

```bash
sudo systemctl start jenkins
```

**Connecting to the Jenkins instance:**

1. Under EC2 > instance name > copy Public IPV4 address
2. Then open a browser window and paste with :8080 added on the end of the address - This is Jenkins default port to use
3. If performed correctly with no errors occurring, Jenkins should now be on your screen, and will be asking for an admin password
4. Navigate back to the instances CLI
    1. Then type:  

    ```bash
    sudo cat /var/lib/jenkins/secrets/initialAdminPassword
    ```

 5. Follow the setup process in Jenkins and add a new admin user and select the default plugins. the instance should then be rebooted and you will be greeted with a login page for Jenkins

**Build for backend & Plugin Configuration:**

1. Navigate to Jenkins Dashboard > Manage Plugins > Available 
2. Then add the Maven Integration plugin
3. Restart the instance after to ensure proper installation
4. Navigate to Jenkins Dashboard > New Item
5. Add a name and select "Maven Project"
6. Add a description 
7. Tick the box that says GitHub project & add the URL of the GitHub Repo ( [https://github.com/aMash-BlackJack/BlackJack/](https://github.com/aMash-BlackJack/BlackJack/) )
8. Change the Source Code Management to Git and add the Repository URL (Found under clone in GitHub)
9. Under Credentials click add New
10. in a new window navigate to GitHub and generate a new Personal access token (Settings > Developer settings)
11. Under the kind of credentials select secret text
12. Paste the access token into the secret input box and add an ID / Description 
13. Ensure the main branch is Specified
14. Add the GitHub hook trigger for GITScm polling
15. In post build settings add Git Publisher
16. Select the push only if build succeeds
17. Under branches select Release and target remote name type origin
18. Then click Save
19. Then click Run, If the build succeeds It will push the code up to the release branch.
20. Add the github webhook so it runs on push

**Build for Front end & Plugins configuration**

1. Navigate to Jenkins Dashboard > Manage Plugins > Available 
2. Then add the Node JS plugin
3. Restart the instance after to ensure proper installation

# Spring boot card service setup

### Maven setup:

Maven builds a project using its project object model (POM) and a set of plugins, it reduces the time to MVP and drastically reduces the understanding of nuances and configuration to perform the build process. 

**Pom.XML:**

[Dependencies](https://www.notion.so/6a8833e65603494fa0bc8ed8c642d71b)

# React front-end setup

## npm setup

[Dependencies](https://www.notion.so/b6561c3411e3484b9e8cf06a54a0fb77)

# Testing methods

## Front end:

Jest 

Selenium – web framework that allows execution of cross-browser tests

## Back end:

- Junit – Unit testing framework for Java
- TestNG – Testing framework
- JacCoCo – provides coverage reports for SonarCloud to analyse

Development environment

Tools & Specification
IntelliJ 2021.1 – Used to write code and provides a static analysis of code while being written

JacCoCo

SonarCloud
Springboot
Selenium
Git
GitHub

testng

jacoco

Junit
Cucumber/Gherkin
Apache Maven 3.8.1

Issues: 

Developers Ill

Devlelopers house viewings