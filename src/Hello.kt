/**
 * Created by Zyao89 on 2017/6/2.
 */

import kotlin.browser.window
import kotlin.js.json

external fun alert(message: Any?)

@JsName("window")
val w: dynamic = window

fun main(args: Array<String>) {
    Vue.config.delimiters = arrayOf("{!", "!}")
    console.log(Vue.config)
    vue = Vue(json(
            Pair("el", "#app"),
            Pair("data",
                    json(
                            Pair("message", "ABCDEF123456789")
                    )
            ),
            Pair("methods",
                    json(
                            Pair("reverseMessage", {
                                change()
                            })

                    ))
    ))
    console.log(vue)
}

var vue:Vue? = null

fun haha(): Unit {
    alert("hahah54564aha....")
}

fun change() {
    vue?.let {
        console.log(it.`$data`?.message)
        it.`$data`?.message = it.`$data`.message.split("").reverse().join("")
    }
}
