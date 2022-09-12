package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class InAppCvmConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InAppCvmConfig> CREATOR = new cpam();
    int a;
    int b;

    public InAppCvmConfig(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InAppCvmConfig) {
            InAppCvmConfig inAppCvmConfig = (InAppCvmConfig) obj;
            if (this.a == inAppCvmConfig.a && this.b == inAppCvmConfig.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("cdcvmExpirtaionInSecs", Integer.valueOf(this.a));
        b.a("cdcvmTransactionLimit", Integer.valueOf(this.b));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.g(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
