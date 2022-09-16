package defpackage;
/* compiled from: PG */
/* renamed from: dyzs  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyzs<T> implements eavk<T> {
    static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public final void a(dyzt<? super T> dyztVar) {
        try {
            dzay<? super dyzs, ? super eavl, ? extends eavl> dzayVar = dzfy.m;
            b(dyztVar);
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

    protected abstract void b(eavl<? super T> eavlVar);
}
