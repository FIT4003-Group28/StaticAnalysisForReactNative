package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cnop  reason: default package */
/* loaded from: classes.dex */
public final class cnop implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 3) {
                pendingIntent = (PendingIntent) cnwm.q(parcel, readInt, PendingIntent.CREATOR);
            } else if (b == 4) {
                connectionResult = (ConnectionResult) cnwm.q(parcel, readInt, ConnectionResult.CREATOR);
            } else if (b != 1000) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new Status(i, i2, str, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
