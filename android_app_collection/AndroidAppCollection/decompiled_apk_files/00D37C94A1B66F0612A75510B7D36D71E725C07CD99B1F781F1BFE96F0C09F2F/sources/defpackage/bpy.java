package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: bpy  reason: default package */
/* loaded from: classes2.dex */
public final class bpy extends bqt {
    private static final String b = bqf.b("DelegatingWkrFctry");
    public final List a = new CopyOnWriteArrayList();

    @Override // defpackage.bqt
    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        for (bqt bqtVar : this.a) {
            try {
                ListenableWorker a = bqtVar.a(context, str, workerParameters);
                if (a != null) {
                    return a;
                }
            } catch (Throwable th) {
                String format = String.format("Unable to instantiate a ListenableWorker (%s)", str);
                bqf.a();
                bqf.e(b, format, th);
                throw th;
            }
        }
        return null;
    }
}
