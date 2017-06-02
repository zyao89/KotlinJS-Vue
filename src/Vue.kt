/**
 * Created by Zyao89 on 2017/6/2.
 */
import org.w3c.dom.HTMLElement

@JsName("Vue")
external class Vue (options: Any?){
    var paramAttributes: Array<Any>
    var template: String
    var replace: Boolean
    var created: VueCallback
    var beforeCompile: VueCallback
    var compiled: VueCallback
    var ready: VueCallback
    var attached: VueCallback
    var detached: VueCallback
    var beforeDestroy: VueCallback
    var destroyed: VueCallback
    var inherit: Boolean
    var mixins: Array<Any>
    var name: String
    var `$el`: HTMLElement
    var `$parent`: Vue
    var `$root`: Vue
    fun `$watch`(expression: String, callback: VueCallback, deep: Boolean?, immediate: Boolean?):Unit
    fun `$get`(expressopn: String): dynamic
    fun `$set`(keypath: String, value: Any): Unit
    fun `$add`(keypath: String, value: Any): Unit
    fun `$delete`(keypath: String):Unit
    fun `$eval`(expression: String): dynamic
    fun `$interpolate`(templateString: String): String
    fun `$log`(keypath: String?): Unit
    fun `$dispatch`(evant: String, args: Any?): Vue
    fun `$broadcast`(evant: String, args: Any?): Vue
    fun `$emit`(event: String, args: Any?): Vue
    fun `$on`(event: String, callback: Any): Vue
    fun `$once`(event: String, callback: Any): Vue
    fun `$off`(event: String?, callback: Any?): Vue
    fun `$appendTo`(element: Any, callback: Any?): Vue
    fun `$prependTo`(element: Any, callback: Any?): Vue
    fun `$before`(element: Any, callback: Any?): Vue
    fun `$after`(element: Any, callback: Any?): Vue
    fun `$remove`(callback: Any?): Vue
    fun `$mount`(element: Any?): Vue
    fun `$destroy`(remove: Boolean?): Unit
    fun `$compile`(element: HTMLElement): VueCallback
    fun `$addChild`(options: Any, constructor: Any?): Vue
    fun _init(options: Any): Unit
    fun _cleanup(): Unit
    companion object {
        var config: VueConfig
        fun extend(options: Any): Vue
        fun directive(id: String, definition: Any?): Unit
        fun filter(id: String, definition: FilterCallback?): Unit
        fun component(id: String, definition: Vue): Unit
        fun transition(id: String, definition: Any?): Unit
        fun partial(id: String, definition: String?): Unit
        fun nextTick(callback: Any): Unit
        fun require(module: String): Unit
        fun use(plugin: Any, args: Any?): Vue
    }
    var `$data`: dynamic
}
@JsName("config")
external class VueConfig {
    var prefix: String
    var debug: Boolean
    var silent: Boolean
    var proto: Boolean
    var interpolate: Boolean
    var async: Boolean
    var delimiters: Array<String>
}
interface ValueCallback {
    fun apply(newValue: Any, oldValue: Any): Unit
}

interface VueCallback {
    fun apply(): Unit
}

interface FilterCallback {
    fun apply(value: Any, begin: Any?, end: Any?): Any
}