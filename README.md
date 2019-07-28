# Arun-KUSRP
This Repository contains 2 types of projects, which are as following:-  
(1) GRPC Project in Java using Eclipse and Maven::  
                    (a)grpcDemo  
                    (b)SimpleGrpc  
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
    
**3. Implementing gRPC Services in Java**  
  
  (a)To implement the grpcs services, we will create a UserServices.java file which contain both logIn() and logOut() mehods.  
    
**4. How to start gRPC Server**  
  
  (a)Then to connect all the services from the server we will create a instance of server GrpcServer.java.It will specify a particular port to connect with the client.  
    
**5. How to test GRPC Services using GUI Client(BloomRPC)**  
  
  (a)To test the API/ all the services we will use a client GUI called BloomRPC.You can download it for free from the following link :: [https://github.com/uw-labs/bloomrpc/releases].  
  (b)In BloomRPC we need to specify server address and import the port files.  
  (c)Then open the method in editor and check the method by hit play button.  
    
      **[                                END                            ]**
