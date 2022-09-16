package defpackage;

import java.util.Comparator;
/* renamed from: zsq  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class zsq implements Comparator {
    static final Comparator a = new zsq();

    private zsq() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((zso) obj).d().top, ((zso) obj2).d().top);
    }
}
