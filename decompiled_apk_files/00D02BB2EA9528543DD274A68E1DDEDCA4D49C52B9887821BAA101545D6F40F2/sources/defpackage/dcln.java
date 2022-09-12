package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dcln  reason: default package */
/* loaded from: classes5.dex */
public final class dcln extends dclu<Comparable> implements Serializable {
    public static final dcln a = new dcln();
    private static final long serialVersionUID = 0;
    private transient dclu<Comparable> b;
    private transient dclu<Comparable> c;

    private dcln() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.dclu
    public final <S extends Comparable> dclu<S> St() {
        dclu<S> dcluVar = (dclu<S>) this.b;
        if (dcluVar == null) {
            dclu<S> St = super.St();
            this.b = St;
            return St;
        }
        return dcluVar;
    }

    @Override // defpackage.dclu
    public final <S extends Comparable> dclu<S> b() {
        dclu<S> dcluVar = (dclu<S>) this.c;
        if (dcluVar == null) {
            dclu<S> b = super.b();
            this.c = b;
            return b;
        }
        return dcluVar;
    }

    @Override // defpackage.dclu
    public final <S extends Comparable> dclu<S> c() {
        return dcmw.a;
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        dbsk.s(comparable);
        dbsk.s(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
