package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: cuni  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cuni implements dbrn {
    public static final dbrn a = new cuni();

    private cuni() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        HashMap hashMap = (HashMap) obj;
        try {
            cuqi cuqiVar = cuqi.STACK_COMPONENT;
            int ordinal = ((cuqi) hashMap.get("TYPE")).ordinal();
            if (ordinal == 0) {
                HashMap hashMap2 = (HashMap) hashMap.get("STACK_COMPONENT");
                try {
                    cuqj b = cuqk.b();
                    b.b(cstr.c((ArrayList) hashMap2.get("ELEMENTS"), cunl.a));
                    dbsgVar2 = dbsg.i(b.a());
                } catch (Exception unused) {
                    cstl.a("UiComponentConverters");
                    dbsgVar2 = dbpy.a;
                }
                dbsgVar = dbsg.i(cuoe.a((cuqk) dbsgVar2.b()));
            } else {
                dbsgVar = ordinal != 1 ? dbpy.a : dbsg.i(cuoe.b(cunm.b((HashMap) hashMap.get("UI_ELEMENT")).b()));
            }
        } catch (Exception unused2) {
            cstl.a("UiComponentConverters");
            dbsgVar = dbpy.a;
        }
        return (cuql) dbsgVar.b();
    }
}
