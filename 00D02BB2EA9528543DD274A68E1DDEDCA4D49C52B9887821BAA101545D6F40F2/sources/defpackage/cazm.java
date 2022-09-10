package defpackage;

import android.app.Activity;
import android.text.format.DateUtils;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: cazm  reason: default package */
/* loaded from: classes4.dex */
public class cazm implements cbqo {
    private final dqhp a;
    private final Activity b;
    private final cbqt c;
    private final Runnable d;

    public cazm(Runnable runnable, cbqt cbqtVar, dqhp dqhpVar, Activity activity, cqhn cqhnVar) {
        this.b = activity;
        this.d = runnable;
        this.c = cbqtVar;
        this.a = dqhpVar;
    }

    @Override // defpackage.cbqo
    public cqkl a() {
        dpsd a = this.c.a();
        if (a == null) {
            a = dpsd.f;
        }
        dsrj<dqhp> dsrjVar = a.e;
        int i = 0;
        while (true) {
            if (i >= dsrjVar.size()) {
                break;
            } else if (dsrjVar.get(i).equals(this.a)) {
                dsqp dsqpVar = (dsqp) a.cu(5);
                dsqpVar.bC(a);
                dpsc dpscVar = (dpsc) dsqpVar;
                if (dpscVar.c) {
                    dpscVar.bF();
                    dpscVar.c = false;
                }
                dpsd dpsdVar = (dpsd) dpscVar.b;
                dpsdVar.d();
                dpsdVar.e.remove(i);
                a = dpscVar.bK();
            } else {
                i++;
            }
        }
        this.c.d(a);
        cqkx.p(this.c);
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.cbqo
    public CharSequence b() {
        Activity activity = this.b;
        dpnu dpnuVar = this.a.b;
        if (dpnuVar == null) {
            dpnuVar = dpnu.d;
        }
        return DateUtils.formatDateTime(activity, akoa.c(dpnuVar, TimeZone.getDefault()), 65558);
    }

    @Override // defpackage.cbqo
    public CharSequence c() {
        String id = TimeZone.getDefault().getID();
        dqhp dqhpVar = this.a;
        Activity activity = this.b;
        if ((dqhpVar.a & 1) != 0) {
            TimeZone timeZone = dbsj.d(id) ? TimeZone.getDefault() : TimeZone.getTimeZone(id);
            dpnu dpnuVar = dqhpVar.b;
            if (dpnuVar == null) {
                dpnuVar = dpnu.d;
            }
            long c = akoa.c(dpnuVar, timeZone);
            if ((dqhpVar.a & 2) == 0) {
                long j = c / 1000;
                return bvtb.n(activity, j, j, timeZone, false);
            }
            dpnu dpnuVar2 = dqhpVar.c;
            if (dpnuVar2 == null) {
                dpnuVar2 = dpnu.d;
            }
            return bvtb.n(activity, c / 1000, akoa.c(dpnuVar2, timeZone) / 1000, timeZone, false);
        }
        return "";
    }
}
