package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ReportingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ReportingState> CREATOR = new coql();
    public final boolean a;
    public final boolean b;
    public final Integer c;
    public final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public ReportingState(int i, int i2, boolean z, boolean z2, int i3, int i4, Integer num, boolean z3) {
        this.e = i;
        this.f = i2;
        this.a = z;
        this.b = z2;
        this.g = i3;
        this.h = i4;
        this.c = num;
        this.d = z3;
    }

    public final int a() {
        return coqe.b(this.e);
    }

    public final int b() {
        return coqe.b(this.f);
    }

    public final boolean c() {
        return coqe.a(this.e) && coqe.a(this.f);
    }

    public final int d() {
        return coqd.a(this.g);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ReportingState)) {
            return false;
        }
        ReportingState reportingState = (ReportingState) obj;
        return this.e == reportingState.e && this.f == reportingState.f && this.a == reportingState.a && this.b == reportingState.b && this.g == reportingState.g && this.h == reportingState.h && cnvv.a(this.c, reportingState.c) && this.d == reportingState.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.f), Boolean.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.g), Integer.valueOf(this.h), this.c, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        String str;
        Integer num = this.c;
        if (num != null) {
            int intValue = num.intValue();
            StringBuilder sb = new StringBuilder(15);
            sb.append("tag#");
            sb.append(intValue % 20);
            str = sb.toString();
        } else {
            str = "(hidden-from-unauthorized-caller)";
        }
        int i = this.e;
        int i2 = this.f;
        boolean z = this.a;
        boolean z2 = this.b;
        int i3 = this.g;
        int i4 = this.h;
        boolean z3 = this.d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 235);
        sb2.append("ReportingState{mReportingEnabled=");
        sb2.append(i);
        sb2.append(", mHistoryEnabled=");
        sb2.append(i2);
        sb2.append(", mAllowed=");
        sb2.append(z);
        sb2.append(", mActive=");
        sb2.append(z2);
        sb2.append(", mExpectedOptInResult=");
        sb2.append(i3);
        sb2.append(", mExpectedOptInResultAssumingLocationEnabled=");
        sb2.append(i4);
        sb2.append(", mDeviceTag=");
        sb2.append(str);
        sb2.append(", mCanAccessSettings=");
        sb2.append(z3);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, a());
        cnwn.g(parcel, 3, b());
        cnwn.e(parcel, 4, this.a);
        cnwn.e(parcel, 5, this.b);
        cnwn.g(parcel, 7, d());
        cnwn.s(parcel, 8, this.c);
        cnwn.g(parcel, 9, coqd.a(this.h));
        cnwn.e(parcel, 10, this.d);
        cnwn.c(parcel, d);
    }
}
