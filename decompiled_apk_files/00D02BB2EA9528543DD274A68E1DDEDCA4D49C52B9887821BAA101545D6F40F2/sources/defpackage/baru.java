package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: baru  reason: default package */
/* loaded from: classes3.dex */
public class baru implements baqh {
    public final gga a;
    public final cqhn b;
    public final axwy c;
    public final afzv d;
    public final dxio<akfa> e;
    public int f;
    private final dcdc<axxe> g;
    @dzsi
    private dcdc<baqg> h;

    public baru(gga ggaVar, cqhn cqhnVar, axwq axwqVar, axwy axwyVar, afzv afzvVar, dxio<akfa> dxioVar) {
        this.a = ggaVar;
        this.b = cqhnVar;
        this.c = axwyVar;
        this.d = afzvVar;
        this.e = dxioVar;
        dcdc<axxe> h = axwqVar.y().b().h();
        dbsk.s(h);
        this.g = dcbg.b(h).o(bark.a).z();
    }

    @Override // defpackage.izf
    public List<baqg> Pd() {
        dcdc<baqg> dcdcVar = this.h;
        if (dcdcVar == null) {
            dcdcVar = dcbg.b(this.g).s(new dbrn(this) { // from class: barl
                private final baru a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    baru baruVar = this.a;
                    return new bart(baruVar, baruVar.a, baruVar.c, baruVar.d, baruVar.e, (axxe) obj);
                }
            }).z();
        }
        this.h = dcdcVar;
        return dcdcVar;
    }

    @Override // defpackage.baqh
    public void b(baqg baqgVar) {
        int indexOf;
        dcdc<baqg> dcdcVar = this.h;
        if (dcdcVar == null || (indexOf = dcdcVar.indexOf(baqgVar)) < 0 || indexOf == this.f) {
            return;
        }
        this.f = indexOf;
        cqkx.p(this);
    }

    @Override // defpackage.baqh
    public Integer c() {
        return Integer.valueOf(this.f);
    }

    @Override // defpackage.baqh
    public jco d() {
        return new barn(this);
    }

    @Override // defpackage.baqh
    public cjtd e() {
        return cjtd.a(dtyd.cX);
    }

    @Override // defpackage.baqh
    public String f() {
        return this.a.getResources().getString(R.string.TRIP_LIST_CAROUSEL_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.baqh
    public Boolean g() {
        boolean z = true;
        if (this.g.size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.baqh
    public Set<String> h() {
        return dcbg.b(this.g).s(barm.a).B();
    }
}
