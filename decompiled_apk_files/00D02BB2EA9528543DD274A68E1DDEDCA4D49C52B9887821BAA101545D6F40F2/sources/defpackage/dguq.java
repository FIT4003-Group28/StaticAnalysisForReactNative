package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dguq  reason: default package */
/* loaded from: classes6.dex */
final class dguq extends AbstractSet<Map.Entry> {
    final /* synthetic */ dguv a;

    public dguq(dguv dguvVar) {
        this.a = dguvVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.a.c((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new dgup(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        dguu c;
        if ((obj instanceof Map.Entry) && (c = this.a.c((Map.Entry) obj)) != null) {
            this.a.d(c, true);
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c;
    }
}
