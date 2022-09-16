package defpackage;

import java.util.HashMap;
/* renamed from: cunb  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cunb implements dbrn {
    static final dbrn a = new cunb();

    private cunb() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cuqa cuqaVar = (cuqa) obj;
        final HashMap hashMap = new HashMap();
        hashMap.put("TEXT", cuqaVar.a());
        cstn.a(cuqaVar.b(), new mw(hashMap) { // from class: cunc
            private final HashMap a;

            {
                this.a = hashMap;
            }

            @Override // defpackage.mw
            public final void a(Object obj2) {
                this.a.put("LIGHTER_ICON", ctkb.a((cugd) obj2));
            }
        });
        hashMap.put("ACTION", ctjh.a(cuqaVar.c()));
        hashMap.put("TEXT_COLOR", Integer.valueOf(cuqaVar.d()));
        hashMap.put("BACKGROUND_COLOR", Integer.valueOf(cuqaVar.e()));
        hashMap.put("BORDER_COLOR", Integer.valueOf(cuqaVar.f()));
        hashMap.put("ENABLED", Boolean.valueOf(cuqaVar.g()));
        return hashMap;
    }
}
