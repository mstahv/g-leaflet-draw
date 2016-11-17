package org.peimari.gleaflet.client.draw;

import com.google.gwt.core.client.JavaScriptObject;

public class DrawControlEditHandlerOptions extends JavaScriptObject {

    protected DrawControlEditHandlerOptions() {}

    public static native DrawControlEditHandlerOptions create()
    /*-{
        return {};
	}-*/;

    public native final void setSelectedPathOptions(SelectedPathOptions selectedPathOptions)
    /*-{
        this.selectedPathOptions = selectedPathOptions;
    }-*/;

}
