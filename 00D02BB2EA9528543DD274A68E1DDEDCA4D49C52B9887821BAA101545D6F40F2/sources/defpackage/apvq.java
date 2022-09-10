package defpackage;

import java.util.Comparator;
/* renamed from: apvq  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class apvq implements Comparator {
    static final Comparator a = new apvq();

    private apvq() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((ilo) obj).h().i.compareToIgnoreCase(((ilo) obj2).h().i);
    }
}
