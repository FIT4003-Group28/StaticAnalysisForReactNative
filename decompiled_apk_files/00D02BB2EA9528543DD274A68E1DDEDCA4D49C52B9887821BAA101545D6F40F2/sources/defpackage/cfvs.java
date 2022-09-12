package defpackage;
/* compiled from: PG */
/* renamed from: cfvs  reason: default package */
/* loaded from: classes4.dex */
public class cfvs implements cfvr {
    private final ceet a;
    private final dwue b;

    public cfvs(ceet ceetVar, dwue dwueVar) {
        this.a = ceetVar;
        this.b = dwueVar;
    }

    @Override // defpackage.cfvr
    public String a() {
        dwud dwudVar;
        dwue dwueVar = this.b;
        if (dwueVar.a == 1) {
            dwudVar = (dwud) dwueVar.b;
        } else {
            dwudVar = dwud.d;
        }
        return dwudVar.a;
    }

    @Override // defpackage.cfvr
    public String b() {
        dwud dwudVar;
        dwue dwueVar = this.b;
        if (dwueVar.a == 1) {
            dwudVar = (dwud) dwueVar.b;
        } else {
            dwudVar = dwud.d;
        }
        return dwudVar.b;
    }

    @Override // defpackage.cfvr
    public dwub c() {
        dwud dwudVar;
        dwue dwueVar = this.b;
        if (dwueVar.a == 1) {
            dwudVar = (dwud) dwueVar.b;
        } else {
            dwudVar = dwud.d;
        }
        dwub b = dwub.b(dwudVar.c);
        return b == null ? dwub.UNKNOWN_ACTION : b;
    }

    @Override // defpackage.cfvr
    public cqkl d() {
        dbsg dbsgVar;
        dwub c = c();
        drds drdsVar = drds.UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
        dwub dwubVar = dwub.UNKNOWN_ACTION;
        int ordinal = c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                drdsVar = drds.REVIEW;
            } else if (ordinal == 2) {
                drdsVar = drds.MEDIA;
            } else if (ordinal == 3) {
                drdsVar = drds.FACTUAL_EDIT;
            }
            dbsgVar = dbsg.i(drdsVar);
        } else {
            dbsgVar = dbpy.a;
        }
        if (!dbsgVar.a()) {
            return cqkl.a;
        }
        this.a.l(null, (drds) dbsgVar.b(), false, cees.h());
        return cqkl.a;
    }

    @Override // defpackage.cfvr
    @dzsi
    public cjtd e() {
        dwud dwudVar;
        dwub dwubVar = dwub.UNKNOWN_ACTION;
        int ordinal = c().ordinal();
        ddho ddhoVar = null;
        if (ordinal == 0) {
            dwue dwueVar = this.b;
            if (dwueVar.a == 1) {
                dwudVar = (dwud) dwueVar.b;
            } else {
                dwudVar = dwud.d;
            }
            dwub b = dwub.b(dwudVar.c);
            if (b == null) {
                b = dwub.UNKNOWN_ACTION;
            }
            b.name();
            return null;
        }
        if (ordinal == 1) {
            ddhoVar = dtxl.ev;
        } else if (ordinal == 2) {
            ddhoVar = dtxl.es;
        } else if (ordinal == 3) {
            ddhoVar = dtxl.ee;
        }
        dbsk.s(ddhoVar);
        return cjtd.a(ddhoVar);
    }
}
