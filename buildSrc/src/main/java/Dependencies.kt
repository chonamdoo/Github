object Dependencies{
    val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    val junit = "junit:junit:${Versions.junit}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"

    val material = "com.google.android.material:material:${Versions.material}"
    val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    val annotation = "androidx.annotation:annotation:${Versions.annotation}"

    val ktx = "androidx.core:core-ktx:${Versions.ktx}"

    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}"

    val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"
    val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"

    val timber ="com.jakewharton.timber:timber:${Versions.timber}"

    val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
    val daggerSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    val daggerProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"

    val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifeCycle}"

    val room = "androidx.room:room-runtime:${Versions.room}"
    val roomRxjava2 = "androidx.room:room-rxjava2:${Versions.roomRxjava2}"
    val roomCompiler = "androidx.room:room-compiler:${Versions.roomCompiler}"

    val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitConvertGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"
    val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
    val stethoOkhttp = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"

    val memoryLeakDebug = "com.squareup.leakcanary:leakcanary-android:${Versions.memoryLeak}"
    val memoryLeakRelease = "com.squareup.leakcanary:leakcanary-android-no-op:${Versions.memoryLeak}"

    val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    val mockitoAndroid = "org.mockito:mockito-android:${Versions.mockito}"
    val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.mockWebServer}"

}