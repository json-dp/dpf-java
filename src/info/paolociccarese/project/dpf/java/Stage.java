package info.paolociccarese.project.dpf.java;

/**
 * A Stage is one component of the pipeline. It wraps the logic
 * to be executes so that you don't have to worry about the 
 * pipeline management. 
 * 
 * @author Dr. Paolo Ciccarese
 */
public class Stage implements IStage {

	/**
	 * The command to be executed by the stage. The command
	 * implementation contains all the necessary logic.
	 */
	private ICommand _command;
	
	/**
	 * By default each stage is executable (see constructor). 
	 * IF the stage needs to be skipped that has to be declared 
	 * explicitly by using the method setExecutable(IStage.SKIP).
	 */
	private boolean _executable;
	
	/**
	 * The constructors create a Stage object which consists of 
	 * a wrapper for the logic defined by the command implementation.
	 * @param command
	 */
	public Stage(ICommand command) {
		_executable = EXECUTE;
		_command = command;	
	}
	
	/**
	 * Returns the command wrapped by this stage.
	 */
	@Override
	public ICommand getCommand() {
		return _command;
	}
	
	/**
	 * Sets if this stage is executable or has to be skipped.
	 * @param executable True if the stage is set to be executed within the pipeline
	 */
	@Override
	public void setExecutable(boolean executable) {
		_executable = executable;
	}
	
	/**
	 * Returns true if the stage is currently executable.
	 */
	@Override
	public boolean isExecutable() {
		return _executable;
	}
	
	@Override
	public void execute() {
		_command.execute();
	}
}
