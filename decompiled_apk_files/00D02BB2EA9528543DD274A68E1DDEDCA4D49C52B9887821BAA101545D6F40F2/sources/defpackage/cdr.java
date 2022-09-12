package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cdr  reason: default package */
/* loaded from: classes.dex */
public final class cdr {
    public static final boolean a;
    public static final boolean b;
    public static volatile int c;
    private static final File d;
    private static volatile cdr e;
    private final boolean f;
    private final int g;
    private final int h;
    private int i;
    private boolean j = true;
    private final AtomicBoolean k = new AtomicBoolean(false);

    static {
        boolean z = true;
        a = Build.VERSION.SDK_INT < 29;
        if (Build.VERSION.SDK_INT < 26) {
            z = false;
        }
        b = z;
        d = new File("/proc/self/fd");
        c = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0110, code lost:
        if (java.util.Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(android.os.Build.MODEL) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0113, code lost:
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cdr() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdr.<init>():void");
    }

    public static cdr a() {
        if (e == null) {
            synchronized (cdr.class) {
                if (e == null) {
                    e = new cdr();
                }
            }
        }
        return e;
    }

    private final synchronized boolean e() {
        boolean z = true;
        int i = this.i + 1;
        this.i = i;
        if (i >= 50) {
            this.i = 0;
            int length = d.list().length;
            long j = c != -1 ? c : this.g;
            if (length >= j) {
                z = false;
            }
            this.j = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                StringBuilder sb = new StringBuilder(135);
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(j);
                sb.toString();
            }
        }
        return this.j;
    }

    public final synchronized void b() {
        cjp.e();
        this.k.set(false);
    }

    public final synchronized void c() {
        cjp.e();
        this.k.set(true);
    }

    public final boolean d(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (z && this.f && b) {
            return (!a || this.k.get()) && !z2 && i >= (i3 = this.h) && i2 >= i3 && e();
        }
        return false;
    }
}
