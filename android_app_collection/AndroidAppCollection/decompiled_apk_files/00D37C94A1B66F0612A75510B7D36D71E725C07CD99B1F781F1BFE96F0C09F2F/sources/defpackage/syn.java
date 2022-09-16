package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: syn  reason: default package */
/* loaded from: classes4.dex */
final class syn implements tdp {
    final /* synthetic */ axmt a;
    final /* synthetic */ tfw b;
    final /* synthetic */ tdq c;
    final /* synthetic */ tcr d;
    final /* synthetic */ tda e;
    final /* synthetic */ syt f;

    public syn(syt sytVar, axmt axmtVar, tfw tfwVar, tdq tdqVar, tcr tcrVar, tda tdaVar) {
        this.f = sytVar;
        this.a = axmtVar;
        this.b = tfwVar;
        this.c = tdqVar;
        this.d = tcrVar;
        this.e = tdaVar;
    }

    @Override // defpackage.tdp
    public final /* synthetic */ void b(View view, View view2) {
        tfo.k(this, view);
    }

    @Override // defpackage.tdp
    public final void d(View view) {
        if (!syt.a.containsKey(this.a.b)) {
            syt.a.put(this.a.b, true);
            this.f.d(this.f.b.b(this.b.a(), syt.g(view, null, this.c, this.d, this.e)).Q(), this.e);
        }
    }
}
