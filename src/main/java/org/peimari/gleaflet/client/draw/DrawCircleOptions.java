package org.peimari.gleaflet.client.draw;

import com.google.gwt.core.client.JavaScriptObject;
import org.peimari.gleaflet.client.PathOptions;

public class DrawCircleOptions extends JavaScriptObject {

    protected DrawCircleOptions() {}

    public static native DrawCircleOptions create()
    /*-{
        return {};
	}-*/;

    public native final void setShapeOptions(PathOptions shapeOptions)
    /*-{
        this.shapeOptions = shapeOptions;
	}-*/;

    public native final void setRepeatMode(boolean repeatMode)
    /*-{
        this.repeatMode = repeatMode;
	}-*/;

}
