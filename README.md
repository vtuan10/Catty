# Android Tech Challenge: Catty
In this technical challenge, we implement an Android app for the [TheCatAPI](https://thecatapi.com/).
We provide a skeleton, please use this for implementation. The result should be a production ready app for release.
You should incorparate the following outlines:
* Language: Kotlin
* Minimum Version: Android 6 (API level 23)
* The app should follow [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)
* Single Activity for the whole app, use fragments for the screens
* Use MVVM for the view layer
* Use repository pattern for data layer
* Try to develop the app in a modern way and use best practices
* Test the app: Junit and Espresso
* For this app the style of the component does not matter. Color, font and dimension ca be choosed as seen fit, just orient yourself at the screenshots.

## Exercise 1
1. Get an API key from [TheCatAPI](https://thecatapi.com/signup).
2. In the `login` module implement the screen shown at the end of this exercise.
  * The *Login* button is only clickable if an API key is inserted
  * When the *Login* button is clicked, the inserted API key is tested against [TheCatAPI](https://thecatapi.com) to check if the key is valid
  * If this check fails, show an error dialog with a meaningful error
  * If this check succeeds, move on to the next screen, which will be defined in **Exercise 2**
  * If the checkbox *Store this API key for future use* is checked, store this API key securely in the app. Please be aware that this API key should be treated as highly sensitive information. On the next app start the login screen should be skipped and the stored API key should be used.
3. The app should launch with the login screen as first screen (skipped when the checkbox was checked before)

Screens:

<img src="/img/login_screen.png" width="200"/> 


