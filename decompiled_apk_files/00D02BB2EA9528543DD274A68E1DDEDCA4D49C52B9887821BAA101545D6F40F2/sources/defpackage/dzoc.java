package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dzoc  reason: default package */
/* loaded from: classes.dex */
public abstract class dzoc<K> extends dznw<K> implements Cloneable, dzrv {
    @Override // defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
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
    public int hashCode() {
        int size = size();
        dzrn<K> it = iterator();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (size != 0) {
                K next = it.next();
                i += next == null ? 0 : next.hashCode();
                size = i2;
            } else {
                return i;
            }
        }
    }
}
