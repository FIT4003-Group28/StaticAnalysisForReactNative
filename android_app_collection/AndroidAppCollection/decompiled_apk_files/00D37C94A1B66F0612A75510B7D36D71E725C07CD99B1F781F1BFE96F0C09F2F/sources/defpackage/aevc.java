package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: aevc  reason: default package */
/* loaded from: classes.dex */
public final class aevc extends ovq implements ovc {
    pbn m;
    public long n;
    public volatile int o;
    public volatile long p;
    public volatile long q;
    public final int r;
    private final ovd s;
    private MediaFormat t;
    private owx u;
    private volatile boolean v;

    public aevc(pbl pblVar, pbn pbnVar, int i, ovm ovmVar, long j, long j2, int i2, ovd ovdVar, MediaFormat mediaFormat, int i3) {
        super(pblVar, pbnVar, i, ovmVar, j, j2, i2, false, 0);
        this.s = ovdVar;
        this.t = mediaFormat;
        this.u = null;
        this.r = i3;
        this.p = -1L;
        this.q = -1L;
        this.n = -1L;
    }

    @Override // defpackage.ovb
    public final long a() {
        return this.o;
    }

    @Override // defpackage.ovc
    public final void b(owx owxVar) {
        this.u = owxVar;
    }

    @Override // defpackage.ovc
    public final void c(oye oyeVar) {
    }

    @Override // defpackage.oyf
    public final void d(MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            mediaFormat = null;
        }
        this.t = mediaFormat;
    }

    @Override // defpackage.ovq
    public final MediaFormat e() {
        return this.t;
    }

    @Override // defpackage.oyf
    public final void f(pct pctVar, int i) {
        this.k.f(pctVar, i);
    }

    @Override // defpackage.oyf
    public final void g(long j, int i, int i2, int i3, byte[] bArr) {
        this.k.g(j, i, i2, i3, bArr);
    }

    @Override // defpackage.ovq
    public final owx h() {
        return this.u;
    }

    @Override // defpackage.pbx
    public final void i() {
        this.v = true;
    }

    @Override // defpackage.oyf
    public final int j(oxn oxnVar, int i, boolean z) {
        return this.k.j(oxnVar, i, z);
    }

    @Override // defpackage.pbx
    public final boolean l() {
        return this.v;
    }

    public final long n() {
        return this.q >= 0 ? this.q : this.h;
    }

    public final long o() {
        return this.p >= 0 ? this.p : this.g;
    }

    public final pbn p() {
        pbn pbnVar = this.m;
        return pbnVar != null ? pbnVar : this.d;
    }

    @Override // defpackage.pbx
    public final void k() {
        pbn j;
        int i = this.r;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 2) {
                pbn p = p();
                if (this.n != -1) {
                    zgp b = zgp.b(p.a);
                    b.g("min_lmt", String.valueOf(this.n));
                    p = new pbn(b.a(), p.c, p.d, p.e, p.f, p.g, null);
                }
                j = pcx.j(p, this.o);
            } else if (i2 == 3) {
                this.o = 0;
                j = p();
            } else {
                j = pcx.j(p(), this.o);
            }
            try {
                pbl pblVar = this.f;
                oxn oxnVar = new oxn(pblVar, j.c, pblVar.b(j));
                if (this.o == 0) {
                    this.s.e(this);
                }
                while (!this.v && this.s.i(oxnVar) == 0) {
                }
                this.o = (int) (oxnVar.c - this.d.c);
                int i3 = this.r;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                if ((i4 == 2 || i4 == 3) && this.o <= 0) {
                    throw new aevb();
                }
                return;
            } finally {
                this.f.c();
            }
        }
        throw null;
    }
}
