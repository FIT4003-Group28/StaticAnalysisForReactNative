package defpackage;

import java.util.Comparator;
/* renamed from: chrq  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class chrq implements Comparator {
    static final Comparator a = new chrq();

    private chrq() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((dcla) obj2).b() - ((dcla) obj).b();
    }
}
