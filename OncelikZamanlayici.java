/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpuzamanlayicisimulasyonu;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author borek
 */
public class OncelikZamanlayici implements Zamanlayici{
    @Override
    public void zamanla(List<Is> islemler) {
        Collections.sort(islemler);
        for (Is islem : islemler) {
            System.out.println("Islem ID: " + islem.getId() + " (" + islem.getOncelik() + " oncelik) calisiyor.");
        }
    }
}
