package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
/* compiled from: PG */
/* renamed from: bcy  reason: default package */
/* loaded from: classes3.dex */
public final class bcy {
    static {
        bbz.f("Schedulers");
    }

    public static void a(bbj bbjVar, WorkDatabase workDatabase, List<bcx> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        bgi t = workDatabase.t();
        workDatabase.F();
        try {
            List<bgh> k = t.k(bbj.a());
            List<bgh> p = t.p();
            if (k != null && k.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (bgh bghVar : k) {
                    t.r(bghVar.a, currentTimeMillis);
                }
            }
            workDatabase.l();
            if (k != null && k.size() > 0) {
                bgh[] bghVarArr = (bgh[]) k.toArray(new bgh[k.size()]);
                for (bcx bcxVar : list) {
                    if (bcxVar.d()) {
                        bcxVar.b(bghVarArr);
                    }
                }
            }
            if (p == null || p.size() <= 0) {
                return;
            }
            bgh[] bghVarArr2 = (bgh[]) p.toArray(new bgh[p.size()]);
            for (bcx bcxVar2 : list) {
                if (!bcxVar2.d()) {
                    bcxVar2.b(bghVarArr2);
                }
            }
        } finally {
            workDatabase.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bcx b(Context context, bdn bdnVar) {
        bcx bcxVar;
        if (Build.VERSION.SDK_INT < 23) {
            try {
                bcxVar = (bcx) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
                bbz.e().a(new Throwable[0]);
            } catch (Throwable th) {
                bbz.e().a(th);
                bcxVar = null;
            }
            bcx bcxVar2 = bcxVar;
            if (bcxVar2 != null) {
                return bcxVar2;
            }
            beg begVar = new beg(context);
            bhe.a(context, SystemAlarmService.class, true);
            bbz.e().a(new Throwable[0]);
            return begVar;
        }
        bei beiVar = new bei(context, bdnVar);
        bhe.a(context, SystemJobService.class, true);
        bbz.e().a(new Throwable[0]);
        return beiVar;
    }
}
