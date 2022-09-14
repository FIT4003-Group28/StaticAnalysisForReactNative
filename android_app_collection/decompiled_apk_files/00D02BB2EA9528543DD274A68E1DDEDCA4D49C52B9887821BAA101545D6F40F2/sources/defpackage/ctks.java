package defpackage;

import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ctks  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class ctks implements dbrn {
    static final dbrn a = new ctks();

    private ctks() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cuhz cuhzVar = (cuhz) obj;
        final HashMap hashMap = new HashMap();
        hashMap.put("ID", Integer.valueOf(cuhzVar.a()));
        hashMap.put("TEXT", cuhzVar.b());
        hashMap.put("SECONDARY_TEXT", cuhzVar.e());
        cstn.a(cuhzVar.c(), new mw(hashMap) { // from class: ctku
            private final HashMap a;

            {
                this.a = hashMap;
            }

            @Override // defpackage.mw
            public final void a(Object obj2) {
                this.a.put("LIGHTER_ICON", ctkb.a((cugd) obj2));
            }
        });
        hashMap.put("ACTION", ctjh.a(cuhzVar.d()));
        return hashMap;
    }
}
