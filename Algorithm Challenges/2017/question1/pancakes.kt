import javax.print.DocFlavor

/*
pancake flipper flips EXACTLY K consecutive pancakes (no more or less)
flip =  happy to blank, blank to happy
goal = all pancakes happy side up

challenge =
For each case,
1. Is it possible to achieve goal with this size flipper?
2. If yes, how many times do you need to use flipper to achieve goal?


 */
object myClass {
    @JvmStatic
    fun main(args: Array<String>) {
        letsTryThis()
    }

    val myString: String = "+++++"

    val flipperSize: Int = 3 //need to take out hardcode

    val flip = flipperSize - 1

    fun letsTryThis(): String {

        var flipCount = 0

        for (pancake in myString) {
            if (pancake == '+') {
                //do nothing
            } else {
                if (myString.indexOf(pancake) + flip > myString.length) {   //check if there's room to flip
                    return "impossible"
                } else {
                    flipping(myString, myString.indexOf(pancake), myString.indexOf(pancake + flip)) //flip
                    flipCount += 1
                }
            }
        }
        return "here's your answer $flipCount"
    }
        fun flipping(myPancakes: String, beginIndex: Int, endIndex: Int) {
            // develop function for changing happy to sad and vice versa
            //increment counter here instead?
        }
    }


