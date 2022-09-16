package defpackage;

import android.os.Process;
import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: babx  reason: default package */
/* loaded from: classes2.dex */
public final class babx {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final int d = Process.myTid();
    public final long e = SystemClock.elapsedRealtimeNanos();
    public final long f = SystemClock.currentThreadTimeMillis();

    public babx(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }
}
