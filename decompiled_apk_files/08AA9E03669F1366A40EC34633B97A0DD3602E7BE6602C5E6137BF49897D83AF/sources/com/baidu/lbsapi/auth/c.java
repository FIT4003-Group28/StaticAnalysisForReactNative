package com.baidu.lbsapi.auth;

import android.content.Context;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    private Context f1485a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, String> f1486b = null;

    /* renamed from: c  reason: collision with root package name */
    private a<String> f1487c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a<Result> {
        void a(Result result);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Context context) {
        this.f1485a = context;
    }

    private HashMap<String, String> a(HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = new HashMap<>();
        for (String str : hashMap.keySet()) {
            String str2 = str.toString();
            hashMap2.put(str2, hashMap.get(str2));
        }
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        JSONObject jSONObject;
        if (str == null) {
            str = "";
        }
        try {
            jSONObject = new JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("status", -1);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (this.f1487c != null) {
            this.f1487c.a(jSONObject != null ? jSONObject.toString() : new JSONObject().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(HashMap<String, String> hashMap, a<String> aVar) {
        this.f1486b = a(hashMap);
        this.f1487c = aVar;
        new Thread(new d(this)).start();
    }
}
