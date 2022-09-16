package defpackage;

import java.util.HashMap;
/* renamed from: ctkj  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctkj implements dbrn {
    static final dbrn a = new ctkj();

    private ctkj() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cuhi cuhiVar = (cuhi) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("START_INDEX", Integer.valueOf(cuhiVar.a()));
        hashMap.put("END_INDEX", Integer.valueOf(cuhiVar.b()));
        hashMap.put("TEXT_STYLES", cstr.b(cuhiVar.c(), ctkk.a));
        return hashMap;
    }
}
