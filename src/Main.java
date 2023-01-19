public class Main {
    public static void main(String[] args) {
        int conte = 0;
        Phone phone = new Phone("12 pro" , "China" , 45500);
        System.out.println(phone.getModel());
        conte ++;
        System.out.println(phone.getMadeln());
        conte++;
        System.out.println(phone.getPrice());
        conte ++;
        System.out.println(conte);
    }
}