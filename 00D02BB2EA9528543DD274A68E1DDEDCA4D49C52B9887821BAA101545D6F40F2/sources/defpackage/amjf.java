package defpackage;

import java.util.Comparator;
/* renamed from: amjf  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class amjf implements Comparator {
    static final Comparator a = new amjf();

    private amjf() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((amkk) obj).a().h, ((amkk) obj2).a().h);
    }
}
