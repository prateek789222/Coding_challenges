package StringQs;//longest common prefix

public class Leetcode_14 {

    static String lcf(String[] strs){
        if (strs.length==0)
            return "";

           String ss=strs[0];
            for (int i = 1; i < strs.length; i++) {
                while (!strs[i].startsWith(ss)) {
                    ss=ss.substring(0,ss.length()-1);
                }
            }
        return ss;
    }

    public static void main(String[] args) {
        String[] str= {"right","rise","mripe"};
        int z=str[0].length();
        System.out.println(lcf(str));

    }
}
