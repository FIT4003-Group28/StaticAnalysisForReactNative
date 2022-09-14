package defpackage;
/* compiled from: PG */
/* renamed from: aaps  reason: default package */
/* loaded from: classes2.dex */
public final class aaps {
    private final dxio<ache> a;

    public aaps(dxio<ache> dxioVar) {
        this.a = dxioVar;
    }

    public final void a(@dzsi diwb diwbVar, @dzsi achg achgVar, boolean z) {
        achb achbVar = null;
        if (diwbVar != null) {
            diuk diukVar = diwbVar.O;
            if (diukVar == null) {
                diukVar = diuk.b;
            }
            if (diukVar.a.size() != 0) {
                acgz b = achb.b();
                diuk diukVar2 = diwbVar.O;
                if (diukVar2 == null) {
                    diukVar2 = diuk.b;
                }
                for (diuj diujVar : diukVar2.a) {
                    b.c(diujVar.a, diujVar.b);
                }
                achbVar = b.b();
            }
        }
        if (achgVar != null) {
            this.a.a().D(achgVar, achc.DISCOVERY_EXPERIENCE_SHEET, achbVar);
        } else {
            this.a.a().k(false, z, achc.DISCOVERY_EXPERIENCE_SHEET, achbVar);
        }
    }
}
