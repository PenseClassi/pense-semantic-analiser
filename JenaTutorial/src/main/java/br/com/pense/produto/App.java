package br.com.pense.produto;

import br.com.pense.produto.controller.SemanticEngineImoveis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component
public class App 
{
    @Autowired
    private SemanticEngineImoveis engImoveis;
    
    public static void main( String[] args )
    {
        try{

            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-semantic.xml");
            
            App app = new App();//context.getBean(App.class);
            app.teste(context);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
    public void teste(ClassPathXmlApplicationContext context){
        engImoveis = (SemanticEngineImoveis)context.getBean("engineSemantica");
        engImoveis.geraParametros("poa");
        engImoveis.getResultsAsString();
    }
}
