package com.teslamotors.plugins.client.c;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SharedVehicleData.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f5314a = new HashSet(Arrays.asList("charge_state", "climate_state", "drive_state", "gui_settings", "vehicle_config", "vehicle_state"));

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f5315b;

    /* renamed from: c  reason: collision with root package name */
    private long f5316c;

    public a(String str) {
        this.f5315b = new JSONObject(str);
    }

    public String toString() {
        return this.f5315b.toString();
    }

    public void a() {
        JSONObject jSONObject = this.f5315b.getJSONObject("vehicle_data");
        jSONObject.put("timestamp", 0);
        jSONObject.put("charge_state", (Object) null);
        jSONObject.put("climate_state", (Object) null);
        jSONObject.put("drive_state", (Object) null);
        jSONObject.put("gui_settings", (Object) null);
        jSONObject.put("vehicle_config", (Object) null);
        jSONObject.put("vehicle_state", (Object) null);
        this.f5315b.put("vehicle_data", jSONObject);
        this.f5316c = System.nanoTime();
    }

    public String b() {
        try {
            return this.f5315b.getString("id");
        } catch (JSONException unused) {
            return "0";
        }
    }

    public String c() {
        try {
            return (String) a("vin", this.f5315b.getJSONObject("vehicle_data"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public void a(boolean z) {
        this.f5315b.put("mobile_access_enabled", z);
    }

    public String d() {
        try {
            String str = (String) a("car_type", this.f5315b.getJSONObject("vehicle_data").getJSONObject("vehicle_config"));
            if (str == null) {
                return str;
            }
            if (!str.equals("s") && !str.equals("s2") && !str.equals("x") && !str.equals("3")) {
                return str;
            }
            return "model" + str;
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean e() {
        try {
            Boolean bool = (Boolean) a("can_accept_navigation_requests", this.f5315b.getJSONObject("vehicle_data").getJSONObject("vehicle_config"));
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (JSONException unused) {
            return false;
        }
    }

    public boolean f() {
        try {
            Boolean bool = (Boolean) a("in_service", this.f5315b.getJSONObject("vehicle_data"));
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (JSONException unused) {
            return false;
        }
    }

    public void b(boolean z) {
        this.f5315b.getJSONObject("vehicle_data").put("in_service", z);
    }

    public String g() {
        try {
            return (String) a("display_name", this.f5315b.getJSONObject("vehicle_data"));
        } catch (JSONException unused) {
            return null;
        }
    }

    private Object a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.get(str);
        } catch (JSONException unused) {
            return null;
        }
    }
}
