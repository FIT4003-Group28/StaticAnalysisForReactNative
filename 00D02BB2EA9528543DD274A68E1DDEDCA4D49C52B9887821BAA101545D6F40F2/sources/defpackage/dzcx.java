package defpackage;

import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: dzcx  reason: default package */
/* loaded from: classes6.dex */
final class dzcx<T, U extends Collection<? super T>, B> extends dzfw<B> {
    final dzcy<T, U, B> a;

    public dzcx(dzcy<T, U, B> dzcyVar) {
        this.a = dzcyVar;
    }

    @Override // defpackage.dyzw
    public final void c(B b) {
        dzcy<T, U, B> dzcyVar = this.a;
        try {
            List<Object> call = ((dzfm) dzcyVar.f).call();
            synchronized (dzcyVar) {
                U u = dzcyVar.j;
                if (u == null) {
                    return;
                }
                dzcyVar.j = call;
                dyzw<? super V> dyzwVar = dzcyVar.a;
                dzbp<U> dzbpVar = dzcyVar.b;
                if (dzcyVar.e.get() != 0 || !dzcyVar.e.compareAndSet(0, 1)) {
                    dzbpVar.g(u);
                    if (!dzcyVar.f()) {
                        return;
                    }
                } else {
                    dzcyVar.h(u);
                    if (dzcyVar.g(-1) == 0) {
                        return;
                    }
                }
                dzfv.b(dzbpVar, dyzwVar, dzcyVar, dzcyVar);
            }
        } catch (Throwable th) {
            dzas.a(th);
            dzcyVar.SQ();
            dzcyVar.a.d(th);
        }
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        this.a.d(th);
    }

    @Override // defpackage.dyzw
    public final void e() {
        this.a.e();
    }
}
