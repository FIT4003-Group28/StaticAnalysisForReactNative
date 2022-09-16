package com.facebook.common.time;

import android.os.SystemClock;
import com.facebook.common.d.d;
@d
/* loaded from: classes.dex */
public class RealtimeSinceBootClock {

    /* renamed from: a  reason: collision with root package name */
    private static final RealtimeSinceBootClock f2333a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @d
    public static RealtimeSinceBootClock get() {
        return f2333a;
    }

    public long a() {
        return SystemClock.elapsedRealtime();
    }
}
