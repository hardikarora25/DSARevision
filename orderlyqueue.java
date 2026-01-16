package DSARevision;

public class orderlyqueue {
    char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        if (k>1){
            return sorted;
        }
        String result = s;
        for(int i = 1; i<s.length(); i++) {
            String temp = s.substring(i) + s.substring(0, i);
            result = (result.compareTo(temp) < 0) ? result : temp;
        }
        return result;
    
}
