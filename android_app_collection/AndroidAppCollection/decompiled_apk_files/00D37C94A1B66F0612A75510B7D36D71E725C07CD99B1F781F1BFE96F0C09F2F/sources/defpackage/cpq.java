package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cpq  reason: default package */
/* loaded from: classes3.dex */
public final class cpq {
    public static final boolean a;
    public static final boolean b;
    public static volatile int c;
    private static final File e;
    private static volatile cpq f;
    private final boolean g;
    private final int h;
    private final int i;
    private int j;
    private boolean k = true;
    public final AtomicBoolean d = new AtomicBoolean(false);

    static {
        boolean z = true;
        a = Build.VERSION.SDK_INT < 29;
        if (Build.VERSION.SDK_INT < 26) {
            z = false;
        }
        b = z;
        e = new File("/proc/self/fd");
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
    public cpq() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpq.<init>():void");
    }

    public static cpq a() {
        if (f == null) {
            synchronized (cpq.class) {
                if (f == null) {
                    f = new cpq();
                }
            }
        }
        return f;
    }

    private final synchronized boolean d() {
        boolean z = true;
        int i = this.j + 1;
        this.j = i;
        if (i >= 50) {
            this.j = 0;
            int length = e.list().length;
            long j = c != -1 ? c : this.h;
            if (length >= j) {
                z = false;
            }
            this.k = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                StringBuilder sb = new StringBuilder(135);
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(j);
                Log.w("Downsampler", sb.toString());
            }
        }
        return this.k;
    }

    public final void b() {
        cvd.i();
        this.d.set(true);
    }

    public final boolean c(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (z && this.g && b) {
            return (!a || this.d.get()) && !z2 && i >= (i3 = this.i) && i2 >= i3 && d();
        }
        return false;
    }
}
