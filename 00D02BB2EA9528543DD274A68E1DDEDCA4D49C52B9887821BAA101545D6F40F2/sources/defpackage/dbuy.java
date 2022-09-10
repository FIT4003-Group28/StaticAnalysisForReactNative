package defpackage;

import java.util.AbstractSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbuy  reason: default package */
/* loaded from: classes5.dex */
public abstract class dbuy<T> extends AbstractSet<T> {
    final /* synthetic */ dbwu a;

    public dbuy(dbwu dbwuVar) {
        this.a = dbwuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return dbwu.s(this).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <E> E[] toArray(E[] eArr) {
        return (E[]) dbwu.s(this).toArray(eArr);
    }
}
