public class AUTOMAT
{
    private int zustand;

    public static void main(String[] args) {
        AUTOMAT a = new AUTOMAT();
        System.out.println(a.pruefen("3"));
    }
    public AUTOMAT(){
    }
    public boolean pruefen(String zeichenkette){
        zustand = 0; //zustand
        int laenge = zeichenkette.length();
        for(int i = 0; i < laenge ;i++){
            wechseln(zeichenkette.charAt(i));
        }
        if(zustand == 1){
            return true;
        }else{
            return false;
        }
    }
    private void wechseln(char c){
        if((c == '0' | c == '1') && zustand != -1){
            if(zustand == 0){
                if(c == '0'){
                    zustand = 1;
                }else if(c == '1'){
                    zustand = 2;
                }
            }else if(zustand == 1){
                if(c == '0'){
                    zustand = 1;
                }else if(c == '1'){
                    zustand = 2;
                }
            }else if(zustand == 2){
                if(c == '0'){
                    zustand = 2;
                }else if(c == '1'){
                    zustand = 1;
                }
            }
        }else{
            zustand = -1;
        }
    }
}