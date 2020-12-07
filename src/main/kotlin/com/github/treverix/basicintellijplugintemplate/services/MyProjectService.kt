package com.github.treverix.basicintellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.treverix.basicintellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
