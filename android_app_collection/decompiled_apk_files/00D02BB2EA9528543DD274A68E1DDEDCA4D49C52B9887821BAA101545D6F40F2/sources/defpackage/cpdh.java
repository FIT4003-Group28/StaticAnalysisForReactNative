package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cpdh  reason: default package */
/* loaded from: classes5.dex */
public final class cpdh implements Parcelable.Creator<DeviceDataUploadOptedInAccountsParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceDataUploadOptedInAccountsParcelable createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                arrayList = cnwm.y(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList2 = cnwm.y(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new DeviceDataUploadOptedInAccountsParcelable(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceDataUploadOptedInAccountsParcelable[] newArray(int i) {
        return new DeviceDataUploadOptedInAccountsParcelable[i];
    }
}
