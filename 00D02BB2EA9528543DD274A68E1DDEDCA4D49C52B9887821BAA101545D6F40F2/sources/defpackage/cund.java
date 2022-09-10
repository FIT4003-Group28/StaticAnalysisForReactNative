package defpackage;

import java.util.HashMap;
/* renamed from: cund  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cund implements dbrn {
    static final dbrn a = new cund();

    private cund() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        HashMap hashMap = (HashMap) obj;
        try {
            final cupz i = cuqa.i();
            if (hashMap.containsKey("LIGHTER_ICON")) {
                cstn.a(ctkb.b((HashMap) hashMap.get("LIGHTER_ICON")), new mw(i) { // from class: cune
                    private final cupz a;

                    {
                        this.a = i;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        this.a.f((cugd) obj2);
                    }
                });
            }
            i.g((String) hashMap.get("TEXT"));
            i.b((ctzl) cstn.b(csto.h(hashMap.get("ACTION")), cunf.a).b());
            i.h(((Integer) hashMap.get("TEXT_COLOR")).intValue());
            i.c(((Integer) hashMap.get("BACKGROUND_COLOR")).intValue());
            i.d(((Integer) hashMap.get("BORDER_COLOR")).intValue());
            i.e(((Boolean) hashMap.get("ENABLED")).booleanValue());
            return dbsg.i(i.a());
        } catch (IllegalStateException | NullPointerException unused) {
            cstl.a("RCButtonsConverters");
            return dbpy.a;
        }
    }
}
