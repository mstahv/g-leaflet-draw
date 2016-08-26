package org.peimari.gleaflet.client.draw;

public class DrawPolygonHandlerOptions extends DrawPolylineHandlerOptions {

    protected DrawPolygonHandlerOptions() {
    }

    public static native DrawPolygonHandlerOptions create()
    /*-{
        return {};
    }-*/;

    public native final void setShowArea(boolean showArea)
	/*-{
		this.showArea = showArea;
	}-*/;
}
