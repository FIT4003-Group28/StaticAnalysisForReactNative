package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: cnmm  reason: default package */
/* loaded from: classes.dex */
public final class cnmm implements Parcelable.Creator<ConnectionResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConnectionResult createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                pendingIntent = (PendingIntent) cnwm.q(parcel, readInt, PendingIntent.CREATOR);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ConnectionResult(i, i2, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConnectionResult[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
