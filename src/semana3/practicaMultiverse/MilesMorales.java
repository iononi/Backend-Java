package semana3.practicaMultiverse;

import imonsh.Screen;

public class MilesMorales extends SpiderMan implements SpiderPowers {

    public MilesMorales() {
        this(2, "Miles Morales", "Earth-1610", "5' 8\"", "160 lbs",
                "Black", "Spider Powers");
    }

    public MilesMorales(int id, String name, String universe, String height, String weight, String hairColor, String abilities) {
        super(id, name, universe, height, weight, hairColor, abilities);
    }

    public void venomBlast(Screen s) {
        s.showImage("src\\semana3\\practicaMultiverse\\spiderPowers\\venomBlast.gif");
    }

    public void milesCamo(Screen s) {
        s.showImage("src\\semana3\\practicaMultiverse\\spiderPowers\\milesCamo.gif");
    }

    @Override
    public void webSwinging(Screen s) {
        s.showImage("src\\semana3\\practicaMultiverse\\spiderPowers\\milesSwing.gif");
    }

    @Override
    public void wallCrawling(Screen s) {
        s.showImage("src\\semana3\\practicaMultiverse\\spiderPowers\\wallCrawling.gif");
    }

    @Override
    public void spiderSense(Screen s) {
        s.showImage("src\\semana3\\practicaMultiverse\\spiderPowers\\milesSense.gif");
    }

    @Override
    public void showAbilities(Screen s) {
        s.cls();
        s.repaint();
        s.out(String.format("%s I have %s and these is what I can do!", super.toString(), super.getAbilities()));
        webSwinging(s);
        wallCrawling(s);
        spiderSense(s);
        venomBlast(s);
        milesCamo(s);
        s.setVisible(true);
    }
}
