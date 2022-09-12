package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: dzhe  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzhe extends dzhb implements Cloneable, Set, dzhi {
    @Override // defpackage.dzhb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract dzhl iterator();

    @Override // defpackage.dzhb
    @Deprecated
    public final boolean d(double d) {
        return e(d);
    }

    public boolean e(double d) {
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
        dzhl it = iterator();
        int i = 0;
        while (true) {
            int i2 = size - 1;
            if (size != 0) {
                i += dzgv.c(it.b());
                size = i2;
            } else {
                return i;
            }
        }
    }
}
