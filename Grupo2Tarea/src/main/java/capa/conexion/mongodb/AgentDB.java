package capa.conexion.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class AgentDB {

	public AgentDB() {

	}

	public static void connect() {

		MongoClientURI uri = new MongoClientURI(
				"mongodb+srv://Valentin:Valentin@cluster0.iokjk.mongodb.net/Prueba?retryWrites=true&w=majority");

		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("Prueba");
		
		
		

	}

}
