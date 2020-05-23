public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finalList  = new ArrayList<>();
        
        Map<String,List<String>> map = new HashMap<>();
        
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted =new String(c);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        finalList.addAll(map.values());
        return finalList;
    }
