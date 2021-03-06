package vn.com.vng.gsmobile.casino.schedules;

import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import vn.com.vng.gsmobile.casino.entries.RoomManager;
import vn.com.vng.gsmobile.casino.ulti.Const;
import vn.com.vng.gsmobile.casino.ulti.Lib;

public class RoomCleanScheduler {
	public boolean running = false;
	public synchronized void setRunning(boolean isRunning){
		running = isRunning;
	}
	private class RoomCleanService extends TimerTask{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			if(!running && !Const.IS_STARTING && !Const.IS_STOPPING)
				try{
					setRunning(true);
					RoomManager.roomCleanSchedule();
				}catch(Exception e){
					Lib.getLogger().error(this.getClass().getName()+".run.catch:"+Lib.getStackTrace(e));
				}	
				finally {
					setRunning(false);
				}
		}
	}
	long iPERIOD = 1000; // 1 giây 1 lần
	Timer tm = null;
	public RoomCleanScheduler(){
		tm = new Timer();
	}
	public RoomCleanScheduler(long iPERIOD){
		this.iPERIOD = iPERIOD;
		tm = new Timer();
	}
	public void start(){ 
		Lib.getLogger().info(Arrays.asList(iPERIOD, this.getClass().getSimpleName()+".start:..."));
		tm.schedule(new RoomCleanService(), iPERIOD, iPERIOD);
		Lib.getLogger().info(Arrays.asList(iPERIOD, this.getClass().getSimpleName()+".start:OK"));
	}
	public void stop(){
		Lib.getLogger().info(Arrays.asList(iPERIOD, this.getClass().getSimpleName()+".stop:..."));
		tm.cancel();
		tm.purge();
		Lib.getLogger().info(Arrays.asList(iPERIOD, this.getClass().getSimpleName()+".stop:OK"));
	}
}
