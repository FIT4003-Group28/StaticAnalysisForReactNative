package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azlb  reason: default package */
/* loaded from: classes2.dex */
public final class azlb extends ayos {
    final Callable a;

    public azlb(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ayos
    protected final void X(ayot ayotVar) {
        try {
            th = (Throwable) ((ayqy) this.a).a;
            ayrd.b(th, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            bapv.j(th);
        }
        ayqj.i(th, ayotVar);
    }
}
