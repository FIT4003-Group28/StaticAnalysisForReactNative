package defpackage;

import java.util.HashMap;
/* renamed from: ctjd  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctjd implements dbrn {
    static final dbrn a = new ctjd();

    private ctjd() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        HashMap hashMap = (HashMap) obj;
        if (!hashMap.containsKey("SUBSTITUTE") || !hashMap.containsKey("PATTERN")) {
            cstl.a("ActionConv");
            return dbpy.a;
        }
        cuid c = cuie.c();
        c.c(((Integer) hashMap.get("SUBSTITUTE")).intValue());
        c.b((String) hashMap.get("PATTERN"));
        return dbsg.i(c.a());
    }
}
