class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, Integer> cities = new HashMap<>();
        for(List<String> path:paths){
            cities.put(path.get(0),1);
        }

        for(List<String> path:paths){
            String city = path.get(1);
            if(cities.get(city) == null){
                return city;
            }
        }
        return "";
        
    }
}
