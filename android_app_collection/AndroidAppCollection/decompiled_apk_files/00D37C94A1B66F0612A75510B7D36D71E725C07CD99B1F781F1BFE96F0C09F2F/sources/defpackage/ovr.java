package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: ovr  reason: default package */
/* loaded from: classes4.dex */
public final class ovr extends ovq {
    private final MediaFormat m;
    private volatile int n;
    private volatile boolean o;

    public ovr(pbl pblVar, pbn pbnVar, ovm ovmVar, long j, long j2, int i, MediaFormat mediaFormat, int i2) {
        super(pblVar, pbnVar, 1, ovmVar, j, j2, i, true, i2);
        this.m = mediaFormat;
    }

    @Override // defpackage.ovb
    public final long a() {
        return this.n;
    }

    @Override // defpackage.ovq
    public final MediaFormat e() {
        return this.m;
    }

    @Override // defpackage.ovq
    public final owx h() {
        return null;
    }

    @Override // defpackage.pbx
    public final void i() {
        this.o = true;
    }

    @Override // defpackage.pbx
    public final void k() {
        try {
            this.f.b(pcx.j(this.d, this.n));
            int i = 0;
            while (i != -1) {
                this.n += i;
                oxo oxoVar = this.k;
                pbl pblVar = this.f;
                oyc oycVar = oxoVar.a;
                int a = pblVar.a(oycVar.j.a, oycVar.h, oycVar.a(Integer.MAX_VALUE));
                if (a == -1) {
                    i = -1;
                } else {
                    oycVar.h += a;
                    oycVar.g += a;
                    i = a;
                }
            }
            this.k.g(this.g, 1, this.n, 0, null);
        } finally {
            pcx.n(this.f);
        }
    }

    @Override // defpackage.pbx
    public final boolean l() {
        return this.o;
    }
}
