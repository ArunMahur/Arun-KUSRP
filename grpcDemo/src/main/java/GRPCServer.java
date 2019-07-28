import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserService;

public class GRPCServer {

	public static void main(String args[]) throws IOException, InterruptedException{
		
		Server server=ServerBuilder.forPort(9090).addService(new UserService()).build();
		
		server.start();
		System.out.println("Server started at "+server.getPort());
	    
		server.awaitTermination();
	}
}
