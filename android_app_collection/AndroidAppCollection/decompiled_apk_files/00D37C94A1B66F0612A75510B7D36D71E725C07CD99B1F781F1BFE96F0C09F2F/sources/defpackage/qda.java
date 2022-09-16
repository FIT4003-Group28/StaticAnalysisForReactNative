package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: qda  reason: default package */
/* loaded from: classes4.dex */
public final class qda implements SharedPreferences.OnSharedPreferenceChangeListener {
    public Context g;
    public final Object a = new Object();
    public final ConditionVariable b = new ConditionVariable();
    public volatile boolean c = false;
    public volatile boolean d = false;
    public SharedPreferences e = null;
    public Bundle f = new Bundle();
    public JSONObject h = new JSONObject();

    public final void a() {
        if (this.e == null) {
            return;
        }
        try {
            this.h = new JSONObject((String) ptx.k(new amqo() { // from class: qcx
                @Override // defpackage.amqo
                public final Object get() {
                    return qda.this.e.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            a();
        }
    }
}
