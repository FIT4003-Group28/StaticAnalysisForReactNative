package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apgu  reason: default package */
/* loaded from: classes2.dex */
public class apgu implements apfy {
    public final gga a;
    private final apgt b;
    private final apgw c;
    private final apgg d;
    private final dbsg<ilo> e;
    private final aoxq f;
    private dbsg<aoxp> g;

    public apgu(gga ggaVar, apgh apghVar, apgx apgxVar, cqhn cqhnVar, aoxq aoxqVar, apgt apgtVar, dbsg<aoxp> dbsgVar, dbsg<ilo> dbsgVar2, boolean z, aoxr aoxrVar, boolean z2, dcdc<aoxp> dcdcVar) {
        this.a = ggaVar;
        this.b = apgtVar;
        this.f = aoxqVar;
        this.g = dbsgVar;
        this.e = dbsgVar2;
        Resources a = apgxVar.a.a();
        apgx.a(a, 1);
        apgx.a(this, 2);
        apgx.a(aoxrVar, 3);
        this.c = new apgw(a, this, aoxrVar, z2);
        cqhn a2 = apghVar.a.a();
        apgh.a(a2, 1);
        apge a3 = apghVar.b.a();
        apgh.a(a3, 2);
        apgh.a(apgtVar, 3);
        apgh.a(this, 4);
        apgh.a(dcdcVar, 5);
        this.d = new apgg(a2, a3, apgtVar, this, dcdcVar);
    }

    @Override // defpackage.jbk
    public jib NC() {
        String string;
        jhz a = jhz.a();
        a.q = ibm.b();
        if (this.e.a()) {
            string = this.e.b().n();
        } else if (this.g.a()) {
            string = this.f.b(this.g.b());
        } else {
            string = this.a.getResources().getString(R.string.MAPS_ACTIVITY_VISITED_PLACES_TITLE);
        }
        a.a = string;
        a.u = ibm.t();
        a.A = false;
        a.f(new View.OnClickListener(this) { // from class: apgs
            private final apgu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gn g = this.a.a.g();
                if (!g.J()) {
                    g.e();
                }
            }
        });
        a.g = ibm.o();
        a.d = ibm.b();
        a.x = false;
        return a.b();
    }

    @Override // defpackage.apfy
    public bskm b() {
        return this.c;
    }

    @Override // defpackage.apfy
    public bskr c() {
        return this.d;
    }

    @Override // defpackage.apfy
    public Boolean d() {
        return true;
    }

    public dbsg<aoxp> e() {
        return this.g;
    }

    public void f(dbsg<aoxp> dbsgVar) {
        this.g = dbsgVar;
        cqkx.p(this);
    }

    public cqkl g() {
        apdh apdhVar = ((apdg) this.b).a;
        apdhVar.aZ(apew.w(apdhVar.aR(), dcdc.g(aoxr.LAST_VISIT_TIME, aoxr.NUM_VISITS)));
        return cqkl.a;
    }
}
