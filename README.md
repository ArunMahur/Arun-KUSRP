# Arun-KUSRP
This Repository contains 2 types of projects, which are as following(Every project contains there individual readme file):-  
(1) GRPC Project in Java using Eclipse and Maven::  
                    (a)grpcDemo  
                    (b)SimpleGrpc  
                    (c)DEMO_GRPC_IN_PYTHON
(2) Test Driven Development Examples(TDD)  
  
    
      
        **What is gRPC**  
gRPC is a high performance, open-source universal REMOTE PROCEDURE CALL framework. By default it uses Protocol Buffers to define exposed services.
The framework provides features such as bidirectional streaming and has support for many different programming languages.
gRPC was initially developed at Google and is now licensed under Apache 2.0.  
  
  In gRPC, 'g' does not stand for google, it's just an recursive.For the transport layer it use http2 which help to take advantage of streaming.For this rpc project we can use the services of streaming from server to client or client to server.
  For the binary level packages they are using protocol buffers.  
    
      
    **Step by Step process for the first gRPC Project to implement and test the gRPC Services [Project Name::-"grpcDemo"]**  
          
**1. Environment setup in java using Maven:-**  
  
   (a)Create a Maven Project(specify groupId)  
   (b)Then create a pom.xml file which contains all the dependencies, goals, plug-In which we want for the project. Also define the input directories which specify the source location.  
   (c)After completing the pom.xml file we will update the project by mavenUpdate and when the update finish run pom.xml as MavenBuild.  
     
**2. Define Services by Creating Protocol Buffers and Stubs**  
  
  (a)Now We will create a user.proto which define Syntax, package, message request, response, types, tags, enum, map, repeated, service, unary request/response. These proto files used to generate Java Stubs.  
  (b)Java Stubs are just java classes or abstract classes.we extend these stubs to implement grpc services.  
  (c)To create the proto file you need to install the protobuffer compilor for example- minimalist.proto file editor.  
  (d)Steps to install it:-  eclipse->help->eclipse market place->search for the editor/compilor->install.  
  (e)Same steps can be followed to install eclipse plugIn, only if it's not already installed.
    
**3. Implementing gRPC Services in Java**  
  
  (a)To implement the grpcs services, we will create a UserServices.java file which contain both logIn() and logOut() mehods.  
    
**4. How to start gRPC Server**  
  
  (a)Then to connect all the services from the server we will create a instance of server GrpcServer.java.It will specify a particular port to connect with the client.  
    
**5. How to test GRPC Services using GUI Client(BloomRPC)**  
  
  (a)To test the API/ all the services we will use a client GUI called BloomRPC.You can download it for free from the following link :: [https://github.com/uw-labs/bloomrpc/releases].  
  (b)In BloomRPC we need to specify server address and import the port files.  
  (c)Then open the method in editor and check the method by hit play button.  
    
      
   **=>SimpleGrpc project is to send the message on the server.This project also follows the same steps as abve But the Big difference is in this project we are not using BloomRpc as Client GUI. Instead of this we have made different-2 packages and classes for both client and server and it's also working really well.** 
    
   **----------------------------------------------End Of GRPC Project--------------------------------------------------**                             
        
   **Test Driven Development Examples(TDD)**
              
This project contains example of test driven development in Java.We have used some basics teting function to understand what it is.  
  
  
Test-driven development (TDD) is a software development process that relies on the repetition of a very short development cycle: first the developer writes an (initially failing) automated test case that defines a desired improvement or new function, then produces the minimum amount of code to pass that test, and finally refactors the new code to acceptable standards.

The following sequence of steps is generally followed:

1.Add a test  
2.Run all tests and see if the new one fails  
3.Write some code  
4.Run tests  
5.Refactor code  
6.Repeat  
