package com.example.client;

import com.example.server.GreetingServiceGrpc;
import com.example.server.HelloRequest;
import com.example.server.HelloResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class MyGrpcClient {

	public static void main(String[] args) {
	 
		
		//1. Channel, ManagedChannel, userPlainText?
		//2. Load Balancing, Name Resolver
		//3. Blocking vs Non-Blocking stubs, oh and Futures
		//4. Builders
		ManagedChannel channel=ManagedChannelBuilder.forAddress("LocalHost", 8080)
				  .usePlaintext(true)
				  .build();
		
		GreetingServiceGrpc.GreetingServiceBlockingStub stub=GreetingServiceGrpc.newBlockingStub(channel);
	
		HelloResponse response=stub.greeting(HelloRequest.newBuilder().setName("Arun").addHobbies("To do Programming").build());
		System.out.println(""+response);
	}

}
