package defpackage;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cumv  reason: default package */
/* loaded from: classes5.dex */
public final class cumv {
    public static dbsg<cupx> a(cugu cuguVar) {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        dbsg dbsgVar3;
        int a = cuguVar.f().a();
        if (a != 0) {
            if (a == 3 && cuguVar.f().b().a().equals("rich_card")) {
                HashMap<String, Object> d = csto.d(cuguVar.f().b().b());
                try {
                    final int i = cupw.STACK_CARD.d;
                    if (d.containsKey("TYPE")) {
                        i = ((Integer) d.get("TYPE")).intValue();
                    }
                    cupw cupwVar = (cupw) dcbg.c(cupw.values()).r(new dbsl(i) { // from class: cupv
                        private final int a;

                        {
                            this.a = i;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            int i2 = this.a;
                            cupw cupwVar2 = cupw.STACK_CARD;
                            return ((cupw) obj).d == i2;
                        }
                    }).f();
                    if (cupwVar != null) {
                        int ordinal = cupwVar.ordinal();
                        if (ordinal == 0) {
                            dbsg<HashMap<String, Object>> h = csto.h(d.get("STACK_CARD"));
                            if (!h.a()) {
                                cstl.a("RichCardConverters");
                                String valueOf = String.valueOf(cupwVar);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                                sb.append("failed to convert HashMap to RichCard, unsupported type: ");
                                sb.append(valueOf);
                                sb.toString();
                                cstl.a("RichCardConverters");
                                return dbpy.a;
                            }
                            HashMap<String, Object> b = h.b();
                            try {
                                cuqc b2 = cuqd.b();
                                b2.b(cstr.a((ArrayList) b.get("COMPONENTS"), cuni.a));
                                dbsgVar = dbsg.i(b2.a());
                            } catch (Exception unused) {
                                cstl.a("RichCardConverters");
                                dbsgVar = dbpy.a;
                            }
                            return dbsg.i(cuoa.a((cuqd) dbsgVar.b()));
                        } else if (ordinal != 1) {
                            if (ordinal == 2) {
                                try {
                                    JSONObject jSONObject = new JSONObject((String) d.get("CARD_CAROUSEL"));
                                    cupl d2 = cupm.d();
                                    d2.b(jSONObject.getInt("CARD_WIDTH"));
                                    d2.d(jSONObject.getString("JSON_SOURCE"));
                                    dccx F = dcdc.F();
                                    JSONArray jSONArray = jSONObject.getJSONArray("CARDS");
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < jSONArray.length()) {
                                            dbsg<cuqd> d3 = cuqd.d(jSONArray.getJSONObject(i2));
                                            if (d3.a()) {
                                                F.g(d3.b());
                                                i2++;
                                            } else {
                                                cstl.a(cupm.a);
                                                dbsgVar3 = dbpy.a;
                                                break;
                                            }
                                        } else {
                                            d2.c(F.f());
                                            dbsgVar3 = dbsg.i(d2.a());
                                            break;
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    cstl.a(cupm.a);
                                    dbsgVar3 = dbpy.a;
                                }
                                if (!dbsgVar3.a()) {
                                    cstl.a("RichCardConverters");
                                } else {
                                    return dbsg.i(cuoa.c((cupm) dbsgVar3.b()));
                                }
                            }
                            String valueOf2 = String.valueOf(cupwVar);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 57);
                            sb2.append("failed to convert HashMap to RichCard, unsupported type: ");
                            sb2.append(valueOf2);
                            sb2.toString();
                            cstl.a("RichCardConverters");
                            return dbpy.a;
                        } else {
                            try {
                                JSONObject jSONObject2 = new JSONObject((String) d.get("STANDALONE_CARD"));
                                cuqe c = cuqf.c();
                                c.b(jSONObject2.getString("JSON_SOURCE"));
                                dbsg<cuqd> d4 = cuqd.d(jSONObject2.getJSONObject("STACK_CARD"));
                                if (!d4.a()) {
                                    cstl.a(cuqf.a);
                                    dbsgVar2 = dbpy.a;
                                } else {
                                    c.c(d4.b());
                                    dbsgVar2 = dbsg.i(c.a());
                                }
                            } catch (JSONException unused3) {
                                cstl.a(cuqf.a);
                                dbsgVar2 = dbpy.a;
                            }
                            if (!dbsgVar2.a()) {
                                cstl.a("RichCardConverters");
                                String valueOf22 = String.valueOf(cupwVar);
                                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 57);
                                sb22.append("failed to convert HashMap to RichCard, unsupported type: ");
                                sb22.append(valueOf22);
                                sb22.toString();
                                cstl.a("RichCardConverters");
                                return dbpy.a;
                            }
                            return dbsg.i(cuoa.b((cuqf) dbsgVar2.b()));
                        }
                    }
                    throw new InvalidParameterException("Invalid CardType.");
                } catch (Exception unused4) {
                    cstl.a("RichCardConverters");
                    return dbpy.a;
                }
            }
            return dbpy.a;
        }
        throw null;
    }

    public static byte[] b(cupx cupxVar) {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        try {
            final HashMap hashMap = new HashMap();
            hashMap.put("TYPE", Integer.valueOf(cupxVar.b().d));
            int ordinal = cupxVar.b().ordinal();
            if (ordinal == 0) {
                cuqd c = cupxVar.c();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("COMPONENTS", cstr.b(c.a(), cunj.a));
                hashMap.put("STACK_CARD", hashMap2);
            } else if (ordinal == 1) {
                cuqf d = cupxVar.d();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("JSON_SOURCE", d.a());
                    dbsg<JSONObject> c2 = d.b().c();
                    if (!c2.a()) {
                        cstl.a(cuqf.a);
                        dbsgVar = dbpy.a;
                    } else {
                        jSONObject.put("STACK_CARD", c2.b());
                        dbsgVar = dbsg.i(jSONObject);
                    }
                } catch (JSONException unused) {
                    cstl.a(cuqf.a);
                    dbsgVar = dbpy.a;
                }
                cstn.a(dbsgVar, new mw(hashMap) { // from class: cung
                    private final HashMap a;

                    {
                        this.a = hashMap;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj) {
                        this.a.put("STANDALONE_CARD", ((JSONObject) obj).toString());
                    }
                });
            } else if (ordinal == 2) {
                cupm a = cupxVar.a();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("CARD_WIDTH", a.a());
                    jSONObject2.put("JSON_SOURCE", a.b());
                    JSONArray jSONArray = new JSONArray();
                    dcpe<cuqd> listIterator = a.c().listIterator();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            jSONObject2.put("CARDS", jSONArray);
                            dbsgVar2 = dbsg.i(jSONObject2);
                            break;
                        }
                        dbsg<JSONObject> c3 = listIterator.next().c();
                        if (!c3.a()) {
                            cstl.a(cupm.a);
                            dbsgVar2 = dbpy.a;
                            break;
                        }
                        jSONArray.put(c3.b());
                    }
                } catch (JSONException unused2) {
                    cstl.a(cupm.a);
                    dbsgVar2 = dbpy.a;
                }
                cstn.a(dbsgVar2, new mw(hashMap) { // from class: cunh
                    private final HashMap a;

                    {
                        this.a = hashMap;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj) {
                        this.a.put("CARD_CAROUSEL", ((JSONObject) obj).toString());
                    }
                });
            }
            return csto.a(hashMap);
        } catch (IOException | IllegalArgumentException unused3) {
            cstl.a("RichCardUtils");
            return new byte[0];
        }
    }
}
