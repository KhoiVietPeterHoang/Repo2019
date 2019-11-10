package edu.kea.kh.cream.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.kea.kh.cream.model.Cream;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class CreamController {
    ArrayList<Cream> cream = new ArrayList<>();

    @RequestMapping(value = "/cream", method = RequestMethod.GET)
    public String getCream() {
        String response = "";
        String newLine = "\r\n";
        for (Cream c : cream) {
            response += c.name + newLine;
        }
        return response;
    }

    @RequestMapping(value = "/cream", method = RequestMethod.POST)
    public String postCream(@RequestBody String body) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Cream newCream = objectMapper.readValue(body, Cream.class );
            cream.add(newCream);

            return "Successfully added new cream";
        } catch (IOException e) {
            e.printStackTrace();
            return "Could not parse body, specify the correct value. Status: 200";
        }

    }

    @RequestMapping(value = "/cream/{id}", method = RequestMethod.DELETE)
    public String deleteCream(@PathVariable int id) {
        if (id >= 0 && id < cream.size()) {
            cream.remove(id);
            return "Cream deleted";
        } else {
            return "Cream was not deleted, out of bounds.";
        }

    @RequestMapping(value = "/cream/{id}", method = RequestMethod.PUT)
    public String updateCream(@PathVariable int id, @RequestBody String body){
        if (id >= 0 && id < cream.size());
            try {
            ObjectMapper objectMapper = new ObjectMapper();
            Cream newCream = objectMapper.readValue(body, Cream.class);
            cream.set(id, newCream);
            return "Cream info successfully changed!";
            } catch (IOException e) {
                e.printStackTrace();

            return "Could not parse the body, are the value correctly specified?";
            }

        }else{
            return "Cream was not updated OOB";
        }

    }
}

    /*

    //?creamtype=
    @RequestMapping(value = "/cream", method = RequestMethod.GET)
    public String Scoop(@RequestParam(value = "creamType", required = false) String creamType) {
        if (creamType ==null) {
        return "Specify the cream";
        } else {
         return "You have chosen the: " + creamType;

       }
    }
    // How to send data with get, Pathvariable / Requestvariable
    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String bib() {
        return "Cream dictionary ~ Global edition";
    }


    /*
    // CreamID -> Pathvariable
    @RequestMapping(value = "/cream/{creamId}" , method = RequestMethod.GET)
    public String mingleWithPerson(@PathVariable Integer creamId ) {
        System.out.println(creamId);
        ArrayList<String> creams = new ArrayList<>();
        switch (creamId) {

            case 0: return "Apple cream - [INFO] - : 60% Apple, 30% cream and 10% sugar";
            case 1: return "Banana cream - [INFO] - : 60% Banana, 30% cream and 10% sugar";
            case 2: return "Clementine cream - [INFO] - : 60% Clementine, 30% cream and 10% sugar";
            case 3: return "Dark Chocolate cream - [INFO] - : 60% Dark Chocolate , 30% cream and 10% sugar";
            case 4: return "Light Chocolate cream - [INFO] - : 60% Light Chocolate , 30% cream and 10% sugar";
            case 5: return "Brownie cream - [INFO] - : 60% Brownie , 30% cream and 10% sugar";
            case 6: return "Vanilla cream - [INFO] - : 40% Vanilla extract, 20% Vanilla syrup , 30% cream and 10% sugar";
            case 7: return "Dream cream - [INFO] - : 60% hopes and dreams , 30% cream and 10% sugar";
            case 8: return "Strawberry cream - [INFO] - : 60% Strawberry , 30% cream and 10% sugar";
            case 9: return "Melon cream - [INFO] - : 60% Melon , 30% cream and 10% sugar";
            case 10: return "cream - [INFO] - : 60% Dark Chocolate , 30% cream and 10% sugar";

            default:
                return "Cream not found";




            //    return "K";


        }
        */

  /*

    }

}

*/