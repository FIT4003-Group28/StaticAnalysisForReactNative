package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afdf  reason: default package */
/* loaded from: classes2.dex */
public final class afdf implements afeh {
    public final dxio<ckcw> a;
    private final dxio<bukh> b;
    private final Executor c;

    public afdf(dxio<bukh> dxioVar, Executor executor, dxio<ckcw> dxioVar2) {
        this.b = dxioVar;
        this.c = executor;
        this.a = dxioVar2;
    }

    @Override // defpackage.afeh
    public final void a(btzi<dhqq, dhqs> btziVar) {
        buac a = this.b.a().a();
        a.b();
        a.e = null;
        bukj c = this.b.a().c();
        dhqp bZ = dhqq.c.bZ();
        dnqg bZ2 = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ2.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhqq dhqqVar = (dhqq) bZ.b;
        dnqh bK = bZ2.bK();
        bK.getClass();
        dhqqVar.b = bK;
        dhqqVar.a |= 1;
        c.b(bZ.bK(), new afde(this, btziVar), this.c);
    }
}
