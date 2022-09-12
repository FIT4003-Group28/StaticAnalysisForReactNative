package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.gmm.locationsharing.interprocess.api.ReportingState;
/* compiled from: PG */
/* renamed from: ahyx  reason: default package */
/* loaded from: classes2.dex */
public final class ahyx extends cla implements IInterface {
    public ahyx(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gmm.locationsharing.interprocess.api.IReportingStateListener");
    }

    public final void e(ReportingState reportingState) {
        Parcel a = a();
        clc.e(a, reportingState);
        Sj(2, a);
    }
}
