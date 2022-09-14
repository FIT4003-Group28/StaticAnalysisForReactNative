package defpackage;

import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ctkh  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class ctkh implements dbrn {
    static final dbrn a = new ctkh();

    private ctkh() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cuhg cuhgVar = (cuhg) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("RAW_TEXT", cuhgVar.a());
        if (cuhgVar.b().a()) {
            hashMap.put("PREDEFINED_STYLE", Integer.valueOf(cuhgVar.b().b().g));
        }
        if (cuhgVar.c().a()) {
            hashMap.put("LINE_STYLES", cstr.b(cuhgVar.c().b(), ctki.a));
        }
        if (cuhgVar.d().a()) {
            hashMap.put("FORMATTED_TEXT_SPANS", cstr.b(cuhgVar.d().b(), ctkj.a));
        }
        if (cuhgVar.e().a()) {
            hashMap.put("SKIP_LEADING_NEWLINE", cuhgVar.e().b());
        }
        return hashMap;
    }
}
