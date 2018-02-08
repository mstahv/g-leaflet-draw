/*
 * $Id:  $
 * 
 *  Copyright (C) 2015, CGI Group Inc. All rights reserved.
 */
package org.peimari.gleaflet.client.draw;

import org.peimari.gleaflet.client.Map;

public class DrawCircleMarker extends DrawFeature {

    protected DrawCircleMarker() {}

    public static native DrawCircleMarker create(Map map, DrawCircleMarkerOptions options)
	/*-{
		return new $wnd.L.Draw.CircleMarker(map, options);
	}-*/;


}
