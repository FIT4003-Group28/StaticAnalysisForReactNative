package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: vxw  reason: default package */
/* loaded from: classes7.dex */
public class vxw {
    private final cqat a;

    public vxw(cqat cqatVar) {
        this.a = cqatVar;
    }

    @dzsi
    public final bvsv a(List<doyp> list, Context context) {
        return b(vyb.a(list), context);
    }

    @dzsi
    public final bvsv b(List<vwt> list, Context context) {
        bvsu c;
        bvsu c2;
        eapd eapdVar = null;
        if (list.isEmpty()) {
            return null;
        }
        vwu vwuVar = new vwu(context, this.a);
        if (list.size() == 1) {
            return vwuVar.a(list.get(0));
        }
        vwt vwtVar = list.get(0);
        vwt vwtVar2 = list.get(1);
        eaol a = vxs.a(vwtVar.a());
        eaol a2 = vxs.a(vwtVar2.a());
        String str = "";
        String a3 = a != null ? zbc.a(vwuVar.b, a) : str;
        if (a2 != null) {
            str = zbc.a(vwuVar.b, a2);
        }
        eaow f = vwuVar.f(a != null ? a.Ti() : null);
        if (a2 != null) {
            eapdVar = a2.Ti();
        }
        eaow f2 = vwuVar.f(eapdVar);
        if (a != null && a2 != null && !a3.equals(str) && (f == null || f2 == null || !f.equals(f2))) {
            dpbw d = vxj.d(vwtVar);
            dpbw d2 = vxj.d(vwtVar2);
            boolean z = f != null && vwu.g(f).q(vwu.a);
            boolean z2 = f2 != null && vwu.g(f2).q(vwu.a);
            eapd eapdVar2 = new eapd(vwuVar.d.b());
            boolean x = a.x(eapdVar2);
            boolean x2 = a2.x(eapdVar2);
            if (z && z2) {
                return vwuVar.c(d);
            }
            if (z2) {
                c2 = new bvsx(vwuVar.c).c(R.string.TRANSIT_UPCOMING_DEPARTURES_ABSOLUTE_AND_NOW);
                c2.a(vwuVar.b(d, a3), vwuVar.b(d2, vwuVar.e()));
            } else if (z) {
                if (f2 == null) {
                    c2 = new bvsx(vwuVar.c).c(R.string.TRANSIT_UPCOMING_DEPARTURES_NOW_AND_ABSOLUTE);
                    c2.a(vwuVar.b(d, vwuVar.e()), vwuVar.b(d2, str));
                } else {
                    c = new bvsx(vwuVar.c).c(R.string.TRANSIT_UPCOMING_DEPARTURES_FORMATTED_NOW_AND_RELATIVE);
                    c.a(vwuVar.b(d, vwuVar.e()), vwuVar.d(d2, f2));
                    return c;
                }
            } else if (x) {
                if (!x2 && f2 != null) {
                    c = new bvsx(vwuVar.c).c(R.string.TRANSIT_UPCOMING_DEPARTURES_ABSOLUTE_AND_RELATIVE);
                    c.a(vwuVar.b(d, a3), vwuVar.d(d2, f2));
                    return c;
                }
                c2 = new bvsx(vwuVar.c).c(R.string.TRANSIT_UPCOMING_TWO_ABSOLUTE_DEPARTURES);
                c2.a(vwuVar.b(d, a3), vwuVar.b(d2, str));
            } else {
                if (f != null) {
                    if (f2 == null) {
                        c2 = new bvsx(vwuVar.c).c(R.string.TRANSIT_UPCOMING_DEPARTURES_RELATIVE_AND_ABSOLUTE);
                        c2.a(vwuVar.d(d, f), vwuVar.b(d2, str));
                    } else {
                        c = new bvsx(vwuVar.c).c(R.string.TRANSIT_UPCOMING_TWO_DEPARTURES_RELATIVE);
                        c.a(vwuVar.d(d, f), vwuVar.d(d2, f2));
                        return c;
                    }
                }
                c2 = new bvsx(vwuVar.c).c(R.string.TRANSIT_UPCOMING_TWO_ABSOLUTE_DEPARTURES);
                c2.a(vwuVar.b(d, a3), vwuVar.b(d2, str));
            }
            return c2;
        }
        return vwuVar.a(vwtVar);
    }

    public final bvsv c(doyp doypVar, Context context) {
        return new vwu(context, this.a).a(vwt.d(doypVar));
    }
}
