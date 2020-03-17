package factory;

import buttons.Button;
import buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    public Button createButton() {
        return new WindowsButton();
    }
}
