package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
/* compiled from: PG */
/* renamed from: cmsz  reason: default package */
/* loaded from: classes5.dex */
public final class cmsz implements Parcelable.Creator<ProxyResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ProxyResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                pendingIntent = (PendingIntent) cnwm.q(parcel, readInt, PendingIntent.CREATOR);
            } else if (b == 3) {
                i3 = cnwm.i(parcel, readInt);
            } else if (b == 4) {
                bundle = cnwm.r(parcel, readInt);
            } else if (b == 5) {
                bArr = cnwm.s(parcel, readInt);
            } else if (b != 1000) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ProxyResponse(i, i2, pendingIntent, i3, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ProxyResponse[] newArray(int i) {
        return new ProxyResponse[i];
    }
}
