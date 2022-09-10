package defpackage;

import java.util.Comparator;
/* renamed from: aiib  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aiib implements Comparator {
    static final Comparator a = new aiib();

    private aiib() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((aiig) obj).b.compareTo(((aiig) obj2).b);
    }
}
