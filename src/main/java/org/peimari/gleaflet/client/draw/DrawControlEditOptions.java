package org.peimari.gleaflet.client.draw;

import com.google.gwt.core.client.JavaScriptObject;
import org.peimari.gleaflet.client.FeatureGroup;

public class DrawControlEditOptions extends JavaScriptObject {

    protected DrawControlEditOptions() {}

    public static native DrawControlEditOptions create()
    /*-{
        return {};
	}-*/;

    public native final void setFeatureGroup(FeatureGroup featureGroup)
    /*-{
        this.featureGroup = featureGroup;
    }-*/;

    public native final void setEditHandler(DrawControlEditHandlerOptions editHandlerOptions)
    /*-{
        this.edit = editHandlerOptions;
    }-*/;

    public native final void disableEditHandler()
    /*-{
        this.edit = false;
    }-*/;

    public native final void setDeleteHandler(DrawControlDeleteHandlerOptions deleteHandlerOptions)
    /*-{
        this.remove = deleteHandlerOptions;
    }-*/;

    public native final void disableDeleteHandler()
    /*-{
        this.remove = false;
    }-*/;

}
