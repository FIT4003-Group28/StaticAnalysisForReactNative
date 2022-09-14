package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: deky  reason: default package */
/* loaded from: classes6.dex */
final class deky implements Executor {
    private static final Handler a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a.post(runnable);
    }
}
