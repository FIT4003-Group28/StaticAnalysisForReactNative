package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abvq  reason: default package */
/* loaded from: classes.dex */
public final class abvq implements Runnable {
    public final acbw a;
    public final acbt b;
    public final Handler c;
    public final ScheduledExecutorService d;
    public ScheduledFuture e;
    public int f;
    private final snc h;
    private final int i;
    private final int j;
    public int g = Integer.MAX_VALUE;
    private long l = -1;
    private long m = -1;
    private final ArrayDeque k = new ArrayDeque();

    public abvq(acbw acbwVar, acbt acbtVar, Handler handler, ScheduledExecutorService scheduledExecutorService, snc sncVar, int i, int i2, int i3) {
        this.h = sncVar;
        this.a = acbwVar;
        this.b = acbtVar;
        this.c = handler;
        this.d = scheduledExecutorService;
        this.f = i;
        this.i = i2;
        this.j = i3;
    }

    public static int a(int i) {
        return ((i + 144000) * 4) / 8;
    }

    private final void b(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = abvr.a;
            if (i2 < 3) {
                if (this.f >= abvr.a[i2]) {
                    int i3 = abvr.b[i2];
                    int min = Math.min(Math.max(((this.f / i3) + i) * i3, this.i), this.j);
                    if (min == this.f) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("Video bitrate: ");
                    sb.append(min);
                    zep.g(sb.toString());
                    int a = a(min);
                    this.g = a;
                    StringBuilder sb2 = new StringBuilder(25);
                    sb2.append("Buffer limit: ");
                    sb2.append(a);
                    zep.g(sb2.toString());
                    this.f = min;
                    this.c.post(new abvp(this, i));
                    return;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int b = this.a.b();
        if (b < 0) {
            return;
        }
        boolean z = false;
        int intValue = this.k.size() == 3 ? ((Integer) this.k.remove()).intValue() : 0;
        this.k.add(Integer.valueOf(b));
        Iterator it = this.k.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (intValue2 >= intValue) {
                if (intValue2 != 0) {
                    i = intValue2;
                } else if (intValue != 0) {
                    i = 0;
                }
                if (i > intValue) {
                    i2++;
                }
                intValue = intValue2;
            }
            i2--;
            intValue = intValue2;
        }
        double d = b;
        double d2 = this.g;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        long d4 = this.h.d();
        if (i2 >= 3 || d3 >= 0.25d) {
            this.l = this.h.d();
            b(-1);
        } else if (i2 > 0 || d3 >= 0.15d) {
        } else {
            long j = this.l;
            boolean z2 = j < 0 || d4 - j > 16000;
            long j2 = this.m;
            if (j2 < 0 || d4 - j2 > 6000) {
                z = true;
            }
            if (j >= 0 && (!z2 || !z)) {
                return;
            }
            this.m = this.h.d();
            b(1);
        }
    }
}
