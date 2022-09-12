package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dzkx  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzkx extends dzkr implements Cloneable, dznf {
    @Override // defpackage.dzkr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract dzna iterator();

    @Override // defpackage.dzkr
    @Deprecated
    public final boolean d(long j) {
        return e(j);
    }

    public boolean e(long j) {
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
        dzna it = iterator();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (size != 0) {
                i += dzgv.d(it.b());
                size = i2;
            } else {
                return i;
            }
        }
    }
}
