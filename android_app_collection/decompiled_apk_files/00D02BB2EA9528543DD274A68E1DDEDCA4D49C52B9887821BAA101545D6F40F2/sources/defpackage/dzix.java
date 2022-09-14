package defpackage;
/* compiled from: PG */
/* renamed from: dzix  reason: default package */
/* loaded from: classes.dex */
final class dzix extends dznw {
    final /* synthetic */ dzjg a;

    public dzix(dzjg dzjgVar) {
        this.a = dzjgVar;
    }

    @Override // defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn iterator() {
        return new dzjf(this.a);
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
        return this.a.j;
    }
}
