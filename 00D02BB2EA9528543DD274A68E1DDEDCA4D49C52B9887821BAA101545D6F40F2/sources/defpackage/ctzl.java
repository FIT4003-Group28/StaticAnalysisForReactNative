package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: ctzl  reason: default package */
/* loaded from: classes5.dex */
public abstract class ctzl {
    public static ctze j() {
        cuch cuchVar = new cuch();
        cuchVar.c(0L);
        cuchVar.r();
        return cuchVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0255 A[Catch: JSONException -> 0x0312, TryCatch #0 {JSONException -> 0x0312, blocks: (B:7:0x002c, B:9:0x003f, B:10:0x0046, B:12:0x004c, B:13:0x0053, B:15:0x0059, B:16:0x0060, B:18:0x0066, B:45:0x0124, B:47:0x012a, B:44:0x011f, B:48:0x0133, B:52:0x0146, B:55:0x0152, B:80:0x01e5, B:82:0x01eb, B:84:0x01ee, B:78:0x01da, B:79:0x01e0, B:85:0x01f9, B:100:0x024f, B:102:0x0255, B:104:0x0258, B:98:0x0241, B:99:0x024a, B:105:0x0263, B:106:0x026c, B:107:0x0275, B:108:0x0279, B:110:0x0287, B:112:0x028a, B:113:0x029f, B:114:0x02a7, B:115:0x02af, B:117:0x02bd, B:118:0x02c7, B:120:0x02d5, B:121:0x02df, B:123:0x02e5, B:127:0x02fa, B:129:0x0300, B:130:0x0309, B:86:0x0201, B:88:0x0207, B:90:0x0215, B:91:0x0218, B:92:0x0221, B:94:0x0227, B:96:0x0235, B:97:0x0238, B:58:0x015a, B:59:0x0167, B:61:0x016d, B:63:0x0179, B:71:0x01a2, B:72:0x01a7, B:74:0x01ad, B:75:0x01b3, B:66:0x0182, B:69:0x019d, B:76:0x01c3, B:19:0x006a, B:24:0x0080, B:25:0x0088, B:29:0x00b0, B:31:0x00b6, B:42:0x011c, B:28:0x00a9, B:32:0x00c5, B:39:0x0107, B:41:0x010d, B:38:0x0100), top: B:134:0x002c, inners: #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0258 A[Catch: JSONException -> 0x0312, TryCatch #0 {JSONException -> 0x0312, blocks: (B:7:0x002c, B:9:0x003f, B:10:0x0046, B:12:0x004c, B:13:0x0053, B:15:0x0059, B:16:0x0060, B:18:0x0066, B:45:0x0124, B:47:0x012a, B:44:0x011f, B:48:0x0133, B:52:0x0146, B:55:0x0152, B:80:0x01e5, B:82:0x01eb, B:84:0x01ee, B:78:0x01da, B:79:0x01e0, B:85:0x01f9, B:100:0x024f, B:102:0x0255, B:104:0x0258, B:98:0x0241, B:99:0x024a, B:105:0x0263, B:106:0x026c, B:107:0x0275, B:108:0x0279, B:110:0x0287, B:112:0x028a, B:113:0x029f, B:114:0x02a7, B:115:0x02af, B:117:0x02bd, B:118:0x02c7, B:120:0x02d5, B:121:0x02df, B:123:0x02e5, B:127:0x02fa, B:129:0x0300, B:130:0x0309, B:86:0x0201, B:88:0x0207, B:90:0x0215, B:91:0x0218, B:92:0x0221, B:94:0x0227, B:96:0x0235, B:97:0x0238, B:58:0x015a, B:59:0x0167, B:61:0x016d, B:63:0x0179, B:71:0x01a2, B:72:0x01a7, B:74:0x01ad, B:75:0x01b3, B:66:0x0182, B:69:0x019d, B:76:0x01c3, B:19:0x006a, B:24:0x0080, B:25:0x0088, B:29:0x00b0, B:31:0x00b6, B:42:0x011c, B:28:0x00a9, B:32:0x00c5, B:39:0x0107, B:41:0x010d, B:38:0x0100), top: B:134:0x002c, inners: #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a A[Catch: JSONException -> 0x0312, TryCatch #0 {JSONException -> 0x0312, blocks: (B:7:0x002c, B:9:0x003f, B:10:0x0046, B:12:0x004c, B:13:0x0053, B:15:0x0059, B:16:0x0060, B:18:0x0066, B:45:0x0124, B:47:0x012a, B:44:0x011f, B:48:0x0133, B:52:0x0146, B:55:0x0152, B:80:0x01e5, B:82:0x01eb, B:84:0x01ee, B:78:0x01da, B:79:0x01e0, B:85:0x01f9, B:100:0x024f, B:102:0x0255, B:104:0x0258, B:98:0x0241, B:99:0x024a, B:105:0x0263, B:106:0x026c, B:107:0x0275, B:108:0x0279, B:110:0x0287, B:112:0x028a, B:113:0x029f, B:114:0x02a7, B:115:0x02af, B:117:0x02bd, B:118:0x02c7, B:120:0x02d5, B:121:0x02df, B:123:0x02e5, B:127:0x02fa, B:129:0x0300, B:130:0x0309, B:86:0x0201, B:88:0x0207, B:90:0x0215, B:91:0x0218, B:92:0x0221, B:94:0x0227, B:96:0x0235, B:97:0x0238, B:58:0x015a, B:59:0x0167, B:61:0x016d, B:63:0x0179, B:71:0x01a2, B:72:0x01a7, B:74:0x01ad, B:75:0x01b3, B:66:0x0182, B:69:0x019d, B:76:0x01c3, B:19:0x006a, B:24:0x0080, B:25:0x0088, B:29:0x00b0, B:31:0x00b6, B:42:0x011c, B:28:0x00a9, B:32:0x00c5, B:39:0x0107, B:41:0x010d, B:38:0x0100), top: B:134:0x002c, inners: #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b3 A[Catch: JSONException -> 0x01da, LOOP:0: B:59:0x0167->B:75:0x01b3, LOOP_END, TryCatch #3 {JSONException -> 0x01da, blocks: (B:58:0x015a, B:59:0x0167, B:61:0x016d, B:63:0x0179, B:71:0x01a2, B:72:0x01a7, B:74:0x01ad, B:75:0x01b3, B:66:0x0182, B:69:0x019d, B:76:0x01c3, B:67:0x0186), top: B:138:0x015a, outer: #0, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dbsg<defpackage.ctzl> l(org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctzl.l(org.json.JSONObject):dbsg");
    }

    private static final boolean m(JSONObject jSONObject, String str, ctzc ctzcVar) {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        ctzd ctzdVar = ctzd.UNKNOWN;
        switch (ctzcVar.a().ordinal()) {
            case 0:
                cstl.a("Action");
                return false;
            case 1:
                dbsg<JSONObject> d = ctzcVar.b().d();
                if (!d.a()) {
                    return true;
                }
                jSONObject.put(str, d.b());
                return true;
            case 2:
                dbsg<JSONObject> d2 = ctzcVar.c().d();
                if (!d2.a()) {
                    return true;
                }
                jSONObject.put(str, d2.b());
                return true;
            case 3:
                jSONObject.put(str, ctzcVar.d());
                return true;
            case 4:
                jSONObject.put(str, ctzcVar.e());
                return true;
            case 5:
                jSONObject.put("ACTION_TYPE", ctzd.COMPOSED_OVERLAY_ACTION);
                ctzh c = ctzi.c();
                c.b(ctzcVar.g());
                dbsg<JSONObject> d3 = ctzi.d(c.a());
                if (!d3.a()) {
                    return false;
                }
                jSONObject.put(str, d3.b());
                return true;
            case 6:
            default:
                return true;
            case 7:
                jSONObject.put(str, ctzcVar.h());
                return true;
            case 8:
                jSONObject.put(str, ctzcVar.i());
                return true;
            case 9:
                jSONObject.put("ACTION_TYPE", ctzd.COMPOSED_OVERLAY_ACTION);
                dbsg<JSONObject> d4 = ctzi.d(ctzcVar.f());
                if (!d4.a()) {
                    return false;
                }
                jSONObject.put(str, d4.b());
                return true;
            case 10:
                cuif j = ctzcVar.j();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    dcpe<cuie> listIterator = j.b().listIterator();
                    while (true) {
                        if (listIterator.hasNext()) {
                            cuie next = listIterator.next();
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("PATTERN", next.a());
                                jSONObject3.put("SUBSTITUTE", next.b());
                                dbsgVar2 = dbsg.i(jSONObject3);
                            } catch (JSONException unused) {
                                cstl.a("UrlAction");
                                dbsgVar2 = dbpy.a;
                            }
                            if (!dbsgVar2.a()) {
                                dbsgVar = dbpy.a;
                            } else {
                                jSONArray.put(dbsgVar2.b());
                            }
                        } else {
                            jSONObject2.put("REPLACEMENTS", jSONArray);
                            String a = j.a();
                            dcdc<cuie> b = j.b();
                            int size = b.size();
                            int i = 0;
                            while (true) {
                                if (i < size) {
                                    cuie cuieVar = b.get(i);
                                    String a2 = cuieVar.a();
                                    int b2 = cuieVar.b();
                                    String b3 = cstf.a().b(b2);
                                    if (b2 != 0) {
                                        a = dbsj.d(b3) ? "" : a.replace(a2, b3);
                                    }
                                    i++;
                                    if (dbsj.d(a)) {
                                        a = "";
                                    }
                                }
                            }
                            jSONObject2.put("URL", a);
                            dbsgVar = dbsg.i(jSONObject2);
                        }
                    }
                } catch (JSONException unused2) {
                    cstl.a("UrlAction");
                    dbsgVar = dbpy.a;
                }
                if (!dbsgVar.a()) {
                    cstl.a("Action");
                    return false;
                }
                jSONObject.put(str, dbsgVar.b());
                return true;
        }
    }

    public abstract dbsg<String> a();

    public abstract dbsg<String> b();

    public abstract dbsg<String> c();

    public abstract dbsg<ctzf> d();

    public abstract long e();

    public final ctzd f() {
        return g().a();
    }

    public abstract ctzc g();

    public final ctzd h() {
        return i().a();
    }

    public abstract ctzc i();

    /* JADX WARN: Removed duplicated region for block: B:44:0x0105 A[Catch: JSONException -> 0x016f, TryCatch #3 {JSONException -> 0x016f, blocks: (B:3:0x0009, B:5:0x0013, B:6:0x0020, B:8:0x0033, B:42:0x00ff, B:44:0x0105, B:41:0x00fa, B:45:0x010c, B:47:0x0116, B:48:0x0123, B:50:0x012d, B:51:0x013a, B:53:0x014f, B:55:0x0152, B:57:0x0167, B:59:0x016a, B:9:0x0042, B:11:0x004d, B:19:0x0064, B:23:0x0089, B:25:0x008f, B:26:0x0097, B:22:0x0082, B:37:0x00ed, B:27:0x009d, B:34:0x00e0, B:36:0x00e6, B:38:0x00f2, B:33:0x00d9, B:39:0x00f8, B:40:0x00f9, B:20:0x0068, B:28:0x00a1, B:30:0x00cb, B:31:0x00d4), top: B:68:0x0009, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dbsg<org.json.JSONObject> k() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctzl.k():dbsg");
    }
}
