package defpackage;
/* compiled from: PG */
/* renamed from: dzjk  reason: default package */
/* loaded from: classes6.dex */
final class dzjk extends dznw {
    final /* synthetic */ dzjs a;

    public dzjk(dzjs dzjsVar) {
        this.a = dzjsVar;
    }

    @Override // defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn iterator() {
        return new dzjr(this.a);
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
