package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;
/* compiled from: PG */
/* renamed from: cnwx  reason: default package */
/* loaded from: classes5.dex */
public final class cnwx extends cla implements IInterface {
    public cnwx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void e(TelemetryData telemetryData) {
        Parcel a = a();
        clc.e(a, telemetryData);
        Sj(1, a);
    }
}
