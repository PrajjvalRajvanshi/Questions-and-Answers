import java.io.*;

import java.util.Map;

import java.util.HashMap;

class NumberOfOccurancesOfWords {

	public static void main (String[] args) {		String input = "A lion was once sleeping in the jungle when a mouse started running up and down his body just for fun and this disturbed the lion�s sleep";

		String[] stringArray = input.split(" ");

		Map<String, Integer> numberOfOccurancesMap  = new HashMap<>();

        for(String local : stringArray)

        {

            if(numberOfOccurancesMap.containsKey(local)){

                int incrementNumber = numberOfOccurancesMap.get(local);

                numberOfOccurancesMap.put(local,incrementNumber+1);

            } else{

                numberOfOccurancesMap.put(local,1);

            }

        }

        

        for(String keys : numberOfOccurancesMap.keySet()){

        System.out.println("Key- "+ keys + " Values -"+numberOfOccurancesMap.get(keys));    

        }

		

	}

}
