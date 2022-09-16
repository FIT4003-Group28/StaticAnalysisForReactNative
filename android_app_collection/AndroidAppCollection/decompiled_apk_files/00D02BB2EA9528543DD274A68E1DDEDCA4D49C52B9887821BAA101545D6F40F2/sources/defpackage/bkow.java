package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bkow  reason: default package */
/* loaded from: classes3.dex */
public final class bkow implements bkpi {
    public final gga a;
    public final bvvw b;
    public final btvo c;
    private final bwqv d;
    private final dxio<begg> e;
    private final dxio<afha> f;
    private final dxio<akfc> g;
    private final blka h;

    public bkow(gga ggaVar, bwqv bwqvVar, dxio<begg> dxioVar, blka blkaVar, dxio<afha> dxioVar2, dxio<akfc> dxioVar3, bvvw bvvwVar, btvo btvoVar) {
        this.a = ggaVar;
        this.d = bwqvVar;
        this.e = dxioVar;
        this.h = blkaVar;
        this.f = dxioVar2;
        this.g = dxioVar3;
        this.b = bvvwVar;
        this.c = btvoVar;
    }

    @Override // defpackage.bkpi
    public final void a(bwrs<ilo> bwrsVar) {
        if (this.e.a().i(bege.REVIEWS)) {
            this.e.a().k(bege.REVIEWS);
        } else {
            this.a.D(blnu.aR(this.d, bwrsVar, dbpy.a, dbpy.a, dbpy.a, false, dbpy.a));
        }
    }

    @Override // defpackage.bkpi
    public final void b(bwrs<ilo> bwrsVar, dbsg<drdk> dbsgVar, dbsg<String> dbsgVar2, dbsg<djuu> dbsgVar3, boolean z, dbsg<String> dbsgVar4) {
        if (this.e.a().i(bege.REVIEWS)) {
            this.e.a().l(bege.REVIEWS, bloa.g(this.d, bwrsVar, false, dbsgVar, dbsgVar2, dbsgVar3, z, dbsgVar4));
            return;
        }
        this.a.D(blnu.aR(this.d, bwrsVar, dbsgVar, dbsgVar2, dbsgVar3, z, dbsgVar4));
    }

    @Override // defpackage.bkpi
    public final void c(bwrs<ilo> bwrsVar) {
        gga ggaVar = this.a;
        bwqv bwqvVar = this.d;
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "placemark", bwrsVar);
        cedc cedcVar = new cedc();
        cedcVar.B(bundle);
        ggaVar.D(cedcVar);
    }

    @Override // defpackage.bkpi
    public final void d(bwrs<ilo> bwrsVar, String str, dqgr dqgrVar, bkpg bkpgVar) {
        final dbsg dbsgVar;
        blka blkaVar = this.h;
        bkov bkovVar = new bkov(this, bwrsVar, bkpgVar);
        Executor a = blkaVar.a.a();
        blka.a(a, 1);
        burf a2 = blkaVar.b.a();
        blka.a(a2, 2);
        blka.a(bkovVar, 3);
        final bljz bljzVar = new bljz(a, a2, bkovVar);
        ilo c = bwrsVar.c();
        if (c != null) {
            Iterator<cdjd> it = c.by().iterator();
            while (true) {
                if (!it.hasNext()) {
                    dbsgVar = dbpy.a;
                    break;
                }
                cdjd next = it.next();
                if (str.equals(next.a().g())) {
                    dbsgVar = dbsg.i(next);
                    break;
                }
            }
        } else {
            dbsgVar = dbpy.a;
        }
        if (!dbsgVar.a()) {
            difg bZ = difj.b.bZ();
            difh bZ2 = difi.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            difi difiVar = (difi) bZ2.b;
            str.getClass();
            difiVar.a = 1 | difiVar.a;
            difiVar.b = str;
            difi bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            difj difjVar = (difj) bZ.b;
            bK.getClass();
            dsrj<difi> dsrjVar = difjVar.a;
            if (!dsrjVar.a()) {
                difjVar.a = dsqw.cl(dsrjVar);
            }
            difjVar.a.add(bK);
            bljy bljyVar = new bljy(bljzVar, dqgrVar);
            bljzVar.b.b(bZ.bK(), bljyVar, bljzVar.a);
            return;
        }
        bljzVar.a.execute(new Runnable(bljzVar, dbsgVar) { // from class: bljx
            private final bljz a;
            private final dbsg b;

            {
                this.a = bljzVar;
                this.b = dbsgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c.a((cdjd) this.b.b());
            }
        });
    }

    @Override // defpackage.bkpi
    @Deprecated
    public final void e(bwrs<ilo> bwrsVar, cdjd cdjdVar, bkpg bkpgVar) {
        gei.a(this.a, bldv.g(this.d, bwrsVar, bwrs.a(cdjdVar), bkpgVar));
    }

    @Override // defpackage.bkpi
    public final void f(bwrs<ilo> bwrsVar, bwrs<cdjd> bwrsVar2, bkpg bkpgVar) {
        gei.a(this.a, bldv.g(this.d, bwrsVar, bwrsVar2, bkpgVar));
    }

    @Override // defpackage.bkpi
    public final void g(bwrs<ilo> bwrsVar, bwrs<cdjd> bwrsVar2, bkpg bkpgVar) {
        gga ggaVar = this.a;
        bwqv bwqvVar = this.d;
        bldv bldvVar = new bldv();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "placemark", bwrsVar);
        bwqvVar.c(bundle, "post_ref", bwrsVar2);
        bundle.putSerializable("options", bkpgVar);
        bundle.putBoolean("isSelfReview", true);
        bldvVar.B(bundle);
        gei.a(ggaVar, bldvVar);
    }

    @Override // defpackage.bkpi
    public final void h() {
        fd K = this.a.K();
        if (K instanceof bldv) {
            ((bldv) K).aT();
        }
    }

    @Override // defpackage.bkpi
    public final void i(cdjd cdjdVar, bkph bkphVar) {
        String str;
        if (((bkpc) bkphVar).b - 1 != 0) {
            str = (String) cdjdVar.d().h(bkos.a).h(bkot.a).c("");
        } else {
            str = (String) cdjdVar.b().d().h(bkor.a).c("");
        }
        if (!str.isEmpty()) {
            j(str, bkphVar);
        }
    }

    public final void j(final String str, bkph bkphVar) {
        if (!((bkpc) bkphVar).a || Uri.parse(str).getQueryParameter("wv") != null) {
            this.g.a().a(akeu.j(new akeo(this, str) { // from class: bkoq
                private final bkow a;
                private final String b;

                {
                    this.a = this;
                    this.b = str;
                }

                @Override // defpackage.akeo
                public final void a(gga ggaVar, btlu btluVar) {
                    bkow bkowVar = this.a;
                    String str2 = this.b;
                    bvvw bvvwVar = bkowVar.b;
                    bvvr e = bvvs.e();
                    btvo btvoVar = bkowVar.c;
                    bvxn bZ = bvxu.A.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    bvxu bvxuVar = (bvxu) bZ.b;
                    str2.getClass();
                    int i = bvxuVar.a | 1;
                    bvxuVar.a = i;
                    bvxuVar.b = str2;
                    bvxuVar.a = i | 4;
                    bvxuVar.d = true;
                    bvxu.b(bvxuVar);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    bvxu bvxuVar2 = (bvxu) bZ.b;
                    bvxuVar2.a |= 512;
                    bvxuVar2.k = true;
                    bvxp f = bvoa.f(ibm.b(), bkowVar.a);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    bvxu bvxuVar3 = (bvxu) bZ.b;
                    f.getClass();
                    bvxuVar3.x = f;
                    int i2 = bvxuVar3.a | 4194304;
                    bvxuVar3.a = i2;
                    int i3 = i2 | 2048;
                    bvxuVar3.a = i3;
                    bvxuVar3.m = true;
                    int i4 = i3 | 64;
                    bvxuVar3.a = i4;
                    bvxuVar3.h = "aGMM.ReviewRap";
                    bvxuVar3.a = i4 | 16;
                    bvxuVar3.f = 1;
                    if ((btvoVar.getEnableFeatureParameters().b & 2097152) != 0) {
                        dkyx dkyxVar = btvoVar.getEnableFeatureParameters().ar;
                        if (dkyxVar == null) {
                            dkyxVar = dkyx.f;
                        }
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        bvxu bvxuVar4 = (bvxu) bZ.b;
                        dkyxVar.getClass();
                        bvxuVar4.j = dkyxVar;
                        bvxuVar4.a |= 256;
                    }
                    e.b(bZ.bK());
                    bvvwVar.r(e.a(), dtya.dM);
                }

                @Override // defpackage.akeo
                public final void b(gga ggaVar, btlu btluVar) {
                }
            }).b());
            return;
        }
        try {
            this.f.a().f(this.a, Intent.parseUri(str, 1), 4);
        } catch (URISyntaxException unused) {
        }
    }
}
