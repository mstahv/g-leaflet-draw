package org.peimari.gleaflet.client.draw;

import com.google.gwt.core.client.JavaScriptObject;
import org.peimari.gleaflet.client.Icon;

public class DrawMarkerOptions extends JavaScriptObject {

    protected DrawMarkerOptions() {}

    public static native DrawMarkerOptions create()
    /*-{
        return {};
	}-*/;

    public native final void setIcon(Icon icon)
    /*-{
        this.icon = icon;
	}-*/;

    public native final void setZIndexOffset(int zIndexOffset)
    /*-{
        this.zIndexOffset = zIndexOffset;
	}-*/;

    public native final void setRepeatMode(boolean repeatMode)
    /*-{
        this.repeatMode = repeatMode;
    }-*/;

}
