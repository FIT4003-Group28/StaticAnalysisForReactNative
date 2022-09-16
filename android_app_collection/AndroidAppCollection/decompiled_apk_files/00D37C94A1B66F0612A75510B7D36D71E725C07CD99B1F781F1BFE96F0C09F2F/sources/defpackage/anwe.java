package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anwe  reason: default package */
/* loaded from: classes.dex */
final class anwe implements Executor {
    private static final Handler a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a.post(runnable);
    }
}
