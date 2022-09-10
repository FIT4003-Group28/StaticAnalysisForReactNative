package defpackage;

import java.util.HashMap;
/* renamed from: cumz  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cumz implements dbrn {
    static final dbrn a = new cumz();

    private cumz() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cupp cuppVar = (cupp) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("DISPLAY_TEXT", cuppVar.c());
        hashMap.put("ICON", cuppVar.a());
        hashMap.put("VERTICAL_LAYOUT_BUTTON_LIGHTER_ICON", ctkb.a(cuppVar.b()));
        hashMap.put("ACTION", ctjh.a(cuppVar.d()));
        return hashMap;
    }
}
