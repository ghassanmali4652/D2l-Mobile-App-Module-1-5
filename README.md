# D2L Module Pages (Kotlin + Jetpack Compose)

This Android Studio project contains the five module pages from the Figma design.

## Included

- Module 1 is the temporary launcher screen for testing.
- `Module2Activity`, `Module3Activity`, `Module4Activity`, and `Module5Activity` are registered in the manifest.
- Every lesson card opens its supplied KSU D2L URL in the device browser.
- The on-screen Back control and Android system Back both call `finish()`, so they return to whichever Activity opened the module page.
- The module UI is implemented entirely in Kotlin with Jetpack Compose.

## Opening a module from another Activity

```kotlin
startActivity(Intent(this, Module3Activity::class.java))
```

Use `Module2Activity` through `Module5Activity` as needed. Module 1 currently uses `MainActivity`.

## Run

Open the project in Android Studio, allow Gradle sync to finish, select an emulator or Android device, and press Run.
