import data.*


public fun main() {

    val dog1 = Dog(id = 0, name = "Swift", furColor = FurColor.BLACK)
    val dog2 = Dog(id = 1, name = "Stu", furColor = FurColor.PATCHED)
    val cat1 = Cat(id = 3, name = "Tuno", eyesColor = EyesColor.GREEN)


    class Cage<T : Animal>(var animal: T, val size: Double)

    val dog = Dog(id = 1, name = "Stu", furColor = FurColor.PATCHED)
    val cat = Cat(id = 4, name = "Peter", eyesColor = EyesColor.GREEN)
    val cageDog: Cage<Dog> = Cage(animal = dog, size = 6.0)
    val cageCat: Cage<Cat> = Cage(animal = cat, size = 3.0)

    println(cat1.name)




    var dogList: List<Dog> = listOf()
    //var animalList: List<Animal> = dogList   //This assignation is not valid in Java (not covariant)

    var dogMutableList: MutableList<Dog> = mutableListOf()
    //var animalMutableList: MutableList<Animal> = dogMutableList   //This assignation fails as in Java (invariant)







    println("Done!")

}