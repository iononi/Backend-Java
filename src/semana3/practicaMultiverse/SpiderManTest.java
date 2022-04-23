package semana3.practicaMultiverse;

import imonsh.Screen;

import java.util.ArrayList;

public class SpiderManTest {

    public static void main(String[] args) {

        Screen screen = new Screen("Spiderverse");

        ArrayList<SpiderPowers> spideys = new ArrayList<>();

        Thread spideyThread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {

                        while ( true ) {
                            for (SpiderPowers spidey : spideys) {
                                spidey.showAbilities(screen);
                                try {
                                    Thread.sleep(5000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }

                    }
                }
        );

        PeterParker peter = new PeterParker(1, "Peter B Parker", "Earth-616", "5' 10\"", "167 lbs",
                "Brown", "Spider Powers");

        MilesMorales miles = new MilesMorales(2, "Miles Morales", "Earth-1610", "5' 8\"", "160 lbs",
                "Black", "Spider Powers");

        GwenStacy gwen = new GwenStacy(3, "Gwendolyne Maxine Stacy", "Earth-65", "5' 5\"", "125 lbs",
                "Blonde", "Spider Powers");

        spideys.add(peter);
        spideys.add(miles);
        spideys.add(gwen);

        spideyThread.start();

    }
}
