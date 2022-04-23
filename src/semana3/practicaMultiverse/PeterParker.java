package semana3.practicaMultiverse;

import imonsh.Screen;

public class PeterParker extends SpiderMan {

    public PeterParker() {
        super(1, "Peter B Parker", "Earth-616", "5' 10\"", "167 lbs",
                "Brown", "Spider Powers");
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
