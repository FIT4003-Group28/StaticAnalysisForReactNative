package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UploadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UploadRequest> CREATOR = new coqp();
    public final Account a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    @dzsi
    public final String f;

    public UploadRequest(Account account, String str, long j, long j2, long j3, @dzsi String str2) {
        this.a = account;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str2;
    }

    public UploadRequest(coqo coqoVar) {
        this.a = coqoVar.a;
        this.b = coqoVar.b;
        this.c = coqoVar.c;
        this.d = coqoVar.d;
        this.e = coqoVar.e;
        this.f = coqoVar.f;
    }

    public static coqo a(Account account, String str, long j) {
        return new coqo(account, str, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadRequest)) {
            return false;
        }
        UploadRequest uploadRequest = (UploadRequest) obj;
        return this.a.equals(uploadRequest.a) && this.b.equals(uploadRequest.b) && cnvv.a(Long.valueOf(this.c), Long.valueOf(uploadRequest.c)) && this.d == uploadRequest.d && this.e == uploadRequest.e && cnvv.a(this.f, uploadRequest.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), this.f});
    }

    public final String toString() {
        String a = coqs.a(this.a);
        String str = this.b;
        long j = this.c;
        long j2 = this.d;
        long j3 = this.e;
        String str2 = this.f;
        int length = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 186 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("UploadRequest{, mAccount=");
        sb.append(a);
        sb.append(", mReason='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mDurationMillis=");
        sb.append(j);
        sb.append(", mMovingLatencyMillis=");
        sb.append(j2);
        sb.append(", mStationaryLatencyMillis=");
        sb.append(j3);
        sb.append(", mAppSpecificKey='");
        sb.append(str2);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.a, i);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.h(parcel, 4, this.c);
        cnwn.h(parcel, 5, this.d);
        cnwn.h(parcel, 6, this.e);
        cnwn.k(parcel, 7, this.f, false);
        cnwn.c(parcel, d);
    }
}
