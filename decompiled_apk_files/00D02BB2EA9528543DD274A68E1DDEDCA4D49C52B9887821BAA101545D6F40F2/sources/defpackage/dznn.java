package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dznn  reason: default package */
/* loaded from: classes.dex */
public abstract class dznn<K> implements Serializable, dzpf {
    private static final long serialVersionUID = -4940583368468432370L;

    public int a(K k, int i) {
        throw null;
    }

    public int b(Object obj) {
        throw null;
    }

    @Deprecated
    /* renamed from: c */
    public final Integer put(K k, Integer num) {
        boolean containsKey = containsKey(k);
        int a = a(k, num.intValue());
        if (containsKey) {
            return Integer.valueOf(a);
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
            return Integer.valueOf(g(obj));
        }
        return null;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        boolean containsKey = containsKey(obj);
        int b = b(obj);
        if (containsKey) {
            return Integer.valueOf(b);
        }
        return null;
    }
}
