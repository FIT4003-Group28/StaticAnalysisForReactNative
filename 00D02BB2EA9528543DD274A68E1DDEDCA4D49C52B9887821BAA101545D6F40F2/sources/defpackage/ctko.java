package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: ctko  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctko implements dbrn {
    static final dbrn a = new ctko();

    private ctko() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Object i;
        HashMap hashMap = (HashMap) obj;
        try {
            cuhh e = cuhi.e();
            e.c(((Integer) hashMap.get("START_INDEX")).intValue());
            e.b(((Integer) hashMap.get("END_INDEX")).intValue());
            dcdc<cuhq> c = cstr.c((ArrayList) hashMap.get("TEXT_STYLES"), ctkp.a);
            if (c.isEmpty()) {
                i = dbpy.a;
            } else {
                e.d(c);
                i = dbsg.i(e.a());
            }
            return i;
        } catch (Exception unused) {
            cstl.a("RichTextConverters");
            return dbpy.a;
        }
    }
}
