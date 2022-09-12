package defpackage;

import java.util.HashMap;
/* renamed from: ctkk  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ctkk implements dbrn {
    static final dbrn a = new ctkk();

    private ctkk() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cuhq cuhqVar = (cuhq) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("TEXT_STYLE_TYPE", Integer.valueOf(cuhqVar.b().n));
        if (cuhqVar.b() == cuhs.COLOR) {
            hashMap.put("COLOR", Integer.valueOf(cuhqVar.d()));
        }
        if (cuhqVar.b() == cuhs.BACKGROUND_COLOR) {
            hashMap.put("BACKGROUND_COLOR", Integer.valueOf(cuhqVar.a()));
        }
        if (cuhqVar.b() == cuhs.SIZE) {
            hashMap.put("SIZE", Integer.valueOf(cuhqVar.h()));
        }
        if (cuhqVar.b() == cuhs.TYPEFACE_LIST) {
            hashMap.put("TYPEFACE_LIST", cstr.b(cuhqVar.l(), ctkl.a));
        }
        if (cuhqVar.b() == cuhs.HORIZONTAL_ALIGNMENT) {
            hashMap.put("HORIZONTAL_ALIGNMENT", Integer.valueOf(cuhqVar.e()));
        }
        if (cuhqVar.b() == cuhs.HYPER_LINK) {
            hashMap.put("HYPER_LINK", cuhqVar.f());
        }
        return hashMap;
    }
}
