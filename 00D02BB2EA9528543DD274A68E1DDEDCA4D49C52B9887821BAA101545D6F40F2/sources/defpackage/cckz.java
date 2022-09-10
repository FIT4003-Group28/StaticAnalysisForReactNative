package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cckz  reason: default package */
/* loaded from: classes4.dex */
public final class cckz extends itb implements cclq {
    public static final dcep<String> a = dcep.B("image/gif");
    public final gga b;
    public final bbtk c;
    public final ccst d;
    public final bwqv e;
    public final ccrh f;
    public final bunc g;
    public final Executor h;
    private final ccru i;
    private final btvo j;
    private final akfc k;
    private final dxio<akfa> o;
    private final dxio<bbut> p;

    static {
        dcep.B(ccvz.OFFERING_RECOMMENDATION);
    }

    public cckz(gga ggaVar, bbtk bbtkVar, ccru ccruVar, ccst ccstVar, btvo btvoVar, bwqv bwqvVar, ccrh ccrhVar, akfc akfcVar, dxio<akfa> dxioVar, bunc buncVar, dxio<bbut> dxioVar2, Executor executor) {
        this.b = ggaVar;
        this.c = bbtkVar;
        this.i = ccruVar;
        this.d = ccstVar;
        this.j = btvoVar;
        this.e = bwqvVar;
        this.f = ccrhVar;
        this.k = akfcVar;
        this.o = dxioVar;
        this.g = buncVar;
        this.h = executor;
        this.p = dxioVar2;
    }

    private final void q(final ccwk ccwkVar, final bvqg<List<drax>> bvqgVar) {
        this.i.b(ccwkVar.d, new bvqg(ccwkVar, bvqgVar) { // from class: ccku
            private final ccwk a;
            private final bvqg b;

            {
                this.a = ccwkVar;
                this.b = bvqgVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ccwk ccwkVar2 = this.a;
                bvqg bvqgVar2 = this.b;
                List list = (List) obj;
                dcep<String> dcepVar = cckz.a;
                list.size();
                ccwkVar2.d.size();
                bvqgVar2.NU(list);
            }
        });
    }

    private static dcdc<ccwi> r(ccxa ccxaVar, dcdc<bbtm> dcdcVar, dgfb dgfbVar, dcdc<ccvz> dcdcVar2) {
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            bbtm bbtmVar = dcdcVar.get(i);
            dbsk.a(!bbtmVar.a().isEmpty());
            ccwh bZ = ccwi.g.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccwi ccwiVar = (ccwi) bZ.b;
            ccxaVar.getClass();
            ccwiVar.c = ccxaVar;
            ccwiVar.a |= 2;
            String a2 = bbtmVar.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccwi ccwiVar2 = (ccwi) bZ.b;
            a2.getClass();
            ccwiVar2.a |= 4;
            ccwiVar2.f = a2;
            ccwi ccwiVar3 = (ccwi) bZ.b;
            dsrf dsrfVar = ccwiVar3.d;
            if (!dsrfVar.a()) {
                ccwiVar3.d = dsqw.cg(dsrfVar);
            }
            for (ccvz ccvzVar : dcdcVar2) {
                ccwiVar3.d.h(ccvzVar.f);
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccwi ccwiVar4 = (ccwi) bZ.b;
            ccwiVar4.b = dgfbVar.f;
            ccwiVar4.a |= 1;
            F.g(bZ.bK());
        }
        return F.f();
    }

    @Override // defpackage.itb
    public final void Nu() {
        super.Nu();
        this.i.a();
    }

    @Override // defpackage.cclq
    public final dcdc<ccwi> e(ilo iloVar, dcdc<bbtm> dcdcVar) {
        dehn<Boolean> o = o(false);
        if (o.isDone()) {
            try {
                if (((Boolean) deha.r(o)).booleanValue()) {
                    dcdc z = dcbg.b(dcdcVar).o(new dbsl(this) { // from class: cckp
                        private final cckz a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            String mimeTypeFromExtension;
                            cckz cckzVar = this.a;
                            bbtm bbtmVar = (bbtm) obj;
                            if (!cckzVar.c.b(bbtmVar).b().equals(bbti.PHOTO)) {
                                return false;
                            }
                            if ("content".equals(bbtmVar.z().getScheme())) {
                                mimeTypeFromExtension = cckzVar.b.getContentResolver().getType(bbtmVar.z());
                            } else {
                                mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(bbtmVar.a()).toLowerCase(Locale.ROOT));
                            }
                            bbtmVar.z();
                            return !TextUtils.isEmpty(mimeTypeFromExtension) && !cckz.a.contains(mimeTypeFromExtension);
                        }
                    }).z();
                    if (!this.j.getUgcOfferingsParameters().b() || !cclo.a(iloVar, dgfb.DISH)) {
                        if (!this.j.getUgcOfferingsParameters().c() || !cclo.a(iloVar, dgfb.PRODUCT_CATEGORY)) {
                            if (!this.j.getUgcOfferingsParameters().d() || !cclo.a(iloVar, dgfb.ACTIVITY)) {
                                return dcdc.e();
                            }
                            return r(cclt.a(iloVar), z, dgfb.ACTIVITY, dcdc.f(ccvz.OFFERING_NAME));
                        }
                        return r(cclt.a(iloVar), z, dgfb.PRODUCT_CATEGORY, dcdc.f(ccvz.OFFERING_NAME_WITH_SUGGEST));
                    }
                    return r(cclt.a(iloVar), z, dgfb.DISH, dcdc.f(ccvz.OFFERING_NAME_WITH_SUGGEST));
                }
            } catch (ExecutionException unused) {
            }
        }
        return dcdc.e();
    }

    @Override // defpackage.cclq
    public final void f(String str, @dzsi String str2, ccwk ccwkVar, ccme ccmeVar, gfw gfwVar) {
        gfwVar.aZ(cclk.g("", str2, ccwkVar, ccmeVar));
    }

    @Override // defpackage.cclq
    public final void i(dgfb dgfbVar, String str, @dzsi String str2, ccxa ccxaVar, ccme ccmeVar, gfw gfwVar) {
        ccwj bZ = ccwk.m.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwk ccwkVar = (ccwk) bZ.b;
        ccxaVar.getClass();
        ccwkVar.c = ccxaVar;
        int i = ccwkVar.a | 2;
        ccwkVar.a = i;
        ccwkVar.b = dgfbVar.f;
        ccwkVar.a = i | 1;
        ccwk bK = bZ.bK();
        dsqp dsqpVar = (dsqp) ccmeVar.cu(5);
        dsqpVar.bC(ccmeVar);
        ccmb ccmbVar = (ccmb) dsqpVar;
        if (ccmbVar.c) {
            ccmbVar.bF();
            ccmbVar.c = false;
        }
        ccme ccmeVar2 = (ccme) ccmbVar.b;
        ccme ccmeVar3 = ccme.f;
        ccmeVar2.b = 1;
        ccmeVar2.a = 1 | ccmeVar2.a;
        gfwVar.aZ(cclk.g(str, str2, bK, ccmbVar.bK()));
    }

    @Override // defpackage.cclq
    public final void j(final ccwk ccwkVar) {
        q(ccwkVar, new bvqg(this, ccwkVar) { // from class: cckq
            private final cckz a;
            private final ccwk b;

            {
                this.a = this;
                this.b = ccwkVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                cckz cckzVar = this.a;
                ccwk ccwkVar2 = this.b;
                ccrh ccrhVar = cckzVar.f;
                dehn<dhrc> c = cckzVar.d.c(ccwkVar2, 2, (List) obj);
                dgfb b = dgfb.b(ccwkVar2.b);
                if (b == null) {
                    b = dgfb.UNKNOWN_OFFERING_TYPE;
                }
                ccrhVar.c(c, b, 2);
            }
        });
    }

    @Override // defpackage.cclq
    public final void k(final bwrs<ilo> bwrsVar) {
        m(new Runnable(this, bwrsVar) { // from class: cckr
            private final cckz a;
            private final bwrs b;

            {
                this.a = this;
                this.b = bwrsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cckz cckzVar = this.a;
                bwrs bwrsVar2 = this.b;
                gga ggaVar = cckzVar.b;
                bwqv bwqvVar = cckzVar.e;
                ccwn bZ = ccwo.c.bZ();
                ccwj bZ2 = ccwk.m.bZ();
                dgfb dgfbVar = dgfb.DISH;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ccwk ccwkVar = (ccwk) bZ2.b;
                ccwkVar.b = dgfbVar.f;
                ccwkVar.a |= 1;
                ccwk ccwkVar2 = (ccwk) bZ2.b;
                ccwkVar2.k = 2;
                ccwkVar2.a |= 128;
                ilo iloVar = (ilo) bwrs.b(bwrsVar2);
                dbsk.s(iloVar);
                ccxa a2 = cclt.a(iloVar);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ccwk ccwkVar3 = (ccwk) bZ2.b;
                a2.getClass();
                ccwkVar3.c = a2;
                ccwkVar3.a |= 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ccwo ccwoVar = (ccwo) bZ.b;
                ccwk bK = bZ2.bK();
                bK.getClass();
                ccwoVar.b = bK;
                ccwoVar.a |= 1;
                Bundle bundle = new Bundle();
                cctq.a(bundle, bwqvVar, bwrsVar2);
                bvrs.k(bundle, "fragment_state", bZ.bK());
                cclf cclfVar = new cclf();
                cclfVar.B(bundle);
                ggaVar.D(cclfVar);
            }
        }, this.h);
    }

    @Override // defpackage.cclq
    public final void l(ccwk ccwkVar) {
        q(ccwkVar, new bvqg(this) { // from class: ccks
            private final cckz a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                cckz cckzVar = this.a;
                List list = (List) obj;
                dwcn bZ = dwco.f.bZ();
                dqju bZ2 = dqjw.i.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dqjw dqjwVar = (dqjw) bZ2.b;
                dqjwVar.b = 1;
                dqjwVar.a = 1 | dqjwVar.a;
                bZ2.a(dcbg.b(list).s(cckv.a));
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwco dwcoVar = (dwco) bZ.b;
                dqjw bK = bZ2.bK();
                bK.getClass();
                dwcoVar.e = bK;
                dwcoVar.a |= 16;
                cckzVar.g.b(bZ.bK(), new ccts(cckw.a, cckx.a), cckzVar.h);
            }
        });
    }

    @Override // defpackage.cclq
    public final void m(final Runnable runnable, Executor executor) {
        bvqj.e(o(true), new bvqg(runnable) { // from class: cckt
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                Runnable runnable2 = this.a;
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    runnable2.run();
                }
            }
        }, executor);
    }

    @Override // defpackage.cclq
    public final void n(bwrs<ilo> bwrsVar) {
        if (bwrsVar.c() == null) {
            return;
        }
        bbuz m = bbve.m();
        m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
        m.e(dwyd.PLACE_PAGE_MERCHANT_MODE_MENU_HIGHLIGHTS_CAROUSEL);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        ((bbsu) m).b = c;
        this.p.a().j(m.a());
    }

    public final dehn<Boolean> o(boolean z) {
        btlu j = this.o.a().j();
        if (j != null && j.u()) {
            if (!this.j.getUgcOfferingsParameters().a()) {
                return deha.a(false);
            }
            return deha.a(true);
        } else if (!z) {
            return deha.a(false);
        } else {
            deig d = deig.d();
            this.k.k(new ccky(this, d), null);
            return d;
        }
    }

    @Override // defpackage.cclq
    public final void p(dcdc<ccwi> dcdcVar, bbvj bbvjVar) {
        dbsk.a(!dcdcVar.isEmpty());
        ccwl bZ = ccwm.j.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwm ccwmVar = (ccwm) bZ.b;
        int i = ccwmVar.a | 2;
        ccwmVar.a = i;
        ccwmVar.c = false;
        int i2 = bbvjVar.b;
        int i3 = i | 8;
        ccwmVar.a = i3;
        ccwmVar.e = i2;
        int i4 = bbvjVar.c;
        int i5 = i3 | 16;
        ccwmVar.a = i5;
        ccwmVar.f = i4;
        ccwmVar.a = i5 | 32;
        ccwmVar.g = 0;
        bbud bbudVar = bbvjVar.a;
        if (bbudVar != null) {
            String str = (String) bbudVar.a().h(bbub.a).h(bbuc.a).c("");
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccwm ccwmVar2 = (ccwm) bZ.b;
            str.getClass();
            ccwmVar2.a |= 4;
            ccwmVar2.d = str;
        }
        ccwm bK = bZ.bK();
        ccko cckoVar = new ccko();
        dsqp dsqpVar = (dsqp) bK.cu(5);
        dsqpVar.bC(bK);
        ccwl ccwlVar = (ccwl) dsqpVar;
        dgfb b = dgfb.b(dcdcVar.get(0).b);
        if (b == null) {
            b = dgfb.UNKNOWN_OFFERING_TYPE;
        }
        if (ccwlVar.c) {
            ccwlVar.bF();
            ccwlVar.c = false;
        }
        ccwm ccwmVar3 = (ccwm) ccwlVar.b;
        ccwmVar3.h = b.f;
        ccwmVar3.a |= 64;
        int size = dcdcVar.size();
        if (ccwlVar.c) {
            ccwlVar.bF();
            ccwlVar.c = false;
        }
        ccwm ccwmVar4 = (ccwm) ccwlVar.b;
        ccwmVar4.a |= 128;
        ccwmVar4.i = size;
        ccwm bK2 = ccwlVar.bK();
        ccwc bZ2 = ccwf.e.bZ();
        ccwb a2 = ccyb.a(dcdcVar);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ccwf ccwfVar = (ccwf) bZ2.b;
        a2.getClass();
        ccwfVar.b = a2;
        ccwfVar.a |= 1;
        ccwf ccwfVar2 = (ccwf) bZ2.b;
        ccwfVar2.c = 1;
        int i6 = ccwfVar2.a | 2;
        ccwfVar2.a = i6;
        bK2.getClass();
        ccwfVar2.d = bK2;
        ccwfVar2.a = i6 | 4;
        Bundle bundle = new Bundle();
        bvrs.l(bundle, bZ2.bK());
        cckoVar.B(bundle);
        this.b.D(cckoVar);
        ccrh ccrhVar = this.f;
        dgfb b2 = dgfb.b(dcdcVar.get(0).b);
        if (b2 == null) {
            b2 = dgfb.UNKNOWN_OFFERING_TYPE;
        }
        int size2 = dcdcVar.size();
        if (ccrh.d.containsKey(b2)) {
            cjqy cjqyVar = ccrhVar.l;
            cjsx i7 = cjsy.i();
            i7.b(ccrh.d.get(b2));
            cjqyVar.k(i7.a());
        }
        if (ccrh.k.containsKey(b2)) {
            ((ckcn) ccrhVar.m.a(ccrh.k.get(b2))).b(size2);
        }
    }
}
