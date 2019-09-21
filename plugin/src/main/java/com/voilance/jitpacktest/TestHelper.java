package com.voilance.jitpacktest;

public class TestHelper {

    public static IBuildGradleEditor getBuildGradleEditor() {
        try {
            Class<?> clas = Class.forName("com.voilance.jitpacktest.LogBuildGradleEditor");
            Object obj = clas.newInstance();
            if (obj instanceof IBuildGradleEditor) {
                return (IBuildGradleEditor) obj;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
