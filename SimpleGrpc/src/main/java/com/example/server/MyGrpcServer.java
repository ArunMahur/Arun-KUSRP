package com.example.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class MyGrpcServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		
         Server server=ServerBuilder.forPort(8080).addService(GreetingServiceGrpc.bindService(new GreetingServiceImpl())).build(); 
         server.start();
         server.awaitTermination();
	}

}
