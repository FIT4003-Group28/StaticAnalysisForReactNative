package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ctjc  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class ctjc implements dbrn {
    static final dbrn a = new ctjc();

    private ctjc() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        HashMap hashMap = (HashMap) obj;
        if (!hashMap.containsKey("URL") || !hashMap.containsKey("REPLACEMENTS")) {
            cstl.a("ActionConv");
            return dbpy.a;
        }
        cuic c = cuif.c();
        c.c((String) hashMap.get("URL"));
        ArrayList arrayList = (ArrayList) hashMap.get("REPLACEMENTS");
        dcdc<cuie> c2 = cstr.c(arrayList, ctjd.a);
        if (c2.size() != arrayList.size()) {
            cstl.a("ActionConv");
            return dbpy.a;
        }
        c.b(c2);
        return dbsg.i(c.a());
    }
}
