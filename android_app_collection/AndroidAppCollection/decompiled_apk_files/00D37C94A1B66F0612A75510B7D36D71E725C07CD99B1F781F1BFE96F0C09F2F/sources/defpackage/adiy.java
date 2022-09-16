package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: adiy  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adiy implements vlp {
    public static final /* synthetic */ adiy a = new adiy();

    private /* synthetic */ adiy() {
    }

    @Override // defpackage.vlp
    public final aoqu a(vlq vlqVar, aoqu aoquVar) {
        String str;
        String str2 = "ts";
        String str3 = "wifi";
        String str4 = "";
        String d = vlqVar.d("youtube.mdx:dial_devices", "[]");
        aopa mo52toBuilder = ((awts) aoquVar).mo52toBuilder();
        try {
            JSONArray jSONArray = new JSONArray(d);
            int i = 0;
            while (i < jSONArray.length()) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null && optJSONObject.has(str3) && optJSONObject.optLong(str2, 0L) > 0) {
                    String string = optJSONObject.getString(str3);
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("devices");
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                        String optString = jSONObject.optString("id", str4);
                        String optString2 = jSONObject.optString("manufacturer", str4);
                        String optString3 = jSONObject.optString("model_name", str4);
                        String optString4 = jSONObject.optString("name", str4);
                        String optString5 = jSONObject.optString("ssid", str4);
                        String optString6 = jSONObject.optString("mac", str4);
                        String str5 = str3;
                        String str6 = str4;
                        int optInt = jSONObject.optInt("timeout", 0);
                        boolean optBoolean = jSONObject.optBoolean("wol");
                        JSONArray jSONArray3 = jSONArray;
                        int i3 = i;
                        int i4 = i2;
                        long optLong = jSONObject.optLong(str2, 0L);
                        awtp awtpVar = awtp.a;
                        optString.getClass();
                        Map unmodifiableMap = Collections.unmodifiableMap(((awts) mo52toBuilder.instance).c);
                        if (unmodifiableMap.containsKey(optString)) {
                            awtpVar = (awtp) unmodifiableMap.get(optString);
                        }
                        awtq awtqVar = awtpVar.d;
                        if (awtqVar == null) {
                            awtqVar = awtq.a;
                        }
                        awtu awtuVar = awtqVar.i;
                        if (awtuVar == null) {
                            awtuVar = awtu.a;
                        }
                        if (awtuVar.f > optLong) {
                            str = str2;
                        } else if (!optBoolean || TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(string) || TextUtils.isEmpty(optString6) || optLong <= 0) {
                            str = str2;
                            optString.getClass();
                            mo52toBuilder.copyOnWrite();
                            ((awts) mo52toBuilder.instance).a().remove(optString);
                        } else {
                            aopa createBuilder = awtp.a.createBuilder();
                            createBuilder.copyOnWrite();
                            awtp awtpVar2 = (awtp) createBuilder.instance;
                            optString.getClass();
                            awtpVar2.b |= 1;
                            awtpVar2.c = optString;
                            aopa createBuilder2 = awtq.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            awtq awtqVar2 = (awtq) createBuilder2.instance;
                            optString2.getClass();
                            str = str2;
                            awtqVar2.b |= 1;
                            awtqVar2.c = optString2;
                            createBuilder2.copyOnWrite();
                            awtq awtqVar3 = (awtq) createBuilder2.instance;
                            optString3.getClass();
                            awtqVar3.b |= 2;
                            awtqVar3.d = optString3;
                            createBuilder2.copyOnWrite();
                            awtq awtqVar4 = (awtq) createBuilder2.instance;
                            optString4.getClass();
                            awtqVar4.b |= 4;
                            awtqVar4.e = optString4;
                            createBuilder2.copyOnWrite();
                            awtq awtqVar5 = (awtq) createBuilder2.instance;
                            optString4.getClass();
                            awtqVar5.b |= 8;
                            awtqVar5.f = optString4;
                            aopa createBuilder3 = awtu.a.createBuilder();
                            createBuilder3.copyOnWrite();
                            awtu awtuVar2 = (awtu) createBuilder3.instance;
                            optString5.getClass();
                            awtuVar2.b |= 1;
                            awtuVar2.c = optString5;
                            createBuilder3.copyOnWrite();
                            awtu awtuVar3 = (awtu) createBuilder3.instance;
                            optString6.getClass();
                            awtuVar3.b |= 2;
                            awtuVar3.d = optString6;
                            long j = optInt;
                            createBuilder3.copyOnWrite();
                            awtu awtuVar4 = (awtu) createBuilder3.instance;
                            awtuVar4.b |= 4;
                            awtuVar4.e = j;
                            createBuilder3.copyOnWrite();
                            awtu awtuVar5 = (awtu) createBuilder3.instance;
                            awtuVar5.b |= 8;
                            awtuVar5.f = optLong;
                            awtu awtuVar6 = (awtu) createBuilder3.mo39build();
                            createBuilder2.copyOnWrite();
                            awtq awtqVar6 = (awtq) createBuilder2.instance;
                            awtuVar6.getClass();
                            awtqVar6.i = awtuVar6;
                            awtqVar6.b |= 64;
                            createBuilder2.copyOnWrite();
                            awtq awtqVar7 = (awtq) createBuilder2.instance;
                            awtqVar7.g = 2;
                            awtqVar7.b |= 16;
                            awtq awtqVar8 = (awtq) createBuilder2.mo39build();
                            createBuilder.copyOnWrite();
                            awtp awtpVar3 = (awtp) createBuilder.instance;
                            awtqVar8.getClass();
                            awtpVar3.d = awtqVar8;
                            awtpVar3.b |= 2;
                            mo52toBuilder.bc(optString, (awtp) createBuilder.mo39build());
                        }
                        i2 = i4 + 1;
                        str3 = str5;
                        str4 = str6;
                        jSONArray = jSONArray3;
                        i = i3;
                        str2 = str;
                    }
                }
                i++;
                str3 = str3;
                str4 = str4;
                jSONArray = jSONArray;
                str2 = str2;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            mo52toBuilder.clear();
        }
        return (awts) mo52toBuilder.mo39build();
    }
}
