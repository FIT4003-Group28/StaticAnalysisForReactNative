package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dznj  reason: default package */
/* loaded from: classes6.dex */
public abstract class dznj<K> implements Serializable, dzoj {
    private static final long serialVersionUID = -4940583368468432370L;

    public boolean a(K k, boolean z) {
        throw null;
    }

    public boolean b(Object obj) {
        throw null;
    }

    @Deprecated
    /* renamed from: c */
    public final Boolean put(K k, Boolean bool) {
        boolean containsKey = containsKey(k);
        boolean a = a(k, bool.booleanValue());
        if (containsKey) {
            return Boolean.valueOf(a);
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
            return Boolean.valueOf(g(obj));
        }
        return null;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        boolean containsKey = containsKey(obj);
        boolean b = b(obj);
        if (containsKey) {
            return Boolean.valueOf(b);
        }
        return null;
    }
}
