package me.reverser.minigame.main;

public class MessageManager {
	
	private static final String prefix = "";
	
	public static String getPrefix() { return prefix; }
	
	public static enum MessageFormat {
	    WARN("§c"),
	    ERROR("§4"),
	    INFO("§b"),
	    SUCCESS("§a");
		
		public String color;
		
		private MessageFormat(String c) {
			color = c;
		}
		
	}

}
