package defpackage;
/* compiled from: PG */
/* renamed from: cclm  reason: default package */
/* loaded from: classes4.dex */
public final class cclm extends dsqp<ccln, cclm> implements dssk {
    public cclm() {
        super(ccln.p);
    }

    public final void a(Iterable<? extends dwfl> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        ccln cclnVar = (ccln) this.b;
        ccln cclnVar2 = ccln.p;
        cclnVar.b();
        dsod.bv(iterable, cclnVar.i);
    }
}
