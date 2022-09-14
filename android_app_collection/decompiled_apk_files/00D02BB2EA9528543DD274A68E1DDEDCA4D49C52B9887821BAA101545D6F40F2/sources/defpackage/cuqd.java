package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cuqd  reason: default package */
/* loaded from: classes5.dex */
public abstract class cuqd {
    private static final String a = "cuqd";

    public static cuqc b() {
        return new cupb();
    }

    public static dbsg<cuqd> d(JSONObject jSONObject) {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        try {
            cuqc b = b();
            dccx F = dcdc.F();
            JSONArray jSONArray = jSONObject.getJSONArray("COMPONENTS");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                try {
                } catch (JSONException unused) {
                    cstl.a("UI_COMPONENT");
                }
                if (jSONObject2.has("UI_ELEMENT")) {
                    dbsg<cuqq> i2 = cuqq.i(jSONObject2.getJSONObject("UI_ELEMENT"));
                    if (!i2.a()) {
                        cstl.a("UI_COMPONENT");
                        dbsgVar = dbpy.a;
                    } else {
                        dbsgVar = dbsg.i(cuoe.b(i2.b()));
                    }
                } else {
                    if (jSONObject2.has("STACK_COMPONENT")) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("STACK_COMPONENT");
                        cuqj b2 = cuqk.b();
                        dccx F2 = dcdc.F();
                        try {
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("UI_ELEMENTS");
                            int i3 = 0;
                            while (true) {
                                if (i3 < jSONArray2.length()) {
                                    dbsg<cuqq> i4 = cuqq.i(jSONArray2.getJSONObject(i3));
                                    if (i4.a()) {
                                        F2.g(i4.b());
                                        i3++;
                                    } else {
                                        cstl.a("UI_COMPONENT");
                                        dbsgVar2 = dbpy.a;
                                        break;
                                    }
                                } else {
                                    b2.b(F2.f());
                                    dbsgVar2 = dbsg.i(b2.a());
                                    break;
                                }
                            }
                        } catch (JSONException unused2) {
                            cstl.a("UI_COMPONENT");
                            dbsgVar2 = dbpy.a;
                        }
                        if (!dbsgVar2.a()) {
                            cstl.a("UI_COMPONENT");
                            dbsgVar = dbpy.a;
                        } else {
                            dbsgVar = dbsg.i(cuoe.a((cuqk) dbsgVar2.b()));
                        }
                    }
                    dbsgVar = dbpy.a;
                }
                if (dbsgVar.a()) {
                    F.g((cuql) dbsgVar.b());
                } else {
                    cstl.a(a);
                    return dbpy.a;
                }
            }
            b.b(F.f());
            return dbsg.i(b.a());
        } catch (JSONException unused3) {
            cstl.a(a);
            return dbpy.a;
        }
    }

    public abstract dcdc<cuql> a();

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[Catch: JSONException -> 0x00de, LOOP:0: B:4:0x0014->B:37:0x00cb, LOOP_END, TryCatch #2 {JSONException -> 0x00de, blocks: (B:3:0x0007, B:4:0x0014, B:6:0x001a, B:31:0x00b3, B:33:0x00bd, B:35:0x00c3, B:37:0x00cb, B:32:0x00b8, B:38:0x00d4, B:7:0x0025, B:12:0x0036, B:14:0x0044, B:15:0x004b, B:16:0x0055, B:27:0x009e, B:29:0x00a4, B:30:0x00aa, B:25:0x0094, B:26:0x0099, B:17:0x0063, B:18:0x006b, B:20:0x0071, B:22:0x0081, B:23:0x0087, B:24:0x008f), top: B:47:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dbsg<org.json.JSONObject> c() {
        /*
            r10 = this;
            java.lang.String r0 = "UI_COMPONENT"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lde
            r2.<init>()     // Catch: org.json.JSONException -> Lde
            dcdc r3 = r10.a()     // Catch: org.json.JSONException -> Lde
            dcpe r3 = r3.listIterator()     // Catch: org.json.JSONException -> Lde
        L14:
            boolean r4 = r3.hasNext()     // Catch: org.json.JSONException -> Lde
            if (r4 == 0) goto Ld4
            java.lang.Object r4 = r3.next()     // Catch: org.json.JSONException -> Lde
            cuql r4 = (defpackage.cuql) r4     // Catch: org.json.JSONException -> Lde
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lde
            r5.<init>()     // Catch: org.json.JSONException -> Lde
            cuqi r6 = defpackage.cuqi.STACK_COMPONENT     // Catch: org.json.JSONException -> Lb8
            cuqi r6 = r4.b()     // Catch: org.json.JSONException -> Lb8
            int r6 = r6.ordinal()     // Catch: org.json.JSONException -> Lb8
            if (r6 == 0) goto L55
            r7 = 1
            if (r6 == r7) goto L36
            goto Lb3
        L36:
            cuqq r4 = r4.c()     // Catch: org.json.JSONException -> Lb8
            dbsg r4 = r4.h()     // Catch: org.json.JSONException -> Lb8
            boolean r6 = r4.a()     // Catch: org.json.JSONException -> Lb8
            if (r6 != 0) goto L4b
            defpackage.cstl.a(r0)     // Catch: org.json.JSONException -> Lb8
            dbpy<java.lang.Object> r4 = defpackage.dbpy.a     // Catch: org.json.JSONException -> Lb8
            goto Lbd
        L4b:
            java.lang.String r6 = "UI_ELEMENT"
            java.lang.Object r4 = r4.b()     // Catch: org.json.JSONException -> Lb8
            r5.put(r6, r4)     // Catch: org.json.JSONException -> Lb8
            goto Lb3
        L55:
            cuqk r4 = r4.a()     // Catch: org.json.JSONException -> Lb8
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb8
            r6.<init>()     // Catch: org.json.JSONException -> Lb8
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lb8
            r7.<init>()     // Catch: org.json.JSONException -> Lb8
            dcdc r4 = r4.a()     // Catch: org.json.JSONException -> L99
            dcpe r4 = r4.listIterator()     // Catch: org.json.JSONException -> L99
        L6b:
            boolean r8 = r4.hasNext()     // Catch: org.json.JSONException -> L99
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r4.next()     // Catch: org.json.JSONException -> L99
            cuqq r8 = (defpackage.cuqq) r8     // Catch: org.json.JSONException -> L99
            dbsg r8 = r8.h()     // Catch: org.json.JSONException -> L99
            boolean r9 = r8.a()     // Catch: org.json.JSONException -> L99
            if (r9 != 0) goto L87
            defpackage.cstl.a(r0)     // Catch: org.json.JSONException -> L99
            dbpy<java.lang.Object> r4 = defpackage.dbpy.a     // Catch: org.json.JSONException -> L99
            goto L9e
        L87:
            java.lang.Object r8 = r8.b()     // Catch: org.json.JSONException -> L99
            r7.put(r8)     // Catch: org.json.JSONException -> L99
            goto L6b
        L8f:
            java.lang.String r4 = "UI_ELEMENTS"
            r6.put(r4, r7)     // Catch: org.json.JSONException -> L99
            dbsg r4 = defpackage.dbsg.i(r6)     // Catch: org.json.JSONException -> Lb8
            goto L9e
        L99:
            defpackage.cstl.a(r0)     // Catch: org.json.JSONException -> Lb8
            dbpy<java.lang.Object> r4 = defpackage.dbpy.a     // Catch: org.json.JSONException -> Lb8
        L9e:
            boolean r6 = r4.a()     // Catch: org.json.JSONException -> Lb8
            if (r6 != 0) goto Laa
            defpackage.cstl.a(r0)     // Catch: org.json.JSONException -> Lb8
            dbpy<java.lang.Object> r4 = defpackage.dbpy.a     // Catch: org.json.JSONException -> Lb8
            goto Lbd
        Laa:
            java.lang.String r6 = "STACK_COMPONENT"
            java.lang.Object r4 = r4.b()     // Catch: org.json.JSONException -> Lb8
            r5.put(r6, r4)     // Catch: org.json.JSONException -> Lb8
        Lb3:
            dbsg r4 = defpackage.dbsg.i(r5)     // Catch: org.json.JSONException -> Lde
            goto Lbd
        Lb8:
            defpackage.cstl.a(r0)     // Catch: org.json.JSONException -> Lde
            dbpy<java.lang.Object> r4 = defpackage.dbpy.a     // Catch: org.json.JSONException -> Lde
        Lbd:
            boolean r5 = r4.a()     // Catch: org.json.JSONException -> Lde
            if (r5 != 0) goto Lcb
            java.lang.String r0 = defpackage.cuqd.a     // Catch: org.json.JSONException -> Lde
            defpackage.cstl.a(r0)     // Catch: org.json.JSONException -> Lde
            dbpy<java.lang.Object> r0 = defpackage.dbpy.a     // Catch: org.json.JSONException -> Lde
            return r0
        Lcb:
            java.lang.Object r4 = r4.b()     // Catch: org.json.JSONException -> Lde
            r2.put(r4)     // Catch: org.json.JSONException -> Lde
            goto L14
        Ld4:
            java.lang.String r0 = "COMPONENTS"
            r1.put(r0, r2)     // Catch: org.json.JSONException -> Lde
            dbsg r0 = defpackage.dbsg.i(r1)
            return r0
        Lde:
            java.lang.String r0 = defpackage.cuqd.a
            defpackage.cstl.a(r0)
            dbpy<java.lang.Object> r0 = defpackage.dbpy.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuqd.c():dbsg");
    }
}
