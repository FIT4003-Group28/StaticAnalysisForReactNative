package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: syo  reason: default package */
/* loaded from: classes4.dex */
final class syo implements tdp {
    final /* synthetic */ tfw a;
    final /* synthetic */ tdq b;
    final /* synthetic */ tcr c;
    final /* synthetic */ tda d;
    final /* synthetic */ syt e;

    public syo(syt sytVar, tfw tfwVar, tdq tdqVar, tcr tcrVar, tda tdaVar) {
        this.e = sytVar;
        this.a = tfwVar;
        this.b = tdqVar;
        this.c = tcrVar;
        this.d = tdaVar;
    }

    @Override // defpackage.tdp
    public final void b(View view, View view2) {
        this.e.d(this.e.b.b(this.a.a(), syt.f(view, view2, null, this.b, this.c, this.d)).Q(), this.d);
    }

    @Override // defpackage.tdp
    public final void d(View view) {
        b(view, null);
    }
}
