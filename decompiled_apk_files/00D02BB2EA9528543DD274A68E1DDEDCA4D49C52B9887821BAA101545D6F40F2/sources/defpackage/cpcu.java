package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cpcu  reason: default package */
/* loaded from: classes.dex */
final class cpcu implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
