package defpackage;
/* compiled from: PG */
/* renamed from: chww  reason: default package */
/* loaded from: classes4.dex */
public final class chww extends dsqp<chxh, chww> implements dssk {
    public chww() {
        super(chxh.b);
    }

    public final void a(Iterable<? extends chxg> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        chxh chxhVar = (chxh) this.b;
        chxh chxhVar2 = chxh.b;
        dsrj<chxg> dsrjVar = chxhVar.a;
        if (!dsrjVar.a()) {
            chxhVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, chxhVar.a);
    }
}
