import org.gradle.kotlin.dsl.version
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

val PluginDependenciesSpec.`android-application`: PluginDependencySpec
    get() = id(Plugins.androidApplication)

val PluginDependenciesSpec.`android-library`: PluginDependencySpec
    get() = id(Plugins.androidLibrary)

val PluginDependenciesSpec.hilt: PluginDependencySpec
    get() = id(Plugins.daggerHilt)

val PluginDependenciesSpec.anvil: PluginDependencySpec
    get() = id(Plugins.anvil) version Versions.anvil

// ./gradlew dependencyUpdates
val PluginDependenciesSpec.`ben-manes-versions`: PluginDependencySpec
    get() = id(Plugins.benManesVersions) version Versions.benManesVersions

// ./gradlew ktlintCheck
val PluginDependenciesSpec.`ktlint-gradle`: PluginDependencySpec
    get() = id(Plugins.ktlintGradle) version Versions.ktlintGradle
