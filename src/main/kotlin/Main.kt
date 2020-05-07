var counter = 30
var counterInterval: Int? = undefined

fun outOfTime() {
    if (counterInterval != undefined) {
        return
    }
    E.showMessage("Out of Time", "My Timer");
    Bangle.buzz().then {
        Bangle.beep(200, 4000)
    }.then {
// TODO i have no clue how to rewrite this in KotlinJS
//        .then(() => new Promise(resolve => setTimeout (resolve, 200)))
        Bangle.beep(200, 3000)
    }
    // again, 10 secs later
    setTimeout( ::outOfTime, 10000);
}


fun countDown() {
    counter--
    // Out of time
    if (counter <= 0) {
        clearInterval(counterInterval)
        counterInterval = undefined
        setWatch( { startTimer() }, BTN2)
        outOfTime()
        return
    }

    g.clear();
    g.setFontAlign(0,0); // center font
    g.setFont("Vector",80); // vector font, 80px
    // draw the current counter value
    g.drawString("$counter",120,120);
    // optional - this keeps the watch LCD lit up
    g.flip();
}

fun startTimer() {
    counter = 30
    countDown()
    if (counterInterval == undefined) {
        counterInterval = setInterval( ::countDown , 1000)
    }
}

fun main() {
    startTimer()
}

