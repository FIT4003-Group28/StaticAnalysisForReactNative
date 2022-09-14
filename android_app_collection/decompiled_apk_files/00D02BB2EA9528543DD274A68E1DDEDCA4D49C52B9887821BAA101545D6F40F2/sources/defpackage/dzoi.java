package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dzoi  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzoi<K> extends dzoh<K> implements Cloneable, dzsh {
    @Override // defpackage.dzoh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract dzrn<K> iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() == size()) {
            return containsAll(set);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int size = size();
        dzrn<K> it = iterator();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (size != 0) {
                i += System.identityHashCode(it.next());
                size = i2;
            } else {
                return i;
            }
        }
    }
}
