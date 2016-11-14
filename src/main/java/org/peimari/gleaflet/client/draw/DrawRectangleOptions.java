package org.peimari.gleaflet.client.draw;

import com.google.gwt.core.client.JavaScriptObject;
import org.peimari.gleaflet.client.PathOptions;

public class DrawRectangleOptions extends JavaScriptObject {

    protected DrawRectangleOptions() {}

    public static native DrawRectangleOptions create()
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
