package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzkn  reason: default package */
/* loaded from: classes.dex */
public abstract class dzkn<V> implements Serializable, dzlt {
    private static final long serialVersionUID = -4940583368468432370L;

    @Override // defpackage.dzlt
    public V a(long j, V v) {
        throw null;
    }

    @Override // defpackage.dzlt
    public V b(long j) {
        throw null;
    }

    @Deprecated
    /* renamed from: c */
    public final V put(Long l, V v) {
        long longValue = l.longValue();
        boolean d = d(longValue);
        V a = a(longValue, v);
        if (d) {
            return a;
        }
        return null;
    }

    @Override // defpackage.dzgu
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzgu
    @Deprecated
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return d(((Long) obj).longValue());
    }

    @Deprecated
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        long longValue = ((Long) obj).longValue();
        if (!d(longValue)) {
            return null;
        }
        return i(longValue);
    }

    @Deprecated
    public final V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        long longValue = ((Long) obj).longValue();
        boolean d = d(longValue);
        V b = b(longValue);
        if (!d) {
            return null;
        }
        return b;
    }
}
