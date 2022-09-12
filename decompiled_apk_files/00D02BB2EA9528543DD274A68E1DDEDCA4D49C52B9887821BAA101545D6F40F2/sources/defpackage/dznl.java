package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dznl  reason: default package */
/* loaded from: classes.dex */
public abstract class dznl<K> implements Serializable, dzou {
    private static final long serialVersionUID = -4940583368468432370L;

    public float a(K k, float f) {
        throw null;
    }

    public float b(Object obj) {
        throw null;
    }

    @Deprecated
    /* renamed from: c */
    public final Float put(K k, Float f) {
        boolean containsKey = containsKey(k);
        float a = a(k, f.floatValue());
        if (containsKey) {
            return Float.valueOf(a);
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
            return Float.valueOf(g(obj));
        }
        return null;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        boolean containsKey = containsKey(obj);
        float b = b(obj);
        if (containsKey) {
            return Float.valueOf(b);
        }
        return null;
    }
}
