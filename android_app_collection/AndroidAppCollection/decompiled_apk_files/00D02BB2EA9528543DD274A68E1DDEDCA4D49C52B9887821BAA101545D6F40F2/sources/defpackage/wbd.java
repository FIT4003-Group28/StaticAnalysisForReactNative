package defpackage;

import com.google.android.apps.gmm.directions.routepreview.routefetching.RoutePreviewLauncherParameters;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wbd  reason: default package */
/* loaded from: classes7.dex */
public final class wbd {
    final /* synthetic */ wbe a;

    public wbd(wbe wbeVar) {
        this.a = wbeVar;
    }

    public final void a(srf srfVar) {
        bvrj.UI_THREAD.c();
        wbe wbeVar = this.a;
        if (wbeVar.d != srfVar.a) {
            return;
        }
        wbeVar.a();
        qbm qbmVar = srfVar.b;
        if (qbmVar.d() || !qbmVar.o()) {
            this.a.b();
            return;
        }
        amte n = qbmVar.n();
        if (n == null) {
            this.a.b();
            return;
        }
        wbe wbeVar2 = this.a;
        bvrj.UI_THREAD.c();
        wbh wbhVar = wbeVar2.f;
        if (wbhVar == null) {
            return;
        }
        RoutePreviewLauncherParameters a = wbhVar.a();
        dbsk.l(a.d == 2);
        wbhVar.b(new RoutePreviewLauncherParameters(a.a, a.b, 3, n));
        wbeVar2.c();
    }
}
