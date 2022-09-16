package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: pse  reason: default package */
/* loaded from: classes4.dex */
public final class pse extends prp {
    private final int o;
    private final Format p;
    private long q;
    private boolean r;

    public pse(asv asvVar, asy asyVar, Format format, int i, Object obj, long j, long j2, long j3, int i2, Format format2) {
        super(asvVar, asyVar, format, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = format2;
    }

    @Override // defpackage.axv
    public final void a() {
    }

    @Override // defpackage.axv
    public final void b() {
        prr d = d();
        d.b(0L);
        bab a = d.a(0, this.o);
        a.rx(this.p);
        try {
            long h = this.m.h(this.f.b(this.q));
            if (h != -1) {
                h += this.q;
            }
            aza azaVar = new aza(this.m, this.q, h);
            for (int i = 0; i != -1; i = a.a(azaVar, Integer.MAX_VALUE, true)) {
                this.q += i;
            }
            a.e(this.k, 1, (int) this.q, 0, null);
            pxi.I(this.m);
            this.r = true;
        } catch (Throwable th) {
            pxi.I(this.m);
            throw th;
        }
    }

    @Override // defpackage.psb
    public final boolean h() {
        return this.r;
    }
}
