package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: ovp  reason: default package */
/* loaded from: classes4.dex */
public final class ovp extends ovb implements ovc {
    public MediaFormat g;
    public owx h;
    public oye i;
    private final ovd j;
    private volatile int k;
    private volatile boolean l;

    public ovp(pbl pblVar, pbn pbnVar, int i, ovm ovmVar, ovd ovdVar, int i2) {
        super(pblVar, pbnVar, 2, i, ovmVar, i2);
        this.j = ovdVar;
    }

    @Override // defpackage.ovb
    public final long a() {
        return this.k;
    }

    @Override // defpackage.ovc
    public final void b(owx owxVar) {
        this.h = owxVar;
    }

    @Override // defpackage.ovc
    public final void c(oye oyeVar) {
        this.i = oyeVar;
    }

    @Override // defpackage.oyf
    public final void d(MediaFormat mediaFormat) {
        this.g = mediaFormat;
    }

    @Override // defpackage.oyf
    public final void f(pct pctVar, int i) {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    @Override // defpackage.oyf
    public final void g(long j, int i, int i2, int i3, byte[] bArr) {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    @Override // defpackage.pbx
    public final void i() {
        this.l = true;
    }

    @Override // defpackage.oyf
    public final int j(oxn oxnVar, int i, boolean z) {
        throw new IllegalStateException("Unexpected sample data in initialization chunk");
    }

    @Override // defpackage.pbx
    public final void k() {
        pbn j = pcx.j(this.d, this.k);
        try {
            pbl pblVar = this.f;
            oxn oxnVar = new oxn(pblVar, j.c, pblVar.b(j));
            if (this.k == 0) {
                this.j.e(this);
            }
            while (!this.l && this.j.i(oxnVar) == 0) {
            }
            this.k = (int) (oxnVar.c - this.d.c);
        } finally {
            pcx.n(this.f);
        }
    }

    @Override // defpackage.pbx
    public final boolean l() {
        return this.l;
    }
}
