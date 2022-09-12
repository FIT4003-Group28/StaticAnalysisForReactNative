package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cqgx  reason: default package */
/* loaded from: classes5.dex */
public final class cqgx {
    private static final ThreadLocal<Context> a = new ThreadLocal<>();

    public static Context a() {
        return a.get();
    }

    public static void b(Context context) {
        a.set(context);
    }

    public static void c() {
        a.remove();
    }
}
