public class AUTOMAT2
{
    private int zustand;

    public static void main(String[] args) {
        AUTOMAT2 a = new AUTOMAT2();
        System.out.println(a.pruefen("124324523"));
    }
    public AUTOMAT2(){
    }
    public boolean pruefen(String zeichenkette){
        zustand = 0; //zustand
        int laenge = zeichenkette.length();
        for(int i = 0; i < laenge ;i++){
            wechseln(zeichenkette.charAt(i));
        }
        if(zustand == 2 | zustand == 3){
            return true;
        }else{
            return false;
        }
    }
    private void wechseln(char c){
        if((c == '+' | c == '-' | c=='0' | c=='1'| c=='2'| c=='3'| c=='4'| c=='5'| c=='6'| c=='7'| c=='8'| c=='9') && zustand != -1){
            if(zustand == 0){
                if(c == '0'){
                    zustand = 3;
                }else if(c=='1'| c=='2'| c=='3'| c=='4'| c=='5'| c=='6'| c=='7'| c=='8'| c=='9'){
                    zustand = 2;
                }else if(c=='-' | c=='+'){
                    zustand = 1;
                }
            }else if(zustand == 1){
                if(c=='1'| c=='2'| c=='3'| c=='4'| c=='5'| c=='6'| c=='7'| c=='8'| c=='9'){
                    zustand = 2;
                }else if(c == '0' | c == '-' | c== '+'){
                    zustand = -1;
                }
            }else if(zustand == 2) {
                if (c == '0' |c == '1' | c == '2' | c == '3' | c == '4' | c == '5' | c == '6' | c == '7' | c == '8' | c == '9') {
                    zustand = 2;
                } else if (c == '-' | c == '+') {
                    zustand = -1;
                }
            }else if(zustand == 3){
                zustand = -1;
            }
        }else{
            zustand = -1;
        }
    }
}