package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.Map;
/* compiled from: PG */
/* renamed from: rhe  reason: default package */
/* loaded from: classes4.dex */
public final class rhe extends dvc implements rhg {
    public rhe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // defpackage.rhg
    public final void beginAdUnitExposure(String str, long j) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeLong(j);
        px(23, pv);
    }

    @Override // defpackage.rhg
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeString(str2);
        dve.g(pv, bundle);
        px(9, pv);
    }

    @Override // defpackage.rhg
    public final void clearMeasurementEnabled(long j) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void endAdUnitExposure(String str, long j) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeLong(j);
        px(24, pv);
    }

    @Override // defpackage.rhg
    public final void generateEventId(rhj rhjVar) {
        Parcel pv = pv();
        dve.i(pv, rhjVar);
        px(22, pv);
    }

    @Override // defpackage.rhg
    public final void getAppInstanceId(rhj rhjVar) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void getCachedAppInstanceId(rhj rhjVar) {
        Parcel pv = pv();
        dve.i(pv, rhjVar);
        px(19, pv);
    }

    @Override // defpackage.rhg
    public final void getConditionalUserProperties(String str, String str2, rhj rhjVar) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeString(str2);
        dve.i(pv, rhjVar);
        px(10, pv);
    }

    @Override // defpackage.rhg
    public final void getCurrentScreenClass(rhj rhjVar) {
        Parcel pv = pv();
        dve.i(pv, rhjVar);
        px(17, pv);
    }

    @Override // defpackage.rhg
    public final void getCurrentScreenName(rhj rhjVar) {
        Parcel pv = pv();
        dve.i(pv, rhjVar);
        px(16, pv);
    }

    @Override // defpackage.rhg
    public final void getGmpAppId(rhj rhjVar) {
        Parcel pv = pv();
        dve.i(pv, rhjVar);
        px(21, pv);
    }

    @Override // defpackage.rhg
    public final void getMaxUserProperties(String str, rhj rhjVar) {
        Parcel pv = pv();
        pv.writeString(str);
        dve.i(pv, rhjVar);
        px(6, pv);
    }

    @Override // defpackage.rhg
    public final void getTestFlag(rhj rhjVar, int i) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void getUserProperties(String str, String str2, boolean z, rhj rhjVar) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeString(str2);
        dve.e(pv, z);
        dve.i(pv, rhjVar);
        px(5, pv);
    }

    @Override // defpackage.rhg
    public final void initForTests(Map map) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void initialize(rad radVar, InitializationParams initializationParams, long j) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        dve.g(pv, initializationParams);
        pv.writeLong(j);
        px(1, pv);
    }

    @Override // defpackage.rhg
    public final void isDataCollectionEnabled(rhj rhjVar) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeString(str2);
        dve.g(pv, bundle);
        dve.e(pv, z);
        dve.e(pv, true);
        pv.writeLong(j);
        px(2, pv);
    }

    @Override // defpackage.rhg
    public final void logEventAndBundle(String str, String str2, Bundle bundle, rhj rhjVar, long j) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void logHealthData(int i, String str, rad radVar, rad radVar2, rad radVar3) {
        Parcel pv = pv();
        pv.writeInt(5);
        pv.writeString("Error with data collection. Data lost.");
        dve.i(pv, radVar);
        dve.i(pv, radVar2);
        dve.i(pv, radVar3);
        px(33, pv);
    }

    @Override // defpackage.rhg
    public final void onActivityCreated(rad radVar, Bundle bundle, long j) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        dve.g(pv, bundle);
        pv.writeLong(j);
        px(27, pv);
    }

    @Override // defpackage.rhg
    public final void onActivityDestroyed(rad radVar, long j) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        pv.writeLong(j);
        px(28, pv);
    }

    @Override // defpackage.rhg
    public final void onActivityPaused(rad radVar, long j) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        pv.writeLong(j);
        px(29, pv);
    }

    @Override // defpackage.rhg
    public final void onActivityResumed(rad radVar, long j) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        pv.writeLong(j);
        px(30, pv);
    }

    @Override // defpackage.rhg
    public final void onActivitySaveInstanceState(rad radVar, rhj rhjVar, long j) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        dve.i(pv, rhjVar);
        pv.writeLong(j);
        px(31, pv);
    }

    @Override // defpackage.rhg
    public final void onActivityStarted(rad radVar, long j) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        pv.writeLong(j);
        px(25, pv);
    }

    @Override // defpackage.rhg
    public final void onActivityStopped(rad radVar, long j) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        pv.writeLong(j);
        px(26, pv);
    }

    @Override // defpackage.rhg
    public final void performAction(Bundle bundle, rhj rhjVar, long j) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void registerOnMeasurementEventListener(rhl rhlVar) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void resetAnalyticsData(long j) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel pv = pv();
        dve.g(pv, bundle);
        pv.writeLong(j);
        px(8, pv);
    }

    @Override // defpackage.rhg
    public final void setConsent(Bundle bundle, long j) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void setConsentThirdParty(Bundle bundle, long j) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void setCurrentScreen(rad radVar, String str, String str2, long j) {
        Parcel pv = pv();
        dve.i(pv, radVar);
        pv.writeString(str);
        pv.writeString(str2);
        pv.writeLong(j);
        px(15, pv);
    }

    @Override // defpackage.rhg
    public final void setDataCollectionEnabled(boolean z) {
        Parcel pv = pv();
        dve.e(pv, false);
        px(39, pv);
    }

    @Override // defpackage.rhg
    public final void setDefaultEventParameters(Bundle bundle) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void setEventInterceptor(rhl rhlVar) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void setInstanceIdProvider(rhn rhnVar) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel pv = pv();
        dve.e(pv, z);
        pv.writeLong(j);
        px(11, pv);
    }

    @Override // defpackage.rhg
    public final void setMinimumSessionDuration(long j) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void setSessionTimeoutDuration(long j) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void setUserId(String str, long j) {
        throw null;
    }

    @Override // defpackage.rhg
    public final void setUserProperty(String str, String str2, rad radVar, boolean z, long j) {
        Parcel pv = pv();
        pv.writeString("fcm");
        pv.writeString("_ln");
        dve.i(pv, radVar);
        dve.e(pv, true);
        pv.writeLong(j);
        px(4, pv);
    }

    @Override // defpackage.rhg
    public final void unregisterOnMeasurementEventListener(rhl rhlVar) {
        throw null;
    }
}
