package defpackage;

import java.io.Serializable;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: amsr  reason: default package */
/* loaded from: classes.dex */
final class amsr extends amxr implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;

    public amsr(Comparator comparator) {
        comparator.getClass();
        this.a = comparator;
    }

    @Override // defpackage.amxr, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof amsr)) {
            return false;
        }
        return this.a.equals(((amsr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
