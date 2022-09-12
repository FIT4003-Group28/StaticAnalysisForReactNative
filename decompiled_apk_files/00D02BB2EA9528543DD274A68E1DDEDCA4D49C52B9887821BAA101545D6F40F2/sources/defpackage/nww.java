package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: nww  reason: default package */
/* loaded from: classes7.dex */
public final class nww implements nxe {
    private final gga a;

    public nww(gga ggaVar) {
        this.a = ggaVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        return (dthbVar.a & 256) != 0;
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        this.a.D(gfk.g("https://support.google.com/offers/?p=OffersApp_GetOffers_Android", false));
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.VIEW_OFFERS);
    }
}
