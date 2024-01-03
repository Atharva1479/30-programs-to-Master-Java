//27. Convert json to csv

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;

public class TwentySeven_JsonToCsv {

    public static void main(String[] args) throws IOException {
        File jsonFile = new File("myfile.json");
        Gson gson = new Gson();
        List<Object> jsonData = gson.fromJson(new FileReader(jsonFile), List.class);

        File csvFile = new File("myfile.csv");
        FileWriter csvWriter = new FileWriter(csvFile);

        // Write the header row
        csvWriter.write(",");
        for (String fieldName : jsonData.get(0).keySet()) {
            csvWriter.write(fieldName + ",");
        }
        csvWriter.write("\n");

        // Write the data rows
        for (Object object : jsonData) {
            csvWriter.write(",");
            for (String fieldName : object.keySet()) {
                csvWriter.write(object.get(fieldName).toString() + ",");
            }
            csvWriter.write("\n");
        }

        csvWriter.close();
    }
}

/* */