package semana3.practicaMultiverse;

import imonsh.Screen;

public class GwenStacy extends SpiderMan {

    public GwenStacy() {
        super(3, "Gwendolyne Maxine Stacy", "Earth-65", "5' 5\"", "125 lbs",
                "Blonde", "Spider Powers");
    }

    public GwenStacy(int id, String name, String universe, String height, String weight, String hairColor, String abilities) {
        super(id, name, universe, height, weight, hairColor, abilities);
    }

    @Override
    public void webSwinging(Screen s) {
        s.showImage("src\\semana3\\practicaMultiverse\\spiderPowers\\spiderGwenSwing.gif");
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
        webSwinging(s);
        wallCrawling(s);
        spiderSense(s);
        s.setVisible(true);
    }
}
