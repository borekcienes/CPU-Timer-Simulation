/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cpuzamanlayicisimulasyonu;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author borek
 */
public class CPUZamanlayiciSimulasyonu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Is> islemler = Arrays.asList(
                new Is(1, 10, 2),
                new Is(2, 5, 1),
                new Is(3, 8, 3)
        );

        System.out.println("Round Robin Zamanlayici:");
        Zamanlayici roundRobin = new RoundRobinZamanlayici(4);
        roundRobin.zamanla(islemler);

        System.out.println("\nOncelikli Zamanlayici:");
        Zamanlayici oncelikZamanlayici = new OncelikZamanlayici();
        oncelikZamanlayici.zamanla(islemler);

        System.out.println("\nMulti-Level Queue Zamanlayici:");
        MultiLevelQueueZamanlayici multiLevelQueue = new MultiLevelQueueZamanlayici(3);
        for (Is islem : islemler) {
            multiLevelQueue.isEkle(islem);
        }
        multiLevelQueue.zamanla(islemler);
    }
    
}
