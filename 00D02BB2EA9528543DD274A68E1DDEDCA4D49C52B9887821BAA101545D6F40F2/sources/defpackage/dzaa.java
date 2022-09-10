package defpackage;

import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: dzaa  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzaa<T> implements dzac<T> {
    public static <T> dzaa<T> d(Future<? extends T> future, dyzz dyzzVar) {
        dzbm.a(dyzzVar, "scheduler is null");
        dzcq dzcqVar = new dzcq(future);
        dzfy.f();
        dzbm.a(dyzzVar, "scheduler is null");
        dzbm.a(dyzzVar, "scheduler is null");
        dzcv dzcvVar = new dzcv(dzcqVar, dyzzVar);
        dzfy.f();
        dzcs dzcsVar = new dzcs(dzcvVar);
        dzfy.g();
        return dzcsVar;
    }

    public final dzaa<T> e(dzaz<? super T> dzazVar) {
        dzdt dzdtVar = new dzdt(this, dzazVar);
        dzfy.g();
        return dzdtVar;
    }

    @Override // defpackage.dzac
    public final void f(dzab<? super T> dzabVar) {
        dzbm.a(dzabVar, "subscriber is null");
        dzay<? super dzaa, ? super dzab, ? extends dzab> dzayVar = dzfy.o;
        dzbm.a(dzabVar, "subscriber returned by the RxJavaPlugins hook is null");
        try {
            g(dzabVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            dzas.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void g(dzab<? super T> dzabVar);

    public final dzaa<T> h(dyzz dyzzVar) {
        dzdx dzdxVar = new dzdx(this, dyzzVar);
        dzfy.g();
        return dzdxVar;
    }
}
