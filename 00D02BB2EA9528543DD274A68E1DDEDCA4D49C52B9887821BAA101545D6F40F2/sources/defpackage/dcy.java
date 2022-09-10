package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: dcy  reason: default package */
/* loaded from: classes5.dex */
public final class dcy implements degu<dbsg<diz>> {
    final /* synthetic */ dds a;

    public dcy(dds ddsVar) {
        this.a = ddsVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.d(false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dbsg<diz> dbsgVar) {
        dbsg<diz> dbsgVar2 = dbsgVar;
        dds ddsVar = this.a;
        if (!dbsgVar2.a()) {
            ddsVar.d(false);
            return;
        }
        GmmLocation a = ddsVar.b.a();
        if (a == null) {
            ddsVar.d(false);
            return;
        }
        diz b = dbsgVar2.b();
        dbsk.s(b);
        dbsg<czm> b2 = b.b(a);
        if (!b2.a()) {
            ddsVar.d(false);
        } else {
            deha.q(b2.b().a(ddsVar.e.g), new dcz(ddsVar), ddsVar.c);
        }
    }
}
