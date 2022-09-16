package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ctkb  reason: default package */
/* loaded from: classes5.dex */
public final class ctkb {
    public static HashMap<String, Object> a(cugd cugdVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ICON", cugdVar.a());
        hashMap.put("ICON_WIDTH", Integer.valueOf(cugdVar.b()));
        hashMap.put("ICON_HEIGHT", Integer.valueOf(cugdVar.c()));
        hashMap.put("TALK_BACK_DESCRIPTION", cugdVar.e());
        if (cugdVar.d().a()) {
            hashMap.put("ICON_COLOR", cugdVar.d().b());
        }
        return hashMap;
    }

    public static dbsg<cugd> b(HashMap<String, Object> hashMap) {
        cugc f = cugd.f();
        try {
            f.d((byte[]) hashMap.get("ICON"));
            f.f(((Integer) hashMap.get("ICON_WIDTH")).intValue());
            f.c(((Integer) hashMap.get("ICON_HEIGHT")).intValue());
            f.e((String) hashMap.get("TALK_BACK_DESCRIPTION"));
            if (hashMap.containsKey("ICON_COLOR")) {
                f.b(((Integer) hashMap.get("ICON_COLOR")).intValue());
            }
            return dbsg.i(f.a());
        } catch (NullPointerException unused) {
            cstl.a("LitIconConv");
            return dbpy.a;
        }
    }
}
