package defpackage;
/* compiled from: PG */
/* renamed from: sst  reason: default package */
/* loaded from: classes7.dex */
final class sst implements degu<tgh> {
    final /* synthetic */ ssu a;

    public sst(ssu ssuVar) {
        this.a = ssuVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvoo.h("Failed to load FetchInitializationParams from StartDirectionsResult, using default parameters to start fetching.", new Object[0]);
        ssu ssuVar = this.a;
        if (ssuVar.aD) {
            ssuVar.ad.d(tgh.e(true));
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(tgh tghVar) {
        tgh tghVar2 = tghVar;
        if (this.a.ap) {
            tghVar2 = tgh.e(true);
        }
        ssu ssuVar = this.a;
        if (ssuVar.aD) {
            ssuVar.ad.d(tghVar2);
        }
    }
}
