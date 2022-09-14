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
/* loaded from: classes5.dex */
public class ExperimentTokens extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ExperimentTokens> CREATOR = new coxl();
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

    private static void a(StringBuilder sb, String str, byte[][] bArr) {
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
            cnwc.a(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    private static List<String> b(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] bArr2 : bArr) {
            cnwc.a(bArr2);
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List<Integer> c(int[] iArr) {
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

    private static List<GenericDimension> d(int[] iArr) {
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

    public final boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (coya.a(this.b, experimentTokens.b) && Arrays.equals(this.c, experimentTokens.c) && coya.a(b(this.d), b(experimentTokens.d)) && coya.a(b(this.e), b(experimentTokens.e)) && coya.a(b(this.f), b(experimentTokens.f)) && coya.a(b(this.g), b(experimentTokens.g)) && coya.a(c(this.h), c(experimentTokens.h)) && coya.a(b(this.i), b(experimentTokens.i)) && coya.a(d(this.j), d(experimentTokens.j))) {
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
        sb2.append(", ");
        byte[] bArr = this.c;
        sb2.append("direct=");
        sb2.append("=");
        if (bArr == null) {
            sb2.append("null");
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        a(sb2, "GAIA=", this.d);
        sb2.append(", ");
        a(sb2, "PSEUDO=", this.e);
        sb2.append(", ");
        a(sb2, "ALWAYS=", this.f);
        sb2.append(", ");
        a(sb2, "OTHER=", this.g);
        sb2.append(", ");
        sb2.append("weak=");
        sb2.append(Arrays.toString(this.h));
        sb2.append(", ");
        a(sb2, "directs=", this.i);
        sb2.append(", ");
        sb2.append("genDims=");
        sb2.append(Arrays.toString(d(this.j).toArray()));
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.l(parcel, 3, this.c, false);
        cnwn.n(parcel, 4, this.d);
        cnwn.n(parcel, 5, this.e);
        cnwn.n(parcel, 6, this.f);
        cnwn.n(parcel, 7, this.g);
        cnwn.q(parcel, 8, this.h);
        cnwn.n(parcel, 9, this.i);
        cnwn.q(parcel, 10, this.j);
        cnwn.c(parcel, d);
    }
}
