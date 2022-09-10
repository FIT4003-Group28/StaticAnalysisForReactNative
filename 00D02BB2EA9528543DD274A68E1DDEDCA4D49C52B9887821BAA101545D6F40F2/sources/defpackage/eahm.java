package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: eahm  reason: default package */
/* loaded from: classes6.dex */
public final class eahm implements Closeable {
    private static final Logger c = Logger.getLogger(eagn.class.getName());
    public int a;
    final eagl b;
    private final eaja d;
    private final eaiz e;
    private boolean f;

    public eahm(eaja eajaVar) {
        this.d = eajaVar;
        eaiz eaizVar = new eaiz();
        this.e = eaizVar;
        this.b = new eagl(eaizVar);
        this.a = 16384;
    }

    public final synchronized void a() {
        if (!this.f) {
            Logger logger = c;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(eafa.v(">> CONNECTION %s", eagn.a.e()));
            }
            this.d.J(eagn.a.i());
            this.d.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r3.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(defpackage.eahr r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L55
            int r0 = r3.a     // Catch: java.lang.Throwable -> L5d
            int r1 = r4.a     // Catch: java.lang.Throwable -> L5d
            r1 = r1 & 32
            if (r1 == 0) goto L12
            int[] r0 = r4.b     // Catch: java.lang.Throwable -> L5d
            r1 = 5
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L5d
        L12:
            r3.a = r0     // Catch: java.lang.Throwable -> L5d
            int r0 = r4.c()     // Catch: java.lang.Throwable -> L5d
            r1 = -1
            r2 = 1
            if (r0 == r1) goto L49
            eagl r0 = r3.b     // Catch: java.lang.Throwable -> L5d
            int r4 = r4.c()     // Catch: java.lang.Throwable -> L5d
            r1 = 16384(0x4000, float:2.2959E-41)
            int r4 = java.lang.Math.min(r4, r1)     // Catch: java.lang.Throwable -> L5d
            int r1 = r0.d     // Catch: java.lang.Throwable -> L5d
            if (r1 != r4) goto L2d
            goto L49
        L2d:
            if (r4 >= r1) goto L37
            int r1 = r0.b     // Catch: java.lang.Throwable -> L5d
            int r1 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L5d
            r0.b = r1     // Catch: java.lang.Throwable -> L5d
        L37:
            r0.c = r2     // Catch: java.lang.Throwable -> L5d
            r0.d = r4     // Catch: java.lang.Throwable -> L5d
            int r1 = r0.h     // Catch: java.lang.Throwable -> L5d
            if (r4 >= r1) goto L49
            if (r4 != 0) goto L45
            r0.a()     // Catch: java.lang.Throwable -> L5d
            goto L49
        L45:
            int r1 = r1 - r4
            r0.e(r1)     // Catch: java.lang.Throwable -> L5d
        L49:
            r4 = 4
            r0 = 0
            r3.h(r0, r0, r4, r2)     // Catch: java.lang.Throwable -> L5d
            eaja r4 = r3.d     // Catch: java.lang.Throwable -> L5d
            r4.flush()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r3)
            return
        L55:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "closed"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            throw r4     // Catch: java.lang.Throwable -> L5d
        L5d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eahm.b(eahr):void");
    }

    public final synchronized void c() {
        if (this.f) {
            throw new IOException("closed");
        }
        this.d.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f = true;
        this.d.close();
    }

    public final synchronized void e(eahr eahrVar) {
        if (!this.f) {
            int i = 0;
            h(0, Integer.bitCount(eahrVar.a) * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (eahrVar.a(i)) {
                    int i2 = 7;
                    if (i == 4) {
                        i2 = i;
                        i = 3;
                    } else if (i == 7) {
                        i = 4;
                    } else {
                        i2 = i;
                    }
                    this.d.Q(i);
                    this.d.P(eahrVar.b(i2));
                    i = i2;
                }
                i++;
            }
            this.d.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void h(int i, int i2, byte b, byte b2) {
        Logger logger = c;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(eagn.c(false, i, i2, b, b2));
        }
        int i3 = this.a;
        if (i2 <= i3) {
            if ((Integer.MIN_VALUE & i) == 0) {
                eaja eajaVar = this.d;
                eajaVar.N((i2 >>> 16) & 255);
                eajaVar.N((i2 >>> 8) & 255);
                eajaVar.N(i2 & 255);
                this.d.N(b);
                this.d.N(b2);
                this.d.P(i & Integer.MAX_VALUE);
                return;
            }
            throw eagn.a("reserved bit set: %s", Integer.valueOf(i));
        }
        throw eagn.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final synchronized void k(boolean z, int i, List<eagj> list) {
        int i2;
        int i3;
        if (!this.f) {
            eagl eaglVar = this.b;
            if (eaglVar.c) {
                int i4 = eaglVar.b;
                if (i4 < eaglVar.d) {
                    eaglVar.c(i4, 31, 32);
                }
                eaglVar.c = false;
                eaglVar.b = Integer.MAX_VALUE;
                eaglVar.c(eaglVar.d, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                eagj eagjVar = list.get(i5);
                eajc f = eagjVar.g.f();
                eajc eajcVar = eagjVar.h;
                Integer num = eagm.b.get(f);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        if (eafa.a(eagm.a[i2 - 1].h, eajcVar)) {
                            i3 = i2;
                        } else if (eafa.a(eagm.a[i2].h, eajcVar)) {
                            i3 = i2;
                            i2++;
                        }
                    }
                    i3 = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i3 = -1;
                }
                if (i2 == -1) {
                    int i6 = eaglVar.f + 1;
                    int length = eaglVar.e.length;
                    while (true) {
                        if (i6 >= length) {
                            i2 = -1;
                            break;
                        }
                        if (eafa.a(eaglVar.e[i6].g, f)) {
                            if (eafa.a(eaglVar.e[i6].h, eajcVar)) {
                                int i7 = eaglVar.f;
                                int length2 = eagm.a.length;
                                i2 = (i6 - i7) + 61;
                                break;
                            } else if (i3 == -1) {
                                int i8 = eaglVar.f;
                                int length3 = eagm.a.length;
                                i3 = (i6 - i8) + 61;
                            }
                        }
                        i6++;
                    }
                }
                if (i2 != -1) {
                    eaglVar.c(i2, 127, 128);
                } else if (i3 == -1) {
                    eaglVar.a.M(64);
                    eaglVar.d(f);
                    eaglVar.d(eajcVar);
                    eaglVar.b(eagjVar);
                } else if (!f.l(eagj.a) || eagj.f.equals(f)) {
                    eaglVar.c(i3, 63, 64);
                    eaglVar.d(eajcVar);
                    eaglVar.b(eagjVar);
                } else {
                    eaglVar.c(i3, 15, 0);
                    eaglVar.d(eajcVar);
                }
            }
            long j = this.e.b;
            int min = (int) Math.min(this.a, j);
            long j2 = min;
            int i9 = j == j2 ? 4 : 0;
            if (z) {
                i9 |= 1;
            }
            h(i, min, (byte) 1, (byte) i9);
            this.d.a(this.e, j2);
            if (j > j2) {
                long j3 = j - j2;
                while (j3 > 0) {
                    int min2 = (int) Math.min(this.a, j3);
                    long j4 = min2;
                    j3 -= j4;
                    h(i, min2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                    this.d.a(this.e, j4);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void d(boolean z, int i, eaiz eaizVar, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        h(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 <= 0) {
            return;
        }
        this.d.a(eaizVar, i2);
    }

    public final synchronized void f(boolean z, int i, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        h(0, 8, (byte) 6, (byte) 1);
        this.d.P(i);
        this.d.P(i2);
        this.d.flush();
    }

    public final synchronized void i(int i, int i2) {
        if (this.f) {
            throw new IOException("closed");
        }
        h(i, 4, (byte) 3, (byte) 0);
        this.d.P(i2 - 1);
        this.d.flush();
    }

    public final synchronized void j(int i, int i2, byte[] bArr) {
        if (this.f) {
            throw new IOException("closed");
        }
        int length = bArr.length;
        h(0, length + 8, (byte) 7, (byte) 0);
        this.d.P(i);
        this.d.P(i2 - 1);
        if (length > 0) {
            this.d.J(bArr);
        }
        this.d.flush();
    }

    public final synchronized void g(int i, long j) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw eagn.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
        h(i, 4, (byte) 8, (byte) 0);
        this.d.P((int) j);
        this.d.flush();
    }
}
