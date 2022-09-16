package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: sgt  reason: default package */
/* loaded from: classes7.dex */
public class sgt {
    private final Context a;
    private final qjk b;
    private final sii c;

    public sgt(Application application, qjk qjkVar, sii siiVar) {
        this.a = application;
        this.b = qjkVar;
        this.c = siiVar;
    }

    private static void c(final sfc sfcVar, final dehn<?> dehnVar) {
        dehnVar.Pk(new Runnable(dehnVar, sfcVar) { // from class: sgs
            private final dehn a;
            private final sfc b;

            {
                this.a = dehnVar;
                this.b = sfcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dehn dehnVar2 = this.a;
                sfc sfcVar2 = this.b;
                deha.s(dehnVar2);
                sfcVar2.f();
            }
        }, dege.a);
    }

    public final void a(int i, sfc sfcVar, dnlg dnlgVar, dcdc<amub> dcdcVar) {
        dehn<?> q;
        dnld dnldVar;
        if (i - 1 != 0) {
            q = this.b.t(dnlgVar);
        } else {
            q = this.b.q(dnlgVar);
        }
        dbsk.s(q);
        c(sfcVar, q);
        if (!dcdcVar.isEmpty()) {
            String e = amug.e(dcdcVar, this.a.getString(R.string.TRANSIT_ROUTE_STEP_SEPARATOR));
            sii siiVar = this.c;
            if (dnlgVar.a == 3) {
                dnldVar = (dnld) dnlgVar.b;
            } else {
                dnldVar = dnld.e;
            }
            siiVar.a(i, dnldVar.c, e);
        }
    }

    public final void b(int i, sfc sfcVar) {
        dehn<?> r;
        if (i - 1 != 0) {
            r = this.b.u();
        } else {
            r = this.b.r();
        }
        dbsk.s(r);
        c(sfcVar, r);
    }
}
