package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: asqh  reason: default package */
/* loaded from: classes2.dex */
public final class asqh extends cqiw<asus> {
    public static final cqtv a = cqrp.d(12.0d);
    public static final cqtv b = cqrp.d(8.0d);
    public static final cqtv c = cqrp.d(8.0d);
    public static final cqtv d = cqrp.d(2.0d);
    private static final cqfd f = new asqb();
    private static final cqfd g = new asqc();
    private static final cqjb<asus, Integer> h = aspr.a;
    private final Boolean e;

    public asqh(Boolean bool) {
        this.e = bool;
    }

    public static Integer e(Context context) {
        int NR;
        int NR2;
        int i = context.getResources().getConfiguration().orientation;
        if (cjxh.a(context, 361)) {
            if (i == 2) {
                NR2 = b.NR(context);
            } else {
                NR2 = a.NR(context);
            }
            return Integer.valueOf(NR2);
        }
        if (i == 2) {
            NR = d.NR(context);
        } else {
            NR = c.NR(context);
        }
        return Integer.valueOf(NR);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<asus> a() {
        cqjb<asus, Integer> cqjbVar = h;
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqjv.l(aspo.a, cqgr.fG(f), cqgr.fG(g)), cqgr.dr(1), cqgr.fY(cqic.f(aspt.a, new cqmp[0]), cqgr.bE(cqjbVar), cqgr.fP(new asnj(), aspu.a, new cqmp[0])), cqgr.fY(cqic.f(aspv.a, new cqmp[0]), cqgr.bE(cqjbVar), cqgr.fY(cqgr.fP(new assv(), aspw.a, new cqmp[0]))), cqgr.gs(cqic.f(cqkz.a(this.e), new cqmp[0]), cqgr.bq(cqrp.d(dcyn.a)), cqgr.ce(cqrp.d(dcyn.a)), new asqe()), cqgr.fY(cqgr.aI(aspx.a), cqgr.cd(-1), cqgr.bq(cjxh.d), cqgr.bE(cqjbVar)), cqgr.fY(cqic.f(aspy.a, new cqmp[0]), cqgr.bE(cqjbVar), cqgr.fP(new asrc(), aspz.a, cqgr.bw(8388613))), cqgr.fY(cqic.f(asqa.a, new cqmp[0]), cqjv.l(aspp.a, cqgr.bE(cqjbVar), cqgr.bD(cqrp.d(dcyn.a))), cqgr.fP(new asqg(), aspq.a, new cqmp[0])), cqgr.gs(cqgr.bw(8388613), cqgr.ce(cqrp.d(dcyn.a)), cqjv.o(cqhg.a, cqgr.bq(cqrt.d(R.dimen.navigation_header_with_grippy_height_port)), cqgr.bq(cqrp.d(dcyn.a)))), cqjv.o(asps.a, cqgr.aW(4), cqgr.aW(0)));
    }
}
