package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cnjj  reason: default package */
/* loaded from: classes5.dex */
public final class cnjj implements Executor {
    private final Handler a;

    public cnjj(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
