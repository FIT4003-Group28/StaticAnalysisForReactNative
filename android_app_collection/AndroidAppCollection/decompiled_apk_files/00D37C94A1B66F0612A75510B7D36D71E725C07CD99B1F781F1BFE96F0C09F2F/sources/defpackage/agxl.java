package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agxl  reason: default package */
/* loaded from: classes.dex */
final class agxl implements Executor {
    final /* synthetic */ agxn a;
    private final Handler b;

    public agxl(agxn agxnVar) {
        this.a = agxnVar;
        this.b = new Handler(agxnVar.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
