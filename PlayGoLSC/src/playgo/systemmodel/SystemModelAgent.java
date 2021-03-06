package playgo.systemmodel;

import il.ac.wis.cs.playgo.playtoolkit.api.intf.IPlayGo;
import il.ac.wis.cs.playgo.playtoolkit.api.intf.IPlayable;
import il.ac.wis.cs.playgo.playtoolkit.api.xml.XmlMessageCreator;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SystemModelAgent implements IPlayable
{
	private static final String HOST = "localhost";
	XmlMessageCreator xmlMessageCreator = new XmlMessageCreator();
	
	private static SystemModelAgent instance = null;
	
	public static SystemModelAgent getInstance(){
		if(instance==null){
			instance=new SystemModelAgent();
		}
		return instance;
	}
	
	//CTOR
	private SystemModelAgent(){
	}

	@Override
	public void setPropertyValue(String className, String objectName, 
			String propertyName, String val) 
	{
		//sent runtime property values to system model tree only if systemModelDebug is enabled 
		if(System.getProperty("systemModelDebug")!=null)
		{
			String setPropertyValueXmlMessage = xmlMessageCreator.
					createSetPropertyValueMessage(className, objectName, propertyName, val);
			
			sendMessage(setPropertyValueXmlMessage);
		}
	}

	//sendMessage
	private static String sendMessage(String xmlMessage) 
	{
		Socket s = null; 
		try{
			String port = System.getProperty("systemModelDebugPort");

			int PLAYGO_SERVER_PORT = Integer.valueOf(port);
			int UI_SERVER_PORT = PLAYGO_SERVER_PORT+1;
			int SYSTEM_MODEL_SERVER_PORT = UI_SERVER_PORT+1;	
					
			s = new Socket(HOST, SYSTEM_MODEL_SERVER_PORT);

			DataOutputStream out = 
	        		new DataOutputStream(s.getOutputStream());

			out.writeBytes(xmlMessage + '\n');		//send message
			
			return null;
		}
		catch(Exception ex){
			ex.printStackTrace();
	    }finally{
	    	try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
		return null;
	}

	@Override
	public String activateMethod(String className, String objectName, 
			String methodName, String... arguments)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getPropertyValue(String className, String objectName,
			String propertyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

	@Override
	public void setPlaygo(IPlayGo playgo) {
		// TODO Auto-generated method stub
	}

	@Override
	public void highlightObject(String objectName) {
		// TODO Auto-generated method stub
	}

	@Override
	public void clearObject() {
		// TODO Auto-generated method stub
	}

	@Override
	public String getObjectPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * constructs a new object in the system model - used for dynamic object creation
	 * (if the object already exists in the system model then the construct message is ignored)
	 */
	@Override
	public void construct(String className, String objectName){
		//send message to system model tree only if systemModelDebug is enabled 
		if(System.getProperty("systemModelDebug")!=null)
		{
			String createObjectXmlMessage = xmlMessageCreator.
					createObjectMessage(className, objectName);
			sendMessage(createObjectXmlMessage);
		}
	}

	/**
	 * destroys an object in the system model - used for dynamic object creation/destruction
	 * (if the object does not exist in the system model then the destroy message is ignored)
	 */
	@Override
	public void destroy(String className, String objectName) {
		//send message to system model tree only if systemModelDebug is enabled 
		if(System.getProperty("systemModelDebug")!=null)
		{
			String createObjectXmlMessage = xmlMessageCreator.
					deleteObjectMessage(className, objectName);
			sendMessage(createObjectXmlMessage);
		}
	}

	@Override
	public void playgoIsUp(boolean playOut) {
		// TODO Auto-generated method stub
		
	}
	
}
