public class Main {
    public static void main(String[] args) {

       Currency todaysCurrency = new Currency("EUR","MDL",17.50f,"2020-01-01");
       Currency tomorrowsCurrency = todaysCurrency.setDate("2020-01-02");

       System.out.println(todaysCurrency);
       System.out.println(tomorrowsCurrency);

       String message = "This is the original object";
       System.out.println(message.replace("original","modified"));
    }
}
