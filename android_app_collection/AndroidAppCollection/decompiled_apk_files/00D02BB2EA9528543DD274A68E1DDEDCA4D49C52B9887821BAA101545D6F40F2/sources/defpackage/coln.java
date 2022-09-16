package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.RemoveGeofencingRequest;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: coln  reason: default package */
/* loaded from: classes5.dex */
public final class coln implements Parcelable.Creator<RemoveGeofencingRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RemoveGeofencingRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList<String> arrayList = null;
        String str = "";
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                arrayList = cnwm.y(parcel, readInt);
            } else if (b == 2) {
                pendingIntent = (PendingIntent) cnwm.q(parcel, readInt, PendingIntent.CREATOR);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new RemoveGeofencingRequest(arrayList, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RemoveGeofencingRequest[] newArray(int i) {
        return new RemoveGeofencingRequest[i];
    }
}
