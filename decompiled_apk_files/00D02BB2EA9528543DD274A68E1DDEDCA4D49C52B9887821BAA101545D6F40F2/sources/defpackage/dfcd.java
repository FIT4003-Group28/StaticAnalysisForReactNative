package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dfcd  reason: default package */
/* loaded from: classes6.dex */
public final class dfcd<ReqT, RespT> extends dyfy<ReqT, RespT> {
    private final AtomicReference<dfcc> a;

    public dfcd(dyex<ReqT, RespT> dyexVar) {
        super(dyexVar);
        this.a = new AtomicReference<>(dfcc.a(1));
    }

    @Override // defpackage.dyfz, defpackage.dyex
    public final void a(dyew<RespT> dyewVar, dyhw dyhwVar) {
        dfcc dfccVar;
        do {
            dfccVar = this.a.get();
        } while (!this.a.compareAndSet(dfccVar, dfccVar.b == 1 ? dfcc.a(2) : dfccVar));
        int i = dfccVar.b;
        if (i == 1) {
            this.c.a(dyewVar, dyhwVar);
        } else if (i == 4) {
            dyewVar.b(dfccVar.a, new dyhw());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already started");
            this.c.d("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    @Override // defpackage.dyiq, defpackage.dyex
    public final void c(int i) {
        int i2 = this.a.get().b;
        if (i2 == 1 || i2 == 4) {
            throw new IllegalStateException("Not started");
        }
        dbsk.b(true, "Number requested must be non-negative");
        this.c.c(i);
    }

    @Override // defpackage.dyiq, defpackage.dyex
    public final void d(@dzsi String str, @dzsi Throwable th) {
        dfcc dfccVar;
        dfcc b;
        dyjb dyjbVar = dyjb.c;
        if (str != null) {
            dyjbVar = dyjbVar.g(str);
        }
        if (th != null) {
            dyjbVar = dyjbVar.f(th);
        }
        do {
            dfccVar = this.a.get();
            int i = dfccVar.b;
            if (i == 4) {
                b = dfccVar;
            } else if (i == 1) {
                b = dfcc.b(4, dyjbVar);
            } else {
                b = dfcc.b(5, dyjbVar);
            }
        } while (!this.a.compareAndSet(dfccVar, b));
        this.c.d(str, th);
    }

    @Override // defpackage.dyiq, defpackage.dyex
    public final void e() {
        dfcc dfccVar;
        do {
            dfccVar = this.a.get();
            if (dfccVar.b == 2) {
            } else {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!this.a.compareAndSet(dfccVar, dfcc.a(3)));
        this.c.e();
    }

    @Override // defpackage.dyfz, defpackage.dyex
    public final void f(ReqT reqt) {
        dbsk.t(reqt, "Message must be non-null");
        int i = this.a.get().b;
        if (i == 2) {
            this.c.f(reqt);
        } else if (i != 5) {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }
}
