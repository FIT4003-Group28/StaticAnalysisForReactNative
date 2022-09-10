package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkhn  reason: default package */
/* loaded from: classes3.dex */
public class bkhn implements bnif, bega {
    boolean a;
    private final dxio<aesb> b;
    private final dxio<boxa> c;
    private final btvo d;
    private final Resources e;
    @dzsi
    private bwrs<ilo> f;

    public bkhn(Activity activity, btvo btvoVar, dxio<aesb> dxioVar, dxio<boxa> dxioVar2) {
        this.d = btvoVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.e = activity.getResources();
    }

    @Override // defpackage.bnif
    @Deprecated
    public Boolean a() {
        return w();
    }

    @Override // defpackage.jbf
    public cqtd d() {
        return cqrt.g(2131231613, ibm.x());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        ilo iloVar = (ilo) bwrs.b(this.f);
        if (iloVar == null) {
            return cqkl.a;
        }
        this.b.a().D(iloVar, 8, dtxy.lK);
        dnps bZ = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.PLACE_CARD;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnqe dnqeVar2 = (dnqe) bZ.b;
        dnqeVar2.c = 1;
        dnqeVar2.a |= 2;
        boxa a = this.c.a();
        bwrs<ilo> bwrsVar = this.f;
        dbsk.s(bwrsVar);
        a.B(bwrsVar, bZ.bK(), null);
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        bwrs<ilo> bwrsVar = this.f;
        if (bwrsVar == null) {
            return null;
        }
        ilo c = bwrsVar.c();
        dbsk.s(c);
        cjta c2 = cjtd.c(c.bZ());
        c2.d = dtxy.lM;
        return c2.a();
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return null;
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        ilo iloVar = (ilo) bwrs.b(this.f);
        String str = null;
        if (iloVar != null) {
            if (iloVar.be() == iln.GEOCODE) {
                dnnc dnncVar = iloVar.cd().i;
                if (dnncVar == null) {
                    dnncVar = dnnc.e;
                }
                if (dnncVar.b.size() > 0) {
                    dnnc dnncVar2 = iloVar.cd().i;
                    if (dnncVar2 == null) {
                        dnncVar2 = dnnc.e;
                    }
                    str = dnncVar2.b.get(0);
                }
            }
            if (dbsj.d(str)) {
                str = iloVar.n();
            }
        }
        if (!this.d.getUgcParameters().k() || iloVar == null || iloVar.ce() == doay.TYPE_ROAD) {
            if (!dbsj.d(str)) {
                return this.e.getString(R.string.REPORT_A_PROBLEM_SPECIFIC, str);
            }
            return this.e.getString(R.string.REPORT_A_PROBLEM);
        } else if (!dbsj.d(str)) {
            return this.e.getString(R.string.PLACE_SUGGEST_AN_EDIT_SPECIFIC, str);
        } else {
            return this.e.getString(R.string.PLACE_SUGGEST_AN_EDIT);
        }
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            u();
            return;
        }
        this.a = iloVar.aY();
        this.f = bwrsVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.f = null;
        this.a = false;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.a);
    }
}
