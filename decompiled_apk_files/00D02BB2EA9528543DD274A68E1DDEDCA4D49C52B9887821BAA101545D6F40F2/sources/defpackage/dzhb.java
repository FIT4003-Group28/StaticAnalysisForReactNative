package defpackage;

import java.util.AbstractCollection;
/* compiled from: PG */
/* renamed from: dzhb  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzhb extends AbstractCollection<Double> implements dzhi {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: a */
    public abstract dzhl iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean add(Double d) {
        return b(d.doubleValue());
    }

    public boolean b(double d) {
        throw new UnsupportedOperationException();
    }

    public boolean c(double d) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.dzhi
    @Deprecated
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        return c(((Double) obj).doubleValue());
    }

    public boolean d(double d) {
        dzhl it = iterator();
        while (it.hasNext()) {
            if (d == it.b()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        return d(((Double) obj).doubleValue());
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        dzhl it = iterator();
        int size = size();
        sb.append("{");
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(String.valueOf(it.b()));
                z = false;
                size = i;
            } else {
                sb.append("}");
                return sb.toString();
            }
        }
    }
}
