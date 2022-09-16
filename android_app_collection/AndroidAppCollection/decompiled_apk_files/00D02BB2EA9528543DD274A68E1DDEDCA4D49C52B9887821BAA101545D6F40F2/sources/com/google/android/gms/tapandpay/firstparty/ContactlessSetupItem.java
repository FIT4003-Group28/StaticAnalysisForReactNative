package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ContactlessSetupItem extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ContactlessSetupItem> CREATOR = new cozz();
    int a;
    int b;

    public ContactlessSetupItem(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ContactlessSetupItem) {
            ContactlessSetupItem contactlessSetupItem = (ContactlessSetupItem) obj;
            if (this.a == contactlessSetupItem.a && this.b == contactlessSetupItem.b) {
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
        b.a("type", Integer.valueOf(this.a));
        b.a("status", Integer.valueOf(this.b));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.c(parcel, d);
    }
}
