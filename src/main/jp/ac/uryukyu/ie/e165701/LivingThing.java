package jp.ac.uryukyu.ie.e165701;

/**
 * Created by e165701 on 2016/11/23.
 */
public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;


    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    /**
     *　@param opponent 攻撃対象
     */
    public void attack(LivingThing opponent) {
        if (dead == false) {
            int damage = (int) (Math.random() * attack);

            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    /**
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}




