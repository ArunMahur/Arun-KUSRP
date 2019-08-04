# Step by Step process to write gRPC service, which returns the Hex digest of any text you send it In Python(Project Name::-"GRPC_DEMO_IN_PYTHON")  
          
   **1.** First we need to create a simple venv python project in pycharm.  
   **2.** Then we need to install some packages and compilor to support all the grpc services.Some of them are listed below:-  
         (a)grpcio  
         (b)protobuff compilor    
         (c)pip higher version    
         (d)grpc    
         (e)proto  
     
   **3.** Then we will create a proto file called digestor.proto, that will contains all the service definitions for the current package. This           will be used for generating stubs to be used by the gRPC server and client.  
   **4.** Then we need to create a python file for server called digester_server.py. This is used for servicing incoming requests (kinda like             an HTTP server).  
   **5.** Then we need to create a python file for server called digester_client.py. This is distributed out to other people so that they can             access our server using it.Essentially this makes the gRPC call as simple as calling a native function in the same code base itself.  
   **6.** With the server running in another console(but in the same virtualenv), fire up the python interpreter, and write the following:

**from digestor_client import DigestorClient  
curr_client = DigestorClient()**     

Using the above client instance you can call the gRPC without doing any sort of network handling. Just call the get_digest function on the client object to invoke the gRPC. For example:

currs.get_digest('Random12312312ascsadvsascdaasdcsadcsds')

**prints out the output**  

Digested: "b7ef49c5a735a883b137fe54d734d96a16ce66ec9f1768f7c81c555d1b54336d"  
WasDigested: true
