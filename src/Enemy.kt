package TowerGame

internal class Enemy {
    var hp: Int
        private set

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