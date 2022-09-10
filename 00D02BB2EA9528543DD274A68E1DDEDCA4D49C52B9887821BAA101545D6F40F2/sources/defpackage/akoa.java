package defpackage;

import android.app.Activity;
import android.text.format.DateUtils;
import com.google.android.apps.gmm.majorevents.api.MajorEvent;
import com.google.android.apps.maps.R;
import java.util.Formatter;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: akoa  reason: default package */
/* loaded from: classes2.dex */
public final class akoa {
    public static final String a(dpop dpopVar, MajorEvent majorEvent, cqat cqatVar, Activity activity) {
        long j = dpopVar.b;
        eaou b = b(majorEvent);
        long b2 = cqatVar.b();
        if (dpopVar.c <= dpopVar.b) {
            dsqp dsqpVar = (dsqp) dpopVar.cu(5);
            dsqpVar.bC(dpopVar);
            dpoo dpooVar = (dpoo) dsqpVar;
            long j2 = dpopVar.b;
            if (dpooVar.c) {
                dpooVar.bF();
                dpooVar.c = false;
            }
            dpop dpopVar2 = (dpop) dpooVar.b;
            dpopVar2.a |= 2;
            dpopVar2.c = j2;
            dpopVar = dpooVar.bK();
        }
        eapg p = new eaol(dpopVar.b, eaou.b).d(b).p();
        eapg p2 = new eaol(dpopVar.c, eaou.b).d(b).p();
        eapg p3 = new eaol(b2, eaou.b).d(b).p();
        if (p3.C(p) || p3.B(p2)) {
            return DateUtils.formatDateRange(activity, new Formatter(new StringBuilder()), j, j, 524304, b.d).toString();
        }
        return activity.getResources().getString(R.string.TODAY);
    }

    public static eaou b(MajorEvent majorEvent) {
        ditt dittVar = majorEvent.b.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        if ((dittVar.a & 128) == 0) {
            return eaou.i();
        }
        return eaou.j(majorEvent.e());
    }

    public static long c(dpnu dpnuVar, TimeZone timeZone) {
        dpoj dpojVar = dpnuVar.b;
        if (dpojVar == null) {
            dpojVar = dpoj.e;
        }
        int i = dpojVar.b;
        dpoj dpojVar2 = dpnuVar.b;
        if (dpojVar2 == null) {
            dpojVar2 = dpoj.e;
        }
        int i2 = dpojVar2.c;
        dpoj dpojVar3 = dpnuVar.b;
        if (dpojVar3 == null) {
            dpojVar3 = dpoj.e;
        }
        int i3 = dpojVar3.d;
        dqjj dqjjVar = dpnuVar.c;
        if (dqjjVar == null) {
            dqjjVar = dqjj.e;
        }
        int i4 = dqjjVar.b;
        dqjj dqjjVar2 = dpnuVar.c;
        if (dqjjVar2 == null) {
            dqjjVar2 = dqjj.e;
        }
        int i5 = dqjjVar2.c;
        dqjj dqjjVar3 = dpnuVar.c;
        if (dqjjVar3 == null) {
            dqjjVar3 = dqjj.e;
        }
        return new eaph(i, i2, i3, i4, i5, dqjjVar3.d).a(eaou.l(timeZone)).a;
    }

    public static final String d(String str, dpop dpopVar, Activity activity, boolean z) {
        if ((dpopVar.a & 1) != 0) {
            TimeZone timeZone = dbsj.d(str) ? TimeZone.getDefault() : TimeZone.getTimeZone(str);
            if ((dpopVar.a & 2) != 0) {
                return bvtb.n(activity, dpopVar.b / 1000, dpopVar.c / 1000, timeZone, z);
            }
            long j = dpopVar.b / 1000;
            return bvtb.n(activity, j, j, timeZone, z);
        }
        return "";
    }

    public static boolean e(dpop dpopVar, MajorEvent majorEvent) {
        long j = dpopVar.c;
        long j2 = dpopVar.b;
        return j > j2 && !new eaol(j2, eaou.b).d(b(majorEvent)).p().D(new eaol(dpopVar.c, eaou.b).d(b(majorEvent)).p());
    }
}
