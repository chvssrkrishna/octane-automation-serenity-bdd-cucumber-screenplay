package screenplay.customer.home;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Home_Page {

    //Icon Buttons in Customer Home Page
    public static Target ICON_BUTTON = Target.the("{0} Icon Button").locatedBy("css:div.desktop a[data-name='{0} Icon Button']");
    public static Target CHAT_ICON_BUTTON = Target.the("Chat Icon Button").locatedBy("css:div.desktop a[data-name='Chat Icon Button']");
    public static Target TEXT_ICON_BUTTON = Target.the("Text Icon Button").locatedBy("css:div.desktop a[data-name='Text Icon Button']");
    public static Target CALL_ICON_BUTTON = Target.the("Call Icon Button").locatedBy("css:div.desktop a[data-name='Text Icon Button']");
    public static Target OFFERS_ICON_BUTTON = Target.the("Offers Icon Button").locatedBy("css:div.desktop a[aria-label='Offers']");
    public static Target VIEW_INVENTORY_BUTTON = Target.the("View Inventory Button").locatedBy("css:a.inventory-link");

    //Auto Poke Window
    public static Target AUTO_POKE_FORM = Target.the("Auto Poke Form").locatedBy("css:form#cnpoke");
    public static Target AUTO_POKE_IMG = Target.the("Agent profile photo").locatedBy("form#cnpoke img[alt='Agent profile photo']");
    public static Target AUTO_POKE_FORM_MESSAGE = Target.the("Auto Poke Dealer Message").locatedBy("form#cnpoke div.cnpk5__top__msg");
    public static Target AUTO_POKE_ENTER_YOUR_MESSAGE = Target.the("Auto Poke Enter Your Message").locatedBy("form#cnpoke input[placeholder='Enter your message']");
    public static Target AUTO_POKE_SEND_BUTTON   = Target.the("Auto Poke Send Button").locatedBy("form#cnpoke a.cn-send");
    public static Target AUTO_POKE_CLOSE_BUTTON   = Target.the("Auto Poke Close Button").locatedBy("form#cnpoke a.cnpk5__x");

    //CHAT PANEL IFRAME
    public static Target CHATPANEL_IFRAME   = Target.the("Chat Panel Iframe").located(By.cssSelector("div#cn_chat_container iframe[aria-label='Chat window']"));

    public static String CHATPANEL_IFRAME_NAME = "Chat";
    public static Target CLOSE_CHAT_PANEL_BUTTON = Target.the("View Inventory Link").locatedBy("div.desktop a[aria-label='Close']:not([class*='disabled'])");



}
