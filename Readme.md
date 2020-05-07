# Kangle: Bangle.js First Application (Timer) KotlinJS Edition
This is the [Bangle.js First Application](https://www.espruino.com/Bangle.js+First+App) guide completely written in [Kotlin JavaScript](https://kotlinlang.org/docs/reference/js-overview.html) for the 
[The World's first Open Source Hackable Smart Watch](https://banglejs.com/).
## Building 
`./gradlew assemble`

There is a lot of Javascript code in the build directory but only one file is compatible.
You can find this file in `build/js/node_modules/Kangle/kotlin/Kangle.js`.

Or use this gist: https://gist.github.com/Xaseron/5527e10f225823b99bf2a55db435fdb2

## Running
The simplest way to run this code is to copy the file or gist and paste it into the [Emulator](https://www.espruino.com/ide/emulator.html).

## Sourcecode 
This project consist of two files:
- `Main.kt`: resembles the official *First Application* guide
- `Externals.kt`: type definition of every [Espruino API](https://www.espruino.com/Reference#Bangle) used by the application

## Todo
There is a lot of room for improvement. My JavaScript knowledge is very limited.
Help is very much appreciated. PRs welcome.  

### Dependencies
Currently, they are all defined manual. 
It would be nice to somehow import than. 
The Emulator has some type hints, so this might be possible.
The other possible solution would be to auto generate them.

### Gradle build target
```kotlin
kotlin {
    target {
        // both targets are needed to produce working code
        produceExecutable()
        nodejs { }
    }
}
``` 
I need both target so that the file `build/js/node_modules/Kangle/kotlin/Kangle.js` is generated.
I think this is some intermediate file. 
There might be a better way to enforce the generation of Espruino compatible source code.  

### Kotlin stdlib support
At the moment only plain Kotlin + Espruino API is usable.
The `kotlin.js` is simply too big to fit on the Watch. 
Maybe with proper [Dead Code Elimination (DCE)](https://kotlinlang.org/docs/reference/javascript-dce.html) and minification this might be possible.
