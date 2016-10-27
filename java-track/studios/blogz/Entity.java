package blogz;

public abstract class Entity {
	
	private final int uid;
	private static int serialNumber;
	
	public Entity() {
		incrementSerialNumber();
		this.uid = serialNumber;
	}

	public int getUid() {
		return this.uid;
	}
	
	public static void incrementSerialNumber(){
		serialNumber ++;
	}
}

