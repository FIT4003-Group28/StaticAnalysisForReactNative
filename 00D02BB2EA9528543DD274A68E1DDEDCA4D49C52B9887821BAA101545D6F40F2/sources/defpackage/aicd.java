package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aicd  reason: default package */
/* loaded from: classes2.dex */
final class aicd<I, O> {
    private final Executor a;
    private final btzp<I, O> b;

    public aicd(Executor executor, btzp<I, O> btzpVar) {
        this.a = executor;
        this.b = btzpVar;
    }

    public final dehn<O> a(I i) {
        final deig d = deig.d();
        final btzc b = this.b.b(i, new aicc(d, i), this.a);
        d.Pk(new Runnable(d, b) { // from class: aicb
            private final deig a;
            private final btzc b;

            {
                this.a = d;
                this.b = b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                deig deigVar = this.a;
                btzc btzcVar = this.b;
                if (deigVar.isCancelled()) {
                    btzcVar.a();
                }
            }
        }, this.a);
        return d;
    }
}
