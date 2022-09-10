package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bmuv  reason: default package */
/* loaded from: classes3.dex */
public final class bmuv {
    static final eaow a = eaow.e(1);
    public static final /* synthetic */ int i = 0;
    public final Activity b;
    public final bmuj c;
    public final Executor d;
    public ilo e = new ily().d();
    public boolean f = false;
    public boolean g = false;
    public final dbrn<eapd, eapg> h = new dbrn(this) { // from class: bmuq
        private final bmuv a;

        {
            this.a = this;
        }

        @Override // defpackage.dbrn
        public final Object a(Object obj) {
            return bmdv.g(((eapd) obj).a, this.a.e.aT());
        }
    };

    public bmuv(Activity activity, bmuj bmujVar, Executor executor) {
        this.b = activity;
        this.c = bmujVar;
        this.d = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdc<bmtj> a(eapg eapgVar, eapr eaprVar, dcdc<bmtj> dcdcVar, bmuo bmuoVar, bmdv bmdvVar) {
        if (dcdcVar.isEmpty() || !eapgVar.equals(dcdcVar.get(0).a())) {
            bmti h = bmtj.h();
            h.c(eapgVar);
            h.g(bmuoVar.a(eapgVar, eapgVar));
            h.h(bmuo.c(eapgVar, eapgVar));
            h.d(bmuoVar.b(eapgVar, eapgVar));
            h.b(bmdvVar.e(((eapd) eaprVar).a, eapgVar, false));
            h.f(true);
            bmtj a2 = h.a();
            dccx F = dcdc.F();
            F.g(a2);
            F.i(dcdcVar);
            return F.f();
        }
        return dcdcVar;
    }
}
