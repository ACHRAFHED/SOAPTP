import jakarta.xml.ws.Endpoint;
import org.sid.BanqueService;

public class ServerWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("Web Service est Deploye sur http://0.0.0.0:9191");
    }
}
