package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;
/* compiled from: PG */
/* renamed from: pxj  reason: default package */
/* loaded from: classes4.dex */
public abstract class pxj extends phj {
    private long A;
    private long B;
    private boolean C;
    private boolean D;
    private boolean E;
    private asr F;
    private long G;
    private int H;
    private int I;

    /* renamed from: J  reason: collision with root package name */
    private int f259J;
    private long K;
    private long L;
    protected pms a;
    private final long b;
    private final int c;
    private final pyj d;
    private final pxf e;
    private final pmv f;
    private Format g;
    private Format h;
    private pmr i;
    private pxr j;
    private VideoDecoderOutputBuffer k;
    private int l;
    private Object m;
    private Surface q;
    private pxs r;
    private pxt s;
    private pne t;
    private pne u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: protected */
    public pxj(long j, Handler handler, pyk pykVar, int i) {
        super(2);
        this.b = j;
        this.c = i;
        this.B = -9223372036854775807L;
        r();
        this.e = new pxf();
        this.f = pmv.d();
        this.d = new pyj(handler, pykVar);
        this.v = 0;
        this.l = -1;
    }

    private final void A() {
        this.B = this.b > 0 ? SystemClock.elapsedRealtime() + this.b : -9223372036854775807L;
    }

    private final void B(pne pneVar) {
        pnq.c(this.u, pneVar);
        this.u = pneVar;
    }

    private final boolean C() {
        return this.l != -1;
    }

    public static boolean m(long j) {
        return j < -30000;
    }

    private final void o() {
        this.x = false;
    }

    private final void r() {
        this.F = null;
    }

    private final void t() {
        ExoMediaCrypto exoMediaCrypto;
        if (this.i != null) {
            return;
        }
        y(this.u);
        pne pneVar = this.t;
        if (pneVar != null) {
            exoMediaCrypto = pneVar.d();
            if (exoMediaCrypto == null && this.t.c() == null) {
                return;
            }
        } else {
            exoMediaCrypto = null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.i = b(this.g, exoMediaCrypto);
            f(this.l);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.d.a(this.i.e(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.a.a++;
        } catch (OutOfMemoryError e) {
            throw V(e, this.g, 4001);
        } catch (pmt e2) {
            pns.e("DecoderVideoRenderer", "Video codec error", e2);
            this.d.h(e2);
            throw V(e2, this.g, 4001);
        }
    }

    private final void u() {
        if (this.H > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.d.d(this.H, elapsedRealtime - this.G);
            this.H = 0;
            this.G = elapsedRealtime;
        }
    }

    private final void v() {
        asr asrVar = this.F;
        if (asrVar != null) {
            this.d.i(asrVar);
        }
    }

    private final void y(pne pneVar) {
        pnq.c(this.t, pneVar);
        this.t = pneVar;
    }

    @Override // defpackage.pkd
    public final boolean H() {
        return this.E;
    }

    @Override // defpackage.pkd
    public boolean I() {
        if (this.g == null || ((!aq() && this.k == null) || (!this.x && C()))) {
            if (this.B == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() < this.B) {
                return true;
            }
            this.B = -9223372036854775807L;
            return false;
        }
        this.B = -9223372036854775807L;
        return true;
    }

    @Override // defpackage.phj, defpackage.pkb
    public void ad(int i, Object obj) {
        int i2 = 1;
        if (i != 1) {
            if (i != 7) {
                return;
            }
            this.s = (pxt) obj;
            return;
        }
        if (obj instanceof Surface) {
            this.q = (Surface) obj;
            this.r = null;
            this.l = 1;
        } else if (obj instanceof pxs) {
            this.q = null;
            this.r = (pxs) obj;
            this.l = 0;
            i2 = 0;
        } else {
            this.q = null;
            this.r = null;
            this.l = -1;
            obj = null;
            i2 = -1;
        }
        if (this.m == obj) {
            if (obj == null) {
                return;
            }
            v();
            if (!this.x) {
                return;
            }
            this.d.g(this.m);
            return;
        }
        this.m = obj;
        if (obj == null) {
            r();
            o();
            return;
        }
        if (this.i != null) {
            f(i2);
        }
        v();
        o();
        if (this.o != 2) {
            return;
        }
        A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.phj
    public void af() {
        this.H = 0;
        this.G = SystemClock.elapsedRealtime();
        this.K = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // defpackage.phj
    protected final void ag() {
        this.B = -9223372036854775807L;
        u();
    }

    protected abstract pmr b(Format format, ExoMediaCrypto exoMediaCrypto);

    protected pmw c(String str, Format format, Format format2) {
        throw null;
    }

    protected abstract void e(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    protected abstract void f(int i);

    protected final void g(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        l(1);
        videoDecoderOutputBuffer.release();
    }

    protected final void h() {
        this.f259J = 0;
        if (this.v != 0) {
            j();
            t();
            return;
        }
        this.j = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.k;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.k = null;
        }
        this.i.j();
        this.w = false;
    }

    protected final void i(pit pitVar) {
        pmw c;
        this.C = true;
        Format format = pitVar.b;
        ptx.a(format);
        B(pitVar.a);
        Format format2 = this.g;
        this.g = format;
        pmr pmrVar = this.i;
        if (pmrVar == null) {
            t();
            this.d.f(this.g, null);
            return;
        }
        if (this.u != this.t) {
            c = new pmw(pmrVar.e(), format2, format, 0, 128);
        } else {
            c = c(pmrVar.e(), format2, format);
        }
        if (c.d == 0) {
            if (this.w) {
                this.v = 1;
            } else {
                j();
                t();
            }
        }
        this.d.f(this.g, c);
    }

    protected final void j() {
        this.j = null;
        this.k = null;
        this.v = 0;
        this.w = false;
        this.f259J = 0;
        pmr pmrVar = this.i;
        if (pmrVar != null) {
            this.a.b++;
            pmrVar.f();
            this.d.b(this.i.e());
            this.i = null;
        }
        y(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(com.google.android.exoplayer2.video.VideoDecoderOutputBuffer r8, long r9, com.google.android.exoplayer2.Format r11) {
        /*
            r7 = this;
            pxt r0 = r7.s
            if (r0 == 0) goto Le
            long r3 = java.lang.System.nanoTime()
            r6 = 0
            r1 = r9
            r5 = r11
            r0.a(r1, r3, r5, r6)
        Le:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r0
            long r9 = defpackage.phk.c(r9)
            r7.K = r9
            int r9 = r8.mode
            r10 = 0
            r11 = 1
            if (r9 != r11) goto L2a
            android.view.Surface r9 = r7.q
            if (r9 == 0) goto L29
            r9 = 1
            r0 = 1
            goto L2b
        L29:
            r9 = 1
        L2a:
            r0 = 0
        L2b:
            if (r9 != 0) goto L33
            pxs r9 = r7.r
            if (r9 == 0) goto L33
            r9 = 1
            goto L34
        L33:
            r9 = 0
        L34:
            if (r9 != 0) goto L3d
            if (r0 == 0) goto L39
            goto L3d
        L39:
            r7.g(r8)
            return
        L3d:
            int r0 = r8.width
            int r1 = r8.height
            asr r2 = r7.F
            if (r2 == 0) goto L4d
            int r3 = r2.a
            if (r3 != r0) goto L4d
            int r2 = r2.b
            if (r2 == r1) goto L59
        L4d:
            asr r2 = new asr
            r2.<init>(r0, r1)
            r7.F = r2
            pyj r0 = r7.d
            r0.i(r2)
        L59:
            if (r9 == 0) goto L61
            pxs r9 = r7.r
            r9.rS(r8)
            goto L66
        L61:
            android.view.Surface r9 = r7.q
            r7.e(r8, r9)
        L66:
            r7.I = r10
            pms r8 = r7.a
            int r9 = r8.e
            int r9 = r9 + r11
            r8.e = r9
            r7.z = r11
            boolean r8 = r7.x
            if (r8 != 0) goto L7e
            r7.x = r11
            pyj r8 = r7.d
            java.lang.Object r9 = r7.m
            r8.g(r9)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxj.k(com.google.android.exoplayer2.video.VideoDecoderOutputBuffer, long, com.google.android.exoplayer2.Format):void");
    }

    protected final void l(int i) {
        pms pmsVar = this.a;
        pmsVar.g += i;
        this.H += i;
        int i2 = this.I + i;
        this.I = i2;
        pmsVar.h = Math.max(i2, pmsVar.h);
        int i3 = this.c;
        if (i3 <= 0 || this.H < i3) {
            return;
        }
        u();
    }

    protected boolean n(long j, long j2) {
        return m(j);
    }

    @Override // defpackage.phj
    protected final void p() {
        this.g = null;
        r();
        o();
        try {
            B(null);
            j();
        } finally {
            this.d.c(this.a);
        }
    }

    @Override // defpackage.phj
    protected final void q(boolean z, boolean z2) {
        pms pmsVar = new pms();
        this.a = pmsVar;
        this.d.e(pmsVar);
        this.y = z2;
        this.z = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.phj
    public void s(long j, boolean z) {
        this.D = false;
        this.E = false;
        o();
        this.A = -9223372036854775807L;
        this.I = 0;
        if (this.i != null) {
            h();
        }
        if (z) {
            A();
        } else {
            this.B = -9223372036854775807L;
        }
        this.e.f();
    }

    @Override // defpackage.phj
    protected final void x(Format[] formatArr, long j, long j2) {
        this.L = j2;
    }

    @Override // defpackage.pkd
    public final void z(long j, long j2) {
        int T;
        if (this.E) {
            return;
        }
        if (this.g == null) {
            pit X = X();
            this.f.clear();
            int S = S(X, this.f, 2);
            if (S != -5) {
                if (S != -4) {
                    return;
                }
                ptx.e(this.f.isEndOfStream());
                this.D = true;
                this.E = true;
                return;
            }
            i(X);
        }
        t();
        if (this.i == null) {
            return;
        }
        try {
            int i = pxi.a;
            while (true) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.k;
                if (videoDecoderOutputBuffer == null) {
                    videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) this.i.i();
                    this.k = videoDecoderOutputBuffer;
                    if (videoDecoderOutputBuffer == null) {
                        break;
                    }
                    this.a.f += videoDecoderOutputBuffer.skippedOutputBufferCount;
                    this.f259J -= videoDecoderOutputBuffer.skippedOutputBufferCount;
                }
                if (!videoDecoderOutputBuffer.isEndOfStream()) {
                    if (this.A == -9223372036854775807L) {
                        this.A = j;
                    }
                    long j3 = this.k.timeUs - j;
                    if (C()) {
                        long j4 = this.k.timeUs - this.L;
                        Format format = (Format) this.e.d(j4);
                        if (format != null) {
                            this.h = format;
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.K;
                        int i2 = this.o;
                        if (!this.z) {
                            if (i2 != 2 && !this.y) {
                                break;
                            }
                            k(this.k, j4, this.h);
                        } else {
                            if (this.x) {
                                if (i2 == 2) {
                                    if (!m(j3) || elapsedRealtime <= 100000) {
                                        if (j != this.A) {
                                            if (j3 < -500000 && (T = T(j)) != 0) {
                                                this.a.i++;
                                                l(this.f259J + T);
                                                h();
                                                break;
                                            }
                                            if (!n(j3, j2)) {
                                                if (j3 >= 30000) {
                                                    break;
                                                }
                                                k(this.k, j4, this.h);
                                            } else {
                                                g(this.k);
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            }
                            k(this.k, j4, this.h);
                        }
                    } else if (!m(j3)) {
                        break;
                    } else {
                        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.k;
                        this.a.f++;
                        videoDecoderOutputBuffer2.release();
                    }
                    long j5 = this.k.timeUs;
                    this.f259J--;
                    this.k = null;
                } else if (this.v == 2) {
                    j();
                    t();
                } else {
                    this.k.release();
                    this.k = null;
                    this.E = true;
                }
            }
            while (true) {
                pmr pmrVar = this.i;
                if (pmrVar == null || this.v == 2 || this.D) {
                    break;
                }
                pxr pxrVar = this.j;
                if (pxrVar == null) {
                    pxrVar = (pxr) pmrVar.h();
                    this.j = pxrVar;
                    if (pxrVar == null) {
                        break;
                    }
                }
                if (this.v != 1) {
                    pit X2 = X();
                    int S2 = S(X2, this.j, 0);
                    if (S2 == -5) {
                        i(X2);
                    } else if (S2 != -4) {
                        break;
                    } else if (!this.j.isEndOfStream()) {
                        if (this.C) {
                            this.e.e(this.j.f, this.g);
                            this.C = false;
                        }
                        this.j.f();
                        pxr pxrVar2 = this.j;
                        pxrVar2.a = this.g;
                        this.i.k(pxrVar2);
                        this.f259J++;
                        this.w = true;
                        this.a.c++;
                        this.j = null;
                    } else {
                        this.D = true;
                        this.i.k(this.j);
                        this.j = null;
                        break;
                    }
                } else {
                    pxrVar.setFlags(4);
                    this.i.k(this.j);
                    this.j = null;
                    this.v = 2;
                    break;
                }
            }
            this.a.a();
        } catch (pmt e) {
            pns.e("DecoderVideoRenderer", "Video codec error", e);
            this.d.h(e);
            throw V(e, this.g, 4003);
        }
    }
}
