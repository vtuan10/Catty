# Android Tech Challenge: Catty
In this technical challenge, we implement an Android app for the [TheCatAPI](https://thecatapi.com/).
We provide a skeleton, please use this for implementation. The result should be a production ready app for release.
Please incorparate the following outlines:
* Language: Kotlin
* Minimum Version: Android 6 (API level 23)
* The app should follow [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)
* Please follow the skeleton project i.e. by putting all networking code in the `networkingCore` module
* Use MVVM for the view layer
* Use repository pattern for data layer
* Please use fragments for the screens
* Please develop the app in a modern way and use best practices
* Libraries can be used, but try to keep it at a minimum (OkHttp, Retrofit, .. should be used)
* Test the app: We expect Junit and Espresso tests
* For this app, the style of the components do not matter. Color, font and dimension can be choosen as seen fit, the screenshots are only for guidance.

## Exercise 1
In this exercise, we prepare the app for usage with the [TheCatAPI](https://thecatapi.com).
1. Get an API key from [TheCatAPI](https://thecatapi.com/signup).
2. In the `login` module, implement the screen shown at the end of this exercise.
  * The *Login* button is only clickable if an API key is inserted
  * When the *Login* button is clicked, the inserted API key is tested against [TheCatAPI](https://thecatapi.com) to check if the key is valid
  * If this check fails, show an error dialog with a meaningful error
  * If this check succeeds, move on to the next screen, which will be defined in **Exercise 2**
  * If the checkbox *Store this API key for future use* is checked, store this API key securely in the app. Please be aware that this API key should be treated as highly sensitive information. On the next app start, the login screen is skipped and the stored API key is used.
3. The app should launch with the login screen as first screen (skipped when the checkbox was checked before)

Screen:

<img src="/img/login.png" width="200"/> 


## Exercise 2
In this exercise, we will talk with the API and create a view which shows a random cat.
1. Implement a `BottomNavigationView` like in the screenshot below
2. In the `Random` tab, a random cat is shown with some information about its breed.
  * The screen is refreshable with a `Pull to refresh` action
  * On refresh a new cat is shown with the corresponding description

Screen:

<img src="/img/random.png" width="200"/>

## Exercise 3
In this exercise, we will create a list of random cats which is indefinitely scrollable.
1. Create a `RecyclerView` on the second tab
  * The list consists of pictures of random cats
  * It should be able, to indefinitely scroll the list and new images should be loaded dynamically
2. When a list item is clicked, the second screen is shown
  * It contains the details of the shown cat of the first screen.
  * A sharing screen is shown, when the image is long clicked to share the image.

Screens:

<img src="/img/list.png" width="200"/>      <img src="/img/details.png" width="200"/>

## Exercise 4
The app should show a local notification on each day at 12 pm. The code for this is implemented in the `notification` module, but does not work correctly.
Please fix the bugs, so that it works correctly.

## Bonus Exercise
At this point we have a working Catty app. Now the same is required for dogs. Fortunately, the same API exists as [TheDogAPI](https://thedogapi.com).
Create a second flavor of this app which shows dogs instead of cats.
