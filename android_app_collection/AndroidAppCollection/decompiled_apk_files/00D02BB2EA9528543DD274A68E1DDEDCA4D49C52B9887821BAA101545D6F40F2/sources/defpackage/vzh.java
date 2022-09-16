package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.directions.routepreview.routefetching.RoutePreviewLauncherParameters;
/* compiled from: PG */
/* renamed from: vzh  reason: default package */
/* loaded from: classes7.dex */
public final class vzh implements vzi {
    private final gga a;

    public vzh(gga ggaVar) {
        this.a = ggaVar;
    }

    @Override // defpackage.vzi
    public final void a(bwqv bwqvVar, amte amteVar, int i, int i2) {
        gga ggaVar = this.a;
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "storageItem", amteVar);
        bundle.putInt("tripIndex", i);
        bundle.putInt("currentStepIndex", i2);
        vzp vzpVar = new vzp();
        vzpVar.B(bundle);
        ggaVar.D(vzpVar);
    }

    @Override // defpackage.vzi
    public final void b(vun vunVar) {
        gga ggaVar = this.a;
        bvrj.UI_THREAD.c();
        wbi wbiVar = new wbi();
        RoutePreviewLauncherParameters routePreviewLauncherParameters = new RoutePreviewLauncherParameters(vunVar, true, 1, null);
        Bundle bundle = new Bundle();
        bundle.putParcelable(wbi.a, routePreviewLauncherParameters);
        wbiVar.B(bundle);
        ggaVar.D(wbiVar);
    }
}
