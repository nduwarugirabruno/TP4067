package com.tp.tp4067.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.tp.tp4067.catalogue.Vehicule;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DataLoader {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public DataLoader(){
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    protected static void loadData() {

        try  {
            // Get files Paths
            Path wFilePath = Paths.get("jsonFiles/WifiConfig.json");

            // Read Files
            List<String> wLines = Files.readAllLines(wFilePath);

            // Prepare data in variables
            String wJsonData = String.join("", wLines);

            // Load data in variables
            Vehicule vehicule = objectMapper.readValue(wJsonData, new TypeReference<>() {
            });

            // Show Datas in console
            System.out.println(vehicule);


        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}
