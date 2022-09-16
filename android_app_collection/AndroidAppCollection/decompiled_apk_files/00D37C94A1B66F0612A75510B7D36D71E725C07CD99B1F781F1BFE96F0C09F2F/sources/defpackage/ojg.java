package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
import com.google.android.apps.youtube.app.offline.controller.OfflineSlimStatusBarConnectivityController;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ojg */
/* loaded from: classes3.dex */
public final class ojg {
    public final yni a;
    public final azqb b;
    public final yzv c;
    public final jvc d;
    public final azqb e;
    public final azqb f;
    public final azqb g;
    public final joh h;
    public final azqb i;
    public final azqb j;
    public final acth k;
    private final oa l;
    private ViewGroup m;
    private ViewGroup n;

    public ojg(oa oaVar, yni yniVar, azqb azqbVar, yzv yzvVar, jvc jvcVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, joh johVar, azqb azqbVar5, azqb azqbVar6, acth acthVar) {
        this.l = oaVar;
        this.a = yniVar;
        this.b = azqbVar;
        this.c = yzvVar;
        this.d = jvcVar;
        this.e = azqbVar2;
        this.f = azqbVar3;
        this.g = azqbVar4;
        this.h = johVar;
        this.i = azqbVar5;
        this.j = azqbVar6;
        this.k = acthVar;
        oaVar.getSavedStateRegistry().b("bundle_is_in_offline_mode", new bli() { // from class: ojf
            @Override // defpackage.bli
            public final Bundle a() {
                ojg ojgVar = ojg.this;
                Bundle bundle = new Bundle(1);
                bundle.putBoolean("is_in_offline_mode", ((sdb) ojgVar.b.get()).a);
                return bundle;
            }
        });
    }

    public static /* synthetic */ void b(Throwable th) {
        zep.d("Failed to complete deletion of pending delete video id on startup", th);
    }

    public final void a() {
        if (this.d instanceof OfflineSlimStatusBarConnectivityController) {
            this.m = (ViewGroup) this.l.findViewById(R.id.bottom_bar_container);
            ViewGroup viewGroup = (ViewGroup) this.l.findViewById(R.id.global_slim_status_bar_container);
            this.n = viewGroup;
            OfflineSlimStatusBarConnectivityController offlineSlimStatusBarConnectivityController = (OfflineSlimStatusBarConnectivityController) this.d;
            ViewGroup viewGroup2 = this.m;
            if (offlineSlimStatusBarConnectivityController.c != null || offlineSlimStatusBarConnectivityController.d != null) {
                offlineSlimStatusBarConnectivityController.e = null;
                offlineSlimStatusBarConnectivityController.f = null;
            }
            viewGroup2.getClass();
            offlineSlimStatusBarConnectivityController.c = viewGroup2;
            viewGroup.getClass();
            offlineSlimStatusBarConnectivityController.d = viewGroup;
            offlineSlimStatusBarConnectivityController.e = offlineSlimStatusBarConnectivityController.g(false);
            offlineSlimStatusBarConnectivityController.f = offlineSlimStatusBarConnectivityController.g(true);
            jfq jfqVar = offlineSlimStatusBarConnectivityController.b;
            SlimStatusBar slimStatusBar = offlineSlimStatusBarConnectivityController.e;
            slimStatusBar.getClass();
            SlimStatusBar slimStatusBar2 = offlineSlimStatusBarConnectivityController.f;
            boolean o = offlineSlimStatusBarConnectivityController.a.o();
            jfqVar.d = viewGroup2;
            jfqVar.g = slimStatusBar2;
            jfqVar.f = slimStatusBar;
            jfqVar.e = viewGroup;
            jfqVar.v = jfqVar.a(true);
            jfqVar.w = jfqVar.a(false);
            if (o) {
                jfqVar.h = 0;
            } else {
                jfqVar.h = 2;
            }
            jfqVar.k = jfqVar.d(jfqVar.d, jfqVar.f, false, false);
            jfqVar.j = jfqVar.d(jfqVar.d, jfqVar.f, true, false);
            jfqVar.l = jfqVar.g(jfqVar.d, jfqVar.f);
            jfqVar.m = jfqVar.f(false);
            jfqVar.o = jfqVar.d(jfqVar.e, jfqVar.g, false, false);
            jfqVar.n = jfqVar.d(jfqVar.e, jfqVar.g, true, false);
            jfqVar.p = jfqVar.g(jfqVar.e, jfqVar.g);
            jfqVar.q = jfqVar.f(true);
            jfqVar.r = jfqVar.d(jfqVar.d, jfqVar.f, true, true);
            jfqVar.s = jfqVar.d(jfqVar.e, jfqVar.g, true, true);
            jfqVar.t = jfqVar.e(false);
            jfqVar.u = jfqVar.e(true);
        }
    }
}
