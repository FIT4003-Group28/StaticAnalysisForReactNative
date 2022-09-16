package defpackage;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AddListenerRequest;
/* compiled from: PG */
/* renamed from: cphj  reason: default package */
/* loaded from: classes5.dex */
public final class cphj implements Parcelable.Creator<AddListenerRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AddListenerRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        IBinder iBinder = null;
        IntentFilter[] intentFilterArr = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                iBinder = cnwm.p(parcel, readInt);
            } else if (b == 3) {
                intentFilterArr = (IntentFilter[]) cnwm.z(parcel, readInt, IntentFilter.CREATOR);
            } else if (b == 4) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                str2 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new AddListenerRequest(iBinder, intentFilterArr, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AddListenerRequest[] newArray(int i) {
        return new AddListenerRequest[i];
    }
}
