package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azdi  reason: default package */
/* loaded from: classes2.dex */
public final class azdi extends ayoi {
    final ayoi a;
    final ayqe b;

    public azdi(ayoi ayoiVar, ayqe ayqeVar) {
        this.a = ayoiVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        ayof ayofVar;
        ayoi ayoiVar = this.a;
        ayqe ayqeVar = this.b;
        if (ayoiVar instanceof Callable) {
            try {
                Object call = ((Callable) ayoiVar).call();
                if (call != null) {
                    ayofVar = (ayof) ayqeVar.a(call);
                    ayrd.b(ayofVar, "The mapper returned a null MaybeSource");
                } else {
                    ayofVar = null;
                }
                if (ayofVar == null) {
                    ayqj.f(ayomVar);
                    return;
                } else {
                    ayofVar.X(azct.a(ayomVar));
                    return;
                }
            } catch (Throwable th) {
                bapv.j(th);
                ayqj.h(th, ayomVar);
                return;
            }
        }
        ayoiVar.az(new azdh(ayomVar, ayqeVar));
    }
}
