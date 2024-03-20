import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkingWithJson {

    private String json = "[\n" +
            "\t{\n" +
            "\t\t\"dia\": 1,\n" +
            "\t\t\"valor\": 22174.1664\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 2,\n" +
            "\t\t\"valor\": 24537.6698\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 3,\n" +
            "\t\t\"valor\": 26139.6134\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 4,\n" +
            "\t\t\"valor\": 0.0\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 5,\n" +
            "\t\t\"valor\": 0.0\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 6,\n" +
            "\t\t\"valor\": 26742.6612\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 7,\n" +
            "\t\t\"valor\": 0.0\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 8,\n" +
            "\t\t\"valor\": 42889.2258\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 9,\n" +
            "\t\t\"valor\": 46251.174\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 10,\n" +
            "\t\t\"valor\": 11191.4722\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 11,\n" +
            "\t\t\"valor\": 0.0\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 12,\n" +
            "\t\t\"valor\": 0.0\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 13,\n" +
            "\t\t\"valor\": 3847.4823\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 14,\n" +
            "\t\t\"valor\": 373.7838\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 15,\n" +
            "\t\t\"valor\": 2659.7563\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 16,\n" +
            "\t\t\"valor\": 48924.2448\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 17,\n" +
            "\t\t\"valor\": 18419.2614\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 18,\n" +
            "\t\t\"valor\": 0.0\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 19,\n" +
            "\t\t\"valor\": 0.0\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 20,\n" +
            "\t\t\"valor\": 35240.1826\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 21,\n" +
            "\t\t\"valor\": 43829.1667\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 22,\n" +
            "\t\t\"valor\": 18235.6852\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 23,\n" +
            "\t\t\"valor\": 4355.0662\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 24,\n" +
            "\t\t\"valor\": 13327.1025\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 25,\n" +
            "\t\t\"valor\": 0.0\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 26,\n" +
            "\t\t\"valor\": 0.0\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 27,\n" +
            "\t\t\"valor\": 25681.8318\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 28,\n" +
            "\t\t\"valor\": 1718.1221\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 29,\n" +
            "\t\t\"valor\": 13220.495\n" +
            "\t},\n" +
            "\t{\n" +
            "\t\t\"dia\": 30,\n" +
            "\t\t\"valor\": 8414.61\n" +
            "\t}\n" +
            "]";


    void working() {
        List<Budget> budgets;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        budgets = List.of(gson.fromJson(json, Budget[].class)); // Convert a Json string array to a list of Budget -- [] indicates that is a list.

        System.out.println("Size: " + budgets.size());
        for (Budget budget : budgets) {
            System.out.println(budget.toString());
        }
    }
}
