package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
/* compiled from: PG */
/* renamed from: cont  reason: default package */
/* loaded from: classes5.dex */
public final class cont implements Parcelable.Creator<LocationRequestUpdateData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequestUpdateData createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        LocationRequestInternal locationRequestInternal = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 2:
                    locationRequestInternal = (LocationRequestInternal) cnwm.q(parcel, readInt, LocationRequestInternal.CREATOR);
                    break;
                case 3:
                    iBinder = cnwm.p(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) cnwm.q(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = cnwm.p(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = cnwm.p(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new LocationRequestUpdateData(i, locationRequestInternal, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequestUpdateData[] newArray(int i) {
        return new LocationRequestUpdateData[i];
    }
}
