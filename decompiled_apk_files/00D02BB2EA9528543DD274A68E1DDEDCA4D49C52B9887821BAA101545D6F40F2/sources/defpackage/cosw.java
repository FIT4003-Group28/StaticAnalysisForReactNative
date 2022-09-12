package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cosw  reason: default package */
/* loaded from: classes5.dex */
public final class cosw {
    public static <T> T a(Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = (T) bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (!cls.isAssignableFrom(t2.getClass())) {
            throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), t2.getClass().getCanonicalName()));
        }
        return t2;
    }
}
