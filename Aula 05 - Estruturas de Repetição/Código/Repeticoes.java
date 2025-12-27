public class Repeticoes {
    public static void main(String[] args) {
        System.out.println("Estamos trabalhando com while ");
        int c = 7;
        while (c <= 6) {
            System.out.println(c);
            c++;
        }

        System.out.println("Estamos trabalhando com do .. while ");
        c = 7;
        do {
            System.out.println(c);
            c++;
        } while(c<=6);

        System.out.println("Estamos trabalhando com for ");
        for (c = 1; c <= 6; c++) {
            System.out.println(c);
        }

        System.out.println("Estamos trabalhando com for usando o \"continue\"");
        for (c = 1; c <= 6; c++) {
            if (c == 3) {
                continue;
            }
            System.out.println(c);
        }

        System.out.println("Estamos trabalhando com for usando o \"braek\"");
        for (c = 1; c <= 6; c++) {
            if (c == 3) {
                break;
            }
            System.out.println(c);
        }
    }
}