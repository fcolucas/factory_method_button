package factory;

import buttons.Button;

/*Classe base de fábrica. Observe que "factory" é meramente um papel para a classe. 
 * Ele deve ter uma lógica de negócios principal, que precisa de produtos diferentes 
 * para serem criados.*/
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

	/*
	 * As subclasses substituirão esse método para criar objetos de botão
	 * específicos.
	 */
    public abstract Button createButton();
    
}