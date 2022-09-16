package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adkb  reason: default package */
/* loaded from: classes.dex */
public final class adkb implements adwb {
    public Map a = Collections.emptyMap();
    private final String b;
    private final int c;

    public adkb(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.adwb
    public final void a(IOException iOException) {
        String str = adkc.a;
        String str2 = this.b;
        zep.f(str, str2.length() != 0 ? "Error posting to ".concat(str2) : new String("Error posting to "), iOException);
    }

    @Override // defpackage.adwb
    public final void i(yrb yrbVar) {
        Map emptyMap;
        yqz yqzVar = yrbVar.d;
        int i = yrbVar.a;
        if (i != 200) {
            String str = adkc.a;
            String str2 = this.b;
            StringBuilder sb = new StringBuilder(str2.length() + 43);
            sb.append("POST ");
            sb.append(str2);
            sb.append(" failed. Response code is: ");
            sb.append(i);
            zep.m(str, sb.toString());
            if (yqzVar == null) {
                zep.c(adkc.a, "Response body is null");
                return;
            }
            try {
                ByteBuffer e = yqzVar.e();
                String str3 = adkc.a;
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb2.append("Error from server: ");
                sb2.append(valueOf);
                zep.c(str3, sb2.toString());
            } catch (IOException e2) {
                String str4 = adkc.a;
                String str5 = this.b;
                zep.f(str4, str5.length() != 0 ? "Error posting to ".concat(str5) : new String("Error posting to "), e2);
            }
        } else if (yqzVar != null) {
            try {
                String c = yqzVar.c();
                int i2 = this.c;
                try {
                    JSONObject jSONObject = new JSONObject(c);
                    if (!jSONObject.has("screens")) {
                        emptyMap = Collections.emptyMap();
                    } else {
                        JSONArray jSONArray = jSONObject.getJSONArray("screens");
                        if (jSONArray == null) {
                            emptyMap = Collections.emptyMap();
                        } else {
                            HashMap hashMap = new HashMap();
                            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                try {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                                    if (jSONObject2.has("screenId") && jSONObject2.has("loungeToken")) {
                                        hashMap.put(new ScreenId(jSONObject2.getString("screenId")), new adhy(jSONObject2.getString("loungeToken"), i2));
                                    }
                                } catch (JSONException unused) {
                                    String str6 = adkc.a;
                                    StringBuilder sb3 = new StringBuilder(32);
                                    sb3.append("Error parsing screen ");
                                    sb3.append(i3);
                                    zep.m(str6, sb3.toString());
                                }
                            }
                            emptyMap = hashMap;
                        }
                    }
                } catch (JSONException e3) {
                    zep.f(adkc.a, "Error parsing screen status ", e3);
                    emptyMap = Collections.emptyMap();
                }
                this.a = emptyMap;
            } catch (IOException e4) {
                String str7 = adkc.a;
                String str8 = this.b;
                zep.f(str7, str8.length() != 0 ? "Error posting to ".concat(str8) : new String("Error posting to "), e4);
            }
        } else {
            String str9 = adkc.a;
            String str10 = this.b;
            zep.c(str9, str10.length() != 0 ? "Response body is null from ".concat(str10) : new String("Response body is null from "));
        }
    }
}
