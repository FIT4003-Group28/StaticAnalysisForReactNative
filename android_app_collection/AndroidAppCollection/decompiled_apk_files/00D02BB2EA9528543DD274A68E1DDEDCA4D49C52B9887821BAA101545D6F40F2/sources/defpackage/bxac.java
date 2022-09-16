package defpackage;

import java.util.Comparator;
/* renamed from: bxac  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bxac implements Comparator {
    static final Comparator a = new bxac();

    private bxac() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return bxaf.h.compare(bxaf.b((dwfl) obj2), bxaf.b((dwfl) obj));
    }
}
