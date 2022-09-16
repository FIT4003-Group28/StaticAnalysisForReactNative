package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class InStoreCvmConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InStoreCvmConfig> CREATOR = new cpan();
    boolean a;
    int b;
    int c;
    int d;

    public InStoreCvmConfig(boolean z, int i, int i2, int i3) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InStoreCvmConfig) {
            InStoreCvmConfig inStoreCvmConfig = (InStoreCvmConfig) obj;
            if (this.a == inStoreCvmConfig.a && this.b == inStoreCvmConfig.b && this.d == inStoreCvmConfig.d && this.c == inStoreCvmConfig.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.c)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("requireCdcvmPassing", Boolean.valueOf(this.a));
        b.a("cdcvmExpirtaionInSecs", Integer.valueOf(this.b));
        b.a("unlockedTapLimit", Integer.valueOf(this.c));
        b.a("cdcvmTapLimit", Integer.valueOf(this.d));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.e(parcel, 2, this.a);
        cnwn.g(parcel, 3, this.b);
        cnwn.g(parcel, 4, this.c);
        cnwn.g(parcel, 5, this.d);
        cnwn.c(parcel, d);
    }
}
