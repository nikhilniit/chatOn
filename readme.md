Collaboration Platform:

	Introduction:
			A collaboration platform is a category of business software that adds broad social networking capabilities to work processes.The project focuses on creating a collaboration tool that can be used by multiple people irrespective of their geographical location. Features of this application are Blog,Forum,Careers,Chat,Friends

The project is been categorized into two parts frontend and the backend.
	
		
	Technologies used :
		IDE 	     :   Eclipse
		Frontend	     :  Angularjs,Html,CSS,Bootstrap
		Middle Tier(Business Logic)  :   Java,Hibernate,Spring,Sql Queries,Rest-Service
 		Tools Used   :   Postman
		Backend       :    H2

Detailing of the technologies:

IDE:

    Eclipse: Eclipse is an integrated development environment (IDE) used in computer programming, and is the most widely used Java IDE.It contains a base workspace and an extensible plug-in system for 	                 customizing the environment. Eclipse is written mostly in Java and its primary use is for developing Java applications.

FRONTEND:

    Angularjs: AngularJS is a very powerful JavaScript Framework. It is used in Single Page Application (SPA) projects.It can be added to an HTML page with a <script> tag.AngularJS extends HTML attributes 	     with Directives, and binds data to HTML with Expressions. It is a library written in JavaScript.AngularJS is distributed as a JavaScript file, and can be added to a web page with a script tag:

              	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
	  	
    HTML : HTML is the standard markup language for creating Web pages.                
                HTML stands for Hyper Text Markup Language
 	HTML describes the structure of Web pages using markup
	HTML elements are the building blocks of HTML pages
	HTML elements are represented by tags
	HTML tags label pieces of content such as "heading", "paragraph", "table", and so on Browsers do not display the HTML tags, but use them to render the content of the page.
   
    CSS : CSS stands for Cascading Style Sheets
             CSS describes how HTML elements are to be displayed on screen, paper, or in other media
             CSS saves a lot of work. It can control the layout of multiple web pages all at once External stylesheets are stored in CSS files

    Bootstrap : Bootstrap is a free front-end framework for faster and easier web development
	       Bootstrap includes HTML and CSS based design templates for typography, forms, buttons, tables, navigation, modals, image carousels and many other, as well as optional JavaScript plugins
	       Bootstrap also gives you the ability to easily create responsive designs

    Advantages of Bootstrap:

	Easy to use: Anybody with just basic knowledge of HTML and CSS can start using Bootstrap
	Responsive features: Bootstrap's responsive CSS adjusts to phones, tablets, and desktops
	Mobile-first approach: In Bootstrap 3, mobile-first styles are part of the core framework
	Browser compatibility: Bootstrap is compatible with all modern browsers (Chrome, Firefox, Internet Explorer, Safari, and Opera)


MiddleTier:

    Java :  Java programming language was originally developed by Sun Microsystems which was initiated by James Gosling and released in 1995 as core component of Sun Microsystems' Java platform (Java 		1.0 [J2SE]). 	
            
	Java is 
                         
 		1.Object Oriented - In Java, everything is an Object. Java can be easily extended since it is based on the Object model.

		2.Platform Independent - Unlike many other programming languages including C and C++, when Java is compiled, it is not compiled into platform specific machine, rather into platform 		                   independent byte code. This byte code is distributed over the web and interpreted by the Virtual Machine (JVM) on whichever platform it is being run on.

		3.Simple - Java is designed to be easy to learn. If you understand the basic concept of OOP Java, it would be easy to master.

		4.Secure - With Java's secure feature it enables to develop virus-free, tamper-free systems. Authentication techniques are based on public-key encryption.

		5.Architecture-neutral - Java compiler generates an architecture-neutral object file format, which makes the compiled code executable on many processors, with the presence of Java 		                  runtime system.

		6.Portable - Being architecture-neutral and having no implementation dependent aspects of the specification makes Java portable. Compiler in Java is written in ANSI C with a clean 		                    portability boundary, which is a POSIX subset.

		7.Robust - Java makes an effort to eliminate error prone situations by emphasizing mainly on compile time error checking and runtime checking.

		8.Multithreaded - With Java's multithreaded feature it is possible to write programs that can perform many tasks simultaneously. This design feature allows the developers to construct 		                  interactive applications that can run smoothly.

		9.Interpreted - Java byte code is translated on the fly to native machine instructions and is not stored anywhere. The development process is more rapid and analytical since the linking is 		an incremental and light-weight process.

		10.High Performance - With the use of Just-In-Time compilers, Java enables high performance.

		11.Distributed - Java is designed for the distributed environment of the internet.

		12.Dynamic - Java is considered to be more dynamic than C or C++ since it is designed to adapt to an evolving environment. Java programs can carry extensive amount of run-time 		                 information that can be used to verify and resolve accesses to objects on run-time.



     Hibernate Framework:
	
	Hibernate framework simplifies the development of java application to interact with the database. Hibernate is an open source, lightweight, ORM (Object Relational Mapping) tool.
	An ORM tool simplifies the data creation, data manipulation and data access. It is a programming technique that maps the object to the data stored in the database.The ORM tool internally uses 	the JDBC API to interact with the database.

	Advantages of Hibernate Framework:

		1. Opensource and Lightweight: Hibernate framework is opensource under the LGPL license and lightweight.

		2. Fast performance: The performance of hibernate framework is fast because cache is internally used in hibernate framework. There are two types of cache in hibernate framework first 		level cache and second level cache. First level cache is enabled bydefault.

		3. Database Independent query: HQL (Hibernate Query Language) is the object-oriented version of SQL. It generates the database independent queries. So you don't need to write 		database specific queries. Before Hibernate, If database is changed for the project, we need to change the SQL query as well that leads to the maintenance problem.

		4. Automatic table creation: Hibernate framework provides the facility to create the tables of the database automatically. So there is no need to create tables in the database manually.

		5. Simplifies complex join: To fetch data form multiple tables is easy in hibernate framework.

		6. Provides query statistics and database status: Hibernate supports Query cache and provide statistics about query and database status.


     Rest-Service:

	RESTful Web Services are REST architecture based web services. In REST Architecture everything is a resource. RESTful web services are light weight, highly scalable and maintainable and are very 	commonly used to create APIs for web based applications.
	REST stands for REpresentational State Transfer. REST is web standards based architecture and uses HTTP Protocol for data communication. It revolves around resource where every component is 	a resource and a resource is accessed by a common interface using HTTP standard methods. REST was first introduced by Roy Fielding in 2000.
	
	HTTP Methods

		GET - Provides a read only access to a resource.

		PUT - Used to create a new resource.

		DELETE - Used to remove a resource.

		POST - Used to update a existing resource or create a new resource.

		OPTIONS - Used to get the supported operations on a resource.



    Tools:

	Postman : The idea for Postman arose while the founders were working together, and were frustrated with the existing tools for testing APIs. They felt there had to be a better language for 		developers to communicate about APIs. This led to the creation of Postman. Postman helps you build, test, and document APIs faster. 

Database:

	H2 : The H2 Console application lets you access a database using a browser. This can be a H2 database, or another database that supports the JDBC API. Web Browser - H2 Console Server - H2 		        Database.This is a client/server application, so both a server and a client (a browser) are required to run it.


Project Description:

	Backend : 
		
		It is a maven project --> maven-archetype-webapp - 1.0 -->GroupId - com.chat --> ArtifactId --> chat
		
		Basically it is the business logic. It is been categorized into 3 packages. They are
		1.com.chat.configuration
		2.com.chat.model
		3.com.chat.Dao
		4.com.chat.controller


	1.com.chat.configuration : 
		1.ApplicationConfiguration: This class is responsible for the behaviour of the model classes i.e the crud operations are performed by this class ,the database configuration is been 		                  deployed in this configuration file and the application class loader is been mentioned in this configuration file.
		
		2.chatzzConfiguration,chatzzInit:To eliminate the xml file a substitute is taken in the form of these two classes.
		
	2.com.chat.model : The variables


 