package defpackage;
/* compiled from: PG */
/* renamed from: zsj  reason: default package */
/* loaded from: classes7.dex */
final class zsj implements vou {
    final /* synthetic */ cjzt a;
    final /* synthetic */ dthb b;

    public zsj(cjzt cjztVar, dthb dthbVar) {
        this.a = cjztVar;
        this.b = dthbVar;
    }

    @Override // defpackage.vou
    public final void b(dnqh dnqhVar) {
        bvoo.h("Could not refresh.", new Object[0]);
    }

    @Override // defpackage.vou
    public final void c(int i, boolean z) {
        if (z) {
            bvoo.h("Could not start navigation.", new Object[0]);
        }
        cjzt cjztVar = this.a;
        cjztVar.c.j(this.b, nxc.a(cjztVar.a, cjztVar.b, cjqm.a));
    }
}
