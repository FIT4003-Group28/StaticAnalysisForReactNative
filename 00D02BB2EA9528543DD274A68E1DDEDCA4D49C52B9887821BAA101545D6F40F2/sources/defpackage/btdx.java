package defpackage;
/* compiled from: PG */
/* renamed from: btdx  reason: default package */
/* loaded from: classes4.dex */
public final class btdx extends btdu {
    public vre ai;

    @Override // defpackage.btdu
    protected final boolean aO() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btdu
    public final vux aP() {
        return vux.AVOID_MANILA_NUMBER_CODING_ROADS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btdu
    public final vpc aQ() {
        return vpc.MANILA;
    }

    @Override // defpackage.btdu
    protected final vqy aR() {
        vre vreVar = this.ai;
        dowj bZ = dowm.c.bZ();
        dowl f = this.ae.f(vpc.MANILA);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dowm dowmVar = (dowm) bZ.b;
        dowmVar.b = f.t;
        dowmVar.a |= 1;
        return vreVar.a(dcdc.f(bZ.bK()), false, cjtd.a(dtxw.cm));
    }
}
