package defpackage;

import android.app.Activity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wgo  reason: default package */
/* loaded from: classes4.dex */
public final class wgo implements wfk {
    final /* synthetic */ Activity a;
    final /* synthetic */ apzg b;
    final /* synthetic */ wgp c;

    public wgo(wgp wgpVar, Activity activity, apzg apzgVar) {
        this.c = wgpVar;
        this.a = activity;
        this.b = apzgVar;
    }

    @Override // defpackage.wfk
    public final void a() {
        wgp wgpVar = this.c;
        Activity activity = this.a;
        apzg apzgVar = this.b;
        wgpVar.c = true;
        eo supportFragmentManager = ((dt) activity).getSupportFragmentManager();
        vwy vwyVar = (vwy) supportFragmentManager.f("fusion-sign-in-flow-fragment");
        ex l = supportFragmentManager.l();
        if (vwyVar == null) {
            l.r(vyy.aF(apzgVar), "fusion-sign-in-flow-fragment");
        } else {
            vwyVar.aE(apzgVar);
            if (!vwyVar.at()) {
                l.n(vwyVar);
            }
        }
        l.k();
    }

    @Override // defpackage.wfk
    public final void b(Exception exc) {
        this.c.b.d(new wgh(wgg.CANCELLED, true));
    }

    @Override // defpackage.wfk
    public final void c(aarw aarwVar) {
        if (!aarwVar.l() || aarwVar.p() || aarwVar.m()) {
            return;
        }
        this.c.a.i(aarwVar, null, afwa.g);
    }
}
