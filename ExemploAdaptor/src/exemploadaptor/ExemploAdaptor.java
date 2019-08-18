
package exemploadaptor;


public class ExemploAdaptor {
/*Faça a implementação do Design Pattern Adaptor, semelhante ao do exemplo da 
    aula, uma para o subtipo Class e outra para o Subtipo Object, mudando ou o 
    nome do método ou a quantidade/tipo dos Parâmetros.

Se tiver dúvidas, faça buscas na internet, ou em fóruns especializados como o 
    StackOverflow, para ajudar a entender a diferença entre estes dois subtipos

Submeta a resposta através de um Link de um Repositório Público do GitHub, 
    de preferência com alguns Casos de Teste utilizando Unit.
    
    
    Cano de 50 -> Adaptador 50 para 35 - > Cano 35*/
    
    
    public static void main(String[] args) {
        
        Cano35 cano35 = new Cano35();
        SistemaEncanacao sistema = new SistemaEncanacao();
        
        Adaptador5035 adaptador = new Adaptador5035(cano35);
        
        sistema.ConectarSistema(adaptador);
    }  
   
    }
  

