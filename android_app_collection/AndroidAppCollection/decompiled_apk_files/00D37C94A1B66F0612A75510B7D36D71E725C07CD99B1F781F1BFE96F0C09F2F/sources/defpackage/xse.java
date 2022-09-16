package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xse  reason: default package */
/* loaded from: classes4.dex */
public final class xse {
    public final azpq a = azpq.e();
    private final Executor b;

    public xse(Executor executor) {
        this.b = executor;
    }

    public final void a(final ampq ampqVar) {
        this.b.execute(new Runnable() { // from class: xsc
            @Override // java.lang.Runnable
            public final void run() {
                xse.this.a.c(xsd.b(ampqVar));
            }
        });
    }
}
