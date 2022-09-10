package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awuv  reason: default package */
/* loaded from: classes.dex */
public final class awuv implements Runnable {
    final /* synthetic */ awux a;
    private final bvpy b;
    private alad c;

    public awuv(awux awuxVar, alad aladVar) {
        this.a = awuxVar;
        this.c = aladVar;
        dehq dehqVar = awuxVar.d;
        Runnable runnable = new Runnable(this) { // from class: awuu
            private final awuv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                awuv awuvVar = this.a;
                awux awuxVar2 = awuvVar.a;
                alad a = awuvVar.a();
                if (!awuxVar2.i) {
                    return;
                }
                synchronized (awuxVar2) {
                    if (a.equals(awuxVar2.k)) {
                        return;
                    }
                    if (!awuxVar2.l) {
                        awuxVar2.e.a().g();
                    }
                    awuxVar2.k = a;
                    awuxVar2.l = true;
                    Runnable runnable2 = awuxVar2.n;
                    if (runnable2 == null) {
                        return;
                    }
                    runnable2.run();
                }
            }
        };
        cqat a = awuxVar.g.a().a.a();
        bvpz.b(a, 1);
        bvpz.b(dehqVar, 2);
        bvpz.b(runnable, 3);
        this.b = new bvpy(a, dehqVar, runnable, 10000L);
    }

    private final synchronized void b(alad aladVar) {
        this.c = aladVar;
    }

    public final synchronized alad a() {
        return this.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        awux awuxVar = this.a;
        alad f = awuxVar.f(awuxVar.b.a().l().p());
        alad a = a();
        if (Math.abs(f.k - a.k) < 0.1d && akqo.e(f.i, a.i) < 20.0d) {
            return;
        }
        b(f);
        this.b.a(500L);
    }
}
