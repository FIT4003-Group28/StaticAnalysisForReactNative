package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ebu  reason: default package */
/* loaded from: classes6.dex */
public class ebu extends ges {
    public eby a;
    public efg b;
    public cqkj c;

    @Override // defpackage.ges
    public final void Nv() {
        ((ebv) btsx.b(ebv.class, this)).c(this);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf c = this.c.c(new eac(), viewGroup);
        eby ebyVar = this.a;
        dkfv dkfvVar = (dkfv) bvrs.b(this.o.getByteArray("arg_key_badge"), (dssr) dkfv.f.cu(7));
        dbsk.s(dkfvVar);
        gga a = ebyVar.a.a();
        eby.a(a, 1);
        eco a2 = ebyVar.b.a();
        eby.a(a2, 2);
        eci a3 = ebyVar.c.a();
        eby.a(a3, 3);
        ecq a4 = ebyVar.d.a();
        eby.a(a4, 4);
        eby.a(dkfvVar, 5);
        eby.a(this, 6);
        ebx ebxVar = new ebx(a, a2, a3, a4, dkfvVar, this);
        if (Build.VERSION.SDK_INT < 23) {
            ebxVar.f(true);
        } else {
            View a5 = cqhu.a(c.c(), eac.a);
            if (a5 != null) {
                a5.setOnScrollChangeListener(new ebt(ebxVar));
            }
        }
        View a6 = cqhu.a(c.c(), eac.b);
        if (a6 instanceof ebi) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, ebxVar.a().h().floatValue()).setDuration(1500L);
            duration.setInterpolator(irf.b);
            duration.addUpdateListener(new ebs((ebi) a6));
            duration.start();
        }
        c.e(ebxVar);
        return c.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxk.b;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.b;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.w(this.P);
        egjVar.e(this);
        efgVar.a(egjVar.a());
    }
}
