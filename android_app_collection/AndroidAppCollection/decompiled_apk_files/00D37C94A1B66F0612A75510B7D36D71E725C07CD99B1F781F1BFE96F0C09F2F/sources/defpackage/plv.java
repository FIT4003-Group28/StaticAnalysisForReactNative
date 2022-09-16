package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
/* compiled from: PG */
/* renamed from: plv  reason: default package */
/* loaded from: classes4.dex */
public abstract class plv extends phj implements pwj {
    public final plh a;
    public final plo b;
    public boolean c;
    private final pmv d;
    private pms e;
    private Format f;
    private int g;
    private int h;
    private pmr i;
    private pmv j;
    private SimpleOutputBuffer k;
    private pne l;
    private pne m;
    private int q;
    private boolean r;
    private boolean s;
    private long t;
    private boolean u;
    private boolean v;
    private boolean w;

    public plv() {
        this((Handler) null, (pli) null, new pky[0]);
    }

    private final void g() {
        ExoMediaCrypto exoMediaCrypto;
        if (this.i != null) {
            return;
        }
        k(this.m);
        pne pneVar = this.l;
        if (pneVar != null) {
            exoMediaCrypto = pneVar.d();
            if (exoMediaCrypto == null && this.l.c() == null) {
                return;
            }
        } else {
            exoMediaCrypto = null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = pxi.a;
            this.i = e(this.f, exoMediaCrypto);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.a.c(this.i.e(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.e.a++;
        } catch (OutOfMemoryError e) {
            throw V(e, this.f, 4001);
        } catch (pmt e2) {
            pns.e("DecoderAudioRenderer", "Audio codec error", e2);
            this.a.a(e2);
            throw V(e2, this.f, 4001);
        }
    }

    private final void h(pit pitVar) {
        pmw f;
        Format format = pitVar.b;
        ptx.a(format);
        l(pitVar.a);
        Format format2 = this.f;
        this.f = format;
        this.g = format.B;
        this.h = format.C;
        pmr pmrVar = this.i;
        if (pmrVar == null) {
            g();
            this.a.g(this.f, null);
            return;
        }
        if (this.m != this.l) {
            f = new pmw(pmrVar.e(), format2, format, 0, 128);
        } else {
            f = f(pmrVar.e(), format2, format);
        }
        if (f.d == 0) {
            if (this.r) {
                this.q = 1;
            } else {
                j();
                g();
                this.s = true;
            }
        }
        this.a.g(this.f, f);
    }

    private final void i() {
        this.w = true;
        this.b.j();
    }

    private final void j() {
        this.j = null;
        this.k = null;
        this.q = 0;
        this.r = false;
        pmr pmrVar = this.i;
        if (pmrVar != null) {
            this.e.b++;
            pmrVar.f();
            this.a.d(this.i.e());
            this.i = null;
        }
        k(null);
    }

    private final void k(pne pneVar) {
        pnq.c(this.l, pneVar);
        this.l = pneVar;
    }

    private final void l(pne pneVar) {
        pnq.c(this.m, pneVar);
        this.m = pneVar;
    }

    private final void m() {
        long b = this.b.b(H());
        if (b != Long.MIN_VALUE) {
            if (!this.c) {
                b = Math.max(this.t, b);
            }
            this.t = b;
            this.c = false;
        }
    }

    @Override // defpackage.pkd
    public final boolean H() {
        return this.w && this.b.u();
    }

    @Override // defpackage.pkd
    public boolean I() {
        if (!this.b.t()) {
            if (this.f == null) {
                return false;
            }
            if (!aq() && this.k == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.phj, defpackage.pkd
    public final pwj P() {
        return this;
    }

    @Override // defpackage.pke
    public final int a(Format format) {
        if (!pwl.j(format.l)) {
            return 0;
        }
        int b = b(format);
        if (b <= 2) {
            return b;
        }
        int i = pxi.a;
        return b | 40;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.phj
    public void af() {
        this.b.i();
    }

    @Override // defpackage.phj
    protected final void ag() {
        m();
        this.b.h();
    }

    protected abstract int b(Format format);

    protected abstract Format c(pmr pmrVar);

    protected abstract pmr e(Format format, ExoMediaCrypto exoMediaCrypto);

    protected pmw f(String str, Format format, Format format2) {
        return new pmw(str, format, format2, 0, 1);
    }

    @Override // defpackage.pwj
    public final long jF() {
        if (this.o == 2) {
            m();
        }
        return this.t;
    }

    @Override // defpackage.pwj
    public final pjt jG() {
        return this.b.c();
    }

    @Override // defpackage.pwj
    public final void jH(pjt pjtVar) {
        this.b.p(pjtVar);
    }

    @Override // defpackage.phj
    protected final void p() {
        this.f = null;
        this.s = true;
        try {
            l(null);
            j();
            this.b.k();
        } finally {
            this.a.e(this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.phj
    public void q(boolean z, boolean z2) {
        pms pmsVar = new pms();
        this.e = pmsVar;
        this.a.f(pmsVar);
        if (Z().b) {
            this.b.e();
        } else {
            this.b.d();
        }
    }

    @Override // defpackage.phj
    protected final void s(long j, boolean z) {
        this.b.f();
        this.t = j;
        this.u = true;
        this.c = true;
        this.v = false;
        this.w = false;
        if (this.i != null) {
            if (this.q != 0) {
                j();
                g();
                return;
            }
            this.j = null;
            SimpleOutputBuffer simpleOutputBuffer = this.k;
            if (simpleOutputBuffer != null) {
                simpleOutputBuffer.release();
                this.k = null;
            }
            this.i.j();
            this.r = false;
        }
    }

    @Override // defpackage.pkd
    public final void z(long j, long j2) {
        if (this.w) {
            try {
                this.b.j();
                return;
            } catch (pln e) {
                throw W(e, e.c, e.b, 5002);
            }
        }
        if (this.f == null) {
            pit X = X();
            this.d.clear();
            int S = S(X, this.d, 2);
            if (S != -5) {
                if (S != -4) {
                    return;
                }
                ptx.e(this.d.isEndOfStream());
                this.v = true;
                try {
                    i();
                    return;
                } catch (pln e2) {
                    throw V(e2, null, 5002);
                }
            }
            h(X);
        }
        g();
        if (this.i == null) {
            return;
        }
        try {
            try {
                int i = pxi.a;
                while (true) {
                    if (this.k == null) {
                        SimpleOutputBuffer simpleOutputBuffer = (SimpleOutputBuffer) ((pnb) this.i).i();
                        this.k = simpleOutputBuffer;
                        if (simpleOutputBuffer == null) {
                            break;
                        }
                        int i2 = simpleOutputBuffer.skippedOutputBufferCount;
                        if (i2 > 0) {
                            this.e.f += i2;
                            this.b.g();
                        }
                    }
                    if (!this.k.isEndOfStream()) {
                        if (this.s) {
                            pis b = c(this.i).b();
                            b.A = this.g;
                            b.B = this.h;
                            this.b.w(b.a(), null);
                            this.s = false;
                        }
                        plo ploVar = this.b;
                        SimpleOutputBuffer simpleOutputBuffer2 = this.k;
                        if (!ploVar.s(simpleOutputBuffer2.data, simpleOutputBuffer2.timeUs, 1)) {
                            break;
                        }
                        this.e.e++;
                        this.k.release();
                        this.k = null;
                    } else if (this.q == 2) {
                        j();
                        g();
                        this.s = true;
                    } else {
                        this.k.release();
                        this.k = null;
                        try {
                            i();
                        } catch (pln e3) {
                            throw W(e3, e3.c, e3.b, 5002);
                        }
                    }
                }
                while (true) {
                    pmr pmrVar = this.i;
                    if (pmrVar == null || this.q == 2 || this.v) {
                        break;
                    }
                    pmv pmvVar = this.j;
                    if (pmvVar == null) {
                        pmvVar = ((pnb) pmrVar).h();
                        this.j = pmvVar;
                        if (pmvVar == null) {
                            break;
                        }
                    }
                    if (this.q != 1) {
                        pit X2 = X();
                        int S2 = S(X2, this.j, 0);
                        if (S2 == -5) {
                            h(X2);
                        } else if (S2 != -4) {
                            break;
                        } else if (!this.j.isEndOfStream()) {
                            this.j.f();
                            pmv pmvVar2 = this.j;
                            if (this.u && !pmvVar2.isDecodeOnly()) {
                                if (Math.abs(pmvVar2.f - this.t) > 500000) {
                                    this.t = pmvVar2.f;
                                }
                                this.u = false;
                            }
                            ((pnb) this.i).k(this.j);
                            this.r = true;
                            this.e.c++;
                            this.j = null;
                        } else {
                            this.v = true;
                            ((pnb) this.i).k(this.j);
                            this.j = null;
                            break;
                        }
                    } else {
                        pmvVar.setFlags(4);
                        ((pnb) this.i).k(this.j);
                        this.j = null;
                        this.q = 2;
                        break;
                    }
                }
                this.e.a();
            } catch (pln e4) {
                throw W(e4, e4.c, e4.b, 5002);
            }
        } catch (plj e5) {
            throw V(e5, e5.a, 5001);
        } catch (plk e6) {
            throw W(e6, e6.c, e6.b, 5001);
        } catch (pmt e7) {
            pns.e("DecoderAudioRenderer", "Audio codec error", e7);
            this.a.a(e7);
            throw V(e7, this.f, 4003);
        }
    }

    public plv(Handler handler, pli pliVar, plo ploVar) {
        super(1);
        this.a = new plh(handler, pliVar);
        this.b = ploVar;
        ploVar.o(new plu(this));
        this.d = pmv.d();
        this.q = 0;
        this.s = true;
    }

    public plv(Handler handler, pli pliVar, pky... pkyVarArr) {
        this(handler, pliVar, new pmf(null, pkyVarArr));
    }

    @Override // defpackage.phj, defpackage.pkb
    public void ad(int i, Object obj) {
        if (i == 2) {
            this.b.r(((Float) obj).floatValue());
        } else if (i == 3) {
            this.b.l((aso) obj);
        } else if (i == 6) {
            this.b.n((asp) obj);
        } else if (i == 9) {
            this.b.q(((Boolean) obj).booleanValue());
        } else if (i != 10) {
        } else {
            this.b.m(((Integer) obj).intValue());
        }
    }
}
