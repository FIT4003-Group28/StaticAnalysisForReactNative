package com.google.android.libraries.youtube.common.backgroundtask.workmanager;

import android.content.Context;
import android.os.Bundle;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BackgroundTaskWorker extends Worker {
    public static final String g = "com.google.android.libraries.youtube.common.backgroundtask.workmanager.BackgroundTaskWorker";
    private final azqb h;

    public BackgroundTaskWorker(Context context, WorkerParameters workerParameters, azqb azqbVar) {
        super(context, workerParameters);
        azqbVar.getClass();
        this.h = azqbVar;
    }

    @Override // androidx.work.Worker
    public final adz i() {
        Set<String> c = c();
        Bundle b = yln.b(a());
        int i = 1;
        for (String str : c) {
            if (!akzj.i(g, str) && (i = ((yjl) this.h.get()).a(str, b)) != 0) {
                break;
            }
        }
        return yln.e(i);
    }
}
