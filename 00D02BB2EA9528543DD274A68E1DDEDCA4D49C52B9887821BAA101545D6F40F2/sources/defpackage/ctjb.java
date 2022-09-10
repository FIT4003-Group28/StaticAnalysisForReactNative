package defpackage;

import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ctjb  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class ctjb implements dbrn {
    static final dbrn a = new ctjb();

    private ctjb() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        HashMap hashMap = (HashMap) obj;
        ctzh c = ctzi.c();
        if (hashMap.containsKey("REACTION_OVERLAY_HEADER")) {
            dbsg b = cstn.b(csto.h(hashMap.get("REACTION_OVERLAY_HEADER")), ctjf.a);
            if (!b.a()) {
                return dbpy.a;
            }
            c.b((cugq) b.b());
        }
        if (hashMap.containsKey("STACKED_REACTION_WEB_VIEW")) {
            dbsg<HashMap<String, Object>> h = csto.h(hashMap.get("STACKED_REACTION_WEB_VIEW"));
            if (h.a()) {
                dbsg b2 = cstn.b(csto.h(h.b().get("WEB_VIEW_HEADER")), ctjg.a);
                if (!b2.a()) {
                    return dbpy.a;
                }
                cufy c2 = cufz.c();
                c2.b((String) h.b().get("URL"));
                c2.c((cugq) b2.b());
                c.c(c2.a());
            }
        }
        return dbsg.i(c.a());
    }
}
