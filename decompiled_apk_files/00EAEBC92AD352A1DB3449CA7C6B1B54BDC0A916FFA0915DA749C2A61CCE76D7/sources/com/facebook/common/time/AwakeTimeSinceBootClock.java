package com.facebook.common.time;

import android.os.SystemClock;
import c.d.d.d.d;
@d
/* loaded from: classes.dex */
public class AwakeTimeSinceBootClock implements b {
    @d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // com.facebook.common.time.b
    @d
    public long now() {
        return SystemClock.uptimeMillis();
    }
}
