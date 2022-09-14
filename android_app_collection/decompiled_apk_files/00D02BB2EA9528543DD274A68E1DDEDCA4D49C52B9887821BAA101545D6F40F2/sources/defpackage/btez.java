package defpackage;
/* compiled from: PG */
/* renamed from: btez  reason: default package */
/* loaded from: classes4.dex */
public final class btez extends btdu {
    public vrk ai;

    @Override // defpackage.btdu
    protected final boolean aO() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btdu
    public final vux aP() {
        return vux.AVOID_RODIZIO_AREAS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btdu
    public final vpc aQ() {
        return vpc.SAO_PAULO;
    }

    @Override // defpackage.btdu
    protected final vqy aR() {
        vrk vrkVar = this.ai;
        dowj bZ = dowm.c.bZ();
        dowl f = this.ae.f(vpc.SAO_PAULO);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dowm dowmVar = (dowm) bZ.b;
        dowmVar.b = f.t;
        dowmVar.a |= 1;
        return vrkVar.a(dcdc.f(bZ.bK()), false, cjtd.a(dtxw.cm));
    }
}
