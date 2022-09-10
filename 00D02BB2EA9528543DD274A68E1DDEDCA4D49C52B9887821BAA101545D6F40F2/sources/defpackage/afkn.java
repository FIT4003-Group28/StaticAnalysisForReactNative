package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: afkn  reason: default package */
/* loaded from: classes2.dex */
public final class afkn extends itb implements afkv {
    public final List<duqi> a = dcdc.p(duqi.SEARCH, duqi.DIRECTIONS_DEFAULT, duqi.DIRECTIONS_NAVIGATION, duqi.DIRECTIONS_NAVIGATION_NAVGO, duqi.DIRECTIONS_TRIP_DETAILS, duqi.DIRECTIONS_TRANSIT_NAVIGATION, duqi.DIRECTIONS_COMMUTE_IMMERSIVE, duqi.DIRECTIONS_TWO_WHEELER, duqi.STREET_VIEW, duqi.OPEN_PLACE_LIST, duqi.PLACE_DETAILS_BASIC, duqi.PLACE_DETAILS_FULL, duqi.START_PAGE_ROVER);
    public final gga b;
    public final eeu c;
    public final cjqy d;
    public final bvrb e;
    public final bvkx f;
    public final asik g;
    public final dzsj<afkb> h;
    @dzsi
    public afkf i;
    @dzsi
    public afkf j;
    private final dxio<afkg> k;
    private final afhb o;
    private final bunm p;

    public afkn(gga ggaVar, eeu eeuVar, cjqy cjqyVar, bunm bunmVar, bvrb bvrbVar, bvkx bvkxVar, asik asikVar, dxio dxioVar, dzsj dzsjVar, afhb afhbVar) {
        this.b = ggaVar;
        this.c = eeuVar;
        this.d = cjqyVar;
        this.p = bunmVar;
        this.e = bvrbVar;
        this.f = bvkxVar;
        this.g = asikVar;
        this.k = dxioVar;
        this.h = dzsjVar;
        this.o = afhbVar;
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        afkg a = this.k.a();
        afkf afkfVar = new afkf(a.d);
        afog afogVar = new afog(a.i.a());
        afkfVar.a(duqi.URL_REDIRECTION_BROWSER, afogVar);
        afkfVar.a(duqi.URL_REDIRECTION_WEBVIEW, afogVar);
        afkfVar.a(duqi.SEARCH, new afnz(a.j.a()));
        afnj afnjVar = new afnj(a.c, a.e, a.k.a(), a.h);
        afkfVar.a(duqi.DIRECTIONS_DEFAULT, afnjVar);
        afkfVar.a(duqi.DIRECTIONS_NAVIGATION, afnjVar);
        afkfVar.a(duqi.DIRECTIONS_TRIP_DETAILS, afnjVar);
        afkfVar.a(duqi.DIRECTIONS_TRANSIT_NAVIGATION, afnjVar);
        afkfVar.a(duqi.DIRECTIONS_COMMUTE_IMMERSIVE, afnjVar);
        afkfVar.a(duqi.DIRECTIONS_TWO_WHEELER, afnjVar);
        afnv afnvVar = new afnv(a.l.a());
        afkfVar.a(duqi.PLACE_DETAILS_BASIC, afnvVar);
        afkfVar.a(duqi.PLACE_DETAILS_FULL, afnvVar);
        afkfVar.a(duqi.MAP, new afnq(a.m.a()));
        afkfVar.a(duqi.STREET_VIEW, new afoc(a.n.a()));
        afkfVar.a(duqi.HANDLE_MFE_URL, new afnm(a.o.a()));
        afkfVar.a(duqi.MAPS_ENGINE_MAP, new afns(a.p.a()));
        afkfVar.a(duqi.REPORT_A_PROBLEM, new afnw(a.q.a()));
        afkfVar.a(duqi.ADD_A_PLACE, new afng(a.u.a()));
        afkfVar.a(duqi.LOCATION_SHARING, new afnp(a.r.a()));
        afkfVar.a(duqi.LOCATION_SHARING_REQUEST_LOCATION, new afnx(a.s.a()));
        afkfVar.a(duqi.TRANSIT_RADAR, new afod(a.v.a()));
        afkfVar.a(duqi.LABELED_PLACES, new afno(a.x.a()));
        afkfVar.a(duqi.OPEN_UGC_TASKS_PAGE, new afoe(a.y.a()));
        afkfVar.a(duqi.OPEN_PLACE_LIST, new afnt(a.w.a()));
        afkfVar.a(duqi.DISPLAY_EXPERIENCE, new afoa(a.z.a()));
        afkfVar.a(duqi.DISPLAY_MAJOR_EVENT, new afoa(a.z.a()));
        afnl afnlVar = new afnl(false, a.t.a());
        afkfVar.b(duqi.PLACE_DETAILS_BASIC, duqi.DIRECTIONS_DEFAULT, afnlVar);
        afkfVar.b(duqi.PLACE_DETAILS_FULL, duqi.DIRECTIONS_DEFAULT, afnlVar);
        afnl afnlVar2 = new afnl(true, a.t.a());
        afkfVar.b(duqi.PLACE_DETAILS_BASIC, duqi.DIRECTIONS_NAVIGATION, afnlVar2);
        afkfVar.b(duqi.PLACE_DETAILS_FULL, duqi.DIRECTIONS_NAVIGATION, afnlVar2);
        afkfVar.a(duqi.SOCIAL_PLANNING, new afob(a.C.a()));
        afkfVar.a(duqi.HOME_SCREEN, new afnn(a.D.a()));
        duqi duqiVar = duqi.MEDIA_INTEGRATION_SETUP;
        a.E.a();
        afkfVar.a(duqiVar, new afnr());
        afkfVar.a(duqi.SETTINGS_COMMUTE, new afnh(a.F.a()));
        this.i = afkfVar;
        afkg a2 = this.k.a();
        afkf afkfVar2 = new afkf(a2.d);
        afnj afnjVar2 = new afnj(a2.c, a2.e, a2.A.a(), a2.h);
        afkfVar2.a(duqi.DIRECTIONS_DEFAULT, afnjVar2);
        afkfVar2.a(duqi.DIRECTIONS_NAVIGATION, afnjVar2);
        afkfVar2.a(duqi.DIRECTIONS_TRIP_DETAILS, afnjVar2);
        afkfVar2.a(duqi.DIRECTIONS_COMMUTE_IMMERSIVE, afnjVar2);
        afnv afnvVar2 = new afnv(a2.B.a());
        afkfVar2.a(duqi.PLACE_DETAILS_BASIC, afnvVar2);
        afkfVar2.a(duqi.PLACE_DETAILS_FULL, afnvVar2);
        this.j = afkfVar2;
    }

    @Override // defpackage.afkv
    /* renamed from: e */
    public final afkr i(Intent intent, @dzsi String str) {
        ArrayList arrayList;
        bunm bunmVar = this.p;
        if (((asio) this.g).b) {
            this.k.a();
            arrayList = new ArrayList(afkg.b);
            arrayList.add(duqi.DIRECTIONS_COMMUTE_IMMERSIVE);
        } else {
            afkg a = this.k.a();
            ArrayList arrayList2 = new ArrayList(afkg.a);
            arrayList2.add(duqi.DIRECTIONS_COMMUTE_IMMERSIVE);
            if (a.f.getEnableFeatureParameters().z) {
                arrayList2.add(duqi.LOCATION_SHARING);
                arrayList2.add(duqi.LOCATION_SHARING_REQUEST_LOCATION);
            }
            if (a.g.b()) {
                arrayList2.add(duqi.DIRECTIONS_TWO_WHEELER);
            }
            arrayList2.add(duqi.SETTINGS_COMMUTE);
            arrayList = arrayList2;
        }
        return new afkr(intent, str, this.b, this.d, this, new afki(this, bunmVar, arrayList), this.o, this.e.h());
    }

    public final void f(@dzsi durz durzVar) {
        if (this.b.K() instanceof gel) {
            this.b.g().e();
            this.f.o(bvku.d(durzVar, null, true));
        }
    }
}
