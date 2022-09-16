package defpackage;

import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: cacc  reason: default package */
/* loaded from: classes4.dex */
public class cacc implements caft, caug, cafr, caex {
    public final gga a;
    public final caui b;
    public final dcdc<cauj> e;
    @dzsi
    public cauh f;
    @dzsi
    public cafs g;
    private final cafi i;
    private final dzsj<caez> j;
    private final cqqw k;
    private final cabc l;
    private final SpinnerAdapter m;
    @dzsi
    private AdapterView.OnItemSelectedListener n;
    @dzsi
    private bzyw o;
    public String h = "";
    public final EnumMap<cauj, cauh> c = new EnumMap<>(cauj.class);
    public cqtv d = cqrp.d(dcyn.a);

    public cacc(gga ggaVar, cafi cafiVar, cqhn cqhnVar, caui cauiVar, dzsj<caez> dzsjVar, btvo btvoVar, cqqw cqqwVar, cabc cabcVar) {
        this.a = ggaVar;
        this.i = cafiVar;
        this.b = cauiVar;
        this.j = dzsjVar;
        this.k = cqqwVar;
        this.l = cabcVar;
        dccx F = dcdc.F();
        F.g(cauj.QUESTIONS_AND_ANSWERS);
        F.g(cauj.QUESTIONS_ONLY);
        F.g(cauj.ANSWERS_ONLY);
        this.e = F.f();
        this.m = new cabz(this, ggaVar);
    }

    @Override // defpackage.jbg
    public AdapterView.OnItemSelectedListener Rs() {
        if (this.n == null) {
            this.n = new caca(this);
        }
        return this.n;
    }

    @Override // defpackage.jbg
    public Integer Rt() {
        cauh cauhVar = this.f;
        return Integer.valueOf(cauhVar != null ? this.e.indexOf(cauhVar.b) : 0);
    }

    @Override // defpackage.jbg
    public SpinnerAdapter Rv() {
        return this.m;
    }

    @Override // defpackage.cqrh
    public void Rz(cqiw<?> cqiwVar, cqkp cqkpVar) {
        cauh cauhVar;
        if (!(cqiwVar instanceof oag) || !cqkpVar.equals(this) || (cauhVar = this.f) == null || cauhVar.f || !cauhVar.e) {
            return;
        }
        cauhVar.h.b(cauhVar.d, cauhVar, cauhVar.a);
        cauhVar.f = true;
    }

    @Override // defpackage.cafe
    public Boolean b() {
        cauh cauhVar = this.f;
        boolean z = false;
        if (cauhVar != null && cauhVar.e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafe
    @dzsi
    public cjyo c() {
        return null;
    }

    @Override // defpackage.caft
    public cafr d() {
        return this;
    }

    @Override // defpackage.cafe
    public dkcp e() {
        return dkcp.QA;
    }

    @Override // defpackage.caft
    @dzsi
    public cafs g() {
        return this.g;
    }

    @Override // defpackage.cafe
    public cqqw h() {
        return this.k;
    }

    @Override // defpackage.caft
    public List<cafq> i() {
        cauh cauhVar = this.f;
        return cauhVar != null ? cauhVar.c : new ArrayList();
    }

    @Override // defpackage.cafe
    public cqtv j() {
        return this.d;
    }

    @Override // defpackage.cafe
    public Boolean k() {
        return false;
    }

    @Override // defpackage.cafr
    @dzsi
    public cjtd l() {
        return cjtd.a(dtyd.cg);
    }

    @Override // defpackage.cafe
    public Boolean m() {
        return false;
    }

    @Override // defpackage.cafe
    @dzsi
    public cafd n() {
        return null;
    }

    @Override // defpackage.cafe
    @dzsi
    public bzyw o() {
        return null;
    }

    @Override // defpackage.cafe
    public Boolean p() {
        boolean z = false;
        if (this.i.q() && this.l.equals(cabc.AS_PUBLIC)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafe
    @dzsi
    public bzyw q() {
        if (p().booleanValue()) {
            if (this.o == null) {
                this.o = this.j.a().a(this);
            }
            return this.o;
        }
        return null;
    }

    @Override // defpackage.caex
    public void r() {
        this.a.g().e();
    }

    @Override // defpackage.cafe
    public Boolean s() {
        return false;
    }

    @Override // defpackage.cafe
    @dzsi
    public cjtd t() {
        return cjtd.a(dtyd.cb);
    }

    @Override // defpackage.cafe
    @dzsi
    public cbro u() {
        return null;
    }

    public Boolean v() {
        return false;
    }

    @Override // defpackage.caug
    public void w() {
        cqkx.p(this);
    }

    @Override // defpackage.cafr
    public CharSequence x() {
        cauh cauhVar = this.f;
        if (cauhVar != null && !cauhVar.g.isEmpty()) {
            this.h = this.f.g;
        }
        return this.h;
    }
}
