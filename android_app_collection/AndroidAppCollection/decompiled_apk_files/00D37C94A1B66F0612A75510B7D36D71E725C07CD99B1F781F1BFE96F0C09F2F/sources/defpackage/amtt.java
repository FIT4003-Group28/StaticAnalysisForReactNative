package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: amtt  reason: default package */
/* loaded from: classes.dex */
abstract class amtt extends AbstractSet {
    final amtu b;

    public amtt(amtu amtuVar) {
        this.b = amtuVar;
    }

    public abstract Object a(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new amts(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.c;
    }
}
