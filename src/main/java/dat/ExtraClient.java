package dat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExtraClient
{
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        System.out.println("Starting extra ChatClient");
        Client client = new Client("10.83.137.4", 9090, executorService); // ved at skrive en anden persons IP-nr her eller egen (her Steen),
        // som har delt den med andre, kan vi skrive til hinanden indeni ExtraClient ligesom en chat. Altså via Steens IP-nr (10.83.130.2).
        // for egen IP-nr, skriv i Terminal: ipconfig og så står IP-nr under IPv4, send denne IP-nr til andre, så de kan sætte ind i deres ExtraClient,
        // hvis jeg hoster denne connection behøver jeg ikke selv at ændre på noget. Og jeg kører bare main for at starte alt op.
        // 10.83.137.4 = Nicklas
        executorService.submit(client);
    }
}
