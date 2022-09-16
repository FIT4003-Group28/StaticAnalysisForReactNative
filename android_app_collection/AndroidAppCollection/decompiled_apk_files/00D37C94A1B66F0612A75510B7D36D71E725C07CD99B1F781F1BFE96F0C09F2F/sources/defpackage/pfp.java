package defpackage;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: pfp  reason: default package */
/* loaded from: classes4.dex */
public class pfp implements pev {
    private static final byte[] b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final Format c;
    private pfo A;
    private int B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private azh G;
    private bab[] H;
    private bab[] I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f255J;
    public pew a;
    private pes d;
    private pet e;
    private final List f;
    private final SparseArray g;
    private final pwu h;
    private final pwu i;
    private final pwu j;
    private final byte[] k;
    private final pwu l;
    private final por m;
    private final pwu n;
    private final ArrayDeque o;
    private final ArrayDeque p;
    private int q;
    private int r;
    private long s;
    private int t;
    private pwu u;
    private long v;
    private int w;
    private long x;
    private long y;
    private long z;

    static {
        pis pisVar = new pis();
        pisVar.k = "application/x-emsg";
        c = pisVar.a();
    }

    public pfp() {
        this(Collections.emptyList());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.drm.DrmInitData c(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto Lb5
            java.lang.Object r5 = r14.get(r3)
            pfi r5 = (defpackage.pfi) r5
            int r6 = r5.d
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lb1
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            pwu r5 = r5.a
            byte[] r5 = r5.a
            pwu r6 = new pwu
            r6.<init>(r5)
            int r8 = r6.c
            r9 = 32
            if (r8 >= r9) goto L2f
        L2d:
            r6 = r2
            goto L97
        L2f:
            r6.G(r1)
            int r8 = r6.d()
            int r9 = r6.a()
            int r9 = r9 + 4
            if (r8 == r9) goto L3f
            goto L2d
        L3f:
            int r8 = r6.d()
            if (r8 == r7) goto L46
            goto L2d
        L46:
            int r7 = r6.d()
            int r7 = defpackage.pfj.d(r7)
            r8 = 1
            if (r7 <= r8) goto L6a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 37
            r6.<init>(r8)
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L2d
        L6a:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.o()
            long r12 = r6.o()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L82
            int r7 = r6.l()
            int r7 = r7 * 16
            r6.H(r7)
        L82:
            int r7 = r6.l()
            int r8 = r6.a()
            if (r7 == r8) goto L8d
            goto L2d
        L8d:
            byte[] r8 = new byte[r7]
            r6.B(r8, r1, r7)
            pfr r6 = new pfr
            r6.<init>(r9)
        L97:
            if (r6 != 0) goto L9b
            r6 = r2
            goto L9d
        L9b:
            java.util.UUID r6 = r6.a
        L9d:
            if (r6 != 0) goto La7
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lb1
        La7:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r7 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5)
            r4.add(r7)
        Lb1:
            int r3 = r3 + 1
            goto L8
        Lb5:
            if (r4 != 0) goto Lb8
            return r2
        Lb8:
            com.google.android.exoplayer2.drm.DrmInitData r14 = new com.google.android.exoplayer2.drm.DrmInitData
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfp.c(java.util.List):com.google.android.exoplayer2.drm.DrmInitData");
    }

    private final void i() {
        this.q = 0;
        this.t = 0;
    }

    private static void j(pwu pwuVar, int i, pfv pfvVar) {
        pwuVar.G(i + 8);
        int c2 = pfj.c(pwuVar.d());
        if ((c2 & 1) != 0) {
            throw pjq.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (c2 & 2) != 0;
        int l = pwuVar.l();
        int i2 = pfvVar.e;
        if (l != i2) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(l);
            sb.append(", ");
            sb.append(i2);
            throw pjq.a(sb.toString(), null);
        }
        Arrays.fill(pfvVar.n, 0, l, z);
        pfvVar.b(pwuVar.a());
        pwu pwuVar2 = pfvVar.p;
        pwuVar.B(pwuVar2.a, 0, pwuVar2.c);
        pfvVar.p.G(0);
        pfvVar.q = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0634  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k(long r50) {
        /*
            Method dump skipped, instructions count: 1851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfp.k(long):void");
    }

    private final void l(peu peuVar) {
        long j;
        String str;
        long n;
        String str2;
        long p;
        long j2;
        bab[] babVarArr;
        long q;
        long q2;
        int i = ((int) this.s) - this.t;
        pwu pwuVar = this.u;
        if (pwuVar != null) {
            if (!peuVar.i(pwuVar.a, 8, i)) {
                return;
            }
            pfi pfiVar = new pfi(this.r, this.u);
            long b2 = peuVar.b();
            if (!this.o.isEmpty()) {
                ((pfh) this.o.peek()).b.add(pfiVar);
            } else {
                int i2 = pfiVar.d;
                int i3 = 0;
                if (i2 == 1936286840) {
                    pwu pwuVar2 = pfiVar.a;
                    pwuVar2.G(8);
                    int d = pwuVar2.d();
                    pwuVar2.H(4);
                    long p2 = pwuVar2.p();
                    if (pfj.d(d) == 0) {
                        q = pwuVar2.p();
                        q2 = pwuVar2.p();
                    } else {
                        q = pwuVar2.q();
                        q2 = pwuVar2.q();
                    }
                    long j3 = b2 + q2;
                    long j4 = q;
                    long n2 = pxi.n(j4, 1000000L, p2);
                    pwuVar2.H(2);
                    int m = pwuVar2.m();
                    int[] iArr = new int[m];
                    long[] jArr = new long[m];
                    long[] jArr2 = new long[m];
                    long[] jArr3 = new long[m];
                    long j5 = n2;
                    while (i3 < m) {
                        int d2 = pwuVar2.d();
                        if ((d2 & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) == 0) {
                            long p3 = pwuVar2.p();
                            iArr[i3] = d2 & Integer.MAX_VALUE;
                            jArr[i3] = j3;
                            jArr3[i3] = j5;
                            j4 += p3;
                            long[] jArr4 = jArr3;
                            long[] jArr5 = jArr2;
                            j5 = pxi.n(j4, 1000000L, p2);
                            jArr5[i3] = j5 - jArr4[i3];
                            pwuVar2.H(4);
                            j3 += iArr[i3];
                            i3++;
                            jArr2 = jArr5;
                            jArr3 = jArr4;
                            jArr = jArr;
                        } else {
                            throw pjq.a("Unhandled indirect reference", null);
                        }
                    }
                    Pair create = Pair.create(Long.valueOf(n2), new ayy(iArr, jArr, jArr2, jArr3));
                    this.z = ((Long) create.first).longValue();
                    this.G.ry((azy) create.second);
                    this.f255J = true;
                } else if (i2 == 1701671783) {
                    pwu pwuVar3 = pfiVar.a;
                    bab[] babVarArr2 = this.H;
                    if (babVarArr2 != null && babVarArr2.length != 0) {
                        pwuVar3.G(8);
                        int d3 = pfj.d(pwuVar3.d());
                        if (d3 == 0) {
                            String t = pwuVar3.t();
                            ptx.a(t);
                            String t2 = pwuVar3.t();
                            ptx.a(t2);
                            long p4 = pwuVar3.p();
                            long n3 = pxi.n(pwuVar3.p(), 1000000L, p4);
                            long j6 = this.z;
                            j = j6 != -9223372036854775807L ? j6 + n3 : -9223372036854775807L;
                            str = t;
                            n = pxi.n(pwuVar3.p(), 1000L, p4);
                            str2 = t2;
                            p = pwuVar3.p();
                            j2 = n3;
                        } else if (d3 == 1) {
                            long p5 = pwuVar3.p();
                            long n4 = pxi.n(pwuVar3.q(), 1000000L, p5);
                            long n5 = pxi.n(pwuVar3.p(), 1000L, p5);
                            long p6 = pwuVar3.p();
                            String t3 = pwuVar3.t();
                            ptx.a(t3);
                            String t4 = pwuVar3.t();
                            ptx.a(t4);
                            str = t3;
                            n = n5;
                            str2 = t4;
                            p = p6;
                            j = n4;
                            j2 = -9223372036854775807L;
                        } else {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append("Skipping unsupported emsg version: ");
                            sb.append(d3);
                            Log.w("FragmentedMp4Extractor", sb.toString());
                        }
                        byte[] bArr = new byte[pwuVar3.a()];
                        pwuVar3.B(bArr, 0, pwuVar3.a());
                        pwu pwuVar4 = new pwu(this.m.a(new EventMessage(str, str2, n, p, bArr)));
                        int a = pwuVar4.a();
                        for (bab babVar : this.H) {
                            pwuVar4.G(0);
                            babVar.c(pwuVar4, a);
                        }
                        if (j == -9223372036854775807L) {
                            this.p.addLast(new pfn(j2, a));
                            this.w += a;
                        } else {
                            bab[] babVarArr3 = this.H;
                            int length = babVarArr3.length;
                            while (i3 < length) {
                                babVarArr3[i3].e(j, 1, a, 0, null);
                                i3++;
                            }
                        }
                    }
                }
            }
        } else if (!peuVar.j(i)) {
            return;
        }
        k(peuVar.b());
    }

    private final void m(peu peuVar) {
        int size = this.g.size();
        long j = Long.MAX_VALUE;
        pfo pfoVar = null;
        for (int i = 0; i < size; i++) {
            pfv pfvVar = ((pfo) this.g.valueAt(i)).b;
            if (pfvVar.q) {
                long j2 = pfvVar.c;
                if (j2 < j) {
                    pfoVar = (pfo) this.g.valueAt(i);
                    j = j2;
                }
            }
        }
        if (pfoVar == null) {
            this.q = 3;
            return;
        }
        int b2 = (int) (j - peuVar.b());
        if (b2 < 0) {
            throw pjq.a("Offset to encryption data was negative.", null);
        }
        if (!peuVar.j(b2)) {
            return;
        }
        pfv pfvVar2 = pfoVar.b;
        pwu pwuVar = pfvVar2.p;
        peuVar.i(pwuVar.a, 0, pwuVar.c);
        pfvVar2.p.G(0);
        pfvVar2.q = false;
    }

    private final boolean n(peu peuVar) {
        if (this.t == 0) {
            if (peuVar.a() != -1 && peuVar.a() == peuVar.b()) {
                return false;
            }
            try {
                if (peuVar.i(this.n.a, 0, 8)) {
                    this.t = 8;
                    this.n.G(0);
                    this.s = this.n.p();
                    this.r = this.n.d();
                }
            } catch (EOFException unused) {
            }
            return false;
        }
        long j = this.s;
        if (j == 1) {
            if (!peuVar.i(this.n.a, 8, 8)) {
                return false;
            }
            this.t += 8;
            this.s = this.n.q();
        } else if (j == 0) {
            long a = peuVar.a();
            if (a == -1 && !this.o.isEmpty()) {
                a = ((pfh) this.o.peek()).a;
            }
            if (a != -1) {
                this.s = (a - peuVar.b()) + this.t;
            }
        }
        if (this.s < this.t) {
            throw pjq.c("Atom size less than header length (unsupported).");
        }
        long b2 = peuVar.b() - this.t;
        if (this.r == 1836019558) {
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                pfv pfvVar = ((pfo) this.g.valueAt(i)).b;
                pfvVar.c = b2;
                pfvVar.b = b2;
            }
        }
        int i2 = this.r;
        if (i2 == 1835295092) {
            this.A = null;
            this.v = this.s + b2;
            if (!this.f255J) {
                this.G.ry(new azx(this.y, b2));
                this.f255J = true;
            }
            this.q = 2;
            return true;
        }
        if (i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227) {
            long b3 = (peuVar.b() + this.s) - 8;
            this.o.push(new pfh(this.r, b3));
            if (this.s == this.t) {
                k(b3);
            } else {
                i();
            }
        } else if (i2 == 1751411826 || i2 == 1835296868 || i2 == 1836476516 || i2 == 1936286840 || i2 == 1937011556 || i2 == 1952867444 || i2 == 1952868452 || i2 == 1953196132 || i2 == 1953654136 || i2 == 1953658222 || i2 == 1886614376 || i2 == 1935763834 || i2 == 1935763823 || i2 == 1936027235 || i2 == 1970628964 || i2 == 1935828848 || i2 == 1936158820 || i2 == 1701606260 || i2 == 1835362404 || i2 == 1701671783) {
            if (this.t == 8) {
                long j2 = this.s;
                if (j2 > 2147483647L) {
                    throw pjq.c("Leaf atom with length > 2147483647 (unsupported).");
                }
                this.u = new pwu((int) j2);
                System.arraycopy(this.n.a, 0, this.u.a, 0, 8);
                this.q = 1;
            } else {
                throw pjq.c("Leaf atom defines extended atom size (unsupported).");
            }
        } else if (this.s > 2147483647L) {
            throw pjq.c("Skipping atom with length > 2147483647 (unsupported).");
        } else {
            this.u = null;
            this.q = 1;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    private final boolean o(peu peuVar) {
        int a;
        boolean z;
        baa baaVar;
        int a2;
        Throwable th = null;
        int i = 1;
        ?? r7 = 0;
        if (this.q == 3) {
            if (this.A == null) {
                SparseArray sparseArray = this.g;
                int size = sparseArray.size();
                long j = Long.MAX_VALUE;
                pfo pfoVar = null;
                for (int i2 = 0; i2 < size; i2++) {
                    pfo pfoVar2 = (pfo) sparseArray.valueAt(i2);
                    int i3 = pfoVar2.h;
                    pfv pfvVar = pfoVar2.b;
                    if (i3 != pfvVar.d) {
                        long j2 = pfvVar.f[i3];
                        if (j2 < j) {
                            pfoVar = pfoVar2;
                            j = j2;
                        }
                    }
                }
                if (pfoVar == null) {
                    int b2 = (int) (this.v - peuVar.b());
                    if (b2 < 0) {
                        throw pjq.a("Offset to end of mdat was negative.", null);
                    }
                    if (!peuVar.j(b2)) {
                        return false;
                    }
                    i();
                    return false;
                }
                int b3 = (int) (pfoVar.b.f[pfoVar.h] - peuVar.b());
                if (b3 < 0) {
                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    b3 = 0;
                }
                if (!peuVar.j(b3)) {
                    return false;
                }
                this.A = pfoVar;
            }
            pfo pfoVar3 = this.A;
            pfv pfvVar2 = pfoVar3.b;
            int[] iArr = pfvVar2.i;
            int i4 = pfoVar3.f;
            this.B = iArr[i4];
            int i5 = pfvVar2.h[i4];
            this.C = i5;
            if (i4 < pfoVar3.i) {
                if (!peuVar.j(i5)) {
                    return false;
                }
                pfo pfoVar4 = this.A;
                pfu b4 = pfoVar4.b();
                if (b4 != null) {
                    pwu pwuVar = pfoVar4.b.p;
                    int i6 = b4.d;
                    if (i6 != 0) {
                        pwuVar.H(i6);
                    }
                    if (pfoVar4.b.c(pfoVar4.f)) {
                        pwuVar.H(pwuVar.m() * 6);
                    }
                }
                if (!this.A.e()) {
                    this.A = null;
                }
                this.q = 3;
                return true;
            }
            if (pfoVar3.d.g == 1) {
                this.C = i5 - 8;
                if (!peuVar.j(8)) {
                    return false;
                }
            }
            if ("audio/ac4".equals(this.A.d.f.l)) {
                this.D = this.A.a(this.C, 7);
                ayp.c(this.C, this.l);
                this.A.a.c(this.l, 7);
                a2 = this.D + 7;
                this.D = a2;
            } else {
                a2 = this.A.a(this.C, 0);
                this.D = a2;
            }
            this.C += a2;
            byte[] bArr = this.i.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            this.q = 4;
            this.E = 0;
        }
        pfo pfoVar5 = this.A;
        pfv pfvVar3 = pfoVar5.b;
        pft pftVar = pfoVar5.d;
        bab babVar = pfoVar5.a;
        int i7 = pfoVar5.f;
        long a3 = pfvVar3.a(i7) * 1000;
        int i8 = pftVar.j;
        if (i8 == 0) {
            while (true) {
                int i9 = this.D;
                int i10 = this.C;
                if (i9 >= i10) {
                    break;
                }
                int a4 = babVar.a(peuVar, i10 - i9, false);
                if (a4 == 0) {
                    return false;
                }
                this.D += a4;
            }
        } else {
            byte[] bArr2 = this.i.a;
            int i11 = i8 + 1;
            int i12 = 4 - i8;
            while (this.D < this.C) {
                int i13 = this.E;
                if (i13 == 0) {
                    if (!peuVar.i(bArr2, i12, i11)) {
                        return r7;
                    }
                    pwu pwuVar2 = this.i;
                    int i14 = r7 == true ? 1 : 0;
                    int i15 = r7 == true ? 1 : 0;
                    int i16 = r7 == true ? 1 : 0;
                    int i17 = r7 == true ? 1 : 0;
                    pwuVar2.G(i14);
                    int d = this.i.d();
                    if (d > 0) {
                        this.E = d - 1;
                        this.h.G(r7);
                        babVar.c(this.h, 4);
                        babVar.c(this.i, i);
                        this.F = this.I.length > 0 && pwo.e(pftVar.f.l, bArr2[4]);
                        this.D += 5;
                        this.C += i12;
                        i = 1;
                    } else {
                        throw pjq.a("Invalid NAL length", th);
                    }
                } else {
                    if (this.F) {
                        this.j.z(i13);
                        if (!peuVar.i(this.j.a, r7, this.E)) {
                            return r7;
                        }
                        this.j.G(r7);
                        this.j.F(this.E);
                        babVar.c(this.j, this.E);
                        a = this.E;
                        pwu pwuVar3 = this.j;
                        int b5 = pwo.b(pwuVar3.a, pwuVar3.c);
                        this.j.G("video/hevc".equals(pftVar.f.l) ? 1 : 0);
                        this.j.F(b5);
                        asf.f(a3, this.j, this.I);
                    } else {
                        a = babVar.a(peuVar, i13, false);
                        if (a == 0) {
                            return false;
                        }
                    }
                    this.D += a;
                    this.E -= a;
                    th = null;
                    i = 1;
                    r7 = 0;
                }
            }
        }
        boolean z2 = pfvVar3.l[i7];
        pfu b6 = this.A.b();
        if (b6 != null) {
            baaVar = b6.c;
            z = z2 | true;
        } else {
            z = z2;
            baaVar = null;
        }
        int i18 = z ? 1 : 0;
        int i19 = z ? 1 : 0;
        babVar.e(a3, i18, this.C, 0, baaVar);
        pew pewVar = this.a;
        if (pewVar != null) {
            pewVar.g(a3, (this.B * 1000000) / pftVar.c);
        }
        while (!this.p.isEmpty()) {
            pfn pfnVar = (pfn) this.p.removeFirst();
            this.w -= pfnVar.b;
            long j3 = pfnVar.a + a3;
            for (bab babVar2 : this.H) {
                babVar2.e(j3, 1, pfnVar.b, this.w, null);
            }
        }
        if (!this.A.e()) {
            this.A = null;
        }
        this.q = 3;
        return true;
    }

    private static final pfm p(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (pfm) sparseArray.valueAt(0);
        }
        pfm pfmVar = (pfm) sparseArray.get(i);
        ptx.a(pfmVar);
        return pfmVar;
    }

    @Override // defpackage.pev
    public final void a(ByteBuffer byteBuffer, long j) {
        if (this.d == null) {
            this.d = new pes();
        }
        this.d.d(byteBuffer, j);
        while (!this.d.h()) {
            int i = this.q;
            long remaining = byteBuffer.remaining();
            try {
                int i2 = this.q;
                if (i2 == 0) {
                    n(this.d);
                } else if (i2 == 1) {
                    l(this.d);
                } else if (i2 == 2) {
                    m(this.d);
                } else {
                    o(this.d);
                }
                if (i == this.q && remaining == byteBuffer.remaining()) {
                    throw pjq.a("Extractor failed to make progress.", null);
                }
            } catch (IOException e) {
                throw pjq.a(null, e);
            }
        }
        this.d.c();
    }

    protected pft b(pft pftVar) {
        return pftVar;
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.G = azhVar;
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            ((pfo) this.g.valueAt(i)).d();
        }
        this.p.clear();
        this.w = 0;
        this.x = j2;
        this.o.clear();
        i();
        pes pesVar = this.d;
        if (pesVar != null) {
            pesVar.e();
        }
    }

    @Override // defpackage.aze
    public final boolean h(azf azfVar) {
        boolean z;
        int i;
        int[] iArr = pfs.a;
        aza azaVar = (aza) azfVar;
        long j = azaVar.b;
        long j2 = 4096;
        long j3 = -1;
        if (j != -1 && j <= 4096) {
            j2 = j;
        }
        int i2 = (int) j2;
        pwu pwuVar = new pwu(64);
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < i2) {
            pwuVar.C(8);
            azfVar.j(pwuVar.a, i3, 8);
            long p = pwuVar.p();
            int d = pwuVar.d();
            if (p == 1) {
                azfVar.j(pwuVar.a, 8, 8);
                pwuVar.F(16);
                p = pwuVar.o();
                i = 16;
            } else {
                if (p == 0) {
                    long j4 = azaVar.b;
                    p = j4 != j3 ? (j4 - azfVar.d()) + 8 : p;
                }
                i = 8;
            }
            long j5 = i;
            if (p < j5) {
                return false;
            }
            i4 += i;
            if (d == 1836019574) {
                i2 += (int) p;
                if (j != -1 && i2 > j) {
                    i2 = (int) j;
                }
                j3 = -1;
            } else if (d == 1836019558 || d == 1836475768) {
                z = true;
                break;
            } else if ((i4 + p) - j5 >= i2) {
                break;
            } else {
                int i5 = (int) (p - j5);
                i4 += i5;
                if (d == 1718909296) {
                    if (i5 < 8) {
                        return false;
                    }
                    pwuVar.C(i5);
                    azfVar.j(pwuVar.a, 0, i5);
                    int i6 = i5 >> 2;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (i7 == 1) {
                            pwuVar.H(4);
                        } else {
                            int d2 = pwuVar.d();
                            if ((d2 >>> 8) != 3368816) {
                                int[] iArr2 = pfs.a;
                                for (int i8 = 0; i8 < 26; i8++) {
                                    if (iArr2[i8] != d2) {
                                    }
                                }
                                continue;
                            }
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2) {
                        return false;
                    }
                } else if (i5 != 0) {
                    azfVar.f(i5);
                }
                j3 = -1;
                i3 = 0;
            }
        }
        z = false;
        return z2 && z;
    }

    public pfp(List list) {
        this.f = Collections.unmodifiableList(list);
        this.m = new por();
        this.n = new pwu(16);
        this.h = new pwu(pwo.a);
        this.i = new pwu(5);
        this.j = new pwu();
        byte[] bArr = new byte[16];
        this.k = bArr;
        this.l = new pwu(bArr);
        this.o = new ArrayDeque();
        this.p = new ArrayDeque();
        this.g = new SparseArray();
        this.y = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.z = -9223372036854775807L;
        i();
    }

    @Override // defpackage.aze
    public final int d(azf azfVar, azv azvVar) {
        if (this.e == null) {
            this.e = new pet();
        }
        this.e.a = azfVar;
        while (true) {
            int i = this.q;
            if (i != 0) {
                if (i == 1) {
                    l(this.e);
                } else if (i == 2) {
                    m(this.e);
                } else if (o(this.e)) {
                    return 0;
                }
            } else if (!n(this.e)) {
                return -1;
            }
        }
    }
}
