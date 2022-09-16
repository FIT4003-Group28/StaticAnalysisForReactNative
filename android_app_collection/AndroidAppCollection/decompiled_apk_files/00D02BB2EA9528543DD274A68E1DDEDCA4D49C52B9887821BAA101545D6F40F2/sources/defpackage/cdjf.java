package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: cdjf  reason: default package */
/* loaded from: classes4.dex */
public abstract class cdjf {
    public static cdje e() {
        cdit cditVar = new cdit();
        cditVar.a = dcdc.r(dcdc.e());
        cditVar.c(chbv.OBEY_SERVER_RESPONSE);
        dnqg bZ = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        cditVar.b(bZ.bK());
        return cditVar;
    }

    public abstract dcdc<bbtm> a();

    public abstract chbv b();

    public abstract dnqh c();

    public abstract cdjd d();
}
