package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dzcy  reason: default package */
/* loaded from: classes6.dex */
public final class dzcy<T, U extends Collection<? super T>, B> extends dzbw<T, U, U> implements dyzw, dzak {
    final Callable<U> f;
    final dyzv<B> g;
    dzak h;
    dzak i;
    U j;

    public dzcy(dyzw<? super U> dyzwVar, Callable<U> callable, dyzv<B> dyzvVar) {
        super(dyzwVar, new dzdz());
        this.f = callable;
        this.g = dyzvVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        if (!this.c) {
            this.c = true;
            this.i.SQ();
            this.h.SQ();
            if (!f()) {
                return;
            }
            this.b.f();
        }
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        if (dzbd.c(this.h, dzakVar)) {
            this.h = dzakVar;
            try {
                this.j = ((dzfm) this.f).call();
                dzcx dzcxVar = new dzcx(this);
                this.i = dzcxVar;
                this.a.b(this);
                if (this.c) {
                    return;
                }
                this.g.f(dzcxVar);
            } catch (Throwable th) {
                dzas.a(th);
                this.c = true;
                dzakVar.SQ();
                dzbe.b(th, this.a);
            }
        }
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
        synchronized (this) {
            U u = this.j;
            if (u == null) {
                return;
            }
            u.add(t);
        }
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        SQ();
        this.a.d(th);
    }

    @Override // defpackage.dyzw
    public final void e() {
        synchronized (this) {
            U u = this.j;
            if (u == null) {
                return;
            }
            this.j = null;
            this.b.g(u);
            this.d = true;
            if (!f()) {
                return;
            }
            dzfv.b(this.b, this.a, this, this);
        }
    }

    @Override // defpackage.dzbw, defpackage.dzfs
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        this.a.c((Collection) obj);
    }
}
