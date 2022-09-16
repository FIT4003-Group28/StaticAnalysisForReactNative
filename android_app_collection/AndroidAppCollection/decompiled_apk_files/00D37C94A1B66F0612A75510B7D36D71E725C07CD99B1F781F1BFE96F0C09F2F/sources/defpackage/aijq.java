package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aijq  reason: default package */
/* loaded from: classes.dex */
public final class aijq {
    public final int a;

    public aijq() {
        this.a = ahfo.c(1);
    }

    public aijq(int i) {
        this.a = i;
    }

    public aijq(int... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i |= ahfo.c(iArr[i2]);
        }
        this.a = i;
    }

    public static aijq a() {
        return new aijq();
    }

    public final boolean b() {
        return (this.a & ahfo.c(2)) != 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof aijq) && this.a == ((aijq) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }
}
