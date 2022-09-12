package defpackage;

import java.util.Comparator;
/* renamed from: bnhq  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bnhq implements Comparator {
    static final Comparator a = new bnhq();

    private bnhq() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((dwzu) obj).c, ((dwzu) obj2).c);
    }
}
