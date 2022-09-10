package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetNotificationSettingsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetNotificationSettingsResponse> CREATOR = new cpaj();
    NotificationSettings a;

    public GetNotificationSettingsResponse(NotificationSettings notificationSettings) {
        this.a = notificationSettings;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.a, i);
        cnwn.c(parcel, d);
    }
}
