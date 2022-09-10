package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: axby  reason: default package */
/* loaded from: classes.dex */
public final class axby {
    private final Map<drbk, axbb> a;
    private final btvo b;

    public axby(Map<drbk, axbb> map, btvo btvoVar) {
        this.a = map;
        this.b = btvoVar;
    }

    @dzsi
    public final dviq a(@dzsi dviq dviqVar, drbk drbkVar) {
        if (!this.b.getPassiveAssistParameters().n() || dviqVar == null || !this.a.containsKey(drbkVar)) {
            return null;
        }
        this.a.get(drbkVar);
        dvhx bZ = dviq.D.bZ();
        dvin dvinVar = dviqVar.w;
        if (dvinVar == null) {
            dvinVar = dvin.e;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dviq dviqVar2 = (dviq) bZ.b;
        dvinVar.getClass();
        dviqVar2.w = dvinVar;
        dviqVar2.a |= 4194304;
        return bZ.bK();
    }
}
