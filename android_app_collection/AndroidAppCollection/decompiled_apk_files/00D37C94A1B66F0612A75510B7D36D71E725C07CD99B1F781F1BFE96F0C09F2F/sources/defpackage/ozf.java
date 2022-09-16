package defpackage;

import com.google.android.exoplayer.MediaFormat;
import java.util.ArrayList;
import java.util.Stack;
/* compiled from: PG */
/* renamed from: ozf  reason: default package */
/* loaded from: classes4.dex */
public final class ozf implements oxq, oye {
    private static final int a = pcx.c("qt  ");
    private int g;
    private int h;
    private long i;
    private int j;
    private pct k;
    private int l;
    private int m;
    private int n;
    private oxr o;
    private oze[] p;
    private boolean q;
    private final pct d = new pct(16);
    private final Stack e = new Stack();
    private final pct b = new pct(pcr.a);
    private final pct c = new pct(4);

    public ozf() {
        g();
    }

    private final void g() {
        this.g = 1;
        this.j = 0;
    }

    private final void h(long j) {
        ozh b;
        oys oysVar;
        while (!this.e.isEmpty() && ((oys) this.e.peek()).a == j) {
            oys oysVar2 = (oys) this.e.pop();
            if (oysVar2.aQ == oyu.E) {
                ArrayList arrayList = new ArrayList();
                oyt b2 = oysVar2.b(oyu.aB);
                oxy a2 = b2 != null ? oza.a(b2, this.q) : null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                while (i < oysVar2.c.size()) {
                    oys oysVar3 = (oys) oysVar2.c.get(i);
                    if (oysVar3.aQ == oyu.G && (b = oza.b(oysVar3, oysVar2.b(oyu.F), -1L, this.q)) != null) {
                        ozk c = oza.c(b, oysVar3.a(oyu.H).a(oyu.I).a(oyu.f250J));
                        if (c.a != 0) {
                            oze ozeVar = new oze(b, c, this.o.pP(i));
                            int i2 = c.d;
                            MediaFormat mediaFormat = b.k;
                            int i3 = i2 + 30;
                            oysVar = oysVar2;
                            MediaFormat mediaFormat2 = new MediaFormat(mediaFormat.a, mediaFormat.b, mediaFormat.c, i3, mediaFormat.e, mediaFormat.h, mediaFormat.i, mediaFormat.l, mediaFormat.m, mediaFormat.q, mediaFormat.r, mediaFormat.v, mediaFormat.w, mediaFormat.f, mediaFormat.g, mediaFormat.j, mediaFormat.k, mediaFormat.s, mediaFormat.t, mediaFormat.u, mediaFormat.o, mediaFormat.n, mediaFormat.p);
                            ozeVar.c.d(a2 != null ? mediaFormat2.a(a2.a, a2.b) : mediaFormat2);
                            arrayList.add(ozeVar);
                            long j3 = c.b[0];
                            if (j3 < j2) {
                                j2 = j3;
                            }
                            i++;
                            oysVar2 = oysVar;
                        }
                    }
                    oysVar = oysVar2;
                    i++;
                    oysVar2 = oysVar;
                }
                this.p = (oze[]) arrayList.toArray(new oze[0]);
                this.o.pR();
                this.o.pS(this);
                this.e.clear();
                this.g = 3;
            } else if (!this.e.isEmpty()) {
                ((oys) this.e.peek()).c(oysVar2);
            }
        }
        if (this.g != 3) {
            g();
        }
    }

    @Override // defpackage.oxq
    public final void a(oxr oxrVar) {
        this.o = oxrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e A[SYNTHETIC] */
    @Override // defpackage.oye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(long r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
        L7:
            oze[] r4 = r8.p
            int r5 = r4.length
            if (r3 >= r5) goto L51
            r4 = r4[r3]
            ozk r4 = r4.b
            long[] r5 = r4.e
            int r5 = defpackage.pcx.s(r5, r9, r0)
        L16:
            r6 = -1
            if (r5 < 0) goto L24
            int[] r7 = r4.f
            r7 = r7[r5]
            r7 = r7 & 1
            if (r7 != 0) goto L25
            int r5 = r5 + (-1)
            goto L16
        L24:
            r5 = -1
        L25:
            if (r5 != r6) goto L3e
            long[] r5 = r4.e
            int r5 = defpackage.pcx.r(r5, r9, r0)
        L2d:
            long[] r7 = r4.e
            int r7 = r7.length
            if (r5 >= r7) goto L3f
            int[] r7 = r4.f
            r7 = r7[r5]
            r7 = r7 & 1
            if (r7 == 0) goto L3b
            goto L3e
        L3b:
            int r5 = r5 + 1
            goto L2d
        L3e:
            r6 = r5
        L3f:
            oze[] r5 = r8.p
            r5 = r5[r3]
            r5.d = r6
            long[] r4 = r4.b
            r5 = r4[r6]
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L4e
            r1 = r5
        L4e:
            int r3 = r3 + 1
            goto L7
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozf.b(long):long");
    }

    @Override // defpackage.oye
    public final boolean c() {
        return true;
    }

    @Override // defpackage.oxq
    public final void d() {
        this.e.clear();
        this.j = 0;
        this.m = 0;
        this.n = 0;
        this.g = 0;
    }

    @Override // defpackage.oxq
    public final boolean f(oxn oxnVar) {
        return ozg.a(oxnVar, false);
    }

    @Override // defpackage.oxq
    public final int e(oxn oxnVar, oxz oxzVar) {
        oze[] ozeVarArr;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        while (true) {
            int i4 = this.g;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (this.j == 0) {
                        if (!oxnVar.m(this.d.a, 0, 8, true)) {
                            return -1;
                        }
                        this.j = 8;
                        this.d.z(0);
                        this.i = this.d.n();
                        this.h = this.d.c();
                    }
                    if (this.i == 1) {
                        oxnVar.h(this.d.a, 8, 8);
                        this.j += 8;
                        this.i = this.d.o();
                    }
                    int i5 = this.h;
                    if (i5 == oyu.E || i5 == oyu.G || i5 == oyu.H || i5 == oyu.I || i5 == oyu.f250J || i5 == oyu.S) {
                        long j = (oxnVar.c + this.i) - this.j;
                        this.e.add(new oys(this.h, j));
                        if (this.i == this.j) {
                            h(j);
                        } else {
                            g();
                        }
                    } else {
                        int i6 = this.h;
                        if (i6 == oyu.U || i6 == oyu.F || i6 == oyu.V || i6 == oyu.W || i6 == oyu.ao || i6 == oyu.ap || i6 == oyu.aq || i6 == oyu.T || i6 == oyu.ar || i6 == oyu.as || i6 == oyu.at || i6 == oyu.au || i6 == oyu.av || i6 == oyu.R || i6 == oyu.d || i6 == oyu.aB) {
                            pce.d(this.j == 8);
                            pce.d(this.i <= 2147483647L);
                            this.k = new pct((int) this.i);
                            System.arraycopy(this.d.a, 0, this.k.a, 0, 8);
                        } else {
                            this.k = null;
                        }
                        this.g = 2;
                    }
                } else if (i4 != 2) {
                    long j2 = Long.MAX_VALUE;
                    int i7 = 0;
                    int i8 = -1;
                    while (true) {
                        ozeVarArr = this.p;
                        if (i7 >= ozeVarArr.length) {
                            break;
                        }
                        oze ozeVar = ozeVarArr[i7];
                        int i9 = ozeVar.d;
                        ozk ozkVar = ozeVar.b;
                        if (i9 != ozkVar.a) {
                            long j3 = ozkVar.b[i9];
                            if (j3 < j2) {
                                i8 = i7;
                                j2 = j3;
                            }
                        }
                        i7++;
                    }
                    if (i8 == -1) {
                        return -1;
                    }
                    oze ozeVar2 = ozeVarArr[i8];
                    oyf oyfVar = ozeVar2.c;
                    int i10 = ozeVar2.d;
                    long j4 = ozeVar2.b.b[i10];
                    long j5 = (j4 - oxnVar.c) + this.m;
                    if (j5 < 0 || j5 >= 262144) {
                        oxzVar.a = j4;
                        return 1;
                    }
                    oxnVar.j((int) j5);
                    this.l = ozeVar2.b.c[i10];
                    int i11 = ozeVar2.a.o;
                    if (i11 == -1) {
                        while (true) {
                            int i12 = this.m;
                            i3 = this.l;
                            if (i12 >= i3) {
                                break;
                            }
                            int j6 = oyfVar.j(oxnVar, i3 - i12, false);
                            this.m += j6;
                            this.n -= j6;
                        }
                        i2 = i3;
                    } else {
                        byte[] bArr = this.c.a;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i13 = 4 - i11;
                        while (true) {
                            int i14 = this.m;
                            i = this.l;
                            if (i14 >= i) {
                                break;
                            }
                            int i15 = this.n;
                            if (i15 == 0) {
                                oxnVar.h(this.c.a, i13, i11);
                                this.c.z(0);
                                this.n = this.c.j();
                                this.b.z(0);
                                oyfVar.f(this.b, 4);
                                this.m += 4;
                                this.l += i13;
                            } else {
                                int j7 = oyfVar.j(oxnVar, i15, false);
                                this.m += j7;
                                this.n -= j7;
                            }
                        }
                        i2 = i;
                    }
                    ozk ozkVar2 = ozeVar2.b;
                    oyfVar.g(ozkVar2.e[i10], ozkVar2.f[i10], i2, 0, null);
                    ozeVar2.d++;
                    this.m = 0;
                    this.n = 0;
                    return 0;
                } else {
                    long j8 = this.i;
                    int i16 = this.j;
                    long j9 = j8 - i16;
                    long j10 = oxnVar.c + j9;
                    pct pctVar = this.k;
                    if (pctVar != null) {
                        oxnVar.h(pctVar.a, i16, (int) j9);
                        if (this.h == oyu.d) {
                            pct pctVar2 = this.k;
                            pctVar2.z(8);
                            if (pctVar2.c() == a) {
                                z2 = true;
                                break;
                            }
                            pctVar2.A(4);
                            while (pctVar2.a() > 0) {
                                if (pctVar2.c() == a) {
                                    z2 = true;
                                    break;
                                }
                            }
                            z2 = false;
                            this.q = z2;
                        } else if (!this.e.isEmpty()) {
                            ((oys) this.e.peek()).d(new oyt(this.h, this.k));
                        }
                    } else if (j9 >= 262144) {
                        oxzVar.a = j10;
                        z = true;
                        h(j10);
                        if (z && this.g != 3) {
                            return 1;
                        }
                    } else {
                        oxnVar.j((int) j9);
                    }
                    z = false;
                    h(j10);
                    if (z) {
                        return 1;
                    }
                    continue;
                }
            } else if (oxnVar.c == 0) {
                g();
            } else {
                this.g = 3;
            }
        }
    }
}
