package defpackage;

import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: afce  reason: default package */
/* loaded from: classes.dex */
final class afce extends prp {
    private volatile boolean o;
    private long p;
    private boolean q;
    private final prt r;

    public afce(asv asvVar, asy asyVar, Format format, int i, Object obj, prt prtVar) {
        super(asvVar, asyVar, format, i, obj, 0L, 0L, -9223372036854775807L, -9223372036854775807L, -1L);
        this.r = prtVar;
    }

    @Override // defpackage.axv
    public final void a() {
        this.o = true;
    }

    @Override // defpackage.axv
    public final void b() {
        asy b = this.f.b(this.p);
        try {
            ayf ayfVar = this.m;
            aza azaVar = new aza(ayfVar, b.f, ayfVar.h(b));
            if (this.p == 0) {
                this.r.e(d(), -9223372036854775807L, -9223372036854775807L);
            }
            while (!this.o && this.r.g(azaVar)) {
            }
            this.p = azaVar.c - this.f.f;
            pxi.I(this.m);
            this.q = !this.o;
        } catch (Throwable th) {
            pxi.I(this.m);
            throw th;
        }
    }

    @Override // defpackage.psb
    public final boolean h() {
        return this.q;
    }
}
