package com.google.android.gms.tapandpay.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class QuickAccessWalletConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<QuickAccessWalletConfig> CREATOR = new cpbt();
    public int a;
    public int b;
    public int c;
    public String[] d;

    private QuickAccessWalletConfig() {
    }

    public QuickAccessWalletConfig(int i, int i2, int i3, String[] strArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickAccessWalletConfig) {
            QuickAccessWalletConfig quickAccessWalletConfig = (QuickAccessWalletConfig) obj;
            if (cnvv.a(Integer.valueOf(this.a), Integer.valueOf(quickAccessWalletConfig.a)) && cnvv.a(Integer.valueOf(this.b), Integer.valueOf(quickAccessWalletConfig.b)) && cnvv.a(Integer.valueOf(this.c), Integer.valueOf(quickAccessWalletConfig.c)) && Arrays.equals(this.d, quickAccessWalletConfig.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.g(parcel, 3, this.c);
        cnwn.v(parcel, 5, this.d);
        cnwn.c(parcel, d);
    }
}
