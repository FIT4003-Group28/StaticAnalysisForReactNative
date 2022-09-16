package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
/* compiled from: PG */
/* renamed from: bqt  reason: default package */
/* loaded from: classes2.dex */
public abstract class bqt {
    private static final String a = bqf.b("WorkerFactory");

    public static bqt c() {
        return new bqs();
    }

    public abstract ListenableWorker a(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        ListenableWorker a2 = a(context, str, workerParameters);
        if (a2 == null) {
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                bqf.a();
                String str2 = a;
                bqf.e(str2, "Invalid class: " + str, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a2 = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    bqf.a();
                    String str3 = a;
                    bqf.e(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a2 == null || !a2.d) {
            return a2;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
