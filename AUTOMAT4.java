public class AUTOMAT4
{
    private int zustand;

    public static void main(String[] args) {
        AUTOMAT4 a = new AUTOMAT4();
        System.out.println(a.pruefen("PNPNPN"));
    }
    public AUTOMAT4(){
    }
    public boolean pruefen(String zeichenkette){
        zustand = 0; //zustand
        int laenge = zeichenkette.length();
        for(int i = 0; i < laenge ;i++){
            wechseln(zeichenkette.charAt(i));
        }
        if(zustand == 2 | zustand == 4){
            return true;
        }else{
            return false;
        }
    }
    private void wechseln(char c){
        if((c == 'P' | c == 'N') && zustand != -1){
            if(zustand == 0){
                if(c == 'P'){
                    zustand = 1;
                }else if(c == 'N'){
                    zustand = 3;
                }
            }else if(zustand == 1){
                if(c == 'N'){
                    zustand = 2;
                }else if(c == 'P'){
                    zustand = -1;
                }
            }else if(zustand == 2){
                if(c == 'P'){
                    zustand = 1;
                }else if(c == 'N'){
                    zustand = -1;
                }
            }else if(zustand == 3){
                if(c == 'P'){
                    zustand = 4;
                }else if(c == 'N'){
                    zustand = -1;
                }
            }else if(zustand == 4){
                if(c == 'P'){
                    zustand = -1;
                }else if(c == 'N'){
                    zustand = 3;
                }
            }
        }else{
            zustand = -1;
        }
    }
}