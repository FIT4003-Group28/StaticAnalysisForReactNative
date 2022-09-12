package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dzdn  reason: default package */
/* loaded from: classes6.dex */
public final class dzdn<T, R> extends dzcw<T, R> {
    final dzba<? super dyzu<T>, ? extends dyzv<R>> b;

    public dzdn(dyzv<T> dyzvVar, dzba<? super dyzu<T>, ? extends dyzv<R>> dzbaVar) {
        super(dyzvVar);
        this.b = dzbaVar;
    }

    @Override // defpackage.dyzu
    protected final void g(dyzw<? super R> dyzwVar) {
        dzgn a = dzgn.a();
        try {
            dzba<? super dyzu<T>, ? extends dyzv<R>> dzbaVar = this.b;
            dzvx.c(a, "it");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dyzz dyzzVar = ((axgm) dzbaVar).a.h;
            dzbm.a(timeUnit, "unit is null");
            dzdc dzdcVar = new dzdc(a, timeUnit, dyzzVar);
            dzfy.e();
            dzfm dzfmVar = dzfm.a;
            dzbm.a(dzfmVar, "bufferSupplier is null");
            dzcz dzczVar = new dzcz(a, dzdcVar, dzfmVar);
            dzfy.e();
            dzbm.a(dzczVar, "The selector returned a null ObservableSource");
            dzdm dzdmVar = new dzdm(dyzwVar);
            dzczVar.f(dzdmVar);
            this.a.f(new dzdl(a, dzdmVar));
        } catch (Throwable th) {
            dzas.a(th);
            dzbe.b(th, dyzwVar);
        }
    }
}
