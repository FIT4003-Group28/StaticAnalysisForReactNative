package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class NotificationSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NotificationSettings> CREATOR = new cpap();
    boolean a;
    boolean b;
    boolean c;
    int d;

    public NotificationSettings(boolean z, boolean z2, boolean z3, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NotificationSettings) {
            NotificationSettings notificationSettings = (NotificationSettings) obj;
            if (this.a == notificationSettings.a && this.b == notificationSettings.b && this.c == notificationSettings.c && this.d == notificationSettings.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("transactions", Boolean.valueOf(this.a));
        b.a("plasticTransactions", Boolean.valueOf(this.b));
        b.a("promotions", Boolean.valueOf(this.c));
        b.a("bitMask", Integer.valueOf(this.d));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.e(parcel, 1, this.a);
        cnwn.e(parcel, 2, this.b);
        cnwn.e(parcel, 3, this.c);
        cnwn.g(parcel, 4, this.d);
        cnwn.c(parcel, d);
    }
}
