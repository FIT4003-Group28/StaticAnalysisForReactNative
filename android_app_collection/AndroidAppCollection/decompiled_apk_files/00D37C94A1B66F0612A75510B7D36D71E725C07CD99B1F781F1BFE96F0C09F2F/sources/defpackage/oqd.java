package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.android.apps.youtube.embeddedplayer.service.EmbedsBackgroundTaskWorker;
/* compiled from: PG */
/* renamed from: oqd  reason: default package */
/* loaded from: classes4.dex */
public final class oqd extends bqt {
    @Override // defpackage.bqt
    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        if (akzj.i(str, EmbedsBackgroundTaskWorker.f)) {
            return new EmbedsBackgroundTaskWorker(context, workerParameters);
        }
        return null;
    }
}
