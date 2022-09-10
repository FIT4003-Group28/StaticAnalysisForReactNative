package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eahh  reason: default package */
/* loaded from: classes6.dex */
public final class eahh implements Closeable {
    static final Logger a = Logger.getLogger(eagn.class.getName());
    public final eajb b;
    final eagk c;
    private final eahf d;

    public eahh(eajb eajbVar) {
        this.b = eajbVar;
        eahf eahfVar = new eahf(eajbVar);
        this.d = eahfVar;
        this.c = new eagk(eahfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(eajb eajbVar) {
        return (eajbVar.h() & 255) | ((eajbVar.h() & 255) << 16) | ((eajbVar.h() & 255) << 8);
    }

    static int c(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw eagn.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    private final List<eagj> d(int i, short s, byte b, int i2) {
        eahf eahfVar = this.d;
        eahfVar.d = i;
        eahfVar.a = i;
        eahfVar.e = s;
        eahfVar.b = b;
        eahfVar.c = i2;
        eagk eagkVar = this.c;
        while (!eagkVar.b.c()) {
            int h = eagkVar.b.h() & 255;
            if (h == 128) {
                throw new IOException("index == 0");
            }
            if ((h & 128) == 128) {
                int d = eagkVar.d(h, 127) - 1;
                if (eagk.h(d)) {
                    eagkVar.a.add(eagm.a[d]);
                } else {
                    int length = eagm.a.length;
                    int b2 = eagkVar.b(d - 61);
                    if (b2 >= 0) {
                        eagj[] eagjVarArr = eagkVar.d;
                        if (b2 < eagjVarArr.length) {
                            eagkVar.a.add(eagjVarArr[b2]);
                        }
                    }
                    throw new IOException("Header index too large " + (d + 1));
                }
            } else if (h == 64) {
                eajc e = eagkVar.e();
                eagm.a(e);
                eagkVar.g(new eagj(e, eagkVar.e()));
            } else if ((h & 64) == 64) {
                eagkVar.g(new eagj(eagkVar.c(eagkVar.d(h, 63) - 1), eagkVar.e()));
            } else if ((h & 32) == 32) {
                int d2 = eagkVar.d(h, 31);
                eagkVar.c = d2;
                if (d2 < 0 || d2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + eagkVar.c);
                }
                int i3 = eagkVar.g;
                if (d2 < i3) {
                    if (d2 == 0) {
                        eagkVar.a();
                    } else {
                        eagkVar.f(i3 - d2);
                    }
                }
            } else if (h == 16 || h == 0) {
                eajc e2 = eagkVar.e();
                eagm.a(e2);
                eagkVar.a.add(new eagj(e2, eagkVar.e()));
            } else {
                eagkVar.a.add(new eagj(eagkVar.c(eagkVar.d(h, 15) - 1), eagkVar.e()));
            }
        }
        eagk eagkVar2 = this.c;
        ArrayList arrayList = new ArrayList(eagkVar2.a);
        eagkVar2.a.clear();
        return arrayList;
    }

    private final void e() {
        this.b.k();
        this.b.h();
    }

    public final boolean a(boolean z, eahg eahgVar) {
        int i;
        boolean z2;
        long j;
        int i2;
        long j2;
        eajb eajbVar;
        boolean a2;
        eahl[] eahlVarArr;
        long j3;
        eahl[] eahlVarArr2;
        boolean z3 = false;
        int i3 = 0;
        try {
            this.b.d(9L);
            int b = b(this.b);
            if (b > 16384) {
                throw eagn.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(b));
            }
            byte h = (byte) (this.b.h() & 255);
            int i4 = 4;
            if (!z || h == 4) {
                byte h2 = (byte) (this.b.h() & 255);
                int k = this.b.k() & Integer.MAX_VALUE;
                Logger logger = a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(eagn.c(true, k, b, h, h2));
                }
                long j4 = 0;
                switch (h) {
                    case 0:
                        if (k == 0) {
                            throw eagn.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        }
                        int i5 = h2 & 1;
                        if ((h2 & 32) != 0) {
                            throw eagn.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        }
                        int h3 = (h2 & 8) != 0 ? this.b.h() & 255 : 0;
                        int c = c(b, h2, (short) h3);
                        eajb eajbVar2 = this.b;
                        if (eahe.q(k)) {
                            eahe eaheVar = ((eahd) eahgVar).c;
                            eaiz eaizVar = new eaiz();
                            long j5 = c;
                            eajbVar2.d(j5);
                            eajbVar2.Te(eaizVar, j5);
                            if (eaizVar.b != j5) {
                                throw new IOException(eaizVar.b + " != " + c);
                            }
                            eaheVar.l(new eagu(eaheVar, new Object[]{eaheVar.e, Integer.valueOf(k)}, k, eaizVar, c));
                        } else {
                            eahd eahdVar = (eahd) eahgVar;
                            eahl a3 = eahdVar.c.a(k);
                            if (a3 == null) {
                                eahdVar.c.m(k, 2);
                                long j6 = c;
                                eahdVar.c.d(j6);
                                eajbVar2.A(j6);
                            } else {
                                eahj eahjVar = a3.g;
                                long j7 = c;
                                int i6 = i5;
                                while (true) {
                                    if (j7 > j4) {
                                        synchronized (eahjVar.f) {
                                            z2 = eahjVar.e;
                                            j = eahjVar.b.b + j7;
                                            i2 = i6;
                                            j2 = eahjVar.c;
                                        }
                                        if (j > j2) {
                                            eajbVar2.A(j7);
                                            eahjVar.f.k(i4);
                                            i = i2;
                                        } else if (!z2) {
                                            long Te = eajbVar2.Te(eahjVar.a, j7);
                                            if (Te != -1) {
                                                j7 -= Te;
                                                synchronized (eahjVar.f) {
                                                    eaiz eaizVar2 = eahjVar.b;
                                                    eajbVar = eajbVar2;
                                                    long j8 = eaizVar2.b;
                                                    do {
                                                    } while (eahjVar.a.Te(eaizVar2, 8192L) != -1);
                                                    if (j8 == 0) {
                                                        eahjVar.f.notifyAll();
                                                    }
                                                }
                                                int i7 = i2 == 1 ? 1 : 0;
                                                boolean z4 = i2 == 1 ? 1 : 0;
                                                i6 = i7;
                                                j4 = 0;
                                                eajbVar2 = eajbVar;
                                                i4 = 4;
                                            } else {
                                                throw new EOFException();
                                            }
                                        } else {
                                            eajbVar2.A(j7);
                                            i = i2;
                                        }
                                    } else {
                                        int i8 = i6 == 1 ? 1 : 0;
                                        boolean z5 = i6 == 1 ? 1 : 0;
                                        i = i8;
                                    }
                                }
                                if (i != 0) {
                                    a3.e();
                                }
                            }
                        }
                        this.b.A(h3);
                        return true;
                    case 1:
                        if (k == 0) {
                            throw eagn.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        }
                        int i9 = h2 & 1;
                        int h4 = (h2 & 8) != 0 ? this.b.h() & 255 : 0;
                        if ((h2 & 32) != 0) {
                            e();
                            b -= 5;
                        }
                        short s = (short) h4;
                        List<eagj> d = d(c(b, h2, s), s, h2, k);
                        boolean q = eahe.q(k);
                        boolean z6 = 1 == i9;
                        if (q) {
                            ((eahd) eahgVar).c.k(k, d, z6);
                            return true;
                        }
                        synchronized (((eahd) eahgVar).c) {
                            eahl a4 = ((eahd) eahgVar).c.a(k);
                            if (a4 == null) {
                                eahe eaheVar2 = ((eahd) eahgVar).c;
                                if (!eaheVar2.h) {
                                    if (k > eaheVar2.f) {
                                        if ((k & 1) != eaheVar2.g % 2) {
                                            eahl eahlVar = new eahl(k, ((eahd) eahgVar).c, false, z6, eafa.z(d));
                                            eahe eaheVar3 = ((eahd) eahgVar).c;
                                            eaheVar3.f = k;
                                            Map<Integer, eahl> map = eaheVar3.d;
                                            Integer valueOf = Integer.valueOf(k);
                                            map.put(valueOf, eahlVar);
                                            eahe.a.execute(new eaha((eahd) eahgVar, new Object[]{((eahd) eahgVar).c.e, valueOf}, eahlVar));
                                        }
                                    }
                                }
                            } else {
                                synchronized (a4) {
                                    a4.f = true;
                                    a4.e.add(eafa.z(d));
                                    a2 = a4.a();
                                    a4.notifyAll();
                                }
                                if (!a2) {
                                    a4.d.b(a4.c);
                                }
                                if (i9 != 0) {
                                    a4.e();
                                }
                            }
                        }
                        return true;
                    case 2:
                        if (b != 5) {
                            throw eagn.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(b));
                        }
                        if (k == 0) {
                            throw eagn.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                        }
                        e();
                        return true;
                    case 3:
                        if (b != 4) {
                            throw eagn.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(b));
                        }
                        if (k == 0) {
                            throw eagn.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        }
                        int k2 = this.b.k();
                        int a5 = eagi.a(k2);
                        if (a5 != 0) {
                            if (eahe.q(k)) {
                                eahe eaheVar4 = ((eahd) eahgVar).c;
                                eaheVar4.l(new eagv(eaheVar4, new Object[]{eaheVar4.e, Integer.valueOf(k)}, k));
                                return true;
                            }
                            eahl b2 = ((eahd) eahgVar).c.b(k);
                            if (b2 == null) {
                                return true;
                            }
                            b2.l(a5);
                            return true;
                        }
                        throw eagn.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(k2));
                    case 4:
                        if (k != 0) {
                            throw eagn.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                        }
                        if ((h2 & 1) != 0) {
                            if (b != 0) {
                                throw eagn.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            }
                            return true;
                        } else if (b % 6 != 0) {
                            throw eagn.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(b));
                        } else {
                            eahr eahrVar = new eahr();
                            for (int i10 = 0; i10 < b; i10 += 6) {
                                char j9 = (char) this.b.j();
                                int k3 = this.b.k();
                                if (j9 != 2) {
                                    if (j9 == 3) {
                                        j9 = 4;
                                    } else if (j9 != 4) {
                                        if (j9 == 5 && (k3 < 16384 || k3 > 16777215)) {
                                            throw eagn.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(k3));
                                        }
                                    } else if (k3 < 0) {
                                        throw eagn.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    } else {
                                        j9 = 7;
                                    }
                                } else if (k3 != 0 && k3 != 1) {
                                    throw eagn.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                }
                                eahrVar.e(j9, k3);
                            }
                            synchronized (((eahd) eahgVar).c) {
                                int d2 = ((eahd) eahgVar).c.n.d();
                                eahr eahrVar2 = ((eahd) eahgVar).c.n;
                                for (int i11 = 0; i11 < 10; i11++) {
                                    if (eahrVar.a(i11)) {
                                        eahrVar2.e(i11, eahrVar.b(i11));
                                    }
                                }
                                ((eahd) eahgVar).a(eahrVar);
                                int d3 = ((eahd) eahgVar).c.n.d();
                                eahlVarArr = null;
                                if (d3 == -1 || d3 == d2) {
                                    j3 = 0;
                                } else {
                                    j3 = d3 - d2;
                                    eahe eaheVar5 = ((eahd) eahgVar).c;
                                    if (!eaheVar5.o) {
                                        eaheVar5.o = true;
                                    }
                                    if (!eaheVar5.d.isEmpty()) {
                                        eahlVarArr = (eahl[]) ((eahd) eahgVar).c.d.values().toArray(new eahl[((eahd) eahgVar).c.d.size()]);
                                    }
                                }
                                eahe.a.execute(new eahb((eahd) eahgVar, ((eahd) eahgVar).c.e));
                            }
                            if (eahlVarArr == null || j3 == 0) {
                                return true;
                            }
                            for (eahl eahlVar2 : eahlVarArr) {
                                synchronized (eahlVar2) {
                                    eahlVar2.g(j3);
                                }
                            }
                            return true;
                        }
                    case 5:
                        if (k == 0) {
                            throw eagn.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        }
                        if ((h2 & 8) != 0) {
                            i3 = this.b.h() & 255;
                        }
                        short s2 = (short) i3;
                        ((eahd) eahgVar).c.j(this.b.k() & Integer.MAX_VALUE, d(c(b - 4, h2, s2), s2, h2, k));
                        return true;
                    case 6:
                        if (b != 8) {
                            throw eagn.b("TYPE_PING length != 8: %s", Integer.valueOf(b));
                        }
                        if (k != 0) {
                            throw eagn.b("TYPE_PING streamId != 0", new Object[0]);
                        }
                        int k4 = this.b.k();
                        int k5 = this.b.k();
                        if (1 == (h2 & 1)) {
                            z3 = true;
                        }
                        eahgVar.b(z3, k4, k5);
                        return true;
                    case 7:
                        if (b < 8) {
                            throw eagn.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(b));
                        }
                        if (k != 0) {
                            throw eagn.b("TYPE_GOAWAY streamId != 0", new Object[0]);
                        }
                        int k6 = this.b.k();
                        int k7 = this.b.k();
                        int i12 = b - 8;
                        if (eagi.a(k7) == 0) {
                            throw eagn.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(k7));
                        }
                        eajc eajcVar = eajc.b;
                        if (i12 > 0) {
                            eajcVar = this.b.o(i12);
                        }
                        eajcVar.h();
                        eahd eahdVar2 = (eahd) eahgVar;
                        synchronized (eahdVar2.c) {
                            eahlVarArr2 = (eahl[]) ((eahd) eahgVar).c.d.values().toArray(new eahl[((eahd) eahgVar).c.d.size()]);
                            ((eahd) eahgVar).c.h = true;
                        }
                        for (eahl eahlVar3 : eahlVarArr2) {
                            if (eahlVar3.c > k6 && eahlVar3.b()) {
                                eahlVar3.l(8);
                                eahdVar2.c.b(eahlVar3.c);
                            }
                        }
                        return true;
                    case 8:
                        if (b != 4) {
                            throw eagn.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(b));
                        }
                        long k8 = this.b.k() & 2147483647L;
                        if (k8 == 0) {
                            throw eagn.b("windowSizeIncrement was 0", Long.valueOf(k8));
                        }
                        if (k == 0) {
                            synchronized (((eahd) eahgVar).c) {
                                eahe eaheVar6 = ((eahd) eahgVar).c;
                                eaheVar6.l += k8;
                                eaheVar6.notifyAll();
                            }
                            return true;
                        }
                        eahl a6 = ((eahd) eahgVar).c.a(k);
                        if (a6 == null) {
                            return true;
                        }
                        synchronized (a6) {
                            a6.g(k8);
                        }
                        return true;
                    default:
                        this.b.A(b);
                        return true;
                }
            }
            throw eagn.b("Expected a SETTINGS frame but was %s", Byte.valueOf(h));
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
