package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfak  reason: default package */
/* loaded from: classes6.dex */
public final class dfak<ReqT, RespT> extends dyex<ReqT, RespT> {
    public dyew<RespT> c;
    private final dehn<dyex<ReqT, RespT>> e;
    private final Executor f = dehx.b(dege.a);
    public final Queue<Runnable> a = new ArrayDeque();
    public dyex<ReqT, RespT> b = null;
    public boolean d = false;

    public dfak(dehn<dyex<ReqT, RespT>> dehnVar) {
        this.e = dehnVar;
    }

    private final void b(final Runnable runnable) {
        this.f.execute(new Runnable(this, runnable) { // from class: dfai
            private final dfak a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfak dfakVar = this.a;
                Runnable runnable2 = this.b;
                if (!dfakVar.d) {
                    if (dfakVar.b != null) {
                        try {
                            runnable2.run();
                            return;
                        } catch (Throwable th) {
                            dfakVar.c.b(dyjb.c(th), new dyhw());
                            return;
                        }
                    }
                    dfakVar.a.add(runnable2);
                }
            }
        });
    }

    @Override // defpackage.dyex
    public final void a(final dyew<RespT> dyewVar, final dyhw dyhwVar) {
        this.c = dyewVar;
        deha.q(this.e, new dfaj(this, dyewVar), this.f);
        b(new Runnable(this, dyewVar, dyhwVar) { // from class: dfad
            private final dfak a;
            private final dyew b;
            private final dyhw c;

            {
                this.a = this;
                this.b = dyewVar;
                this.c = dyhwVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfak dfakVar = this.a;
                dfakVar.b.a(this.b, this.c);
            }
        });
    }

    @Override // defpackage.dyex
    public final void c(final int i) {
        b(new Runnable(this, i) { // from class: dfae
            private final dfak a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfak dfakVar = this.a;
                dfakVar.b.c(this.b);
            }
        });
    }

    @Override // defpackage.dyex
    public final void d(@dzsi final String str, @dzsi final Throwable th) {
        b(new Runnable(this, str, th) { // from class: dfaf
            private final dfak a;
            private final String b;
            private final Throwable c;

            {
                this.a = this;
                this.b = str;
                this.c = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfak dfakVar = this.a;
                dfakVar.b.d(this.b, this.c);
            }
        });
    }

    @Override // defpackage.dyex
    public final void e() {
        b(new Runnable(this) { // from class: dfag
            private final dfak a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.e();
            }
        });
    }

    @Override // defpackage.dyex
    public final void f(final ReqT reqt) {
        b(new Runnable(this, reqt) { // from class: dfah
            private final dfak a;
            private final Object b;

            {
                this.a = this;
                this.b = reqt;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dfak dfakVar = this.a;
                dfakVar.b.f(this.b);
            }
        });
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 11 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("delegate=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
