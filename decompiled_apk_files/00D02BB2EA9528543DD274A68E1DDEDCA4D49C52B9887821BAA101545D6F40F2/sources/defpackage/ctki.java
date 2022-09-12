package defpackage;

import java.util.HashMap;
/* renamed from: ctki  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctki implements dbrn {
    static final dbrn a = new ctki();

    private ctki() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cuhl cuhlVar = (cuhl) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("LINE_STYLE_TYPE", Integer.valueOf(cuhlVar.a().d));
        if (cuhlVar.a() == cuhn.INDENTATION) {
            hashMap.put("INDENTATION", Integer.valueOf(cuhlVar.b()));
        }
        return hashMap;
    }
}
