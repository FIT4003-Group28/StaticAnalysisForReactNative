package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bdbw  reason: default package */
/* loaded from: classes3.dex */
public class bdbw implements bdab {
    public final List<dwfa> a;
    private final Context b;
    private final bcrq c;
    private final cafi d;
    private final begg e;
    private final dxio<afha> f;
    private final dwfl g;
    private final jic h;
    private final cjtd i;
    private final bbty j;
    private final cjxe k;
    private final String l;
    private final btvo m;
    private final bdch n;
    @dzsi
    private final ilo o;
    @dzsi
    private appj p;

    public bdbw(gga ggaVar, cqhn cqhnVar, cafi cafiVar, begg beggVar, dxio<afha> dxioVar, btvo btvoVar, bcrq bcrqVar, bdch bdchVar, dwfl dwflVar, @dzsi ilo iloVar, bbty bbtyVar, cjxe cjxeVar, String str) {
        this.b = ggaVar;
        this.c = bcrqVar;
        this.n = bdchVar;
        this.d = cafiVar;
        this.e = beggVar;
        this.f = dxioVar;
        this.m = btvoVar;
        this.g = dwflVar;
        this.o = iloVar;
        this.j = bbtyVar;
        this.k = cjxeVar;
        this.l = str;
        this.a = dchl.c(dcbg.b(dwflVar.r).o(bdbu.a));
        dwfh dwfhVar = dwflVar.k;
        dnpq dnpqVar = (dwfhVar == null ? dwfh.d : dwfhVar).c;
        this.h = new jic((dnpqVar == null ? dnpq.g : dnpqVar).e, jfv.b(dwflVar), null, 0, WebImageView.b);
        cjta b = cjtd.b();
        b.d = dtxy.cp;
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        this.i = b.a();
    }

    @Override // defpackage.bdab
    public cqkl A() {
        ily ilyVar = new ily();
        dpsn dpsnVar = this.g.t;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        long j = dpsnVar.b;
        dpsn dpsnVar2 = this.g.t;
        if (dpsnVar2 == null) {
            dpsnVar2 = dpsn.d;
        }
        ilyVar.j(new akqi(j, dpsnVar2.c));
        begj begjVar = new begj();
        begjVar.b(ilyVar.d());
        begjVar.K = true;
        this.e.o(begjVar, false, null);
        return cqkl.a;
    }

    @Override // defpackage.bdab
    public Boolean B() {
        boolean z = false;
        if (this.m.getUgcOfferingsParameters().i() && this.j.b() && !this.a.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdab
    public cqkl C() {
        if (!this.a.isEmpty()) {
            bcrq bcrqVar = this.c;
            final dwfl dwflVar = this.g;
            final dwfa dwfaVar = this.a.get(0);
            final Runnable runnable = new Runnable(this) { // from class: bdbv
                private final bdbw a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bdbw bdbwVar = this.a;
                    List<dwfa> list = bdbwVar.a;
                    list.remove(list.get(0));
                    cqkx.p(bdbwVar);
                }
            };
            iii iiiVar = new iii();
            final bcqr bcqrVar = (bcqr) bcrqVar;
            iiiVar.a = bcqrVar.e.getResources().getString(R.string.OFFERINGS_YOUR_CONTRIBUTIONS_DELETE_DIALOG_TITLE);
            iiiVar.b = bcqrVar.e.getResources().getString(R.string.OFFERINGS_YOUR_CONTRIBUTIONS_DELETE_DIALOG_EXPLANATION);
            iiiVar.d(bcqrVar.e.getResources().getString(R.string.OFFERINGS_YOUR_CONTRIBUTIONS_DELETE_DIALOG_POSITIVE_BUTTON), new View.OnClickListener(bcqrVar, runnable, dwfaVar, dwflVar) { // from class: bcqn
                private final bcqr a;
                private final Runnable b;
                private final dwfa c;
                private final dwfl d;

                {
                    this.a = bcqrVar;
                    this.b = runnable;
                    this.c = dwfaVar;
                    this.d = dwflVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final bcqr bcqrVar2 = this.a;
                    Runnable runnable2 = this.b;
                    final dwfa dwfaVar2 = this.c;
                    final dwfl dwflVar2 = this.d;
                    runnable2.run();
                    deha.q(bcqrVar2.h.b(dcdc.f(dwfaVar2)), bvqj.b(new bvqg(bcqrVar2, dwflVar2, dwfaVar2) { // from class: bcqp
                        private final bcqr a;
                        private final dwfl b;
                        private final dwfa c;

                        {
                            this.a = bcqrVar2;
                            this.b = dwflVar2;
                            this.c = dwfaVar2;
                        }

                        @Override // defpackage.bvqg
                        public final void NU(Object obj) {
                            bcqr bcqrVar3 = this.a;
                            dwfl dwflVar3 = this.b;
                            final dwfa dwfaVar3 = this.c;
                            dhuq dhuqVar = (dhuq) obj;
                            bcqrVar3.b.Qn(bdgg.c(dwflVar3.d, dcbg.b(dwflVar3.r).o(new dbsl(dwfaVar3) { // from class: bcqq
                                private final dwfa a;

                                {
                                    this.a = dwfaVar3;
                                }

                                @Override // defpackage.dbsl
                                public final boolean a(Object obj2) {
                                    dwfa dwfaVar4 = this.a;
                                    drah drahVar = ((dwfa) obj2).b;
                                    if (drahVar == null) {
                                        drahVar = drah.c;
                                    }
                                    String str = drahVar.a;
                                    drah drahVar2 = dwfaVar4.b;
                                    if (drahVar2 == null) {
                                        drahVar2 = drah.c;
                                    }
                                    return !dbsd.a(str, drahVar2.a);
                                }
                            }).z()));
                        }
                    }), bcqrVar2.i.h());
                }
            }, cjtd.a(dtxx.F));
            iiiVar.c(bcqrVar.e.getResources().getString(R.string.CANCEL_BUTTON), bcqo.a, cjtd.a(dtxx.E));
            iiiVar.a(bcqrVar.e, bcqrVar.g).k();
        }
        return cqkl.a;
    }

    @Override // defpackage.bdab
    @dzsi
    public String D() {
        if (this.a.isEmpty()) {
            return null;
        }
        drah drahVar = this.a.get(0).b;
        if (drahVar == null) {
            drahVar = drah.c;
        }
        return anah.a(drahVar.b, 40);
    }

    @Override // defpackage.bdab
    @dzsi
    public bdad E() {
        return this.n.a(this.j.r(), this.g, this.o);
    }

    public void F(@dzsi appj appjVar) {
        this.p = appjVar;
    }

    @Override // defpackage.bdab
    public cqkl a() {
        if (!w().booleanValue()) {
            return cqkl.a;
        }
        dwfh dwfhVar = this.g.k;
        if (dwfhVar == null) {
            dwfhVar = dwfh.d;
        }
        dnpq dnpqVar = dwfhVar.c;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        String str = dnpqVar.c;
        Runnable b = bmek.b(this.b, this.d, this.f, str);
        if (b != null) {
            b.run();
        } else {
            this.f.a().k(this.b, str, 1);
        }
        return cqkl.a;
    }

    @Override // defpackage.bdab
    public cqkl b() {
        ((bcqr) this.c).d.c(Uri.parse(this.g.h));
        return cqkl.a;
    }

    @Override // defpackage.bdab
    public String c() {
        dwfh dwfhVar = this.g.k;
        if (dwfhVar == null) {
            dwfhVar = dwfh.d;
        }
        if ((dwfhVar.a & 2) == 0) {
            dwfh dwfhVar2 = this.g.k;
            if (dwfhVar2 == null) {
                dwfhVar2 = dwfh.d;
            }
            return dwfhVar2.b;
        }
        dwfh dwfhVar3 = this.g.k;
        if (dwfhVar3 == null) {
            dwfhVar3 = dwfh.d;
        }
        dnpq dnpqVar = dwfhVar3.c;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return dnpqVar.d;
    }

    @Override // defpackage.bdab
    public Boolean d() {
        return Boolean.valueOf(this.k.e);
    }

    @Override // defpackage.bdab
    public Boolean e() {
        return Boolean.valueOf(!dbsj.d(c()));
    }

    @Override // defpackage.bdab
    public Boolean f() {
        dwfh dwfhVar = this.g.k;
        if (dwfhVar == null) {
            dwfhVar = dwfh.d;
        }
        dnpq dnpqVar = dwfhVar.c;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        boolean z = true;
        if (!Boolean.valueOf(!dbsj.d(dnpqVar.e)).booleanValue() || !e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdab
    public jic g() {
        return this.h;
    }

    @Override // defpackage.bdab
    public Boolean h() {
        dizh dizhVar = this.g.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dghk dghkVar = dizhVar.c;
        if (dghkVar == null) {
            dghkVar = dghk.g;
        }
        dggc b = dggc.b(dghkVar.b);
        if (b == null) {
            b = dggc.UNKNOWN;
        }
        boolean z = false;
        if (!b.equals(dggc.VIDEO) && this.j.k()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdab
    public String i() {
        return this.b.getResources().getString(R.string.UNIFIED_PHOTO_UPLOAD_FLOW_CAPTION_MODE_EDIT_PHOTO);
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bctq(), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return this.i;
    }

    @Override // defpackage.bdab
    public Boolean l() {
        return Boolean.valueOf(this.j.k());
    }

    @Override // defpackage.bdab
    public Boolean m() {
        return Boolean.valueOf(this.j.l());
    }

    @Override // defpackage.bdab
    public cqtd n() {
        return cqrt.f(2131231687);
    }

    @Override // defpackage.bdab
    public String o() {
        dizh dizhVar = this.g.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        diyt diytVar = dizhVar.e;
        if (diytVar == null) {
            diytVar = diyt.c;
        }
        if (diytVar.b.size() == 0) {
            return "";
        }
        dizh dizhVar2 = this.g.p;
        if (dizhVar2 == null) {
            dizhVar2 = dizh.j;
        }
        diyt diytVar2 = dizhVar2.e;
        if (diytVar2 == null) {
            diytVar2 = diyt.c;
        }
        return diytVar2.b.get(0).d;
    }

    @Override // defpackage.bdab
    public String p() {
        return (!this.g.g.isEmpty() || !r().booleanValue()) ? this.g.g : this.l;
    }

    @Override // defpackage.bdab
    public Boolean q() {
        boolean z = true;
        if (dbsj.d(p()) && !r().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdab
    public Boolean r() {
        return Boolean.valueOf(this.j.a().a());
    }

    @Override // defpackage.bdab
    public cqkl s() {
        bcrq bcrqVar = this.c;
        ((bcqr) bcrqVar).b.aZ(bcaz.a(this.j.a().b(), this.g, this.l));
        return cqkl.a;
    }

    @Override // defpackage.bdab
    public Boolean t() {
        return Boolean.valueOf(!dbsj.d(u()));
    }

    @Override // defpackage.bdab
    public String u() {
        dizh dizhVar = this.g.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dizp dizpVar = dizhVar.h;
        if (dizpVar == null) {
            dizpVar = dizp.c;
        }
        if ((dizpVar.a & 1) != 0) {
            int i = (int) dizpVar.b;
            return this.b.getResources().getQuantityString(R.plurals.PROFILE_ACTIVITY_NUMBER_OF_PHOTO_VIEWS, i, Integer.valueOf(i));
        }
        return "";
    }

    @Override // defpackage.bdab
    public String v() {
        String c = c();
        String o = o();
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 1 + String.valueOf(o).length());
        sb.append(c);
        sb.append(" ");
        sb.append(o);
        return sb.toString();
    }

    @Override // defpackage.bdab
    public Boolean w() {
        dwfh dwfhVar = this.g.k;
        if (dwfhVar == null) {
            dwfhVar = dwfh.d;
        }
        dnpq dnpqVar = dwfhVar.c;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return Boolean.valueOf(!dbsj.d(dnpqVar.c));
    }

    @Override // defpackage.bdab
    @dzsi
    public appj x() {
        return this.p;
    }

    @Override // defpackage.bdab
    public Boolean y() {
        return Boolean.valueOf(this.j.s());
    }

    @Override // defpackage.bdab
    public String z() {
        dizh dizhVar = this.g.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dlwk dlwkVar = dizhVar.d;
        if (dlwkVar == null) {
            dlwkVar = dlwk.g;
        }
        String str = dlwkVar.f;
        return str.isEmpty() ? this.b.getString(R.string.VIEW_PLACE_LINK_TITLE) : str;
    }
}
