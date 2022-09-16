package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: ylt  reason: default package */
/* loaded from: classes4.dex */
final class ylt implements ankb {
    final /* synthetic */ ylw a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ ylv c;

    public ylt(ylw ylwVar, Runnable runnable, ylv ylvVar) {
        this.a = ylwVar;
        this.b = runnable;
        this.c = ylvVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        Runnable runnable = this.b;
        if (runnable == null || !(th instanceof CancellationException)) {
            this.c.b(th);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
        this.a.a(obj);
    }
}
