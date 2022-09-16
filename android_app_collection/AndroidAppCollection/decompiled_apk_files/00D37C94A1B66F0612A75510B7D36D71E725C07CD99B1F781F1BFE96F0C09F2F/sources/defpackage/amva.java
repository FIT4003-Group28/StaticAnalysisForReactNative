package defpackage;
/* compiled from: PG */
/* renamed from: amva  reason: default package */
/* loaded from: classes.dex */
final class amva extends amub {
    private static final long serialVersionUID = 0;
    private final transient amvb a;

    public amva(amvb amvbVar) {
        this.a = amvbVar;
    }

    @Override // defpackage.amub
    public final int b(Object[] objArr, int i) {
        amzs it = this.a.b.values().iterator();
        while (it.hasNext()) {
            i = ((amub) it.next()).b(objArr, i);
        }
        return i;
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.t(obj);
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amzs iterator() {
        return new amuy(this.a);
    }

    @Override // defpackage.amub
    public final boolean l() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.c;
    }
}
