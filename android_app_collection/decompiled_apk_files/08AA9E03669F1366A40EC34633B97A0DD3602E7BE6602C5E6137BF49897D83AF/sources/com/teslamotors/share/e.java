package com.teslamotors.share;

import android.content.Context;
import com.teslamotors.share.c;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: VehicleClient.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private Context f5452a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context) {
        this.f5452a = context;
    }

    public boolean a() {
        return i().k() != null;
    }

    public boolean b() {
        return i().t();
    }

    public boolean c() {
        JSONObject l = i().l();
        return (l != null && "VEHICLE".equals(l.optString("type"))) && j() != null;
    }

    public boolean d() {
        return j() != null && j().e();
    }

    public long e() {
        if (j() != null) {
            return Long.valueOf(j().b()).longValue();
        }
        return 0L;
    }

    public boolean f() {
        return j() != null && j().f();
    }

    public String g() {
        String d2;
        if (j() == null) {
            return null;
        }
        String g = j().g();
        String c2 = j().c();
        if ((g != null && (c2 == null || !g.equals(c2.substring(c2.length() - 6)))) || (d2 = j().d()) == null) {
            return g;
        }
        if (d2.equals("model3") || (c2 != null && c2.charAt(3) == '3')) {
            g = this.f5452a.getString(c.d.vehicle_default_name_model_3);
        }
        if (d2.equals("modelx") || (c2 != null && c2.charAt(3) == 'X')) {
            g = this.f5452a.getString(c.d.vehicle_default_name_model_x);
        }
        return (d2.equals("models") || (c2 != null && c2.charAt(3) == 'S')) ? this.f5452a.getString(c.d.vehicle_default_name_model_s) : g;
    }

    public void a(boolean z) {
        if (j() != null) {
            try {
                j().a(z);
            } catch (JSONException unused) {
            }
        }
    }

    public void b(boolean z) {
        if (j() != null) {
            try {
                j().b(z);
            } catch (JSONException unused) {
            }
        }
    }

    public void h() {
        if (j() != null) {
            try {
                j().a();
            } catch (JSONException unused) {
            }
        }
    }

    public void a(JSONObject jSONObject, com.teslamotors.plugins.client.a.b bVar) {
        if (e() != 0) {
            i().a(jSONObject, e(), "NAVIGATION_REQUEST", bVar);
        }
    }

    private com.teslamotors.plugins.client.e i() {
        return com.teslamotors.plugins.client.e.a(this.f5452a);
    }

    private com.teslamotors.plugins.client.c.a j() {
        return i().o();
    }
}
