package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwm  reason: default package */
/* loaded from: classes2.dex */
final class bwm implements Executor {
    final /* synthetic */ bwn a;

    public bwm(bwn bwnVar) {
        this.a = bwnVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.b.post(runnable);
    }
}
