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
	 * O concrete factory geralmente é escolhido dependendo das opções de
	 * configuração ou ambiente.
	 */    
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

	/*
	 * Todo o código do cliente deve funcionar com fábricas e produtos através de
	 * interfaces abstratas. Dessa forma, não se importa com qual fábrica trabalha e
	 * com o tipo de produto que devolve.
	 */    
    static void runBusinessLogic() {
        dialog.renderWindow();
	}
    
}
