package defpackage;
/* compiled from: PG */
/* renamed from: azyg  reason: default package */
/* loaded from: classes.dex */
public final class azyg extends azwh<azyh> {
    public final domc a;

    public azyg(azyh azyhVar) {
        super(azyhVar);
        domd g = azyhVar.g();
        dsqp dsqpVar = (dsqp) g.cu(5);
        dsqpVar.bC(g);
        this.a = (domc) dsqpVar;
    }

    @Override // defpackage.azwh
    /* renamed from: a */
    public final azyh b() {
        this.g = azyh.l(this.a.bK());
        return new azyh(this);
    }

    public final void c(long j) {
        domc domcVar = this.a;
        dqkd dqkdVar = ((domd) domcVar.b).c;
        if (dqkdVar == null) {
            dqkdVar = dqkd.f;
        }
        dsqp dsqpVar = (dsqp) dqkdVar.cu(5);
        dsqpVar.bC(dqkdVar);
        dqjz dqjzVar = (dqjz) dsqpVar;
        if (dqjzVar.c) {
            dqjzVar.bF();
            dqjzVar.c = false;
        }
        dqkd dqkdVar2 = (dqkd) dqjzVar.b;
        dqkdVar2.a |= 2;
        dqkdVar2.c = j;
        if (domcVar.c) {
            domcVar.bF();
            domcVar.c = false;
        }
        domd domdVar = (domd) domcVar.b;
        dqkd bK = dqjzVar.bK();
        bK.getClass();
        domdVar.c = bK;
        domdVar.a |= 2;
    }

    public azyg(domd domdVar) {
        super(azwm.h, azwm.i);
        dbsk.b(1 != (domdVar.a & 1) ? false : true, " Cannot build a TutorialHistoryEntry from a SyncTutorialHistoryEntry without an id field.");
        dsqp dsqpVar = (dsqp) domdVar.cu(5);
        dsqpVar.bC(domdVar);
        this.a = (domc) dsqpVar;
    }

    public azyg(dqkd dqkdVar) {
        super(azwm.h, azwm.i);
        domc bZ = domd.d.bZ();
        this.a = bZ;
        dome bZ2 = domf.d.bZ();
        long j = dqkdVar.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        domf domfVar = (domf) bZ2.b;
        domfVar.a |= 1;
        domfVar.b = j;
        dqkc b = dqkc.b(dqkdVar.b);
        b = b == null ? dqkc.UNKNOWN_TUTORIAL_TYPE : b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        domf domfVar2 = (domf) bZ2.b;
        domfVar2.c = b.bl;
        domfVar2.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        domd domdVar = (domd) bZ.b;
        domf bK = bZ2.bK();
        bK.getClass();
        domdVar.b = bK;
        domdVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        domd domdVar2 = (domd) bZ.b;
        dqkdVar.getClass();
        domdVar2.c = dqkdVar;
        domdVar2.a |= 2;
    }
}
