package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: csdw  reason: default package */
/* loaded from: classes5.dex */
public final class csdw {
    public final Object a = new Object();
    public final Map<Integer, Long> b = new HashMap();

    public final void a(int i) {
        synchronized (this.a) {
            this.b.put(Integer.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }
}
