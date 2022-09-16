package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class r4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f7641a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f7642b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7643c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f7644d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ m4 f7645e;

    public r4(m4 m4Var, String str, Bundle bundle) {
        this.f7645e = m4Var;
        com.google.android.gms.common.internal.s.b(str);
        this.f7641a = str;
        this.f7642b = new Bundle();
    }

    private final String b(Bundle bundle) {
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str2);
                    jSONObject.put("v", String.valueOf(obj));
                    if (obj instanceof String) {
                        str = "s";
                    } else if (obj instanceof Long) {
                        str = "l";
                    } else if (obj instanceof Double) {
                        str = "d";
                    } else {
                        this.f7645e.c().s().a("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                    }
                    jSONObject.put("t", str);
                    jSONArray.put(jSONObject);
                } catch (JSONException e2) {
                    this.f7645e.c().s().a("Cannot serialize bundle value to SharedPreferences", e2);
                }
            }
        }
        return jSONArray.toString();
    }

    public final Bundle a() {
        if (!this.f7643c) {
            this.f7643c = true;
            String string = this.f7645e.s().getString(this.f7641a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            char c2 = 65535;
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode == 115 && string3.equals("s")) {
                                        c2 = 0;
                                    }
                                } else if (string3.equals("l")) {
                                    c2 = 2;
                                }
                            } else if (string3.equals("d")) {
                                c2 = 1;
                            }
                            if (c2 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c2 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c2 != 2) {
                                this.f7645e.c().s().a("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f7645e.c().s().a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f7644d = bundle;
                } catch (JSONException unused2) {
                    this.f7645e.c().s().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f7644d == null) {
                this.f7644d = this.f7642b;
            }
        }
        return this.f7644d;
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f7645e.s().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f7641a);
        } else {
            edit.putString(this.f7641a, b(bundle));
        }
        edit.apply();
        this.f7644d = bundle;
    }
}
