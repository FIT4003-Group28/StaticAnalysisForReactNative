package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import c.e.a.b.d.g.f;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.measurement.internal.d5;
import com.google.android.gms.measurement.internal.d6;
import com.google.android.gms.measurement.internal.h7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: d  reason: collision with root package name */
    private static volatile AppMeasurement f7139d;

    /* renamed from: a  reason: collision with root package name */
    private final d5 f7140a;

    /* renamed from: b  reason: collision with root package name */
    private final h7 f7141b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7142c;

    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            s.a(bundle);
            this.mAppId = (String) d6.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) d6.a(bundle, "origin", String.class, null);
            this.mName = (String) d6.a(bundle, "name", String.class, null);
            this.mValue = d6.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) d6.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) d6.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) d6.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) d6.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) d6.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) d6.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) d6.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) d6.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) d6.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) d6.a(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, false)).booleanValue();
            this.mCreationTimestamp = ((Long) d6.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) d6.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }

        final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                d6.a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    private AppMeasurement(d5 d5Var) {
        s.a(d5Var);
        this.f7140a = d5Var;
        this.f7141b = null;
        this.f7142c = false;
    }

    private AppMeasurement(h7 h7Var) {
        s.a(h7Var);
        this.f7141b = h7Var;
        this.f7140a = null;
        this.f7142c = true;
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f7139d == null) {
            synchronized (AppMeasurement.class) {
                if (f7139d == null) {
                    h7 a2 = a(context, null);
                    if (a2 != null) {
                        f7139d = new AppMeasurement(a2);
                    } else {
                        f7139d = new AppMeasurement(d5.a(context, new f(0L, 0L, true, null, null, null, null), null));
                    }
                }
            }
        }
        return f7139d;
    }

    private static h7 a(Context context, Bundle bundle) {
        try {
            return (h7) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
        } catch (ClassNotFoundException | Exception unused) {
            return null;
        }
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return a(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.f7142c) {
            this.f7141b.a(str);
        } else {
            this.f7140a.H().a(str, this.f7140a.b().b());
        }
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f7142c) {
            this.f7141b.a(str, str2, bundle);
        } else {
            this.f7140a.t().c(str, str2, bundle);
        }
    }

    @Keep
    protected void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.f7142c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f7140a.t().a(str, str2, str3, bundle);
        throw null;
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.f7142c) {
            this.f7141b.c(str);
        } else {
            this.f7140a.H().b(str, this.f7140a.b().b());
        }
    }

    @Keep
    public long generateEventId() {
        return this.f7142c ? this.f7141b.g() : this.f7140a.u().s();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f7142c ? this.f7141b.l() : this.f7140a.t().H();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> a2 = this.f7142c ? this.f7141b.a(str, str2) : this.f7140a.t().a(str, str2);
        ArrayList arrayList = new ArrayList(a2 == null ? 0 : a2.size());
        for (Bundle bundle : a2) {
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    @Keep
    protected List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.f7142c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f7140a.t().a(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f7142c ? this.f7141b.j() : this.f7140a.t().K();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f7142c ? this.f7141b.f() : this.f7140a.t().J();
    }

    @Keep
    public String getGmpAppId() {
        return this.f7142c ? this.f7141b.k() : this.f7140a.t().L();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.f7142c) {
            return this.f7141b.b(str);
        }
        this.f7140a.t();
        s.b(str);
        return 25;
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f7142c ? this.f7141b.a(str, str2, z) : this.f7140a.t().a(str, str2, z);
    }

    @Keep
    protected Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.f7142c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f7140a.t().a(str, str2, str3, z);
        throw null;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f7142c) {
            this.f7141b.b(str, str2, bundle);
        } else {
            this.f7140a.t().a(str, str2, bundle);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        s.a(conditionalUserProperty);
        if (this.f7142c) {
            this.f7141b.a(conditionalUserProperty.a());
        } else {
            this.f7140a.t().a(conditionalUserProperty.a());
        }
    }

    @Keep
    protected void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        s.a(conditionalUserProperty);
        if (this.f7142c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f7140a.t().b(conditionalUserProperty.a());
        throw null;
    }
}
