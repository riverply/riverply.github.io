public class AUTOMAT3
{
    private int zustand;

    public static void main(String[] args) {
        AUTOMAT3 a = new AUTOMAT3();
        System.out.println(a.pruefen("2223111"));
    }
    public AUTOMAT3(){
    }
    public boolean pruefen(String zeichenkette){
        zustand = 0; //zustand
        int laenge = zeichenkette.length();
        for(int i = 0; i < laenge ;i++){
            wechseln(zeichenkette.charAt(i));
        }
        if(zustand == 3){
            return true;
        }else{
            return false;
        }
    }
    private void wechseln(char c){
        if((c=='0' | c=='1'| c=='2'| c=='3'| c=='4'| c=='5'| c=='6'| c=='7'| c=='8'| c=='9') && zustand != -1){
            if(zustand == 0){
                if(c == '0'){
                    zustand = 0;
                }else if(c == '2' | c=='5' | c=='8'){
                    zustand = 2;
                }else if(c == '3' | c=='6' | c=='9'){
                    zustand = 3;
                }else if(c == '1' | c=='4' | c=='7'){
                    zustand = 1;
                }
            }else if(zustand == 1){
                if(c == '0' | c == '3' | c=='6' | c=='9'){
                    zustand = 1;
                }else if(c == '2' | c=='5' | c=='8'){
                    zustand = 3;
                }else if(c == '1' | c=='4' | c=='7'){
                    zustand = 2;
                }
            }else if(zustand == 2){
                if(c == '0' | c == '3' | c=='6' | c=='9'){
                    zustand = 2;
                }else if(c == '2' | c=='5' | c=='8'){
                    zustand = 1;
                }else if(c == '1' | c=='4' | c=='7'){
                    zustand = 3;
                }
            }else if(zustand == 3){
                if(c == '0' | c == '3' | c=='6' | c=='9'){
                    zustand = 3;
                }else if(c == '2' | c=='5' | c=='8'){
                    zustand = 2;
                }else if(c == '1' | c=='4' | c=='7'){
                    zustand = 1;
                }
            }
        }else{
            zustand = -1;
        }
    }
}