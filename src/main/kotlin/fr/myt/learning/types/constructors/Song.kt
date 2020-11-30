package fr.myt.learning.types.constructors

import java.time.Duration

/**
 * Primary constructor
 * @param title, because of VAL OR VAL on constructor create field. Without these, it's not field
 *@param artist, because of VAL OR VAL on constructor create field. Without these, it's not field
 */
open class Song(private val title: String, private val artist: String) {
    private var numberViews: Int = 0

    //Secondary constructor, we can't use VAL ANF VAR THERE
    constructor(title: String, artist: String, numberViews: Int) : this(title, artist) {
        this.numberViews = numberViews;
    }

}

fun main(args: Array<String>) {
    val amazingSong = Song("Rivers Flows in you", "Yiruma", 400)
    print(amazingSong)

    val track = Track("Thd", "ddd", 7)
}

//secondary constructor of Class can also call constructor of based class
class Track: Song {

    constructor(title: String, artist: String, numberViews: Int) : super(title, artist, numberViews)

}


