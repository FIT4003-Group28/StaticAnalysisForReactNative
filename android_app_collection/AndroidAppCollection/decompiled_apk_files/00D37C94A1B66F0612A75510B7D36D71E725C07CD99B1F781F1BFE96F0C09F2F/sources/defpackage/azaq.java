package defpackage;
/* compiled from: PG */
/* renamed from: azaq  reason: default package */
/* loaded from: classes2.dex */
final class azaq implements ayod, aypg {
    final ayod a;
    final ayqb b;
    aypg c;

    public azaq(ayod ayodVar, ayqb ayqbVar) {
        this.a = ayodVar;
        this.b = ayqbVar;
    }

    @Override // defpackage.ayod
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.c.qr();
    }

    @Override // defpackage.ayod
    public final void sh(Object obj) {
        this.a.sh(obj);
        try {
            this.b.a(obj);
        } catch (Throwable th) {
            bapv.j(th);
            azqc.d(th);
        }
    }

    @Override // defpackage.ayod
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.c, aypgVar)) {
            this.c = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayod
    public final void sm() {
        this.a.sm();
    }
}
