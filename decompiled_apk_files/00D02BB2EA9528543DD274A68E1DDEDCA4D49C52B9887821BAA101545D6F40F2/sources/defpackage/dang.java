package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dang  reason: default package */
/* loaded from: classes5.dex */
final class dang implements Executor {
    private final Handler a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
