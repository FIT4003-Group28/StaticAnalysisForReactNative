package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: amss  reason: default package */
/* loaded from: classes.dex */
public final class amss extends amsu {
    public static final amsu g(int i) {
        return i < 0 ? amsu.c : i > 0 ? amsu.d : amsu.b;
    }

    @Override // defpackage.amsu
    public final int a() {
        return 0;
    }

    @Override // defpackage.amsu
    public final amsu b(int i, int i2) {
        return g(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // defpackage.amsu
    public final amsu c(Comparable comparable, Comparable comparable2) {
        return g(comparable.compareTo(comparable2));
    }

    @Override // defpackage.amsu
    public final amsu d(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.amsu
    public final amsu e(boolean z, boolean z2) {
        return g(anhh.b(z, z2));
    }

    @Override // defpackage.amsu
    public final amsu f(boolean z, boolean z2) {
        return g(anhh.b(z2, z));
    }
}
