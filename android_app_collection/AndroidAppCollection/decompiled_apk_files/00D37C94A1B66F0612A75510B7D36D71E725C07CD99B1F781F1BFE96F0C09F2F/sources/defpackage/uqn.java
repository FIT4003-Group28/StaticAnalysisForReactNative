package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: uqn  reason: default package */
/* loaded from: classes4.dex */
public final class uqn implements uqe {
    public final amqo a;
    public final AtomicReference b = new AtomicReference();
    private final ankw c;

    public uqn(ExecutorService executorService, amqo amqoVar) {
        this.c = anlz.e(executorService);
        this.a = aqxo.i(amqoVar);
    }

    private final ankt g(final ampg ampgVar) {
        if (this.b.get() != null) {
            return (ankt) ampgVar.apply((uqe) this.b.get());
        }
        final amqo amqoVar = this.a;
        amqoVar.getClass();
        return amne.f(amnt.d(new Callable() { // from class: uqm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (uqe) amqo.this.get();
            }
        }, this.c)).i(new anir() { // from class: uqj
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                uqn uqnVar = uqn.this;
                ampg ampgVar2 = ampgVar;
                uqe uqeVar = (uqe) obj;
                uqnVar.b.set(uqeVar);
                return (ankt) ampgVar2.apply(uqeVar);
            }
        }, anjk.a);
    }

    private final void h(final Runnable runnable) {
        if (this.b.get() != null) {
            runnable.run();
        } else {
            this.c.execute(ammo.f(new Runnable() { // from class: uql
                @Override // java.lang.Runnable
                public final void run() {
                    uqn uqnVar = uqn.this;
                    Runnable runnable2 = runnable;
                    uqnVar.b.set((uqe) uqnVar.a.get());
                    runnable2.run();
                }
            }));
        }
    }

    @Override // defpackage.uqe
    public final ankt a() {
        return g(uag.e);
    }

    @Override // defpackage.uqe
    public final ankt b() {
        return g(uag.f);
    }

    @Override // defpackage.uqe
    public final void c(ukz ukzVar) {
        h(new uqk(this, ukzVar, 1));
    }

    @Override // defpackage.uqe
    public final void d(ukz ukzVar) {
        h(new uqk(this, ukzVar));
    }

    @Override // defpackage.uqe
    public final ankt e(String str, int i) {
        return g(new uqi(str, i, 1));
    }

    @Override // defpackage.uqe
    public final ankt f(String str, int i) {
        return g(new uqi(str, i));
    }
}
