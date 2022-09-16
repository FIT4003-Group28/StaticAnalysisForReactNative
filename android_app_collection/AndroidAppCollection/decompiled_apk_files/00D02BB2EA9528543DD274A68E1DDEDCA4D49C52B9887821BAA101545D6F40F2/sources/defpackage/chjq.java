package defpackage;

import android.content.res.Resources;
import android.text.SpannableString;
import com.google.android.apps.maps.R;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chjq  reason: default package */
/* loaded from: classes4.dex */
public class chjq extends chjd implements chme {
    private final cchz c;
    private final ccif d;
    private final Resources e;
    private final Executor f;
    private final djfg g;
    private dcdc<chmd> h;
    private SpannableString i;
    private final chia j;

    public chjq(cchz cchzVar, Executor executor, ccif ccifVar, Resources resources, chmu chmuVar) {
        super(chmuVar);
        chig chigVar;
        djfg djfgVar;
        chig chigVar2;
        this.c = cchzVar;
        this.f = executor;
        this.d = ccifVar;
        this.e = resources;
        chle chleVar = (chle) chmuVar;
        chik chikVar = chleVar.a;
        if (chikVar.a == 2) {
            chigVar = (chig) chikVar.b;
        } else {
            chigVar = chig.f;
        }
        djfl djflVar = chigVar.b;
        djflVar = djflVar == null ? djfl.e : djflVar;
        if (djflVar.b == 4) {
            djfgVar = (djfg) djflVar.c;
        } else {
            djfgVar = djfg.e;
        }
        this.g = djfgVar;
        chik chikVar2 = chleVar.a;
        if (chikVar2.a == 2) {
            chigVar2 = (chig) chikVar2.b;
        } else {
            chigVar2 = chig.f;
        }
        chib chibVar = chigVar2.d;
        chibVar = chibVar == null ? chib.f : chibVar;
        dsqp dsqpVar = (dsqp) chibVar.cu(5);
        dsqpVar.bC(chibVar);
        this.j = (chia) dsqpVar;
    }

    @Override // defpackage.chmv
    public void RH(cqiv cqivVar) {
        cqivVar.a(new chcu(), this);
    }

    @Override // defpackage.chme
    public String b() {
        return this.g.a;
    }

    @Override // defpackage.chme
    public String c() {
        return this.g.b;
    }

    @Override // defpackage.chjd, defpackage.chjf, defpackage.chmv
    public chik e() {
        chig chigVar;
        chik e = super.e();
        dsqp dsqpVar = (dsqp) e.cu(5);
        dsqpVar.bC(e);
        chij chijVar = (chij) dsqpVar;
        chik chikVar = (chik) chijVar.b;
        if (chikVar.a == 2) {
            chigVar = (chig) chikVar.b;
        } else {
            chigVar = chig.f;
        }
        dsqp dsqpVar2 = (dsqp) chigVar.cu(5);
        dsqpVar2.bC(chigVar);
        chhz chhzVar = (chhz) dsqpVar2;
        chia chiaVar = this.j;
        if (chhzVar.c) {
            chhzVar.bF();
            chhzVar.c = false;
        }
        chig chigVar2 = (chig) chhzVar.b;
        chib bK = chiaVar.bK();
        chig chigVar3 = chig.f;
        bK.getClass();
        chigVar2.d = bK;
        chigVar2.a |= 4;
        if (chijVar.c) {
            chijVar.bF();
            chijVar.c = false;
        }
        chik chikVar2 = (chik) chijVar.b;
        chig bK2 = chhzVar.bK();
        bK2.getClass();
        chikVar2.b = bK2;
        chikVar2.a = 2;
        return chijVar.bK();
    }

    @Override // defpackage.chjf
    public void f() {
        this.c.d().e(new crzp(this) { // from class: chjo
            private final chjq a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                cqkx.p(this.a);
            }
        }, this.f);
    }

    @Override // defpackage.chme
    /* renamed from: h */
    public dcdc<chmd> y() {
        if (this.h == null) {
            dccx F = dcdc.F();
            for (djfe djfeVar : this.g.c) {
                F.g(new chjp(djfeVar));
            }
            this.h = F.f();
        }
        return this.h;
    }

    @Override // defpackage.chme
    public String i() {
        return this.g.d;
    }

    @Override // defpackage.chme
    public cqkl j() {
        this.b.c();
        this.d.c(dtyc.k, null);
        return cqkl.a;
    }

    @Override // defpackage.chme
    public cjtd k() {
        cjta b = cjtd.b();
        b.g(this.b.d());
        b.d = dtyc.k;
        return b.a();
    }

    @Override // defpackage.chme
    public Boolean l() {
        return Boolean.valueOf(((chib) this.j.b).b);
    }

    @Override // defpackage.chme
    public jic m() {
        ccih l = this.c.d().l();
        dbsk.s(l);
        return new jic(l.b(), ckqc.FIFE_MERGE, 2131232998);
    }

    @Override // defpackage.chme
    public String n() {
        ccih l = this.c.d().l();
        dbsk.s(l);
        return dbsj.e(btlu.q(l.a()).t());
    }

    @Override // defpackage.chme
    public String o() {
        chib chibVar = (chib) this.j.b;
        if ((chibVar.a & 2) != 0) {
            dpvk dpvkVar = chibVar.c;
            if (dpvkVar == null) {
                dpvkVar = dpvk.d;
            }
            return dpvkVar.b;
        }
        return this.e.getString(R.string.LOCAL_GUIDE_CITY_PLACE_HOLDER);
    }

    @Override // defpackage.chme
    public cqkl p() {
        return cqkl.a;
    }

    @Override // defpackage.chme
    public cqkl q() {
        chia chiaVar = this.j;
        boolean z = !((chib) chiaVar.b).d;
        if (chiaVar.c) {
            chiaVar.bF();
            chiaVar.c = false;
        }
        chib chibVar = (chib) chiaVar.b;
        chibVar.a |= 4;
        chibVar.d = z;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.chme
    public Boolean r() {
        return Boolean.valueOf(((chib) this.j.b).d);
    }

    @Override // defpackage.chme
    public CharSequence s() {
        if (this.i == null) {
            String string = this.e.getString(R.string.LOCAL_GUIDE_OPT_IN_PROGRAM_RULES);
            SpannableString spannableString = new SpannableString(this.e.getString(R.string.LOCAL_GUIDE_OPT_IN_18_UP, string));
            jmw.h(spannableString, string, cjxr.f(Locale.getDefault().toString()));
            this.i = spannableString;
        }
        return this.i;
    }

    @Override // defpackage.chme
    public cqkl t() {
        chia chiaVar = this.j;
        boolean z = !((chib) chiaVar.b).e;
        if (chiaVar.c) {
            chiaVar.bF();
            chiaVar.c = false;
        }
        chib chibVar = (chib) chiaVar.b;
        chibVar.a |= 8;
        chibVar.e = z;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.chme
    public Boolean u() {
        return Boolean.valueOf(((chib) this.j.b).e);
    }

    @Override // defpackage.chme
    public Boolean v() {
        boolean z = false;
        if ((((chib) this.j.b).a & 2) != 0 && r().booleanValue() && u().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.chme
    public cqkl w() {
        return cqkl.a;
    }

    @Override // defpackage.chme
    public cjtd x() {
        cjta b = cjtd.b();
        b.g(this.b.d());
        b.d = dtyc.l;
        return b.a();
    }
}
