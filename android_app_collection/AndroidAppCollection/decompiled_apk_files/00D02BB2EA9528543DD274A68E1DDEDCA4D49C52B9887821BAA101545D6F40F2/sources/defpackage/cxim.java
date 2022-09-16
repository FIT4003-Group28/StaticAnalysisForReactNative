package defpackage;
/* compiled from: PG */
/* renamed from: cxim  reason: default package */
/* loaded from: classes5.dex */
public final class cxim implements cxil {
    private final dslk a;
    private final String b;

    public cxim(dslk dslkVar, String str) {
        this.a = dslkVar;
        this.b = str;
    }

    @Override // defpackage.cxil
    public final dehn<dslt> a(cxik cxikVar) {
        dsmf dsmfVar;
        dslk dslkVar = this.a;
        dslo bZ = dslp.d.bZ();
        String str = this.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dslp dslpVar = (dslp) bZ.b;
        str.getClass();
        dslpVar.a |= 1;
        dslpVar.b = str;
        cxik cxikVar2 = cxik.FORCED_SYNC;
        int ordinal = cxikVar.ordinal();
        if (ordinal == 0) {
            dsmfVar = dsmf.FORCED_SYNC;
        } else if (ordinal == 1) {
            dsmfVar = dsmf.EMPTY_CACHE;
        } else {
            throw new AssertionError(cxikVar);
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dslp dslpVar2 = (dslp) bZ.b;
        dsmfVar.getClass();
        dsrf dsrfVar = dslpVar2.c;
        if (!dsrfVar.a()) {
            dslpVar2.c = dsqw.cg(dsrfVar);
        }
        dslpVar2.c.h(dsmfVar.l);
        dslp bK = bZ.bK();
        dyeu dyeuVar = dslkVar.a;
        dyib<dslp, dslt> dyibVar = dsll.a;
        if (dyibVar == null) {
            synchronized (dsll.class) {
                dyibVar = dsll.a;
                if (dyibVar == null) {
                    dyhx c = dyib.c();
                    c.c = dyhz.UNARY;
                    c.d = dyib.b("footprints.oneplatform.FootprintsService", "GetActivityControlsSettings");
                    c.e = true;
                    c.a = dyyq.b(dslp.d);
                    c.b = dyyq.b(dslt.d);
                    dyibVar = c.a();
                    dsll.a = dyibVar;
                }
            }
        }
        return dyzf.d(dyeuVar.a(dyibVar, dslkVar.b), bK);
    }

    @Override // defpackage.cxil
    public final dehn<dsmn> b(dsml dsmlVar) {
        dslk dslkVar = this.a;
        return dyzf.d(dslkVar.a.a(dsll.a(), dslkVar.b), dsmlVar);
    }
}
