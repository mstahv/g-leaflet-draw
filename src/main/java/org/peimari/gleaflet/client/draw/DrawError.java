package org.peimari.gleaflet.client.draw;

import com.google.gwt.core.client.JavaScriptObject;

public class DrawError extends JavaScriptObject {

    protected DrawError() {}

    public static native DrawError create()
    /*-{
        return {};
    }-*/;

    public native final void setColor(String color)
    /*-{
        this.color = color;
    }-*/;

    public native final void setTimeout(int timeout)
    /*-{
        this.timeout = timeout;
    }-*/;
}
