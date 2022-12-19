plugins {
    id("java-gradle-plugin")
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        create("uniFfiAndroidBindings") {
            id = "au.com.example.plugins.generate-android-bindings"
            implementationClass = "au.com.example.plugins.UniFfiAndroidPlugin"
        }
    }
}
