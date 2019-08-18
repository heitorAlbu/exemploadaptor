
package exemploadaptor;


public class SistemaEncanacao {
    
    private Cano50 bitola50;
    
    public void ConectarSistema(Cano50 cano50){
        this.bitola50 = cano50;
        bitola50.ConectarCano50();
    }
    
}
