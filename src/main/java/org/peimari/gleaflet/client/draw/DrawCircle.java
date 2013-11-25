package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.Map;


public class DrawCircle extends DrawFeature {

	protected DrawCircle() {
	}
	
	public static native DrawCircle create(Map map, DrawCircleOptions options) 
	/*-{
		return new $wnd.L.Draw.Circle(map, options);
	}-*/;


}
