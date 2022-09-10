package defpackage;

import android.os.Bundle;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: cdqz  reason: default package */
/* loaded from: classes4.dex */
public final class cdqz implements cdjj {
    private static final dcqe b = dcqe.c("cdqz");
    public final bwqv a;
    private final akfc c;
    private final cdqx d;
    private final cebr e;

    public cdqz(bwqv bwqvVar, akfc akfcVar, cdqx cdqxVar, cebr cebrVar) {
        this.a = bwqvVar;
        this.c = akfcVar;
        this.d = cdqxVar;
        this.e = cebrVar;
    }

    private final void d(final cdzd cdzdVar) {
        this.c.a(akeu.j(new akeo(this, cdzdVar) { // from class: cdqy
            private final cdqz a;
            private final cdzd b;

            {
                this.a = this;
                this.b = cdzdVar;
            }

            @Override // defpackage.akeo
            public final void a(gga ggaVar, btlu btluVar) {
                cdqz cdqzVar = this.a;
                cdzd cdzdVar2 = this.b;
                bwqv bwqvVar = cdqzVar.a;
                dzvx.c(bwqvVar, "gmmStorage");
                ceae ceaeVar = new ceae();
                Bundle bundle = new Bundle();
                dzvx.c(bwqvVar, "gmmStorage");
                cdur cdurVar = (cdur) cdzdVar2;
                bwqvVar.c(bundle, "PLACEMARK_REF", cdurVar.a);
                bwqvVar.c(bundle, "POST", cdurVar.c);
                bundle.putByteArray("LOGGING_PARAMS", cdurVar.b.bS());
                ceaeVar.B(bundle);
                ggaVar.D(ceaeVar);
            }

            @Override // defpackage.akeo
            public final void b(gga ggaVar, btlu btluVar) {
            }
        }).b());
    }

    @Override // defpackage.cdjj
    public final void a(bwrs<ilo> bwrsVar, cdjf cdjfVar) {
        if (cdjfVar.d() == null) {
            bvoo.h("Editing post requires a Post passed in.", new Object[0]);
        } else if (!this.e.a()) {
        } else {
            cdjd d = cdjfVar.d();
            dbsk.s(d);
            if (!cebu.a(d) || !this.e.a()) {
                return;
            }
            dnqh c = cdjfVar.c();
            cdjd d2 = cdjfVar.d();
            dbsk.s(d2);
            dzvx.c(bwrsVar, "placemarkRef");
            dzvx.c(c, "loggingParams");
            if (bwrsVar.c() == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            d(new cdur(bwrsVar, c, d2));
        }
    }

    @Override // defpackage.cdjj
    public final void b(String str, dnqh dnqhVar, bwrs<ilo> bwrsVar, cdix cdixVar) {
        if (!this.e.a()) {
            bvoo.h("Photo posts is not enabled", new Object[0]);
            return;
        }
        cdqx cdqxVar = this.d;
        if ((dnqhVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0) {
            dsqp dsqpVar = (dsqp) dnqhVar.cu(5);
            dsqpVar.bC(dnqhVar);
            dnqg dnqgVar = (dnqg) dsqpVar;
            dnmu dnmuVar = dnmu.PROPERTY_GMM;
            if (dnqgVar.c) {
                dnqgVar.bF();
                dnqgVar.c = false;
            }
            dnqh dnqhVar2 = (dnqh) dnqgVar.b;
            dnqhVar2.l = dnmuVar.ap;
            dnqhVar2.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            dnqhVar = dnqgVar.bK();
        }
        cdqe cdqeVar = new cdqe(str, dnqhVar, bwrsVar, cdixVar);
        dhvf bZ = dhvg.d.bZ();
        String str2 = cdqeVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhvg dhvgVar = (dhvg) bZ.b;
        str2.getClass();
        int i = dhvgVar.a | 1;
        dhvgVar.a = i;
        dhvgVar.b = str2;
        dnqh dnqhVar3 = cdqeVar.b;
        dnqhVar3.getClass();
        dhvgVar.c = dnqhVar3;
        dhvgVar.a = i | 2;
        cdqxVar.c.b(bZ.bK(), new cdqv(cdqxVar, cdqeVar), cdqxVar.b);
    }

    @Override // defpackage.cdjj
    public final void c(bwrs<ilo> bwrsVar, cdjf cdjfVar) {
        if (!this.e.a()) {
            return;
        }
        dnqh c = cdjfVar.c();
        dzvx.c(bwrsVar, "placemarkRef");
        dzvx.c(c, "loggingParams");
        if (bwrsVar.c() != null) {
            d(new cdur(bwrsVar, c, null));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
