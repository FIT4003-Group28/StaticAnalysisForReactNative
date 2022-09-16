package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amre  reason: default package */
/* loaded from: classes.dex */
class amre extends amwy {
    final /* synthetic */ amro a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amre(amro amroVar, Map map) {
        super(map);
        this.a = amroVar;
    }

    @Override // defpackage.amwy, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        arey.m(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.d.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.d.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.keySet().hashCode();
    }

    @Override // defpackage.amwy, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new amrd(this, this.d.entrySet().iterator());
    }

    @Override // defpackage.amwy, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.a.b -= size;
            return size > 0;
        }
        return false;
    }
}
