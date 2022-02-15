public class numerovogal {
    public static void main(String args[]){


        int a;

        for (a=0;a<5;a++){
            int random = 1 + (int) (Math.random()*5);


            if (random == 1){
                System.out.print("a ");
                System.out.println(random);
            }
            if (random == 2){
                System.out.print("e ");
                System.out.println(random);
            }
            if (random == 3){
                System.out.print("i ");
                System.out.println(random);
            }
            if (random == 4){
                System.out.print("o ");
                System.out.println(random);
            }
            if (random == 5){
                System.out.print("u ");
                System.out.println(random);
            }
        }
    }
}
