package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.herrevad.NetworkQualityReport;
/* compiled from: PG */
/* renamed from: cofa  reason: default package */
/* loaded from: classes.dex */
public final class cofa extends cla implements IInterface {
    public cofa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
    }

    public final void e(NetworkQualityReport networkQualityReport) {
        Parcel a = a();
        clc.e(a, networkQualityReport);
        Sj(1, a);
    }
}
