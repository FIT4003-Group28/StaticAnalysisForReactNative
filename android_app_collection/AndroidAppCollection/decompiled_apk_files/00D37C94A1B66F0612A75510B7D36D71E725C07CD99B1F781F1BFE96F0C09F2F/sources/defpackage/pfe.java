package defpackage;

import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: pfe  reason: default package */
/* loaded from: classes4.dex */
public final class pfe implements pev {
    public int A;
    public int B;
    public long C;
    public long D;
    public int E;
    public int F;
    public int[] G;
    public int H;
    public int I;

    /* renamed from: J  reason: collision with root package name */
    public int f254J;
    public int K;
    public boolean L;
    public azh M;
    private final pfa P;
    private pet Q;
    private pes R;
    private final pwu S;
    private final pwu T;
    private final pwu U;
    private final pwu V;
    private final pwu W;
    private final pwu X;
    private final pwu Y;
    private ByteBuffer Z;
    private long aa;
    private boolean ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private int aj;
    private byte ak;
    private boolean al;
    public final pfg c;
    public final SparseArray d;
    public final boolean e;
    public pew f;
    public final pwu g;
    public final pwu h;
    public final pwu i;
    public byte[] j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public pfc p;
    public boolean q;
    public int r;
    public long s;
    public boolean t;
    public long u;
    public long v;
    public pwi w;
    public pwi x;
    public boolean y;
    public int z;
    private static final byte[] N = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a = pxi.U("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] O = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final UUID b = new UUID(72057594037932032L, -9223371306706625679L);

    public pfe() {
        this(0);
    }

    public static int[] l(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    private final int m() {
        int i = this.ae;
        o();
        return i;
    }

    private final int n(peu peuVar, bab babVar, int i) {
        int a2 = this.V.a();
        if (a2 > 0) {
            int min = Math.min(i, a2);
            babVar.c(this.V, min);
            return min;
        }
        return babVar.a(peuVar, i, false);
    }

    private final void o() {
        this.ad = 0;
        this.ae = 0;
        this.af = 0;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = 0;
        this.ak = (byte) 0;
        this.al = false;
        this.V.C(0);
        byte[] bArr = this.T.a;
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
    }

    private final boolean p(peu peuVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = i + 32;
        if (this.W.b() < i2) {
            this.W.D(Arrays.copyOf(bArr, i2 + i));
        } else {
            System.arraycopy(bArr, 0, this.W.a, 0, 32);
        }
        if (!peuVar.i(this.W.a, 32, i)) {
            return false;
        }
        this.W.G(0);
        this.W.F(i2);
        return true;
    }

    private static byte[] q(long j, String str, long j2) {
        ptx.c(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return pxi.U(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    @Override // defpackage.pev
    public final void a(ByteBuffer byteBuffer, long j) {
        if (this.R == null) {
            this.R = new pes();
        }
        this.R.d(byteBuffer, j);
        while (!this.R.h()) {
            long remaining = byteBuffer.remaining();
            this.ab = false;
            while (true) {
                if (this.ab) {
                    break;
                }
                try {
                    if (!this.P.a(this.R)) {
                        for (int i = 0; i < this.d.size(); i++) {
                            ((pfc) this.d.valueAt(i)).c();
                        }
                    }
                } catch (IOException e) {
                    throw pjq.a(null, e);
                }
            }
            if (remaining == byteBuffer.remaining()) {
                throw pjq.a("Extractor failed to make progress.", null);
            }
        }
        this.R.c();
    }

    public final int b(peu peuVar, pfc pfcVar, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(pfcVar.b)) {
            if (p(peuVar, N, i)) {
                return m();
            }
            return -6;
        } else if ("S_TEXT/ASS".equals(pfcVar.b)) {
            if (p(peuVar, O, i)) {
                return m();
            }
            return -6;
        } else {
            bab babVar = pfcVar.V;
            if (!this.ag) {
                if (pfcVar.g) {
                    this.f254J &= -1073741825;
                    int i3 = 128;
                    if (!this.ah) {
                        if (!peuVar.i(this.g.a, 0, 1)) {
                            return -6;
                        }
                        this.ad++;
                        byte b2 = this.g.a[0];
                        if ((b2 & 128) == 128) {
                            throw pjq.a("Extension bit is set in signal byte", null);
                        }
                        this.ak = b2;
                        this.ah = true;
                    }
                    byte b3 = this.ak;
                    if ((b3 & 1) == 1) {
                        int i4 = b3 & 2;
                        this.f254J |= 1073741824;
                        if (!this.al) {
                            if (!peuVar.i(this.X.a, 0, 8)) {
                                return -6;
                            }
                            this.ad += 8;
                            this.al = true;
                            pwu pwuVar = this.g;
                            byte[] bArr = pwuVar.a;
                            if (i4 != 2) {
                                i3 = 0;
                            }
                            bArr[0] = (byte) (i3 | 8);
                            pwuVar.G(0);
                            babVar.c(this.g, 1);
                            this.ae++;
                            this.X.G(0);
                            babVar.c(this.X, 8);
                            this.ae += 8;
                        }
                        if (i4 == 2) {
                            if (!this.ai) {
                                if (!peuVar.i(this.g.a, 0, 1)) {
                                    return -6;
                                }
                                this.ad++;
                                this.g.G(0);
                                this.aj = this.g.i();
                                this.ai = true;
                            }
                            int i5 = this.aj * 4;
                            this.g.z(i5);
                            if (!peuVar.i(this.g.a, 0, i5)) {
                                return -6;
                            }
                            this.g.G(0);
                            this.g.F(i5);
                            this.ad += i5;
                            int i6 = (this.aj >> 1) + 1;
                            int i7 = (i6 * 6) + 2;
                            ByteBuffer byteBuffer = this.Z;
                            if (byteBuffer == null || byteBuffer.capacity() < i7) {
                                this.Z = ByteBuffer.allocate(i7);
                            }
                            this.Z.position(0);
                            this.Z.putShort((short) i6);
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                i2 = this.aj;
                                if (i8 >= i2) {
                                    break;
                                }
                                int l = this.g.l();
                                if (i8 % 2 == 0) {
                                    this.Z.putShort((short) (l - i9));
                                } else {
                                    this.Z.putInt(l - i9);
                                }
                                i8++;
                                i9 = l;
                            }
                            int i10 = (i - this.ad) - i9;
                            if ((i2 & 1) == 1) {
                                this.Z.putInt(i10);
                            } else {
                                this.Z.putShort((short) i10);
                                this.Z.putInt(0);
                            }
                            this.Y.E(this.Z.array(), i7);
                            babVar.c(this.Y, i7);
                            this.ae += i7;
                        }
                    }
                } else {
                    byte[] bArr2 = pfcVar.h;
                    if (bArr2 != null) {
                        this.V.E(bArr2, bArr2.length);
                    }
                }
                if (pfcVar.f > 0) {
                    this.f254J |= 268435456;
                    this.i.C(0);
                    this.g.C(4);
                    pwu pwuVar2 = this.g;
                    byte[] bArr3 = pwuVar2.a;
                    bArr3[0] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
                    bArr3[1] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
                    bArr3[2] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
                    bArr3[3] = (byte) (i & PrivateKeyType.INVALID);
                    babVar.c(pwuVar2, 4);
                    this.ae += 4;
                }
                this.ag = true;
            }
            int i11 = i + this.V.c;
            if ("V_MPEG4/ISO/AVC".equals(pfcVar.b) || "V_MPEGH/ISO/HEVC".equals(pfcVar.b)) {
                byte[] bArr4 = this.T.a;
                int i12 = pfcVar.W;
                int i13 = 4 - i12;
                while (this.ad < i11) {
                    int i14 = this.af;
                    if (i14 == 0) {
                        int min = Math.min(i12, this.V.a());
                        if (!peuVar.i(bArr4, i13 + min, i12 - min)) {
                            return -6;
                        }
                        if (min > 0) {
                            this.V.B(bArr4, i13, min);
                        }
                        this.ad += i12;
                        this.T.G(0);
                        this.af = this.T.l();
                        this.S.G(0);
                        babVar.c(this.S, 4);
                        this.ae += 4;
                    } else {
                        int n = n(peuVar, babVar, i14);
                        if (n == 0) {
                            return -6;
                        }
                        this.ad += n;
                        this.ae += n;
                        this.af -= n;
                    }
                }
            } else {
                if (pfcVar.R != null) {
                    ptx.e(this.V.c == 0);
                    pfd pfdVar = pfcVar.R;
                    if (!pfdVar.b) {
                        if (!peuVar.k(pfdVar.a, 10)) {
                            return -6;
                        }
                        peuVar.f();
                        if (ayn.b(pfdVar.a) != 0) {
                            pfdVar.b = true;
                        }
                    }
                }
                while (true) {
                    int i15 = this.ad;
                    if (i15 >= i11) {
                        break;
                    }
                    int n2 = n(peuVar, babVar, i11 - i15);
                    if (n2 == 0) {
                        return -6;
                    }
                    this.ad += n2;
                    this.ae += n2;
                }
            }
            if ("A_VORBIS".equals(pfcVar.b)) {
                this.U.G(0);
                babVar.c(this.U, 4);
                this.ae += 4;
            }
            return m();
        }
    }

    @Override // defpackage.aze
    public final int d(azf azfVar, azv azvVar) {
        if (this.Q == null) {
            this.Q = new pet();
        }
        this.Q.a = azfVar;
        this.ab = false;
        while (!this.ab) {
            if (this.P.a(this.Q)) {
                long b2 = this.Q.b();
                if (this.t) {
                    this.aa = b2;
                    azvVar.a = this.u;
                    this.t = false;
                    return 1;
                } else if (this.q) {
                    long j = this.aa;
                    if (j != -1) {
                        azvVar.a = j;
                        this.aa = -1L;
                        return 1;
                    }
                }
            } else {
                for (int i = 0; i < this.d.size(); i++) {
                    ((pfc) this.d.valueAt(i)).c();
                }
                return -1;
            }
        }
        return 0;
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.M = azhVar;
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        this.v = -9223372036854775807L;
        this.B = 0;
        this.z = 0;
        this.A = 0;
        this.ac = 0;
        pey peyVar = (pey) this.P;
        peyVar.d = 0;
        peyVar.a.clear();
        peyVar.b.d();
        this.c.d();
        o();
        for (int i = 0; i < this.d.size(); i++) {
            pfd pfdVar = ((pfc) this.d.valueAt(i)).R;
            if (pfdVar != null) {
                pfdVar.b = false;
                pfdVar.c = 0;
            }
        }
        pes pesVar = this.R;
        if (pesVar != null) {
            pesVar.e();
        }
    }

    @Override // defpackage.aze
    public final boolean h(azf azfVar) {
        pff pffVar = new pff();
        long j = ((aza) azfVar).b;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        azfVar.j(pffVar.a.a, 0, 4);
        long p = pffVar.a.p();
        pffVar.b = 4;
        while (true) {
            if (p != 440786851) {
                int i2 = pffVar.b + 1;
                pffVar.b = i2;
                if (i2 == i) {
                    break;
                }
                azfVar.j(pffVar.a.a, 0, 1);
                p = ((p << 8) & (-256)) | (pffVar.a.a[0] & 255);
            } else {
                long a2 = pffVar.a(azfVar);
                long j3 = pffVar.b;
                if (a2 != Long.MIN_VALUE && (j == -1 || j3 + a2 < j)) {
                    while (true) {
                        long j4 = pffVar.b;
                        long j5 = j3 + a2;
                        if (j4 < j5) {
                            if (pffVar.a(azfVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long a3 = pffVar.a(azfVar);
                            if (a3 < 0) {
                                break;
                            } else if (a3 != 0) {
                                int i3 = (int) a3;
                                azfVar.f(i3);
                                pffVar.b += i3;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.pfc r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfe.i(pfc, long, int, int, int):void");
    }

    public final boolean j(peu peuVar, int i) {
        if (this.ac == 0) {
            this.j = new byte[i];
            this.ac = 1;
        }
        if (!peuVar.i(this.j, 0, i)) {
            return false;
        }
        this.ac = 0;
        return true;
    }

    public final boolean k(peu peuVar, int i) {
        pwu pwuVar = this.g;
        if (pwuVar.c >= i) {
            return true;
        }
        if (pwuVar.b() < i) {
            pwu pwuVar2 = this.g;
            byte[] bArr = pwuVar2.a;
            int length = bArr.length;
            pwuVar2.E(Arrays.copyOf(bArr, Math.max(length + length, i)), this.g.c);
        }
        pwu pwuVar3 = this.g;
        byte[] bArr2 = pwuVar3.a;
        int i2 = pwuVar3.c;
        if (!peuVar.i(bArr2, i2, i - i2)) {
            return false;
        }
        this.g.F(i);
        return true;
    }

    public pfe(int i) {
        pey peyVar = new pey();
        this.l = -1L;
        this.m = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.o = -9223372036854775807L;
        this.u = -1L;
        this.aa = -1L;
        this.v = -9223372036854775807L;
        this.P = peyVar;
        peyVar.c = new pfb(this);
        this.e = 1 == (i ^ 1);
        this.c = new pfg();
        this.d = new SparseArray();
        this.g = new pwu(4);
        this.U = new pwu(ByteBuffer.allocate(4).putInt(-1).array());
        this.h = new pwu(4);
        this.S = new pwu(pwo.a);
        this.T = new pwu(4);
        this.V = new pwu();
        this.W = new pwu();
        this.X = new pwu(8);
        this.Y = new pwu();
        this.i = new pwu();
        this.G = new int[1];
        this.j = pxi.f;
    }

    public final long c(long j) {
        long j2 = this.m;
        if (j2 == -9223372036854775807L) {
            throw pjq.a("Can't scale timecode prior to timecodeScale being set.", null);
        }
        return pxi.n(j, j2, 1000L);
    }
}
