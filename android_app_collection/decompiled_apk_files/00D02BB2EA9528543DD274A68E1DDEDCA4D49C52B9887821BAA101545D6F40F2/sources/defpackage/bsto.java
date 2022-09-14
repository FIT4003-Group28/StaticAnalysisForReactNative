package defpackage;

import java.util.Comparator;
/* renamed from: bsto  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bsto implements Comparator {
    static final Comparator a = new bsto();

    private bsto() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = bstq.ak;
        return ((bxzt) obj).c().compareTo(((bxzt) obj2).c());
    }
}
