package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer.MediaFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ote  reason: default package */
/* loaded from: classes4.dex */
public final class ote implements Handler.Callback {
    public final Handler a;
    public final HandlerThread b;
    public final AtomicInteger c;
    public long e;
    public volatile long f;
    public volatile long g;
    public volatile long h;
    private final Handler i;
    private final ouk j;
    private final List k;
    private final MediaFormat[][] l;
    private final int[] m;
    private final long n;
    private final long o;
    private ouo[] p;
    private ouo q;
    private otg r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private long x;
    public int d = 0;
    private int w = 0;

    public ote(Handler handler, boolean z, int[] iArr, int i, int i2) {
        this.i = handler;
        this.t = z;
        this.n = i * 1000;
        this.o = i2 * 1000;
        int length = iArr.length;
        this.m = Arrays.copyOf(iArr, length);
        this.v = 1;
        this.f = -1L;
        this.h = -1L;
        this.j = new ouk();
        this.c = new AtomicInteger();
        this.k = new ArrayList(length);
        this.l = new MediaFormat[length];
        pcv pcvVar = new pcv();
        this.b = pcvVar;
        pcvVar.start();
        this.a = new Handler(pcvVar.getLooper(), this);
    }

    private final void c(ouo ouoVar, int i, boolean z) {
        long j = this.g;
        boolean z2 = false;
        pce.d(ouoVar.h == 1);
        ouoVar.h = 2;
        ouoVar.pO(i, j, z);
        this.k.add(ouoVar);
        otg m = ouoVar.m();
        if (m != null) {
            if (this.r == null) {
                z2 = true;
            }
            pce.d(z2);
            this.r = m;
            this.q = ouoVar;
        }
    }

    private final void d(ouo ouoVar) {
        n(ouoVar);
        if (ouoVar.h == 2) {
            pce.d(true);
            ouoVar.h = 1;
            ouoVar.q();
            if (ouoVar != this.q) {
                return;
            }
            this.r = null;
            this.q = null;
        }
    }

    private final void e() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 0;
        boolean z = true;
        while (true) {
            ouo[] ouoVarArr = this.p;
            if (i >= ouoVarArr.length) {
                break;
            }
            ouo ouoVar = ouoVarArr[i];
            if (ouoVar.h == 0) {
                pce.d(ouoVar.h == 0);
                boolean j = ouoVar.j();
                ouoVar.h = j ? 1 : 0;
                if (!j) {
                    ouoVar.f();
                    z = false;
                }
            }
            i++;
        }
        if (z) {
            long j2 = 0;
            int i2 = 0;
            boolean z2 = true;
            boolean z3 = true;
            while (true) {
                ouo[] ouoVarArr2 = this.p;
                if (i2 >= ouoVarArr2.length) {
                    break;
                }
                ouo ouoVar2 = ouoVarArr2[i2];
                int pN = ouoVar2.pN();
                MediaFormat[] mediaFormatArr = new MediaFormat[pN];
                for (int i3 = 0; i3 < pN; i3++) {
                    mediaFormatArr[i3] = ouoVar2.d(i3);
                }
                this.l[i2] = mediaFormatArr;
                if (pN > 0) {
                    if (j2 != -1) {
                        long c = ouoVar2.c();
                        if (c == -1) {
                            j2 = -1;
                        } else if (c != -2) {
                            j2 = Math.max(j2, c);
                        }
                    }
                    int i4 = this.m[i2];
                    if (i4 >= 0 && i4 < pN) {
                        c(ouoVar2, i4, false);
                        z2 = z2 && ouoVar2.h();
                        z3 = z3 && m(ouoVar2);
                    }
                }
                i2++;
            }
            this.f = j2;
            int i5 = 5;
            if (!z2 || (j2 != -1 && j2 > this.g)) {
                i5 = true != z3 ? 3 : 4;
                this.v = i5;
            } else {
                this.v = 5;
            }
            this.i.obtainMessage(1, i5, 0, this.l).sendToTarget();
            if (this.t && this.v == 4) {
                i();
            }
            this.a.sendEmptyMessage(7);
            return;
        }
        g(2, elapsedRealtime, 10L);
    }

    private final void f() {
        this.a.removeMessages(7);
        this.a.removeMessages(2);
        this.u = false;
        this.j.c();
        if (this.p != null) {
            int i = 0;
            while (true) {
                ouo[] ouoVarArr = this.p;
                if (i < ouoVarArr.length) {
                    ouo ouoVar = ouoVarArr[i];
                    try {
                        d(ouoVar);
                    } catch (RuntimeException e) {
                        Log.e("ExoPlayerImplInternal", "Stop failed.", e);
                    } catch (osx e2) {
                        Log.e("ExoPlayerImplInternal", "Stop failed.", e2);
                    }
                    try {
                        int i2 = ouoVar.h;
                        pce.d((i2 == 2 || i2 == 3 || i2 == -1) ? false : true);
                        ouoVar.h = -1;
                        ouoVar.L();
                    } catch (RuntimeException e3) {
                        Log.e("ExoPlayerImplInternal", "Release failed.", e3);
                    } catch (osx e4) {
                        Log.e("ExoPlayerImplInternal", "Release failed.", e4);
                    }
                    i++;
                } else {
                    this.p = null;
                    this.r = null;
                    this.q = null;
                    this.k.clear();
                    return;
                }
            }
        }
    }

    private final void g(int i, long j, long j2) {
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.a.sendEmptyMessage(i);
        } else {
            this.a.sendEmptyMessageDelayed(i, elapsedRealtime);
        }
    }

    private final void h(int i) {
        if (this.v != i) {
            this.v = i;
            this.i.obtainMessage(2, i, 0).sendToTarget();
        }
    }

    private final void i() {
        this.u = false;
        ouk oukVar = this.j;
        if (!oukVar.a) {
            oukVar.a = true;
            oukVar.c = ouk.d(oukVar.b);
        }
        for (int i = 0; i < this.k.size(); i++) {
            ((ouo) this.k.get(i)).M();
        }
    }

    private final void j() {
        f();
        h(1);
    }

    private final void k() {
        this.j.c();
        for (int i = 0; i < this.k.size(); i++) {
            n((ouo) this.k.get(i));
        }
    }

    private final void l() {
        if (this.r == null || !this.k.contains(this.q) || this.q.h()) {
            this.g = this.j.a();
        } else {
            this.g = this.r.a();
            this.j.b(this.g);
        }
        this.x = SystemClock.elapsedRealtime() * 1000;
    }

    private final boolean m(ouo ouoVar) {
        if (ouoVar.h()) {
            return true;
        }
        if (!ouoVar.i()) {
            return false;
        }
        if (this.v == 4) {
            return true;
        }
        long c = ouoVar.c();
        long b = ouoVar.b();
        long j = this.u ? this.o : this.n;
        if (j <= 0 || b == -1 || b == -3 || b >= this.g + j) {
            return true;
        }
        return (c == -1 || c == -2 || b < c) ? false : true;
    }

    private static final void n(ouo ouoVar) {
        if (ouoVar.h == 3) {
            pce.d(true);
            ouoVar.h = 2;
            ouoVar.w();
        }
    }

    public final synchronized void a(osy osyVar, int i, Object obj) {
        if (this.s) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("Sent message(");
            sb.append(i);
            sb.append(") after release. Message ignored.");
            Log.w("ExoPlayerImplInternal", sb.toString());
            return;
        }
        int i2 = this.d;
        this.d = i2 + 1;
        this.a.obtainMessage(9, i, 0, Pair.create(osyVar, obj)).sendToTarget();
        while (this.w <= i2) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized void b() {
        if (this.s) {
            return;
        }
        this.a.sendEmptyMessage(5);
        while (!this.s) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.b.quit();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d A[Catch: OutOfMemoryError | RuntimeException -> 0x028d, RuntimeException -> 0x028f, osx -> 0x02ab, TryCatch #9 {osx -> 0x02ab, blocks: (B:3:0x0006, B:4:0x000c, B:6:0x0010, B:11:0x002a, B:17:0x0037, B:19:0x0039, B:22:0x0043, B:25:0x0046, B:26:0x0047, B:29:0x0053, B:32:0x005b, B:36:0x0066, B:44:0x0076, B:50:0x0084, B:52:0x0088, B:53:0x0093, B:55:0x009d, B:57:0x00a1, B:64:0x00ad, B:66:0x00b2, B:67:0x00b5, B:69:0x00bb, B:71:0x00c9, B:73:0x00d1, B:74:0x00d7, B:76:0x00df, B:78:0x00f2, B:82:0x00fb, B:84:0x0101, B:105:0x0137, B:92:0x0110, B:104:0x0133, B:106:0x013f, B:108:0x0145, B:110:0x014b, B:112:0x0153, B:122:0x017c, B:124:0x0186, B:128:0x018f, B:126:0x018a, B:130:0x019b, B:132:0x01a3, B:113:0x015b, B:116:0x0162, B:118:0x0169, B:121:0x0171, B:134:0x01af, B:138:0x01c0, B:139:0x01c2, B:149:0x0206, B:150:0x0209, B:153:0x020e, B:154:0x0213, B:155:0x0214, B:164:0x0225, B:167:0x0229, B:169:0x022e, B:182:0x0259, B:185:0x0266, B:186:0x0270, B:187:0x0271, B:189:0x0276), top: B:214:0x0006 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r21) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ote.handleMessage(android.os.Message):boolean");
    }
}
