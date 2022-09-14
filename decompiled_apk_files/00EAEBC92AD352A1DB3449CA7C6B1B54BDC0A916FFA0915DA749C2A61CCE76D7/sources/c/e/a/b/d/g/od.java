package c.e.a.b.d.g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class od extends a implements md {
    /* JADX INFO: Access modifiers changed from: package-private */
    public od(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // c.e.a.b.d.g.md
    public final void beginAdUnitExposure(String str, long j) {
        Parcel e2 = e();
        e2.writeString(str);
        e2.writeLong(j);
        b(23, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel e2 = e();
        e2.writeString(str);
        e2.writeString(str2);
        b0.a(e2, bundle);
        b(9, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void endAdUnitExposure(String str, long j) {
        Parcel e2 = e();
        e2.writeString(str);
        e2.writeLong(j);
        b(24, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void generateEventId(nd ndVar) {
        Parcel e2 = e();
        b0.a(e2, ndVar);
        b(22, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void getCachedAppInstanceId(nd ndVar) {
        Parcel e2 = e();
        b0.a(e2, ndVar);
        b(19, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void getConditionalUserProperties(String str, String str2, nd ndVar) {
        Parcel e2 = e();
        e2.writeString(str);
        e2.writeString(str2);
        b0.a(e2, ndVar);
        b(10, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void getCurrentScreenClass(nd ndVar) {
        Parcel e2 = e();
        b0.a(e2, ndVar);
        b(17, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void getCurrentScreenName(nd ndVar) {
        Parcel e2 = e();
        b0.a(e2, ndVar);
        b(16, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void getGmpAppId(nd ndVar) {
        Parcel e2 = e();
        b0.a(e2, ndVar);
        b(21, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void getMaxUserProperties(String str, nd ndVar) {
        Parcel e2 = e();
        e2.writeString(str);
        b0.a(e2, ndVar);
        b(6, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void getUserProperties(String str, String str2, boolean z, nd ndVar) {
        Parcel e2 = e();
        e2.writeString(str);
        e2.writeString(str2);
        b0.a(e2, z);
        b0.a(e2, ndVar);
        b(5, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void initialize(c.e.a.b.c.a aVar, f fVar, long j) {
        Parcel e2 = e();
        b0.a(e2, aVar);
        b0.a(e2, fVar);
        e2.writeLong(j);
        b(1, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel e2 = e();
        e2.writeString(str);
        e2.writeString(str2);
        b0.a(e2, bundle);
        b0.a(e2, z);
        b0.a(e2, z2);
        e2.writeLong(j);
        b(2, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void logHealthData(int i, String str, c.e.a.b.c.a aVar, c.e.a.b.c.a aVar2, c.e.a.b.c.a aVar3) {
        Parcel e2 = e();
        e2.writeInt(i);
        e2.writeString(str);
        b0.a(e2, aVar);
        b0.a(e2, aVar2);
        b0.a(e2, aVar3);
        b(33, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void onActivityCreated(c.e.a.b.c.a aVar, Bundle bundle, long j) {
        Parcel e2 = e();
        b0.a(e2, aVar);
        b0.a(e2, bundle);
        e2.writeLong(j);
        b(27, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void onActivityDestroyed(c.e.a.b.c.a aVar, long j) {
        Parcel e2 = e();
        b0.a(e2, aVar);
        e2.writeLong(j);
        b(28, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void onActivityPaused(c.e.a.b.c.a aVar, long j) {
        Parcel e2 = e();
        b0.a(e2, aVar);
        e2.writeLong(j);
        b(29, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void onActivityResumed(c.e.a.b.c.a aVar, long j) {
        Parcel e2 = e();
        b0.a(e2, aVar);
        e2.writeLong(j);
        b(30, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void onActivitySaveInstanceState(c.e.a.b.c.a aVar, nd ndVar, long j) {
        Parcel e2 = e();
        b0.a(e2, aVar);
        b0.a(e2, ndVar);
        e2.writeLong(j);
        b(31, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void onActivityStarted(c.e.a.b.c.a aVar, long j) {
        Parcel e2 = e();
        b0.a(e2, aVar);
        e2.writeLong(j);
        b(25, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void onActivityStopped(c.e.a.b.c.a aVar, long j) {
        Parcel e2 = e();
        b0.a(e2, aVar);
        e2.writeLong(j);
        b(26, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void registerOnMeasurementEventListener(c cVar) {
        Parcel e2 = e();
        b0.a(e2, cVar);
        b(35, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void resetAnalyticsData(long j) {
        Parcel e2 = e();
        e2.writeLong(j);
        b(12, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel e2 = e();
        b0.a(e2, bundle);
        e2.writeLong(j);
        b(8, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void setCurrentScreen(c.e.a.b.c.a aVar, String str, String str2, long j) {
        Parcel e2 = e();
        b0.a(e2, aVar);
        e2.writeString(str);
        e2.writeString(str2);
        e2.writeLong(j);
        b(15, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void setDataCollectionEnabled(boolean z) {
        Parcel e2 = e();
        b0.a(e2, z);
        b(39, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel e2 = e();
        b0.a(e2, z);
        e2.writeLong(j);
        b(11, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void setMinimumSessionDuration(long j) {
        Parcel e2 = e();
        e2.writeLong(j);
        b(13, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void setSessionTimeoutDuration(long j) {
        Parcel e2 = e();
        e2.writeLong(j);
        b(14, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void setUserId(String str, long j) {
        Parcel e2 = e();
        e2.writeString(str);
        e2.writeLong(j);
        b(7, e2);
    }

    @Override // c.e.a.b.d.g.md
    public final void setUserProperty(String str, String str2, c.e.a.b.c.a aVar, boolean z, long j) {
        Parcel e2 = e();
        e2.writeString(str);
        e2.writeString(str2);
        b0.a(e2, aVar);
        b0.a(e2, z);
        e2.writeLong(j);
        b(4, e2);
    }
}
