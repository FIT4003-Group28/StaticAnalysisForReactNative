package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cqpw  reason: default package */
/* loaded from: classes5.dex */
public final class cqpw {
    public final int[] a;

    private cqpw(int[] iArr) {
        this.a = iArr;
    }

    public static cqpw a(int[] iArr) {
        return new cqpw(iArr);
    }

    public final boolean equals(@dzsi Object obj) {
        return (obj instanceof cqpw) && Arrays.equals(this.a, ((cqpw) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
