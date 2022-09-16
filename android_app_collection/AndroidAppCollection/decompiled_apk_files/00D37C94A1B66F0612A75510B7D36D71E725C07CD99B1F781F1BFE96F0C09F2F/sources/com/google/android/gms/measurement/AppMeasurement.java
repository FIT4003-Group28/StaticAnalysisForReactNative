package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {
    private static volatile AppMeasurement a;
    private final rhc b;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            qnm.b(bundle);
            this.mAppId = (String) rgf.g(bundle, "app_id", String.class, null);
            this.mOrigin = (String) rgf.g(bundle, "origin", String.class, null);
            this.mName = (String) rgf.g(bundle, "name", String.class, null);
            this.mValue = rgf.g(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) rgf.g(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) rgf.g(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) rgf.g(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) rgf.g(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) rgf.g(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) rgf.g(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) rgf.g(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) rgf.g(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) rgf.g(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) rgf.g(bundle, "active", Boolean.class, false)).booleanValue();
            this.mCreationTimestamp = ((Long) rgf.g(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) rgf.g(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(rlx rlxVar) {
        this.b = new rha(rlxVar);
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        rnh rnhVar;
        if (a == null) {
            synchronized (AppMeasurement.class) {
                if (a == null) {
                    try {
                        rnhVar = (rnh) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    } catch (ClassNotFoundException | Exception unused) {
                        rnhVar = null;
                    }
                    if (rnhVar == null) {
                        a = new AppMeasurement(rlx.k(context, new InitializationParams(0L, 0L, true, null, null, null, null, null), null));
                    } else {
                        a = new AppMeasurement(rnhVar);
                    }
                }
            }
        }
        return a;
    }

    public void beginAdUnitExposure(String str) {
        this.b.i(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.b.j(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.b.k(str);
    }

    public long generateEventId() {
        return this.b.b();
    }

    public String getAppInstanceId() {
        return this.b.c();
    }

    public List getConditionalUserProperties(String str, String str2) {
        List<Bundle> g = this.b.g(str, str2);
        ArrayList arrayList = new ArrayList(g == null ? 0 : g.size());
        for (Bundle bundle : g) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.b.d();
    }

    public String getCurrentScreenName() {
        return this.b.e();
    }

    public String getGmpAppId() {
        return this.b.f();
    }

    public int getMaxUserProperties(String str) {
        return this.b.a(str);
    }

    protected Map getUserProperties(String str, String str2, boolean z) {
        return this.b.h(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.b.l(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        qnm.b(conditionalUserProperty);
        rhc rhcVar = this.b;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            rgf.h(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        rhcVar.m(bundle);
    }

    public AppMeasurement(rnh rnhVar) {
        this.b = new rhb(rnhVar);
    }
}
