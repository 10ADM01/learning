import java.util.*;
public class pascalstriangle {
    public static void main(String[] args) {
        int n=5;
        System.out.println(generate(n));
    }

        public static List<Integer>pascalstriangle (int rows) {
            int ans=1;
            List<Integer>ansrow = new ArrayList<>();
            ansrow.add(1);
            for(int c=1;c<rows;c++){
                ans= ans*(rows-c);
                ans=ans/(c);
                ansrow.add(ans);
            }
            return ansrow;
        }
        public static List<List<Integer>>  generate(int numRows ){
            List<List<Integer>> ans= new ArrayList<>();
            for(int i=1;i<=numRows;i++){
                ans.add(pascalstriangle(i));
            }
            return ans;
        }


}
