package defpackage;

import java.util.Comparator;
/* renamed from: cmgk  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cmgk implements Comparator {
    static final Comparator a = new cmgk();

    private cmgk() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((cmgl) obj).b, ((cmgl) obj2).b);
    }
}
