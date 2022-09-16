package defpackage;

import android.app.ProgressDialog;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqy  reason: default package */
/* loaded from: classes5.dex */
public class cqy extends ivn {
    final /* synthetic */ cqz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqy(cqz cqzVar) {
        super(cqzVar.d.getString(cqzVar.c()), 1, null, cqzVar.d.getString(R.string.REPORT_MAP_ISSUE_SUBMIT), cjtd.a(dtxj.m), cjtd.a(dtxj.N), false, true, true, true);
        this.a = cqzVar;
    }

    private final void j() {
        cqz cqzVar = this.a;
        if (cqzVar.b == null) {
            cqzVar.b = new ProgressDialog(cqzVar.d, 0);
            cqz cqzVar2 = this.a;
            cqzVar2.b.setMessage(cqzVar2.d.getString(R.string.SENDING));
        }
        this.a.b.show();
    }

    private final void k() {
        byee a;
        ProgressDialog progressDialog = this.a.b;
        if (progressDialog == null || !progressDialog.isShowing()) {
            j();
        }
        cql cqlVar = this.a.e.ay;
        dbsk.s(cqlVar);
        cqz cqzVar = this.a;
        cqf cqfVar = cqzVar.c;
        if (cqfVar.k) {
            dndr dndrVar = dndr.NICKNAME;
            cqz cqzVar2 = this.a;
            cqzVar.h.a().ac(dndrVar, cqzVar2, cqzVar2, true, cqzVar2.c.a.c(), null, null, null, this.a.H(), null);
            return;
        }
        if (cqzVar.l.u().booleanValue()) {
            a = bonk.d(this.a.l.h(), "GMT");
        } else {
            a = bonk.a(this.a.l.g(), "GMT");
        }
        cqfVar.e = a;
        cqlVar.b();
    }

    @Override // defpackage.ivn
    public void a() {
        cqt cqtVar = this.a.e;
        if (!cqtVar.aD || cqtVar.J() == null) {
            return;
        }
        cqz cqzVar = this.a;
        cqzVar.m.b(cqzVar.A());
    }

    @Override // defpackage.ivn, defpackage.jbh
    public void b(cjqm cjqmVar) {
        boolean z;
        dehn<Boolean> a;
        cqkf<ctj> cqkfVar;
        cqt cqtVar = this.a.e;
        if (cqtVar.aD) {
            jmw.d(cqtVar.J(), null);
            cqz cqzVar = this.a;
            ff J = cqzVar.e.J();
            if (dbsj.e(cqzVar.i.i()).trim().isEmpty()) {
                cqzVar.i.x(true);
                cqzVar.i.y(J.getString(R.string.RAP_INVALID_NAME));
                cqkx.p(cqzVar.i);
                z = true;
            } else {
                z = false;
            }
            if (dbsj.e(cqzVar.j.i()).trim().isEmpty()) {
                cqzVar.j.r(true);
                cqzVar.j.s(J.getString(R.string.RAP_INVALID_ADDRESS));
                cqkx.p(cqzVar.j);
                z = true;
            }
            if (cqzVar.k.RF() == null) {
                cqzVar.k.d(true);
                cqzVar.k.e(J.getString(R.string.RAP_INVALID_CATEGORY));
                cqkx.p(cqzVar.k);
                z = true;
            }
            if (cqzVar.f.g() == null) {
                cqzVar.f.m(true);
                cqzVar.f.n(J.getString(R.string.RAP_INVALID_LOCATION));
                cqkx.p(cqzVar.f);
            } else if (!z) {
                cql cqlVar = this.a.e.ay;
                dbsk.s(cqlVar);
                if (!cqlVar.e.i()) {
                    cqz cqzVar2 = this.a;
                    jmw.g(cqzVar2.d, cqzVar2.c(), R.string.ADD_A_PLACE_NOT_AVAILABLE_OFFLINE);
                    return;
                } else if (this.a.j.C()) {
                    cqz cqzVar3 = this.a;
                    cqt cqtVar2 = cqzVar3.e;
                    akqq g = cqzVar3.f.g();
                    if (!cqtVar2.aD || (cqkfVar = cqtVar2.aC) == null) {
                        a = deha.a(false);
                    } else {
                        cqhu cqhuVar = cqtVar2.au;
                        jcd jcdVar = (jcd) cqkx.e(cqkfVar.c(), bopw.f, jcd.class);
                        if (jcdVar == null) {
                            bvoo.h("Attempted to verify address with no address widget present!", new Object[0]);
                            a = deha.b(new RuntimeException("Attempted to verify address with no address widget present!"));
                        } else {
                            cpmk cpmkVar = jcdVar.b;
                            if (g != null) {
                                cpmkVar.e(g.n());
                            }
                            cqf cqfVar = cqtVar2.aB;
                            if (cqfVar != null) {
                                cqfVar.b.c = cpmkVar.a.toString();
                            }
                            a = jcdVar.b.b();
                        }
                    }
                    j();
                    deha.q(a, new cqx(this), this.a.g.h());
                    return;
                } else {
                    k();
                    return;
                }
            }
            cqz cqzVar4 = this.a;
            jmw.g(cqzVar4.d, cqzVar4.c(), R.string.ADD_A_PLACE_MISSING_REQUIRED_FIELDS);
        }
    }

    public final void c(boolean z) {
        if (z) {
            k();
            return;
        }
        ProgressDialog progressDialog = this.a.b;
        if (progressDialog == null) {
            return;
        }
        progressDialog.dismiss();
    }
}
