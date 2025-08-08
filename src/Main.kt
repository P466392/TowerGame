//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package TowerGame

fun main() {
    val e1 = Enemy() // Default enemy with 100 HP
    val e2 = Enemy(500) // Enemy with 500 HP
    println("### Enemy HPs before tower and hero attack ###")
    println("Enemy1: ${e1.hp}")
    println("Enemy2: ${e2.hp}")
    println("Hero: ${hero.hp}")
    val tower = Tower()
    tower.attack(e1, 10) // Tower attacks the first enemy with 10 damage
    println("### Enemy HPs after tower and hero attack ###")
    println("Enemy1: ${e1.hp}")
    println("Enemy2: ${e2.hp}")
    println("Hero: ${hero.hp}")
}