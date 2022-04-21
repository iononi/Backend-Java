package semana3.practicaMultiverse;

import imonsh.Screen;

public class PeterParker extends SpiderMan implements SpiderPowers {

    public PeterParker() {

    }

    public PeterParker(int id, String name, String universe, String height, String weight, String hairColor, String abilities) {
        super(id, name, universe, height, weight, hairColor, abilities);
    }


    @Override
    public void webSwinging(Screen s) {
        s.showImage("src\\semana3\\practicaMultiverse\\spiderPowers\\webSwinging.gif");
    }

    @Override
    public void wallCrawling(Screen s) {
        s.showImage("src\\semana3\\practicaMultiverse\\spiderPowers\\wallCrawling.gif");
    }

    @Override
    public void spiderSense(Screen s) {
        s.showImage("src\\semana3\\practicaMultiverse\\spiderPowers\\spiderSense.gif");
    }

    @Override
    public void showAbilities(Screen s) {
        s.cls();
        s.repaint();
        s.out(String.format("%s I have %s and these is what I can do!", super.toString(), super.getAbilities()));
        this.webSwinging(s);
        this.wallCrawling(s);
        this.spiderSense(s);
        s.setVisible(true);
    }
}
