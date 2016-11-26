package jp.ac.uryukyu.ie.e165701;

/**
 * Created by e165701 on 2016/11/22.
 */
public class Hero extends LivingThing{


    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        super();
        this.setName(name);
        setHitPoint(maximumHP);
        this.setAttack(attack);
        setDead(false);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
}
