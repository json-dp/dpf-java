package info.paolociccarese.project.dpf.java;

/**
 * Interface to be implemented by the components that
 * need to be notified by the activities of a stage
 * object. Stage completion is the most obvious example.
 * 
 * @author Dr. Paolo Ciccarese
 */
public interface IStageListener {

	/**
	 * Called when the stage execution is successfully completed.
	 */
	public void notifyStageCompletion();
}
