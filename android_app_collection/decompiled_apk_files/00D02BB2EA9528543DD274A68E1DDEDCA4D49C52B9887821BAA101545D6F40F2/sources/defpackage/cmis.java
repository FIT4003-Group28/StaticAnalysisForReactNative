package defpackage;

import java.util.Comparator;
/* renamed from: cmis  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cmis implements Comparator {
    static final Comparator a = new cmis();

    private cmis() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (((cmij) obj).b > ((cmij) obj2).b ? 1 : (((cmij) obj).b == ((cmij) obj2).b ? 0 : -1));
    }
}
