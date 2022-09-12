package defpackage;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.awareness.snapshot.internal.HeadphoneStateImpl;
import com.google.android.gms.awareness.snapshot.internal.NetworkStateImpl;
import com.google.android.gms.awareness.snapshot.internal.PowerStateImpl;
import com.google.android.gms.awareness.snapshot.internal.ScreenStateImpl;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.awareness.snapshot.internal.TimeIntervalsImpl;
import com.google.android.gms.awareness.snapshot.internal.WeatherImpl;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;
/* compiled from: PG */
/* renamed from: cmvi  reason: default package */
/* loaded from: classes5.dex */
public final class cmvi implements Parcelable.Creator<Snapshot> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Snapshot createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ActivityRecognitionResult activityRecognitionResult = null;
        BeaconStateImpl beaconStateImpl = null;
        HeadphoneStateImpl headphoneStateImpl = null;
        Location location = null;
        NetworkStateImpl networkStateImpl = null;
        DataHolder dataHolder = null;
        PowerStateImpl powerStateImpl = null;
        ScreenStateImpl screenStateImpl = null;
        WeatherImpl weatherImpl = null;
        TimeIntervalsImpl timeIntervalsImpl = null;
        ContextData contextData = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    activityRecognitionResult = (ActivityRecognitionResult) cnwm.q(parcel, readInt, ActivityRecognitionResult.CREATOR);
                    break;
                case 3:
                    beaconStateImpl = (BeaconStateImpl) cnwm.q(parcel, readInt, BeaconStateImpl.CREATOR);
                    break;
                case 4:
                    headphoneStateImpl = (HeadphoneStateImpl) cnwm.q(parcel, readInt, HeadphoneStateImpl.CREATOR);
                    break;
                case 5:
                    location = (Location) cnwm.q(parcel, readInt, Location.CREATOR);
                    break;
                case 6:
                    networkStateImpl = (NetworkStateImpl) cnwm.q(parcel, readInt, NetworkStateImpl.CREATOR);
                    break;
                case 7:
                    dataHolder = (DataHolder) cnwm.q(parcel, readInt, DataHolder.CREATOR);
                    break;
                case 8:
                    powerStateImpl = (PowerStateImpl) cnwm.q(parcel, readInt, PowerStateImpl.CREATOR);
                    break;
                case 9:
                    screenStateImpl = (ScreenStateImpl) cnwm.q(parcel, readInt, ScreenStateImpl.CREATOR);
                    break;
                case 10:
                    weatherImpl = (WeatherImpl) cnwm.q(parcel, readInt, WeatherImpl.CREATOR);
                    break;
                case 11:
                    timeIntervalsImpl = (TimeIntervalsImpl) cnwm.q(parcel, readInt, TimeIntervalsImpl.CREATOR);
                    break;
                case 12:
                    contextData = (ContextData) cnwm.q(parcel, readInt, ContextData.CREATOR);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new Snapshot(activityRecognitionResult, beaconStateImpl, headphoneStateImpl, location, networkStateImpl, dataHolder, powerStateImpl, screenStateImpl, weatherImpl, timeIntervalsImpl, contextData);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Snapshot[] newArray(int i) {
        return new Snapshot[i];
    }
}
