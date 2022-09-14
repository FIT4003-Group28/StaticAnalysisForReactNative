package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cvph  reason: default package */
/* loaded from: classes5.dex */
final class cvph implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
