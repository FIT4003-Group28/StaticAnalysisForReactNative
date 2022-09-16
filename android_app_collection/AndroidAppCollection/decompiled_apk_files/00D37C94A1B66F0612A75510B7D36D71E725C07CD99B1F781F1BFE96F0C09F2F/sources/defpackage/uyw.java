package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.Trace;
/* compiled from: PG */
/* renamed from: uyw  reason: default package */
/* loaded from: classes4.dex */
public final class uyw {
    public static final uyw a = new uyw();
    public volatile boolean b;
    public volatile long c;
    public volatile long d;
    public volatile long e;
    public volatile long f;
    public volatile long g;
    public volatile long h;
    public volatile long i;
    public volatile long j;
    public volatile long k;
    public volatile utb l;
    public final uyv m = new uyv();
    public final uyo n = new uyo();
    public final uyo o = new uyo();

    public static void a(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j - Process.getStartElapsedRealtime());
            Trace.setCounter(str, 0L);
        }
    }
}
