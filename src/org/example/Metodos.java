/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.clasesprincipales.*;



/**
 *
 * @author vicen
 */
public class Metodos {
    private final static String token = "cb4eb0d99cdd43e78736a0f5d8c916d1";
    
    public LeagueScorers mostrarLeagueScorers(){
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.football-data.org/v4/competitions/SA/scorers"))
                    .header("X-Auth-Token", token)
                    .build();

            HttpResponse<String> response;

            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            LeagueScorers leagueScorers = gson.fromJson(response.body(), LeagueScorers.class);

            return leagueScorers;
            
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
