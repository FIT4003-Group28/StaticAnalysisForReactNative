package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem;
import com.google.android.gms.tapandpay.firstparty.GetContactlessSetupStatusResponse;
/* compiled from: PG */
/* renamed from: cpag  reason: default package */
/* loaded from: classes5.dex */
public final class cpag implements Parcelable.Creator<GetContactlessSetupStatusResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetContactlessSetupStatusResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ContactlessSetupItem[] contactlessSetupItemArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                contactlessSetupItemArr = (ContactlessSetupItem[]) cnwm.z(parcel, readInt, ContactlessSetupItem.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new GetContactlessSetupStatusResponse(contactlessSetupItemArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetContactlessSetupStatusResponse[] newArray(int i) {
        return new GetContactlessSetupStatusResponse[i];
    }
}
