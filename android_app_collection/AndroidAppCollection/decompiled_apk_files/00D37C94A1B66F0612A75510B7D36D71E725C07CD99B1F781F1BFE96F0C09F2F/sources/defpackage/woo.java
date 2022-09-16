package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: woo  reason: default package */
/* loaded from: classes4.dex */
public final class woo {
    public final woj a;
    public final xdu b;
    public boolean c;
    public wom d;

    public woo(woj wojVar, xdu xduVar) {
        this.a = wojVar;
        this.b = xduVar;
    }

    private final void d() {
        if (!this.c) {
            this.c = true;
            return;
        }
        throw new IllegalStateException("Tried to fulfill more than one thing by an adapter");
    }

    public final void a(ampg ampgVar, Executor executor, Executor executor2) {
        b(ampgVar, executor, executor2, null);
    }

    public final void b(ampg ampgVar, Executor executor, Executor executor2, won wonVar) {
        d();
        if (this.d != null) {
            wwf.a(this.b, "Already had ongoing fulfillment task");
            return;
        }
        final wom womVar = new wom(this, anii.h(anlz.q(this.b), ampgVar, executor), wonVar);
        this.d = womVar;
        womVar.a.qY(new Runnable() { // from class: wol
            @Override // java.lang.Runnable
            public final void run() {
                wom womVar2 = wom.this;
                if (!womVar2.c) {
                    try {
                        xci xciVar = (xci) womVar2.a.get();
                        won wonVar2 = womVar2.b;
                        if (wonVar2 != null) {
                            xciVar = wonVar2.a(womVar2.d.b, xciVar);
                        }
                        woo wooVar = womVar2.d;
                        wooVar.a.m(wooVar.b, xciVar);
                        return;
                    } catch (InterruptedException | RuntimeException | ExecutionException e) {
                        woo wooVar2 = womVar2.d;
                        woj wojVar = wooVar2.a;
                        xdu xduVar = wooVar2.b;
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                        sb.append("Fulfillment error: ");
                        sb.append(valueOf);
                        wojVar.j(xduVar, new wuq(sb.toString()));
                        return;
                    }
                }
                woo wooVar3 = womVar2.d;
                wooVar3.a.n(wooVar3.b);
            }
        }, executor2);
    }

    public final void c(ampg ampgVar) {
        d();
        try {
            this.a.m(this.b, (xci) ampgVar.apply(this.b));
        } catch (RuntimeException e) {
            this.a.j(this.b, new wuq(e.getMessage()));
        }
    }
}
