/*
 * $Id:  $
 * 
 *  Copyright (C) 2015, CGI Group Inc. All rights reserved.
 */
package org.peimari.gleaflet.client.draw;

import com.google.gwt.core.client.JavaScriptObject;

public class DrawCircleMarkerOptions extends JavaScriptObject {

    protected DrawCircleMarkerOptions() {}

    public static native DrawCircleMarkerOptions create()
    /*-{
        return {};
	}-*/;

    public native final void setRepeatMode(boolean repeatMode)
    /*-{
        this.repeatMode = repeatMode;
	}-*/;

}
