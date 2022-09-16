package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: bba  reason: default package */
/* loaded from: classes2.dex */
public class bba implements aze {
    public static final Map c;
    private final pwu A;
    private final pwu B;
    private final pwu C;
    private final pwu D;
    private ByteBuffer E;
    private long F;
    private long G;
    private boolean H;
    private int I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f140J;
    private long K;
    private long L;
    private boolean M;
    private int N;
    private long O;
    private int P;
    private int Q;
    private int[] R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;
    private boolean aa;
    private int ab;
    private byte ac;
    private boolean ad;
    private azh ae;
    private final baw af;
    public long d;
    public long e;
    public long f;
    public bay g;
    public long h;
    public long i;
    public pwi j;
    public pwi k;
    public boolean l;
    public long m;
    public int n;
    public boolean o;
    private final bbc r;
    private final SparseArray s;
    private final boolean t;
    private final pwu u;
    private final pwu v;
    private final pwu w;
    private final pwu x;
    private final pwu y;
    private final pwu z;
    private static final byte[] p = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] a = pxi.U("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] q = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final UUID b = new UUID(72057594037932032L, -9223371306706625679L);

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        c = Collections.unmodifiableMap(hashMap);
    }

    public bba() {
        this(0);
    }

    private final int n() {
        int i = this.W;
        t();
        return i;
    }

    private final int o(azf azfVar, bay bayVar, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(bayVar.b)) {
            u(azfVar, p, i);
            return n();
        } else if ("S_TEXT/ASS".equals(bayVar.b)) {
            u(azfVar, q, i);
            return n();
        } else {
            bab babVar = bayVar.X;
            if (!this.Y) {
                if (bayVar.h) {
                    this.U &= -1073741825;
                    int i3 = 128;
                    if (!this.Z) {
                        azfVar.k(this.w.a, 0, 1);
                        this.V++;
                        byte b2 = this.w.a[0];
                        if ((b2 & 128) == 128) {
                            throw pjq.a("Extension bit is set in signal byte", null);
                        }
                        this.ac = b2;
                        this.Z = true;
                    }
                    byte b3 = this.ac;
                    if ((b3 & 1) == 1) {
                        int i4 = b3 & 2;
                        this.U |= 1073741824;
                        if (!this.ad) {
                            azfVar.k(this.B.a, 0, 8);
                            this.V += 8;
                            this.ad = true;
                            pwu pwuVar = this.w;
                            byte[] bArr = pwuVar.a;
                            if (i4 != 2) {
                                i3 = 0;
                            }
                            bArr[0] = (byte) (i3 | 8);
                            pwuVar.G(0);
                            babVar.d(this.w, 1, 1);
                            this.W++;
                            this.B.G(0);
                            babVar.d(this.B, 8, 1);
                            this.W += 8;
                        }
                        if (i4 == 2) {
                            if (!this.aa) {
                                azfVar.k(this.w.a, 0, 1);
                                this.V++;
                                this.w.G(0);
                                this.ab = this.w.i();
                                this.aa = true;
                            }
                            int i5 = this.ab * 4;
                            this.w.C(i5);
                            azfVar.k(this.w.a, 0, i5);
                            this.V += i5;
                            int i6 = (this.ab >> 1) + 1;
                            int i7 = (i6 * 6) + 2;
                            ByteBuffer byteBuffer = this.E;
                            if (byteBuffer == null || byteBuffer.capacity() < i7) {
                                this.E = ByteBuffer.allocate(i7);
                            }
                            this.E.position(0);
                            this.E.putShort((short) i6);
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                i2 = this.ab;
                                if (i8 >= i2) {
                                    break;
                                }
                                int l = this.w.l();
                                if (i8 % 2 == 0) {
                                    this.E.putShort((short) (l - i9));
                                } else {
                                    this.E.putInt(l - i9);
                                }
                                i8++;
                                i9 = l;
                            }
                            int i10 = (i - this.V) - i9;
                            if ((i2 & 1) == 1) {
                                this.E.putInt(i10);
                            } else {
                                this.E.putShort((short) i10);
                                this.E.putInt(0);
                            }
                            this.C.E(this.E.array(), i7);
                            babVar.d(this.C, i7, 1);
                            this.W += i7;
                        }
                    }
                } else {
                    byte[] bArr2 = bayVar.i;
                    if (bArr2 != null) {
                        this.z.E(bArr2, bArr2.length);
                    }
                }
                if (bayVar.f > 0) {
                    this.U |= 268435456;
                    this.D.C(0);
                    this.w.C(4);
                    pwu pwuVar2 = this.w;
                    byte[] bArr3 = pwuVar2.a;
                    bArr3[0] = (byte) ((i >> 24) & PrivateKeyType.INVALID);
                    bArr3[1] = (byte) ((i >> 16) & PrivateKeyType.INVALID);
                    bArr3[2] = (byte) ((i >> 8) & PrivateKeyType.INVALID);
                    bArr3[3] = (byte) (i & PrivateKeyType.INVALID);
                    babVar.d(pwuVar2, 4, 2);
                    this.W += 4;
                }
                this.Y = true;
            }
            int i11 = i + this.z.c;
            if ("V_MPEG4/ISO/AVC".equals(bayVar.b) || "V_MPEGH/ISO/HEVC".equals(bayVar.b)) {
                byte[] bArr4 = this.v.a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i12 = bayVar.Y;
                int i13 = 4 - i12;
                while (this.V < i11) {
                    int i14 = this.X;
                    if (i14 == 0) {
                        int min = Math.min(i12, this.z.a());
                        azfVar.k(bArr4, i13 + min, i12 - min);
                        if (min > 0) {
                            this.z.B(bArr4, i13, min);
                        }
                        this.V += i12;
                        this.v.G(0);
                        this.X = this.v.l();
                        this.u.G(0);
                        babVar.c(this.u, 4);
                        this.W += 4;
                    } else {
                        int p2 = p(azfVar, babVar, i14);
                        this.V += p2;
                        this.W += p2;
                        this.X -= p2;
                    }
                }
            } else {
                if (bayVar.T != null) {
                    ptx.e(this.z.c == 0);
                    baz bazVar = bayVar.T;
                    if (!bazVar.b) {
                        azfVar.j(bazVar.a, 0, 10);
                        azfVar.l();
                        if (ayn.b(bazVar.a) != 0) {
                            bazVar.b = true;
                        }
                    }
                }
                while (true) {
                    int i15 = this.V;
                    if (i15 >= i11) {
                        break;
                    }
                    int p3 = p(azfVar, babVar, i11 - i15);
                    this.V += p3;
                    this.W += p3;
                }
            }
            if ("A_VORBIS".equals(bayVar.b)) {
                this.x.G(0);
                babVar.c(this.x, 4);
                this.W += 4;
            }
            return n();
        }
    }

    private final int p(azf azfVar, bab babVar, int i) {
        int a2 = this.z.a();
        if (a2 > 0) {
            int min = Math.min(i, a2);
            babVar.c(this.z, min);
            return min;
        }
        return babVar.a(azfVar, i, false);
    }

    private final void q() {
        ptx.b(this.ae);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd A[EDGE_INSN: B:60:0x00cd->B:49:0x00cd ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r(defpackage.bay r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bba.r(bay, long, int, int, int):void");
    }

    private final void s(azf azfVar, int i) {
        pwu pwuVar = this.w;
        if (pwuVar.c >= i) {
            return;
        }
        if (pwuVar.b() < i) {
            pwu pwuVar2 = this.w;
            int b2 = pwuVar2.b();
            pwuVar2.z(Math.max(b2 + b2, i));
        }
        pwu pwuVar3 = this.w;
        byte[] bArr = pwuVar3.a;
        int i2 = pwuVar3.c;
        azfVar.k(bArr, i2, i - i2);
        this.w.F(i);
    }

    private final void t() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.aa = false;
        this.ab = 0;
        this.ac = (byte) 0;
        this.ad = false;
        this.z.C(0);
    }

    private final void u(azf azfVar, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = i + 32;
        if (this.A.b() < i2) {
            this.A.D(Arrays.copyOf(bArr, i2 + i));
        } else {
            System.arraycopy(bArr, 0, this.A.a, 0, 32);
        }
        azfVar.k(this.A.a, 32, i);
        this.A.G(0);
        this.A.F(i2);
    }

    private static byte[] v(long j, String str, long j2) {
        ptx.c(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return pxi.U(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    private static int[] w(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public final bay c(int i) {
        j(i);
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x03f4, code lost:
        throw defpackage.pjq.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
        if (r5 == 1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v42, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r29v0, types: [azf] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64, types: [int] */
    /* JADX WARN: Type inference failed for: r3v65, types: [int] */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r5v75, types: [bbc] */
    /* JADX WARN: Type inference failed for: r5v76, types: [bbc] */
    /* JADX WARN: Type inference failed for: r6v22, types: [bbc] */
    /* JADX WARN: Type inference failed for: r6v26, types: [pwu] */
    /* JADX WARN: Type inference failed for: r6v47, types: [pwu] */
    @Override // defpackage.aze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.azf r29, defpackage.azv r30) {
        /*
            Method dump skipped, instructions count: 2218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bba.d(azf, azv):int");
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.ae = azhVar;
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public void g(long j, long j2) {
        this.i = -9223372036854775807L;
        this.N = 0;
        baw bawVar = this.af;
        bawVar.d = 0;
        bawVar.b.clear();
        bawVar.c.d();
        this.r.d();
        t();
        for (int i = 0; i < this.s.size(); i++) {
            baz bazVar = ((bay) this.s.valueAt(i)).T;
            if (bazVar != null) {
                bazVar.b = false;
                bazVar.c = 0;
            }
        }
    }

    @Override // defpackage.aze
    public final boolean h(azf azfVar) {
        bbb bbbVar = new bbb();
        long j = ((aza) azfVar).b;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        azfVar.j(bbbVar.a.a, 0, 4);
        long p2 = bbbVar.a.p();
        bbbVar.b = 4;
        while (true) {
            if (p2 != 440786851) {
                int i2 = bbbVar.b + 1;
                bbbVar.b = i2;
                if (i2 == i) {
                    break;
                }
                azfVar.j(bbbVar.a.a, 0, 1);
                p2 = ((p2 << 8) & (-256)) | (bbbVar.a.a[0] & 255);
            } else {
                long a2 = bbbVar.a(azfVar);
                long j3 = bbbVar.b;
                if (a2 != Long.MIN_VALUE && (j == -1 || j3 + a2 < j)) {
                    while (true) {
                        long j4 = bbbVar.b;
                        long j5 = j3 + a2;
                        if (j4 < j5) {
                            if (bbbVar.a(azfVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long a3 = bbbVar.a(azfVar);
                            if (a3 < 0) {
                                break;
                            } else if (a3 != 0) {
                                int i3 = (int) a3;
                                azfVar.f(i3);
                                bbbVar.b += i3;
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

    public final void i(int i) {
        if (this.j == null || this.k == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw pjq.a(sb.toString(), null);
        }
    }

    public final void j(int i) {
        if (this.g != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw pjq.a(sb.toString(), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:420:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0811  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(int r21) {
        /*
            Method dump skipped, instructions count: 2750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bba.k(int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(int i, long j, long j2) {
        q();
        if (i == 160) {
            this.o = false;
        } else if (i == 174) {
            this.g = new bay();
        } else if (i == 187) {
            this.l = false;
        } else if (i == 19899) {
            this.I = -1;
            this.h = -1L;
        } else if (i == 20533) {
            c(i).h = true;
        } else if (i == 21968) {
            c(i).x = true;
        } else if (i == 408125543) {
            long j3 = this.d;
            if (j3 != -1 && j3 != j) {
                throw pjq.a("Multiple Segment elements not supported", null);
            }
            this.d = j;
            this.F = j2;
        } else if (i == 475249515) {
            this.j = new pwi();
            this.k = new pwi();
        } else if (i != 524531317 || this.H) {
        } else {
            if (this.t && this.K != -1) {
                this.f140J = true;
                return;
            }
            this.ae.ry(new azx(this.G));
            this.H = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(int i, String str) {
        if (i == 134) {
            c(i).b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                c(i).a = str;
            } else if (i != 2274716) {
            } else {
                c(i).W = str;
            }
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw pjq.a(sb.toString(), null);
        }
    }

    public bba(int i) {
        baw bawVar = new baw();
        this.d = -1L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.G = -9223372036854775807L;
        this.K = -1L;
        this.L = -1L;
        this.i = -9223372036854775807L;
        this.af = bawVar;
        bawVar.g = new bax(this);
        this.t = 1 == (i ^ 1);
        this.r = new bbc();
        this.s = new SparseArray();
        this.w = new pwu(4);
        this.x = new pwu(ByteBuffer.allocate(4).putInt(-1).array());
        this.y = new pwu(4);
        this.u = new pwu(pwo.a);
        this.v = new pwu(4);
        this.z = new pwu();
        this.A = new pwu();
        this.B = new pwu(8);
        this.C = new pwu();
        this.D = new pwu();
        this.R = new int[1];
    }

    public final long b(long j) {
        long j2 = this.e;
        if (j2 == -9223372036854775807L) {
            throw pjq.a("Can't scale timecode prior to timecodeScale being set.", null);
        }
        return pxi.n(j, j2, 1000L);
    }
}
