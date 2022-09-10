package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: clnc  reason: default package */
/* loaded from: classes5.dex */
public final class clnc implements Handler.Callback, cmef, clnz, cllw, cloh {
    private boolean C;
    private boolean D;
    private int E;
    private clnb F;
    private long G;
    private int H;
    private boolean I;
    private cllz J;
    private final cllv K;
    private final clma L;
    private final cllu M;
    public final Looper a;
    public boolean b;
    public final cmnt d;
    private final clol[] e;
    private final clon[] f;
    private final cmjq g;
    private final cmjr h;
    private final cmjz i;
    private final HandlerThread j;
    private final clpa k;
    private final cloz l;
    private final long m;
    private final cllx n;
    private final ArrayList<clmy> o;
    private final cmmq p;
    private final clnt q;
    private final cloa r;
    private cloq s;
    private cloc t;
    private clmz u;
    private boolean v;
    private boolean x;
    private boolean y;
    private boolean z;
    private int A = 0;
    private boolean B = false;
    private boolean w = false;
    public boolean c = true;

    public clnc(clol[] clolVarArr, cmjq cmjqVar, cmjr cmjrVar, cllv cllvVar, cmjz cmjzVar, clqv clqvVar, cloq cloqVar, cllu clluVar, Looper looper, cmmq cmmqVar, clma clmaVar) {
        this.L = clmaVar;
        this.e = clolVarArr;
        this.g = cmjqVar;
        this.h = cmjrVar;
        this.K = cllvVar;
        this.i = cmjzVar;
        this.s = cloqVar;
        this.M = clluVar;
        this.p = cmmqVar;
        this.m = cllvVar.f;
        this.t = cloc.a(cmjrVar);
        this.u = new clmz(this.t);
        this.f = new clon[clolVarArr.length];
        for (int i = 0; i < clolVarArr.length; i++) {
            clolVarArr[i].RR(i);
            this.f[i] = clolVarArr[i].RQ();
        }
        this.n = new cllx(this, cmmqVar);
        this.o = new ArrayList<>();
        this.k = new clpa();
        this.l = new cloz();
        cmjqVar.c = cmjzVar;
        this.I = true;
        Handler handler = new Handler(looper);
        this.q = new clnt(clqvVar, handler);
        this.r = new cloa(this, clqvVar, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.a = looper2;
        this.d = new cmnt(new Handler(looper2, this));
    }

    private final boolean A() {
        clnq clnqVar = this.q.d;
        long j = clnqVar.f.e;
        if (clnqVar.d) {
            return j == -9223372036854775807L || this.t.s < j || !N();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0256, code lost:
        r29 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0258, code lost:
        if (r0.d(r3) != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x025a, code lost:
        r11 = r13;
        r17 = r15;
        r46 = r10;
        r10 = r9;
        r9 = r46;
        r29 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0265, code lost:
        r28 = r10;
        r26 = r13;
        r17 = r15;
        r6 = false;
        r29 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02d9, code lost:
        if (r3 != (-9223372036854775807L)) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02db, code lost:
        r0 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02e0, code lost:
        r4 = r45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02e3, code lost:
        r0 = r2.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02ea, code lost:
        if (r2 != r4.e) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02ee, code lost:
        if (r30 == Long.MIN_VALUE) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02f2, code lost:
        if (r30 < r0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02f4, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02f6, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f7, code lost:
        r26 = r26;
        r26 = r26;
        r29 = r29;
        r29 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02fb, code lost:
        if (r4.d(r2) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02fd, code lost:
        if (r7 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02ff, code lost:
        r26 = r26;
        r29 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x033d, code lost:
        r29 = r1;
        r28 = r10;
        r17 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0344, code lost:
        r26 = r26;
        r29 = r29;
        r26 = r26;
        r29 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0348, code lost:
        if (r0.d(r3) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x034a, code lost:
        r8 = r47;
        r26 = r26;
        r28 = r28;
        r29 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x034f, code lost:
        r6 = false;
        r8 = r47;
        r26 = r26;
        r28 = r28;
        r29 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0352, code lost:
        r8.j(r6);
        r26 = r26;
        r28 = r28;
        r29 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0357, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0358, code lost:
        r8 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0428, code lost:
        r10 = r48;
        r11 = r26;
        r9 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0485  */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v11 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r29v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void B(defpackage.clpb r48) {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clnc.B(clpb):void");
    }

    private final void C(clpb clpbVar, cmeh cmehVar, clpb clpbVar2, cmeh cmehVar2, long j) {
        if (clpbVar.t() || !p(clpbVar, cmehVar)) {
            return;
        }
        clpbVar.u(clpbVar.g(cmehVar.a, this.l).c, this.k);
        cllu clluVar = this.M;
        clnm clnmVar = this.k.c.c;
        clluVar.b = cllt.b(-9223372036854775807L);
        clluVar.d = cllt.b(-9223372036854775807L);
        clluVar.e = cllt.b(-9223372036854775807L);
        clluVar.h = 0.97f;
        clluVar.g = 1.03f;
        clluVar.b();
        if (j != -9223372036854775807L) {
            this.M.a(o(clpbVar, cmehVar.a, j));
            return;
        }
        if (cmny.b(!clpbVar2.t() ? clpbVar2.u(clpbVar2.g(cmehVar2.a, this.l).c, this.k).b : null, this.k.b)) {
            return;
        }
        this.M.a(-9223372036854775807L);
    }

    private final void D() {
        clnq clnqVar = this.q.d;
        boolean z = false;
        if (clnqVar != null && clnqVar.f.g && this.w) {
            z = true;
        }
        this.x = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r5 < r6) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void E() {
        /*
            r11 = this;
            boolean r0 = r11.F()
            r1 = 0
            if (r0 != 0) goto L8
            goto L68
        L8:
            clnt r0 = r11.q
            clnq r0 = r0.f
            long r2 = r0.f()
            long r2 = r11.M(r2)
            clnt r4 = r11.q
            clnq r4 = r4.d
            if (r0 != r4) goto L20
            long r4 = r11.G
            r0.b(r4)
            goto L29
        L20:
            long r4 = r11.G
            r0.b(r4)
            clnr r0 = r0.f
            long r4 = r0.b
        L29:
            cllv r0 = r11.K
            cllx r4 = r11.n
            clod r4 = r4.RP()
            float r4 = r4.b
            cmkk r5 = r0.a
            int r5 = r5.g()
            int r6 = r0.g
            long r7 = r0.b
            r9 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 <= 0) goto L4d
            long r7 = defpackage.cmny.F(r7, r4)
            long r9 = r0.c
            long r7 = java.lang.Math.min(r7, r9)
        L4d:
            r9 = 500000(0x7a120, double:2.47033E-318)
            long r7 = java.lang.Math.max(r7, r9)
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L5c
            if (r5 >= r6) goto L64
            r1 = 1
            goto L64
        L5c:
            long r7 = r0.c
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 >= 0) goto L64
            if (r5 < r6) goto L66
        L64:
            r0.h = r1
        L66:
            boolean r1 = r0.h
        L68:
            r11.z = r1
            if (r1 == 0) goto L82
            clnt r0 = r11.q
            clnq r0 = r0.f
            long r1 = r11.G
            boolean r3 = r0.j()
            defpackage.cmmn.c(r3)
            long r1 = r0.b(r1)
            cmeg r0 = r0.a
            r0.m(r1)
        L82:
            r11.G()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clnc.E():void");
    }

    private final boolean F() {
        clnq clnqVar = this.q.f;
        return (clnqVar == null || clnqVar.f() == Long.MIN_VALUE) ? false : true;
    }

    private final void G() {
        clnq clnqVar = this.q.f;
        boolean z = this.z || (clnqVar != null && clnqVar.a.n());
        cloc clocVar = this.t;
        if (z != clocVar.g) {
            this.t = new cloc(clocVar.b, clocVar.c, clocVar.d, clocVar.e, clocVar.f, z, clocVar.h, clocVar.i, clocVar.j, clocVar.k, clocVar.l, clocVar.m, clocVar.n, clocVar.q, clocVar.r, clocVar.s, clocVar.o, clocVar.p);
        }
    }

    private final cloc H(cmeh cmehVar, long j, long j2) {
        TrackGroupArray trackGroupArray;
        cmjr cmjrVar;
        dcdc dcdcVar;
        TrackGroupArray trackGroupArray2;
        cmjr cmjrVar2;
        boolean z = true;
        if (!this.I && j == this.t.s && cmehVar.equals(this.t.c)) {
            z = false;
        }
        this.I = z;
        D();
        cloc clocVar = this.t;
        TrackGroupArray trackGroupArray3 = clocVar.h;
        cmjr cmjrVar3 = clocVar.i;
        List<Metadata> list = clocVar.j;
        if (this.r.i) {
            clnq clnqVar = this.q.d;
            if (clnqVar == null) {
                trackGroupArray2 = TrackGroupArray.a;
            } else {
                trackGroupArray2 = clnqVar.i;
            }
            if (clnqVar == null) {
                cmjrVar2 = this.h;
            } else {
                cmjrVar2 = clnqVar.j;
            }
            cmjn cmjnVar = cmjrVar2.c;
            dccx dccxVar = new dccx();
            for (int i = 0; i < cmjnVar.a; i++) {
                cmjm a = cmjnVar.a(i);
                if (a != null) {
                    Metadata metadata = a.e(0).j;
                    if (metadata == null) {
                        metadata = new Metadata(new Metadata.Entry[0]);
                    }
                    dccxVar.g(metadata);
                }
            }
            cmjrVar = cmjrVar2;
            dcdcVar = dccxVar.f();
            trackGroupArray = trackGroupArray2;
        } else if (!cmehVar.equals(clocVar.c)) {
            TrackGroupArray trackGroupArray4 = TrackGroupArray.a;
            trackGroupArray = trackGroupArray4;
            cmjrVar = this.h;
            dcdcVar = dcdc.e();
        } else {
            trackGroupArray = trackGroupArray3;
            cmjrVar = cmjrVar3;
            dcdcVar = list;
        }
        return this.t.b(cmehVar, j, j2, L(), trackGroupArray, cmjrVar, dcdcVar);
    }

    private final void I() {
        J(new boolean[this.e.length]);
    }

    private final void J(boolean[] zArr) {
        cmnc cmncVar;
        clnq clnqVar = this.q.e;
        cmjr cmjrVar = clnqVar.j;
        for (int i = 0; i < this.e.length; i++) {
            if (!cmjrVar.a(i)) {
                this.e[i].r();
            }
        }
        for (int i2 = 0; i2 < this.e.length; i2++) {
            if (cmjrVar.a(i2)) {
                boolean z = zArr[i2];
                clol clolVar = this.e[i2];
                if (!R(clolVar)) {
                    clnt clntVar = this.q;
                    clnq clnqVar2 = clntVar.e;
                    boolean z2 = clnqVar2 == clntVar.d;
                    cmjr cmjrVar2 = clnqVar2.j;
                    cloo clooVar = cmjrVar2.b[i2];
                    Format[] Q = Q(cmjrVar2.c.a(i2));
                    boolean z3 = N() && this.t.e == 3;
                    boolean z4 = !z && z3;
                    this.E++;
                    clolVar.f(clooVar, Q, clnqVar2.c[i2], this.G, z4, z2, clnqVar2.c(), clnqVar2.k);
                    clolVar.t(R.styleable.AppCompatTheme_textAppearanceListItem, new clmv(this));
                    cllx cllxVar = this.n;
                    cmnc d = clolVar.d();
                    if (d != null && d != (cmncVar = cllxVar.d)) {
                        if (cmncVar == null) {
                            cllxVar.d = d;
                            cllxVar.c = clolVar;
                            cllxVar.d.c(cllxVar.a.a);
                        } else {
                            throw cllz.a(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z3) {
                        clolVar.g();
                    }
                } else {
                    continue;
                }
            }
        }
        clnqVar.g = true;
    }

    private final void K(boolean z) {
        long e;
        clnq clnqVar = this.q.f;
        cmeh cmehVar = clnqVar == null ? this.t.c : clnqVar.f.a;
        boolean z2 = !this.t.k.equals(cmehVar);
        if (z2) {
            this.t = this.t.f(cmehVar);
        }
        cloc clocVar = this.t;
        if (clnqVar == null) {
            e = clocVar.s;
        } else {
            e = clnqVar.e();
        }
        clocVar.q = e;
        this.t.r = L();
        if ((z2 || z) && clnqVar != null && clnqVar.d) {
            T(clnqVar.j);
        }
    }

    private final long L() {
        return M(this.t.q);
    }

    private final long M(long j) {
        clnq clnqVar = this.q.f;
        if (clnqVar == null) {
            return 0L;
        }
        return Math.max(0L, j - clnqVar.b(this.G));
    }

    private final boolean N() {
        cloc clocVar = this.t;
        return clocVar.l && clocVar.m == 0;
    }

    private static boolean O(cloc clocVar, cloz clozVar, clpa clpaVar) {
        cmeh cmehVar = clocVar.c;
        clpb clpbVar = clocVar.b;
        return cmehVar.b() || clpbVar.t() || clpbVar.u(clpbVar.g(cmehVar.a, clozVar).c, clpaVar).k;
    }

    private static Pair<Object, Long> P(clpb clpbVar, clnb clnbVar, boolean z, int i, boolean z2, clpa clpaVar, cloz clozVar) {
        Pair<Object, Long> w;
        Object d;
        clpb clpbVar2 = clnbVar.a;
        if (clpbVar.t()) {
            return null;
        }
        clpb clpbVar3 = true == clpbVar2.t() ? clpbVar : clpbVar2;
        try {
            w = clpbVar3.w(clpaVar, clozVar, clnbVar.b, clnbVar.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (clpbVar.equals(clpbVar3)) {
            return w;
        }
        if (clpbVar.i(w.first) != -1) {
            clpbVar3.g(w.first, clozVar);
            return clpbVar3.u(clozVar.c, clpaVar).k ? clpbVar.w(clpaVar, clozVar, clpbVar.g(w.first, clozVar).c, clnbVar.c) : w;
        }
        if (z && (d = d(clpaVar, clozVar, i, z2, w.first, clpbVar3, clpbVar)) != null) {
            return clpbVar.w(clpaVar, clozVar, clpbVar.g(d, clozVar).c, -9223372036854775807L);
        }
        return null;
    }

    private static Format[] Q(cmjm cmjmVar) {
        int d = cmjmVar != null ? cmjmVar.d() : 0;
        Format[] formatArr = new Format[d];
        for (int i = 0; i < d; i++) {
            formatArr[i] = cmjmVar.e(i);
        }
        return formatArr;
    }

    private static boolean R(clol clolVar) {
        return clolVar.e() != 0;
    }

    private static final void S(clol clolVar) {
        if (clolVar.e() == 2) {
            clolVar.p();
        }
    }

    private final void T(cmjr cmjrVar) {
        cllv cllvVar = this.K;
        clol[] clolVarArr = this.e;
        cmjn cmjnVar = cmjrVar.c;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i < clolVarArr.length) {
                if (cmjnVar.a(i) != null) {
                    int a = clolVarArr[i].a();
                    if (a == 0) {
                        i3 = 144310272;
                    } else if (a != 1) {
                        if (a == 2) {
                            i3 = 131072000;
                        } else if (a == 3 || a == 5 || a == 6) {
                            i3 = 131072;
                        } else if (a != 7) {
                            throw new IllegalArgumentException();
                        } else {
                            i3 = 0;
                        }
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                cllvVar.g = max;
                cllvVar.a.b(max);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object d(clpa clpaVar, cloz clozVar, int i, boolean z, Object obj, clpb clpbVar, clpb clpbVar2) {
        int i2 = clpbVar.i(obj);
        int s = clpbVar.s();
        int i3 = 0;
        int i4 = i2;
        int i5 = -1;
        while (true) {
            if (i3 >= s || i5 != -1) {
                break;
            }
            i4 = clpbVar.v(i4, clozVar, clpaVar, i, z);
            if (i4 == -1) {
                i5 = -1;
                break;
            }
            i5 = clpbVar2.i(clpbVar.j(i4));
            i3++;
        }
        if (i5 == -1) {
            return null;
        }
        return clpbVar2.j(i5);
    }

    public static final void f(cloj clojVar) {
        clojVar.g();
        try {
            clojVar.a.t(clojVar.c, clojVar.d);
        } finally {
            clojVar.a(true);
        }
    }

    private final void g(int i) {
        cloc clocVar = this.t;
        if (clocVar.e != i) {
            this.t = clocVar.d(i);
        }
    }

    private final void h() {
        clmz clmzVar = this.u;
        cloc clocVar = this.t;
        boolean z = clmzVar.a | (clmzVar.b != clocVar);
        clmzVar.a = z;
        clmzVar.b = clocVar;
        if (z) {
            this.L.a(clmzVar);
            this.u = new clmz(this.t);
        }
    }

    private final void i(boolean z, int i, boolean z2, int i2) {
        this.u.a(z2 ? 1 : 0);
        clmz clmzVar = this.u;
        clmzVar.a = true;
        clmzVar.f = true;
        clmzVar.g = i2;
        this.t = this.t.g(z, i);
        this.y = false;
        if (!N()) {
            l();
            m();
            return;
        }
        int i3 = this.t.e;
        if (i3 == 3) {
            k();
            this.d.e(2);
        } else if (i3 != 2) {
        } else {
            this.d.e(2);
        }
    }

    private final void j(boolean z) {
        cmeh cmehVar = this.q.d.f.a;
        long s = s(cmehVar, this.t.s, true, false);
        if (s != this.t.s) {
            this.t = H(cmehVar, s, this.t.d);
            if (!z) {
                return;
            }
            this.u.b(4);
        }
    }

    private final void k() {
        clol[] clolVarArr;
        this.y = false;
        cllx cllxVar = this.n;
        cllxVar.f = true;
        cllxVar.a.a();
        for (clol clolVar : this.e) {
            if (R(clolVar)) {
                clolVar.g();
            }
        }
    }

    private final void l() {
        clol[] clolVarArr;
        this.n.a();
        for (clol clolVar : this.e) {
            if (R(clolVar)) {
                S(clolVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010a -> B:50:0x010b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m() {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clnc.m():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:227:0x03ae, code lost:
        if (A() != false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0424, code lost:
        if (r6.a.g() < r6.g) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
        if (r6 != (-9223372036854775807L)) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x024e A[EDGE_INSN: B:347:0x024e->B:139:0x024e ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n() {
        /*
            Method dump skipped, instructions count: 1393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clnc.n():void");
    }

    private final long o(clpb clpbVar, Object obj, long j) {
        clpbVar.u(clpbVar.g(obj, this.l).c, this.k);
        clpa clpaVar = this.k;
        if (clpaVar.f == -9223372036854775807L || !clpaVar.j || !clpaVar.i) {
            return -9223372036854775807L;
        }
        return cllt.b(cmny.Z(clpaVar.g) - this.k.f) - (j + this.l.e);
    }

    private final boolean p(clpb clpbVar, cmeh cmehVar) {
        if (!cmehVar.b() && !clpbVar.t()) {
            clpbVar.u(clpbVar.g(cmehVar.a, this.l).c, this.k);
            clpa clpaVar = this.k;
            if (clpaVar.j && clpaVar.i) {
                return true;
            }
        }
        return false;
    }

    private final void q(long j, long j2) {
        this.d.d();
        this.d.a.sendEmptyMessageAtTime(2, j + j2);
    }

    private final long r(cmeh cmehVar, long j, boolean z) {
        clnt clntVar = this.q;
        return s(cmehVar, j, clntVar.d != clntVar.e, z);
    }

    private final long s(cmeh cmehVar, long j, boolean z, boolean z2) {
        clnt clntVar;
        l();
        this.y = false;
        if (z2 || this.t.e == 3) {
            g(2);
        }
        clnq clnqVar = this.q.d;
        clnq clnqVar2 = clnqVar;
        while (clnqVar2 != null && !cmehVar.equals(clnqVar2.f.a)) {
            clnqVar2 = clnqVar2.h;
        }
        if (z || clnqVar != clnqVar2 || (clnqVar2 != null && clnqVar2.a(j) < 0)) {
            for (clol clolVar : this.e) {
                z(clolVar);
            }
            if (clnqVar2 != null) {
                while (true) {
                    clntVar = this.q;
                    if (clntVar.d == clnqVar2) {
                        break;
                    }
                    clntVar.c();
                }
                clntVar.d(clnqVar2);
                clnqVar2.k = 0L;
                I();
            }
        }
        if (clnqVar2 != null) {
            this.q.d(clnqVar2);
            if (!clnqVar2.d) {
                clnqVar2.f = clnqVar2.f.a(j);
            } else {
                long j2 = clnqVar2.f.e;
                if (j2 != -9223372036854775807L && j >= j2) {
                    j = Math.max(0L, j2 - 1);
                }
                if (clnqVar2.e) {
                    long j3 = clnqVar2.a.j(j);
                    clnqVar2.a.p(j3 - this.m);
                    j = j3;
                }
            }
            t(j);
            E();
        } else {
            this.q.e();
            t(j);
        }
        K(false);
        this.d.e(2);
        return j;
    }

    private final void u(boolean z, boolean z2) {
        v(z || !this.C, false, true, false);
        this.u.a(z2 ? 1 : 0);
        this.K.a(true);
        g(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clnc.v(boolean, boolean, boolean, boolean):void");
    }

    private final Pair<cmeh, Long> w(clpb clpbVar) {
        long j = 0;
        if (clpbVar.t()) {
            return Pair.create(cloc.a, 0L);
        }
        Pair<Object, Long> w = clpbVar.w(this.k, this.l, clpbVar.e(this.B), -9223372036854775807L);
        cmeh g = this.q.g(clpbVar, w.first, 0L);
        long longValue = ((Long) w.second).longValue();
        if (g.b()) {
            clpbVar.g(g.a, this.l);
            if (g.c == this.l.c(g.b)) {
                this.l.g();
            }
        } else {
            j = longValue;
        }
        return Pair.create(g, Long.valueOf(j));
    }

    private final void x(cloj clojVar) {
        if (clojVar.e.getLooper() == this.a) {
            f(clojVar);
            int i = this.t.e;
            if (i != 3 && i != 2) {
                return;
            }
            this.d.e(2);
            return;
        }
        this.d.b(15, clojVar).sendToTarget();
    }

    private final void y(clpb clpbVar, clpb clpbVar2) {
        if (!clpbVar.t() || !clpbVar2.t()) {
            int size = this.o.size() - 1;
            if (size >= 0) {
                clmy clmyVar = this.o.get(size);
                Object obj = clmyVar.c;
                cloj clojVar = clmyVar.a;
                throw null;
            }
            Collections.sort(this.o);
        }
    }

    private final void z(clol clolVar) {
        if (!R(clolVar)) {
            return;
        }
        cllx cllxVar = this.n;
        if (clolVar == cllxVar.c) {
            cllxVar.d = null;
            cllxVar.c = null;
            cllxVar.e = true;
        }
        S(clolVar);
        clolVar.q();
        this.E--;
    }

    @Override // defpackage.cloh
    public final synchronized void a(cloj clojVar) {
        if (!this.v && this.j.isAlive()) {
            this.d.b(14, clojVar).sendToTarget();
            return;
        }
        clojVar.a(false);
    }

    @Override // defpackage.cmef
    public final void b(cmeg cmegVar) {
        this.d.b(8, cmegVar).sendToTarget();
    }

    public final void c(clod clodVar, boolean z) {
        this.d.c(16, z ? 1 : 0, 0, clodVar).sendToTarget();
    }

    @Override // defpackage.cmfl
    public final /* bridge */ /* synthetic */ void e(cmeg cmegVar) {
        this.d.b(9, cmegVar).sendToTarget();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05b4 A[Catch: IOException -> 0x063d, OutOfMemoryError -> 0x0641, RuntimeException -> 0x0643, cllz -> 0x0699, TryCatch #6 {IOException -> 0x063d, blocks: (B:8:0x0017, B:10:0x001f, B:14:0x0026, B:299:0x0639, B:19:0x0030, B:20:0x0033, B:21:0x0034, B:25:0x003b, B:27:0x003f, B:32:0x004c, B:33:0x0053, B:34:0x005b, B:38:0x0062, B:40:0x006b, B:42:0x0073, B:43:0x007b, B:44:0x0086, B:46:0x009b, B:47:0x00af, B:48:0x00ba, B:51:0x00cd, B:55:0x00d6, B:56:0x00e7, B:60:0x0103, B:61:0x0111, B:63:0x0121, B:64:0x0125, B:65:0x0132, B:66:0x016f, B:70:0x017a, B:72:0x01d8, B:74:0x01e4, B:75:0x01e9, B:76:0x01ec, B:78:0x01f2, B:80:0x01f6, B:81:0x01fb, B:82:0x01fe, B:84:0x0212, B:85:0x0218, B:86:0x0222, B:87:0x022d, B:91:0x0234, B:93:0x023c, B:95:0x0240, B:97:0x0246, B:99:0x024e, B:100:0x0251, B:102:0x0256, B:110:0x0264, B:111:0x0265, B:115:0x026c, B:117:0x027c, B:121:0x0286, B:123:0x0298, B:127:0x02a2, B:129:0x02b3, B:132:0x02b9, B:134:0x02c5, B:138:0x02d1, B:140:0x02d7, B:142:0x02dd, B:146:0x02e5, B:148:0x02eb, B:150:0x0319, B:152:0x031f, B:153:0x0327, B:154:0x032d, B:156:0x0332, B:158:0x0340, B:160:0x0346, B:161:0x034a, B:163:0x034e, B:164:0x0353, B:165:0x0356, B:169:0x0374, B:171:0x037f, B:166:0x035a, B:168:0x0363, B:172:0x038c, B:174:0x0398, B:175:0x03a4, B:177:0x03b0, B:181:0x03dd, B:182:0x03e4, B:184:0x0405, B:185:0x0424, B:189:0x042e, B:190:0x043b, B:197:0x0446, B:203:0x0451, B:204:0x0459, B:205:0x046e, B:207:0x0495, B:270:0x05ac, B:272:0x05b4, B:254:0x057b, B:251:0x0570, B:253:0x0578, B:277:0x05c2, B:279:0x05ce, B:280:0x05d4, B:208:0x04b7, B:212:0x04ca, B:214:0x04da, B:216:0x04f1, B:218:0x04fa, B:281:0x05d5, B:282:0x05d9, B:286:0x05e0, B:287:0x05e7, B:290:0x05f6, B:294:0x0604, B:295:0x0615, B:297:0x061d, B:298:0x0630), top: B:344:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x067c  */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r2v31, types: [cmlo, cmjz] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r39) {
        /*
            Method dump skipped, instructions count: 1830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clnc.handleMessage(android.os.Message):boolean");
    }

    private final void t(long j) {
        clol[] clolVarArr;
        cmjm[] b;
        clnq clnqVar = this.q.d;
        if (clnqVar != null) {
            j = clnqVar.a(j);
        }
        this.G = j;
        this.n.a.f(j);
        for (clol clolVar : this.e) {
            if (R(clolVar)) {
                clolVar.o(this.G);
            }
        }
        for (clnq clnqVar2 = this.q.d; clnqVar2 != null; clnqVar2 = clnqVar2.h) {
            for (cmjm cmjmVar : clnqVar2.j.c.b()) {
            }
        }
    }
}
