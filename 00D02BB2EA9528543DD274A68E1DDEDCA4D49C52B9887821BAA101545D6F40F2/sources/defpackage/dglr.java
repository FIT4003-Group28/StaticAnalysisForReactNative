package defpackage;
/* compiled from: PG */
/* renamed from: dglr  reason: default package */
/* loaded from: classes6.dex */
public final class dglr extends dsqp<dgls, dglr> implements dssk {
    public dglr() {
        super(dgls.e);
    }

    public final void a(Iterable<? extends dglo> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dgls dglsVar = (dgls) this.b;
        dgls dglsVar2 = dgls.e;
        dglsVar.b();
        dsod.bv(iterable, dglsVar.d);
    }
}
