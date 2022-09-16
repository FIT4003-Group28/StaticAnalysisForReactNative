package defpackage;

import com.google.android.libraries.social.populous.core.AffinityContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cysy  reason: default package */
/* loaded from: classes5.dex */
public final class cysy implements degu<czfo> {
    final /* synthetic */ cyta a;
    final /* synthetic */ cytq b;
    final /* synthetic */ cytb c;

    public cysy(cytb cytbVar, cyta cytaVar, cytq cytqVar) {
        this.c = cytbVar;
        this.a = cytaVar;
        this.b = cytqVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cypg.c(this.c.j, 3, cyos.a(th), this.b.k);
        cyta cytaVar = this.a;
        czfn i = czfo.i();
        i.g(cyet.a(th));
        i.b(AffinityContext.b);
        i.e(dcdc.e());
        cytaVar.a(i.a());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(czfo czfoVar) {
        this.a.a(czfoVar);
    }
}
