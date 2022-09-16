package defpackage;
/* compiled from: PG */
/* renamed from: ayvm  reason: default package */
/* loaded from: classes2.dex */
final class ayvm implements ayoa, bamf {
    final bame a;
    final ayqb b;
    final aypv c;
    bamf d;

    public ayvm(bame bameVar, ayqb ayqbVar, aypv aypvVar) {
        this.a = bameVar;
        this.b = ayqbVar;
        this.c = aypvVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.d != azof.a) {
            this.a.b(th);
        } else {
            azqc.d(th);
        }
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        try {
            this.b.a(bamfVar);
            if (!azof.i(this.d, bamfVar)) {
                return;
            }
            this.d = bamfVar;
            this.a.f(this);
        } catch (Throwable th) {
            bapv.j(th);
            bamfVar.si();
            this.d = azof.a;
            azoc.f(th, this.a);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        bamf bamfVar = this.d;
        if (bamfVar != azof.a) {
            this.d = azof.a;
            try {
                this.c.a();
            } catch (Throwable th) {
                bapv.j(th);
                azqc.d(th);
            }
            bamfVar.si();
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.d != azof.a) {
            this.a.sm();
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        this.d.sp(j);
    }
}
