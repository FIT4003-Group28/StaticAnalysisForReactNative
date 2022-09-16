package defpackage;
/* compiled from: PG */
/* renamed from: dnbf  reason: default package */
/* loaded from: classes6.dex */
public final class dnbf extends dsqp<dnbi, dnbf> implements dssk {
    public dnbf() {
        super(dnbi.h);
    }

    public final void a(Iterable<? extends Integer> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dnbi dnbiVar = (dnbi) this.b;
        dnbi dnbiVar2 = dnbi.h;
        dsrf dsrfVar = dnbiVar.e;
        if (!dsrfVar.a()) {
            dnbiVar.e = dsqw.cg(dsrfVar);
        }
        dsod.bv(iterable, dnbiVar.e);
    }
}
