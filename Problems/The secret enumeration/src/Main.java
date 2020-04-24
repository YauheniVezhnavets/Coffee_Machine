public class Main {

    public static void main(String[] args) {
        Secret[] secrets = Secret.values();
        int count = 0;
        for (Secret secret : secrets) {
            if (secret.toString().startsWith("STAR")){
                count++;
            }
        }
        System.out.println(count);
    }
}


enum Secret {
    STAR, CRASH, START, QUEUE, STARBUCKS;
}
/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/