package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bv  reason: default package */
/* loaded from: classes4.dex */
public final class bv implements Executor {
    private final Executor a;
    private final ArrayDeque<Runnable> b = new ArrayDeque<>();
    private Runnable c;

    public bv(Executor executor) {
        this.a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        Runnable poll = this.b.poll();
        this.c = poll;
        if (poll != null) {
            this.a.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.b.offer(new bu(this, runnable));
        if (this.c == null) {
            a();
        }
    }
}
