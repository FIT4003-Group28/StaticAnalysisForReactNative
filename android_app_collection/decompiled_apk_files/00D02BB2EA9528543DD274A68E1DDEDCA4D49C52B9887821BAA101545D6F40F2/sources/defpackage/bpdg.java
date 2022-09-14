package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpdg  reason: default package */
/* loaded from: classes3.dex */
public class bpdg implements bpvv {
    private final boxd a;
    private dcdc<bpvu> b = dcdc.e();

    private bpdg(boxd boxdVar) {
        this.a = boxdVar;
    }

    public static bpdg a(Activity activity, cqhn cqhnVar, boxd boxdVar) {
        bpdg bpdgVar = new bpdg(boxdVar);
        dccx F = dcdc.F();
        F.g(new bpdf(bpdgVar, bpdgVar.a, activity, R.string.ROAD_CLOSED_REASON_CONSTRUCTION, boxc.CONSTRUCTION, cjtd.a(dtya.cS), dcdc.e()));
        F.g(new bpdf(bpdgVar, bpdgVar.a, activity, R.string.ROAD_CLOSED_REASON_CRASH, boxc.CRASH, cjtd.a(dtya.cT), dcdc.e()));
        F.g(new bpdf(bpdgVar, bpdgVar.a, activity, R.string.ROAD_CLOSED_REASON_EVENT, boxc.EVENT, cjtd.a(dtya.cU), dcdc.e()));
        boxd boxdVar2 = bpdgVar.a;
        boxc boxcVar = boxc.NATURE;
        cjtd a = cjtd.a(dtya.cV);
        dccx F2 = dcdc.F();
        F2.g(bpde.c(activity.getString(R.string.ROAD_CLOSED_REASON_NATURE_PLACEHOLDER), null));
        F2.g(bpde.c(activity.getString(R.string.ROAD_CLOSED_REASON_NATURE_FLOOD), "FLOOD"));
        F2.g(bpde.c(activity.getString(R.string.ROAD_CLOSED_REASON_NATURE_MUDSLIDE), "MUDSLIDE"));
        F2.g(bpde.c(activity.getString(R.string.ROAD_CLOSED_REASON_NATURE_SNOW_ICE), "SNOW_ICE"));
        F2.g(bpde.c(activity.getString(R.string.ROAD_CLOSED_REASON_NATURE_FALLEN_TREE), "FALLEN_TREE"));
        F2.g(bpde.c(activity.getString(R.string.ROAD_CLOSED_REASON_OTHER), "OTHER"));
        F.g(new bpdf(bpdgVar, boxdVar2, activity, R.string.ROAD_CLOSED_REASON_NATURE, boxcVar, a, F2.f()));
        F.g(new bpdf(bpdgVar, bpdgVar.a, activity, R.string.ROAD_CLOSED_REASON_NOT_SURE, boxc.NOT_SURE, cjtd.a(dtya.cW), dcdc.e()));
        bpdgVar.b = F.f();
        return bpdgVar;
    }

    private final Integer f(boxc boxcVar) {
        for (int i = 0; i < b().intValue(); i++) {
            if (boxcVar == this.b.get(i).h()) {
                return Integer.valueOf(i);
            }
        }
        return -1;
    }

    @Override // defpackage.bpvv
    public Integer b() {
        return Integer.valueOf(this.b.size());
    }

    @Override // defpackage.bpvv
    public bpvu c(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.bpvv
    @dzsi
    public bpvu d(boxc boxcVar) {
        dcdc<bpvu> dcdcVar = this.b;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            bpvu bpvuVar = dcdcVar.get(i);
            i++;
            if (bpvuVar.h().equals(boxcVar)) {
                return bpvuVar;
            }
        }
        return null;
    }

    @Override // defpackage.bpvv
    public void e(boxc boxcVar) {
        boxc boxcVar2 = this.a.a;
        int intValue = f(boxcVar).intValue();
        int intValue2 = f(boxcVar2).intValue();
        if (intValue < 0 || intValue >= b().intValue()) {
            return;
        }
        this.a.a = boxcVar;
        bpvu bpvuVar = this.b.get(intValue);
        this.a.b = bpvuVar.k();
        cqkx.p(this.b.get(intValue2));
        cqkx.p(bpvuVar);
    }
}
