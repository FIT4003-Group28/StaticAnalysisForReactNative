package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: ceuo  reason: default package */
/* loaded from: classes4.dex */
public class ceuo {
    private static final dcqe e = dcqe.c("ceuo");
    public nvg a;
    @dzsi
    public nxk b;
    public cjyo c = new cjyp();
    public final apni d;
    private final Activity f;
    private final nxh g;

    public ceuo(Activity activity, dxio<nxh> dxioVar, dxio<apni> dxioVar2) {
        this.f = activity;
        this.g = dxioVar.a();
        this.d = dxioVar2.a();
    }

    public final boolean a() {
        List<cjyw> a = this.c.a();
        return a.size() == 1 && a.get(0).c().equals(dtic.VERTICAL_LIST);
    }

    public final void b(List<dulb> list, String str) {
        dtid dtidVar;
        if (this.a == null) {
            return;
        }
        for (dulb dulbVar : list) {
            nvg nvgVar = this.a;
            try {
                dtidVar = ((dthy) dtid.d.bZ().by(dulbVar.bS())).bK();
            } catch (dsrm e2) {
                bvoo.h("Cannot parse GMM CardProto as Odelay CardProto %s %s", dulbVar, e2);
                dtidVar = dtid.d;
            }
            nvgVar.p(dtidVar, str);
        }
        this.a.s();
    }

    public final void c() {
        nvg nvgVar = this.a;
        if (nvgVar == null) {
            return;
        }
        nvgVar.e();
        nxk nxkVar = this.b;
        if (nxkVar != null) {
            this.a.g = nxkVar;
        }
        this.a.s();
    }

    public final void d(Bundle bundle) {
        nvg nvgVar = this.a;
        if (nvgVar == null) {
            return;
        }
        nvgVar.b(bundle);
    }

    public final void e(Bundle bundle) {
        nvg nvgVar = this.a;
        if (nvgVar == null) {
            return;
        }
        nvgVar.c(bundle);
        this.a.s();
    }

    public final duls f() {
        List<dtik> a = this.g.a();
        boolean b = btpf.b(this.f);
        duli bZ = duls.g.bZ();
        dcdc<dtic> dcdcVar = oxb.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            bZ.a(dulk.b(dcdcVar.get(i).g));
        }
        dcdc<dtia> dcdcVar2 = oxb.a;
        int size2 = dcdcVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bZ.d(duly.b(dcdcVar2.get(i2).e));
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duls dulsVar = (duls) bZ.b;
        dulsVar.b = 2;
        dulsVar.a |= 1;
        for (dtik dtikVar : a) {
            duln bZ2 = dulo.c.bZ();
            for (dtig dtigVar : new dsrh(dtikVar.a, dtik.b)) {
                bZ2.a(dulm.b(dtigVar.r));
            }
            for (dtle dtleVar : new dsrh(dtikVar.c, dtik.d)) {
                bZ2.b(dulw.b(dtleVar.bk));
            }
            bZ.b(bZ2);
        }
        bZ.c(dulq.COMBINE_ACTIONS_WITH_PREVIOUS_ITEM);
        bZ.c(dulq.REMOVE_PRECEDING_DIVIDER_LINE);
        bZ.c(dulq.FIFE_IMAGE_URL);
        bZ.c(dulq.TEXT_HIGHLIGHT_STYLE_BOLD_ITALIC);
        bZ.c(dulq.PHOTO_VOTE_INFO);
        if (b) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duls.c((duls) bZ.b);
        }
        return bZ.bK();
    }
}
