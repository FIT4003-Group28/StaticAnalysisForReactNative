package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: adpy  reason: default package */
/* loaded from: classes2.dex */
public final class adpy extends cqiw<advj> {
    private static final cqtv a;
    private static final View.AccessibilityDelegate c;
    private final absg b;

    static {
        cqtv[] cqtvVarArr = new cqtv[3];
        cqtvVarArr[0] = adpu.e(e());
        cqtvVarArr[1] = cqrp.d(1.0d);
        agia f = f(dtxr.by);
        if (f.b()) {
            cqtv d = cqsg.d(cqsg.f(cqrp.f(14.0d), Float.valueOf(f.a() * 1.2f)), cqrp.d(16.0d), cqsg.k(cqrp.d(16.0d), cqrp.f(12.0d)));
            if (f.c()) {
                d = cqsg.k(d, cqrp.f(80.0d));
            }
            cqtvVarArr[2] = cqsg.d(d, cqrp.d(f.d()), cqrp.d(f.e()));
            a = cqsg.d(cqtvVarArr);
            c = new adrz();
            return;
        }
        throw new IllegalArgumentException("Unsupported options");
    }

    public adpy(absg absgVar) {
        super(absgVar);
        this.b = absgVar;
    }

    private static adpt e() {
        adps h = adpt.h();
        h.h(true);
        h.g(true);
        h.f(12);
        h.c(12);
        h.e(16);
        h.d(16);
        return h.a();
    }

    private static agia f(ddho ddhoVar) {
        agce agceVar = new agce();
        agceVar.b(3);
        agceVar.a(false);
        agceVar.g();
        agceVar.f(20);
        agceVar.c(20);
        agceVar.e(20);
        agceVar.d(20);
        agceVar.b(2);
        agceVar.g();
        agceVar.a(true);
        agceVar.f(16);
        agceVar.c(16);
        agceVar.e(16);
        agceVar.d(16);
        agceVar.h = ddhoVar;
        String str = agceVar.a == null ? " maxLinesInHeadline" : "";
        if (agceVar.b == null) {
            str = str.concat(" alwaysAllocateMaxLinesInHeadline");
        }
        if (agceVar.c == null) {
            str = String.valueOf(str).concat(" showCoverPhoto");
        }
        if (agceVar.d == null) {
            str = String.valueOf(str).concat(" paddingTopInDp");
        }
        if (agceVar.e == null) {
            str = String.valueOf(str).concat(" paddingBottomInDp");
        }
        if (agceVar.f == null) {
            str = String.valueOf(str).concat(" paddingStartInDp");
        }
        if (agceVar.g == null) {
            str = String.valueOf(str).concat(" paddingEndInDp");
        }
        if (agceVar.h == null) {
            str = String.valueOf(str).concat(" uiType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new agcf(agceVar.a.intValue(), agceVar.b.booleanValue(), agceVar.c.booleanValue(), agceVar.d.intValue(), agceVar.e.intValue(), agceVar.f.intValue(), agceVar.g.intValue(), agceVar.h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<advj> a() {
        cqmp[] cqmpVarArr = new cqmp[7];
        cqmpVarArr[0] = cqgr.bq(a);
        cqmpVarArr[1] = cqgr.cd(-1);
        cqmpVarArr[2] = cqgr.dr(1);
        cqmpVarArr[3] = iue.c(adpv.a);
        adpu adpuVar = new adpu(e());
        cqlc cqlcVar = adpw.a;
        View.AccessibilityDelegate accessibilityDelegate = c;
        cqmpVarArr[4] = cqgr.fP(adpuVar, cqlcVar, cqgr.aR(Integer.valueOf((int) R.id.homescreen_yourexplore_upper_snippet)), cqgr.a(accessibilityDelegate));
        cqmpVarArr[5] = ict.m(cqkz.a(true), cqgr.bR(cqrp.d(16.0d)), cqgr.bG(cqrp.d(16.0d)));
        cqmpVarArr[6] = cqgr.fP(new agib(f(this.b == absg.AREA_EXPLORE ? dtxj.de : dtxr.by)), adpx.a, cqgr.aR(Integer.valueOf((int) R.id.homescreen_yourexplore_lower_snippet)), cqgr.a(accessibilityDelegate));
        return cqgr.gd(cqmpVarArr);
    }
}
