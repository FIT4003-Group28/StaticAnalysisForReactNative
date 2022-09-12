package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cstm  reason: default package */
/* loaded from: classes5.dex */
public final class cstm implements Executor {
    private static Reference<Executor> a = new WeakReference(null);
    private final Handler b = new Handler(Looper.getMainLooper());

    private cstm() {
    }

    public static synchronized Executor a() {
        synchronized (cstm.class) {
            Executor executor = a.get();
            if (executor == null) {
                cstm cstmVar = new cstm();
                a = new WeakReference(cstmVar);
                return cstmVar;
            }
            return executor;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
