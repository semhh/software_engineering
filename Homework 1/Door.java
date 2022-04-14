
public class Door {
	... Lock lock;
	... locked = true;

	Door(Lock lock)
	{
		...
	}
	
	boolean isLocked()
	{
		...
	}
	
	boolean lock(Key key)
	{
		...
	}

	boolean unlock(Key key)
	{
		...
	}
	
}
