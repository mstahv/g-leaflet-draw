package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.Map;


public class DrawRectangle extends DrawFeature {

	protected DrawRectangle() {
	}
	
	public static native DrawRectangle create(Map map, DrawRectangleOptions options) 
	/*-{
		return new $wnd.L.Draw.Rectangle(map, options);
	}-*/;


}
