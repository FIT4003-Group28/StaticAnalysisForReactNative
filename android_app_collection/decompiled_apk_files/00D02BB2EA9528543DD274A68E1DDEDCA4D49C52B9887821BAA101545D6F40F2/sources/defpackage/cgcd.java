package defpackage;
/* compiled from: PG */
/* renamed from: cgcd  reason: default package */
/* loaded from: classes4.dex */
public final class cgcd extends dsqp<cgcg, cgcd> implements dssk {
    public cgcd() {
        super(cgcg.e);
    }

    public final void a(Iterable<? extends cgcf> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        cgcg cgcgVar = (cgcg) this.b;
        cgcg cgcgVar2 = cgcg.e;
        dsrj<cgcf> dsrjVar = cgcgVar.d;
        if (!dsrjVar.a()) {
            cgcgVar.d = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, cgcgVar.d);
    }
}
