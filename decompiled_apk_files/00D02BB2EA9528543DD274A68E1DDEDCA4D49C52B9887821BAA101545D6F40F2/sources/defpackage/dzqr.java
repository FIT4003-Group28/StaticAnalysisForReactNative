package defpackage;
/* compiled from: PG */
/* renamed from: dzqr  reason: default package */
/* loaded from: classes.dex */
public final class dzqr extends dznw {
    final /* synthetic */ dzqz a;

    public dzqr(dzqz dzqzVar) {
        this.a = dzqzVar;
    }

    @Override // defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn iterator() {
        return new dzqy(this.a);
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
        return this.a.h;
    }
}
