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

        PeterParker peter = new PeterParker();

        MilesMorales miles = new MilesMorales();

        GwenStacy gwen = new GwenStacy();

        spideys.add(peter);
        spideys.add(miles);
        spideys.add(gwen);

        spideyThread.start();

    }
}
