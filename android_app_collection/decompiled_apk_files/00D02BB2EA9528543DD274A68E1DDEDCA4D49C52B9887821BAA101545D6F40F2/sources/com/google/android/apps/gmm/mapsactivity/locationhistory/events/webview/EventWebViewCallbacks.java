package com.google.android.apps.gmm.mapsactivity.locationhistory.events.webview;

import android.os.Parcelable;
import com.google.android.apps.gmm.mapsactivity.locationhistory.common.webview.MapsTimelineWebViewCallbacks;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class EventWebViewCallbacks extends MapsTimelineWebViewCallbacks {
    public static final Parcelable.Creator<EventWebViewCallbacks> CREATOR = new aofi();
    public ansg a;
    public ansi b;
    public ansm c;
    public ansk d;
    public ansq e;
    public aofm f;
    public anso g;
    public anss h;

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        ((aofj) btsq.b(aofj.class, ggaVar)).wU(this);
        return dcdc.l(this.a.a(this.b), this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
