public class Encryptor {
    public static void encryptMessage(String message, int rows) {
        int columns = message.length()/rows;
        if(columns < (double) message.length()/rows){
            columns++;
        }
        String[][] encryption = new String[rows][columns];
        for(int i = 0; i < message.length()-1; i++){
            String letter = message.substring(i,i+1);
            int r = i/columns;
            int c = i % columns;
            encryption[r][c] = letter;
        }
        for(int i = 0; i < message.length()-1; i++){
            if(encryption[r][c])
        }
        for(String[] test: encryption){
            for(String thing: test){
                System.out.print(thing + " ");
            }
            System.out.println();
        }
        //return "encryption"; // stub
    }

    public static String decryptMessage(String encryptedMessage, int rows) {
        return ""; // stub
    }
}
