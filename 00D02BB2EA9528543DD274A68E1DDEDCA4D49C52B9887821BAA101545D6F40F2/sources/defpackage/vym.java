package defpackage;
/* compiled from: PG */
/* renamed from: vym  reason: default package */
/* loaded from: classes7.dex */
final class vym implements brlm {
    final /* synthetic */ vyn a;
    private final vyo b;

    public vym(vyn vynVar, vyo vyoVar) {
        this.a = vynVar;
        this.b = vyoVar;
    }

    @Override // defpackage.brlm
    public final void a(brln brlnVar) {
        vyn vynVar = this.a;
        if (brlnVar != vynVar.a) {
            return;
        }
        vynVar.a = null;
        this.b.b(brlnVar);
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
        vyn vynVar = this.a;
        if (brlnVar != vynVar.a) {
            return;
        }
        vynVar.a = null;
        this.b.d(bttqVar);
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
        vyn vynVar = this.a;
        if (brlnVar != vynVar.a) {
            return;
        }
        vynVar.a = null;
        this.b.c();
    }
}
