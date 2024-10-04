pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            setUrl("https://a8c-libs.s3.amazonaws.com/android")
            content {
                includeGroup("com.automattic.android")
                includeGroup("com.automattic.android.measure-builds")
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("https://a8c-libs.s3.amazonaws.com/android")
            content {
                includeGroup("com.automattic")
                includeGroup("com.automattic.tracks")
            }
        }
    }
}


include(":app")
include(":automotive")
include(":wear")

// features
include(":modules:features:account")
include(":modules:features:cartheme")
include(":modules:features:discover")
include(":modules:features:endofyear")
include(":modules:features:filters")
include(":modules:features:navigation")
include(":modules:features:player")
include(":modules:features:podcasts")
include(":modules:features:profile")
include(":modules:features:search")
include(":modules:features:settings")
include(":modules:features:shared")
include(":modules:features:taskerplugin")

// services
include(":modules:services:analytics")
include(":modules:services:compose")
include(":modules:services:images")
include(":modules:services:localization")
include(":modules:services:model")
include(":modules:services:preferences")
include(":modules:services:protobuf")
include(":modules:services:repositories")
include(":modules:services:servers")
include(":modules:services:ui")
include(":modules:services:utils")
include(":modules:services:views")
include(":modules:services:sharedtest")

includeBuild("../../../sentry-java") {
  dependencySubstitution {
//    substitute(module("io.sentry:sentry-bom")).using(project(":sentry-bom"))
    substitute(module("io.sentry:sentry")).using(project(":sentry"))
    substitute(module("io.sentry:sentry-android-core")).using(project(":sentry-android-core"))
    substitute(module("io.sentry:sentry-android-ndk")).using(project(":sentry-android-ndk"))
    substitute(module("io.sentry:sentry-replay")).using(project(":sentry-android-replay"))
    substitute(module("io.sentry:sentry-android-okhttp")).using(project(":sentry-android-okhttp"))
    substitute(module("io.sentry:sentry-compose-android")).using(project(":sentry-compose"))
  }
}
