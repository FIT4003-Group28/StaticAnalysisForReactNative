package defpackage;
/* compiled from: PG */
/* renamed from: dmbf  reason: default package */
/* loaded from: classes6.dex */
public final class dmbf extends dsqp<dmbg, dmbf> implements dssk {
    public dmbf() {
        super(dmbg.i);
    }

    public final void a(Iterable<? extends dmay> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmbg dmbgVar = (dmbg) this.b;
        dmbg dmbgVar2 = dmbg.i;
        dsrj<dmay> dsrjVar = dmbgVar.d;
        if (!dsrjVar.a()) {
            dmbgVar.d = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dmbgVar.d);
    }
}
