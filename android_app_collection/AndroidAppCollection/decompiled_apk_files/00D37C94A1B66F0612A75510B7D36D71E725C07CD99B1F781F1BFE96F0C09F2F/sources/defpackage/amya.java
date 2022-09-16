package defpackage;
/* compiled from: PG */
/* renamed from: amya  reason: default package */
/* loaded from: classes.dex */
final class amya extends amvn {
    private final transient amup a;
    private final transient amuk b;

    public amya(amup amupVar, amuk amukVar) {
        this.a = amupVar;
        this.b = amukVar;
    }

    @Override // defpackage.amub
    public final int b(Object[] objArr, int i) {
        return this.b.b(objArr, i);
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // defpackage.amvn, defpackage.amub
    public final amuk g() {
        return this.b;
    }

    @Override // defpackage.amvn, defpackage.amub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amzs iterator() {
        return this.b.listIterator();
    }

    @Override // defpackage.amub
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
