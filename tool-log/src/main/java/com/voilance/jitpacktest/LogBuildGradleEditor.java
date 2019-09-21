package com.voilance.jitpacktest;

import org.gradle.api.Project;

public class LogBuildGradleEditor implements IBuildGradleEditor {
    @Override
    public void edit(Project project) {
//        project.getDependencies().add("implementation", "com.github.Voilance:lib-log:0.1");
        project.getDependencies().add("implementation", "com.github.Voilance.jitpacktest:lib-log:0.2");
    }
}
