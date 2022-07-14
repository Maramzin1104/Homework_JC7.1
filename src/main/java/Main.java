import java.util.HashMap;
import java.util.Map;

import ru.netology.i18n.geo.GeoService;
import ru.netology.i18n.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;
import ru.netology.sender.MessageSender;
import ru.netology.sender.MessageSenderImpl;

public class Main {

    //Тестовый пример
    public static void main(String[] args) {
        GeoService test = new GeoServiceImpl();
        LocalizationService localizationService = new LocalizationServiceImpl();
        MessageSender messageSender = new MessageSenderImpl(test, localizationService);

        Map<String, String> headers = new HashMap<String, String>();
        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, "172.0.32.11");
        messageSender.send(headers);


    }
}