package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bie  reason: default package */
/* loaded from: classes3.dex */
final class bie implements Executor {
    final /* synthetic */ bif a;

    public bie(bif bifVar) {
        this.a = bifVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.b.post(runnable);
    }
}
