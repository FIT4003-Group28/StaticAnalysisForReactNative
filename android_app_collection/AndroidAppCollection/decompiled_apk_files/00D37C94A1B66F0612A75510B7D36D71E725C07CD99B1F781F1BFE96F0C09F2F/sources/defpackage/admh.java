package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: admh  reason: default package */
/* loaded from: classes.dex */
final class admh {
    public final admj a;
    public int b;
    List c;

    public admh(admj admjVar) {
        this(admjVar, null);
    }

    public final long a() {
        if (this.c.isEmpty()) {
            return 0L;
        }
        List list = this.c;
        return ((Long) list.get(list.size() - 1)).longValue();
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (Long l : this.c) {
            jSONArray.put(l.longValue());
        }
        try {
            jSONObject.put("occurs", this.b);
            jSONObject.put("timestamps", jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public admh(admj admjVar, String str) {
        this.a = admjVar;
        this.b = 0;
        this.c = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArray = jSONObject.getJSONArray("timestamps");
                this.b = jSONObject.getInt("occurs");
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.c.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }
}
