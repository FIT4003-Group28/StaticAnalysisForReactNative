package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.android.libraries.youtube.common.backgroundtask.workmanager.BackgroundTaskWorker;
/* compiled from: PG */
/* renamed from: yjp  reason: default package */
/* loaded from: classes4.dex */
public final class yjp extends bqt {
    private final azqb a;

    public yjp(azqb azqbVar) {
        azqbVar.getClass();
        this.a = azqbVar;
    }

    @Override // defpackage.bqt
    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        if (akzj.i(str, BackgroundTaskWorker.g)) {
            return new BackgroundTaskWorker(context, workerParameters, this.a);
        }
        return null;
    }
}
