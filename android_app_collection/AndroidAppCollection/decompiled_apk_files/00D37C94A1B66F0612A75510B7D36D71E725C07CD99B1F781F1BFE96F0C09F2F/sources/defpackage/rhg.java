package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.Map;
/* compiled from: PG */
/* renamed from: rhg  reason: default package */
/* loaded from: classes4.dex */
public interface rhg extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(rhj rhjVar);

    void getAppInstanceId(rhj rhjVar);

    void getCachedAppInstanceId(rhj rhjVar);

    void getConditionalUserProperties(String str, String str2, rhj rhjVar);

    void getCurrentScreenClass(rhj rhjVar);

    void getCurrentScreenName(rhj rhjVar);

    void getGmpAppId(rhj rhjVar);

    void getMaxUserProperties(String str, rhj rhjVar);

    void getTestFlag(rhj rhjVar, int i);

    void getUserProperties(String str, String str2, boolean z, rhj rhjVar);

    void initForTests(Map map);

    void initialize(rad radVar, InitializationParams initializationParams, long j);

    void isDataCollectionEnabled(rhj rhjVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, rhj rhjVar, long j);

    void logHealthData(int i, String str, rad radVar, rad radVar2, rad radVar3);

    void onActivityCreated(rad radVar, Bundle bundle, long j);

    void onActivityDestroyed(rad radVar, long j);

    void onActivityPaused(rad radVar, long j);

    void onActivityResumed(rad radVar, long j);

    void onActivitySaveInstanceState(rad radVar, rhj rhjVar, long j);

    void onActivityStarted(rad radVar, long j);

    void onActivityStopped(rad radVar, long j);

    void performAction(Bundle bundle, rhj rhjVar, long j);

    void registerOnMeasurementEventListener(rhl rhlVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(rad radVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(rhl rhlVar);

    void setInstanceIdProvider(rhn rhnVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, rad radVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(rhl rhlVar);
}
