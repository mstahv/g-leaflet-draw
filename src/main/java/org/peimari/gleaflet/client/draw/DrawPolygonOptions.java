package org.peimari.gleaflet.client.draw;


public class DrawPolygonOptions extends DrawPolylineOptions {

    protected DrawPolygonOptions() {}

    public static native DrawPolygonOptions create()
    /*-{
        return {};
    }-*/;

    public native final void setShowArea(boolean showArea)
    /*-{
        this.showArea = showArea;
    }-*/;

}
