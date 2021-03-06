plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinKapt)
    id(BuildPlugins.daggerPlugin)
    id(BuildPlugins.navigationSafeArgs)
    id(BuildPlugins.googleServicesPlugin)
}

android {
    compileSdkVersion(AndroidSDK.compileSdk)
    buildToolsVersion("30.0.2")

    defaultConfig {
        applicationId = "com.ezzy.iqtrivia"
        minSdkVersion(AndroidSDK.minSdk)
        targetSdkVersion(AndroidSDK.targetSdk)
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true
        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    buildTypes {
        getByName("release"){
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

//    implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
//    implementation 'androidx.core:core-ktx:1.3.1'
//    implementation 'androidx.appcompat:appcompat:1.2.0'
//    implementation 'com.google.android.material:material:1.2.1'
//    implementation 'androidx.constraintlayout:constraintlayout:2.0.1'
//    testImplementation 'junit:junit:4.+'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
    implementation(Dependencies.legacySupport)
    implementation(Dependencies.kotlinStdLib)
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.materialComponents)
    implementation("androidx.preference:preference:1.1.1")
    testImplementation(TestLibraries.jUnit)
    androidTestImplementation(TestLibraries.testRunner)
    androidTestImplementation(TestLibraries.espresso)

    //dependency injection hilt
    implementation(Dependencies.daggerHilt)
    kapt(Dependencies.daggerKtxCompiler)

    implementation(Dependencies.navigationFragment)
    implementation(Dependencies.navigationUi)
    // Feature module Support
    implementation(Dependencies.navigationDynamic)
    // ViewModel
    implementation(Dependencies.lifecycleViewModel)
    // LiveData
    implementation(Dependencies.liveData)
    //COROUTINES
    implementation(Dependencies.coroutines)
    implementation(Dependencies.coroutinesCore)
    kapt(Dependencies.lifecyleCompiler)
    //ROOM DATABASE
    implementation(Dependencies.roomRuntime)
    kapt(Dependencies.roomCompiler)
    implementation(Dependencies.roomKtx)
    //timber
    implementation(Dependencies.timber)
    //glide
    implementation(Dependencies.glide)
    annotationProcessor(Dependencies.glideAnnotation)
    // Kotlin + coroutines
    implementation(Dependencies.workerKtx)
    implementation(Dependencies.circleImageView)
    implementation(Dependencies.multiDex)

    implementation(Dependencies.sdpAndroid)
    implementation(Dependencies.sspAndroid)

    //Firebase
    implementation(platform(Dependencies.firebase))
    implementation(Dependencies.firebaseAnalytics)
    implementation(Dependencies.firebaseFireStore)
    implementation(Dependencies.firebaseStorage)
    implementation(Dependencies.firebaseAuth)
    implementation(Dependencies.firebaseUiAuth)
    implementation(Dependencies.firebaseUiForFirestore)
    implementation(Dependencies.coroutinesForFirebase)

    //sweet alert for android
    implementation(Dependencies.sweetAlert2)

    //data store
    implementation(Dependencies.dataStore)
    implementation(Dependencies.typedDataStore)

    implementation(Dependencies.skydoveProgress)
}