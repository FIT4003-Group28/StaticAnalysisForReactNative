package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: alqc  reason: default package */
/* loaded from: classes.dex */
final class alqc implements Executor {
    final /* synthetic */ Handler a;

    public alqc(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
