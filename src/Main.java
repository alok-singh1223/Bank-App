public class Main {
    public static void main(String[] args) {
        HDFCAccount Alokacc=new HDFCAccount("Alok Singh","alok@123",32500.75);
        System.out.println(Alokacc.toString());

        System.out.println(Alokacc.fetchBalance("alok123"));
        System.out.println(Alokacc.fetchBalance("alok@123"));

        System.out.println(Alokacc.tranjactionMoney(12500));
        System.out.println(Alokacc.withDrawMoney(15000,"alok@123"));

        System.out.println((Alokacc.changePassword("alok@123","alok@singh#123")));
        System.out.println(Alokacc.withDrawMoney(12000,"alok@singh#123"));
        System.out.println(Alokacc.calculateInterest(5));
    }
}
