package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dzcc  reason: default package */
/* loaded from: classes6.dex */
public final class dzcc extends dyzp {
    final Callable<? extends dyzr> a;

    public dzcc(Callable<? extends dyzr> callable) {
        this.a = callable;
    }

    @Override // defpackage.dyzp
    protected final void g(dyzq dyzqVar) {
        try {
            dyzr call = this.a.call();
            dzbm.a(call, "The completableSupplier returned a null CompletableSource");
            call.f(dyzqVar);
        } catch (Throwable th) {
            dzas.a(th);
            dzbe.c(th, dyzqVar);
        }
    }
}
