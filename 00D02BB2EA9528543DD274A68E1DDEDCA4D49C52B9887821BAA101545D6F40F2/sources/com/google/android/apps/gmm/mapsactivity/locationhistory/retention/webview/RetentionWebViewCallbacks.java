package com.google.android.apps.gmm.mapsactivity.locationhistory.retention.webview;

import android.os.Parcelable;
import com.google.android.apps.gmm.mapsactivity.locationhistory.common.webview.MapsTimelineWebViewCallbacks;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RetentionWebViewCallbacks extends MapsTimelineWebViewCallbacks {
    public static final Parcelable.Creator<RetentionWebViewCallbacks> CREATOR = new aolq();
    public ansg a;
    public aolp b;
    public ansm c;
    public ansk d;
    public ansq e;

    @Override // com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks
    public final List<bvwz> c(gga ggaVar) {
        ((aolr) btsq.b(aolr.class, ggaVar)).wV(this);
        return dcdc.i(this.a.a(this.b), this.c, this.d, this.e);
    }
}
