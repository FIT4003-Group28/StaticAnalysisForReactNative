package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ctkm  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class ctkm implements dbrn {
    static final dbrn a = new ctkm();

    private ctkm() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        HashMap hashMap = (HashMap) obj;
        try {
            cuhf g = cuhg.g();
            g.e((String) hashMap.get("RAW_TEXT"));
            if (hashMap.containsKey("SKIP_LEADING_NEWLINE")) {
                g.f(((Boolean) hashMap.get("SKIP_LEADING_NEWLINE")).booleanValue());
            }
            if (hashMap.containsKey("PREDEFINED_STYLE")) {
                g.d(cuhp.a(((Integer) hashMap.get("PREDEFINED_STYLE")).intValue()));
            }
            if (hashMap.containsKey("LINE_STYLES")) {
                dcdc<cuhl> c = cstr.c((ArrayList) hashMap.get("LINE_STYLES"), ctkn.a);
                if (!c.isEmpty()) {
                    g.c(c);
                }
            }
            if (hashMap.containsKey("FORMATTED_TEXT_SPANS")) {
                dcdc<cuhi> c2 = cstr.c((ArrayList) hashMap.get("FORMATTED_TEXT_SPANS"), ctko.a);
                if (!c2.isEmpty()) {
                    g.b(c2);
                }
            }
            return dbsg.i(g.a());
        } catch (Exception unused) {
            cstl.a("RichTextConverters");
            return dbpy.a;
        }
    }
}
