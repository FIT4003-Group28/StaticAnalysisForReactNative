package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Snapshot extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Snapshot> CREATOR = new cmvi();
    public final ActivityRecognitionResult a;
    public final BeaconStateImpl b;
    public final HeadphoneStateImpl c;
    public final Location d;
    public final NetworkStateImpl e;
    public final DataHolder f;
    public final PowerStateImpl g;
    public final ScreenStateImpl h;
    public final WeatherImpl i;
    public final TimeIntervalsImpl j;
    public final ContextData k;

    public Snapshot(ActivityRecognitionResult activityRecognitionResult, BeaconStateImpl beaconStateImpl, HeadphoneStateImpl headphoneStateImpl, Location location, NetworkStateImpl networkStateImpl, DataHolder dataHolder, PowerStateImpl powerStateImpl, ScreenStateImpl screenStateImpl, WeatherImpl weatherImpl, TimeIntervalsImpl timeIntervalsImpl, ContextData contextData) {
        this.a = activityRecognitionResult;
        this.b = beaconStateImpl;
        this.c = headphoneStateImpl;
        this.d = location;
        this.e = networkStateImpl;
        this.f = dataHolder;
        this.g = powerStateImpl;
        this.h = screenStateImpl;
        this.i = weatherImpl;
        this.j = timeIntervalsImpl;
        this.k = contextData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.a, i);
        cnwn.u(parcel, 3, this.b, i);
        cnwn.u(parcel, 4, this.c, i);
        cnwn.u(parcel, 5, this.d, i);
        cnwn.u(parcel, 6, this.e, i);
        cnwn.u(parcel, 7, this.f, i);
        cnwn.u(parcel, 8, this.g, i);
        cnwn.u(parcel, 9, this.h, i);
        cnwn.u(parcel, 10, this.i, i);
        cnwn.u(parcel, 11, this.j, i);
        cnwn.u(parcel, 12, this.k, i);
        cnwn.c(parcel, d);
    }
}
