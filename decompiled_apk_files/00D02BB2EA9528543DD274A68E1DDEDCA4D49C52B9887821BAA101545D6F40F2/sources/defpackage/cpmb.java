package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cpmb  reason: default package */
/* loaded from: classes5.dex */
final class cpmb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<ckn> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    ckm bZ = ckn.j.bZ();
                    String optString = optJSONObject.optString("optionName");
                    if (!optString.isEmpty()) {
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ckn cknVar = (ckn) bZ.b;
                        optString.getClass();
                        cknVar.a |= 8;
                        cknVar.g = optString;
                    }
                    String optString2 = optJSONObject.optString("optionText");
                    if (!optString2.isEmpty()) {
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ckn cknVar2 = (ckn) bZ.b;
                        optString2.getClass();
                        cknVar2.a |= 16;
                        cknVar2.h = optString2;
                    }
                    if (optJSONObject.has("noReport")) {
                        boolean optBoolean = optJSONObject.optBoolean("noReport");
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ckn cknVar3 = (ckn) bZ.b;
                        cknVar3.a |= 4;
                        cknVar3.e = optBoolean;
                    }
                    String optString3 = optJSONObject.optString("headerText");
                    if (!optString3.isEmpty()) {
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ckn cknVar4 = (ckn) bZ.b;
                        optString3.getClass();
                        cknVar4.a |= 32;
                        cknVar4.i = optString3;
                    }
                    JSONArray optJSONArray = optJSONObject.optJSONArray("additionalActions");
                    if (optJSONArray != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            String optString4 = optJSONArray.optString(i2);
                            if (!optString4.isEmpty()) {
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                ckn cknVar5 = (ckn) bZ.b;
                                optString4.getClass();
                                dsrj<String> dsrjVar = cknVar5.d;
                                if (!dsrjVar.a()) {
                                    cknVar5.d = dsqw.cl(dsrjVar);
                                }
                                cknVar5.d.add(optString4);
                            }
                        }
                    }
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("abuseType");
                    if (optJSONObject2 != null) {
                        cka bZ2 = ckb.c.bZ();
                        int optInt = optJSONObject2.optInt("idInt");
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        ckb ckbVar = (ckb) bZ2.b;
                        ckbVar.a |= 1;
                        ckbVar.b = optInt;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ckn cknVar6 = (ckn) bZ.b;
                        ckb bK = bZ2.bK();
                        bK.getClass();
                        cknVar6.b = bK;
                        cknVar6.a |= 1;
                    }
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subtypes");
                    if (optJSONArray2 != null) {
                        List<ckn> a = a(optJSONArray2);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ckn cknVar7 = (ckn) bZ.b;
                        dsrj<ckn> dsrjVar2 = cknVar7.f;
                        if (!dsrjVar2.a()) {
                            cknVar7.f = dsqw.cl(dsrjVar2);
                        }
                        dsod.bv(a, cknVar7.f);
                    }
                    String optString5 = optJSONObject.optString("messageName");
                    if (!optString5.isEmpty()) {
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ckn cknVar8 = (ckn) bZ.b;
                        optString5.getClass();
                        cknVar8.a |= 2;
                        cknVar8.c = optString5;
                    }
                    arrayList.add(bZ.bK());
                }
            }
        }
        return arrayList;
    }
}
