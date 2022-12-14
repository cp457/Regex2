public class Main {
    public static void main(String[] args) {

        String s1 = "tup tuup tuuup tuuuup";


        System.out.println( s1.replaceAll("u{2,3}", "X"));
        String s2 = (s1.replaceAll("uuu", "XXX"));
        String s2_1 = (s2.replaceAll("uu", "XX"));
        System.out.println(s2_1);

        //Non sapevamo quale dei due metodi fosse più inerente alla consegna
        //Esercizio svolto insieme ad Andrea De Filippi


    }
}

/*
    You have a string with the following value: tup tuup tuuup tuuuup
    with a regular expression, change into X all repetitions of the letter u, considering at least 2 repetitions but no more than 3 repeated letters
    print the result
*/