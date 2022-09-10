package defpackage;

import java.io.Serializable;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcmw  reason: default package */
/* loaded from: classes.dex */
public final class dcmw extends dclu<Comparable> implements Serializable {
    public static final dcmw a = new dcmw();
    private static final long serialVersionUID = 0;

    private dcmw() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.dclu
    public final <S extends Comparable> dclu<S> c() {
        return dcln.a;
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        dbsk.s(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // defpackage.dclu
    public final /* bridge */ /* synthetic */ Object i(Iterator it) {
        return (Comparable) dcln.a.l(it);
    }

    @Override // defpackage.dclu
    public final /* bridge */ /* synthetic */ Object j(Iterable iterable) {
        return (Comparable) dcln.a.m(iterable);
    }

    @Override // defpackage.dclu
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2) {
        return (Comparable) dcln.a.n((Comparable) obj, (Comparable) obj2);
    }

    @Override // defpackage.dclu
    public final /* bridge */ /* synthetic */ Object l(Iterator it) {
        return (Comparable) dcln.a.i(it);
    }

    @Override // defpackage.dclu
    public final /* bridge */ /* synthetic */ Object m(Iterable iterable) {
        return (Comparable) dcln.a.j(iterable);
    }

    @Override // defpackage.dclu
    public final /* bridge */ /* synthetic */ Object n(Object obj, Object obj2) {
        return (Comparable) dcln.a.k((Comparable) obj, (Comparable) obj2);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
