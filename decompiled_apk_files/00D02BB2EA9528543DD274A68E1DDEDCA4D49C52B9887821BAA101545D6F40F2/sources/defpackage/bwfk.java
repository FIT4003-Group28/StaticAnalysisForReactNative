package defpackage;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;
/* compiled from: PG */
/* renamed from: bwfk  reason: default package */
/* loaded from: classes4.dex */
public final class bwfk implements Comparable<bwfk> {
    public final ResolveInfo a;
    public float b;

    public bwfk(ResolveInfo resolveInfo) {
        this.a = resolveInfo;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(bwfk bwfkVar) {
        return Float.compare(bwfkVar.b, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && ((double) Math.abs(this.b - ((bwfk) obj).b)) > 1.0E-30d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + 31;
    }

    public final String toString() {
        return "[resolveInfo:" + this.a + "; weight:" + new BigDecimal(this.b) + "]";
    }
}
