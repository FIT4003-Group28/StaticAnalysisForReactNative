package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: betp  reason: default package */
/* loaded from: classes3.dex */
public class betp implements betd, bega {
    public final cclp a;
    public final beqq b;
    private final gga d;
    private final View.OnAttachStateChangeListener e;
    private final betm f;
    private final beqn g;
    private List<betc> h = new ArrayList();
    private cjtd i = cjtd.b;
    public dbsg<String> c = dbpy.a;

    public betp(gga ggaVar, huc hucVar, cclp cclpVar, bvpe bvpeVar, betm betmVar, beqq beqqVar, beqn beqnVar) {
        this.d = ggaVar;
        this.a = cclpVar;
        this.e = new bvob(bvpeVar.b, hucVar.a(new htz(this) { // from class: betn
            private final betp a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a.c();
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        }));
        this.f = betmVar;
        this.b = beqqVar;
        this.g = beqnVar;
    }

    @Override // defpackage.betd
    public String a() {
        return this.d.getString(R.string.DEALS_OFFER_MODULE_LABEL);
    }

    @Override // defpackage.betd
    public List<betc> b() {
        return this.h;
    }

    @Override // defpackage.betd
    public cjtd c() {
        return this.i;
    }

    @Override // defpackage.betd
    public View.OnAttachStateChangeListener d() {
        return this.e;
    }

    @Override // defpackage.betd
    public jht e() {
        jhm jhmVar = new jhm();
        jhmVar.a = this.d.getString(R.string.DEALS_SEND_FEEDBACK_LABEL);
        jhmVar.b = this.d.getString(R.string.DEALS_SEND_FEEDBACK_CONTENT_DESCRIPTION);
        jhmVar.d(new View.OnClickListener(this) { // from class: beto
            private final betp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                betp betpVar = this.a;
                beqq beqqVar = betpVar.b;
                List<ccln> b = betpVar.a.b(dgfb.DEAL);
                dbsg<String> dbsgVar = betpVar.c;
                ache a = beqqVar.a.a();
                achc achcVar = achc.DEALS_CAROUSEL;
                acgz b2 = achb.b();
                if (dbsgVar.a()) {
                    b2.c("place_fid", dbsgVar.b());
                }
                if (!b.isEmpty()) {
                    b2.c("deal_id_list", dbrz.e(",").g(dcbg.b(b).s(beqo.a).o(dbst.a(beqp.a))));
                }
                a.k(false, true, achcVar, b2.b());
            }
        });
        jhmVar.f = cjtd.a(dtxy.hZ);
        jho c = jhmVar.c();
        jhu h = jhv.h();
        h.d(c);
        h.c(cjtd.a(dtxy.hY));
        return h.b();
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            u();
            return;
        }
        this.c = dbsg.i(iloVar.ai().o());
        this.a.a(bwrsVar);
        this.h = new ArrayList();
        List<ccln> b = this.a.b(dgfb.DEAL);
        for (int i = 0; i < b.size(); i++) {
            this.h.add(this.f.a(b.get(i), bwrsVar, false, this.g, i));
        }
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.hX;
        this.i = c.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.h = new ArrayList();
        this.i = cjtd.b;
        this.a.a(bwrs.a(null));
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(!this.h.isEmpty());
    }
}
