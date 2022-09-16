package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dzig  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzig extends dzia implements Cloneable, dzkg {
    @Override // defpackage.dzia, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract dzkd iterator();

    @Override // defpackage.dzia
    @Deprecated
    public final boolean d(int i) {
        return e(i);
    }

    public boolean e(int i) {
        throw null;
    }

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
        dzkd it = iterator();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (size != 0) {
                i += it.a();
                size = i2;
            } else {
                return i;
            }
        }
    }
}
