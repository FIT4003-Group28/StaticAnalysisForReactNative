package defpackage;

import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: azge  reason: default package */
/* loaded from: classes2.dex */
public final class azge extends ayoi {
    final Future a;

    public azge(Future future) {
        this.a = future;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        ayrw ayrwVar = new ayrw(ayomVar);
        ayomVar.sj(ayrwVar);
        if (!ayrwVar.e()) {
            try {
                Object obj = this.a.get();
                ayrd.b(obj, "Future returned null");
                ayrwVar.f(obj);
            } catch (Throwable th) {
                bapv.j(th);
                if (ayrwVar.e()) {
                    return;
                }
                ayomVar.b(th);
            }
        }
    }
}
