public class MixMatch{
    public static void main(string[] args){
        String varString = "Nedved";
        char varChar = 'N';
        short varShort = 32000;
        int varInt = 1;
        long varLong = 2;
        float varFloat = 3f;
        double varDouble = 4.44;
        boolean varBoolean = true;

        System.out.println(varString + " <- String, stores a sequence of characters");
        System.out.println(varChar + " <- Char, stores a single character (2 bytes)");
        System.out.println(varShort + " <- Short, stores whole numbers from -32,768 to 32,767 (2 bytes)");
        System.out.println(varInt + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647 (4 bytes)");
        System.out.println(varLong + " <- Long, stores larger whole numbers (8 bytes)");
        System.out.println(varFloat + " <- Float, stores decimal numbers with up to 7 digits of precision (4 bytes)");
        System.out.println(varDouble + " <- Double, stores decimal numbers with up to 15-16 digits of precision (8 bytes)");
        System.out.println(varBoolean + " <- Boolean, stores true or false values (1 bit)");
    }

}