package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: irp  reason: default package */
/* loaded from: classes6.dex */
public final class irp extends bcq {
    private final Map<String, dzsj<irw>> a;

    public irp(Map<String, dzsj<irw>> map) {
        this.a = map;
    }

    @Override // defpackage.bcq
    public final ListenableWorker a(Context context, WorkerParameters workerParameters) {
        String c = workerParameters.b.c("worker_name_key");
        if (TextUtils.isEmpty(c)) {
            Set<String> set = workerParameters.c;
            return null;
        }
        dzsj<irw> dzsjVar = this.a.get(c);
        irw a = dzsjVar != null ? dzsjVar.a() : null;
        if (a != null) {
            return new GmmWorkerWrapper(context, workerParameters, a);
        }
        return null;
    }
}
