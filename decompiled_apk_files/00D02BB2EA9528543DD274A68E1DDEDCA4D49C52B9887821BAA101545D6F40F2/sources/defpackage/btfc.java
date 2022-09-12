package defpackage;
/* compiled from: PG */
/* renamed from: btfc  reason: default package */
/* loaded from: classes4.dex */
public final class btfc extends btdu {
    public vrr ai;

    @Override // defpackage.btdu
    protected final boolean aO() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btdu
    public final vux aP() {
        return vux.AVOID_SANTIAGO_SELLO_VERDE_ROADS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.btdu
    public final vpc aQ() {
        return vpc.SANTIAGO;
    }

    @Override // defpackage.btdu
    protected final vqy aR() {
        vrr vrrVar = this.ai;
        dowj bZ = dowm.c.bZ();
        dowl f = this.ae.f(vpc.SANTIAGO);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dowm dowmVar = (dowm) bZ.b;
        dowmVar.b = f.t;
        dowmVar.a |= 1;
        return vrrVar.a(dcdc.f(bZ.bK()), false, cjtd.a(dtxw.cm));
    }
}
