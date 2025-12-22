package String;
public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String sentence = "rahim lives in dhaka";
        String split_array[]=sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<split_array.length;i++) {
            String firstCase = String.valueOf(split_array[i].charAt(0)).toUpperCase();
            String subcase = split_array[i].substring(1);
            String.valueOf(sb.append(firstCase+subcase+" "));
        }

            System.out.println(sb);
    }

    }

