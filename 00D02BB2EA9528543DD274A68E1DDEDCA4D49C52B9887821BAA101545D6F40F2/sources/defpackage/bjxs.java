package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjxs  reason: default package */
/* loaded from: classes3.dex */
public class bjxs implements bjwg {
    public final gga a;
    public final bjwf b;
    private final String c;
    private final String d;
    private final Boolean e;
    private final cjtd f;
    private final cpv g;
    private boolean h;

    public bjxs(gga ggaVar, cqhn cqhnVar, cpv cpvVar, bwrs<ilo> bwrsVar, bjwf bjwfVar, djam djamVar, @dzsi bjgs bjgsVar) {
        this.a = ggaVar;
        this.g = cpvVar;
        this.b = bjwfVar;
        String str = djamVar.b;
        this.c = str;
        djag djagVar = djamVar.c;
        dhze dhzeVar = (djagVar == null ? djag.d : djagVar).a;
        this.d = (dhzeVar == null ? dhze.m : dhzeVar).f;
        this.h = bjwfVar.a(str);
        bjxp bjxpVar = (bjxp) bjwfVar;
        boolean z = false;
        if (bjxpVar.g) {
            djam djamVar2 = bjxpVar.f.b;
            djag djagVar2 = (djamVar2 == null ? djam.m : djamVar2).c;
            if ((djagVar2 == null ? djag.d : djagVar2).b) {
                djag djagVar3 = djamVar.c;
                if (!(djagVar3 == null ? djag.d : djagVar3).b) {
                    z = true;
                }
            }
        }
        this.e = Boolean.valueOf(z);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        dcqe dcqeVar = cjtd.a;
        this.f = c.bZ();
    }

    @Override // defpackage.bjgv
    public void QW() {
        this.h = this.b.a(this.c);
        cqkx.p(this);
    }

    @Override // defpackage.bjwg
    @dzsi
    public jic a() {
        if (f().booleanValue() || !e().booleanValue()) {
            return null;
        }
        djam djamVar = ((bjxp) this.b).f.b;
        if (djamVar == null) {
            djamVar = djam.m;
        }
        djag djagVar = djamVar.c;
        if (djagVar == null) {
            djagVar = djag.d;
        }
        return bjgr.e(djagVar);
    }

    @Override // defpackage.bjwg
    public Boolean b() {
        boolean z = true;
        if (!e().booleanValue() && !f().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bjwg
    public String c() {
        if (f().booleanValue()) {
            return this.a.getString(true != e().booleanValue() ? R.string.PLACE_QA_ACCESSIBILITY_ANSWER_BEST_ANSWER_UNCHECKED_DESCRIPTION : R.string.PLACE_QA_ACCESSIBILITY_BEST_ANSWER_CHECKED_DESCRIPTION, new Object[]{this.d});
        }
        return e().booleanValue() ? this.a.getString(R.string.PLACE_QA_ACCESSIBILITY_BEST_ANSWER_BADGE_DESCRIPTION, new Object[]{this.d, this.b.b()}) : "";
    }

    @Override // defpackage.bjwg
    public cjtd d(ddho ddhoVar) {
        return cjtd.c(this.f).b(ddhoVar);
    }

    @Override // defpackage.bjwg
    public Boolean e() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.bjwg
    public Boolean f() {
        return this.e;
    }

    @Override // defpackage.bjwg
    public Boolean h() {
        boolean z = false;
        if (e().booleanValue() && !this.g.e(this.a)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bjwg
    public cqkn<bjwg> i() {
        return new cqkn(this) { // from class: bjxr
            private final bjxs a;

            {
                this.a = this;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                bjxs bjxsVar = this.a;
                bjwg bjwgVar = (bjwg) cqkpVar;
                if (bjxsVar.e().booleanValue()) {
                    bjwf bjwfVar = bjxsVar.b;
                    String string = bjxsVar.a.getString(R.string.PLACE_QA_BEST_ANSWER_BADGE_POPUP_TEXT, new Object[]{bjwfVar.b()});
                    bjxp bjxpVar = (bjxp) bjwfVar;
                    jlp jlpVar = bjxpVar.d;
                    dbuh.d(view);
                    jlo a = jlpVar.a(string, view);
                    a.o(true);
                    a.i();
                    a.t(jln.GM2_BLUE);
                    a.b(jmj.a(bjxpVar.a, -4));
                    a.r();
                    a.w(bjxpVar.h);
                    a.u(ibm.c().b(bjxpVar.a));
                    a.q(iva.b(ibl.h(), ibl.s()).b(bjxpVar.a));
                    a.a();
                }
            }
        };
    }

    @Override // defpackage.bjwg
    public cqkl j() {
        if (f().booleanValue()) {
            bjwf bjwfVar = this.b;
            String str = this.c;
            djrf bZ = djrg.d.bZ();
            bjxp bjxpVar = (bjxp) bjwfVar;
            String str2 = bjxpVar.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djrg djrgVar = (djrg) bZ.b;
            str2.getClass();
            djrgVar.a |= 1;
            djrgVar.b = str2;
            if (true == bjxpVar.a(str)) {
                str = "";
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djrg djrgVar2 = (djrg) bZ.b;
            str.getClass();
            djrgVar2.a |= 2;
            djrgVar2.c = str;
            bjxpVar.d(bZ.bK());
        }
        return cqkl.a;
    }
}
