package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.RemoteMessage;
/* compiled from: PG */
/* renamed from: devb  reason: default package */
/* loaded from: classes6.dex */
public final class devb implements Parcelable.Creator<RemoteMessage> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RemoteMessage createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                bundle = cnwm.r(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
