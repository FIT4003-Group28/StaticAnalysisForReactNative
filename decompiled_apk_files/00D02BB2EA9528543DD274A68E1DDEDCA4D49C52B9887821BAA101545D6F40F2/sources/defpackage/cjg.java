package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cjg  reason: default package */
/* loaded from: classes.dex */
final class cjg implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
