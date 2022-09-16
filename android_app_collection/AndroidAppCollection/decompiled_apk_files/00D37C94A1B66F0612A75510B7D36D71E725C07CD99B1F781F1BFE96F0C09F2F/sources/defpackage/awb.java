package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: awb  reason: default package */
/* loaded from: classes2.dex */
public abstract class awb extends phj {
    private static final byte[] q = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final MediaCodec.BufferInfo A;
    private final long[] B;
    private final long[] C;
    private final long[] D;
    private Format E;
    private Format F;
    private pne G;
    private pne H;
    private MediaCrypto I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f131J;
    private float K;
    private boolean L;
    private float M;
    private ArrayDeque N;
    private awa O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private avt W;
    private long X;
    private int Y;
    private int Z;
    public float a;
    private ByteBuffer aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private int ah;
    private int ai;
    private int aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private long an;
    private long ao;
    private boolean ap;
    private boolean aq;
    private long ar;
    private int as;
    public avx b;
    public Format c;
    public MediaFormat d;
    public avz e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public phr k;
    protected pms l;
    public long m;
    private final avw r;
    private final awd s;
    private final float t;
    private final pmv u;
    private final pmv v;
    private final pmv w;
    private final avs x;
    private final pxf y;
    private final ArrayList z;

    public awb(int i, avw avwVar, awd awdVar, float f) {
        super(i);
        this.r = avwVar;
        ptx.a(awdVar);
        this.s = awdVar;
        this.t = f;
        this.u = pmv.d();
        this.v = new pmv(0);
        this.w = new pmv(2);
        avs avsVar = new avs();
        this.x = avsVar;
        this.y = new pxf();
        this.z = new ArrayList();
        this.A = new MediaCodec.BufferInfo();
        this.a = 1.0f;
        this.K = 1.0f;
        this.B = new long[10];
        this.C = new long[10];
        this.D = new long[10];
        this.ar = -9223372036854775807L;
        this.m = -9223372036854775807L;
        avsVar.e(0);
        avsVar.d.order(ByteOrder.nativeOrder());
        this.M = -1.0f;
        this.P = 0;
        this.ah = 0;
        this.Y = -1;
        this.Z = -1;
        this.X = -9223372036854775807L;
        this.an = -9223372036854775807L;
        this.ao = -9223372036854775807L;
        this.ai = 0;
        this.aj = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean M(Format format) {
        Class cls = format.E;
        return cls == null || pnx.class.equals(cls);
    }

    private final void aA(pne pneVar) {
        pnq.c(this.H, pneVar);
        this.H = pneVar;
    }

    private final void aB() {
        try {
            this.I.setMediaDrmSession(aG(this.H).c);
            az(this.H);
            this.ai = 0;
            this.aj = 0;
        } catch (MediaCryptoException e) {
            throw V(e, this.E, 6006);
        }
    }

    private final boolean aC() {
        if (this.ak) {
            this.ai = 1;
            if (this.R) {
                this.aj = 3;
                return false;
            }
            this.aj = 2;
        } else {
            aB();
        }
        return true;
    }

    private final boolean aD() {
        avx avxVar = this.b;
        if (avxVar == null || this.ai == 2 || this.ap) {
            return false;
        }
        if (this.Y < 0) {
            int a = avxVar.a();
            this.Y = a;
            if (a < 0) {
                return false;
            }
            this.v.d = this.b.e(a);
            this.v.clear();
        }
        if (this.ai == 1) {
            if (!this.V) {
                this.al = true;
                this.b.o(this.Y, 0, 0L, 4);
                ax();
            }
            this.ai = 2;
            return false;
        } else if (this.T) {
            this.T = false;
            this.v.d.put(q);
            this.b.o(this.Y, 38, 0L, 0);
            ax();
            this.ak = true;
            return true;
        } else {
            if (this.ah == 1) {
                for (int i = 0; i < this.c.n.size(); i++) {
                    this.v.d.put((byte[]) this.c.n.get(i));
                }
                this.ah = 2;
            }
            int position = this.v.d.position();
            pit X = X();
            try {
                int S = S(X, this.v, 0);
                if (ao()) {
                    this.ao = this.an;
                }
                if (S == -3) {
                    return false;
                }
                if (S == -5) {
                    if (this.ah == 2) {
                        this.v.clear();
                        this.ah = 1;
                    }
                    i(X);
                    return true;
                } else if (!this.v.isEndOfStream()) {
                    if (this.ak || this.v.isKeyFrame()) {
                        boolean g = this.v.g();
                        if (g) {
                            pmq pmqVar = this.v.c;
                            if (position != 0) {
                                if (pmqVar.d == null) {
                                    pmqVar.d = new int[1];
                                    pmqVar.i.numBytesOfClearData = pmqVar.d;
                                }
                                int[] iArr = pmqVar.d;
                                iArr[0] = iArr[0] + position;
                            }
                        }
                        pmv pmvVar = this.v;
                        long j = pmvVar.f;
                        avt avtVar = this.W;
                        if (avtVar != null) {
                            Format format = this.E;
                            if (!avtVar.c) {
                                ByteBuffer byteBuffer = pmvVar.d;
                                ptx.a(byteBuffer);
                                int i2 = 0;
                                for (int i3 = 0; i3 < 4; i3++) {
                                    i2 = (i2 << 8) | (byteBuffer.get(i3) & 255);
                                }
                                int c = azu.c(i2);
                                if (c == -1) {
                                    avtVar.c = true;
                                    Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                    j = pmvVar.f;
                                } else {
                                    long j2 = avtVar.a;
                                    if (j2 == 0) {
                                        long j3 = pmvVar.f;
                                        avtVar.b = j3;
                                        avtVar.a = c - 529;
                                        j = j3;
                                    } else {
                                        avtVar.a = j2 + c;
                                        j = avtVar.b + ((1000000 * j2) / format.z);
                                    }
                                }
                            }
                        }
                        long j4 = j;
                        if (this.v.isDecodeOnly()) {
                            this.z.add(Long.valueOf(j4));
                        }
                        if (this.aq) {
                            this.y.e(j4, this.E);
                            this.aq = false;
                        }
                        if (this.W != null) {
                            this.an = Math.max(this.an, this.v.f);
                        } else {
                            this.an = Math.max(this.an, j4);
                        }
                        this.v.f();
                        if (this.v.hasSupplementalData()) {
                            k(this.v);
                        }
                        v(this.v);
                        try {
                            if (g) {
                                this.b.p(this.Y, this.v.c, j4);
                            } else {
                                this.b.o(this.Y, this.v.d.limit(), j4, 0);
                            }
                            ax();
                            this.ak = true;
                            this.ah = 0;
                            this.l.c++;
                            return true;
                        } catch (MediaCodec.CryptoException e) {
                            throw V(e, this.E, phk.b(e.getErrorCode()));
                        }
                    } else {
                        this.v.clear();
                        if (this.ah == 2) {
                            this.ah = 1;
                        }
                        return true;
                    }
                } else {
                    if (this.ah == 2) {
                        this.v.clear();
                        this.ah = 1;
                    }
                    this.ap = true;
                    if (!this.ak) {
                        av();
                        return false;
                    }
                    try {
                        if (!this.V) {
                            this.al = true;
                            this.b.o(this.Y, 0, 0L, 4);
                            ax();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e2) {
                        throw V(e2, this.E, phk.b(e2.getErrorCode()));
                    }
                }
            } catch (pmu e3) {
                m(e3);
                aF(0);
                au();
                return true;
            }
        }
    }

    private final boolean aE() {
        return this.Z >= 0;
    }

    private final boolean aF(int i) {
        pit X = X();
        this.u.clear();
        int S = S(X, this.u, i | 4);
        if (S == -5) {
            i(X);
            return true;
        } else if (S != -4 || !this.u.isEndOfStream()) {
            return false;
        } else {
            this.ap = true;
            av();
            return false;
        }
    }

    private static final pnx aG(pne pneVar) {
        return (pnx) pneVar.d();
    }

    private final void as() {
        this.af = false;
        this.x.clear();
        this.w.clear();
        this.ae = false;
        this.ad = false;
    }

    private final void at() {
        if (!this.ak) {
            aw();
            return;
        }
        this.ai = 1;
        this.aj = 3;
    }

    private final void au() {
        try {
            this.b.g();
        } finally {
            B();
        }
    }

    private final void aw() {
        y();
        l();
    }

    private final void ax() {
        this.Y = -1;
        this.v.d = null;
    }

    private final void ay() {
        this.Z = -1;
        this.aa = null;
    }

    private final void az(pne pneVar) {
        pnq.c(this.G, pneVar);
        this.G = pneVar;
    }

    protected void A() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B() {
        ax();
        ay();
        this.X = -9223372036854775807L;
        this.al = false;
        this.ak = false;
        this.T = false;
        this.U = false;
        this.ab = false;
        this.ac = false;
        this.z.clear();
        this.an = -9223372036854775807L;
        this.ao = -9223372036854775807L;
        avt avtVar = this.W;
        if (avtVar != null) {
            avtVar.a = 0L;
            avtVar.b = 0L;
            avtVar.c = false;
        }
        this.ai = 0;
        this.aj = 0;
        this.ah = this.ag ? 1 : 0;
    }

    protected final void C() {
        B();
        this.k = null;
        this.W = null;
        this.N = null;
        this.e = null;
        this.c = null;
        this.d = null;
        this.L = false;
        this.am = false;
        this.M = -1.0f;
        this.P = 0;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.V = false;
        this.ag = false;
        this.ah = 0;
        this.f131J = false;
    }

    @Override // defpackage.phj, defpackage.pkd
    public void D(float f, float f2) {
        this.a = f;
        this.K = f2;
        N(this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E(long j) {
        Format format = (Format) this.y.d(j);
        if (format == null && this.L) {
            format = (Format) this.y.c();
        }
        if (format != null) {
            this.F = format;
        } else if (!this.L || this.F == null) {
            return;
        }
        r(this.F, this.d);
        this.L = false;
    }

    protected final boolean F() {
        if (this.b == null) {
            return false;
        }
        if (this.aj != 3 && ((!this.Q || this.am) && (!this.R || !this.al))) {
            au();
            return false;
        }
        y();
        return true;
    }

    protected boolean G() {
        return false;
    }

    @Override // defpackage.pkd
    public boolean H() {
        return this.f;
    }

    @Override // defpackage.pkd
    public boolean I() {
        if (this.E != null) {
            if (aq() || aE()) {
                return true;
            }
            if (this.X != -9223372036854775807L && SystemClock.elapsedRealtime() < this.X) {
                return true;
            }
        }
        return false;
    }

    protected abstract boolean J(long j, long j2, avx avxVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format);

    protected boolean K(avz avzVar) {
        return true;
    }

    protected boolean L(Format format) {
        return false;
    }

    public final boolean N(Format format) {
        if (pxi.a >= 23 && this.b != null && this.aj != 3 && this.o != 0) {
            float b = b(this.K, format, ar());
            float f = this.M;
            if (f == b) {
                return true;
            }
            if (b == -1.0f) {
                at();
                return false;
            } else if (f == -1.0f && b <= this.t) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", b);
                this.b.k(bundle);
                this.M = b;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void O() {
        if (F()) {
            l();
        }
    }

    @Override // defpackage.pke
    public final int a(Format format) {
        try {
            return c(this.s, format);
        } catch (awi e) {
            throw V(e, format, 4002);
        }
    }

    protected float b(float f, Format format, Format[] formatArr) {
        throw null;
    }

    protected abstract int c(awd awdVar, Format format);

    protected abstract avv f(avz avzVar, Format format, MediaCrypto mediaCrypto, float f);

    protected avy g(Throwable th, avz avzVar) {
        return new avy(th, avzVar);
    }

    protected pmw h(avz avzVar, Format format, Format format2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (r2 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
        if (aC() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c5, code lost:
        if (aC() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d9, code lost:
        if (aC() == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.pmw i(defpackage.pit r13) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awb.i(pit):pmw");
    }

    protected abstract List j(awd awdVar, Format format, boolean z);

    @Override // defpackage.phj, defpackage.pke
    public final int jE() {
        return 8;
    }

    protected void k(pmv pmvVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026e A[Catch: Exception -> 0x02f4, TryCatch #3 {Exception -> 0x02f4, blocks: (B:73:0x0155, B:77:0x016c, B:81:0x0174, B:83:0x0180, B:84:0x0183, B:86:0x018d, B:88:0x0191, B:90:0x01a7, B:92:0x01bb, B:94:0x01c3, B:96:0x01cd, B:98:0x01d7, B:100:0x01e1, B:119:0x022e, B:121:0x0236, B:125:0x0241, B:127:0x0247, B:132:0x0253, B:134:0x025b, B:138:0x0266, B:140:0x026e, B:161:0x02ae, B:163:0x02b6, B:167:0x02c1, B:168:0x02c3, B:170:0x02cd, B:171:0x02d4, B:173:0x02d9, B:174:0x02e2, B:144:0x0279, B:146:0x027d, B:148:0x0285, B:150:0x028d, B:152:0x0297, B:154:0x02a1, B:157:0x02a6, B:103:0x01ed, B:105:0x01f3, B:107:0x01fb, B:109:0x0203, B:111:0x020d, B:113:0x0217, B:115:0x0221, B:89:0x01a1, B:76:0x0160), top: B:204:0x0155, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b6 A[Catch: Exception -> 0x02f4, TryCatch #3 {Exception -> 0x02f4, blocks: (B:73:0x0155, B:77:0x016c, B:81:0x0174, B:83:0x0180, B:84:0x0183, B:86:0x018d, B:88:0x0191, B:90:0x01a7, B:92:0x01bb, B:94:0x01c3, B:96:0x01cd, B:98:0x01d7, B:100:0x01e1, B:119:0x022e, B:121:0x0236, B:125:0x0241, B:127:0x0247, B:132:0x0253, B:134:0x025b, B:138:0x0266, B:140:0x026e, B:161:0x02ae, B:163:0x02b6, B:167:0x02c1, B:168:0x02c3, B:170:0x02cd, B:171:0x02d4, B:173:0x02d9, B:174:0x02e2, B:144:0x0279, B:146:0x027d, B:148:0x0285, B:150:0x028d, B:152:0x0297, B:154:0x02a1, B:157:0x02a6, B:103:0x01ed, B:105:0x01f3, B:107:0x01fb, B:109:0x0203, B:111:0x020d, B:113:0x0217, B:115:0x0221, B:89:0x01a1, B:76:0x0160), top: B:204:0x0155, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02cd A[Catch: Exception -> 0x02f4, TryCatch #3 {Exception -> 0x02f4, blocks: (B:73:0x0155, B:77:0x016c, B:81:0x0174, B:83:0x0180, B:84:0x0183, B:86:0x018d, B:88:0x0191, B:90:0x01a7, B:92:0x01bb, B:94:0x01c3, B:96:0x01cd, B:98:0x01d7, B:100:0x01e1, B:119:0x022e, B:121:0x0236, B:125:0x0241, B:127:0x0247, B:132:0x0253, B:134:0x025b, B:138:0x0266, B:140:0x026e, B:161:0x02ae, B:163:0x02b6, B:167:0x02c1, B:168:0x02c3, B:170:0x02cd, B:171:0x02d4, B:173:0x02d9, B:174:0x02e2, B:144:0x0279, B:146:0x027d, B:148:0x0285, B:150:0x028d, B:152:0x0297, B:154:0x02a1, B:157:0x02a6, B:103:0x01ed, B:105:0x01f3, B:107:0x01fb, B:109:0x0203, B:111:0x020d, B:113:0x0217, B:115:0x0221, B:89:0x01a1, B:76:0x0160), top: B:204:0x0155, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d9 A[Catch: Exception -> 0x02f4, TryCatch #3 {Exception -> 0x02f4, blocks: (B:73:0x0155, B:77:0x016c, B:81:0x0174, B:83:0x0180, B:84:0x0183, B:86:0x018d, B:88:0x0191, B:90:0x01a7, B:92:0x01bb, B:94:0x01c3, B:96:0x01cd, B:98:0x01d7, B:100:0x01e1, B:119:0x022e, B:121:0x0236, B:125:0x0241, B:127:0x0247, B:132:0x0253, B:134:0x025b, B:138:0x0266, B:140:0x026e, B:161:0x02ae, B:163:0x02b6, B:167:0x02c1, B:168:0x02c3, B:170:0x02cd, B:171:0x02d4, B:173:0x02d9, B:174:0x02e2, B:144:0x0279, B:146:0x027d, B:148:0x0285, B:150:0x028d, B:152:0x0297, B:154:0x02a1, B:157:0x02a6, B:103:0x01ed, B:105:0x01f3, B:107:0x01fb, B:109:0x0203, B:111:0x020d, B:113:0x0217, B:115:0x0221, B:89:0x01a1, B:76:0x0160), top: B:204:0x0155, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awb.l():void");
    }

    protected void m(Exception exc) {
        throw null;
    }

    protected void n(String str, long j, long j2) {
        throw null;
    }

    protected void o(String str) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.phj
    public void p() {
        this.E = null;
        this.ar = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.as = 0;
        F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.phj
    public void q(boolean z, boolean z2) {
        this.l = new pms();
    }

    protected void r(Format format, MediaFormat mediaFormat) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.phj
    public void s(long j, boolean z) {
        this.ap = false;
        this.f = false;
        this.g = false;
        if (this.ad) {
            this.x.clear();
            this.w.clear();
            this.ae = false;
        } else {
            O();
        }
        if (this.y.a() > 0) {
            this.aq = true;
        }
        this.y.f();
        int i = this.as;
        if (i != 0) {
            int i2 = i - 1;
            this.m = this.C[i2];
            this.ar = this.B[i2];
            this.as = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t(long j) {
        while (true) {
            int i = this.as;
            if (i == 0 || j < this.D[0]) {
                return;
            }
            long[] jArr = this.B;
            this.ar = jArr[0];
            this.m = this.C[0];
            int i2 = i - 1;
            this.as = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.C;
            System.arraycopy(jArr2, 1, jArr2, 0, this.as);
            long[] jArr3 = this.D;
            System.arraycopy(jArr3, 1, jArr3, 0, this.as);
            u();
        }
    }

    protected void u() {
    }

    protected void v(pmv pmvVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.phj
    public void w() {
        try {
            as();
            y();
        } finally {
            aA(null);
        }
    }

    @Override // defpackage.phj
    protected final void x(Format[] formatArr, long j, long j2) {
        boolean z = true;
        if (this.m == -9223372036854775807L) {
            if (this.ar != -9223372036854775807L) {
                z = false;
            }
            ptx.e(z);
            this.ar = j;
            this.m = j2;
            return;
        }
        int i = this.as;
        if (i == 10) {
            long j3 = this.C[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.as = i + 1;
        }
        long[] jArr = this.B;
        int i2 = this.as - 1;
        jArr[i2] = j;
        this.C[i2] = j2;
        this.D[i2] = this.an;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [pne, android.media.MediaCrypto] */
    public final void y() {
        try {
            avx avxVar = this.b;
            if (avxVar != null) {
                avxVar.h();
                this.l.b++;
                o(this.e.a);
            }
            this.b = null;
            try {
                MediaCrypto mediaCrypto = this.I;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.b = null;
            try {
                MediaCrypto mediaCrypto2 = this.I;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
        r1 = r15;
        r17 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d6 A[LOOP:1: B:166:0x02d0->B:168:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02ce A[SYNTHETIC] */
    @Override // defpackage.pkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(long r22, long r24) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awb.z(long, long):void");
    }

    private final void av() {
        int i = this.aj;
        if (i == 1) {
            au();
        } else if (i == 2) {
            au();
            aB();
        } else if (i == 3) {
            aw();
        } else {
            this.f = true;
            A();
        }
    }
}
