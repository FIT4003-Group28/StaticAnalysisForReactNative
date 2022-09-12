package defpackage;

import java.util.Comparator;
/* renamed from: cnki  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cnki implements Comparator {
    static final Comparator a = new cnki();

    private cnki() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (((dujl) obj).b > ((dujl) obj2).b ? 1 : (((dujl) obj).b == ((dujl) obj2).b ? 0 : -1));
    }
}
