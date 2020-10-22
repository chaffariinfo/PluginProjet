package fr.imiddleware.plugins;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Chaffari Riadh
 * 15/10/2020
 * Affichage message Hello Java.
 *
 */@Mojo( name = "hello1")
public class AppJava extends AbstractMojo
{
    /**
     * Says "Hello Java" to the user.
     *
     */
    public void execute() throws MojoExecutionException
    {
        getLog().info( "Hello JAVA" );
    }
}
