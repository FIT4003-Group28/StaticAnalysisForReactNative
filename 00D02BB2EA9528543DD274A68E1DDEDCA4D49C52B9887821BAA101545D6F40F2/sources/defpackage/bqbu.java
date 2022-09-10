package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bqbu  reason: default package */
/* loaded from: classes4.dex */
final class bqbu implements bqar {
    final /* synthetic */ bqca a;

    public bqbu(bqca bqcaVar) {
        this.a = bqcaVar;
    }

    @Override // defpackage.bqar
    public final void a() {
        this.a.j.f();
        jmb jmbVar = this.a.l;
        if (jmbVar != null) {
            jmbVar.a();
            this.a.l = null;
        }
        bqca bqcaVar = this.a;
        if (!bqcaVar.b.l().L().c(jjn.HIDDEN) && bqcaVar.j.n().c()) {
            bqcaVar.b.B(jjn.COLLAPSED);
        }
        this.a.g();
    }

    @Override // defpackage.bqar
    public final void b() {
        this.a.j.g();
        this.a.g();
    }

    @Override // defpackage.bqar
    public final void c() {
        View b = this.a.d.b();
        if (b != null) {
            b.setVisibility(8);
        }
        this.a.b.B(jjn.HIDDEN);
        this.a.j.h();
        this.a.g();
        cqkx.p(this.a);
    }
}
