package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* compiled from: PG */
/* renamed from: cnup  reason: default package */
/* loaded from: classes5.dex */
public final class cnup implements Parcelable.Creator<ConnectionTelemetryConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConnectionTelemetryConfiguration createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                rootTelemetryConfiguration = (RootTelemetryConfiguration) cnwm.q(parcel, readInt, RootTelemetryConfiguration.CREATOR);
            } else if (b == 2) {
                z = cnwm.g(parcel, readInt);
            } else if (b == 3) {
                z2 = cnwm.g(parcel, readInt);
            } else if (b == 4) {
                iArr = cnwm.u(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConnectionTelemetryConfiguration[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
