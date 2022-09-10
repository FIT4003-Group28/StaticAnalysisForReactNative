package defpackage;
/* compiled from: PG */
/* renamed from: mbm  reason: default package */
/* loaded from: classes7.dex */
public final class mbm {
    final /* synthetic */ mbp a;

    public mbm(mbp mbpVar) {
        this.a = mbpVar;
    }

    public final void a(int i) {
        kdk kdkVar;
        mfd c = this.a.x.c(i);
        ldm c2 = c.c();
        if (c2.s()) {
            mbp mbpVar = this.a;
            mbpVar.D.a(c2, mbpVar.k, mbpVar.l);
            return;
        }
        boolean z = this.a.x.d() == 1;
        mbp mbpVar2 = this.a;
        aryr b = c.b();
        ldm c3 = c.c();
        ncf a = c.a();
        if (!this.a.j.l() || !z) {
            kdkVar = kdk.NOTHING;
        } else {
            kdkVar = kdk.NAVIGATE;
        }
        mbpVar2.l(b, c3, a, kdkVar, this.a.m, z);
    }
}
