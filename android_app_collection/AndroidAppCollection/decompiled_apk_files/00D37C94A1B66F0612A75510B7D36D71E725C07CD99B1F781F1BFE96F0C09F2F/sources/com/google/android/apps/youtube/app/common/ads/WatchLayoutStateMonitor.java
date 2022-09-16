package com.google.android.apps.youtube.app.common.ads;

import android.content.Context;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchLayoutStateMonitor implements f {
    private final nzy a;
    private final nxd b;

    public WatchLayoutStateMonitor(final wlg wlgVar, final xgp xgpVar, final Context context, nzy nzyVar) {
        this.a = nzyVar;
        this.b = new nxd() { // from class: end
            @Override // defpackage.nxd
            public final void ph(nxe nxeVar) {
                wlg wlgVar2 = wlg.this;
                Context context2 = context;
                xgp xgpVar2 = xgpVar;
                wlgVar2.n(context2.getResources().getDisplayMetrics(), nxeVar.t(), nxeVar.v());
                xgpVar2.j(context2.getResources().getDisplayMetrics(), nxeVar.t(), nxeVar.v());
            }
        };
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.a.j(this.b);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.a.e(this.b);
    }
}
