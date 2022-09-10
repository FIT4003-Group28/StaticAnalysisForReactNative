package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: brsc  reason: default package */
/* loaded from: classes4.dex */
public class brsc {
    public bwrs<ilo> a;
    private final cvv b;
    private final btvo c;
    private final dxio<begg> d;

    public brsc(dxio<begg> dxioVar, cvv cvvVar, btvo btvoVar) {
        this.b = cvvVar;
        this.c = btvoVar;
        this.d = dxioVar;
    }

    public final cjtd a(brrx brrxVar, String str) {
        ddhj ddhjVar;
        ddes ddesVar;
        ilo e = e();
        cjta c = cjtd.c(e != null ? e.bZ() : null);
        c.d = brrxVar.b();
        if (brrxVar.c()) {
            ddhjVar = ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
        } else {
            ddhjVar = ddhj.VISIBILITY_VISIBLE;
        }
        c.w(ddhjVar);
        if (brrxVar.h().a()) {
            if (c.e() == null) {
                ddesVar = ddet.D.bZ();
            } else {
                ddet e2 = c.e();
                dbsk.s(e2);
                dsqp dsqpVar = (dsqp) e2.cu(5);
                dsqpVar.bC(e2);
                ddesVar = (ddes) dsqpVar;
            }
            ddhc b = brrxVar.h().b();
            if (ddesVar.c) {
                ddesVar.bF();
                ddesVar.c = false;
            }
            ddet ddetVar = (ddet) ddesVar.b;
            b.getClass();
            ddetVar.r = b;
            ddetVar.a |= ImageMetadata.SHADING_MODE;
            c.s(ddesVar.bK());
        }
        if (!str.isEmpty()) {
            c.g(str);
        }
        return c.a();
    }

    public final cjtd b(brrx brrxVar) {
        return a(brrxVar, "");
    }

    public final void c(ddho ddhoVar, int i) {
        ilo e = e();
        if (e == null) {
            return;
        }
        String bK = e.bK();
        if (!e.aM() || !this.c.getAdsParameters().g || bK == null) {
            return;
        }
        this.b.c(bK, ddhoVar.b(), i);
    }

    public final void d(bege begeVar) {
        ilo e = e();
        if (e != null) {
            begj begjVar = new begj();
            begjVar.b(e);
            begjVar.c = jjn.FULLY_EXPANDED;
            begjVar.e = begeVar;
            this.d.a().o(begjVar, false, null);
        }
    }

    protected final ilo e() {
        bwrs<ilo> bwrsVar = this.a;
        if (bwrsVar != null) {
            return bwrsVar.c();
        }
        return null;
    }
}
