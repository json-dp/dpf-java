package info.paolociccarese.project.dpf.java;

/**
 * Interface to be implemented by the components that
 * need to be notified by the completion of a command
 * object.
 * 
 * @author Dr. Paolo Ciccarese
 */
public interface IStageCompleted {

	/**
	 * Called when the stage execution is completed.
	 */
	public void notifyStageCompletion();
}
