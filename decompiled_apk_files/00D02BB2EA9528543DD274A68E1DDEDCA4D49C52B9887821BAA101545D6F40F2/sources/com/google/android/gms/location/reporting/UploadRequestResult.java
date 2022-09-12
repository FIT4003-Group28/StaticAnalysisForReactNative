package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class UploadRequestResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UploadRequestResult> CREATOR = new coqq();
    public final int a;
    public final long b;

    public UploadRequestResult(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UploadRequestResult)) {
            return false;
        }
        UploadRequestResult uploadRequestResult = (UploadRequestResult) obj;
        return this.b == uploadRequestResult.b && this.a == uploadRequestResult.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        StringBuilder sb = new StringBuilder(66);
        sb.append("Result{, mResultCode=");
        sb.append(i);
        sb.append(", mRequestId=");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.h(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
