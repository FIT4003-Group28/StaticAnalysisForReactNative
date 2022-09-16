package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsqx  reason: default package */
/* loaded from: classes4.dex */
public class bsqx implements bssl {
    private final gga a;
    @dzsi
    private brlu b;

    public bsqx(gga ggaVar) {
        this.a = ggaVar;
    }

    public void a(brlu brluVar) {
        this.b = brluVar;
    }

    public void b() {
        this.b = null;
    }

    @Override // defpackage.bssl
    public Boolean c() {
        return Boolean.valueOf(this.b != null);
    }

    @Override // defpackage.bssl
    public String d() {
        brlu brluVar = this.b;
        if (brluVar == null) {
            return "";
        }
        if (brluVar.V().a()) {
            brlu brluVar2 = this.b;
            dbsk.s(brluVar2);
            int intValue = brluVar2.V().b().intValue();
            return this.a.getResources().getQuantityString(R.plurals.HOTEL_PLACE_COUNT, intValue, Integer.valueOf(intValue));
        }
        return this.a.getString(R.string.HOTEL_ABOUT_PRICING);
    }

    @Override // defpackage.bssl
    public cqkl e() {
        brlu brluVar = this.b;
        gei.a(this.a, aehm.g(brluVar != null ? brluVar.q : true));
        return cqkl.a;
    }

    @Override // defpackage.bssl
    public cjtd f() {
        ddho ddhoVar = dtxr.ce;
        brlu brluVar = this.b;
        if (brluVar != null && brluVar.V().a()) {
            ddhoVar = dtxr.cf;
        }
        return cjtd.a(ddhoVar);
    }
}
