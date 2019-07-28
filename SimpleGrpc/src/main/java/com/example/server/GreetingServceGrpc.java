package com.example.server;

import io.grpc.stub.StreamObserver;

public interface GreetingServceGrpc {

	public interface GreetinService {

		void greeting(HelloRequest request, StreamObserver<HelloResponse> responseObserver);

	}

}
