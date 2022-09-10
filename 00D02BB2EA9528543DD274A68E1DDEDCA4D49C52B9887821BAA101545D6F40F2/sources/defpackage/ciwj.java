package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ciwj  reason: default package */
/* loaded from: classes4.dex */
public final class ciwj extends gec {
    public Activity ad;
    public cqkj ae;
    public ciwb af;
    public anhp ag;
    public axru ah;
    public ciwa al;
    public chxr ai = chxr.e;
    public String aj = "";
    public dwlh ak = dwlh.n;
    private dcep<chvd> am = dcmr.a;

    public static ciwj aP(chxr chxrVar, String str, dwlh dwlhVar, Iterable<chvd> iterable) {
        ciwj ciwjVar = new ciwj();
        Bundle bundle = new Bundle();
        aQ(bundle, chxrVar, str, dwlhVar, iterable);
        ciwjVar.B(bundle);
        return ciwjVar;
    }

    private static void aQ(Bundle bundle, chxr chxrVar, String str, dwlh dwlhVar, Iterable<chvd> iterable) {
        bvrs.l(bundle, chxrVar);
        bvrs.l(bundle, dwlhVar);
        bundle.putString("ved_key", str);
        bundle.putIntegerArrayList("supported_actions", new ArrayList<>(dcbg.b(iterable).s(ciwc.a).z()));
    }

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.ex, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        chxr chxrVar = (chxr) bvrs.e(bundle2, chxr.class, (dssr) chxr.e.cu(7));
        dbsk.s(chxrVar);
        this.ai = chxrVar;
        dwlh dwlhVar = (dwlh) bvrs.e(bundle2, dwlh.class, (dssr) dwlh.n.cu(7));
        dbsk.s(dwlhVar);
        this.ak = dwlhVar;
        this.am = dcbg.b(bundle2.getIntegerArrayList("supported_actions")).s(ciwd.a).B();
        this.aj = bundle2.getString("ved_key");
        Set p = this.ah.a("android.permission.ACCESS_FINE_LOCATION") ? this.am : dcnm.p(this.am, dcep.B(chvd.CHANGE_PLACE));
        ciwb ciwbVar = this.af;
        String str = this.aj;
        ciwi ciwiVar = new ciwi(this);
        cqhn a = ciwbVar.a.a();
        ciwb.a(a, 1);
        ciwb.a(p, 2);
        ciwb.a(str, 3);
        ciwb.a(ciwiVar, 4);
        ciwa ciwaVar = new ciwa(a, p, str, ciwiVar);
        this.al = ciwaVar;
        if (ciwaVar.a().booleanValue()) {
            final dwlh dwlhVar2 = this.ak;
            anhp anhpVar = this.ag;
            dwjc bZ = dwjd.i.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjd dwjdVar = (dwjd) bZ.b;
            int i = 2 | dwjdVar.a;
            dwjdVar.a = i;
            dwjdVar.b = 3;
            dwjdVar.a = i | 4;
            dwjdVar.c = 0;
            dwjd.c(dwjdVar);
            dwjd bK = bZ.bK();
            dniu dniuVar = dwlhVar2.b;
            if (dniuVar == null) {
                dniuVar = dniu.i;
            }
            dnoh dnohVar = dniuVar.g;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            anhpVar.a(bK, akqq.e(dnohVar), 8, new ccts(new bvqg(this, dwlhVar2) { // from class: ciwe
                private final ciwj a;
                private final dwlh b;

                {
                    this.a = this;
                    this.b = dwlhVar2;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    ciwj ciwjVar = this.a;
                    dwjf dwjfVar = (dwjf) obj;
                    dniu dniuVar2 = this.b.b;
                    if (dniuVar2 == null) {
                        dniuVar2 = dniu.i;
                    }
                    final String str2 = dniuVar2.b;
                    ciwjVar.al.k(dcbg.b(dwjfVar.b).o(new dbsl(str2) { // from class: ciwg
                        private final String a;

                        {
                            this.a = str2;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj2) {
                            String str3 = this.a;
                            dvyw dvywVar = ((dwjb) obj2).b;
                            if (dvywVar == null) {
                                dvywVar = dvyw.bv;
                            }
                            return !dvywVar.g.equals(str3);
                        }
                    }).x(2).z());
                }
            }, new bvqg(this) { // from class: ciwf
                private final ciwj a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    btzy btzyVar = (btzy) obj;
                    this.a.al.k(dcdc.e());
                }
            }));
        }
    }

    @Override // defpackage.czwf, defpackage.ry, defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        cqkf e = this.ae.e(new civt());
        e.e(this.al);
        View c = e.c();
        czwe czweVar = new czwe(J(), this.b);
        czweVar.setContentView(c);
        czweVar.setTitle(R.string.ACCESSIBILITY_OVERFLOW_MENU);
        return czweVar;
    }

    @Override // defpackage.ex, defpackage.fd
    public final void t(Bundle bundle) {
        aQ(bundle, this.ai, this.aj, this.ak, this.am);
        super.t(bundle);
    }
}
