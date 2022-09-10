package defpackage;

import android.widget.Toast;
import com.google.android.apps.gmm.reportaproblem.webview.ReportAProblemWebViewCallbacks;
import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bpwv  reason: default package */
/* loaded from: classes4.dex */
public final class bpwv extends bvxb<dgmz, dgnb> {
    public final bvvw a;
    public final gga b;
    public final dxio<boxa> c;
    public final bovv d;
    private final bpxy e;

    public bpwv(gga ggaVar, bvvw bvvwVar, dxio<boxa> dxioVar, bovv bovvVar, bpxy bpxyVar) {
        this.e = bpxyVar;
        this.b = ggaVar;
        this.a = bvvwVar;
        this.c = dxioVar;
        this.d = bovvVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rmi.ep";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    @dzsi
    public final /* bridge */ /* synthetic */ dgnb e(dgmz dgmzVar) {
        final dgmz dgmzVar2 = dgmzVar;
        this.e.a(akqi.b(dgmzVar2.b), new bpxx(this, dgmzVar2) { // from class: bpwu
            private final bpwv a;
            private final dgmz b;

            {
                this.a = this;
                this.b = dgmzVar2;
            }

            @Override // defpackage.bpxx
            public final void a(ilo iloVar) {
                dbsg dbsgVar;
                bpwv bpwvVar = this.a;
                dgmz dgmzVar3 = this.b;
                dnqe dnqeVar = dgmzVar3.c;
                if (dnqeVar == null) {
                    dnqeVar = dnqe.i;
                }
                if (!dgmzVar3.d) {
                    if ((dgmzVar3.a & 8) != 0) {
                        int a = dobm.a(dgmzVar3.e);
                        if (a == 0) {
                            a = 1;
                        }
                        if (iloVar.cy() != null) {
                            dobr cy = iloVar.cy();
                            dbsk.s(cy);
                            Iterator<dobq> it = cy.e.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    dbsgVar = dbpy.a;
                                    break;
                                }
                                dobq next = it.next();
                                int a2 = dobm.a(next.f);
                                if (a2 == 0) {
                                    a2 = 1;
                                    continue;
                                }
                                if (a2 == a) {
                                    dbsgVar = dbsg.i(next);
                                    break;
                                }
                            }
                        } else {
                            dbsgVar = dbpy.a;
                        }
                        if (dbsgVar.a()) {
                            dobq dobqVar = (dobq) dbsgVar.b();
                            bowv bowvVar = new bowv(iloVar, dnqeVar);
                            ReportAProblemWebViewCallbacks reportAProblemWebViewCallbacks = new ReportAProblemWebViewCallbacks(bwrs.a(iloVar), bowvVar);
                            bvvr e = bvvs.e();
                            bovv bovvVar = bpwvVar.d;
                            String str = dobqVar.a == 1 ? (String) dobqVar.b : "";
                            dnqb b = dnqb.b(bowvVar.i().b);
                            if (b == null) {
                                b = dnqb.UNKNOWN_ENTRY_POINT;
                            }
                            e.b(bovvVar.b(str, "aGmm.RAP.NoPrefetch", b, bpwvVar.b.getString(R.string.PLACE_SUGGEST_AN_EDIT)));
                            bvvn bvvnVar = (bvvn) e;
                            bvvnVar.b = reportAProblemWebViewCallbacks;
                            bvvnVar.a = bovh.class;
                            bvvs a3 = e.a();
                            bvvw bvvwVar = bpwvVar.a;
                            dbsk.s(a3);
                            bvvwVar.r(a3, dtya.bI);
                            return;
                        }
                    }
                    Toast.makeText(bpwvVar.b, (int) R.string.UNSUPPORTED_ACTION_ON_FEATURE_ERROR, 0).show();
                    return;
                }
                bpwvVar.c.a().f(bwrs.a(iloVar), dnqeVar);
            }
        });
        return dgnb.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dgmz j(byte[] bArr) {
        return ((dgmy) dgmz.f.bZ().bx(bArr, dsqa.c())).bK();
    }
}
