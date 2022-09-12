package defpackage;

import android.os.Looper;
/* compiled from: PG */
/* renamed from: dbix  reason: default package */
/* loaded from: classes5.dex */
public final class dbix {
    public static final boolean a;
    private static final boolean b;

    static {
        boolean z;
        try {
            Class.forName("android.app.Activity");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        b = true;
    }

    public static void a() {
        if (a) {
            dbjb.b(Looper.getMainLooper().getThread() == Thread.currentThread(), "Must be called from the UI thread.");
        }
    }

    public static void b() {
        dbjb.b(c(), "Sceneform requires Android N or later");
    }

    public static boolean c() {
        return b;
    }
}
