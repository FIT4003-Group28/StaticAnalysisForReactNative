package defpackage;

import android.content.ComponentName;
import java.math.BigDecimal;
/* compiled from: PG */
/* renamed from: bwfn  reason: default package */
/* loaded from: classes4.dex */
public final class bwfn {
    public final ComponentName a;
    public final long b;
    public final float c;

    public bwfn(ComponentName componentName, long j, float f) {
        this.a = componentName;
        this.b = j;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bwfn bwfnVar = (bwfn) obj;
        ComponentName componentName = this.a;
        if (componentName == null) {
            if (bwfnVar.a != null) {
                return false;
            }
        } else if (!componentName.equals(bwfnVar.a)) {
            return false;
        }
        return this.b == bwfnVar.b && ((double) Math.abs(this.c - bwfnVar.c)) > 1.0E-30d;
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        int hashCode = componentName == null ? 0 : componentName.hashCode();
        long j = this.b;
        return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "[; activity:" + this.a + "; time:" + this.b + "; weight:" + new BigDecimal(this.c) + "]";
    }
}
