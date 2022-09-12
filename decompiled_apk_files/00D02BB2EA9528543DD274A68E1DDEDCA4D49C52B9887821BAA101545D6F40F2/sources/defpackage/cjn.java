package defpackage;

import android.text.TextUtils;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: cjn  reason: default package */
/* loaded from: classes.dex */
public final class cjn {
    public static void a(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static <T> T b(T t) {
        e(t, "Argument must not be null");
        return t;
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static <T extends Collection<Y>, Y> void d(T t) {
        if (!t.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public static <T> void e(T t, String str) {
        if (t != null) {
            return;
        }
        throw new NullPointerException(str);
    }
}
