package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
/* compiled from: PG */
/* renamed from: cnwg  reason: default package */
/* loaded from: classes5.dex */
public final class cnwg implements Parcelable.Creator<RootTelemetryConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RootTelemetryConfiguration createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                z = cnwm.g(parcel, readInt);
            } else if (b == 3) {
                z2 = cnwm.g(parcel, readInt);
            } else if (b == 4) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                i3 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new RootTelemetryConfiguration(i, z, z2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RootTelemetryConfiguration[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
