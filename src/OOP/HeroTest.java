package OOP;
import java.util.Random;
//자바 객체지향 공부 - 리얼 격투 게임
class Hero {
    String name;
    int hp;

    public Hero(String name) {
        this.name = name;
        this.hp = 100;
    }

    public void punch(Hero enemy) {
        this.hp = this.hp - 10;
        System.out.println("[" + enemy.name + "]의 펀치");
        System.out.println("\t" + this.name + ": " + this.hp + "/100");
    }

    public static void battle(Hero a, Hero b) {
       while(a.hp > 0 && b.hp > 0){
           Random r = new Random();
           int ran = r.nextInt(2);
           if(ran == 0)
               a.punch(b);
           else b.punch(a);
       }
    }
}

public class HeroTest {
    public static void main(String[] args) {
        Hero arthas = new Hero("아서스");
        Hero leona = new Hero("레오나");

        //격투시작
        Hero.battle(arthas, leona);
    }

}
