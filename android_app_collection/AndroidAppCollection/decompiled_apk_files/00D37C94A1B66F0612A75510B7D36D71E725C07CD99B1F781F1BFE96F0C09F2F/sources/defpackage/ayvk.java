package defpackage;
/* compiled from: PG */
/* renamed from: ayvk  reason: default package */
/* loaded from: classes2.dex */
final class ayvk extends aznu {
    final ayqb a;
    final ayqb b;
    final aypv c;

    public ayvk(bame bameVar, ayqb ayqbVar, ayqb ayqbVar2, aypv aypvVar) {
        super(bameVar);
        this.a = ayqbVar;
        this.b = ayqbVar2;
        this.c = aypvVar;
    }

    @Override // defpackage.aznu, defpackage.bame
    public final void b(Throwable th) {
        if (this.g) {
            azqc.d(th);
            return;
        }
        this.g = true;
        try {
            this.b.a(th);
            this.d.b(th);
        } catch (Throwable th2) {
            bapv.j(th2);
            this.d.b(new aypo(th, th2));
        }
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.g) {
            return;
        }
        if (this.h != 0) {
            this.d.c(null);
            return;
        }
        try {
            this.a.a(obj);
            this.d.c(obj);
        } catch (Throwable th) {
            h(th);
        }
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return g(i);
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        try {
            Object sl = this.f.sl();
            if (sl != null) {
                try {
                    this.a.a(sl);
                } catch (Throwable th) {
                    bapv.j(th);
                    this.b.a(th);
                    throw azom.a(th);
                }
            } else if (this.h == 1) {
                this.c.a();
                return null;
            }
            return sl;
        } catch (Throwable th2) {
            bapv.j(th2);
            try {
                this.b.a(th2);
                throw azom.a(th2);
            } catch (Throwable th3) {
                throw new aypo(th2, th3);
            }
        }
    }

    @Override // defpackage.aznu, defpackage.bame
    public final void sm() {
        if (this.g) {
            return;
        }
        try {
            this.c.a();
            this.g = true;
            this.d.sm();
        } catch (Throwable th) {
            h(th);
        }
    }
}
