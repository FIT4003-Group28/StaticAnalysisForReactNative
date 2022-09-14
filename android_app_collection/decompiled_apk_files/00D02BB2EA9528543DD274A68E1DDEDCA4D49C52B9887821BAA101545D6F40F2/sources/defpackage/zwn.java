package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: zwn  reason: default package */
/* loaded from: classes7.dex */
public final class zwn extends cpvi<zwg, zwh> {
    public static final cpvf<zwh> a = new cpvf<>("traffic_trend_bar_chart_view.domain");
    public static final cpvf<List<zwn>> b = new cpvf<>("traffic_trend_bar_chart_view.overlapping_series");
    public static final cpvj<zwn> c = new cpvj<>("traffic_trend_bar_chart_view.original_series_attribute");
    public zwf d;

    private zwn(String str, List<zwg> list) {
        super(str, list);
        this.d = zwf.HISTORICAL_ONLY;
    }

    public static List<zwn> a(Context context, dpfx dpfxVar) {
        ArrayList f = dchl.f(dpfxVar.e.size());
        for (dpfp dpfpVar : dpfxVar.e) {
            HashMap hashMap = new HashMap();
            for (dpfn dpfnVar : dpfpVar.a) {
                hashMap.put(dpfnVar.a, dpfnVar);
            }
            int size = dpfxVar.c.size();
            ArrayList f2 = dchl.f(size);
            for (int i = 0; i < size; i++) {
                dpfu dpfuVar = dpfxVar.c.get(i);
                if (i == size - 1 && !hashMap.containsKey(dpfuVar.d)) {
                    break;
                }
                f2.add(new zwg(new zwh(dpfuVar), (dpfn) hashMap.get(dpfuVar.d)));
            }
            int i2 = dpfpVar.bC;
            if (i2 == 0) {
                i2 = dsst.a.b(dpfpVar).c(dpfpVar);
                dpfpVar.bC = i2;
            }
            zwn zwnVar = new zwn(String.valueOf(i2), f2);
            cpvj<zwn> cpvjVar = c;
            cpvv cpvvVar = zwnVar.h;
            cpwl.h(cpvjVar, "key");
            cpvvVar.a.put(cpvjVar, zwnVar);
            zwnVar.i(a, new zwi());
            zwnVar.i(cpvf.a, new zwj());
            zwnVar.i(cpvf.e, new zwk(context));
            zwnVar.i(cpph.b, new zwl());
            zwnVar.i(b, new zwm(new ArrayList(f)));
            f.add(zwnVar);
        }
        return f;
    }
}
