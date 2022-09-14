package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CheckConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CheckConsentRequest> CREATOR = new cpdc();
    public final int a;
    public final int[] b;
    public final String c;
    public final String d;

    public CheckConsentRequest(int i, int[] iArr, String str, String str2) {
        this.a = i;
        this.b = iArr;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof CheckConsentRequest) {
            CheckConsentRequest checkConsentRequest = (CheckConsentRequest) obj;
            if (this.a == checkConsentRequest.a && Arrays.equals(this.b, checkConsentRequest.b) && cnvv.a(this.c, checkConsentRequest.c) && cnvv.a(this.d, checkConsentRequest.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.q(parcel, 3, this.b);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.k(parcel, 5, this.d, false);
        cnwn.c(parcel, d);
    }
}
