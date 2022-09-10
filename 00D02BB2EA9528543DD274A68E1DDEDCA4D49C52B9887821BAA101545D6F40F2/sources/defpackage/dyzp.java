package defpackage;
/* compiled from: PG */
/* renamed from: dyzp  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyzp implements dyzr {
    public static dyzp d(Throwable th) {
        dzce dzceVar = new dzce(th);
        dzfy.d();
        return dzceVar;
    }

    public final dyzp e(dyzz dyzzVar) {
        dzck dzckVar = new dzck(this, dyzzVar);
        dzfy.d();
        return dzckVar;
    }

    @Override // defpackage.dyzr
    public final void f(dyzq dyzqVar) {
        dzbm.a(dyzqVar, "s is null");
        try {
            dzay<? super dyzp, ? super dyzq, ? extends dyzq> dzayVar = dzfy.p;
            g(dyzqVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            dzas.a(th);
            dzfy.a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    protected abstract void g(dyzq dyzqVar);
}
