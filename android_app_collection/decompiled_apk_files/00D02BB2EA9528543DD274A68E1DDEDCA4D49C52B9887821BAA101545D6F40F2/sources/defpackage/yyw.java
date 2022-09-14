package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: yyw  reason: default package */
/* loaded from: classes7.dex */
public final class yyw {
    @dzsi
    public static doxp a(@dzsi dpie dpieVar) {
        return d(dpieVar, dqtz.NORMAL_FARE, null);
    }

    @dzsi
    public static doxp b(@dzsi dpie dpieVar, duov duovVar, List<dpgn> list) {
        if (!duovVar.f || !c(list)) {
            return a(dpieVar);
        }
        return d(dpieVar, dqtz.IC_FARE, dqtz.NORMAL_FARE);
    }

    public static boolean c(List<dpgn> list) {
        int n = dcft.n(list, yyu.a);
        int n2 = dcft.n(list, yyv.a);
        if (n2 == -1) {
            return true;
        }
        return n != -1 && n < n2;
    }

    @dzsi
    public static doxp d(@dzsi dpie dpieVar, dqtz dqtzVar, @dzsi dqtz dqtzVar2) {
        doxp doxpVar = null;
        if (dpieVar == null) {
            return null;
        }
        if ((dpieVar.a & 8388608) != 0) {
            dpid dpidVar = dpieVar.w;
            if (dpidVar == null) {
                dpidVar = dpid.h;
            }
            if ((dpidVar.a & 2) != 0) {
                dpgj dpgjVar = dpidVar.d;
                if (dpgjVar == null) {
                    dpgjVar = dpgj.b;
                }
                for (doxp doxpVar2 : dpgjVar.a) {
                    dquh dquhVar = doxpVar2.b;
                    if (dquhVar == null) {
                        dquhVar = dquh.c;
                    }
                    boolean z = false;
                    if (dquhVar != null && !dbsj.d(dquhVar.b)) {
                        z = true;
                    }
                    if (Boolean.valueOf(z).booleanValue()) {
                        dqtz b = dqtz.b(doxpVar2.c);
                        if (b == null) {
                            b = dqtz.UNKNOWN_FARE;
                        }
                        if (b == dqtzVar) {
                            return doxpVar2;
                        }
                        if (doxpVar == null) {
                            dqtz b2 = dqtz.b(doxpVar2.c);
                            if (b2 == null) {
                                b2 = dqtz.UNKNOWN_FARE;
                            }
                            if (b2 == dqtzVar2) {
                                doxpVar = doxpVar2;
                            }
                        }
                    }
                }
            }
        }
        return doxpVar;
    }
}
