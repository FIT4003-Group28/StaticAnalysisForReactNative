package defpackage;
/* compiled from: PG */
/* renamed from: ncc  reason: default package */
/* loaded from: classes7.dex */
public final class ncc<T> extends btrh<T> {
    public ncc(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        nca ncaVar = (nca) this.a;
        int i = ((alco) obj).a.c;
        if (ncaVar.a.g != null) {
            cjtd a = cjtd.a(dtxm.dA);
            cjqp cjqpVar = ncaVar.a.g;
            dbsk.s(cjqpVar);
            ncaVar.a.f.n(cjqpVar.d(a), new cjte(deaf.TAP), a);
        }
        if (ncaVar.a.m()) {
            ncaVar.a.h.b(i);
        } else {
            ncaVar.a.h.a(i);
        }
    }
}
