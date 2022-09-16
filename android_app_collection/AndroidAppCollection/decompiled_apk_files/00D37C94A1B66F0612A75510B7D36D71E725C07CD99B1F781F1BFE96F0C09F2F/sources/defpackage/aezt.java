package defpackage;

import com.google.android.exoplayer2.Format;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aezt  reason: default package */
/* loaded from: classes.dex */
public final class aezt extends prp {
    public final aezc o;
    private long p;
    private volatile boolean q;
    private volatile boolean r;
    private final prt s;

    public aezt(asv asvVar, asy asyVar, Format format, int i, Object obj, long j, prt prtVar, aezc aezcVar) {
        super(asvVar, asyVar, format, i, obj, j, j, -9223372036854775807L, -9223372036854775807L, 0L);
        this.s = prtVar;
        this.o = aezcVar;
    }

    @Override // defpackage.axv
    public final void a() {
        this.q = true;
    }

    @Override // defpackage.axv
    public final void b() {
        afki afkiVar = afki.ABR;
        String.valueOf(this.h.a);
        asy b = this.f.b(this.p);
        try {
            ayf ayfVar = this.m;
            aza azaVar = new aza(ayfVar, b.g, ayfVar.h(b));
            if (this.p == 0) {
                this.s.e(new prv() { // from class: aezs
                    @Override // defpackage.prv
                    public final bab a(int i, int i2) {
                        aezt aeztVar = aezt.this;
                        aeztVar.o.g(aeztVar.d().a(i, i2));
                        return aeztVar.o;
                    }
                }, -9223372036854775807L, -9223372036854775807L);
            }
            while (!this.q && this.s.g(azaVar)) {
            }
            this.p = azaVar.c - this.f.g;
            this.m.j();
            this.r = !this.q;
        } catch (Throwable th) {
            this.m.j();
            throw th;
        }
    }

    @Override // defpackage.psb
    public final long f() {
        return -1L;
    }

    @Override // defpackage.psb
    public final boolean h() {
        return this.r;
    }
}
