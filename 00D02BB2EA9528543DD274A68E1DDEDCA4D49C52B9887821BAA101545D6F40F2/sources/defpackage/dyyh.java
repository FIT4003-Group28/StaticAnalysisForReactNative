package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dyyh  reason: default package */
/* loaded from: classes6.dex */
public final class dyyh implements dyxz {
    public int a;
    private final eaja b;
    private final eaiz c;
    private final dyyc d;
    private boolean e;

    public dyyh(eaja eajaVar) {
        this.b = eajaVar;
        eaiz eaizVar = new eaiz();
        this.c = eaizVar;
        this.d = new dyyc(eaizVar);
        this.a = 16384;
    }

    @Override // defpackage.dyxz
    public final synchronized void b(dyyl dyylVar) {
        if (!this.e) {
            int i = this.a;
            if ((dyylVar.a & 32) != 0) {
                i = dyylVar.b[5];
            }
            this.a = i;
            k(0, 0, (byte) 4, (byte) 1);
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // defpackage.dyxz
    public final synchronized void c() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.b.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.b.close();
    }

    @Override // defpackage.dyxz
    public final synchronized void f(dyyl dyylVar) {
        if (!this.e) {
            int i = 0;
            k(0, Integer.bitCount(dyylVar.a) * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (dyylVar.a(i)) {
                    int i2 = 7;
                    if (i == 4) {
                        i2 = i;
                        i = 3;
                    } else if (i == 7) {
                        i = 4;
                    } else {
                        i2 = i;
                    }
                    this.b.Q(i);
                    this.b.P(dyylVar.b(i2));
                    i = i2;
                }
                i++;
            }
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // defpackage.dyxz
    public final synchronized void j(boolean z, int i, List<dyya> list) {
        int i2;
        int i3;
        if (!this.e) {
            dyyc dyycVar = this.d;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                dyya dyyaVar = list.get(i4);
                eajc f = dyyaVar.f.f();
                eajc eajcVar = dyyaVar.g;
                Integer num = dyyd.c.get(f);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 >= 2 && i2 <= 7) {
                        if (dyyd.b[i2 - 1].g.equals(eajcVar)) {
                            i3 = i2;
                        } else if (dyyd.b[i2].g.equals(eajcVar)) {
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
                    int i5 = dyycVar.d + 1;
                    while (true) {
                        dyya[] dyyaVarArr = dyycVar.b;
                        if (i5 >= dyyaVarArr.length) {
                            i2 = -1;
                            break;
                        }
                        if (dyyaVarArr[i5].f.equals(f)) {
                            if (dyycVar.b[i5].g.equals(eajcVar)) {
                                int i6 = dyycVar.d;
                                int length = dyyd.b.length;
                                i2 = (i5 - i6) + 61;
                                break;
                            } else if (i3 == -1) {
                                int i7 = dyycVar.d;
                                int length2 = dyyd.b.length;
                                i3 = (i5 - i7) + 61;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    dyycVar.a(i2, 127, 128);
                } else if (i3 != -1) {
                    if (!f.l(dyyd.a) || dyya.e.equals(f)) {
                        dyycVar.a(i3, 63, 64);
                        dyycVar.b(eajcVar);
                        dyycVar.c(dyyaVar);
                    } else {
                        dyycVar.a(i3, 15, 0);
                        dyycVar.b(eajcVar);
                    }
                } else {
                    dyycVar.a.M(64);
                    dyycVar.b(f);
                    dyycVar.b(eajcVar);
                    dyycVar.c(dyyaVar);
                }
            }
            long j = this.c.b;
            int min = (int) Math.min(this.a, j);
            long j2 = min;
            int i8 = j == j2 ? 4 : 0;
            if (z) {
                i8 |= 1;
            }
            k(i, min, (byte) 1, (byte) i8);
            this.b.a(this.c, j2);
            if (j > j2) {
                long j3 = j - j2;
                while (j3 > 0) {
                    int min2 = (int) Math.min(this.a, j3);
                    long j4 = min2;
                    j3 -= j4;
                    k(i, min2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                    this.b.a(this.c, j4);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }

    final void k(int i, int i2, byte b, byte b2) {
        if (dyyi.a.isLoggable(Level.FINE)) {
            dyyi.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", dyyf.a(false, i, i2, b, b2));
        }
        int i3 = this.a;
        if (i2 <= i3) {
            if ((Integer.MIN_VALUE & i) == 0) {
                eaja eajaVar = this.b;
                eajaVar.N((i2 >>> 16) & 255);
                eajaVar.N((i2 >>> 8) & 255);
                eajaVar.N(i2 & 255);
                this.b.N(b);
                this.b.N(b2);
                this.b.P(i & Integer.MAX_VALUE);
                return;
            }
            throw dyyi.a("reserved bit set: %s", Integer.valueOf(i));
        }
        throw dyyi.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
    }

    @Override // defpackage.dyxz
    public final synchronized void a() {
        if (this.e) {
            throw new IOException("closed");
        }
        if (dyyi.a.isLoggable(Level.FINE)) {
            dyyi.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", dyyi.b.e()));
        }
        this.b.J(dyyi.b.i());
        this.b.flush();
    }

    @Override // defpackage.dyxz
    public final synchronized void d(int i, dyxw dyxwVar) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (dyxwVar.s == -1) {
            throw new IllegalArgumentException();
        }
        k(i, 4, (byte) 3, (byte) 0);
        this.b.P(dyxwVar.s);
        this.b.flush();
    }

    @Override // defpackage.dyxz
    public final synchronized void e(boolean z, int i, eaiz eaizVar, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        k(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 <= 0) {
            return;
        }
        this.b.a(eaizVar, i2);
    }

    @Override // defpackage.dyxz
    public final synchronized void g(boolean z, int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        k(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.b.P(i);
        this.b.P(i2);
        this.b.flush();
    }

    @Override // defpackage.dyxz
    public final synchronized void i(dyxw dyxwVar, byte[] bArr) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (dyxwVar.s == -1) {
            throw dyyi.a("errorCode.httpCode == -1", new Object[0]);
        }
        int length = bArr.length;
        k(0, length + 8, (byte) 7, (byte) 0);
        this.b.P(0);
        this.b.P(dyxwVar.s);
        if (length > 0) {
            this.b.J(bArr);
        }
        this.b.flush();
    }

    @Override // defpackage.dyxz
    public final synchronized void h(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0) {
            throw dyyi.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
        k(i, 4, (byte) 8, (byte) 0);
        this.b.P((int) j);
        this.b.flush();
    }
}
