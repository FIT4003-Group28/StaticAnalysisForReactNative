package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: tai  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tai implements Callable {
    public final /* synthetic */ axmv a;
    public final /* synthetic */ tdb b;
    public final /* synthetic */ ayoi c;
    private final /* synthetic */ int d;

    public /* synthetic */ tai(axmv axmvVar, tdb tdbVar, ayoi ayoiVar) {
        this.a = axmvVar;
        this.b = tdbVar;
        this.c = ayoiVar;
    }

    public /* synthetic */ tai(axmv axmvVar, tdb tdbVar, ayoi ayoiVar, int i) {
        this.d = i;
        this.a = axmvVar;
        this.b = tdbVar;
        this.c = ayoiVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        int i2;
        axnf axnfVar = null;
        if (this.d == 0) {
            axmv axmvVar = this.a;
            tdb tdbVar = this.b;
            ayoi ayoiVar = this.c;
            tet a = tet.a(axmvVar.aI());
            aodt aK = axmvVar.aK();
            if (aK != null) {
                aodt aodtVar = null;
                for (int i3 = 0; i3 < aK.W(); i3++) {
                    aodt az = aK.az(i3);
                    if (az != null) {
                        int T = az.T();
                        if (T == 188490103) {
                            axnfVar = axnf.aH(az.V());
                        } else if (T == 212323971) {
                            aodtVar = aodt.ay(az.V());
                        }
                    }
                }
                if (axnfVar != null || aodtVar != null) {
                    if (axnfVar == null || aodtVar == null || axnfVar.Q() == aodtVar.Q()) {
                        amum h = amup.h();
                        if (axnfVar != null) {
                            int Q = axnfVar.Q();
                            amum h2 = amup.h();
                            axng axngVar = new axng();
                            for (int i4 = 0; i4 < axnfVar.aG(); i4++) {
                                axnfVar.aI(axngVar, i4);
                                if (axngVar.X() != null) {
                                    h2.f(axngVar.X(), Integer.valueOf(axngVar.Q()));
                                }
                            }
                            h.h(h2.b());
                            i = Q;
                        } else {
                            i = 0;
                        }
                        if (aodtVar != null) {
                            i = aodtVar.Q();
                            h.h(amup.k("/environment", Integer.valueOf(aodtVar.P())));
                        }
                        int i5 = i;
                        amup b = h.b();
                        if (b.isEmpty()) {
                            return azpm.aI(a);
                        }
                        amvn<String> keySet = b.keySet();
                        ArrayList arrayList = new ArrayList(keySet.size());
                        for (String str : keySet) {
                            fcr fcrVar = new fcr(str, 11);
                            if (!"/environment".equals(str)) {
                                arrayList.add(tdbVar.a(str).V(fcrVar));
                            } else {
                                arrayList.add(ayoiVar.V(ona.g).V(fcrVar));
                            }
                        }
                        return ayoi.l(arrayList, tak.a).V(new taj(i5, b, a));
                    }
                    int Q2 = axnfVar.Q();
                    int Q3 = aodtVar.Q();
                    StringBuilder sb = new StringBuilder(108);
                    sb.append("ComponentType localEntitiesConfig.resultField=");
                    sb.append(Q2);
                    sb.append(", environmentEntitiesConfig.resultField=");
                    sb.append(Q3);
                    throw new ted(sb.toString());
                }
                return azpm.aI(a);
            }
            return azpm.aI(a);
        }
        axmv axmvVar2 = this.a;
        tdb tdbVar2 = this.b;
        ayoi ayoiVar2 = this.c;
        tet a2 = tet.a(axmvVar2.aI());
        aodt aK2 = axmvVar2.aK();
        if (aK2 != null) {
            aodt aodtVar2 = null;
            for (int i6 = 0; i6 < aK2.W(); i6++) {
                aodt az2 = aK2.az(i6);
                if (az2 != null) {
                    int T2 = az2.T();
                    if (T2 == 188490103) {
                        axnfVar = axnf.aH(az2.V());
                    } else if (T2 == 212323971) {
                        aodtVar2 = aodt.ay(az2.V());
                    }
                }
            }
            if (axnfVar != null || aodtVar2 != null) {
                if (axnfVar == null || aodtVar2 == null || axnfVar.Q() == aodtVar2.Q()) {
                    amum h3 = amup.h();
                    if (axnfVar != null) {
                        int Q4 = axnfVar.Q();
                        amum h4 = amup.h();
                        axng axngVar2 = new axng();
                        for (int i7 = 0; i7 < axnfVar.aG(); i7++) {
                            axnfVar.aI(axngVar2, i7);
                            if (axngVar2.X() != null) {
                                h4.f(axngVar2.X(), Integer.valueOf(axngVar2.Q()));
                            }
                        }
                        h3.h(h4.b());
                        i2 = Q4;
                    } else {
                        i2 = 0;
                    }
                    if (aodtVar2 != null) {
                        i2 = aodtVar2.Q();
                        h3.h(amup.k("/environment", Integer.valueOf(aodtVar2.P())));
                    }
                    return tck.d(tag.a(a2), i2, h3.b(), tdbVar2, ayoiVar2);
                }
                int Q5 = axnfVar.Q();
                int Q6 = aodtVar2.Q();
                StringBuilder sb2 = new StringBuilder(108);
                sb2.append("ComponentType localEntitiesConfig.resultField=");
                sb2.append(Q5);
                sb2.append(", environmentEntitiesConfig.resultField=");
                sb2.append(Q6);
                throw new ted(sb2.toString());
            }
            return azpm.aI(a2);
        }
        return azpm.aI(a2);
    }
}
