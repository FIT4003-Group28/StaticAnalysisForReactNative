package defpackage;
/* compiled from: PG */
/* renamed from: dzmh  reason: default package */
/* loaded from: classes.dex */
final class dzmh extends dznw {
    final /* synthetic */ dzmp a;

    public dzmh(dzmp dzmpVar) {
        this.a = dzmpVar;
    }

    @Override // defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn iterator() {
        return new dzmo(this.a);
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
        return this.a.g;
    }
}
