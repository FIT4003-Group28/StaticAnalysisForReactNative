package defpackage;

import android.app.Activity;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adko  reason: default package */
/* loaded from: classes.dex */
public final class adko extends adae<adle> {
    public static final /* synthetic */ int b = 0;
    private final adlg c;

    public adko(final acyr acyrVar, adlh adlhVar, absg absgVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adkn
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adko.b;
                dktp dktpVar = acyrVar2.a().t;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        dxio a = ((dxjh) adlhVar.a).a();
        adlh.a(a, 1);
        Activity activity = (Activity) ((dxjd) adlhVar.b).a;
        adlh.a(activity, 2);
        cqhn a2 = adlhVar.c.a();
        adlh.a(a2, 3);
        adlh.a(absgVar, 4);
        this.c = new adlg(a, activity, a2, absgVar);
    }

    private final void q(awwb awwbVar, boolean z) {
        dvjj dvjjVar = (dvjj) awwbVar.a(awvv.s).f();
        if (z || dvjjVar != null || !awwbVar.c(awvv.s).b()) {
            adlg adlgVar = this.c;
            int size = dvjjVar != null ? dvjjVar.d.size() : 0;
            String str = null;
            if (size < 2) {
                adlgVar.b = null;
                adlgVar.d = adld.NONE;
                adlgVar.e = dcdc.e();
            } else {
                dbsk.s(dvjjVar);
                if (size == 2) {
                    adlgVar.d = adld.TWO_CARDS;
                } else {
                    adld[] adldVarArr = {adld.TWO_CARDS, adld.THREE_CARDS_LEFT_SPLIT, adld.THREE_CARDS_RIGHT_SPLIT};
                    int i = dvjjVar.bC;
                    if (i == 0) {
                        i = dsst.a.b(dvjjVar).c(dvjjVar);
                        dvjjVar.bC = i;
                    }
                    adlgVar.d = adldVarArr[Math.abs(i) % 3];
                }
                dccx F = dcdc.F();
                for (dkei dkeiVar : dvjjVar.d) {
                    dkeh dkehVar = dkeiVar.c;
                    if (dkehVar == null) {
                        dkehVar = dkeh.e;
                    }
                    dwfl dwflVar = dkehVar.c;
                    if (dwflVar == null) {
                        dwflVar = dwfl.w;
                    }
                    F.g(new jic(dwflVar.h, new ckqn(jfv.b(dwflVar)), 0));
                }
                adlgVar.e = F.f();
                if ((dvjjVar.a & 1) != 0) {
                    str = dvjjVar.b;
                }
                adlgVar.b = str;
            }
            cqkx.p(adlgVar);
        }
    }

    private final void r(awwb awwbVar, boolean z) {
        dvha dvhaVar = (dvha) awwbVar.a(awvv.a).f();
        if (z || dvhaVar != null || !awwbVar.c(awvv.a).b()) {
            adlg adlgVar = this.c;
            String str = null;
            if (dvhaVar != null && (dvhaVar.a & 4) != 0) {
                str = dvhaVar.d;
            }
            adlgVar.c = str;
            cqkx.p(adlgVar);
        }
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        q(awwbVar, true);
        r(awwbVar, true);
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        q(awwbVar, false);
        r(awwbVar, false);
    }

    @Override // defpackage.adae
    public final List<cqix<adle>> k(List<cqix<?>> list) {
        if (this.c.l()) {
            return dcdc.f(cqgr.fT(new adlc(), this.c));
        }
        return dcdc.e();
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcep.C(awvv.s, awvv.a);
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}
