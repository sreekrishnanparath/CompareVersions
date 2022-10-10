/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compareversions;

/**
 *
 * @author sreek
 */
public class CompareVersions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
   public int compareUtil(String version1, String version2) {
        if (version1.equals(version2))
            return 0;
        
        String one[] = version1.split("\\.");
        String two[] = version2.split("\\.");
        int i =0;
        int j=0;

        while (i < one.length && j < two.length) {
            if (Integer.parseInt(one[i]) < Integer.parseInt(two[j]))
                return -1;
            else if (Integer.parseInt(one[i]) > Integer.parseInt(two[j]))
                return 1;
            i++;
            j++;
        }
        while (i<one.length) {
            if (Integer.parseInt(one[i])>0)
                return 1;
            i++;
        }
        while (j<two.length) {
            if (Integer.parseInt(two[j])>0)
                return -1;
            j++;
        }
        return 0;

    }
    
}
