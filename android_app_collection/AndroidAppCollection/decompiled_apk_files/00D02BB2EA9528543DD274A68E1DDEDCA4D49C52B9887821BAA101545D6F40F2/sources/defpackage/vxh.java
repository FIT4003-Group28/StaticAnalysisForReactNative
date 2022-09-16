package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: vxh  reason: default package */
/* loaded from: classes7.dex */
public final class vxh {
    private final btvo a;

    public vxh(btvo btvoVar) {
        this.a = btvoVar;
    }

    public static boolean b(long j, doyp doypVar) {
        dgaw dgawVar = doypVar.b;
        if (dgawVar == null) {
            dgawVar = dgaw.g;
        }
        return dgawVar.b > j;
    }

    private static List<doyp> d(List<doyp> list, long j) {
        dccx F = dcdc.F();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        for (doyp doypVar : list) {
            if (e(doypVar) && b(seconds, doypVar)) {
                F.g(doypVar);
            }
        }
        return F.f();
    }

    private static boolean e(doyp doypVar) {
        if (doypVar.d) {
            dpbw b = dpbw.b(doypVar.c);
            if (b == null) {
                b = dpbw.UNKNOWN;
            }
            return b != dpbw.UNKNOWN;
        }
        return true;
    }

    final dwoa a() {
        dwoa dwoaVar = this.a.getTransitTrackingParameters().o;
        return dwoaVar == null ? dwoa.c : dwoaVar;
    }

    public final List<doyp> c(List<doyp> list, int i, long j, int i2) {
        dpbw dpbwVar = dpbw.UNKNOWN;
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 == 1) {
                list = d(list, j);
            } else if (i3 == 2) {
                List<doyp> d = d(list, j);
                dccx dccxVar = new dccx();
                Iterator<doyp> it = d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        doyp next = it.next();
                        dpbw b = dpbw.b(next.c);
                        if (b == null) {
                            b = dpbw.UNKNOWN;
                        }
                        int ordinal = b.ordinal();
                        if (ordinal == 0) {
                            list = dccxVar.f();
                            break;
                        } else if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4) {
                            dccxVar.g(next);
                        }
                    } else {
                        list = dccxVar.f();
                        break;
                    }
                }
            } else if (i3 == 4) {
                dccx F = dcdc.F();
                long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
                dccx F2 = dcdc.F();
                for (doyp doypVar : list) {
                    if (e(doypVar)) {
                        F2.g(doypVar);
                    }
                }
                dcdc f = F2.f();
                for (int i4 = 0; i4 < f.size(); i4++) {
                    doyp doypVar2 = (doyp) f.get(i4);
                    if (!b(seconds, doypVar2)) {
                        dgaw dgawVar = doypVar2.b;
                        if (dgawVar == null) {
                            dgawVar = dgaw.g;
                        }
                        if (dgawVar.b >= seconds - a().a) {
                            int i5 = i4 + 1;
                            if (i5 != f.size()) {
                                dgaw dgawVar2 = ((doyp) f.get(i5)).b;
                                if (dgawVar2 == null) {
                                    dgawVar2 = dgaw.g;
                                }
                                if (dgawVar2.b <= a().b + seconds) {
                                }
                            }
                            F.g(doypVar2);
                        }
                    } else {
                        F.g(doypVar2);
                    }
                }
                list = F.f();
            } else {
                list = dcdc.e();
            }
        }
        return list.subList(0, Math.min(i2, list.size()));
    }
}
