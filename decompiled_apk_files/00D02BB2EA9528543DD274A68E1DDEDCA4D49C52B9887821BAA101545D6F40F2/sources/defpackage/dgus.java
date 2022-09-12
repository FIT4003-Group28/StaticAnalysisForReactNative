package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dgus  reason: default package */
/* loaded from: classes6.dex */
final class dgus extends AbstractSet {
    final /* synthetic */ dguv a;

    public dgus(dguv dguvVar) {
        this.a = dguvVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new dgur(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return this.a.e(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c;
    }
}
