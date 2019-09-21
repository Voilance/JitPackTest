package com.voilance.jitpacktest;

import org.gradle.api.Project;

public class LogBuildGradleEditor implements IBuildGradleEditor {
    @Override
    public void edit(Project project) {
        project.getDependencies().add("implementation", "com.voilance.jitpacktest:lib-log:0.4");
    }
}
