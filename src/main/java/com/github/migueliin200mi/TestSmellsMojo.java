package com.github.migueliin200mi;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(
    name = "detect",
    defaultPhase = LifecyclePhase.TEST
)
public class TestSmellsMojo extends AbstractMojo {

    @Override
    public void execute() throws MojoExecutionException {
        getLog().info("TestSmells plugin ejecutándose correctamente");
    }
}
