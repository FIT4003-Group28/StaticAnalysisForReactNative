package defpackage;

import android.app.Application;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
/* compiled from: PG */
/* renamed from: sep  reason: default package */
/* loaded from: classes7.dex */
public class sep implements sar {
    public final seu a;
    public final seu b;
    public final dehq c;
    public final cpv d;
    protected boolean e;
    private final sfc g;
    private final qjk i;
    private final cqkn<saq> j = new sem(this);
    private final set k = new sen(this);
    final View.AccessibilityDelegate f = new seo(this);
    private final List<saq> h = new ArrayList();

    public sep(Application application, cqhn cqhnVar, qjk qjkVar, sfd sfdVar, sev sevVar, sei seiVar, dehq dehqVar, cpv cpvVar, rzp rzpVar) {
        this.i = qjkVar;
        this.c = dehqVar;
        this.d = cpvVar;
        int firstDayOfWeek = Calendar.getInstance(akr.a(application.getResources().getConfiguration()).d()).getFirstDayOfWeek();
        for (int i = 0; i < 7; i++) {
            List<saq> list = this.h;
            cqkn<saq> cqknVar = this.j;
            Application a = seiVar.a.a();
            sei.a(a, 1);
            sei.a(cqknVar, 3);
            list.add(new seh(a, 1 + (((firstDayOfWeek + i) - 1) % 7), cqknVar, i, false));
        }
        this.a = sevVar.a(application.getString(R.string.GET_TO_WORK_BY_TITLE), this.k, null, dtxl.cm, dtxl.cl);
        this.b = sevVar.a(application.getString(R.string.GO_HOME_AT_TITLE), this.k, this.f, dtxl.cu, dtxl.ct);
        this.g = sfdVar.a(R.string.COMMUTE_TIMES_HEADING, dtxl.dm, dtxl.dn, rzpVar);
        u();
        this.e = false;
    }

    @Override // defpackage.jbk
    public jib NC() {
        return this.g.e().b();
    }

    @Override // defpackage.sar
    public List<saq> i() {
        return this.h;
    }

    @Override // defpackage.sar
    public sas j() {
        return this.a;
    }

    @Override // defpackage.sar
    public sas k() {
        return this.b;
    }

    @Override // defpackage.sav
    public Boolean l() {
        return Boolean.valueOf(!this.g.c());
    }

    @Override // defpackage.sav
    public Boolean m() {
        return false;
    }

    @Override // defpackage.sav
    public Boolean n() {
        for (saq saqVar : this.h) {
            if (saqVar.e().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sav
    public cqkl o() {
        ArrayList arrayList = new ArrayList();
        dcen N = dcep.N();
        for (saq saqVar : this.h) {
            if (saqVar.e().booleanValue()) {
                N.b(Integer.valueOf(saqVar.a().i));
            }
        }
        dcep<Integer> f = N.f();
        arrayList.add(this.i.k(f));
        if (f.isEmpty()) {
            arrayList.add(this.i.m(dngu.e));
            arrayList.add(this.i.o(dngu.e));
        } else {
            eapi b = this.a.d().b();
            qjk qjkVar = this.i;
            dngt bZ = dngu.e.bZ();
            int c = b.c();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dngu dnguVar = (dngu) bZ.b;
            dnguVar.a |= 1;
            dnguVar.b = c;
            int d = b.d();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dngu dnguVar2 = (dngu) bZ.b;
            dnguVar2.a |= 2;
            dnguVar2.c = d;
            arrayList.add(qjkVar.m(bZ.bK()));
            eapi b2 = this.b.d().b();
            boolean h = sht.h(b, b2);
            qjk qjkVar2 = this.i;
            dngt bZ2 = dngu.e.bZ();
            int c2 = b2.c() + (true != h ? 0 : 24);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dngu dnguVar3 = (dngu) bZ2.b;
            dnguVar3.a |= 1;
            dnguVar3.b = c2;
            int d2 = b2.d();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dngu dnguVar4 = (dngu) bZ2.b;
            dnguVar4.a |= 2;
            dnguVar4.c = d2;
            arrayList.add(qjkVar2.o(bZ2.bK()));
        }
        degy l = deha.l(arrayList);
        final sfc sfcVar = this.g;
        sfcVar.getClass();
        final dehn<?> c3 = l.c(new Runnable(sfcVar) { // from class: sej
            private final sfc a;

            {
                this.a = sfcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f();
            }
        }, dege.a);
        c3.Pk(new Runnable(c3) { // from class: sek
            private final dehn a;

            {
                this.a = c3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                deha.s(this.a);
            }
        }, dege.a);
        sfc sfcVar2 = this.g;
        return sfcVar2.a(sfcVar2.b());
    }

    @Override // defpackage.sav
    public cjtd p() {
        return this.g.b;
    }

    @Override // defpackage.sav
    public cqkl q() {
        return this.g.d();
    }

    @Override // defpackage.sav
    public cjtd r() {
        return this.g.a;
    }

    @Override // defpackage.sav
    public Boolean s() {
        return sau.a();
    }

    @Override // defpackage.sav
    public rzp t() {
        return this.g.c;
    }

    public void u() {
        for (saq saqVar : this.h) {
            saqVar.d(this.i.j().contains(Integer.valueOf(saqVar.a().i)));
        }
        this.a.h(this.i.l());
        this.b.h(sht.i(this.i.n()));
        this.b.j(Boolean.valueOf(sht.h(this.a.d().b(), this.b.d().b())));
        cqkx.p(this);
    }

    public void v(eapi eapiVar, eapi eapiVar2) {
        boolean h = sht.h(eapiVar, eapiVar2);
        Boolean b = this.b.b();
        Boolean valueOf = Boolean.valueOf(h);
        if (!b.equals(valueOf)) {
            this.b.j(valueOf);
            cqkx.p(this.b);
        }
    }
}
