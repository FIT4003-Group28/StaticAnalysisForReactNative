package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azem  reason: default package */
/* loaded from: classes2.dex */
public final class azem extends ayoi {
    final Callable a;

    public azem(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        try {
            ayok ayokVar = (ayok) this.a.call();
            ayrd.b(ayokVar, "null ObservableSource supplied");
            ayokVar.az(ayomVar);
        } catch (Throwable th) {
            bapv.j(th);
            ayqj.h(th, ayomVar);
        }
    }
}
