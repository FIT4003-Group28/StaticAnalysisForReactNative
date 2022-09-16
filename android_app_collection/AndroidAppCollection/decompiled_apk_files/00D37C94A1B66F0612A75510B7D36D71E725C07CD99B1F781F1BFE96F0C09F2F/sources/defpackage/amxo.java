package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amxo  reason: default package */
/* loaded from: classes.dex */
public final class amxo extends amxr implements Serializable {
    public static final amxo a = new amxo();
    private static final long serialVersionUID = 0;

    private amxo() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.amxr
    public final amxr a() {
        return amyi.a;
    }

    @Override // defpackage.amxr, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
