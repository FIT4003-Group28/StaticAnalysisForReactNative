package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azfi  reason: default package */
/* loaded from: classes2.dex */
public final class azfi extends ayoi {
    final Callable a;

    public azfi(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        try {
            th = (Throwable) ((ayqy) this.a).a;
            ayrd.b(th, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            bapv.j(th);
        }
        ayqj.h(th, ayomVar);
    }
}
