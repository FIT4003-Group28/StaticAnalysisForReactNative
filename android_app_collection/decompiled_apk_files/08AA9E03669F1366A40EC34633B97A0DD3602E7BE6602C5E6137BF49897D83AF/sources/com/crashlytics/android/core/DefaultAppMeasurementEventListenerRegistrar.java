package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;
import b.a.a.a.c;
import b.a.a.a.l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
class DefaultAppMeasurementEventListenerRegistrar implements AppMeasurementEventListenerRegistrar {
    private static final String ANALYTIC_CLASS = "com.google.android.gms.measurement.AppMeasurement";
    private static final String ANALYTIC_CLASS_ON_EVENT_LISTENER = "com.google.android.gms.measurement.AppMeasurement$OnEventListener";
    private static final String CRASH_ORIGIN = "crash";
    private static final String GET_INSTANCE_METHOD = "getInstance";
    private static final String NAME = "name";
    private static final String PARAMETERS = "parameters";
    private static final String REGISTER_METHOD = "registerOnMeasurementEventListener";
    private final CrashlyticsCore crashlyticsCore;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AppMeasurementEventListenerRegistrar instanceFrom(CrashlyticsCore crashlyticsCore) {
        return new DefaultAppMeasurementEventListenerRegistrar(crashlyticsCore);
    }

    private DefaultAppMeasurementEventListenerRegistrar(CrashlyticsCore crashlyticsCore) {
        this.crashlyticsCore = crashlyticsCore;
    }

    @Override // com.crashlytics.android.core.AppMeasurementEventListenerRegistrar
    public boolean register() {
        Class<?> cls = getClass(ANALYTIC_CLASS);
        if (cls == null) {
            c.h().d(CrashlyticsCore.TAG, "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
            return false;
        }
        Object defaultAppMeasurementEventListenerRegistrar = getInstance(cls);
        if (defaultAppMeasurementEventListenerRegistrar == null) {
            c.h().d(CrashlyticsCore.TAG, "Could not create an instance of Firebase Analytics.");
            return false;
        }
        return invoke(cls, defaultAppMeasurementEventListenerRegistrar, REGISTER_METHOD);
    }

    private Class<?> getClass(String str) {
        try {
            return this.crashlyticsCore.getContext().getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private Object getInstance(Class<?> cls) {
        try {
            return cls.getDeclaredMethod(GET_INSTANCE_METHOD, Context.class).invoke(cls, this.crashlyticsCore.getContext());
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean invoke(Class<?> cls, Object obj, String str) {
        Class<?> cls2 = getClass(ANALYTIC_CLASS_ON_EVENT_LISTENER);
        try {
            cls.getDeclaredMethod(str, cls2).invoke(obj, onEventListenerProxy(cls2));
            return true;
        } catch (IllegalAccessException e) {
            l h = c.h();
            h.d(CrashlyticsCore.TAG, "Cannot access method: " + str, e);
            return false;
        } catch (NoSuchMethodException e2) {
            l h2 = c.h();
            h2.d(CrashlyticsCore.TAG, "Expected method missing: " + str, e2);
            return false;
        } catch (InvocationTargetException e3) {
            l h3 = c.h();
            h3.d(CrashlyticsCore.TAG, "Cannot invoke method: " + str, e3);
            return false;
        }
    }

    private Object onEventListenerProxy(Class cls) {
        return Proxy.newProxyInstance(this.crashlyticsCore.getContext().getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if (objArr.length != 4) {
                    throw new RuntimeException("Unexpected AppMeasurement.OnEventListener signature");
                }
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                Bundle bundle = (Bundle) objArr[2];
                if (str == null || str.equals(DefaultAppMeasurementEventListenerRegistrar.CRASH_ORIGIN)) {
                    return null;
                }
                DefaultAppMeasurementEventListenerRegistrar.writeEventToUserLog(DefaultAppMeasurementEventListenerRegistrar.this.crashlyticsCore, str2, bundle);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeEventToUserLog(CrashlyticsCore crashlyticsCore, String str, Bundle bundle) {
        try {
            crashlyticsCore.log("$A$:" + serializeEvent(str, bundle));
        } catch (JSONException unused) {
            l h = c.h();
            h.d(CrashlyticsCore.TAG, "Unable to serialize Firebase Analytics event; " + str);
        }
    }

    private static String serializeEvent(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(NAME, str);
        jSONObject.put(PARAMETERS, jSONObject2);
        return jSONObject.toString();
    }
}
