package defpackage;

import com.google.android.apps.gmm.directions.routepreview.routefetching.RoutePreviewLauncherParameters;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wbh  reason: default package */
/* loaded from: classes7.dex */
public final class wbh {
    final /* synthetic */ wbi a;

    public wbh(wbi wbiVar) {
        this.a = wbiVar;
    }

    public final RoutePreviewLauncherParameters a() {
        bvrj.UI_THREAD.c();
        RoutePreviewLauncherParameters routePreviewLauncherParameters = this.a.g;
        dbsk.s(routePreviewLauncherParameters);
        return routePreviewLauncherParameters;
    }

    public final void b(RoutePreviewLauncherParameters routePreviewLauncherParameters) {
        bvrj.UI_THREAD.c();
        this.a.g = routePreviewLauncherParameters;
    }
}
