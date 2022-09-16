package defpackage;
/* compiled from: PG */
/* renamed from: ayzu  reason: default package */
/* loaded from: classes2.dex */
final class ayzu implements ayoa, bamf {
    final bame a;
    final ayqf b;
    bamf c;
    boolean d;

    public ayzu(bame bameVar, ayqf ayqfVar) {
        this.a = bameVar;
        this.b = ayqfVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (!this.d) {
            this.d = true;
            this.a.b(th);
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (!this.d) {
            this.a.c(obj);
            try {
                if (!this.b.a(obj)) {
                    return;
                }
                this.d = true;
                this.c.si();
                this.a.sm();
            } catch (Throwable th) {
                bapv.j(th);
                this.c.si();
                b(th);
            }
        }
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.c, bamfVar)) {
            this.c = bamfVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.c.si();
    }

    @Override // defpackage.bame
    public final void sm() {
        if (!this.d) {
            this.d = true;
            this.a.sm();
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        this.c.sp(j);
    }
}
