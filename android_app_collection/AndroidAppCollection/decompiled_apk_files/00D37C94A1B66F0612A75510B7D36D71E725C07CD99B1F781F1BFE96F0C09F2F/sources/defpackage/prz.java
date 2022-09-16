package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: prz  reason: default package */
/* loaded from: classes4.dex */
public class prz extends prp {
    private final int o;
    private final long p;
    private long q;
    private volatile boolean r;
    private boolean s;
    private final prt t;

    public prz(asv asvVar, asy asyVar, Format format, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, prt prtVar) {
        super(asvVar, asyVar, format, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.t = prtVar;
    }

    @Override // defpackage.axv
    public final void a() {
        this.r = true;
    }

    @Override // defpackage.axv
    public final void b() {
        if (this.q == 0) {
            prr d = d();
            d.b(this.p);
            prt prtVar = this.t;
            prv g = g(d);
            long j = this.a;
            long j2 = j == -9223372036854775807L ? -9223372036854775807L : j - this.p;
            long j3 = this.b;
            prtVar.e(g, j2, j3 == -9223372036854775807L ? -9223372036854775807L : j3 - this.p);
        }
        try {
            asy b = this.f.b(this.q);
            ayf ayfVar = this.m;
            aza azaVar = new aza(ayfVar, b.g, ayfVar.h(b));
            while (!this.r && this.t.g(azaVar)) {
            }
            this.q = azaVar.c - this.f.g;
            pxi.I(this.m);
            this.s = !this.r;
        } catch (Throwable th) {
            pxi.I(this.m);
            throw th;
        }
    }

    @Override // defpackage.psb
    public final long f() {
        return this.n + this.o;
    }

    protected prv g(prr prrVar) {
        return prrVar;
    }

    @Override // defpackage.psb
    public final boolean h() {
        return this.s;
    }
}
