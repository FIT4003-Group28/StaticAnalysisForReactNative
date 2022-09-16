package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azjo  reason: default package */
/* loaded from: classes2.dex */
public final class azjo extends azow {
    final azjp a;
    boolean b;

    public azjo(azjp azjpVar) {
        this.a = azjpVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (this.b) {
            azqc.d(th);
            return;
        }
        this.b = true;
        azjp azjpVar = this.a;
        ayqi.c(azjpVar.e);
        if (azom.e(azjpVar.h, th)) {
            azjpVar.j = true;
            azjpVar.f();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.b) {
            return;
        }
        this.a.g();
    }

    @Override // defpackage.ayom
    public final void sm() {
        if (this.b) {
            return;
        }
        this.b = true;
        azjp azjpVar = this.a;
        ayqi.c(azjpVar.e);
        azjpVar.j = true;
        azjpVar.f();
    }
}
