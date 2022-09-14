package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzkl  reason: default package */
/* loaded from: classes.dex */
public abstract class dzkl implements Serializable, dzli {
    private static final long serialVersionUID = -4940583368468432370L;
    public int a;

    @Override // defpackage.dzli
    public int a(long j, int i) {
        throw null;
    }

    public int b(long j) {
        throw null;
    }

    @Deprecated
    /* renamed from: c */
    public final Integer get(Object obj) {
        if (obj == null) {
            return null;
        }
        long longValue = ((Long) obj).longValue();
        if (!f(longValue)) {
            return null;
        }
        return Integer.valueOf(i(longValue));
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
        return f(((Long) obj).longValue());
    }

    @Deprecated
    /* renamed from: d */
    public final Integer put(Long l, Integer num) {
        long longValue = l.longValue();
        boolean f = f(longValue);
        int a = a(longValue, num.intValue());
        if (f) {
            return Integer.valueOf(a);
        }
        return null;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        long longValue = ((Long) obj).longValue();
        boolean f = f(longValue);
        int b = b(longValue);
        if (!f) {
            return null;
        }
        return Integer.valueOf(b);
    }
}
