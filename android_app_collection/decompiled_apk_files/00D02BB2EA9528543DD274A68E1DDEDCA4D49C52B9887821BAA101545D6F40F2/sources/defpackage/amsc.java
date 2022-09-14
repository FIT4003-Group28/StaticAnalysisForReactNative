package defpackage;

import java.util.Comparator;
/* renamed from: amsc  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class amsc implements Comparator {
    static final Comparator a = new amsc();

    private amsc() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        amse amseVar = (amse) obj;
        amse amseVar2 = (amse) obj2;
        if (!amseVar.a() || amseVar2.a()) {
            return (amseVar.a() || !amseVar2.a()) ? 0 : 1;
        }
        return -1;
    }
}
