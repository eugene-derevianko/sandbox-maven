package com.symulakr.sandbox;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "say-hello-on-compile", defaultPhase = LifecyclePhase.COMPILE)
public class SayHelloOnCompile extends AbstractMojo {

   public void execute() throws MojoExecutionException {
      getLog().info("Hello, world. on Compile");
   }
}
