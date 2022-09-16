package defpackage;
/* compiled from: PG */
/* renamed from: ayrx  reason: default package */
/* loaded from: classes2.dex */
public final class ayrx implements ayom, aypg {
    final ayom a;
    final ayqb b;
    final aypv c;
    aypg d;

    public ayrx(ayom ayomVar, ayqb ayqbVar, aypv aypvVar) {
        this.a = ayomVar;
        this.b = ayqbVar;
        this.c = aypvVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.d != ayqi.a) {
            this.d = ayqi.a;
            this.a.b(th);
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        aypg aypgVar = this.d;
        if (aypgVar != ayqi.a) {
            this.d = ayqi.a;
            try {
                this.c.a();
            } catch (Throwable th) {
                bapv.j(th);
                azqc.d(th);
            }
            aypgVar.qr();
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        try {
            this.b.a(aypgVar);
            if (!ayqi.h(this.d, aypgVar)) {
                return;
            }
            this.d = aypgVar;
            this.a.sj(this);
        } catch (Throwable th) {
            bapv.j(th);
            aypgVar.qr();
            this.d = ayqi.a;
            ayqj.h(th, this.a);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.d != ayqi.a) {
            this.d = ayqi.a;
            this.a.sm();
        }
    }
}
