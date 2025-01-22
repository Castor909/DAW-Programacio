import java.util.HashMap;
public class Routes {
    public String findRoutes(String[][] routes) {

        // create trail to return
        StringBuilder trail = new StringBuilder();

        // map departures to destinations
        HashMap<String,String> routesMap = new HashMap<>();
        for (String[] route : routes)  routesMap.put(route[0], route[1]);

        // find starting point and add the first route to the trail
        for (String departure : routesMap.keySet()) {
            boolean found = false;
            for (String arrival : routesMap.values()) {
                if (arrival.equals(departure)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                trail.append(departure).append(", ").append(routesMap.get(departure));
                break;
            }
        }

        // go through the flights and add destinations until we don't
        boolean done = false;
        outerLoop:
        while(!done)  {
            for(String departure : routesMap.keySet())  {
                String[] cities = trail.toString().split(", ");
                String ultimateCity = cities[cities.length-1];
                if(ultimateCity.equals(departure)) {
                    trail.append(", ").append(routesMap.get(departure));
                    continue outerLoop;
                }
            }
            done=true;
        }
        return trail.toString();
    }
}
