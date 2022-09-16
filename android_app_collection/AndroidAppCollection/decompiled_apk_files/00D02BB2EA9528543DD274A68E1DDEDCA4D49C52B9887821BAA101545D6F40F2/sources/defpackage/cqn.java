package defpackage;
/* compiled from: PG */
/* renamed from: cqn  reason: default package */
/* loaded from: classes5.dex */
public final class cqn<T> extends btrh<T> {
    public cqn(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        cqj cqjVar = (cqj) this.a;
        bxev bxevVar = (bxev) obj;
        if (!bxevVar.b.equals(cqjVar.a.f)) {
            return;
        }
        cql cqlVar = cqjVar.a;
        cqlVar.f = null;
        cqlVar.a.c(bxevVar.c);
    }
}
