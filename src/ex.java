public class ex {
    public static void main(String[] args){
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e){
            System.out.println("例外が発生しました");
            System.out.println(e.getMessage());
        }
    }
}
