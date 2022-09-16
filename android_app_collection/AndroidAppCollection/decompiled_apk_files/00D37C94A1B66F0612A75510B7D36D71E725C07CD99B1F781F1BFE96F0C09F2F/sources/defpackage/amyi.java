package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amyi  reason: default package */
/* loaded from: classes.dex */
public final class amyi extends amxr implements Serializable {
    public static final amyi a = new amyi();
    private static final long serialVersionUID = 0;

    private amyi() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.amxr
    public final amxr a() {
        return amxo.a;
    }

    @Override // defpackage.amxr, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
