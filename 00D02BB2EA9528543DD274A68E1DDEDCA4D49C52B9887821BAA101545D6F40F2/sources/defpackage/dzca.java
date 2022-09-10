package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dzca  reason: default package */
/* loaded from: classes6.dex */
final class dzca extends AtomicInteger implements dyzq {
    private static final long serialVersionUID = -7965400327305809232L;
    final dyzq a;
    final dyzr[] b;
    int c;
    final dzbg d = new dzbg();

    public dzca(dyzq dyzqVar, dyzr[] dyzrVarArr) {
        this.a = dyzqVar;
        this.b = dyzrVarArr;
    }

    @Override // defpackage.dyzq
    public final void a(dzak dzakVar) {
        dzbd.f(this.d, dzakVar);
    }

    @Override // defpackage.dyzq
    public final void b() {
        d();
    }

    @Override // defpackage.dyzq
    public final void c(Throwable th) {
        this.a.c(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (!this.d.b() && getAndIncrement() == 0) {
            dyzr[] dyzrVarArr = this.b;
            while (!this.d.b()) {
                int i = this.c;
                this.c = i + 1;
                int length = dyzrVarArr.length;
                if (i != 2) {
                    dyzrVarArr[i].f(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    this.a.b();
                    return;
                }
            }
        }
    }
}
