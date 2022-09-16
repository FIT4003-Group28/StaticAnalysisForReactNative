package defpackage;
/* compiled from: PG */
/* renamed from: cgbq  reason: default package */
/* loaded from: classes4.dex */
public final class cgbq extends dsqp<cgbt, cgbq> implements dssk {
    public cgbq() {
        super(cgbt.b);
    }

    public final void a(Iterable<? extends cgbs> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        cgbt cgbtVar = (cgbt) this.b;
        cgbt cgbtVar2 = cgbt.b;
        dsrj<cgbs> dsrjVar = cgbtVar.a;
        if (!dsrjVar.a()) {
            cgbtVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, cgbtVar.a);
    }
}
