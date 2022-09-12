package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
/* compiled from: PG */
/* renamed from: bcq  reason: default package */
/* loaded from: classes3.dex */
public abstract class bcq {
    static {
        bbz.f("WorkerFactory");
    }

    public static bcq c() {
        return new bcp();
    }

    public abstract ListenableWorker a(Context context, WorkerParameters workerParameters);

    public final ListenableWorker b(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        ListenableWorker a = a(context, workerParameters);
        if (a == null) {
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                String str2 = "Invalid class: " + str;
                bbz.e().b(th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    String str3 = "Could not instantiate " + str;
                    bbz.e().b(th2);
                }
            }
        }
        if (a == null || !a.c) {
            return a;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
