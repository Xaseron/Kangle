import kotlin.js.Promise

external fun setInterval(cl: () -> Unit, interval: Int): Int
external fun setTimeout(cl: () -> Unit, interval: Int): Int
external fun clearInterval(id: Int?)
external fun setWatch(cl: () -> Unit, pin: Pin)

open external class Pin
external object BTN2 : Pin


external class Bangle {
    companion object {
        fun buzz(): Promise<Any>
        fun beep(time: Int = definedExternally, freq: Int = definedExternally): Promise<Any>
    }
}


external class E {
    companion object {
        fun showPrompt(str: String, ops: String): Promise<Boolean>
        fun showPrompt(str: String): Promise<Boolean>
        fun showPrompt(): Promise<Boolean>

        fun showMessage(message: String, title: String)
    }
}

external class g {
    companion object {
        fun clear(): g
        fun drawString(str: String, x: Int, y: Int): g
        fun setFontAlign(x: Int, y: Int): g
        fun flip(): g
        fun setFont(str: String, size: Int): g
    }
}
