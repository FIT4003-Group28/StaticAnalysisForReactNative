package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azid  reason: default package */
/* loaded from: classes2.dex */
public final class azid extends ayoi {
    final Object a;
    final ayqe b;

    public azid(Object obj, ayqe ayqeVar) {
        this.a = obj;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayoi
    public final void f(ayom ayomVar) {
        try {
            ayok ayokVar = (ayok) this.b.a(this.a);
            ayrd.b(ayokVar, "The mapper returned a null ObservableSource");
            if (ayokVar instanceof Callable) {
                try {
                    Object call = ((Callable) ayokVar).call();
                    if (call == null) {
                        ayqj.f(ayomVar);
                        return;
                    }
                    azic azicVar = new azic(ayomVar, call);
                    ayomVar.sj(azicVar);
                    azicVar.run();
                    return;
                } catch (Throwable th) {
                    bapv.j(th);
                    ayqj.h(th, ayomVar);
                    return;
                }
            }
            ayokVar.az(ayomVar);
        } catch (Throwable th2) {
            ayqj.h(th2, ayomVar);
        }
    }
}
