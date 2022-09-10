package defpackage;
/* compiled from: PG */
/* renamed from: dzqe  reason: default package */
/* loaded from: classes6.dex */
final class dzqe extends dznw {
    final /* synthetic */ dzqn a;

    public dzqe(dzqn dzqnVar) {
        this.a = dzqnVar;
    }

    @Override // defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn iterator() {
        return new dzqm(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.k;
    }
}
