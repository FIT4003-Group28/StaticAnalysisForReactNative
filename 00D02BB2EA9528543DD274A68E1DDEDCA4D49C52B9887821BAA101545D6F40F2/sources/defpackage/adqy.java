package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: adqy  reason: default package */
/* loaded from: classes2.dex */
public final class adqy extends cqiw<advn> {
    private static final View.AccessibilityDelegate a = new adrz();
    private final boolean b;

    public adqy(boolean z) {
        super(Boolean.valueOf(z));
        this.b = z;
    }

    private static adpt e(boolean z) {
        adps h = adpt.h();
        h.h(true);
        h.g(z);
        h.f(12);
        h.c(12);
        h.e(16);
        h.d(16);
        return h.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<advn> a() {
        cqtv[] cqtvVarArr = {adpu.e(e(this.b)), cqrp.d(1.0d), adqx.a};
        adqx adqxVar = new adqx();
        cqlc cqlcVar = adqa.a;
        View.AccessibilityDelegate accessibilityDelegate = a;
        return cqgr.gd(cqgr.bq(cqsg.d(cqtvVarArr)), cqgr.cd(-1), cqgr.dr(1), iue.c(adpz.a), cqgr.fP(adqxVar, cqlcVar, cqgr.aR(Integer.valueOf((int) R.id.homescreen_yourexplore_upper_snippet)), cqgr.a(accessibilityDelegate)), ict.n(true, cqgr.bR(cqrp.d(16.0d)), cqgr.bG(cqrp.d(16.0d))), cqgr.fP(new adpu(e(this.b)), adqb.a, cqgr.aR(Integer.valueOf((int) R.id.homescreen_yourexplore_lower_snippet)), cqgr.a(accessibilityDelegate)));
    }
}
