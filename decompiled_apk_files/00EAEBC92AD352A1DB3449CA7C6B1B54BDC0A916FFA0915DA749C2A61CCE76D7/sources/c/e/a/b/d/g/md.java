package c.e.a.b.d.g;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
/* loaded from: classes.dex */
public interface md extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j);

    void generateEventId(nd ndVar);

    void getAppInstanceId(nd ndVar);

    void getCachedAppInstanceId(nd ndVar);

    void getConditionalUserProperties(String str, String str2, nd ndVar);

    void getCurrentScreenClass(nd ndVar);

    void getCurrentScreenName(nd ndVar);

    void getGmpAppId(nd ndVar);

    void getMaxUserProperties(String str, nd ndVar);

    void getTestFlag(nd ndVar, int i);

    void getUserProperties(String str, String str2, boolean z, nd ndVar);

    void initForTests(Map map);

    void initialize(c.e.a.b.c.a aVar, f fVar, long j);

    void isDataCollectionEnabled(nd ndVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, nd ndVar, long j);

    void logHealthData(int i, String str, c.e.a.b.c.a aVar, c.e.a.b.c.a aVar2, c.e.a.b.c.a aVar3);

    void onActivityCreated(c.e.a.b.c.a aVar, Bundle bundle, long j);

    void onActivityDestroyed(c.e.a.b.c.a aVar, long j);

    void onActivityPaused(c.e.a.b.c.a aVar, long j);

    void onActivityResumed(c.e.a.b.c.a aVar, long j);

    void onActivitySaveInstanceState(c.e.a.b.c.a aVar, nd ndVar, long j);

    void onActivityStarted(c.e.a.b.c.a aVar, long j);

    void onActivityStopped(c.e.a.b.c.a aVar, long j);

    void performAction(Bundle bundle, nd ndVar, long j);

    void registerOnMeasurementEventListener(c cVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setCurrentScreen(c.e.a.b.c.a aVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(c cVar);

    void setInstanceIdProvider(d dVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, c.e.a.b.c.a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(c cVar);
}
