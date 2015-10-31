
public class Main {

    public static void main(String[] args){

        StringBuilder stringBuilder = new StringBuilder("123321");
        stringBuilder.reverse().toString();

        System.out.println(stringBuilder.toString().equals(stringBuilder.reverse().toString()));
    }

}
