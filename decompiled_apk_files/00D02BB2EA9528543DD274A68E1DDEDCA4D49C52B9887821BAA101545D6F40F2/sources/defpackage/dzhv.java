package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzhv  reason: default package */
/* loaded from: classes.dex */
public abstract class dzhv<V> implements Serializable, dziw {
    private static final long serialVersionUID = -4940583368468432370L;

    @Override // defpackage.dziw
    public V a(int i, V v) {
        throw null;
    }

    @Override // defpackage.dziw
    public V b(int i) {
        throw null;
    }

    @Deprecated
    /* renamed from: c */
    public final V put(Integer num, V v) {
        int intValue = num.intValue();
        boolean d = d(intValue);
        V a = a(intValue, v);
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
        return d(((Integer) obj).intValue());
    }

    @Deprecated
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int intValue = ((Integer) obj).intValue();
        if (!d(intValue)) {
            return null;
        }
        return i(intValue);
    }

    @Deprecated
    public final V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int intValue = ((Integer) obj).intValue();
        boolean d = d(intValue);
        V b = b(intValue);
        if (!d) {
            return null;
        }
        return b;
    }
}
