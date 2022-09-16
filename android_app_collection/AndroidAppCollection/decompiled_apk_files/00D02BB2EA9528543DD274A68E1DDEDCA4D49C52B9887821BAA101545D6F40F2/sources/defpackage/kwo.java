package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kwo  reason: default package */
/* loaded from: classes7.dex */
public final class kwo implements dbty<aras> {
    final /* synthetic */ kwy a;

    public kwo(kwy kwyVar) {
        this.a = kwyVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ aras a() {
        btwd navigationParameters = this.a.o.getNavigationParameters();
        duwy locationParameters = this.a.o.getLocationParameters();
        dkog locationSharingParameters = this.a.o.getLocationSharingParameters();
        dkiy enableFeatureParameters = this.a.o.getEnableFeatureParameters();
        kwy kwyVar = this.a;
        kwy kwyVar2 = this.a;
        arbi arbiVar = new arbi(navigationParameters, locationParameters, locationSharingParameters, enableFeatureParameters, kwyVar.i, kwyVar.e, kwyVar.f, kwyVar.p, kwyVar.d.a(), kwyVar2.q, kwyVar2.t, kwyVar2.h, kwyVar2.y, null, null, null, null, kwyVar2.C);
        kwy kwyVar3 = this.a;
        return new aras(kwyVar3.i, kwyVar3.f, kwyVar3.g, arbiVar, ((kwf) kwyVar3.u).C.a());
    }
}
