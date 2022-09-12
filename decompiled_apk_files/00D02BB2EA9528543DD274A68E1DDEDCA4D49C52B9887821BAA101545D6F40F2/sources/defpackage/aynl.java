package defpackage;

import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aynl  reason: default package */
/* loaded from: classes3.dex */
public class aynl implements aymm {
    public final gga a;
    public final ayay b;
    public final batm c;
    public final cpv d;
    @dzsi
    public final bwrs<baad> e;
    private final jkf f;
    private final jar g;
    private final dxio<axwi> h;
    private final dxio<ayfn> i;
    private final axwg j;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;

    public aynl(gga ggaVar, jkf jkfVar, dzsj<araj> dzsjVar, dxio<axwi> dxioVar, ayay ayayVar, batm batmVar, dxio<ayfn> dxioVar2, axwg axwgVar, cpv cpvVar, @dzsi bwrs<baad> bwrsVar) {
        this.a = ggaVar;
        this.f = jkfVar;
        this.g = dzsjVar.a().e();
        this.h = dxioVar;
        this.b = ayayVar;
        this.c = batmVar;
        this.i = dxioVar2;
        this.e = bwrsVar;
        this.j = axwgVar;
        this.d = cpvVar;
    }

    @dzsi
    private final baad r() {
        bwrs<baad> bwrsVar = this.e;
        if (bwrsVar != null) {
            return bwrsVar.c();
        }
        return null;
    }

    private final aynk s() {
        int i;
        if (Boolean.valueOf(this.e == null).booleanValue() || r() == null) {
            i = 1;
        } else {
            baad r = r();
            dbsk.s(r);
            i = r.ai();
        }
        if (i == 5) {
            return aynk.DISPLAYING_SHOW_ORIGINAL_LANGUAGE;
        }
        if (i == 3) {
            return aynk.DISPLAYING_SHOW_TRANSLATION;
        }
        if (i != 1 || !this.m) {
            return aynk.NOT_VISIBLE;
        }
        return aynk.DISPLAYING_SHOW_TRANSLATION;
    }

    @Override // defpackage.aymm
    public String a() {
        return this.a.getString(R.string.LIST_VIEW);
    }

    @Override // defpackage.aymm
    public cqkl b() {
        this.f.setExpandingStateTransition(jkc.m, jkc.m, true);
        this.f.B(jjn.EXPANDED);
        return cqkl.a;
    }

    @Override // defpackage.aymm
    public void c(Boolean bool) {
        this.k = bool.booleanValue();
    }

    @Override // defpackage.aymm
    public Boolean d() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.aymm
    public jar e() {
        return this.g;
    }

    @Override // defpackage.aymm
    public String g() {
        if (r() == null) {
            return "";
        }
        aynk aynkVar = aynk.NOT_VISIBLE;
        int ordinal = s().ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? "" : this.a.getString(R.string.SEE_TRANSLATION_IN_LANGUAGE, new Object[]{Locale.getDefault().getDisplayLanguage(Locale.getDefault())});
        }
        baad r = r();
        dbsk.s(r);
        return this.a.getString(R.string.SEE_ORIGINAL_IN_LANGUAGE, new Object[]{new Locale(r.ae().split("[-_]+")[0]).getDisplayLanguage(Locale.getDefault())});
    }

    @Override // defpackage.aymm
    public cqkl h() {
        dbsg<dpqy> i;
        aynk aynkVar = aynk.NOT_VISIBLE;
        int ordinal = s().ordinal();
        boolean z = false;
        if (ordinal == 1) {
            dpqx bZ = dpqy.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpqy dpqyVar = (dpqy) bZ.b;
            dpqyVar.a |= 1;
            dpqyVar.b = false;
            i = dbsg.i(bZ.bK());
        } else if (ordinal != 2) {
            i = dbpy.a;
        } else {
            dpqx bZ2 = dpqy.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpqy dpqyVar2 = (dpqy) bZ2.b;
            int i2 = dpqyVar2.a | 1;
            dpqyVar2.a = i2;
            dpqyVar2.b = true;
            dpqyVar2.a = 2 | i2;
            dpqyVar2.c = true;
            i = dbsg.i(bZ2.bK());
        }
        if (s() == aynk.DISPLAYING_SHOW_ORIGINAL_LANGUAGE) {
            z = true;
        }
        this.m = z;
        if (r() != null) {
            baad r = r();
            dbsk.s(r);
            deha.q(degp.q(this.h.a().k(axwf.c(r.l()), i)), new aynj(this), dege.a);
        }
        return cqkl.a;
    }

    @Override // defpackage.aymm
    public cqkl i() {
        this.l = true;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.aymm
    public Boolean j() {
        return Boolean.valueOf(s() == aynk.DISPLAYING_SHOW_ORIGINAL_LANGUAGE);
    }

    @Override // defpackage.aymm
    @dzsi
    public ghq k() {
        if (p().booleanValue()) {
            return this.i.a().f();
        }
        return null;
    }

    @Override // defpackage.aymm
    public cqkl l() {
        if (p().booleanValue()) {
            this.i.a().e();
        }
        return cqkl.a;
    }

    @Override // defpackage.aymm
    public CharSequence m() {
        if (d().booleanValue()) {
            return this.a.getText(R.string.VIEW_MAP);
        }
        return this.a.getString(R.string.TRAVERSAL_TOGGLE_VIEW_LIST);
    }

    @Override // defpackage.aymm
    public cqtd n() {
        return cqrt.g(true != d().booleanValue() ? 2131232750 : 2131232773, ibm.x());
    }

    @Override // defpackage.aymm
    public Boolean o() {
        boolean z = false;
        if (d().booleanValue()) {
            return false;
        }
        if (this.i.a().b.size() == 0) {
            z = true;
        }
        return Boolean.valueOf(!z);
    }

    @Override // defpackage.aymm
    public Boolean p() {
        return Boolean.valueOf(this.j.c());
    }

    @Override // defpackage.aymm
    public cjtd q() {
        if (d().booleanValue()) {
            return cjtd.a(dtxy.eD);
        }
        return cjtd.a(dtxy.eC);
    }

    @Override // defpackage.aymm
    public Boolean f() {
        if (this.l || !this.k) {
            return false;
        }
        return Boolean.valueOf(dcdc.g(aynk.DISPLAYING_SHOW_ORIGINAL_LANGUAGE, aynk.DISPLAYING_SHOW_TRANSLATION).contains(s()));
    }
}
