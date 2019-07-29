# Step by Step process for the first gRPC Project to implement and test the gRPC Services (Project Name::-"GRPC_DEMO")  
          
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
    
      
  
