package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExperimentTokens extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rsz(15);
    public static final byte[][] a;
    public final String b;
    public final byte[] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final int[] h;
    public final byte[][] i;
    public final int[] j;

    static {
        byte[][] bArr = new byte[0];
        a = bArr;
        new ExperimentTokens("", null, bArr, bArr, bArr, bArr, null, null, null);
    }

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2) {
        this.b = str;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
        this.f = bArr4;
        this.g = bArr5;
        this.h = iArr;
        this.i = bArr6;
        this.j = iArr2;
    }

    private static List a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List b(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            qnm.b(bArr2);
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List c(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new GenericDimension(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void d(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        int length = bArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            qnm.b(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (rug.a(this.b, experimentTokens.b) && Arrays.equals(this.c, experimentTokens.c) && rug.a(b(this.d), b(experimentTokens.d)) && rug.a(b(this.e), b(experimentTokens.e)) && rug.a(b(this.f), b(experimentTokens.f)) && rug.a(b(this.g), b(experimentTokens.g)) && rug.a(a(this.h), a(experimentTokens.h)) && rug.a(b(this.i), b(experimentTokens.i)) && rug.a(c(this.j), c(experimentTokens.j))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String sb;
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str = this.b;
        if (str == null) {
            sb = "null";
        } else {
            StringBuilder sb3 = new StringBuilder(str.length() + 2);
            sb3.append("'");
            sb3.append(str);
            sb3.append("'");
            sb = sb3.toString();
        }
        sb2.append(sb);
        byte[] bArr = this.c;
        sb2.append(", direct==");
        if (bArr == null) {
            sb2.append("null");
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        d(sb2, "GAIA=", this.d);
        sb2.append(", ");
        d(sb2, "PSEUDO=", this.e);
        sb2.append(", ");
        d(sb2, "ALWAYS=", this.f);
        sb2.append(", ");
        d(sb2, "OTHER=", this.g);
        sb2.append(", weak=");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", ");
        d(sb2, "directs=", this.i);
        sb2.append(", genDims=");
        sb2.append(Arrays.toString(c(this.j).toArray()));
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.b);
        tqj.w(parcel, 3, this.c);
        tqj.x(parcel, 4, this.d);
        tqj.x(parcel, 5, this.e);
        tqj.x(parcel, 6, this.f);
        tqj.x(parcel, 7, this.g);
        tqj.z(parcel, 8, this.h);
        tqj.x(parcel, 9, this.i);
        tqj.z(parcel, 10, this.j);
        tqj.n(parcel, m);
    }
}
