package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anyk  reason: default package */
/* loaded from: classes2.dex */
public abstract class anyk implements anyi {
    public static anyk f(Application application, int i) {
        anyj i2 = i();
        i2.d(application.getResources().getQuantityString(R.plurals.NUMBER_OF_PLACES, i, Integer.valueOf(i)));
        i2.f(irg.k());
        i2.g(cqrt.g(2131232845, irg.k()));
        return i2.a();
    }

    public static anyk g(Application application, int i, dcdc<dqgf> dcdcVar) {
        anyj i2 = i();
        i2.d(aogw.c(application, i, dcdcVar));
        i2.f(irg.k());
        i2.g(cqrt.i(cqrt.f(2131231783), ibm.o()));
        return i2.a();
    }

    public static anyk h(duzq duzqVar, Application application, bvsl bvslVar, aofn aofnVar) {
        anyj i = i();
        int i2 = duzqVar.b;
        if (i2 > 0) {
            i.d(bvslVar.c(i2, null, true, true));
        }
        i.e(bvtb.e(application.getResources(), duzqVar.c, bvsz.ABBREVIATED).toString());
        dqjl b = dqjl.b(duzqVar.a);
        if (b == null) {
            b = dqjl.UNKNOWN_ACTIVITY_TYPE;
        }
        i.c(aofnVar.c(b));
        i.f(irg.k());
        i.g(cqrt.g(anpd.a(b), irg.k()));
        return i.a();
    }

    public static anyj i() {
        anta antaVar = new anta();
        antaVar.d("");
        antaVar.e("");
        antaVar.c("");
        return antaVar;
    }
}
