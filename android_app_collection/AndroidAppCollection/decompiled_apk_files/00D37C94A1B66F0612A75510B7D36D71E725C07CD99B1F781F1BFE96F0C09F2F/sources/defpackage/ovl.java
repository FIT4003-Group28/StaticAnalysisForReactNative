package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: ovl  reason: default package */
/* loaded from: classes4.dex */
public class ovl extends ovq implements ovc {
    private final ovd m;
    private final long n;
    private final int o;
    private final int p;
    private MediaFormat q;
    private owx r;
    private volatile int s;
    private volatile boolean t;

    public ovl(pbl pblVar, pbn pbnVar, int i, ovm ovmVar, long j, long j2, int i2, long j3, ovd ovdVar, MediaFormat mediaFormat, int i3, int i4, owx owxVar, boolean z, int i5) {
        super(pblVar, pbnVar, i, ovmVar, j, j2, i2, z, i5);
        this.m = ovdVar;
        this.n = j3;
        this.o = i3;
        this.p = i4;
        this.q = n(mediaFormat, j3, i3, i4);
        this.r = owxVar;
    }

    private static MediaFormat n(MediaFormat mediaFormat, long j, int i, int i2) {
        int i3;
        MediaFormat mediaFormat2 = mediaFormat;
        if (mediaFormat2 == null) {
            return null;
        }
        if (j != 0) {
            long j2 = mediaFormat2.w;
            if (j2 != Long.MAX_VALUE) {
                mediaFormat2 = new MediaFormat(mediaFormat2.a, mediaFormat2.b, mediaFormat2.c, mediaFormat2.d, mediaFormat2.e, mediaFormat2.h, mediaFormat2.i, mediaFormat2.l, mediaFormat2.m, mediaFormat2.q, mediaFormat2.r, mediaFormat2.v, j2 + j, mediaFormat2.f, mediaFormat2.g, mediaFormat2.j, mediaFormat2.k, mediaFormat2.s, mediaFormat2.t, mediaFormat2.u, mediaFormat2.o, mediaFormat2.n, mediaFormat2.p);
            }
        }
        if (i != -1) {
            i3 = i;
        } else if (i2 == -1) {
            return mediaFormat2;
        } else {
            i3 = -1;
        }
        return new MediaFormat(mediaFormat2.a, mediaFormat2.b, mediaFormat2.c, mediaFormat2.d, mediaFormat2.e, mediaFormat2.h, mediaFormat2.i, mediaFormat2.l, mediaFormat2.m, mediaFormat2.q, mediaFormat2.r, mediaFormat2.v, mediaFormat2.w, mediaFormat2.f, mediaFormat2.g, i3, i2, mediaFormat2.s, mediaFormat2.t, mediaFormat2.u, mediaFormat2.o, mediaFormat2.n, mediaFormat2.p);
    }

    @Override // defpackage.ovb
    public final long a() {
        return this.s;
    }

    @Override // defpackage.ovc
    public final void b(owx owxVar) {
        this.r = owxVar;
    }

    @Override // defpackage.ovc
    public final void c(oye oyeVar) {
    }

    @Override // defpackage.oyf
    public final void d(MediaFormat mediaFormat) {
        this.q = n(mediaFormat, this.n, this.o, this.p);
    }

    @Override // defpackage.ovq
    public final MediaFormat e() {
        return this.q;
    }

    @Override // defpackage.oyf
    public final void f(pct pctVar, int i) {
        this.k.f(pctVar, i);
    }

    @Override // defpackage.oyf
    public final void g(long j, int i, int i2, int i3, byte[] bArr) {
        this.k.g(this.n + j, i, i2, i3, bArr);
    }

    @Override // defpackage.ovq
    public final owx h() {
        return this.r;
    }

    @Override // defpackage.pbx
    public final void i() {
        this.t = true;
    }

    @Override // defpackage.oyf
    public final int j(oxn oxnVar, int i, boolean z) {
        return this.k.j(oxnVar, i, z);
    }

    @Override // defpackage.pbx
    public final void k() {
        pbn j = pcx.j(this.d, this.s);
        try {
            pbl pblVar = this.f;
            oxn oxnVar = new oxn(pblVar, j.c, pblVar.b(j));
            if (this.s == 0) {
                this.m.e(this);
            }
            while (!this.t && this.m.i(oxnVar) == 0) {
            }
            this.s = (int) (oxnVar.c - this.d.c);
        } finally {
            pcx.n(this.f);
        }
    }

    @Override // defpackage.pbx
    public final boolean l() {
        return this.t;
    }
}
