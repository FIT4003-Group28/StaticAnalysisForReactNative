package defpackage;

import com.google.android.apps.maps.R;
import java.io.PrintStream;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: atvs  reason: default package */
/* loaded from: classes2.dex */
public final class atvs {
    private static final dcqe a = dcqe.c("atvs");
    private static final dcdn<dpfe, Integer> b;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dpfe.DEFAULT_NONE, -1);
        dcdgVar.f(dpfe.DING_DAH, Integer.valueOf((int) R.raw.da_traffic_report_ding_dah));
        dcdgVar.f(dpfe.DING_DEE, Integer.valueOf((int) R.raw.da_traffic_report_ding_dee));
        dcdgVar.f(dpfe.DING_DONG, Integer.valueOf((int) R.raw.da_traffic_report_ding_dong));
        dcdgVar.f(dpfe.DRING_DRING, Integer.valueOf((int) R.raw.da_traffic_report_dring_dring));
        dcdgVar.f(dpfe.TAH_LAH_LAH, Integer.valueOf((int) R.raw.da_traffic_report_tah_lah_lah));
        dcdgVar.f(dpfe.TOO_LOO, Integer.valueOf((int) R.raw.da_traffic_report_too_loo));
        b = dcdgVar.b();
    }

    public static void a(dpfh dpfhVar, vtn vtnVar, atss<? extends crqw> atssVar) {
        if ((dpfhVar.a & 32) != 0) {
            dozz dozzVar = dpfhVar.h;
            if (dozzVar == null) {
                dozzVar = dozz.y;
            }
            douj doujVar = dozzVar.v;
            if (doujVar == null) {
                doujVar = douj.h;
            }
            dbsi<String, String> n = alca.n(doujVar);
            atssVar.H(yzw.a(n.a, n.b, vtnVar, new atvr(atssVar)));
        }
    }

    public static crfj b(dpfh dpfhVar, int i, crfe crfeVar) {
        return c(dpfhVar, i, null, crfeVar);
    }

    public static crfj c(dpfh dpfhVar, int i, @dzsi String str, crfe crfeVar) {
        if (dpfhVar.e.size() > 0) {
            dpfe b2 = dpfe.b(dpfhVar.d);
            if (b2 == null) {
                b2 = dpfe.DEFAULT_NONE;
            }
            return crfeVar.i(e(b2), dpfhVar.e, i, str);
        }
        bvoo.h("Unexpected TrafficReportPrompt without spoken text.", new Object[0]);
        return crfeVar.g("");
    }

    public static crfj d(dpfh dpfhVar, int i, crfe crfeVar) {
        PrintStream printStream = System.out;
        dpfe b2 = dpfe.b(dpfhVar.d);
        if (b2 == null) {
            b2 = dpfe.DEFAULT_NONE;
        }
        printStream.println(e(b2));
        dpfe b3 = dpfe.b(dpfhVar.d);
        if (b3 == null) {
            b3 = dpfe.DEFAULT_NONE;
        }
        return crfeVar.i(e(b3), Collections.emptyList(), i, null);
    }

    static int e(dpfe dpfeVar) {
        Integer num = b.get(dpfeVar);
        return num != null ? num.intValue() : R.raw.da_traffic_report_ding_dong;
    }
}
