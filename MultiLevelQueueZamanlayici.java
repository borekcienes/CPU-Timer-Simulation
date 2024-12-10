/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpuzamanlayicisimulasyonu;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/**
 *
 * @author borek
 */
public class MultiLevelQueueZamanlayici implements Zamanlayici{
    private final List<Queue<Is>> kuyruklar;

    public MultiLevelQueueZamanlayici(int seviyeSayisi) {
        kuyruklar = new ArrayList<>();
        for (int i = 0; i < seviyeSayisi; i++) {
            kuyruklar.add(new LinkedList<>());
        }
    }

    public void isEkle(Is islem) {
        kuyruklar.get(islem.getOncelik()).add(islem);
    }

    @Override
    public void zamanla(List<Is> islemler) {
        for (Queue<Is> kuyruk : kuyruklar) {
            while (!kuyruk.isEmpty()) {
                Is islem = kuyruk.poll();
                System.out.println("Islem ID: " + islem.getId() + " (" + islem.getOncelik() + " oncelik) calisiyor.");
            }
        }
    }
}
