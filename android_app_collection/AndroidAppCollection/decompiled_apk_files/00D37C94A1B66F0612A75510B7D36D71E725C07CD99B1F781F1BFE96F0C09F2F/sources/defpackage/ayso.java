package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ayso  reason: default package */
/* loaded from: classes2.dex */
public final class ayso extends aynr {
    final Callable a;

    public ayso(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        try {
            aynu aynuVar = (aynu) this.a.call();
            ayrd.b(aynuVar, "The completableSupplier returned a null CompletableSource");
            aynuVar.U(aynsVar);
        } catch (Throwable th) {
            bapv.j(th);
            ayqj.g(th, aynsVar);
        }
    }
}
