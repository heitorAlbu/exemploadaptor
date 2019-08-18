
package exemploadaptor;


public class Adaptador5035 extends Cano50{
    
    private Cano35 Bitola35;
    
    public Adaptador5035(Cano35 Bitola35){
        this.Bitola35 = Bitola35;
    }
    @Override
    public void ConectarCano50(){
            Bitola35.ConectarCano35();
            System.out.println("Adaptador inserido");
        } 
}
