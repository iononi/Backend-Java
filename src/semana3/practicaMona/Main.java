package semana3.practicaMona;

public class Main {
    public static void main(String[] args) {
        Mona[] myMona = new Mona[6];
        Mona monaWrestler = new Wrestler("Wrestler", true, "Blue");
        Mona monaMiner = new Miner();
        Mona monaDiver = new Scubatocat();
        Mona monaInvesto = new InvestoCat();
        Mona monaPhoto = new Filmtocat();
        Mona monaSpider = new Spidertocat();

        myMona[0] = monaWrestler;
        myMona[1] = monaMiner;
        myMona[2] = monaDiver;
        myMona[3] = monaInvesto;
        myMona[4] = monaPhoto;
        myMona[5] = monaSpider;

        for (Mona mona: myMona)
            System.out.println(mona);
    }
}
