package fr.imiddleware.plugins;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
 
/**
 * Chaffari Riadh
 * 15/10/2020
 * Affichage message Hello Maven.
 *
 */
@Mojo( name = "hello2")
public class AppMaven extends AbstractMojo
{
    /**
     * Says "Hello Maven" to the user.
     *
     */
    public void execute() throws MojoExecutionException
    {
        getLog().info( "Hello MAVEN" );
    }
}
