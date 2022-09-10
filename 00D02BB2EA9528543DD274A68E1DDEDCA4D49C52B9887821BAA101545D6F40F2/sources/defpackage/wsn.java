package defpackage;

import java.util.Comparator;
/* renamed from: wsn  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class wsn implements Comparator {
    static final Comparator a = new wsn();

    private wsn() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        eapr ab = ((wpv) obj).ab();
        eapr ab2 = ((wpv) obj2).ab();
        if (ab == ab2) {
            return 0;
        }
        if (ab == null) {
            return -1;
        }
        if (ab2 != null) {
            return ab.compareTo(ab2);
        }
        return 1;
    }
}
