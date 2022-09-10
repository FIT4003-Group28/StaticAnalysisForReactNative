package defpackage;
/* compiled from: PG */
/* renamed from: dmbp  reason: default package */
/* loaded from: classes6.dex */
public final class dmbp extends dsqp<dmbq, dmbp> implements dssk {
    public dmbp() {
        super(dmbq.f);
    }

    public final void a(dmau dmauVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmbq dmbqVar = (dmbq) this.b;
        dmbq dmbqVar2 = dmbq.f;
        dmauVar.getClass();
        dmau dmauVar2 = dmbqVar.c;
        if (dmauVar2 != null && dmauVar2 != dmau.f) {
            dmat ca = dmau.f.ca(dmbqVar.c);
            ca.bC(dmauVar);
            dmauVar = ca.bJ();
        }
        dmbqVar.c = dmauVar;
        dmbqVar.a |= 2;
    }
}
