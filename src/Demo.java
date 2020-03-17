import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

	/*
	 * O concrete factory geralmente � escolhido dependendo das op��es de
	 * configura��o ou ambiente.
	 */    
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

	/*
	 * Todo o c�digo do cliente deve funcionar com f�bricas e produtos atrav�s de
	 * interfaces abstratas. Dessa forma, n�o se importa com qual f�brica trabalha e
	 * com o tipo de produto que devolve.
	 */    
    static void runBusinessLogic() {
        dialog.renderWindow();
	}
    
}
