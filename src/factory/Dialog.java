package factory;

import buttons.Button;

/*Classe base de f�brica. Observe que "factory" � meramente um papel para a classe. 
 * Ele deve ter uma l�gica de neg�cios principal, que precisa de produtos diferentes 
 * para serem criados.*/
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

	/*
	 * As subclasses substituir�o esse m�todo para criar objetos de bot�o
	 * espec�ficos.
	 */
    public abstract Button createButton();
    
}