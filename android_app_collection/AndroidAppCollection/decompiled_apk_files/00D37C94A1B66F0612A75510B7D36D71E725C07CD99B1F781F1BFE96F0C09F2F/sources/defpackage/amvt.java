package defpackage;
/* compiled from: PG */
/* renamed from: amvt  reason: default package */
/* loaded from: classes.dex */
public abstract class amvt extends amvn {
    @Override // defpackage.amub
    public final int b(Object[] objArr, int i) {
        return g().b(objArr, i);
    }

    public abstract Object c(int i);

    @Override // defpackage.amvn
    public final amuk h() {
        return new amvs(this);
    }

    @Override // defpackage.amvn, defpackage.amub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public amzs iterator() {
        return g().listIterator();
    }
}
