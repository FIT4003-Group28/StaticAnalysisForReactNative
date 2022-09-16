package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dcne  reason: default package */
/* loaded from: classes5.dex */
public final class dcne extends dcnk {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public dcne(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.dcnk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dcpd iterator() {
        return new dcnd(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) && this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return this.a.containsAll(collection) && this.b.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.b, this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = 0;
        for (Object obj : this.a) {
            if (this.b.contains(obj)) {
                i++;
            }
        }
        return i;
    }
}
