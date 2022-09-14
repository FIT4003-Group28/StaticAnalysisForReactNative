package io.invertase.firebase.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static j f10338a = new j();

    private Bundle b() {
        ApplicationInfo applicationInfo;
        try {
            Context a2 = io.invertase.firebase.app.a.a();
            PackageManager packageManager = a2.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(a2.getPackageName(), 128)) != null) {
                return applicationInfo.metaData;
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static j c() {
        return f10338a;
    }

    public WritableMap a() {
        Bundle b2 = b();
        WritableMap createMap = Arguments.createMap();
        if (b2 == null) {
            return createMap;
        }
        for (String str : b2.keySet()) {
            if (str.startsWith("rnfirebase_")) {
                Object obj = b2.get(str);
                if (obj == null) {
                    createMap.putNull(str);
                } else if (obj instanceof String) {
                    createMap.putString(str, (String) obj);
                } else if (obj instanceof Boolean) {
                    createMap.putBoolean(str, ((Boolean) obj).booleanValue());
                }
            }
        }
        return createMap;
    }

    public boolean a(String str, boolean z) {
        Bundle b2 = b();
        if (b2 == null) {
            return z;
        }
        return b2.getBoolean("rnfirebase_" + str, z);
    }
}
