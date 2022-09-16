package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ayvv  reason: default package */
/* loaded from: classes2.dex */
public final class ayvv extends aynx {
    final Callable b;

    public ayvv(Callable callable) {
        this.b = callable;
    }

    @Override // defpackage.aynx
    public final void ae(bame bameVar) {
        try {
            th = (Throwable) this.b.call();
            ayrd.b(th, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            bapv.j(th);
        }
        azoc.f(th, bameVar);
    }
}
