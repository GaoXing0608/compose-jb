package org.jetbrains.compose.desktop.application.dsl

import org.gradle.api.file.ProjectLayout
import org.gradle.api.model.ObjectFactory
import javax.inject.Inject

open class ProGuardDistributions @Inject constructor(
    objects: ObjectFactory,
    layout: ProjectLayout
) {
    var minifyEnabled: Boolean = false
    var proguardFile: String = "proguard-rules.pro"
}