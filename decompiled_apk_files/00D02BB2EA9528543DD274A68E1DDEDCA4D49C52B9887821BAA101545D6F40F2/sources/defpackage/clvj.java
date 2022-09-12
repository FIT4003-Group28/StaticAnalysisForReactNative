package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: clvj  reason: default package */
/* loaded from: classes5.dex */
public final class clvj {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public clvj(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            clvj clvjVar = (clvj) obj;
            if (this.a == clvjVar.a && this.c == clvjVar.c && this.d == clvjVar.d && Arrays.equals(this.b, clvjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }
}
