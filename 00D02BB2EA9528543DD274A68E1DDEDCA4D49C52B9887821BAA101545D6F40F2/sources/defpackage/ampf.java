package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ampf  reason: default package */
/* loaded from: classes.dex */
final class ampf {
    final float a;
    final float b;
    final float c;
    final int d;
    final int e;
    final int[] f;
    private final int g;

    public ampf(float f, alxo alxoVar, alxo alxoVar2, int i) {
        this.a = f;
        alxl[] alxlVarArr = alxoVar2.o;
        int length = alxlVarArr.length;
        float f2 = length >= i ? alxlVarArr[i].c : 0.0f;
        this.c = f2;
        int i2 = 0;
        int i3 = length >= i ? alxlVarArr[i].a : 0;
        this.e = i3;
        alxl[] alxlVarArr2 = alxoVar.o;
        int[] iArr = null;
        if (alxlVarArr2.length > i) {
            alxl alxlVar = alxlVarArr2[i];
            this.b = alxlVar.c;
            this.d = alxlVar.a;
            int[] iArr2 = alxlVar.d;
            this.f = iArr2.length != 0 ? iArr2 : iArr;
        } else {
            this.b = 0.0f;
            this.d = 0;
            this.f = null;
        }
        int floatToIntBits = ((((((((Float.floatToIntBits(f) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(f2)) * 31) + this.d) * 31) + i3) * 31;
        int[] iArr3 = this.f;
        this.g = floatToIntBits + (iArr3 != null ? Arrays.hashCode(iArr3) : i2);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ampf)) {
            return false;
        }
        ampf ampfVar = (ampf) obj;
        return this.d == ampfVar.d && this.e == ampfVar.e && Float.compare(ampfVar.a, this.a) == 0 && Float.compare(ampfVar.b, this.b) == 0 && Float.compare(ampfVar.c, this.c) == 0 && Arrays.equals(this.f, ampfVar.f);
    }

    public final int hashCode() {
        return this.g;
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.d);
        String hexString2 = Integer.toHexString(this.e);
        float f = this.b;
        float f2 = this.c;
        float f3 = this.a;
        String arrays = Arrays.toString(this.f);
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 61 + String.valueOf(hexString2).length() + String.valueOf(arrays).length());
        sb.append("c:");
        sb.append(hexString);
        sb.append("-> ");
        sb.append(hexString2);
        sb.append(" w:");
        sb.append(f);
        sb.append("->");
        sb.append(f2);
        sb.append(" s:");
        sb.append(f3);
        sb.append(" d:");
        sb.append(arrays);
        return sb.toString();
    }
}
