package info.paolociccarese.project.dpf.java;

/**
 * This is the interface to be implemented by all the
 * commands.
 * 
 * @author Dr. Paolo Ciccarese
 */
public interface ICommand {
	
	/**
	 * Trigger the execution of the stage within the pipeline.
	 */
	public void execute();
}
