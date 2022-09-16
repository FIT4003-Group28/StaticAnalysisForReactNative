package defpackage;

import java.util.Comparator;
/* renamed from: ysr  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ysr implements Comparator {
    static final Comparator a = new ysr();

    private ysr() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Double.compare(((ytb) obj).i(), ((ytb) obj2).i());
    }
}
