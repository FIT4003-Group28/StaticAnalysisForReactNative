package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ayyv  reason: default package */
/* loaded from: classes2.dex */
public final class ayyv extends aynx {
    final Object b;
    final ayqe c;

    public ayyv(Object obj, ayqe ayqeVar) {
        this.b = obj;
        this.c = ayqeVar;
    }

    @Override // defpackage.aynx
    public final void ae(bame bameVar) {
        try {
            bamd bamdVar = (bamd) this.c.a(this.b);
            ayrd.b(bamdVar, "The mapper returned a null Publisher");
            if (bamdVar instanceof Callable) {
                try {
                    Object call = ((Callable) bamdVar).call();
                    if (call == null) {
                        azoc.b(bameVar);
                        return;
                    } else {
                        bameVar.f(new azod(bameVar, call));
                        return;
                    }
                } catch (Throwable th) {
                    bapv.j(th);
                    azoc.f(th, bameVar);
                    return;
                }
            }
            bamdVar.ad(bameVar);
        } catch (Throwable th2) {
            azoc.f(th2, bameVar);
        }
    }
}
