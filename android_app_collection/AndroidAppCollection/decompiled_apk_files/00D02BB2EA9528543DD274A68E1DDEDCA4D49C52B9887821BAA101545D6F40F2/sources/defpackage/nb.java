package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: nb  reason: default package */
/* loaded from: classes.dex */
public final class nb {
    public static void a(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static <T> void b(T t) {
        t.getClass();
    }

    public static <T> void c(T t, Object obj) {
        if (t != null) {
            return;
        }
        throw new NullPointerException((String) obj);
    }

    public static <T extends CharSequence> void d(T t) {
        if (!TextUtils.isEmpty(t)) {
            return;
        }
        throw new IllegalArgumentException("id cannot be empty");
    }
}
