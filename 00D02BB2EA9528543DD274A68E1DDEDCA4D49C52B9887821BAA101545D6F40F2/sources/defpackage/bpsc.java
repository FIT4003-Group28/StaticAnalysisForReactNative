package defpackage;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bpsc  reason: default package */
/* loaded from: classes4.dex */
public final class bpsc {
    public final String a = Locale.getDefault().getLanguage();
    public final btpc b;
    public final Executor c;
    public final List<String> d;
    public final dbsg<dqnp> e;
    public final buny f;

    public bpsc(digh dighVar, btpc btpcVar, Executor executor, buny bunyVar) {
        String language;
        this.b = btpcVar;
        this.c = executor;
        this.f = bunyVar;
        dbsk.a(!dbsj.d(language));
        if ((dighVar.a & 8) != 0) {
            dqno bZ = dqnp.d.bZ();
            dpum dpumVar = dighVar.e;
            dpumVar = dpumVar == null ? dpum.d : dpumVar;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dqnp dqnpVar = (dqnp) bZ.b;
            dpumVar.getClass();
            dqnpVar.b = dpumVar;
            dqnpVar.a |= 1;
            this.e = dbsg.i(bZ.bK());
        } else {
            this.e = dbpy.a;
        }
        drkx drkxVar = dighVar.j;
        List k = dchl.k((drkxVar == null ? drkx.b : drkxVar).a, bprz.a);
        if (k.isEmpty()) {
            this.d = dcdc.e();
        } else {
            this.d = k.subList(1, k.size());
        }
    }
}
