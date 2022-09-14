package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
/* compiled from: PG */
/* renamed from: cnuo  reason: default package */
/* loaded from: classes.dex */
public final class cnuo implements Parcelable.Creator<ConnectionInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConnectionInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                bundle = cnwm.r(parcel, readInt);
            } else if (b == 2) {
                featureArr = (Feature[]) cnwm.z(parcel, readInt, Feature.CREATOR);
            } else if (b == 3) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) cnwm.q(parcel, readInt, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new ConnectionInfo(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConnectionInfo[] newArray(int i) {
        return new ConnectionInfo[i];
    }
}
