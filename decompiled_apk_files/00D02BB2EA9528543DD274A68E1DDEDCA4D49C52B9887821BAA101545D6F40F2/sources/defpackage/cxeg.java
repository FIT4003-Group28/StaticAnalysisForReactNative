package defpackage;

import java.util.Comparator;
/* renamed from: cxeg  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cxeg implements Comparator {
    static final Comparator a = new cxeg();

    private cxeg() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (int) (((cxdy) obj).c - ((cxdy) obj2).c);
    }
}
