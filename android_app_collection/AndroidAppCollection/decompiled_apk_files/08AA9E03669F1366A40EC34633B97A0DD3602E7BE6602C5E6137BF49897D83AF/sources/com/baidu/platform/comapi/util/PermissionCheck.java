package com.baidu.platform.comapi.util;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.baidu.lbsapi.auth.h;
import com.baidu.lbsapi.auth.m;
import com.teslamotors.plugins.biometricauthentication.BiometricAuthenticationModule;
import java.util.Hashtable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PermissionCheck {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2108a = "PermissionCheck";

    /* renamed from: b  reason: collision with root package name */
    private static Context f2109b;

    /* renamed from: c  reason: collision with root package name */
    private static Hashtable<String, String> f2110c;

    /* renamed from: d  reason: collision with root package name */
    private static h f2111d;
    private static m e;
    private static c f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements m {
        private a() {
        }

        @Override // com.baidu.lbsapi.auth.m
        public void a(int i, String str) {
            if (str == null) {
                return;
            }
            b bVar = new b();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("status")) {
                    bVar.f2112a = jSONObject.optInt("status");
                }
                if (jSONObject.has("appid")) {
                    bVar.f2114c = jSONObject.optString("appid");
                }
                if (jSONObject.has("uid")) {
                    bVar.f2113b = jSONObject.optString("uid");
                }
                if (jSONObject.has(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE)) {
                    bVar.f2115d = jSONObject.optString(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE);
                }
                if (jSONObject.has("token")) {
                    bVar.e = jSONObject.optString("token");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (PermissionCheck.f == null) {
                return;
            }
            PermissionCheck.f.a(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2112a = 0;

        /* renamed from: b  reason: collision with root package name */
        public String f2113b = "-1";

        /* renamed from: c  reason: collision with root package name */
        public String f2114c = "-1";

        /* renamed from: d  reason: collision with root package name */
        public String f2115d = "";
        public String e;

        public String toString() {
            return String.format("errorcode: %d uid: %s appid %s msg: %s", Integer.valueOf(this.f2112a), this.f2113b, this.f2114c, this.f2115d);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(b bVar);
    }

    public static void destory() {
        f = null;
        f2109b = null;
        e = null;
    }

    public static void init(Context context) {
        String str;
        f2109b = context;
        if (f2110c == null) {
            f2110c = new Hashtable<>();
        }
        if (f2111d == null) {
            f2111d = h.a(f2109b);
        }
        if (e == null) {
            e = new a();
        }
        try {
            str = context.getPackageManager().getPackageInfo(f2109b.getPackageName(), 0).applicationInfo.loadLabel(f2109b.getPackageManager()).toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            str = "";
        }
        Log.d("auth info", "mcode: " + com.baidu.platform.comapi.util.a.a(f2109b));
        Bundle a2 = f.a();
        f2110c.put("mb", a2.getString("mb"));
        f2110c.put("os", a2.getString("os"));
        f2110c.put("sv", a2.getString("sv"));
        f2110c.put("imt", "1");
        f2110c.put("net", a2.getString("net"));
        f2110c.put("cpu", a2.getString("cpu"));
        f2110c.put("glr", a2.getString("glr"));
        f2110c.put("glv", a2.getString("glv"));
        f2110c.put("resid", a2.getString("resid"));
        f2110c.put("appid", "-1");
        f2110c.put("ver", "1");
        f2110c.put("screen", String.format("(%d,%d)", Integer.valueOf(a2.getInt("screen_x")), Integer.valueOf(a2.getInt("screen_y"))));
        f2110c.put("dpi", String.format("(%d,%d)", Integer.valueOf(a2.getInt("dpi_x")), Integer.valueOf(a2.getInt("dpi_y"))));
        f2110c.put("pcn", a2.getString("pcn"));
        f2110c.put("cuid", a2.getString("cuid"));
        f2110c.put("name", str);
    }

    public static synchronized int permissionCheck() {
        synchronized (PermissionCheck.class) {
            if (f2111d != null && e != null && f2109b != null) {
                return f2111d.a(false, "lbs_androidsdk", f2110c, e);
            }
            return 0;
        }
    }

    public static void setPermissionCheckResultListener(c cVar) {
        f = cVar;
    }
}
