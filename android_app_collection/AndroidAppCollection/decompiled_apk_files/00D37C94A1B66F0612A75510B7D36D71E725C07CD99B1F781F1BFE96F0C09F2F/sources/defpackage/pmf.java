package defpackage;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: pmf  reason: default package */
/* loaded from: classes4.dex */
public final class pmf implements plo {
    private long A;
    private int B;
    private boolean C;
    private boolean D;
    private long E;
    private float F;
    private pky[] G;
    private ByteBuffer[] H;
    private ByteBuffer I;

    /* renamed from: J  reason: collision with root package name */
    private int f257J;
    private ByteBuffer K;
    private int L;
    private boolean M;
    private boolean N;
    private boolean O;
    private int P;
    private asp Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private final ply U;
    public final ConditionVariable a;
    public pll b;
    public AudioTrack c;
    public boolean d;
    public long e;
    private final pkv f;
    private final plt g;
    private final pmn h;
    private final pky[] i;
    private final pky[] j;
    private final plr k;
    private final ArrayDeque l;
    private final int m;
    private pme n;
    private final pma o;
    private final pma p;
    private plx q;
    private plx r;
    private aso s;
    private plz t;
    private plz u;
    private ByteBuffer v;
    private int w;
    private long x;
    private long y;
    private long z;

    public pmf(pkv pkvVar, ply plyVar, int i) {
        this.f = pkvVar;
        this.U = plyVar;
        int i2 = pxi.a;
        this.m = pxi.a < 29 ? 0 : i;
        this.a = new ConditionVariable(true);
        this.k = new plr(new pmb(this));
        plt pltVar = new plt();
        this.g = pltVar;
        pmn pmnVar = new pmn();
        this.h = pmnVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new pmj(), pltVar, pmnVar);
        Collections.addAll(arrayList, plyVar.a);
        this.i = (pky[]) arrayList.toArray(new pky[0]);
        this.j = new pky[]{new pmg()};
        this.F = 1.0f;
        this.s = aso.a;
        this.P = 0;
        this.Q = new asp();
        this.u = new plz(pjt.a, false, 0L, 0L);
        this.L = -1;
        this.G = new pky[0];
        this.H = new ByteBuffer[0];
        this.l = new ArrayDeque();
        this.o = new pma();
        this.p = new pma();
    }

    private static int B(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.util.Pair C(com.google.android.exoplayer2.Format r12, defpackage.pkv r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmf.C(com.google.android.exoplayer2.Format, pkv):android.util.Pair");
    }

    private final pjt D() {
        return E().a;
    }

    private final plz E() {
        plz plzVar = this.t;
        return plzVar != null ? plzVar : !this.l.isEmpty() ? (plz) this.l.getLast() : this.u;
    }

    private final void F(long j) {
        pjt pjtVar;
        boolean z;
        if (Q()) {
            ply plyVar = this.U;
            pjtVar = D();
            plyVar.c.a(pjtVar.b);
            pmm pmmVar = plyVar.c;
            float f = pjtVar.c;
            if (pmmVar.c != f) {
                pmmVar.c = f;
                pmmVar.g = true;
            }
        } else {
            pjtVar = pjt.a;
        }
        pjt pjtVar2 = pjtVar;
        if (Q()) {
            ply plyVar2 = this.U;
            boolean A = A();
            plyVar2.b.a = A;
            z = A;
        } else {
            z = false;
        }
        this.l.add(new plz(pjtVar2, z, Math.max(0L, j), this.r.b(y())));
        pky[] pkyVarArr = this.r.i;
        ArrayList arrayList = new ArrayList();
        for (pky pkyVar : pkyVarArr) {
            if (pkyVar.o()) {
                arrayList.add(pkyVar);
            } else {
                pkyVar.l();
            }
        }
        int size = arrayList.size();
        this.G = (pky[]) arrayList.toArray(new pky[size]);
        this.H = new ByteBuffer[size];
        G();
        pll pllVar = this.b;
        if (pllVar != null) {
            pllVar.f(z);
        }
    }

    private final void G() {
        int i = 0;
        while (true) {
            pky[] pkyVarArr = this.G;
            if (i < pkyVarArr.length) {
                pky pkyVar = pkyVarArr[i];
                pkyVar.l();
                this.H[i] = pkyVar.k();
                i++;
            } else {
                return;
            }
        }
    }

    private final void H() {
        if (!this.r.d()) {
            return;
        }
        this.S = true;
    }

    private final void I() {
        if (!this.N) {
            this.N = true;
            plr plrVar = this.k;
            long y = y();
            plrVar.x = plrVar.b();
            plrVar.v = SystemClock.elapsedRealtime() * 1000;
            plrVar.y = y;
            this.c.stop();
            this.w = 0;
        }
    }

    private final void J(long j) {
        ByteBuffer byteBuffer;
        int length = this.G.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.H[i - 1];
            } else {
                byteBuffer = this.I;
                if (byteBuffer == null) {
                    byteBuffer = pky.f;
                }
            }
            if (i == length) {
                M(byteBuffer, j);
            } else {
                pky pkyVar = this.G[i];
                if (i > this.L) {
                    pkyVar.h(byteBuffer);
                }
                ByteBuffer k = pkyVar.k();
                this.H[i] = k;
                if (k.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    private final void K(pjt pjtVar, boolean z) {
        plz E = E();
        if (!pjtVar.equals(E.a) || z != E.b) {
            plz plzVar = new plz(pjtVar, z, -9223372036854775807L, -9223372036854775807L);
            if (O()) {
                this.t = plzVar;
            } else {
                this.u = plzVar;
            }
        }
    }

    private final void L() {
        if (!O()) {
            return;
        }
        int i = pxi.a;
        this.c.setVolume(this.F);
    }

    private final void M(ByteBuffer byteBuffer, long j) {
        int B;
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.K;
        boolean z = true;
        if (byteBuffer2 != null) {
            ptx.c(byteBuffer2 == byteBuffer);
        } else {
            this.K = byteBuffer;
            int i = pxi.a;
        }
        int remaining = byteBuffer.remaining();
        int i2 = pxi.a;
        if (this.R) {
            ptx.e(j != -9223372036854775807L);
            AudioTrack audioTrack = this.c;
            if (pxi.a >= 26) {
                B = audioTrack.write(byteBuffer, remaining, 1, j * 1000);
            } else {
                if (this.v == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.v = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.v.putInt(1431633921);
                }
                if (this.w == 0) {
                    this.v.putInt(4, remaining);
                    this.v.putLong(8, j * 1000);
                    this.v.position(0);
                    this.w = remaining;
                }
                int remaining2 = this.v.remaining();
                if (remaining2 > 0) {
                    int write = audioTrack.write(this.v, remaining2, 1);
                    if (write < 0) {
                        this.w = 0;
                        B = write;
                    } else if (write < remaining2) {
                        B = 0;
                    }
                }
                B = B(audioTrack, byteBuffer, remaining);
                if (B < 0) {
                    this.w = 0;
                } else {
                    this.w -= B;
                }
            }
        } else {
            B = B(this.c, byteBuffer, remaining);
        }
        this.e = SystemClock.elapsedRealtime();
        if (B < 0) {
            if ((pxi.a < 24 || B != -6) && B != -32) {
                z = false;
            }
            if (z) {
                H();
            }
            pln plnVar = new pln(B, this.r.a, z);
            pll pllVar = this.b;
            if (pllVar != null) {
                pllVar.a(plnVar);
            }
            if (plnVar.b) {
                throw plnVar;
            }
            this.p.b(plnVar);
            return;
        }
        this.p.a();
        if (P(this.c)) {
            long j2 = this.A;
            if (j2 > 0) {
                this.T = false;
            }
            if (this.d && this.b != null && B < remaining && !this.T) {
                plr plrVar = this.k;
                this.b.c(phk.d(plrVar.a(j2 - plrVar.b())));
            }
        }
        int i3 = this.r.c;
        if (i3 == 0) {
            this.z += B;
        }
        if (B != remaining) {
            return;
        }
        if (i3 != 0) {
            if (byteBuffer != this.I) {
                z = false;
            }
            ptx.e(z);
            this.A += this.B * this.f257J;
        }
        this.K = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean N() {
        /*
            r9 = this;
            int r0 = r9.L
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.L = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.L
            pky[] r5 = r9.G
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.m()
        L1f:
            r9.J(r7)
            boolean r0 = r4.p()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.L
            int r0 = r0 + r2
            r9.L = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.K
            if (r0 == 0) goto L3b
            r9.M(r0, r7)
            java.nio.ByteBuffer r0 = r9.K
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.L = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmf.N():boolean");
    }

    private final boolean O() {
        return this.c != null;
    }

    private static boolean P(AudioTrack audioTrack) {
        return pxi.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean Q() {
        if (this.R || !"audio/raw".equals(this.r.a.l)) {
            return false;
        }
        int i = this.r.a.A;
        return true;
    }

    private final boolean R(Format format, aso asoVar) {
        int d;
        if (pxi.a < 29 || this.m == 0) {
            return false;
        }
        String str = format.l;
        ptx.a(str);
        int a = pwl.a(str, format.i);
        if (a == 0 || (d = pxi.d(format.y)) == 0 || !AudioManager.isOffloadedPlaybackSupported(z(format.z, d, a), asoVar.a())) {
            return false;
        }
        return !(format.B != 0 || format.C != 0) || this.m != 1 || (pxi.a >= 30 && pxi.d.startsWith("Pixel"));
    }

    public static AudioFormat z(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public final boolean A() {
        return E().b;
    }

    @Override // defpackage.plo
    public final int a(Format format) {
        if (!"audio/raw".equals(format.l)) {
            return ((this.S || !R(format, this.s)) && C(format, this.f) == null) ? 0 : 2;
        } else if (pxi.P(format.A)) {
            return format.A != 2 ? 1 : 2;
        } else {
            int i = format.A;
            StringBuilder sb = new StringBuilder(33);
            sb.append("Invalid PCM encoding: ");
            sb.append(i);
            Log.w("DefaultAudioSink", sb.toString());
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
        if (r3 != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0211 A[Catch: Exception -> 0x022f, TRY_LEAVE, TryCatch #0 {Exception -> 0x022f, blocks: (B:76:0x01ed, B:78:0x0211), top: B:135:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027d  */
    @Override // defpackage.plo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(boolean r28) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmf.b(boolean):long");
    }

    @Override // defpackage.plo
    public final pjt c() {
        return D();
    }

    @Override // defpackage.plo
    public final void d() {
        if (this.R) {
            this.R = false;
            f();
        }
    }

    @Override // defpackage.plo
    public final void e() {
        int i = pxi.a;
        ptx.e(true);
        ptx.e(this.O);
        if (!this.R) {
            this.R = true;
            f();
        }
    }

    @Override // defpackage.plo
    public final void f() {
        if (O()) {
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.T = false;
            this.B = 0;
            this.u = new plz(D(), A(), 0L, 0L);
            this.E = 0L;
            this.t = null;
            this.l.clear();
            this.I = null;
            this.f257J = 0;
            this.K = null;
            this.N = false;
            this.M = false;
            this.L = -1;
            this.v = null;
            this.w = 0;
            this.h.c = 0L;
            G();
            AudioTrack audioTrack = this.k.b;
            ptx.a(audioTrack);
            if (audioTrack.getPlayState() == 3) {
                this.c.pause();
            }
            if (P(this.c)) {
                pme pmeVar = this.n;
                ptx.a(pmeVar);
                this.c.unregisterStreamEventCallback(pmeVar.b);
                pmeVar.a.removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.c;
            this.c = null;
            int i = pxi.a;
            plx plxVar = this.q;
            if (plxVar != null) {
                this.r = plxVar;
                this.q = null;
            }
            plr plrVar = this.k;
            plrVar.d();
            plrVar.b = null;
            plrVar.d = null;
            this.a.close();
            new plw(this, audioTrack2).start();
        }
        this.p.a();
        this.o.a();
    }

    @Override // defpackage.plo
    public final void g() {
        this.C = true;
    }

    @Override // defpackage.plo
    public final void h() {
        this.d = false;
        if (O()) {
            plr plrVar = this.k;
            plrVar.d();
            if (plrVar.v != -9223372036854775807L) {
                return;
            }
            plq plqVar = plrVar.d;
            ptx.a(plqVar);
            plqVar.d();
            this.c.pause();
        }
    }

    @Override // defpackage.plo
    public final void i() {
        this.d = true;
        if (O()) {
            plq plqVar = this.k.d;
            ptx.a(plqVar);
            plqVar.d();
            this.c.play();
        }
    }

    @Override // defpackage.plo
    public final void j() {
        if (this.M || !O() || !N()) {
            return;
        }
        I();
        this.M = true;
    }

    @Override // defpackage.plo
    public final void k() {
        f();
        for (pky pkyVar : this.i) {
            pkyVar.n();
        }
        pky[] pkyVarArr = this.j;
        int length = pkyVarArr.length;
        for (int i = 0; i <= 0; i++) {
            pkyVarArr[i].n();
        }
        this.d = false;
        this.S = false;
    }

    @Override // defpackage.plo
    public final void l(aso asoVar) {
        if (this.s.equals(asoVar)) {
            return;
        }
        this.s = asoVar;
        if (this.R) {
            return;
        }
        f();
    }

    @Override // defpackage.plo
    public final void m(int i) {
        if (this.P != i) {
            this.P = i;
            this.O = i != 0;
            f();
        }
    }

    @Override // defpackage.plo
    public final void n(asp aspVar) {
        if (this.Q.equals(aspVar)) {
            return;
        }
        int i = aspVar.a;
        float f = aspVar.b;
        if (this.c != null) {
            int i2 = this.Q.a;
        }
        this.Q = aspVar;
    }

    @Override // defpackage.plo
    public final void o(pll pllVar) {
        this.b = pllVar;
    }

    @Override // defpackage.plo
    public final void p(pjt pjtVar) {
        K(new pjt(pxi.a(pjtVar.b, 0.1f, 8.0f), pxi.a(pjtVar.c, 0.1f, 8.0f)), A());
    }

    @Override // defpackage.plo
    public final void q(boolean z) {
        K(D(), z);
    }

    @Override // defpackage.plo
    public final void r(float f) {
        if (this.F != f) {
            this.F = f;
            L();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0106 A[Catch: plk -> 0x0147, TryCatch #1 {plk -> 0x0147, blocks: (B:33:0x007f, B:35:0x0093, B:37:0x009b, B:39:0x00a1, B:40:0x00a8, B:41:0x00c3, B:43:0x00ec, B:50:0x00fc, B:52:0x0106, B:54:0x0112, B:56:0x013c, B:58:0x0143, B:59:0x0146, B:34:0x0084), top: B:200:0x007f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    @Override // defpackage.plo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(java.nio.ByteBuffer r25, long r26, int r28) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmf.s(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // defpackage.plo
    public final boolean t() {
        return O() && this.k.e(y());
    }

    @Override // defpackage.plo
    public final boolean u() {
        return !O() || (this.M && !t());
    }

    @Override // defpackage.plo
    public final boolean v(Format format) {
        return a(format) != 0;
    }

    @Override // defpackage.plo
    public final void w(Format format, int[] iArr) {
        int i;
        pky[] pkyVarArr;
        int intValue;
        int i2;
        int i3;
        int i4;
        int i5 = -1;
        if ("audio/raw".equals(format.l)) {
            ptx.c(pxi.P(format.A));
            int h = pxi.h(format.A, format.y);
            int i6 = format.A;
            pky[] pkyVarArr2 = this.i;
            pmn pmnVar = this.h;
            int i7 = format.B;
            int i8 = format.C;
            pmnVar.a = i7;
            pmnVar.b = i8;
            this.g.a = iArr;
            pkw pkwVar = new pkw(format.z, format.y, i6);
            for (pky pkyVar : pkyVarArr2) {
                try {
                    pkw j = pkyVar.j(pkwVar);
                    if (true == pkyVar.o()) {
                        pkwVar = j;
                    }
                } catch (pkx e) {
                    throw new plj(e, format);
                }
            }
            int i9 = pkwVar.d;
            int i10 = pkwVar.b;
            int d = pxi.d(pkwVar.c);
            i2 = i9;
            pkyVarArr = pkyVarArr2;
            i4 = pxi.h(i9, pkwVar.c);
            i3 = i10;
            i5 = h;
            intValue = d;
            i = 0;
        } else {
            pky[] pkyVarArr3 = new pky[0];
            int i11 = format.z;
            if (R(format, this.s)) {
                String str = format.l;
                ptx.a(str);
                pkyVarArr = pkyVarArr3;
                i2 = pwl.a(str, format.i);
                intValue = pxi.d(format.y);
                i = 1;
            } else {
                Pair C = C(format, this.f);
                if (C == null) {
                    String valueOf = String.valueOf(format);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                    sb.append("Unable to configure passthrough for: ");
                    sb.append(valueOf);
                    throw new plj(sb.toString(), format);
                }
                int intValue2 = ((Integer) C.first).intValue();
                i = 2;
                pkyVarArr = pkyVarArr3;
                intValue = ((Integer) C.second).intValue();
                i2 = intValue2;
            }
            i3 = i11;
            i4 = -1;
        }
        if (i2 == 0) {
            String valueOf2 = String.valueOf(format);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 48);
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i);
            sb2.append(") for: ");
            sb2.append(valueOf2);
            throw new plj(sb2.toString(), format);
        } else if (intValue != 0) {
            this.S = false;
            plx plxVar = new plx(format, i5, i, i4, i3, intValue, i2, pkyVarArr);
            if (O()) {
                this.q = plxVar;
            } else {
                this.r = plxVar;
            }
        } else {
            String valueOf3 = String.valueOf(format);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 54);
            sb3.append("Invalid output channel config (mode=");
            sb3.append(i);
            sb3.append(") for: ");
            sb3.append(valueOf3);
            throw new plj(sb3.toString(), format);
        }
    }

    public final long x() {
        plx plxVar = this.r;
        return plxVar.c == 0 ? this.x / plxVar.b : this.y;
    }

    public final long y() {
        plx plxVar = this.r;
        return plxVar.c == 0 ? this.z / plxVar.d : this.A;
    }

    public pmf(pkv pkvVar, pky[] pkyVarArr) {
        this(pkvVar, new ply(pkyVarArr), 0);
    }
}
