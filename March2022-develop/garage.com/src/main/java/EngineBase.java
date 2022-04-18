public abstract class EngineBase implements IEngine {
	protected int cylinderCount;
	private boolean isStarted;
	private String gasType;

	public void start() {
		this.isStarted = true;
	}

	public boolean getIsStarted() {
		return this.isStarted;
	}
	
	public int getCylinderCount(int count) {
		return this.cylinderCount=count;
	}
	public String testEngine(String pass) {
		return pass;
	}
}
