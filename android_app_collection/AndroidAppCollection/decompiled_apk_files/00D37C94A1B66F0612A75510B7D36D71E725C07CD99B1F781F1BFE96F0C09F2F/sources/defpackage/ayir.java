package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ayir  reason: default package */
/* loaded from: classes2.dex */
final class ayir {
    private Executor a;
    private final aymj b;

    public ayir(aymj aymjVar) {
        this.b = aymjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final synchronized Executor a() {
        if (this.a == null) {
            ?? b = this.b.b();
            b.getClass();
            this.a = b;
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        Executor executor = this.a;
        if (executor != null) {
            this.b.c(executor);
            this.a = null;
        }
    }
}
