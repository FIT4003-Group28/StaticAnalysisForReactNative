package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcji  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcji<K, V> extends dcnj<Map.Entry<K, V>> {
    public abstract Map<K, V> a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object A = dcjz.A(a(), key);
            if (!dbsd.a(A, entry.getValue())) {
                return false;
            }
            return A != null || a().containsKey(key);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj)) {
            return a().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // defpackage.dcnj, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        try {
            dbsk.s(collection);
            return dcnm.v(this, collection);
        } catch (UnsupportedOperationException unused) {
            return dcnm.u(this, collection.iterator());
        }
    }

    @Override // defpackage.dcnj, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        try {
            dbsk.s(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet f = dcnm.f(collection.size());
            for (Object obj : collection) {
                if (contains(obj)) {
                    f.add(((Map.Entry) obj).getKey());
                }
            }
            return a().keySet().retainAll(f);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }
}
