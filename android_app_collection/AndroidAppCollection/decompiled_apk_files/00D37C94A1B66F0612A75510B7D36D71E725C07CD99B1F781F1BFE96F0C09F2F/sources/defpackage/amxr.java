package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: amxr  reason: default package */
/* loaded from: classes.dex */
public abstract class amxr implements Comparator {
    public static amxr b(Comparator comparator) {
        if (comparator instanceof amxr) {
            return (amxr) comparator;
        }
        return new amsr(comparator);
    }

    public amxr a() {
        return new amyj(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
