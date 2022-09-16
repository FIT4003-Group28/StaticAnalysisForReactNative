package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.libraries.notifications.scheduled.impl.workmanager.ChimeScheduledTaskWorker;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ujn  reason: default package */
/* loaded from: classes4.dex */
public final class ujn implements ujk {
    public final Context a;
    private final ujl b;

    public ujn(Context context, ujl ujlVar) {
        this.a = context;
        this.b = ujlVar;
    }

    private final void f(ucp ucpVar, int i, ujj ujjVar, Bundle bundle, long j) {
        byte[] marshall;
        bqk g;
        HashMap hashMap = new HashMap();
        bpd.d("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER", ujjVar.f(), hashMap);
        Long l = null;
        if (bundle.isEmpty()) {
            marshall = null;
        } else {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            marshall = obtain.marshall();
            obtain.recycle();
        }
        if (marshall != null) {
            bpd.c("notifications.scheduled.impl.workmanager.extraskey", marshall, hashMap);
        }
        bpt bptVar = new bpt();
        ujjVar.i();
        bptVar.c = 2;
        bpu a = bptVar.a();
        if (ucpVar != null) {
            l = ucpVar.a;
        }
        String e = e(l, i);
        if (ujjVar.g()) {
            bpx a2 = bpd.a(hashMap);
            bql bqlVar = new bql(ChimeScheduledTaskWorker.class, ujjVar.d(), TimeUnit.MILLISECONDS);
            bqlVar.f(a2);
            bqlVar.d(a);
            ujjVar.h();
            g = brq.h(this.a).f(e, 1, bqlVar.b());
        } else {
            bpx a3 = bpd.a(hashMap);
            bqg bqgVar = new bqg(ChimeScheduledTaskWorker.class);
            bqgVar.f(a3);
            bqgVar.d(a);
            if (j != 0) {
                bqgVar.e(j, TimeUnit.MILLISECONDS);
            }
            ujjVar.h();
            g = brq.h(this.a).g(e, 1, bqgVar.b());
        }
        anlz.A(((bqw) g).c, new ujm(this, ucpVar, i), anjk.a);
    }

    @Override // defpackage.ujk
    public final void a(ucp ucpVar, int i, ujj ujjVar, Bundle bundle) {
        f(ucpVar, i, ujjVar, bundle, 0L);
    }

    @Override // defpackage.ujk
    public final void b(ucp ucpVar, int i, ujj ujjVar, Bundle bundle, long j) {
        aqxo.t(j > 0, "Scheduled job minimumLatencyMs must be > 0, got: %s.", j);
        f(ucpVar, i, ujjVar, bundle, j);
    }

    @Override // defpackage.ujk
    public final boolean d() {
        brq h = brq.h(this.a);
        bvo bvoVar = new bvo(h, e(null, 7));
        h.j.a.execute(bvoVar);
        try {
            List list = (List) bvoVar.c.get();
            return list != null && !list.isEmpty();
        } catch (InterruptedException | ExecutionException e) {
            uev.c("ChimeTaskSchedulerApiImpl", e, "Failed to check pending WorkInfos.", new Object[0]);
            return false;
        }
    }

    public final String e(Long l, int i) {
        long j;
        ujl ujlVar = this.b;
        if (l != null) {
            j = l.longValue();
            boolean z = false;
            aqxo.t(j >= 0, "accountId must be >= 0, got: %s.", j);
            if (j <= 998) {
                z = true;
            }
            aqxo.t(z, "accountId must be <= 998, got: %s.", j);
        } else {
            j = 999;
        }
        aqxo.s(true, "jobType must be >= 0, got: %s.", i);
        aqxo.s(true, "jobType must be <= 999, got: %s.", i);
        return Integer.toString(ujlVar.a.g.intValue() + (i * 1000) + ((int) j));
    }

    @Override // defpackage.ujk
    public final void c(ucp ucpVar) {
        String e = e(ucpVar == null ? null : ucpVar.a, 5);
        uev.a("ChimeTaskSchedulerApiImpl", "Cancelling a scheduled work request for package [%s] with ID: %s, type: %s", this.a.getApplicationContext().getPackageName(), e, 5);
        brq.h(this.a).e(e);
    }
}
