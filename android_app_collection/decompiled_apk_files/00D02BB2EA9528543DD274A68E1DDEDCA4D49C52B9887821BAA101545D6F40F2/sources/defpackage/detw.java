package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: detw  reason: default package */
/* loaded from: classes6.dex */
final class detw {
    private static final long a = TimeUnit.HOURS.toMillis(24);
    private static final long b = TimeUnit.MINUTES.toMillis(30);
    private final deti c = deti.getInstance();
    private long d;
    private int e;

    private final synchronized void c() {
        this.e = 0;
    }

    private final synchronized long d(int i) {
        if (i == 429 || (i >= 500 && i < 600)) {
            double pow = Math.pow(2.0d, this.e);
            double random = (long) (Math.random() * 1000.0d);
            Double.isNaN(random);
            return (long) Math.min(pow + random, b);
        }
        return a;
    }

    public final synchronized boolean b() {
        boolean z;
        if (this.e != 0) {
            if (this.c.c() <= this.d) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final synchronized void a(int i) {
        if ((i < 200 || i >= 300) && i != 401 && i != 404) {
            this.e++;
            this.d = this.c.c() + d(i);
            return;
        }
        c();
    }
}
