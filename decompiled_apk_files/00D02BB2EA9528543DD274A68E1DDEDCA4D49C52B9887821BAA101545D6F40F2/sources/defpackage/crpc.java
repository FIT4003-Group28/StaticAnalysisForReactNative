package defpackage;

import java.util.Comparator;
/* renamed from: crpc  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class crpc implements Comparator {
    static final Comparator a = new crpc();

    private crpc() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.valueOf(crpe.a((djos) obj)).compareTo(Long.valueOf(crpe.a((djos) obj2)));
    }
}
