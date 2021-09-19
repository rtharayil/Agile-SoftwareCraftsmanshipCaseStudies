/*Kindly review the below code. How Can I test AutomaticLockDoor class independently?*/ 

public class Timer{

    public schedule (TimerTask task, int seconds){

        // Call run() after  seconds
    }
     
}


public class AutomaticLockDoor extends Timer {
    
	void lockTheDoor(){
		// lock the door 
	}

    public AutomaticLockDoor(int seconds) {
        
        super.schedule(new RemindTask(), seconds*1000);
	}

    class RemindTask extends TimerTask {
        public void run() {
        	lockTheDoor();
            
        }
    }

   
}

