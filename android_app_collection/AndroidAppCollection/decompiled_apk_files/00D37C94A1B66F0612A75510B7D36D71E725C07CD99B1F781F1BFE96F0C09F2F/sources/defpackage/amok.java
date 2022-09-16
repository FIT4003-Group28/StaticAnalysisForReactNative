package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: amok  reason: default package */
/* loaded from: classes.dex */
public final class amok {
    public static final amqu a;

    static {
        amqu amojVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            amojVar = new amoi();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            amojVar = new amoj();
        }
        a = amojVar;
    }
}
