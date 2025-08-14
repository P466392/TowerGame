package TowerGame

public open class Hero {
    public var hp: Int

    constructor() {
        hp = 100
    }

    constructor(hp: Int){
        this.hp = hp
    }

    fun getDamage(damage: Int){
        hp -= damage
    }

    fun attack(e: Enemy, attackStrength: Int){
        e.getDamage(attackStrength)
    }

    companion object {
        val hp: String = ""
    }
}