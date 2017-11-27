public class ex {
    public static void main(String[] args){
        try {
            String str = "3．14";
            double value=Double.parseDouble(str);
        } catch (NumberFormatException e){
            System.out.println("例外が発生しました");
            System.out.println(e.getMessage());
        }
    }
}
