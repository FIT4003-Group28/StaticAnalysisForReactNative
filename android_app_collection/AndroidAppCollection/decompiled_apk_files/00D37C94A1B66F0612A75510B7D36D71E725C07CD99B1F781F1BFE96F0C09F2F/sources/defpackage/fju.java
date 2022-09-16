package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: fju  reason: default package */
/* loaded from: classes3.dex */
public final class fju {
    public final int a;
    public final int b;

    private fju(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static fju a(int i) {
        return new fju(i, 0);
    }

    public static fju b() {
        return new fju(8, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fju)) {
            return false;
        }
        fju fjuVar = (fju) obj;
        return this.a == fjuVar.a && this.b == fjuVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
