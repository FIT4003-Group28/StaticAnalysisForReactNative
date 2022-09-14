package defpackage;

import java.util.HashMap;
/* renamed from: cunj  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cunj implements dbrn {
    public static final dbrn a = new cunj();

    private cunj() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cuql cuqlVar = (cuql) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("TYPE", cuqlVar.b());
        cuqi cuqiVar = cuqi.STACK_COMPONENT;
        int ordinal = cuqlVar.b().ordinal();
        if (ordinal == 0) {
            cuqk a2 = cuqlVar.a();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ELEMENTS", cstr.b(a2.a(), cunk.a));
            hashMap.put("STACK_COMPONENT", hashMap2);
        } else if (ordinal == 1) {
            hashMap.put("UI_ELEMENT", cunm.a(cuqlVar.c()));
        }
        return hashMap;
    }
}
