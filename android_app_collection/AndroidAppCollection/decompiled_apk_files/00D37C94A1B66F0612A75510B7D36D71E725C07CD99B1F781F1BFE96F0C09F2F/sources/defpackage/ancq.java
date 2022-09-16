package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: ancq  reason: default package */
/* loaded from: classes.dex */
public final class ancq extends ancg {
    public static final AtomicReference a = new AtomicReference();
    private static final AtomicLong b = new AtomicLong();
    private static final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile anbf d;

    public ancq(String str) {
        super(str);
        boolean z = false;
        boolean z2 = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        boolean z3 = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        z = ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) ? true : z;
        if (z2 || z3) {
            this.d = new anch().a(a());
        } else if (!z) {
            this.d = null;
        } else {
            new ancs();
            this.d = new ancs(Level.OFF).a(a());
        }
    }

    public static void e() {
        while (true) {
            ancq ancqVar = (ancq) anco.a.poll();
            if (ancqVar != null) {
                ancqVar.d = ((anci) a.get()).a(ancqVar.a());
            } else {
                f();
                return;
            }
        }
    }

    private static void f() {
        while (true) {
            ancp ancpVar = (ancp) c.poll();
            if (ancpVar != null) {
                b.getAndDecrement();
                anbf anbfVar = ancpVar.a;
                anbe anbeVar = ancpVar.b;
                if (anbeVar.x() || anbfVar.d(anbeVar.m())) {
                    anbfVar.c(anbeVar);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ancg, defpackage.anbf
    public final void b(RuntimeException runtimeException, anbe anbeVar) {
        if (this.d != null) {
            this.d.b(runtimeException, anbeVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.anbf
    public final void c(anbe anbeVar) {
        if (this.d != null) {
            this.d.c(anbeVar);
            return;
        }
        if (b.incrementAndGet() > 20) {
            c.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        c.offer(new ancp(this, anbeVar));
        if (this.d == null) {
            return;
        }
        f();
    }

    @Override // defpackage.anbf
    public final boolean d(Level level) {
        if (this.d != null) {
            return this.d.d(level);
        }
        return true;
    }
}
