package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DocumentSection extends AbstractSafeParcelable {
    public final String b;
    final RegisterSectionInfo c;
    public final int d;
    public final byte[] e;
    public static final int a = Integer.parseInt("-1");
    public static final Parcelable.Creator CREATOR = new qhh(3);

    static {
        qhj qhjVar = new qhj();
        qhjVar.b = "blob";
        String str = qhjVar.a;
        String str2 = qhjVar.b;
        List list = qhjVar.c;
        new RegisterSectionInfo(str, str2, true, 1, false, null, (Feature[]) list.toArray(new Feature[list.size()]), null, null);
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo, int i, byte[] bArr) {
        int i2 = a;
        boolean z = true;
        if (i != i2 && qhi.a(i) == null) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid section type ");
        sb.append(i);
        qnm.d(z, sb.toString());
        this.b = str;
        this.c = registerSectionInfo;
        this.d = i;
        this.e = bArr;
        String str2 = null;
        if (i != i2 && qhi.a(i) == null) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Invalid section type ");
            sb2.append(i);
            str2 = sb2.toString();
        } else if (str != null && bArr != null) {
            str2 = "Both content and blobContent set";
        }
        if (str2 == null) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.b);
        tqj.E(parcel, 3, this.c, i);
        tqj.s(parcel, 4, this.d);
        tqj.w(parcel, 5, this.e);
        tqj.n(parcel, m);
    }
}
