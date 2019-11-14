package com.symulakr.sandbox;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "say-hello")
public class SayHello extends AbstractMojo {

   public void execute() throws MojoExecutionException {
      getLog().info("Hello, world.");
   }
}
