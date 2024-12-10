/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpuzamanlayicisimulasyonu;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 *
 * @author borek
 */
public class RoundRobinZamanlayici implements Zamanlayici{
    private final int quantum;

    public RoundRobinZamanlayici(int quantum) {
        this.quantum = quantum;
    }

    @Override
    public void zamanla(List<Is> islemler) {
        Queue<Is> kuyruk = new LinkedList<>(islemler);
        while (!kuyruk.isEmpty()) {
            Is islem = kuyruk.poll();
            int calismaSuresi = Math.min(islem.getSure(), quantum);
            System.out.println("Islem ID: " + islem.getId() + " icin " + calismaSuresi + " birim calisti.");

            if (islem.getSure() > quantum) {
                kuyruk.add(new Is(islem.getId(), islem.getSure() - quantum, islem.getOncelik()));
            }
        }
    }
}
