package defpackage;
/* compiled from: PG */
/* renamed from: cgcl  reason: default package */
/* loaded from: classes4.dex */
public final class cgcl extends dsqp<cgcr, cgcl> implements dssk {
    public cgcl() {
        super(cgcr.b);
    }

    public final void a(Iterable<? extends cgcq> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        cgcr cgcrVar = (cgcr) this.b;
        cgcr cgcrVar2 = cgcr.b;
        cgcrVar.b();
        dsod.bv(iterable, cgcrVar.a);
    }

    public final void b(cgcm cgcmVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        cgcr cgcrVar = (cgcr) this.b;
        cgcq bK = cgcmVar.bK();
        cgcr cgcrVar2 = cgcr.b;
        bK.getClass();
        cgcrVar.b();
        cgcrVar.a.add(bK);
    }
}
