package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.Map;


public class DrawPolygon extends DrawPolyline {

	protected DrawPolygon() {
	}
	
	public static native DrawPolygon create(Map map, DrawPolygonOptions options) 
	/*-{
		return new $wnd.L.Draw.Polygon(map, options);
	}-*/;


}
