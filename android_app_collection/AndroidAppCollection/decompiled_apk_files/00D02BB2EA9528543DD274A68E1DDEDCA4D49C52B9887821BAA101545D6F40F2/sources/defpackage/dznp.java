package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dznp  reason: default package */
/* loaded from: classes6.dex */
public abstract class dznp<K> implements Serializable, dzpq {
    private static final long serialVersionUID = -4940583368468432370L;

    public long a(K k, long j) {
        throw null;
    }

    public long b(Object obj) {
        throw null;
    }

    @Deprecated
    /* renamed from: c */
    public final Long put(K k, Long l) {
        boolean containsKey = containsKey(k);
        long a = a(k, l.longValue());
        if (containsKey) {
            return Long.valueOf(a);
        }
        return null;
    }

    @Override // defpackage.dzgu
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (containsKey(obj)) {
            return Long.valueOf(g(obj));
        }
        return null;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        boolean containsKey = containsKey(obj);
        long b = b(obj);
        if (containsKey) {
            return Long.valueOf(b);
        }
        return null;
    }
}
