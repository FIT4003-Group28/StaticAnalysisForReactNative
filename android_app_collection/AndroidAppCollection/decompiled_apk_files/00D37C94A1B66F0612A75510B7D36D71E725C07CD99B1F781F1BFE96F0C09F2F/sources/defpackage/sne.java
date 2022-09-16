package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: sne  reason: default package */
/* loaded from: classes4.dex */
public final class sne {
    public static final boolean a;

    static {
        boolean z;
        try {
            SystemClock.elapsedRealtimeNanos();
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        a = z;
    }
}
