package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.majorevents.api.MajorEvent;
import java.util.List;
/* compiled from: PG */
/* renamed from: akoj  reason: default package */
/* loaded from: classes2.dex */
class akoj implements akoe {
    private final String a;
    private final List<akod> b;
    private final List<akod> c;

    public akoj(Activity activity, MajorEvent majorEvent, diuu diuuVar, boolean z) {
        String d;
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        for (diut diutVar : diuuVar.d) {
            akog akogVar = new akog(activity, diutVar);
            int a = dpoc.a(diutVar.e);
            if (a == 0 || a != 2) {
                F2.g(akogVar);
            } else {
                F.g(akogVar);
            }
        }
        this.b = F.f();
        this.c = F2.f();
        if ((diuuVar.a & 2) != 0) {
            d = diuuVar.c;
        } else {
            String e = majorEvent.e();
            dpop dpopVar = diuuVar.b;
            d = akoa.d(e, dpopVar == null ? dpop.d : dpopVar, activity, z);
        }
        this.a = d;
    }

    @Override // defpackage.akoe
    public List<akod> a() {
        return this.b;
    }

    @Override // defpackage.akoe
    public List<akod> b() {
        return this.c;
    }

    @Override // defpackage.akoe
    public String c() {
        return this.a;
    }
}
