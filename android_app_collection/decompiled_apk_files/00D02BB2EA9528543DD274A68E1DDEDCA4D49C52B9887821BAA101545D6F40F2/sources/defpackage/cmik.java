package defpackage;

import java.util.Comparator;
/* renamed from: cmik  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cmik implements Comparator {
    static final Comparator a = new cmik();

    private cmik() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((cmil) obj).b.b, ((cmil) obj2).b.b);
    }
}
