package defpackage;

import java.math.BigInteger;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: axmh  reason: default package */
/* loaded from: classes2.dex */
public final class axmh {
    public byte[] a = new byte[0];
    public axmc[] b = null;

    public final int a() {
        int length;
        int length2 = this.a.length;
        axmc[] axmcVarArr = this.b;
        return (axmcVarArr == null || (length = axmcVarArr.length) <= 0) ? length2 : length2 + 2 + (length * 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axmh axmhVar = (axmh) obj;
        if (!new BigInteger(this.a).equals(new BigInteger(axmhVar.a))) {
            return false;
        }
        axmc[] axmcVarArr = this.b;
        return axmcVarArr == null ? axmhVar.b == null : Arrays.equals(axmcVarArr, axmhVar.b);
    }

    public final int hashCode() {
        byte[] bArr = this.a;
        int i = 0;
        int hashCode = (bArr != null ? Arrays.hashCode(bArr) : 0) * 31;
        axmc[] axmcVarArr = this.b;
        if (axmcVarArr != null) {
            i = Arrays.hashCode(axmcVarArr);
        }
        return hashCode + i;
    }

    public final String toString() {
        String a = cvp.a(this.a);
        String arrays = Arrays.toString(this.b);
        StringBuilder sb = new StringBuilder(a.length() + 18 + String.valueOf(arrays).length());
        sb.append("Entry{iv=");
        sb.append(a);
        sb.append(", pairs=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
