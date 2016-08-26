package org.peimari.gleaflet.client.draw;

import com.google.gwt.core.client.JavaScriptObject;

public class DrawHandlerOptions extends JavaScriptObject {

    protected DrawHandlerOptions() {
    }

    public native final void setRepeatMode(boolean repeatMode)
    /*-{
        this.repeatMode = repeatMode;
    }-*/;
}
