package defpackage;

import java.util.HashMap;
/* renamed from: cuna  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cuna implements dbrn {
    static final dbrn a = new cuna();

    private cuna() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        HashMap hashMap = (HashMap) obj;
        try {
            cupo e = cupp.e();
            dbsg<cugd> b = ctkb.b((HashMap) hashMap.get("VERTICAL_LAYOUT_BUTTON_LIGHTER_ICON"));
            dbsg b2 = cstn.b(csto.h(hashMap.get("ACTION")), cumy.a);
            ctze j = ctzl.j();
            j.s();
            e.b((ctzl) b2.c(j.a()));
            e.c((String) hashMap.get("DISPLAY_TEXT"));
            e.d((byte[]) hashMap.get("ICON"));
            e.e(b.a() ? b.b() : cugd.i());
            return dbsg.i(e.a());
        } catch (IllegalStateException | NullPointerException unused) {
            cstl.a("HrzntlytBtnConverter");
            return dbpy.a;
        }
    }
}
