package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awgz  reason: default package */
/* loaded from: classes3.dex */
final class awgz implements avia {
    final /* synthetic */ Executor a;
    final /* synthetic */ deig b;
    final /* synthetic */ akqs c;
    final /* synthetic */ avib d;

    public awgz(Executor executor, deig deigVar, akqs akqsVar, avib avibVar) {
        this.a = executor;
        this.b = deigVar;
        this.c = akqsVar;
        this.d = avibVar;
    }

    @Override // defpackage.avia
    public final void b() {
        Executor executor = this.a;
        final deig deigVar = this.b;
        final akqs akqsVar = this.c;
        final avib avibVar = this.d;
        executor.execute(new Runnable(deigVar, akqsVar, avibVar) { // from class: awgy
            private final deig a;
            private final akqs b;
            private final avib c;

            {
                this.a = deigVar;
                this.b = akqsVar;
                this.c = avibVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                deig deigVar2 = this.a;
                akqs akqsVar2 = this.b;
                avib avibVar2 = this.c;
                deigVar2.j(awhc.d(akqsVar2, !avibVar2.c(), avibVar2.d()));
            }
        });
    }

    @Override // defpackage.avia
    public final void c() {
        this.b.j(awhc.d(this.c, false, 0));
    }
}
