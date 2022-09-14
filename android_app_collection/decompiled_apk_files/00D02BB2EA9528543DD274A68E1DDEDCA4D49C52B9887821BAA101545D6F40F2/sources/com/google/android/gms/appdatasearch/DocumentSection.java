package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DocumentSection extends AbstractSafeParcelable {
    public static final RegisterSectionInfo b;
    public final String c;
    final RegisterSectionInfo d;
    public final int e;
    public final byte[] f;
    public static final int a = Integer.parseInt("-1");
    public static final Parcelable.Creator<DocumentSection> CREATOR = new cmpw();

    static {
        cmqa cmqaVar = new cmqa();
        cmqaVar.b = "blob";
        String str = cmqaVar.a;
        String str2 = cmqaVar.b;
        List<Feature> list = cmqaVar.c;
        b = new RegisterSectionInfo(str, str2, true, 1, false, null, (Feature[]) list.toArray(new Feature[list.size()]), null, null);
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo, int i, byte[] bArr) {
        int i2 = a;
        boolean z = true;
        if (i != i2 && cmpz.a(i) == null) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid section type ");
        sb.append(i);
        cnwc.e(z, sb.toString());
        this.c = str;
        this.d = registerSectionInfo;
        this.e = i;
        this.f = bArr;
        String str2 = null;
        if (i != i2 && cmpz.a(i) == null) {
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
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.c, false);
        cnwn.u(parcel, 3, this.d, i);
        cnwn.g(parcel, 4, this.e);
        cnwn.l(parcel, 5, this.f, false);
        cnwn.c(parcel, d);
    }
}
