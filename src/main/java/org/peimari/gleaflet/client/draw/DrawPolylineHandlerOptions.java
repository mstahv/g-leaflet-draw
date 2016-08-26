/*
 * $Id:  $
 * 
 *  Copyright (C) 2016, CGI Group Inc. All rights reserved.
 */
package org.peimari.gleaflet.client.draw;

public class DrawPolylineHandlerOptions extends DrawVectorOptions {

    protected DrawPolylineHandlerOptions() {
    }

    public static native DrawPolylineHandlerOptions create()
    /*-{
        return {};
    }-*/;

    public native final void setAllowIntersection(boolean allowIntersection)
    /*-{
        this.allowIntersection = allowIntersection;
    }-*/;

    public native final void setGuidelineDistance(int guidelineDistance)
    /*-{
        this.guidelineDistance = guidelineDistance;
    }-*/;

    public native final void setMetric(boolean metric)
    /*-{
        this.metric = metric;
    }-*/;

    public native final void setZIndexOffset(int zIndexOffset)
    /*-{
        this.zIndexOffset = zIndexOffset;
    }-*/;

}
