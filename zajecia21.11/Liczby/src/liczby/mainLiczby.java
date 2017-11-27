package liczby;

public class mainLiczby {

    public static void main(String[] args) {
        
        Liczby lb[]=new Liczby[3];
        lb[0] = new Liczby(1,2);
        lb[1] = new Liczby(2,1);
        lb[2] = new Liczby(2,2);
         
        
        for (int i = 0; i < 3; i++) {
            
            if(lb[i].czyPierwszaWiekszaLubRowna())
            System.out.println("Z liczb X: "+lb[i].getX()+" oraz Y: "+ lb[i].getY()+" pierwsza JEST wieksza lub rowna drugiej.");
          else
            System.out.println("Z liczb X: "+lb[i].getX()+" oraz Y: "+ lb[i].getY()+" pierwsza NIE JEST wieksza lub rowna drugiej.");
   
        }
        

    }
}
