buildscript {
    extra.apply{
        set("compose_version", "1.1.0-beta01")
    }
}
plugins {
    id("com.android.application") version "7.2.2" apply false
    id("com.android.library") version "7.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.5.31" apply false
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}

// These properties are required here so that the nexus publish-plugin
// finds a staging profile with the correct group (group is otherwise set as "")
// and knows whether to publish to a SNAPSHOT repository or not
// https://github.com/gradle-nexus/publish-plugin#applying-the-plugin
val group = "au.com.example"
val version = "0.1.0"

// nexusPublishing {
//     repositories {
//         create("sonatype") {
//             nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
//             snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
//
//             val ossrhUsername: String? by project
//             val ossrhPassword: String? by project
//             username.set(ossrhUsername)
//             password.set(ossrhPassword)
//         }
//     }
// }


