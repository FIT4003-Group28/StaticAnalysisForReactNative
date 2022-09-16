package defpackage;
/* compiled from: PG */
/* renamed from: acxw  reason: default package */
/* loaded from: classes2.dex */
final class acxw implements glf {
    final /* synthetic */ jjf a;
    final /* synthetic */ acyf b;
    private boolean c = false;

    public acxw(acyf acyfVar, jjf jjfVar) {
        this.b = acyfVar;
        this.a = jjfVar;
    }

    @Override // defpackage.glf
    public final void a() {
        acyf acyfVar = this.b;
        if (acyfVar.ba) {
            acyfVar.b.a().h(!this.a.f());
            ff J = this.b.J();
            if (J == null || !acyf.w(J)) {
                return;
            }
            if (!this.a.f() && this.c) {
                this.b.d();
            }
            this.c = this.a.f();
            aegc h = this.b.h();
            if (h != null) {
                if (this.a.f() && !aefy.a(h)) {
                    this.b.aT(0, false);
                }
                if (!this.a.f() && aefy.a(h)) {
                    h.h(this.b.aS());
                }
            }
            this.b.aN(btpf.c(J));
        }
    }
}
