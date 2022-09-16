package defpackage;
/* compiled from: PG */
/* renamed from: miq  reason: default package */
/* loaded from: classes7.dex */
public final class miq<T> extends btrh<T> {
    public miq(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int indexOf;
        min minVar = (min) this.a;
        ncf ncfVar = minVar.a.q;
        amub amubVar = ((alco) obj).a;
        amte l = ncfVar.b.l();
        if (l != null && (indexOf = l.a(ncfVar.a).indexOf(amubVar)) >= 0) {
            ncfVar.n(indexOf);
        }
        mio mioVar = minVar.a;
        mioVar.m(mioVar.q.k(), false);
    }
}
