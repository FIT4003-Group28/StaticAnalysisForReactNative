package defpackage;

import java.util.List;
/* renamed from: buhz  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class buhz implements dbrn {
    public static final dbrn a = new buhz();

    private buhz() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        buic buicVar = new buic();
        for (buab<String> buabVar : (List) obj) {
            if (buabVar != null) {
                buicVar.a(buabVar);
            }
        }
        return buicVar;
    }
}
