package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bdds  reason: default package */
/* loaded from: classes3.dex */
public class bdds implements bdaq {
    public final List<dwfa> a;
    public final bddr b;
    private final Activity c;
    private final cqkj d;

    public bdds(Activity activity, cqhn cqhnVar, cqkj cqkjVar, ccst ccstVar, bvrb bvrbVar, gfw gfwVar, dwfl dwflVar) {
        this.c = activity;
        this.d = cqkjVar;
        this.a = dchl.c(dcbg.b(dwflVar.r).o(bddm.a));
        this.b = new bddr(ccstVar, bvrbVar, gfwVar, dwflVar);
    }

    @Override // defpackage.bdaq
    public Boolean a() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // defpackage.bdaq
    public String b() {
        if (this.a.isEmpty()) {
            return "";
        }
        drah drahVar = this.a.get(0).b;
        if (drahVar == null) {
            drahVar = drah.c;
        }
        String a = anah.a(drahVar.b, 40);
        return a != null ? a : "";
    }

    @Override // defpackage.bdaq
    public cqkl c() {
        if (!this.a.isEmpty()) {
            final dwfa dwfaVar = this.a.get(0);
            iii iiiVar = new iii();
            iiiVar.a = this.c.getResources().getString(R.string.OFFERINGS_YOUR_CONTRIBUTIONS_DELETE_DIALOG_TITLE);
            iiiVar.b = this.c.getResources().getString(R.string.OFFERINGS_YOUR_CONTRIBUTIONS_DELETE_DIALOG_EXPLANATION);
            iiiVar.d(this.c.getResources().getString(R.string.OFFERINGS_YOUR_CONTRIBUTIONS_DELETE_DIALOG_POSITIVE_BUTTON), new View.OnClickListener(this, dwfaVar) { // from class: bddn
                private final bdds a;
                private final dwfa b;

                {
                    this.a = this;
                    this.b = dwfaVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bdds bddsVar = this.a;
                    final dwfa dwfaVar2 = this.b;
                    bddsVar.a.remove(dwfaVar2);
                    cqkx.p(bddsVar);
                    final bddr bddrVar = bddsVar.b;
                    deha.q(bddrVar.a.b(dcdc.f(dwfaVar2)), bvqj.b(new bvqg(bddrVar, dwfaVar2) { // from class: bddp
                        private final bddr a;
                        private final dwfa b;

                        {
                            this.a = bddrVar;
                            this.b = dwfaVar2;
                        }

                        @Override // defpackage.bvqg
                        public final void NU(Object obj) {
                            bddr bddrVar2 = this.a;
                            final dwfa dwfaVar3 = this.b;
                            dhuq dhuqVar = (dhuq) obj;
                            gfw gfwVar = bddrVar2.c;
                            dwfl dwflVar = bddrVar2.d;
                            gfwVar.Qn(bdgg.c(dwflVar.d, dcbg.b(dwflVar.r).o(new dbsl(dwfaVar3) { // from class: bddq
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
                    }), bddrVar.b.h());
                }
            }, cjtd.a(dtxx.F));
            iiiVar.c(this.c.getResources().getString(R.string.CANCEL_BUTTON), bddo.a, cjtd.a(dtxx.E));
            iiiVar.a(this.c, this.d).k();
        }
        return cqkl.a;
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bcwu(), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return cjtd.b;
    }
}
