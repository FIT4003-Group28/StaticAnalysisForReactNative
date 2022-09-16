package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: baa  reason: default package */
/* loaded from: classes2.dex */
public final class baa {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public baa(int i, byte[] bArr, int i2, int i3) {
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
            baa baaVar = (baa) obj;
            if (this.a == baaVar.a && this.c == baaVar.c && this.d == baaVar.d && Arrays.equals(this.b, baaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }
}
