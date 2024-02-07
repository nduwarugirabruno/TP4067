package com.tp.tp4067.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.tp.tp4067.catalogue.Vehicule;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    private static DataLoader instance = null;

    private static final ObjectMapper objectMapper = new ObjectMapper();

    private DataLoader(){
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static DataLoader getInstance() {
        if (instance == null)
            instance = new DataLoader();
        return instance;
    }

    public ArrayList<Vehicule> loadData() {

        try  {
            // Get files Paths
            Path wFilePath = Paths.get("src/main/resources/json/vehicules.json");

            // Read Files
            List<String> wLines = Files.readAllLines(wFilePath);

            // Prepare data in variables
            String wJsonData = String.join("", wLines);

            return objectMapper.readValue(wJsonData, new TypeReference<ArrayList<Vehicule>>() {
            });

        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
            return new ArrayList<>();
        }
    }

    public void saveData(ArrayList<?> vehicules) {
        try {
            Path wFilePath = Paths.get("src/main/resources/json/vehicules.json");
            objectMapper.writeValue(wFilePath.toFile(), vehicules);
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}
