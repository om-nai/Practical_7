package Assignment6;
public class Practical2 {

    static int countOccurrences(String str, String word) {
        // split the string by spaces in a
        String a[] = str.split(" ");

        
        int count = 0;
        for (int i = 0; i < a.length; i++) {
        
            if (word.equals(a[i]))
                count++;
        }

        return count;
    }
    public static void main(String args[]) {
        String str = "GeeksforGeeks A computer science portal for geeks ";
        String word = "portal";
        System.out.println(countOccurrences(str, word));
    }
}



      

 



