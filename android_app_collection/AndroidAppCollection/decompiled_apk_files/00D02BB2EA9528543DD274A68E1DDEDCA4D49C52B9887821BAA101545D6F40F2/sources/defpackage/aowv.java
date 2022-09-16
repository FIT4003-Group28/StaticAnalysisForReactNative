package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aowv  reason: default package */
/* loaded from: classes2.dex */
public final class aowv implements akvo<aktd> {
    final /* synthetic */ aoxt a;
    final /* synthetic */ aowx b;
    final /* synthetic */ aowy c;

    public aowv(aowy aowyVar, aoxt aoxtVar, aowx aowxVar) {
        this.c = aowyVar;
        this.a = aoxtVar;
        this.b = aowxVar;
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void b(aktd aktdVar) {
    }

    @Override // defpackage.akvo
    public final /* bridge */ /* synthetic */ void x(aktd aktdVar) {
        if (this.c.h.containsKey(this.a.a().ai())) {
            this.b.a(this.a);
            return;
        }
        aowy aowyVar = this.c;
        aoxt aoxtVar = this.a;
        aoxt aoxtVar2 = aowyVar.m;
        if (aoxtVar2 != null) {
            if (aowyVar.g.containsKey(aoxtVar2.a().ai())) {
                aowyVar.h(aowyVar.m.a().ai());
                aowyVar.m(aowyVar.m, aowyVar.l(aowyVar.m, aowyVar.r, aowyVar.j), false, false, aowyVar.n, aowyVar.k);
            }
        }
        akqi ai = aoxtVar.a().ai();
        if (aowyVar.g.containsKey(ai)) {
            aowyVar.n = aowyVar.g.get(ai).k().h;
            aowyVar.h(aoxtVar.a().ai());
            aowyVar.m(aoxtVar, aowyVar.l(aoxtVar, aowyVar.r, aowyVar.j), true, true, 32767, aowyVar.k);
        }
        this.c.m = this.a;
    }
}
