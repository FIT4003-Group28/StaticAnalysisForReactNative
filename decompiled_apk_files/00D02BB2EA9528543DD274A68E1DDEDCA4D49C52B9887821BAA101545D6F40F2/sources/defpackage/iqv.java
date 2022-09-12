package defpackage;

import java.util.Comparator;
/* renamed from: iqv  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class iqv implements Comparator {
    static final Comparator a = new iqv();

    private iqv() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Integer) obj2).compareTo((Integer) obj);
    }
}
