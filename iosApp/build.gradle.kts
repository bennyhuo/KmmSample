plugins {
    id("org.jetbrains.gradle.apple.applePlugin") version "212.4638.14-0.15"
}

apple {
    iosApp {
        productName = "kmmsample"

        sceneDelegateClass = "SceneDelegate"
        launchStoryboard = "LaunchScreen"

        //productInfo["NSAppTransportSecurity"] = mapOf("NSAllowsArbitraryLoads" to true)
        //buildSettings.OTHER_LDFLAGS("")

        dependencies {
            implementation(project(":shared"))
        }
    }
}
