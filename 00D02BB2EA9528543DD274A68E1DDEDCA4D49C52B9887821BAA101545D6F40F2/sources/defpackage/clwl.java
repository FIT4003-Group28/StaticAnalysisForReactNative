package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: clwl  reason: default package */
/* loaded from: classes5.dex */
public final class clwl implements clun {
    private static final byte[] K;
    private static final byte[] L;
    public static final byte[] a;
    public static final UUID b;
    public static final Map<String, Integer> c;
    public long A;
    public int B;
    public int C;
    public int[] D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public clup J;
    private final cmnk M;
    private final cmnk N;
    private final cmnk O;
    private final cmnk P;
    private final cmnk Q;
    private final cmnk R;
    private final cmnk S;
    private ByteBuffer T;
    private long U;
    private boolean V;
    private int W;
    private int X;
    private int Y;
    private boolean Z;
    private boolean aa;
    private boolean ab;
    private int ac;
    private byte ad;
    private boolean ae;
    private final clwf af;
    public final clwn d;
    public final SparseArray<clwj> e;
    public final boolean f;
    public final cmnk g;
    public final cmnk h;
    public final cmnk i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public clwj o;
    public boolean p;
    public int q;
    public long r;
    public boolean s;
    public long t;
    public long u;
    public cmnb v;
    public cmnb w;
    public boolean x;
    public int y;
    public long z;

    static {
        int i = clwh.a;
        K = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        a = cmny.t("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        L = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        b = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        c = Collections.unmodifiableMap(hashMap);
    }

    public clwl() {
        this(null);
    }

    public static int[] c(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    private final int j() {
        int i = this.X;
        k();
        return i;
    }

    private final void k() {
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = false;
        this.aa = false;
        this.ab = false;
        this.ac = 0;
        this.ad = (byte) 0;
        this.ae = false;
        this.P.a(0);
    }

    private static byte[] l(long j, String str, long j2) {
        cmmn.a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return cmny.t(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    private final void m(cluk clukVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        if (this.Q.g() < i2) {
            this.Q.b(Arrays.copyOf(bArr, i2 + i));
        } else {
            System.arraycopy(bArr, 0, this.Q.a, 0, length);
        }
        clukVar.c(this.Q.a, length, i);
        this.Q.a(i2);
    }

    private final int n(cluk clukVar, clvk clvkVar, int i) {
        int d = this.P.d();
        if (d > 0) {
            int min = Math.min(i, d);
            clvkVar.d(this.P, min);
            return min;
        }
        return clvkVar.c(clukVar, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.clwj r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clwl.a(clwj, long, int, int, int):void");
    }

    @Override // defpackage.clun
    public final void d(clup clupVar) {
        this.J = clupVar;
    }

    @Override // defpackage.clun
    public final void e(long j, long j2) {
        this.u = -9223372036854775807L;
        this.y = 0;
        clwf clwfVar = this.af;
        clwfVar.e = 0;
        clwfVar.b.clear();
        clwfVar.c.a();
        this.d.a();
        k();
        for (int i = 0; i < this.e.size(); i++) {
            clwk clwkVar = this.e.valueAt(i).T;
            if (clwkVar != null) {
                clwkVar.b = false;
                clwkVar.c = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
        return false;
     */
    @Override // defpackage.clun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.cluk r15) {
        /*
            r14 = this;
            clwm r0 = new clwm
            r0.<init>()
            long r1 = r15.b
            r3 = -1
            r5 = 1024(0x400, double:5.06E-321)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L15
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L14
            goto L15
        L14:
            r5 = r1
        L15:
            int r6 = (int) r5
            cmnk r5 = r0.a
            byte[] r5 = r5.a
            r7 = 0
            r8 = 4
            r15.f(r5, r7, r8)
            cmnk r5 = r0.a
            long r9 = r5.p()
            r0.b = r8
        L27:
            r11 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            r5 = 1
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 == 0) goto L51
            int r8 = r0.b
            int r8 = r8 + r5
            r0.b = r8
            if (r8 != r6) goto L37
            goto L98
        L37:
            cmnk r8 = r0.a
            byte[] r8 = r8.a
            r15.f(r8, r7, r5)
            r5 = 8
            long r8 = r9 << r5
            r10 = -256(0xffffffffffffff00, double:NaN)
            long r8 = r8 & r10
            cmnk r5 = r0.a
            byte[] r5 = r5.a
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r10 = (long) r5
            long r8 = r8 | r10
            r9 = r8
            goto L27
        L51:
            long r8 = r0.a(r15)
            int r6 = r0.b
            long r10 = (long) r6
            r12 = -9223372036854775808
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 == 0) goto L98
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L63
            goto L6a
        L63:
            long r3 = r10 + r8
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 < 0) goto L6a
            goto L98
        L6a:
            int r1 = r0.b
            long r1 = (long) r1
            long r3 = r10 + r8
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L93
            long r1 = r0.a(r15)
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 == 0) goto L98
            long r1 = r0.a(r15)
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L98
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L6a
            int r2 = (int) r1
            r15.h(r2)
            int r1 = r0.b
            int r1 = r1 + r2
            r0.b = r1
            goto L6a
        L93:
            int r15 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r15 != 0) goto L98
            return r5
        L98:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clwl.f(cluk):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x03d2, code lost:
        throw new defpackage.clob("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0651, code lost:
        if (r0 != 7) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (r5 == 1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r3v86, types: [int] */
    /* JADX WARN: Type inference failed for: r3v87, types: [int] */
    /* JADX WARN: Type inference failed for: r5v48, types: [cmnk] */
    /* JADX WARN: Type inference failed for: r5v67, types: [clwn] */
    /* JADX WARN: Type inference failed for: r5v69, types: [clwn] */
    /* JADX WARN: Type inference failed for: r6v22, types: [clwn] */
    /* JADX WARN: Type inference failed for: r6v26, types: [cmnk] */
    @Override // defpackage.clun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.cluk r31, defpackage.clvd r32) {
        /*
            Method dump skipped, instructions count: 2764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clwl.g(cluk, clvd):int");
    }

    public final void h(cluk clukVar, int i) {
        cmnk cmnkVar = this.g;
        if (cmnkVar.c >= i) {
            return;
        }
        if (cmnkVar.g() < i) {
            cmnk cmnkVar2 = this.g;
            byte[] bArr = cmnkVar2.a;
            int length = bArr.length;
            cmnkVar2.c(Arrays.copyOf(bArr, Math.max(length + length, i)), this.g.c);
        }
        cmnk cmnkVar3 = this.g;
        byte[] bArr2 = cmnkVar3.a;
        int i2 = cmnkVar3.c;
        clukVar.c(bArr2, i2, i - i2);
        this.g.e(i);
    }

    public final int i(cluk clukVar, clwj clwjVar, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(clwjVar.b)) {
            m(clukVar, K, i);
            return j();
        } else if ("S_TEXT/ASS".equals(clwjVar.b)) {
            m(clukVar, L, i);
            return j();
        } else {
            clvk clvkVar = clwjVar.X;
            if (!this.Z) {
                if (clwjVar.h) {
                    this.G &= -1073741825;
                    int i3 = 128;
                    if (!this.aa) {
                        clukVar.c(this.g.a, 0, 1);
                        this.W++;
                        byte b2 = this.g.a[0];
                        if ((b2 & 128) != 128) {
                            this.ad = b2;
                            this.aa = true;
                        } else {
                            throw new clob("Extension bit is set in signal byte");
                        }
                    }
                    byte b3 = this.ad;
                    if ((b3 & 1) == 1) {
                        int i4 = b3 & 2;
                        this.G |= 1073741824;
                        if (!this.ae) {
                            clukVar.c(this.R.a, 0, 8);
                            this.W += 8;
                            this.ae = true;
                            cmnk cmnkVar = this.g;
                            byte[] bArr = cmnkVar.a;
                            if (i4 != 2) {
                                i3 = 0;
                            }
                            bArr[0] = (byte) (i3 | 8);
                            cmnkVar.f(0);
                            clvkVar.f(this.g, 1);
                            this.X++;
                            this.R.f(0);
                            clvkVar.f(this.R, 8);
                            this.X += 8;
                        }
                        if (i4 == 2) {
                            if (!this.ab) {
                                clukVar.c(this.g.a, 0, 1);
                                this.W++;
                                this.g.f(0);
                                this.ac = this.g.l();
                                this.ab = true;
                            }
                            int i5 = this.ac * 4;
                            this.g.a(i5);
                            clukVar.c(this.g.a, 0, i5);
                            this.W += i5;
                            int i6 = (this.ac >> 1) + 1;
                            int i7 = (i6 * 6) + 2;
                            ByteBuffer byteBuffer = this.T;
                            if (byteBuffer == null || byteBuffer.capacity() < i7) {
                                this.T = ByteBuffer.allocate(i7);
                            }
                            this.T.position(0);
                            this.T.putShort((short) i6);
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                i2 = this.ac;
                                if (i8 >= i2) {
                                    break;
                                }
                                int v = this.g.v();
                                if (i8 % 2 == 0) {
                                    this.T.putShort((short) (v - i9));
                                } else {
                                    this.T.putInt(v - i9);
                                }
                                i8++;
                                i9 = v;
                            }
                            int i10 = (i - this.W) - i9;
                            if ((i2 & 1) == 1) {
                                this.T.putInt(i10);
                            } else {
                                this.T.putShort((short) i10);
                                this.T.putInt(0);
                            }
                            this.S.c(this.T.array(), i7);
                            clvkVar.f(this.S, i7);
                            this.X += i7;
                        }
                    }
                } else {
                    byte[] bArr2 = clwjVar.i;
                    if (bArr2 != null) {
                        this.P.c(bArr2, bArr2.length);
                    }
                }
                if (clwjVar.f > 0) {
                    this.G |= 268435456;
                    this.i.a(0);
                    this.g.a(4);
                    cmnk cmnkVar2 = this.g;
                    byte[] bArr3 = cmnkVar2.a;
                    bArr3[0] = (byte) ((i >> 24) & 255);
                    bArr3[1] = (byte) ((i >> 16) & 255);
                    bArr3[2] = (byte) ((i >> 8) & 255);
                    bArr3[3] = (byte) (i & 255);
                    clvkVar.f(cmnkVar2, 4);
                    this.X += 4;
                }
                this.Z = true;
            }
            int i11 = i + this.P.c;
            if ("V_MPEG4/ISO/AVC".equals(clwjVar.b) || "V_MPEGH/ISO/HEVC".equals(clwjVar.b)) {
                byte[] bArr4 = this.N.a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i12 = clwjVar.Y;
                int i13 = 4 - i12;
                while (this.W < i11) {
                    int i14 = this.Y;
                    if (i14 == 0) {
                        int min = Math.min(i12, this.P.d());
                        clukVar.c(bArr4, i13 + min, i12 - min);
                        if (min > 0) {
                            this.P.j(bArr4, i13, min);
                        }
                        this.W += i12;
                        this.N.f(0);
                        this.Y = this.N.v();
                        this.M.f(0);
                        clvkVar.d(this.M, 4);
                        this.X += 4;
                    } else {
                        int n = n(clukVar, clvkVar, i14);
                        this.W += n;
                        this.X += n;
                        this.Y -= n;
                    }
                }
            } else {
                if (clwjVar.T != null) {
                    cmmn.c(this.P.c == 0);
                    clwk clwkVar = clwjVar.T;
                    if (!clwkVar.b) {
                        clukVar.f(clwkVar.a, 0, 10);
                        clukVar.i();
                        byte[] bArr5 = clwkVar.a;
                        int[] iArr = clqz.a;
                        if (bArr5[4] == -8 && bArr5[5] == 114 && bArr5[6] == 111 && (bArr5[7] & 254) == 186) {
                            clwkVar.b = true;
                        }
                    }
                }
                while (true) {
                    int i15 = this.W;
                    if (i15 >= i11) {
                        break;
                    }
                    int n2 = n(clukVar, clvkVar, i11 - i15);
                    this.W += n2;
                    this.X += n2;
                }
            }
            if ("A_VORBIS".equals(clwjVar.b)) {
                this.O.f(0);
                clvkVar.d(this.O, 4);
                this.X += 4;
            }
            return j();
        }
    }

    public clwl(byte[] bArr) {
        clwf clwfVar = new clwf();
        this.k = -1L;
        this.l = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.t = -1L;
        this.U = -1L;
        this.u = -9223372036854775807L;
        this.af = clwfVar;
        clwfVar.d = new clwi(this);
        this.f = true;
        this.d = new clwn();
        this.e = new SparseArray<>();
        this.g = new cmnk(4);
        this.O = new cmnk(ByteBuffer.allocate(4).putInt(-1).array());
        this.h = new cmnk(4);
        this.M = new cmnk(cmni.a);
        this.N = new cmnk(4);
        this.P = new cmnk();
        this.Q = new cmnk();
        this.R = new cmnk(8);
        this.S = new cmnk();
        this.i = new cmnk();
        this.D = new int[1];
    }

    public final long b(long j) {
        long j2 = this.l;
        if (j2 == -9223372036854775807L) {
            throw new clob("Can't scale timecode prior to timecodeScale being set.");
        }
        return cmny.E(j, j2, 1000L);
    }
}
