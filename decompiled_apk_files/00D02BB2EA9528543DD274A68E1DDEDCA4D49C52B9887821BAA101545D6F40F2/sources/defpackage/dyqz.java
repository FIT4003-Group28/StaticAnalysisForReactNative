package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dyqz  reason: default package */
/* loaded from: classes6.dex */
final class dyqz {
    private final dysx<? extends Executor> a;
    private Executor b;

    public dyqz(dysx<? extends Executor> dysxVar) {
        this.a = dysxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Executor a() {
        if (this.b == null) {
            Executor a = this.a.a();
            dbsk.w(a, "%s.getObject()", this.b);
            this.b = a;
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        Executor executor = this.b;
        if (executor != null) {
            this.b = this.a.b(executor);
        }
    }
}
