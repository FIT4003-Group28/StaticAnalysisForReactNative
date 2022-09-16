package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
class k implements e {

    /* renamed from: a  reason: collision with root package name */
    private final a f6707a;

    /* renamed from: b  reason: collision with root package name */
    private final i f6708b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, m> f6709c;

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f6710a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f6711b = null;

        a(Context context) {
            this.f6710a = context;
        }

        private Map<String, String> a() {
            if (this.f6711b == null) {
                this.f6711b = a(this.f6710a);
            }
            return this.f6711b;
        }

        private Map<String, String> a(Context context) {
            Bundle b2 = b(context);
            if (b2 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : b2.keySet()) {
                Object obj = b2.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private static Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        d a(String str) {
            String format;
            String format2;
            String str2 = a().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                e = e2;
                format2 = String.format("Class %s is not found.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (IllegalAccessException e3) {
                e = e3;
                format2 = String.format("Could not instantiate %s.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (InstantiationException e4) {
                e = e4;
                format2 = String.format("Could not instantiate %s.", str2);
                Log.w("BackendRegistry", format2, e);
                return null;
            } catch (NoSuchMethodException e5) {
                e = e5;
                format = String.format("Could not instantiate %s", str2);
                Log.w("BackendRegistry", format, e);
                return null;
            } catch (InvocationTargetException e6) {
                e = e6;
                format = String.format("Could not instantiate %s", str2);
                Log.w("BackendRegistry", format, e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, i iVar) {
        this(new a(context), iVar);
    }

    k(a aVar, i iVar) {
        this.f6709c = new HashMap();
        this.f6707a = aVar;
        this.f6708b = iVar;
    }

    @Override // com.google.android.datatransport.runtime.backends.e
    public synchronized m a(String str) {
        if (this.f6709c.containsKey(str)) {
            return this.f6709c.get(str);
        }
        d a2 = this.f6707a.a(str);
        if (a2 == null) {
            return null;
        }
        m create = a2.create(this.f6708b.a(str));
        this.f6709c.put(str, create);
        return create;
    }
}
