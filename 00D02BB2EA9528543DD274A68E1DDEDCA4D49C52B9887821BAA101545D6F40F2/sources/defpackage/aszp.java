package defpackage;
/* compiled from: PG */
/* renamed from: aszp  reason: default package */
/* loaded from: classes2.dex */
final class aszp implements asxv {
    final /* synthetic */ aszs a;

    public aszp(aszs aszsVar) {
        this.a = aszsVar;
    }

    @Override // defpackage.asxv
    public final void a(aszm aszmVar, @dzsi aszm aszmVar2) {
        bvrj.UI_THREAD.c();
        if (!aszmVar.b()) {
            return;
        }
        aszs aszsVar = this.a;
        aszsVar.k = aszmVar;
        crqw crqwVar = aszsVar.k.b;
        atxz atxzVar = aszsVar.f;
        if ((atxzVar == null ? null : atxzVar.n()) != crqwVar) {
            if (crqwVar != null) {
                aszsVar.f = aszsVar.b.a(crqwVar);
            } else {
                aszsVar.f = null;
            }
            aszsVar.a.r();
        }
        this.a.z();
    }
}
