package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahd  reason: default package */
/* loaded from: classes.dex */
public final class ahd extends ahg {
    public static final Executor b = new ahc();
    private static volatile ahd c;
    public final ahg a;
    private final ahg d;

    private ahd() {
        ahf ahfVar = new ahf();
        this.d = ahfVar;
        this.a = ahfVar;
    }

    public static ahd a() {
        if (c != null) {
            return c;
        }
        synchronized (ahd.class) {
            if (c == null) {
                c = new ahd();
            }
        }
        return c;
    }

    public final boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
