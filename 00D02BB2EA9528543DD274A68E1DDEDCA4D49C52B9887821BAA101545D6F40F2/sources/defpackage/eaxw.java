package defpackage;
/* compiled from: PG */
/* renamed from: eaxw  reason: default package */
/* loaded from: classes6.dex */
public final class eaxw extends dsqp<eaxx, eaxw> implements dssk {
    public eaxw() {
        super(eaxx.k);
    }

    public final void a(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        eaxx eaxxVar = (eaxx) this.b;
        eaxx eaxxVar2 = eaxx.k;
        dsrj<String> dsrjVar = eaxxVar.g;
        if (!dsrjVar.a()) {
            eaxxVar.g = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, eaxxVar.g);
    }
}
