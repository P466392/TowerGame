package TowerGame

public open class Enemy {
    public var hp: Int


    constructor() {
        hp = 100
    }

    constructor(hp: Int) {
        this.hp = hp
    }

    fun getDamage(damage: Int) {
        hp -= damage
    }

    /*
    Add a method for attacking the hero here
     */
}