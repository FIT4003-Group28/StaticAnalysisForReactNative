package defpackage;

import android.content.Intent;
import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: cvix  reason: default package */
/* loaded from: classes5.dex */
public abstract class cvix {
    public static cvix c(long j) {
        dbsk.a(true);
        cvis h = h();
        h.a = Long.valueOf(j);
        h.b(SystemClock.uptimeMillis());
        return h.a();
    }

    public static cvix d() {
        cvis h = h();
        h.a = null;
        h.b(SystemClock.uptimeMillis());
        return h.a();
    }

    public static cvix e(Intent intent) {
        dbsk.a(intent != null);
        return c((intent.getFlags() & 268435456) > 0 ? 8500L : 58500L);
    }

    public static cvis h() {
        return new cvis();
    }

    @dzsi
    public abstract Long a();

    public abstract long b();

    public final boolean f() {
        return a() == null;
    }

    public final long g() {
        Long a = a();
        dbsk.s(a);
        return Math.max(0L, a.longValue() - (SystemClock.uptimeMillis() - b()));
    }
}
