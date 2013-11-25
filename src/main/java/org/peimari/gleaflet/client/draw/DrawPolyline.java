package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.Map;


public class DrawPolyline extends DrawFeature {

	protected DrawPolyline() {
	}
	
	public static native DrawPolyline create(Map map, DrawPolylineOptions options) 
	/*-{
		return new $wnd.L.Draw.Polyline(map, options);
	}-*/;


}
