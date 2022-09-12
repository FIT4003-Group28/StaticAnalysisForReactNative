package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvkv  reason: default package */
/* loaded from: classes.dex */
final class bvkv implements Runnable {
    private final Runnable a;
    private final bvkw b;
    private final Executor c;

    public bvkv(Runnable runnable, Executor executor, bvkw bvkwVar) {
        this.a = runnable;
        this.b = bvkwVar;
        this.c = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
        sb.append("Running delayed startup task: ");
        sb.append(valueOf);
        sb.append(" with task type: ");
        sb.append(valueOf2);
        sb.toString();
        this.c.execute(this.a);
    }
}
