package org.pdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PDBConfigServer {

	public static void main(String[] args) {
		SpringApplication.run(PDBConfigServer.class, args);
	}
}
