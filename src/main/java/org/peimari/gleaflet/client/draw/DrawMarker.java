package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.Map;


public class DrawMarker extends DrawFeature {

	protected DrawMarker() {
	}
	
	public static native DrawMarker create(Map map, DrawMarkerOptions options) 
	/*-{
		return new $wnd.L.Draw.Marker(map, options);
	}-*/;


}
