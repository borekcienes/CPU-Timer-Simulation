/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpuzamanlayicisimulasyonu;

/**
 *
 * @author borek
 */
public class Is implements Comparable<Is>{
    private final int id;
    private final int sure;
    private final int oncelik;

    public Is(int id, int sure, int oncelik) {
        this.id = id;
        this.sure = sure;
        this.oncelik = oncelik;
    }

    public int getId() {
        return id;
    }

    public int getSure() {
        return sure;
    }

    public int getOncelik() {
        return oncelik;
    }

    @Override
    public int compareTo(Is other) {
        return Integer.compare(this.oncelik, other.oncelik);
    }

    @Override
    public String toString() {
        return "Is{" +
                "id=" + id +
                ", sure=" + sure +
                ", oncelik=" + oncelik +
                '}';
    }
}
