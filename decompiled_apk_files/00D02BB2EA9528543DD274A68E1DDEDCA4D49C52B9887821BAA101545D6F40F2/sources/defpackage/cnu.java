package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.auto.sdk.nav.state.CarInstrumentClusterConfig;
import com.google.android.apps.auto.sdk.nav.state.NavigationSummary;
import com.google.android.apps.auto.sdk.nav.state.TurnEvent;
/* compiled from: PG */
/* renamed from: cnu  reason: default package */
/* loaded from: classes5.dex */
public final class cnu extends cla implements IInterface {
    public cnu(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.nav.state.INavigationStateCallback");
    }

    public final void e(NavigationSummary navigationSummary) {
        Parcel a = a();
        clc.e(a, navigationSummary);
        Sj(1, a);
    }

    public final void f(TurnEvent turnEvent) {
        Parcel a = a();
        clc.e(a, turnEvent);
        Sj(2, a);
    }

    public final CarInstrumentClusterConfig g() {
        Parcel Si = Si(3, a());
        CarInstrumentClusterConfig carInstrumentClusterConfig = (CarInstrumentClusterConfig) clc.d(Si, CarInstrumentClusterConfig.CREATOR);
        Si.recycle();
        return carInstrumentClusterConfig;
    }
}
