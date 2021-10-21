package com.github.alonwang.simplelanguageplugin.services

import com.intellij.openapi.project.Project
import com.github.alonwang.simplelanguageplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
