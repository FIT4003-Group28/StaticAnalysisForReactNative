package defpackage;

import android.content.BroadcastReceiver;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbry  reason: default package */
/* loaded from: classes3.dex */
public final class bbry extends itb implements bbut {
    public final bwqv a;
    public final bbtu b;
    public final bhhf c;
    private final gga d;
    private final auhi e;
    private final bbtk f;
    private final ckcw g;
    private final cjqy h;
    private final axru i;
    private final dbsg<dxio<aesb>> j;
    private final dbsg<dxio<begg>> k;
    private final dxio<afha> o;
    private final dxio<cjnx> p;
    private final bvjj q;
    private final bvrb r;
    private final btvo s;
    private final dxio<apni> t;
    private final bbul u;
    private final akfc v;

    public bbry(gga ggaVar, auhi auhiVar, bbtk bbtkVar, cjqy cjqyVar, ckcw ckcwVar, bwqv bwqvVar, axru axruVar, dbsg<dxio<aesb>> dbsgVar, dbsg<dxio<begg>> dbsgVar2, dxio<afha> dxioVar, dxio<cjnx> dxioVar2, bvjj bvjjVar, bvrb bvrbVar, btvo btvoVar, dxio<apni> dxioVar3, bbtu bbtuVar, bbul bbulVar, bhhf bhhfVar, akfc akfcVar) {
        this.d = ggaVar;
        this.e = auhiVar;
        this.f = bbtkVar;
        this.h = cjqyVar;
        this.g = ckcwVar;
        this.a = bwqvVar;
        this.i = axruVar;
        this.j = dbsgVar;
        this.k = dbsgVar2;
        this.o = dxioVar;
        this.p = dxioVar2;
        this.q = bvjjVar;
        this.r = bvrbVar;
        this.s = btvoVar;
        this.t = dxioVar3;
        this.b = bbtuVar;
        this.u = bbulVar;
        this.c = bhhfVar;
        this.v = akfcVar;
    }

    private final void J(dwyd dwydVar) {
        if (dwydVar == dwyd.PHOTO_TAKEN_NOTIFICATION) {
            ((aesb) ((dxio) ((dbsu) this.j).a).a()).i(dhiz.HERE_NOTIFICATION_SHOWN);
        }
    }

    private static bcan K(dwyd dwydVar, String str, @dzsi ilo iloVar, Iterable<bbtj> iterable, Iterable<bbtj> iterable2) {
        bcan bcanVar = new bcan(dwydVar, dbsg.i(str));
        bcanVar.G(iterable);
        bcanVar.y(dchl.c(iterable2));
        if (iloVar != null) {
            bcanVar.a(bbud.c(iloVar));
        }
        return bcanVar;
    }

    private static cjrz L(ddcu ddcuVar, int i, dwyd dwydVar, int i2) {
        cjry e = cjrz.e();
        e.b(ddcuVar);
        dddf bZ = dddg.g.bZ();
        dddp bZ2 = dddr.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dddr dddrVar = (dddr) bZ2.b;
        dddrVar.b = 2;
        int i3 = dddrVar.a | 1;
        dddrVar.a = i3;
        dddrVar.c = dwydVar.Z;
        int i4 = i3 | 2;
        dddrVar.a = i4;
        dddrVar.a = i4 | 4;
        dddrVar.d = i2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddg dddgVar = (dddg) bZ.b;
        dddr bK = bZ2.bK();
        bK.getClass();
        dddgVar.c = bK;
        dddgVar.a |= 8;
        ((cjrn) e).b = bZ.bK();
        return e.a();
    }

    public static boolean i(dwyd dwydVar) {
        dwyd dwydVar2 = dwyd.UNKNOWN_ENTRY_POINT;
        int ordinal = dwydVar.ordinal();
        return ordinal == 8 || ordinal == 11 || ordinal == 20 || ordinal == 31;
    }

    public final bcan B(dwyd dwydVar, String str, @dzsi ilo iloVar, Iterable<bbtm> iterable, Iterable<bbtm> iterable2) {
        dcbg b = dcbg.b(iterable);
        final bbtk bbtkVar = this.f;
        bbtkVar.getClass();
        dcbg s = b.s(new dbrn(bbtkVar) { // from class: bbrv
            private final bbtk a;

            {
                this.a = bbtkVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.b((bbtm) obj);
            }
        });
        dcbg b2 = dcbg.b(iterable2);
        final bbtk bbtkVar2 = this.f;
        bbtkVar2.getClass();
        return K(dwydVar, str, iloVar, s, b2.s(new dbrn(bbtkVar2) { // from class: bbrw
            private final bbtk a;

            {
                this.a = bbtkVar2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.b((bbtm) obj);
            }
        }));
    }

    @Override // defpackage.bbut
    public final void C(String str, UserOrientation userOrientation) {
        this.o.a().l(this.d, cknu.a(this.s, str, userOrientation, true), 4);
    }

    @Override // defpackage.bbut
    public final /* bridge */ /* synthetic */ fd D(bbuq bbuqVar, int i, bbty bbtyVar) {
        return bcrg.aS(this.s, this.a, null, bbuqVar, bbtyVar, i, null, null);
    }

    @Override // defpackage.bbut
    public final void E(List<Uri> list, ilo iloVar, bbus bbusVar, dwyd dwydVar, aeui aeuiVar) {
        J(dwydVar);
        bbuy bbuyVar = bbuy.SHOW_FULLY_EXPANDED_PLACESHEET;
        int a = dkhb.a(this.s.getPhotoTakenNotificationParameters().o);
        if (a != 0 && a == 4) {
            bbuyVar = bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW;
        }
        boolean z = false;
        if (dwyd.PHOTO_TAKEN_NOTIFICATION.equals(dwydVar) && !this.i.a("android.permission.READ_EXTERNAL_STORAGE")) {
            z = true;
        }
        ilo iloVar2 = true != bbus.AUTO_SHOW.equals(bbusVar) ? iloVar : null;
        List<Uri> a2 = this.s.getPhotoTakenNotificationParameters().n ? list : dchl.a();
        dcbg b = dcbg.b(list);
        final bbtk bbtkVar = this.f;
        bbtkVar.getClass();
        dcbg s = b.s(new dbrn(bbtkVar) { // from class: bbrt
            private final bbtk a;

            {
                this.a = bbtkVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.a((Uri) obj);
            }
        });
        dcbg b2 = dcbg.b(a2);
        final bbtk bbtkVar2 = this.f;
        bbtkVar2.getClass();
        bcan K = K(dwydVar, "", iloVar2, s, b2.s(new dbrn(bbtkVar2) { // from class: bbru
            private final bbtk a;

            {
                this.a = bbtkVar2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.a((Uri) obj);
            }
        }));
        K.e(z);
        bbvd e = bbvd.e(iloVar.aj());
        if (bbusVar == bbus.AUTO_SHOW) {
            bbvc d = e.d();
            d.c(true);
            e = d.a();
        }
        bbuz m = bbve.m();
        ((bbsu) m).a = e;
        m.b(bbuyVar);
        m.e(K.b);
        f(K, bdsd.i(m.a(), bcpc.SELECT_AND_UPLOAD, i(dwydVar), bwrs.a(K), this.a, aeuiVar, null));
        t(dwydVar, K);
        if (dwyd.PHOTO_TAKEN_NOTIFICATION.equals(dwydVar)) {
            avac.bp(this.d, Integer.valueOf(dpyv.PHOTO_TAKEN.dm), this.q, this.r, this.e);
        }
    }

    @Override // defpackage.bbut
    public final void F(bbuq bbuqVar) {
        gga ggaVar = this.d;
        bwqv bwqvVar = this.a;
        bccs bccsVar = new bccs();
        bccsVar.B(bccs.w(bwqvVar, bbuqVar, null, null));
        ggaVar.D(bccsVar);
    }

    @Override // defpackage.bbut
    public final void G(bwrs<ilo> bwrsVar, dspd dspdVar) {
        dbsk.m(true, "Your component needs a binding for PlacePageVeneer");
        bcbm c = bcbn.c();
        ((bcbo) c).a = dbsg.i(dspdVar);
        bcbn a = c.a();
        if (!((begg) ((dxio) ((dbsu) this.k).a).a()).i(bege.PHOTOS)) {
            this.d.D(bccn.w(this.a, bwrsVar, null, a, false));
            return;
        }
        ((begg) ((dxio) ((dbsu) this.k).a).a()).l(bege.PHOTOS, bccn.w(this.a, bwrsVar, null, a, true));
    }

    @Override // defpackage.bbut
    public final void H(bbuq bbuqVar, bbty bbtyVar, bwrs<ilo> bwrsVar) {
        this.d.D(bcrg.aS(this.s, this.a, bwrsVar, bbuqVar, bbtyVar, 0, null, null));
    }

    @Override // defpackage.bbut
    public final void I(dwfl dwflVar, @dzsi ilo iloVar) {
        bdjk.w(this.d, dwflVar, iloVar, this.a, this.s, this.o);
    }

    @Override // defpackage.itb
    public final void Nu() {
        BroadcastReceiver broadcastReceiver;
        apt aptVar;
        super.Nu();
        bbrq bbrqVar = (bbrq) this.u;
        if (!bbrqVar.b || (broadcastReceiver = bbrqVar.c) == null || (aptVar = bbrqVar.d) == null) {
            return;
        }
        aptVar.c(broadcastReceiver);
        bbrqVar.b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.bbut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.util.List<android.net.Uri> r19, @defpackage.dzsi defpackage.akqq r20, @defpackage.dzsi java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbry.e(java.util.List, akqq, java.lang.String):void");
    }

    public final void f(bcan bcanVar, ges gesVar) {
        bcaj bcajVar = bcanVar.a;
        gga ggaVar = this.d;
        dbsk.m(bcajVar.a == null, "pushFirstFragment(ForResult) shouldn't be called twice in a single photo upload flow.");
        bcaj.e(gesVar);
        bcajVar.a = gesVar.getClass();
        ggaVar.D(gesVar);
    }

    @Override // defpackage.bbut
    public final void j(final bbve bbveVar) {
        dbsk.m(!bbveVar.b().a().a(), "Photo upload flow cannot have stand alone title text due to privacy reasons.");
        akep j = akeu.j(new akeo(this, bbveVar) { // from class: bbrr
            private final bbry a;
            private final bbve b;

            {
                this.a = this;
                this.b = bbveVar;
            }

            @Override // defpackage.akeo
            public final void a(gga ggaVar, btlu btluVar) {
                bbve bbveVar2;
                bbry bbryVar = this.a;
                bbve bbveVar3 = this.b;
                bcan B = bbryVar.B(bbveVar3.d(), "", bbveVar3.f(), bbveVar3.g(), bbveVar3.h());
                ilo f = bbveVar3.f();
                if (f == null || !bbryVar.c.a(f)) {
                    bbveVar2 = bbveVar3;
                } else {
                    bbuz l = bbveVar3.l();
                    l.b(bbuy.SHOW_PLACESHEET_PHOTOS_TAB_AND_MERCHANT_MODE_SNACKBAR);
                    bbveVar2 = l.a();
                }
                bbryVar.f(B, bdsd.i(bbveVar2, bcpc.SELECT_AND_UPLOAD, bbry.i(bbveVar2.d()), bwrs.a(B), bbryVar.a, aeui.b, null));
                bbryVar.t(bbveVar3.d(), B);
            }

            @Override // defpackage.akeo
            public final void b(gga ggaVar, btlu btluVar) {
            }
        });
        j.a().b(btlt.GOOGLE, btlt.SIGNED_OUT);
        this.v.a(j.b());
    }

    @Override // defpackage.bbut
    public final void k(bbve bbveVar, gfw gfwVar) {
        bcan B = B(bbveVar.d(), bbveVar.e(), bbveVar.f(), bbveVar.g(), bbveVar.h());
        B.a.c(bdsd.i(bbveVar, bcpc.SELECT_AND_RETURN, false, bwrs.a(B), this.a, aeui.b, null), gfwVar);
        t(bbveVar.d(), B);
    }

    @Override // defpackage.bbut
    public final void l(bwrs<ilo> bwrsVar, @dzsi dwfl dwflVar, bbur bburVar) {
        dbsk.m(true, "Your component needs a binding for PlacePageVeneer");
        bcbm c = bcbn.c();
        ((bcbo) c).b = dbsg.i(bburVar);
        bcbn a = c.a();
        if (!((begg) ((dxio) ((dbsu) this.k).a).a()).i(bege.PHOTOS)) {
            this.d.D(bccn.w(this.a, bwrsVar, dwflVar, a, false));
            return;
        }
        ((begg) ((dxio) ((dbsu) this.k).a).a()).l(bege.PHOTOS, bccn.w(this.a, bwrsVar, dwflVar, a, true));
    }

    @Override // defpackage.bbut
    public final void m(bbuq bbuqVar, @dzsi dwfl dwflVar, bwrs<ilo> bwrsVar) {
        gga ggaVar = this.d;
        bwqv bwqvVar = this.a;
        bccs bccsVar = new bccs();
        bccsVar.B(bccs.w(bwqvVar, bbuqVar, bwrsVar, dwflVar));
        ggaVar.D(bccsVar);
    }

    @Override // defpackage.bbut
    public final void n(ilo iloVar) {
        gga ggaVar = this.d;
        btvo btvoVar = this.s;
        bwqv bwqvVar = this.a;
        bwrs a = bwrs.a(iloVar);
        ckoa ckoaVar = new ckoa(dcdc.r(iloVar.aE()));
        bbtv v = bbty.v();
        v.e(false);
        v.k(true);
        ggaVar.D(bcrg.aS(btvoVar, bwqvVar, a, ckoaVar, v.a(), 0, null, null));
    }

    @Override // defpackage.bbut
    public final void o(bbuq bbuqVar, int i, bbty bbtyVar, @dzsi gfw gfwVar) {
        q(bbuqVar, i, bbtyVar, gfwVar, null);
    }

    @Override // defpackage.bbut
    public final void p(bbuq bbuqVar, int i, bbty bbtyVar, bwrs<ilo> bwrsVar, @dzsi gfw gfwVar) {
        ges aS = bcrg.aS(this.s, this.a, bwrsVar, bbuqVar, bbtyVar, i, null, null);
        aS.Nz(gfwVar);
        this.d.D(aS);
    }

    @Override // defpackage.bbut
    public final void q(bbuq bbuqVar, int i, bbty bbtyVar, @dzsi gfw gfwVar, @dzsi String str) {
        ges aS = bcrg.aS(this.s, this.a, null, bbuqVar, bbtyVar, i, null, str);
        aS.Nz(gfwVar);
        this.d.D(aS);
    }

    @Override // defpackage.bbut
    public final dehn<List<dwfl>> r(final List<bbtm> list) {
        final deig d = deig.d();
        this.r.b(new Runnable(this, d, list) { // from class: bbrs
            private final bbry a;
            private final deig b;
            private final List c;

            {
                this.a = this;
                this.b = d;
                this.c = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final bbry bbryVar = this.a;
                this.b.j(dcbg.b(this.c).s(new dbrn(bbryVar) { // from class: bbrx
                    private final bbry a;

                    {
                        this.a = bbryVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        return this.a.b.b((bbtm) obj, eaou.i());
                    }
                }).z());
            }
        }, bvrj.BACKGROUND_THREADPOOL);
        return d;
    }

    @Override // defpackage.bbut
    public final void s(boolean z, dbsg<bbts> dbsgVar, @dzsi String str, gfw gfwVar, dwyd dwydVar) {
        bcan bcanVar = new bcan(dwydVar, dbsg.j(str));
        bcaj bcajVar = bcanVar.a;
        bwqv bwqvVar = this.a;
        bwrs a = bwrs.a(bcanVar);
        bbwb bbwbVar = new bbwb();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "photoSelectionContextRef", a);
        bundle.putBoolean("shouldTryToUseLiveCamera", z);
        bundle.putSerializable("cameraOpeningState", bbwa.NOT_OPENED);
        if (dbsgVar.a()) {
            bwqvVar.c(bundle, "liveCameraOption", dbsgVar.b());
        }
        bbwbVar.B(bundle);
        bcajVar.c(bbwbVar, gfwVar);
    }

    public final void t(dwyd dwydVar, bcan bcanVar) {
        String b = cjqg.b(this.h);
        cjst d = cjsu.d();
        d.d(ddda.dc);
        if (b != null) {
            ((cjrr) d).a = b;
        }
        dcdc<bbtm> l = bcanVar.l();
        int size = l.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f.b(l.get(i4)).b().equals(bbti.VIDEO)) {
                i3++;
            } else {
                i2++;
            }
        }
        if (i2 != 0) {
            i = i2;
        } else if (i3 == 0) {
            return;
        }
        if (i > 0) {
            d.f(L(ddcu.ac, 3, dwydVar, i));
        }
        if (i3 > 0) {
            d.f(L(ddcu.at, 3, dwydVar, i3));
        }
        this.h.l(d.e());
    }
}
