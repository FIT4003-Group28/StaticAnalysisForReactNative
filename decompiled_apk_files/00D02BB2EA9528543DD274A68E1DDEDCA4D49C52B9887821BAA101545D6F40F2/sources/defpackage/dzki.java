package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzki  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzki implements Serializable, dzlc {
    private static final long serialVersionUID = -4940583368468432370L;

    @Override // defpackage.dzlc
    public double a(long j, double d) {
        throw new UnsupportedOperationException();
    }

    public double b(long j) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: c */
    public final Double put(Long l, Double d) {
        long longValue = l.longValue();
        boolean e = e(longValue);
        double a = a(longValue, d.doubleValue());
        if (e) {
            return Double.valueOf(a);
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
        return e(((Long) obj).longValue());
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        long longValue = ((Long) obj).longValue();
        if (!e(longValue)) {
            return null;
        }
        return Double.valueOf(i(longValue));
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        long longValue = ((Long) obj).longValue();
        boolean e = e(longValue);
        double b = b(longValue);
        if (!e) {
            return null;
        }
        return Double.valueOf(b);
    }
}
