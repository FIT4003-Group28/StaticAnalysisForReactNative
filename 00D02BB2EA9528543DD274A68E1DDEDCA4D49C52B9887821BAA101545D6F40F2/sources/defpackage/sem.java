package defpackage;

import android.view.View;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: sem  reason: default package */
/* loaded from: classes7.dex */
final class sem implements cqkn<saq> {
    final /* synthetic */ sep a;

    public sem(sep sepVar) {
        this.a = sepVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(saq saqVar, View view) {
        final saq saqVar2 = saqVar;
        this.a.e = true;
        saqVar2.d(!saqVar2.e().booleanValue());
        cqkx.p(this.a);
        bvqd.a(this.a.c.d(new Runnable(this, saqVar2) { // from class: sel
            private final sem a;
            private final saq b;

            {
                this.a = this;
                this.b = saqVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                sem semVar = this.a;
                saq saqVar3 = this.b;
                sep sepVar = semVar.a;
                View o = cqkx.o(saqVar3);
                if (o != null) {
                    sepVar.d.f(o, saqVar3.c());
                }
            }
        }, 1000L, TimeUnit.MILLISECONDS), this.a.c);
    }
}
