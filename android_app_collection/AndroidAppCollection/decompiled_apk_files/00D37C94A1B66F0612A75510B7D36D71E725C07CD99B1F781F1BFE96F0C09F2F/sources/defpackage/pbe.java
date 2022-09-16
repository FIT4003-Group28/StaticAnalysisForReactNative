package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: pbe  reason: default package */
/* loaded from: classes4.dex */
public class pbe implements oxq {
    private final boolean A;
    private final pct B;
    private final pct C;
    private final pct D;
    private final pct E;
    private final pct F;
    private final pct G;
    private final pct H;
    private final pct I;

    /* renamed from: J  reason: collision with root package name */
    private final pct f252J;
    private ByteBuffer K;
    private boolean L;
    private long M;
    private long N;
    private boolean O;
    private long P;
    private int Q;
    private int R;
    private int[] S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private byte Z;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    public final SparseArray b;
    public final boolean c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public pbd i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public long n;
    public pck o;
    public pck p;
    public int q;
    public long r;
    public int s;
    public int t;
    public boolean u;
    public oxr v;
    private final paz y;
    private final pbb z;
    private static final byte[] w = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] x = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final UUID a = new UUID(72057594037932032L, -9223371306706625679L);

    public pbe() {
        this(new pay(), 0);
    }

    private final void k() {
        this.U = 0;
        this.ac = 0;
        this.ab = 0;
        this.V = false;
        this.W = false;
        this.Y = false;
        this.aa = 0;
        this.Z = (byte) 0;
        this.X = false;
        this.G.v();
    }

    private static int[] l(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    private final int m(oxn oxnVar, oyf oyfVar, int i) {
        int j;
        int a2 = this.G.a();
        if (a2 > 0) {
            j = Math.min(i, a2);
            oyfVar.f(this.G, j);
        } else {
            j = oyfVar.j(oxnVar, i, false);
        }
        this.U += j;
        this.ac += j;
        return j;
    }

    private final void n(oxn oxnVar, int i) {
        pct pctVar = this.D;
        if (pctVar.c >= i) {
            return;
        }
        if (pctVar.b() < i) {
            pct pctVar2 = this.D;
            byte[] bArr = pctVar2.a;
            int length = bArr.length;
            pctVar2.x(Arrays.copyOf(bArr, Math.max(length + length, i)), this.D.c);
        }
        pct pctVar3 = this.D;
        byte[] bArr2 = pctVar3.a;
        int i2 = pctVar3.c;
        oxnVar.h(bArr2, i2, i - i2);
        this.D.y(i);
    }

    private final void o(oxn oxnVar, pbd pbdVar, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(pbdVar.a)) {
            int i3 = i + 32;
            if (this.H.b() < i3) {
                this.H.a = Arrays.copyOf(w, i3 + i);
            }
            oxnVar.h(this.H.a, 32, i);
            this.H.z(0);
            this.H.y(i3);
            return;
        }
        oyf oyfVar = pbdVar.L;
        if (!this.V) {
            if (pbdVar.e) {
                this.t &= -3;
                int i4 = 128;
                if (!this.W) {
                    oxnVar.h(this.D.a, 0, 1);
                    this.U++;
                    byte b = this.D.a[0];
                    if ((b & 128) != 128) {
                        this.Z = b;
                        this.W = true;
                    } else {
                        throw new ouf("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.Z;
                if ((b2 & 1) == 1) {
                    int i5 = b2 & 2;
                    this.t |= 2;
                    if (!this.X) {
                        oxnVar.h(this.I.a, 0, 8);
                        this.U += 8;
                        this.X = true;
                        pct pctVar = this.D;
                        byte[] bArr = pctVar.a;
                        if (i5 != 2) {
                            i4 = 0;
                        }
                        bArr[0] = (byte) (i4 | 8);
                        pctVar.z(0);
                        oyfVar.f(this.D, 1);
                        this.ac++;
                        this.I.z(0);
                        oyfVar.f(this.I, 8);
                        this.ac += 8;
                    }
                    if (i5 == 2) {
                        if (!this.Y) {
                            oxnVar.h(this.D.a, 0, 1);
                            this.U++;
                            this.D.z(0);
                            this.aa = this.D.h();
                            this.Y = true;
                        }
                        int i6 = this.aa * 4;
                        pct pctVar2 = this.D;
                        if (pctVar2.c < i6) {
                            pctVar2.x(new byte[i6], i6);
                        }
                        oxnVar.h(this.D.a, 0, i6);
                        this.U += i6;
                        this.D.z(0);
                        this.D.y(i6);
                        int i7 = (this.aa >> 1) + 1;
                        int i8 = (i7 * 6) + 2;
                        ByteBuffer byteBuffer = this.K;
                        if (byteBuffer == null || byteBuffer.capacity() < i8) {
                            this.K = ByteBuffer.allocate(i8);
                        }
                        this.K.position(0);
                        this.K.putShort((short) i7);
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            i2 = this.aa;
                            if (i9 >= i2) {
                                break;
                            }
                            int j = this.D.j();
                            if (i9 % 2 == 0) {
                                this.K.putShort((short) (j - i10));
                            } else {
                                this.K.putInt(j - i10);
                            }
                            i9++;
                            i10 = j;
                        }
                        int i11 = (i - this.U) - i10;
                        if ((i2 & 1) == 1) {
                            this.K.putInt(i11);
                        } else {
                            this.K.putShort((short) i11);
                            this.K.putInt(0);
                        }
                        this.f252J.x(this.K.array(), i8);
                        oyfVar.f(this.f252J, i8);
                        this.ac += i8;
                    }
                }
            } else {
                byte[] bArr2 = pbdVar.f;
                if (bArr2 != null) {
                    this.G.x(bArr2, bArr2.length);
                }
            }
            this.V = true;
        }
        int i12 = i + this.G.c;
        if (!"V_MPEG4/ISO/AVC".equals(pbdVar.a) && !"V_MPEGH/ISO/HEVC".equals(pbdVar.a)) {
            while (true) {
                int i13 = this.U;
                if (i13 >= i12) {
                    break;
                }
                m(oxnVar, oyfVar, i12 - i13);
            }
        } else {
            byte[] bArr3 = this.C.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i14 = pbdVar.M;
            int i15 = 4 - i14;
            while (this.U < i12) {
                int i16 = this.ab;
                if (i16 == 0) {
                    int min = Math.min(i14, this.G.a());
                    oxnVar.h(bArr3, i15 + min, i14 - min);
                    if (min > 0) {
                        this.G.u(bArr3, i15, min);
                    }
                    this.U += i14;
                    this.C.z(0);
                    this.ab = this.C.j();
                    this.B.z(0);
                    oyfVar.f(this.B, 4);
                    this.ac += 4;
                } else {
                    this.ab = i16 - m(oxnVar, oyfVar, i16);
                }
            }
        }
        if (!"A_VORBIS".equals(pbdVar.a)) {
            return;
        }
        this.E.z(0);
        oyfVar.f(this.E, 4);
        this.ac += 4;
    }

    @Override // defpackage.oxq
    public final void a(oxr oxrVar) {
        this.v = oxrVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(int i) {
        switch (i) {
            case 131:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
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
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
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
                return 5;
            default:
                return 0;
        }
    }

    @Override // defpackage.oxq
    public final void d() {
        this.N = -1L;
        this.q = 0;
        this.y.a();
        this.z.c();
        k();
    }

    @Override // defpackage.oxq
    public final int e(oxn oxnVar, oxz oxzVar) {
        this.ad = false;
        while (!this.ad) {
            if (!this.y.b(oxnVar)) {
                return -1;
            }
            long j = oxnVar.c;
            if (this.L) {
                this.M = j;
                oxzVar.a = this.n;
                this.L = false;
                return 1;
            } else if (this.k) {
                long j2 = this.M;
                if (j2 != -1) {
                    oxzVar.a = j2;
                    this.M = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
        return false;
     */
    @Override // defpackage.oxq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.oxn r15) {
        /*
            r14 = this;
            pba r0 = new pba
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
            pct r5 = r0.a
            byte[] r5 = r5.a
            r7 = 0
            r8 = 4
            r15.g(r5, r7, r8)
            pct r5 = r0.a
            long r9 = r5.n()
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
            goto L9a
        L37:
            pct r8 = r0.a
            byte[] r8 = r8.a
            r15.g(r8, r7, r5)
            r5 = 8
            long r8 = r9 << r5
            r10 = -256(0xffffffffffffff00, double:NaN)
            long r8 = r8 & r10
            pct r5 = r0.a
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
            if (r6 == 0) goto L9a
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L63
            goto L6a
        L63:
            long r3 = r10 + r8
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 < 0) goto L6a
            goto L9a
        L6a:
            int r1 = r0.b
            long r1 = (long) r1
            long r3 = r10 + r8
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L95
            long r1 = r0.a(r15)
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 == 0) goto L9a
            long r1 = r0.a(r15)
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L9a
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L6a
            int r3 = (int) r1
            r15.e(r3)
            int r3 = r0.b
            long r3 = (long) r3
            long r3 = r3 + r1
            int r1 = (int) r3
            r0.b = r1
            goto L6a
        L95:
            int r15 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r15 != 0) goto L9a
            return r5
        L9a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbe.f(oxn):boolean");
    }

    public final void g(pbd pbdVar, long j) {
        int i;
        byte[] bytes;
        if ("S_TEXT/UTF8".equals(pbdVar.a)) {
            byte[] bArr = this.H.a;
            long j2 = this.P;
            if (j2 == -1) {
                bytes = x;
            } else {
                int i2 = (int) (j2 / 3600000000L);
                long j3 = j2 - (i2 * 3600000000L);
                int i3 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i3);
                bytes = String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (i * 1000000)) / 1000))).getBytes();
            }
            System.arraycopy(bytes, 0, bArr, 19, 12);
            oyf oyfVar = pbdVar.L;
            pct pctVar = this.H;
            oyfVar.f(pctVar, pctVar.c);
            this.ac += this.H.c;
        }
        pbdVar.L.g(j, this.t, this.ac, 0, pbdVar.g);
        this.ad = true;
        k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(int i, long j, long j2) {
        if (i == 160) {
            this.u = false;
        } else if (i == 174) {
            this.i = new pbd();
        } else if (i == 187) {
            this.O = false;
        } else if (i == 19899) {
            this.l = -1;
            this.m = -1L;
        } else if (i == 20533) {
            this.i.e = true;
        } else if (i == 21968) {
            this.i.p = true;
        } else if (i == 408125543) {
            long j3 = this.d;
            if (j3 != -1 && j3 != j) {
                throw new ouf("Multiple Segment elements not supported");
            }
            this.d = j;
            this.e = j2;
        } else if (i == 475249515) {
            this.o = new pck();
            this.p = new pck();
        } else if (i != 524531317 || this.k) {
        } else {
            if (this.A && this.n != -1) {
                this.L = true;
                return;
            }
            this.v.pS(oye.f);
            this.k = true;
        }
    }

    public pbe(int i) {
        this(new pay(), i);
    }

    public final long c(long j) {
        long j2 = this.f;
        if (j2 == -1) {
            throw new ouf("Can't scale timecode prior to timecodeScale being set.");
        }
        return pcx.i(j, j2, 1000L);
    }

    public pbe(paz pazVar, int i) {
        this.d = -1L;
        this.e = -1L;
        this.f = -1L;
        this.g = -1L;
        this.h = -1L;
        this.n = -1L;
        this.M = -1L;
        this.N = -1L;
        this.y = pazVar;
        pazVar.c(new pbc(this));
        boolean z = true;
        this.A = 1 == ((i & 1) ^ 1);
        this.c = (i & 2) == 0 ? false : z;
        this.z = new pbb();
        this.b = new SparseArray();
        this.D = new pct(4);
        this.E = new pct(ByteBuffer.allocate(4).putInt(-1).array());
        this.F = new pct(4);
        this.B = new pct(pcr.a);
        this.C = new pct(4);
        this.G = new pct();
        this.H = new pct();
        this.I = new pct(8);
        this.f252J = new pct();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw new ouf(sb.toString());
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw new ouf(sb2.toString());
        } else {
            switch (i) {
                case 131:
                    this.i.c = (int) j;
                    return;
                case 155:
                    this.P = c(j);
                    return;
                case 159:
                    this.i.F = (int) j;
                    return;
                case 176:
                    this.i.i = (int) j;
                    return;
                case 179:
                    this.o.b(c(j));
                    return;
                case 186:
                    this.i.j = (int) j;
                    return;
                case 215:
                    this.i.b = (int) j;
                    return;
                case 231:
                    this.N = c(j);
                    return;
                case 241:
                    if (this.O) {
                        return;
                    }
                    this.p.b(j);
                    this.O = true;
                    return;
                case 251:
                    this.u = true;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("ContentCompAlgo ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new ouf(sb3.toString());
                case 17029:
                    if (j >= 1 && j <= 2) {
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw new ouf(sb4.toString());
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    StringBuilder sb5 = new StringBuilder(50);
                    sb5.append("EBMLReadVersion ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new ouf(sb5.toString());
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder(49);
                    sb6.append("ContentEncAlgo ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new ouf(sb6.toString());
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder(56);
                    sb7.append("AESSettingsCipherMode ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new ouf(sb7.toString());
                case 21420:
                    this.m = j + this.d;
                    return;
                case 21432:
                    int i2 = (int) j;
                    if (i2 == 0) {
                        this.i.o = 0;
                        return;
                    } else if (i2 == 1) {
                        this.i.o = 2;
                        return;
                    } else if (i2 == 3) {
                        this.i.o = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.i.o = 3;
                        return;
                    }
                case 21680:
                    this.i.k = (int) j;
                    return;
                case 21682:
                    this.i.m = (int) j;
                    return;
                case 21690:
                    this.i.l = (int) j;
                    return;
                case 22186:
                    this.i.I = j;
                    return;
                case 22203:
                    this.i.f251J = j;
                    return;
                case 25188:
                    this.i.G = (int) j;
                    return;
                case 2352003:
                    this.i.d = (int) j;
                    return;
                case 2807729:
                    this.f = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            int i3 = (int) j;
                            if (i3 == 1) {
                                this.i.s = 2;
                                return;
                            } else if (i3 != 2) {
                                return;
                            } else {
                                this.i.s = 1;
                                return;
                            }
                        case 21946:
                            int i4 = (int) j;
                            if (i4 != 1) {
                                if (i4 == 16) {
                                    this.i.r = 6;
                                    return;
                                } else if (i4 == 18) {
                                    this.i.r = 7;
                                    return;
                                } else if (i4 != 6 && i4 != 7) {
                                    return;
                                }
                            }
                            this.i.r = 3;
                            return;
                        case 21947:
                            pbd pbdVar = this.i;
                            pbdVar.p = true;
                            int i5 = (int) j;
                            if (i5 == 1) {
                                pbdVar.q = 1;
                                return;
                            } else if (i5 == 9) {
                                pbdVar.q = 6;
                                return;
                            } else if (i5 != 4 && i5 != 5 && i5 != 6 && i5 != 7) {
                                return;
                            } else {
                                pbdVar.q = 2;
                                return;
                            }
                        case 21948:
                            this.i.t = (int) j;
                            return;
                        case 21949:
                            this.i.u = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ef, code lost:
        throw new defpackage.ouf("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(int r21, int r22, defpackage.oxn r23) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbe.j(int, int, oxn):void");
    }
}
