package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: dctp  reason: default package */
/* loaded from: classes.dex */
final class dctp implements Comparator<Object> {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        dctv a = dctv.a(obj);
        dctv a2 = dctv.a(obj2);
        if (a == a2) {
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                return ((Boolean) obj).compareTo((Boolean) obj2);
            }
            if (ordinal == 1) {
                return ((String) obj).compareTo((String) obj2);
            }
            if (ordinal == 2) {
                return ((Long) obj).compareTo((Long) obj2);
            }
            if (ordinal == 3) {
                return ((Double) obj).compareTo((Double) obj2);
            }
            throw null;
        }
        return a.compareTo(a2);
    }
}
