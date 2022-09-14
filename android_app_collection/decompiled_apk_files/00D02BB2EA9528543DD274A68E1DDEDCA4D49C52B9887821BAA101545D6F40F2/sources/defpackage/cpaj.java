package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.GetNotificationSettingsResponse;
import com.google.android.gms.tapandpay.firstparty.NotificationSettings;
/* compiled from: PG */
/* renamed from: cpaj  reason: default package */
/* loaded from: classes5.dex */
public final class cpaj implements Parcelable.Creator<GetNotificationSettingsResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetNotificationSettingsResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        NotificationSettings notificationSettings = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                notificationSettings = (NotificationSettings) cnwm.q(parcel, readInt, NotificationSettings.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new GetNotificationSettingsResponse(notificationSettings);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetNotificationSettingsResponse[] newArray(int i) {
        return new GetNotificationSettingsResponse[i];
    }
}
