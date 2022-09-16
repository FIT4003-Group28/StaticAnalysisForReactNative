package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.EnumSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: ybn  reason: default package */
/* loaded from: classes7.dex */
public final class ybn implements xzk {
    public static final /* synthetic */ int a = 0;
    private static final dcdc<ybm> b = dcdc.t(ybm.values());
    private final dcdc<xzj> c;
    @dzsi
    private final String d;
    private final dpge e;
    private final boolean f;

    public ybn(Resources resources, dpgf dpgfVar) {
        String string;
        dour dourVar;
        dcdc<xzj> f;
        dpge b2 = dpge.b(dpgfVar.a);
        int ordinal = (b2 == null ? dpge.UNKNOWN_RECOMMENDATION_REASON : b2).ordinal();
        if (ordinal != 1) {
            string = ordinal != 2 ? null : resources.getString(R.string.RECOMMENDED_TRAIN_CAR_SUGGESTION_FOR_FASTEST_TRANSFER_MESSAGE);
        } else {
            string = resources.getString(R.string.RECOMMENDED_TRAIN_CAR_SUGGESTION_FOR_FASTEST_EXIT_MESSAGE);
        }
        this.d = string;
        if (string != null) {
            dccx dccxVar = new dccx();
            dcep B = dcbg.b(dpgfVar.b).o(ybk.a).s(ybl.a).B();
            if (B.size() == 1) {
                dourVar = (dour) B.iterator().next();
            } else {
                dourVar = dour.UNKNOWN_DIRECTION_OF_MOTION;
            }
            if (!e(dpgfVar)) {
                for (dpgc dpgcVar : dpgfVar.b) {
                    dccxVar.g(new ybj(resources, dpgcVar, dourVar));
                }
            } else {
                dsrj<dpgc> dsrjVar = dpgfVar.b;
                dpgc dpgcVar2 = dsrjVar.get(0);
                for (dpgc dpgcVar3 : dsrjVar) {
                    if (dpgcVar3.b > dpgcVar2.b) {
                        dpgcVar2 = dpgcVar3;
                    }
                }
                EnumSet noneOf = EnumSet.noneOf(ybm.class);
                for (dpfz dpfzVar : dpgcVar2.a) {
                    int i = dpfzVar.b;
                    dcdc<ybm> dcdcVar = b;
                    noneOf.add(dcdcVar.get(Math.min(((i - 1) * dcdcVar.size()) / dpgcVar2.b, dcdcVar.size() - 1)));
                }
                dccx F = dcdc.F();
                dcdc<ybm> dcdcVar2 = b;
                int size = dcdcVar2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ybm ybmVar = dcdcVar2.get(i2);
                    boolean contains = noneOf.contains(ybmVar);
                    F.g(zws.e(contains, ybmVar.equals(ybm.FRONT), contains ? resources.getString(ybmVar.d) : null, null));
                }
                dccxVar.g(new ybj((String) null, F.f(), dourVar));
            }
            f = dccxVar.f();
        } else {
            f = dcdc.e();
        }
        this.c = f;
        this.f = e(dpgfVar);
        dpge b3 = dpge.b(dpgfVar.a);
        this.e = b3 == null ? dpge.UNKNOWN_RECOMMENDATION_REASON : b3;
    }

    private static boolean e(dpgf dpgfVar) {
        return dpgfVar.b.size() > 2;
    }

    @Override // defpackage.xzk
    public List<xzj> a() {
        return this.c;
    }

    @Override // defpackage.xzk
    @dzsi
    public String b() {
        return this.d;
    }

    @Override // defpackage.xzk
    public Boolean c() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.xzk
    public dpge d() {
        return this.e;
    }
}
