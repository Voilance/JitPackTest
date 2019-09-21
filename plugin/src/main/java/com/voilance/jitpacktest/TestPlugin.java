package com.voilance.jitpacktest;


import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class TestPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        if (project.getPlugins().hasPlugin("com.android.application")) {
            project.afterEvaluate(p -> {
                IBuildGradleEditor editor = TestHelper.getBuildGradleEditor();
                if (editor != null) {
                    for (Project subProject : p.getRootProject().getSubprojects()) {
                        if (subProject.getPlugins().hasPlugin("com.android.application") ||
                            subProject.getPlugins().hasPlugin("com.android.library")) {
                            editor.edit(subProject);
                        }
                    }
                }
            });
        }
    }
}
