package com.google.android.libraries.notifications.scheduled.impl.workmanager;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChimeScheduledTaskWorker extends Worker {
    private final Context g;

    public ChimeScheduledTaskWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = context;
    }

    @Override // androidx.work.Worker
    public final adz i() {
        uem uemVar;
        Bundle bundle;
        int length;
        uby e;
        try {
            uemVar = uel.a(this.g);
        } catch (IllegalStateException e2) {
            uev.f("ChimeWorker", e2, "Failed to get ChimeComponent for ChimeScheduledTaskWorker", new Object[0]);
            uemVar = null;
        }
        if (uemVar == null) {
            return adz.g();
        }
        uemVar.jt();
        if (uemVar.ay().i) {
            uev.d("ChimeWorker", "ChimeScheduledTaskWorker disabled by host app in ChimeConfig", new Object[0]);
            return adz.g();
        }
        bpx a = a();
        String b = a.b("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
        if (a == null) {
            bundle = Bundle.EMPTY;
        } else {
            byte[] d = a.d("notifications.scheduled.impl.workmanager.extraskey");
            if (d != null && (length = d.length) != 0) {
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(d, 0, length);
                obtain.setDataPosition(0);
                bundle = new Bundle();
                bundle.readFromParcel(obtain);
                obtain.recycle();
            }
            bundle = Bundle.EMPTY;
        }
        bundle.putInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", bundle.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", -1) + 1);
        udt aC = uemVar.aC();
        if (!TextUtils.isEmpty(b)) {
            for (ujj ujjVar : aC.a) {
                if (b.equals(ujjVar.f())) {
                    break;
                }
            }
        }
        ujjVar = null;
        if (ujjVar == null) {
            uev.b("ScheduledTaskWorkerHandler", "ChimeTask NOT found. key: '%s'", b);
            e = uby.a(new Exception("ChimeTask NOT found."));
        } else {
            uev.e("ScheduledTaskWorkerHandler", "Starting task execution. Job key: '%s'", b);
            e = ujjVar.e(bundle);
        }
        int i = e.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            uev.e("ChimeWorker", "Work finished with SUCCESS code. Job key: '%s'", b);
            return adz.i();
        } else if (i2 == 1) {
            uev.c("ChimeWorker", e.b, "Work finished with TRANSIENT_FAILURE. Job key: '%s'", aoec.a(b));
            return adz.h();
        } else if (i2 == 2) {
            uev.c("ChimeWorker", e.b, "Work finished with PERMANENT_FAILURE. Job key: '%s'", aoec.a(b));
            return adz.g();
        } else {
            return adz.i();
        }
    }
}
