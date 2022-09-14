package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem;
/* compiled from: PG */
/* renamed from: cozz  reason: default package */
/* loaded from: classes5.dex */
public final class cozz implements Parcelable.Creator<ContactlessSetupItem> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContactlessSetupItem createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                i2 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ContactlessSetupItem(i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContactlessSetupItem[] newArray(int i) {
        return new ContactlessSetupItem[i];
    }
}
