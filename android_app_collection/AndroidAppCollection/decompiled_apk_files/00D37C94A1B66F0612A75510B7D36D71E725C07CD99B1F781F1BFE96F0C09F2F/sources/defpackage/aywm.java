package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aywm  reason: default package */
/* loaded from: classes2.dex */
public final class aywm extends ayua {
    final ayqe c;
    final int d;

    public aywm(aynx aynxVar, ayqe ayqeVar, int i) {
        super(aynxVar);
        this.c = ayqeVar;
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.aynx
    public final void ae(bame bameVar) {
        aynx aynxVar = this.b;
        if (aynxVar instanceof Callable) {
            try {
                Object call = ((Callable) aynxVar).call();
                if (call == null) {
                    azoc.b(bameVar);
                    return;
                }
                try {
                    aywv.a(bameVar, this.c.a(call).iterator());
                    return;
                } catch (Throwable th) {
                    bapv.j(th);
                    azoc.f(th, bameVar);
                    return;
                }
            } catch (Throwable th2) {
                bapv.j(th2);
                azoc.f(th2, bameVar);
                return;
            }
        }
        aynxVar.ac(new aywl(bameVar, this.c, this.d));
    }
}
