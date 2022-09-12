package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbxr  reason: default package */
/* loaded from: classes5.dex */
public class dbxr extends dcjt {
    final /* synthetic */ dbye a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbxr(dbye dbyeVar, Map map) {
        super(map);
        this.a = dbyeVar;
    }

    @Override // defpackage.dcjt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        dcgh.r(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
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

    @Override // defpackage.dcjt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new dbxq(this, this.d.entrySet().iterator());
    }

    @Override // defpackage.dcjt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            dbye.C(this.a, size);
            return size > 0;
        }
        return false;
    }
}
