package com.facebook.common.time;

import android.os.SystemClock;
import c.d.d.d.d;
@d
/* loaded from: classes.dex */
public class RealtimeSinceBootClock implements b {

    /* renamed from: a  reason: collision with root package name */
    private static final RealtimeSinceBootClock f5183a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @d
    public static RealtimeSinceBootClock get() {
        return f5183a;
    }

    @Override // com.facebook.common.time.b
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
