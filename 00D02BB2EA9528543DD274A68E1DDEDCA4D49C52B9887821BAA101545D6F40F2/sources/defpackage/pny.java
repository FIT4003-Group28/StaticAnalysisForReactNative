package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: pny  reason: default package */
/* loaded from: classes7.dex */
public final class pny {
    public final dcdn<String, pob> a;
    private pnx b;

    public pny(String str, dbsg<String> dbsgVar, int i) {
        pnx pnxVar;
        dbsg dbsgVar2;
        dcdg dcdgVar = new dcdg();
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("models");
            if (jSONArray.length() != 0) {
                if (!dbsgVar.a()) {
                    pnxVar = new pnx("");
                } else {
                    pnxVar = new pnx(dbsgVar.b());
                }
                this.b = pnxVar;
                String f = pnxVar.a.f();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String optString = jSONObject.optString("name");
                    if (!arrayList.contains(optString)) {
                        if (optString.equals(f)) {
                            dbsgVar2 = dbsg.i(new JSONObject(this.b.c.b()));
                        } else {
                            dbsgVar2 = dbpy.a;
                        }
                        dcdgVar.f(optString, new pob(jSONObject, dbsgVar2, i));
                        arrayList.add(optString);
                    }
                }
                this.a = dcdgVar.b();
                return;
            }
            throw new JSONException("Models array was empty");
        } catch (JSONException unused) {
            this.a = dcmn.a;
            this.b = new pnx("");
        }
    }

    public static String c(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[fileInputStream.available()];
        fileInputStream.read(bArr);
        fileInputStream.close();
        return new String(bArr, "UTF-8");
    }

    public final dbsg<pob> a(String str) {
        return dbsg.j(this.a.get(str));
    }

    public final dbsg<pob> b() {
        return !this.a.isEmpty() ? dbsg.i(this.a.values().iterator().next()) : dbpy.a;
    }
}
