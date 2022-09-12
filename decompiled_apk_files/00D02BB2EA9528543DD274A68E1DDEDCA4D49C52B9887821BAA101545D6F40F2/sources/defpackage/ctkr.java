package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ctkr  reason: default package */
/* loaded from: classes5.dex */
public final class ctkr {
    public static HashMap<String, Object> a(cuhv cuhvVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("FORMATTED_LINES", cstr.b(cuhvVar.a(), ctkh.a));
        return hashMap;
    }

    public static dbsg<cuhv> b(HashMap<String, Object> hashMap) {
        try {
            dcdc<cuhg> c = cstr.c((ArrayList) hashMap.get("FORMATTED_LINES"), ctkm.a);
            if (c.isEmpty()) {
                return dbpy.a;
            }
            cuhe c2 = cuhv.c();
            c2.b(c);
            return dbsg.i(c2.a());
        } catch (Exception unused) {
            cstl.a("RichTextConverters");
            return dbpy.a;
        }
    }
}
