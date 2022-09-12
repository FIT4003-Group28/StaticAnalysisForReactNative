package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzht  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzht implements Serializable, dzii {
    private static final long serialVersionUID = -4940583368468432370L;
    public int a;

    public int a(int i, int i2) {
        throw null;
    }

    public int b(int i) {
        throw null;
    }

    @Deprecated
    /* renamed from: c */
    public final Integer put(Integer num, Integer num2) {
        int intValue = num.intValue();
        boolean e = e(intValue);
        int a = a(intValue, num2.intValue());
        if (e) {
            return Integer.valueOf(a);
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
        return e(((Integer) obj).intValue());
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int intValue = ((Integer) obj).intValue();
        if (!e(intValue)) {
            return null;
        }
        return Integer.valueOf(h(intValue));
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int intValue = ((Integer) obj).intValue();
        boolean e = e(intValue);
        int b = b(intValue);
        if (!e) {
            return null;
        }
        return Integer.valueOf(b);
    }
}
