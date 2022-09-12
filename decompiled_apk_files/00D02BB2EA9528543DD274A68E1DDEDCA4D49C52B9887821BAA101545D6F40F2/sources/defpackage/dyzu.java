package defpackage;
/* compiled from: PG */
/* renamed from: dyzu  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyzu<T> implements dyzv<T> {
    public final dyzu<T> ST(dzbb<? super T> dzbbVar) {
        dzbm.a(dzbbVar, "predicate is null");
        dzde dzdeVar = new dzde(this, dzbbVar);
        dzfy.e();
        return dzdeVar;
    }

    public final dyzu<T> SU() {
        dzdg dzdgVar = new dzdg(this);
        dzfy.e();
        return dzdgVar;
    }

    public final dzak SW(dzaz<? super T> dzazVar) {
        dzaz<Throwable> dzazVar2 = dzbl.d;
        dzaz<Object> dzazVar3 = dzbl.c;
        dzbm.a(dzazVar, "onNext is null");
        dzbv dzbvVar = new dzbv(dzazVar, dzazVar2, dzazVar3);
        f(dzbvVar);
        return dzbvVar;
    }

    @Override // defpackage.dyzv
    public final void f(dyzw<? super T> dyzwVar) {
        dzbm.a(dyzwVar, "observer is null");
        try {
            dzay<? super dyzu, ? super dyzw, ? extends dyzw> dzayVar = dzfy.n;
            dzbm.a(dyzwVar, "Plugin returned null Observer");
            g(dyzwVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            dzas.a(th);
            dzfy.a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void g(dyzw<? super T> dyzwVar);

    public final dyzu<T> SV(dyzz dyzzVar) {
        int i = dyzs.a;
        if (i > 0) {
            dzdk dzdkVar = new dzdk(this, dyzzVar, i);
            dzfy.e();
            return dzdkVar;
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("bufferSize");
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
