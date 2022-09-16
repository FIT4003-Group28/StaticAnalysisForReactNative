package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdcg  reason: default package */
/* loaded from: classes3.dex */
public class bdcg implements bdad {
    private final Context a;
    private final dwfl b;
    private final cjqy c;
    private final afyb d;
    private final cjqq e;
    private final afxn f;
    private final afxy g;
    private final bcrn h;
    @dzsi
    private final ilo i;

    public bdcg(Context context, cjqy cjqyVar, cjqq cjqqVar, afxz afxzVar, afxn afxnVar, afyb afybVar, bcro bcroVar, dwfl dwflVar, @dzsi ilo iloVar) {
        this.a = context;
        this.c = cjqyVar;
        this.e = cjqqVar;
        this.d = afybVar;
        this.i = iloVar;
        this.h = bcroVar;
        this.f = afxnVar;
        this.b = dwflVar;
        this.g = afxzVar.a(afybVar.e());
    }

    private final void x(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        ddes bZ = ddet.D.bZ();
        ddel c = this.g.c(this.i);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        c.getClass();
        ddetVar.t = c;
        ddetVar.a |= 4194304;
        b.s(bZ.bK());
        cjtd a = b.a();
        this.c.n(this.e.g().d(a), new cjte(deaf.TAP), a);
    }

    @Override // defpackage.bdad
    public Boolean a() {
        if (!this.d.a() || !afxy.f(this.b)) {
            return false;
        }
        return Boolean.valueOf(this.g.a());
    }

    @Override // defpackage.bdad
    public Boolean b() {
        boolean z = false;
        if (!this.d.c() || !afxy.f(this.b)) {
            return false;
        }
        afxy afxyVar = this.g;
        if (!afxyVar.g(this.i, "lens_search_dish_suggestion_dismissed")) {
            z = afxyVar.c.b();
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdad
    public Boolean c() {
        boolean z = false;
        if (!this.d.b() || !afxy.f(this.b)) {
            return false;
        }
        afxy afxyVar = this.g;
        ilo iloVar = this.i;
        dizh dizhVar = this.b.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        if (!afxyVar.g(iloVar, "lens_translate_menu_suggestion_dismissed")) {
            if (afxyVar.e != afyc.PHOTO_TABS && afxyVar.e != afyc.LATEST_PHOTOS) {
                z = afxyVar.b.getLensParameters().g ? afxyVar.h(dizhVar) : afxyVar.j(iloVar).a();
            } else if (afxyVar.h(dizhVar) && dizhVar != null) {
                dizl dizlVar = dizhVar.i;
                if (dizlVar == null) {
                    dizlVar = dizl.e;
                }
                dizj dizjVar = dizlVar.d;
                if (dizjVar == null) {
                    dizjVar = dizj.g;
                }
                if ((dizjVar.a & 1) != 0) {
                    dizl dizlVar2 = dizhVar.i;
                    if (dizlVar2 == null) {
                        dizlVar2 = dizl.e;
                    }
                    dizj dizjVar2 = dizlVar2.d;
                    if (dizjVar2 == null) {
                        dizjVar2 = dizj.g;
                    }
                    if ((dizjVar2.a & 2) != 0) {
                        dizl dizlVar3 = dizhVar.i;
                        if (dizlVar3 == null) {
                            dizlVar3 = dizl.e;
                        }
                        dizj dizjVar3 = dizlVar3.d;
                        if (dizjVar3 == null) {
                            dizjVar3 = dizj.g;
                        }
                        if ((dizjVar3.a & 4) != 0) {
                            dizl dizlVar4 = dizhVar.i;
                            if (dizlVar4 == null) {
                                dizlVar4 = dizl.e;
                            }
                            dizj dizjVar4 = dizlVar4.d;
                            if (dizjVar4 == null) {
                                dizjVar4 = dizj.g;
                            }
                            if ((dizjVar4.a & 8) != 0) {
                                dizl dizlVar5 = dizhVar.i;
                                if (dizlVar5 == null) {
                                    dizlVar5 = dizl.e;
                                }
                                dizj dizjVar5 = dizlVar5.d;
                                if (dizjVar5 == null) {
                                    dizjVar5 = dizj.g;
                                }
                                if ((dizjVar5.a & 16) != 0) {
                                    dizl dizlVar6 = dizhVar.i;
                                    if (dizlVar6 == null) {
                                        dizlVar6 = dizl.e;
                                    }
                                    dizj dizjVar6 = dizlVar6.d;
                                    if (dizjVar6 == null) {
                                        dizjVar6 = dizj.g;
                                    }
                                    float f = dizjVar6.d;
                                    dizl dizlVar7 = dizhVar.i;
                                    if (dizlVar7 == null) {
                                        dizlVar7 = dizl.e;
                                    }
                                    dizj dizjVar7 = dizlVar7.d;
                                    if (dizjVar7 == null) {
                                        dizjVar7 = dizj.g;
                                    }
                                    float f2 = f - dizjVar7.c;
                                    dizl dizlVar8 = dizhVar.i;
                                    if (dizlVar8 == null) {
                                        dizlVar8 = dizl.e;
                                    }
                                    dizj dizjVar8 = dizlVar8.d;
                                    if (dizjVar8 == null) {
                                        dizjVar8 = dizj.g;
                                    }
                                    float f3 = dizjVar8.f;
                                    dizl dizlVar9 = dizhVar.i;
                                    if (dizlVar9 == null) {
                                        dizlVar9 = dizl.e;
                                    }
                                    dizj dizjVar9 = dizlVar9.d;
                                    if (dizjVar9 == null) {
                                        dizjVar9 = dizj.g;
                                    }
                                    float f4 = f3 - dizjVar9.e;
                                    dizl dizlVar10 = dizhVar.i;
                                    if (dizlVar10 == null) {
                                        dizlVar10 = dizl.e;
                                    }
                                    dizj dizjVar10 = dizlVar10.d;
                                    if (dizjVar10 == null) {
                                        dizjVar10 = dizj.g;
                                    }
                                    float f5 = f2 * f4 * dizjVar10.b;
                                    dkng dkngVar = afxyVar.b.getLensParameters().i;
                                    if (dkngVar == null) {
                                        dkngVar = dkng.c;
                                    }
                                    dknf dknfVar = dkngVar.a;
                                    if (dknfVar == null) {
                                        dknfVar = dknf.h;
                                    }
                                    if (f5 >= dknfVar.d) {
                                        dizl dizlVar11 = dizhVar.i;
                                        if (dizlVar11 == null) {
                                            dizlVar11 = dizl.e;
                                        }
                                        if ((dizlVar11.a & 1) != 0) {
                                            dkng dkngVar2 = afxyVar.b.getLensParameters().i;
                                            if (dkngVar2 == null) {
                                                dkngVar2 = dkng.c;
                                            }
                                            dknf dknfVar2 = dkngVar2.a;
                                            if (dknfVar2 == null) {
                                                dknfVar2 = dknf.h;
                                            }
                                            float f6 = dknfVar2.c;
                                            dizl dizlVar12 = dizhVar.i;
                                            if (dizlVar12 == null) {
                                                dizlVar12 = dizl.e;
                                            }
                                            if (dizlVar12.c >= f6) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdad
    public Boolean d() {
        boolean z = false;
        if (!this.d.d()) {
            return false;
        }
        if (this.d.e() != afyc.LATEST_PHOTOS && !afxy.f(this.b)) {
            return false;
        }
        final afxy afxyVar = this.g;
        ilo iloVar = this.i;
        if (iloVar != null && !afxyVar.g(iloVar, "lens_search_places_suggestion_dismissed") && ((afxyVar.e.equals(afyc.PHOTO_TABS) || afxyVar.e.equals(afyc.LATEST_PHOTOS)) && afxyVar.c.j())) {
            z = afxv.f(iloVar) ? true : dcbg.b(iloVar.as()).r(new dbsl(afxyVar) { // from class: afxx
                private final afxy a;

                {
                    this.a = afxyVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    String str = (String) obj;
                    dkng dkngVar = this.a.d.c.getLensParameters().i;
                    if (dkngVar == null) {
                        dkngVar = dkng.c;
                    }
                    dknd dkndVar = dkngVar.b;
                    if (dkndVar == null) {
                        dkndVar = dknd.e;
                    }
                    if (dkndVar.c.contains(str)) {
                        return false;
                    }
                    if (!str.endsWith("_bar") && !str.endsWith("_restaurant") && !str.endsWith("_shop")) {
                        return afxg.c.contains(str);
                    }
                    return true;
                }
            }).a();
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdad
    public String e() {
        return this.a.getString(R.string.LENS_ICON_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.bdad
    public String f() {
        return this.g.a.getString(R.string.LENS_VIEW_EXPLORE_DISHES_CHIP_TEXT);
    }

    @Override // defpackage.bdad
    public String g() {
        return this.g.a.getString(R.string.LENS_VIEW_SEARCH_IMAGE_PLACES_CHIP_TEXT);
    }

    @Override // defpackage.bdad
    public String h() {
        return this.a.getString(R.string.LENS_TRANSLATE_SUGGESTION_CHIP_TEXT);
    }

    @Override // defpackage.bdad
    public cqkl i() {
        this.h.a(this.b, this.d.f(), 2, dbsg.j(this.i));
        return cqkl.a;
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bcuw(), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return cjtd.b;
    }

    @Override // defpackage.bdad
    public cqkl l() {
        this.h.a(this.b, 3, 3, dbsg.j(this.i));
        return cqkl.a;
    }

    @Override // defpackage.bdad
    public cqkl m() {
        this.h.a(this.b, 2, 5, dbsg.j(this.i));
        return cqkl.a;
    }

    @Override // defpackage.bdad
    public cqkl n() {
        this.h.a(this.b, 4, 4, dbsg.j(this.i));
        return cqkl.a;
    }

    @Override // defpackage.bdad
    public cjtd o() {
        cjta d = this.g.d(this.i);
        d.d = dtxy.cu;
        return d.a();
    }

    @Override // defpackage.bdad
    public cjtd p() {
        if (!b().booleanValue()) {
            return cjtd.c;
        }
        cjta d = this.g.d(this.i);
        d.d = dtxy.cx;
        return d.a();
    }

    @Override // defpackage.bdad
    public cjtd q() {
        if (!d().booleanValue()) {
            return cjtd.c;
        }
        afxy afxyVar = this.g;
        ilo iloVar = this.i;
        cjta k = afxy.k(afxyVar.c(iloVar), w().booleanValue());
        k.d = dtxy.cz;
        return k.a();
    }

    @Override // defpackage.bdad
    public cjtd r() {
        if (!c().booleanValue()) {
            return cjtd.c;
        }
        afxy afxyVar = this.g;
        ilo iloVar = this.i;
        dizh dizhVar = this.b.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        ddel c = afxyVar.c(iloVar);
        dbsg<afyd> i = afxyVar.b.getLensParameters().g ? afxyVar.i(dizhVar) : afxyVar.j(iloVar);
        if (i.a()) {
            dsqp dsqpVar = (dsqp) c.cu(5);
            dsqpVar.bC(c);
            ddej ddejVar = (ddej) dsqpVar;
            String a = i.b().a();
            if (ddejVar.c) {
                ddejVar.bF();
                ddejVar.c = false;
            }
            ddel ddelVar = (ddel) ddejVar.b;
            ddel ddelVar2 = ddel.f;
            a.getClass();
            ddelVar.a |= 4;
            ddelVar.d = a;
            String b = i.b().b();
            if (ddejVar.c) {
                ddejVar.bF();
                ddejVar.c = false;
            }
            ddel ddelVar3 = (ddel) ddejVar.b;
            b.getClass();
            ddelVar3.a |= 8;
            ddelVar3.e = b;
            c = ddejVar.bK();
        }
        cjta k = afxy.k(c, afxyVar.e());
        k.d = dtxy.cB;
        return k.a();
    }

    @Override // defpackage.bdad
    public cqkl s() {
        this.g.b(this.i, "lens_search_dish_suggestion_dismissed");
        cqkx.p(this);
        x(dtxy.cw);
        return cqkl.a;
    }

    @Override // defpackage.bdad
    public cqkl t() {
        this.g.b(this.i, "lens_search_places_suggestion_dismissed");
        cqkx.p(this);
        x(dtxy.cy);
        return cqkl.a;
    }

    @Override // defpackage.bdad
    public cqkl u() {
        this.g.b(this.i, "lens_translate_menu_suggestion_dismissed");
        cqkx.p(this);
        x(dtxy.cA);
        return cqkl.a;
    }

    @Override // defpackage.bdad
    public Boolean v() {
        boolean z = false;
        if (this.g.e() && c().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdad
    public Boolean w() {
        dkng dkngVar = this.f.c.getLensParameters().i;
        if (dkngVar == null) {
            dkngVar = dkng.c;
        }
        dknd dkndVar = dkngVar.b;
        if (dkndVar == null) {
            dkndVar = dknd.e;
        }
        boolean z = false;
        if (dkndVar.a && dkndVar.b && d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
