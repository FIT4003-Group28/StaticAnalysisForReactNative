package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: degd  reason: default package */
/* loaded from: classes.dex */
public final class degd<V> extends defa<Object, V> {
    public degc<?> c;

    public degd(dccr<? extends dehn<?>> dccrVar, boolean z, Executor executor, deff<V> deffVar) {
        super(dccrVar, z, false);
        this.c = new dega(this, deffVar, executor);
        d();
    }

    @Override // defpackage.dees
    protected final void e() {
        degc<?> degcVar = this.c;
        if (degcVar != null) {
            degcVar.g();
        }
    }

    @Override // defpackage.defa
    public final void q(deez deezVar) {
        super.q(deezVar);
        if (deezVar == deez.OUTPUT_FUTURE_DONE) {
            this.c = null;
        }
    }

    @Override // defpackage.defa
    public final void r(int i, Object obj) {
    }

    @Override // defpackage.defa
    public final void s() {
        degc<?> degcVar = this.c;
        if (degcVar != null) {
            degcVar.e();
        }
    }

    public degd(dccr<? extends dehn<?>> dccrVar, boolean z, Executor executor, Callable<V> callable) {
        super(dccrVar, z, false);
        this.c = new degb(this, callable, executor);
        d();
    }
}
