package defpackage;
/* compiled from: PG */
/* renamed from: dbrh  reason: default package */
/* loaded from: classes5.dex */
public abstract class dbrh<A, B> implements dbrn<A, B> {
    private transient dbrh<B, A> a;

    public static <A, B> dbrh<A, B> l(dbrn<? super A, ? extends B> dbrnVar, dbrn<? super B, ? extends A> dbrnVar2) {
        return new dbrf(dbrnVar, dbrnVar2);
    }

    public B NV(A a) {
        if (a == null) {
            return null;
        }
        B c = c(a);
        dbsk.s(c);
        return c;
    }

    public A NW(B b) {
        if (b == null) {
            return null;
        }
        A b2 = b(b);
        dbsk.s(b2);
        return b2;
    }

    @Override // defpackage.dbrn
    @Deprecated
    public final B a(A a) {
        return NV(a);
    }

    protected abstract A b(B b);

    protected abstract B c(A a);

    public final dbrh<B, A> k() {
        dbrh<B, A> dbrhVar = this.a;
        if (dbrhVar == null) {
            dbrg dbrgVar = new dbrg(this);
            this.a = dbrgVar;
            return dbrgVar;
        }
        return dbrhVar;
    }
}
