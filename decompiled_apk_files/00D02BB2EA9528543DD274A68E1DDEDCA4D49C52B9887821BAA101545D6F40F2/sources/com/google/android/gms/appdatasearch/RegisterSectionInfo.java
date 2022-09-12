package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RegisterSectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterSectionInfo> CREATOR = new cmqb();
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final Feature[] g;
    public final String h;
    public final ScoringConfig i;

    public RegisterSectionInfo(String str, String str2, boolean z, int i, boolean z2, String str3, Feature[] featureArr, String str4, ScoringConfig scoringConfig) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = str3;
        this.g = featureArr;
        this.h = str4;
        this.i = scoringConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterSectionInfo)) {
            return false;
        }
        RegisterSectionInfo registerSectionInfo = (RegisterSectionInfo) obj;
        return this.c == registerSectionInfo.c && this.d == registerSectionInfo.d && this.e == registerSectionInfo.e && cnvv.a(this.a, registerSectionInfo.a) && cnvv.a(this.b, registerSectionInfo.b) && cnvv.a(this.f, registerSectionInfo.f) && cnvv.a(this.h, registerSectionInfo.h) && cnvv.a(this.i, registerSectionInfo.i) && Arrays.equals(this.g, registerSectionInfo.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.g)), this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.e(parcel, 3, this.c);
        cnwn.g(parcel, 4, this.d);
        cnwn.e(parcel, 5, this.e);
        cnwn.k(parcel, 6, this.f, false);
        cnwn.x(parcel, 7, this.g, i);
        cnwn.k(parcel, 11, this.h, false);
        cnwn.u(parcel, 12, this.i, i);
        cnwn.c(parcel, d);
    }
}
