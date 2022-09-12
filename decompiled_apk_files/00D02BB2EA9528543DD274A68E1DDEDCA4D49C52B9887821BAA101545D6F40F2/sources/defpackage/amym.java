package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: amym  reason: default package */
/* loaded from: classes.dex */
public final class amym {
    public final bvqr a;

    public amym(Executor executor) {
        this.a = new bvqr(dehx.b(executor), true);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
