package defpackage;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdua  reason: default package */
/* loaded from: classes3.dex */
public class bdua implements bdoe, bdrv, bdtp {
    public final bdru a;
    public final bcan b;
    public final bdqk c;
    public aeui d;
    public btlu e;
    private final gga f;
    private final bdtn g;
    private final bdlb h;
    private final bdpe i;
    private final bdun j;
    private final bdre k;
    private final bcpc l;
    private final aesb m;
    private final ahjq n;
    private final bbtk o;
    private final bdsd p;
    private final btvo q;
    private final PublicDisclosureLayout$PublicDisclosureViewModelImpl r;
    private final caxn s;
    private final akqq t;
    private final akfc u;
    private final akfa v;
    private final anhp w;
    private final boolean x;
    private final bdqd y;

    public bdua(bdru bdruVar, bbve bbveVar, bcpc bcpcVar, boolean z, bwrs<bcan> bwrsVar, bdmb bdmbVar, bdmb bdmbVar2, aeui aeuiVar, bdsd bdsdVar, akqq akqqVar, gga ggaVar, aesb aesbVar, ahjq ahjqVar, bbtk bbtkVar, bwqv bwqvVar, akfa akfaVar, akfc akfcVar, anhp anhpVar, bdqe bdqeVar, bdto bdtoVar, bdlc bdlcVar, bdpf bdpfVar, bduo bduoVar, bdrf bdrfVar, bdql bdqlVar, btvo btvoVar, final PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl, caxn caxnVar, cqkj cqkjVar) {
        int i;
        bdtm bdtmVar;
        this.a = bdruVar;
        this.f = ggaVar;
        this.p = bdsdVar;
        this.m = aesbVar;
        this.n = ahjqVar;
        this.o = bbtkVar;
        this.u = akfcVar;
        this.v = akfaVar;
        this.w = anhpVar;
        bcan c = bwrsVar.c();
        dbsk.s(c);
        this.b = c;
        this.l = bcpcVar;
        this.x = z;
        this.d = aeuiVar;
        bdqe.a(bwrsVar, 1);
        bdqe.a(cqkjVar, 2);
        gga a = bdqeVar.a.a();
        bdqe.a(a, 3);
        btvo a2 = bdqeVar.b.a();
        bdqe.a(a2, 4);
        cjqq a3 = bdqeVar.c.a();
        bdqe.a(a3, 5);
        this.y = new bdqd(bwrsVar, cqkjVar, a, a2, a3);
        int ordinal = bcpcVar.ordinal();
        if (ordinal != 0) {
            i = 1;
            bdtmVar = ordinal != 1 ? bdtm.PUBLISH : bdtm.PUBLISH;
        } else {
            i = 1;
            bdtmVar = bdtm.ATTACH;
        }
        bdtm bdtmVar2 = bdtmVar;
        bbvb b = bbveVar.b();
        bdto.a(bdtmVar2, i);
        bdto.a(b, 3);
        bdto.a(bwrsVar, 4);
        bdto.a(this, 5);
        Activity activity = (Activity) ((dxjd) bdtoVar.a).a;
        bdto.a(activity, 6);
        axru a4 = bdtoVar.b.a();
        bdto.a(a4, 7);
        bdto.a(bdtoVar.c.a(), 8);
        this.g = new bdtn(bdtmVar2, z, b, bwrsVar, this, activity, a4);
        bdlc.a(bdruVar, 1);
        bdlc.a(bbveVar, 2);
        bdlc.a(bwrsVar, 3);
        bdlc.a(this, 4);
        Activity activity2 = (Activity) ((dxjd) bdlcVar.a).a;
        bdlc.a(activity2, 5);
        cqhn a5 = bdlcVar.b.a();
        bdlc.a(a5, 6);
        Executor a6 = bdlcVar.c.a();
        bdlc.a(a6, 7);
        Executor a7 = bdlcVar.d.a();
        bdlc.a(a7, 8);
        axru a8 = bdlcVar.e.a();
        bdlc.a(a8, 9);
        bdlr a9 = bdlcVar.f.a();
        bdlc.a(a9, 10);
        bdlx a10 = bdlcVar.g.a();
        bdlc.a(a10, 11);
        bbtk a11 = bdlcVar.h.a();
        bdlc.a(a11, 12);
        bbut a12 = bdlcVar.i.a();
        bdlc.a(a12, 13);
        cjqy a13 = bdlcVar.j.a();
        bdlc.a(a13, 14);
        bdqb a14 = bdlcVar.k.a();
        bdlc.a(a14, 15);
        dxio a15 = ((dxjh) bdlcVar.l).a();
        bdlc.a(a15, 16);
        this.h = new bdlb(bdruVar, bbveVar, bwrsVar, this, activity2, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15);
        bdpf.a(bdruVar, 1);
        bdpf.a(bdruVar, 2);
        bdpf.a(bdruVar, 3);
        bdpf.a(bwrsVar, 4);
        bdpf.a(bdmbVar, 5);
        bdpf.a(this, 7);
        Activity activity3 = (Activity) ((dxjd) bdpfVar.a).a;
        bdpf.a(activity3, 9);
        btvo a16 = bdpfVar.b.a();
        bdpf.a(a16, 10);
        dxio a17 = ((dxjh) bdpfVar.c).a();
        bdpf.a(a17, 11);
        Executor a18 = bdpfVar.d.a();
        bdpf.a(a18, 12);
        axru a19 = bdpfVar.e.a();
        bdpf.a(a19, 13);
        cjqy a20 = bdpfVar.f.a();
        bdpf.a(a20, 14);
        bbtk a21 = bdpfVar.g.a();
        bdpf.a(a21, 15);
        bdod a22 = bdpfVar.h.a();
        bdpf.a(a22, 16);
        jmq a23 = bdpfVar.i.a();
        bdpf.a(a23, 17);
        bdml a24 = bdpfVar.j.a();
        bdpf.a(a24, 18);
        bdmr a25 = bdpfVar.k.a();
        bdpf.a(a25, 19);
        bdpg a26 = bdpfVar.l.a();
        bdpf.a(a26, 20);
        bdpi a27 = bdpfVar.m.a();
        bdpf.a(a27, 21);
        this.i = new bdpe((ges) bdruVar, bdruVar, bdruVar, bwrsVar, bdmbVar, bdmbVar2, this, true, activity3, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27);
        Application a28 = bduoVar.a.a();
        bduo.a(a28, 1);
        dxio a29 = ((dxjh) bduoVar.b).a();
        bduo.a(a29, 2);
        dxio a30 = ((dxjh) bduoVar.c).a();
        bduo.a(a30, 3);
        dxio a31 = ((dxjh) bduoVar.d).a();
        bduo.a(a31, 4);
        dxio a32 = ((dxjh) bduoVar.e).a();
        bduo.a(a32, 5);
        cjnf a33 = bduoVar.f.a();
        bduo.a(a33, 6);
        dxio a34 = ((dxjh) bduoVar.g).a();
        bduo.a(a34, 7);
        this.j = new bdun(a28, a29, a30, a31, a32, a33, a34);
        cqhn a35 = bdrfVar.a.a();
        bdrf.a(a35);
        this.k = new bdre(a35);
        ckcw a36 = bdqlVar.a.a();
        bdql.a(a36, 1);
        bbtk a37 = bdqlVar.b.a();
        bdql.a(a37, 2);
        bdql.a(bdqlVar.c.a(), 3);
        aesb a38 = bdqlVar.d.a();
        bdql.a(a38, 4);
        aujx a39 = bdqlVar.e.a();
        bdql.a(a39, 5);
        bbul a40 = bdqlVar.f.a();
        bdql.a(a40, 6);
        cjqy a41 = bdqlVar.g.a();
        bdql.a(a41, 7);
        dzsj<appz> dzsjVar = bdqlVar.h;
        dxio a42 = ((dxjh) bdqlVar.i).a();
        bdql.a(a42, 9);
        Executor a43 = bdqlVar.j.a();
        bdql.a(a43, 10);
        Executor a44 = bdqlVar.k.a();
        bdql.a(a44, 11);
        this.c = new bdqk(a36, a37, a38, a39, a40, a41, dzsjVar, a42, a43, a44);
        this.q = btvoVar;
        akqq akqqVar2 = c.b == dwyd.SHARE_INTENT ? akqqVar : null;
        this.t = akqqVar2;
        this.e = akfaVar.j();
        this.r = publicDisclosureLayout$PublicDisclosureViewModelImpl;
        publicDisclosureLayout$PublicDisclosureViewModelImpl.o(cayd.TOOLTIP);
        bwqvVar.g(bwrsVar, new bwrr(publicDisclosureLayout$PublicDisclosureViewModelImpl) { // from class: bdtq
            private final PublicDisclosureLayout$PublicDisclosureViewModelImpl a;

            {
                this.a = publicDisclosureLayout$PublicDisclosureViewModelImpl;
            }

            @Override // defpackage.bwrr
            public final void PV(Object obj) {
                bbud f;
                PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl2 = this.a;
                bcan bcanVar = (bcan) obj;
                ilo iloVar = null;
                if (bcanVar != null && (f = bcanVar.f()) != null) {
                    iloVar = ((bbsp) f).a.f();
                }
                publicDisclosureLayout$PublicDisclosureViewModelImpl2.m(iloVar);
            }
        });
        this.s = caxnVar;
        if (!ahjqVar.s() || !ahjqVar.d() || !z || !this.d.equals(aeui.b) || akqqVar2 == null) {
            ahjqVar.s();
            this.d.equals(aeui.b);
            return;
        }
        dwjc bZ = dwjd.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjd dwjdVar = (dwjd) bZ.b;
        int i2 = dwjdVar.a | 2;
        dwjdVar.a = i2;
        dwjdVar.b = 10;
        dwjdVar.a = i2 | 4;
        dwjdVar.c = 5;
        dnyc bZ2 = dnzj.Z.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnzj.b((dnzj) bZ2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjd dwjdVar2 = (dwjd) bZ.b;
        dnzj bK = bZ2.bK();
        bK.getClass();
        dwjdVar2.f = bK;
        dwjdVar2.a |= 64;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjd.c((dwjd) bZ.b);
        dbsk.s(akqqVar2);
        anhpVar.a(bZ.bK(), akqqVar2, 6, new bdtz(this));
    }

    private final dbsg<dvxh> C() {
        bbud f = this.b.f();
        return f == null ? dbpy.a : ((bbsp) f).a.h(bdtv.a);
    }

    public final void A(aeui aeuiVar) {
        this.d = aeuiVar;
        if (aeuiVar.i() != null) {
            this.a.Qn(aeuiVar.i());
        }
    }

    public final void B() {
        this.f.g().e();
        bbud f = this.b.f();
        ilo iloVar = null;
        if (f != null && f.b()) {
            iloVar = ((bbsp) f).a.b();
        }
        dwyd dwydVar = this.b.b;
        ddho ddhoVar = dtyi.z;
        if (iloVar == null || dwydVar == dwyd.SHARE_INTENT) {
            return;
        }
        this.m.D(iloVar, 6, ddhoVar);
    }

    @Override // defpackage.bdoe
    public void a(List<bbtj> list) {
        this.h.l(list);
        this.i.a(list);
    }

    @Override // defpackage.bdol
    public void b(bbtj bbtjVar) {
        if (bdur.b(this.b.b)) {
            dcdc<bbtm> l = this.b.l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                c(this.o.b(l.get(i)));
            }
        }
        this.h.i(bbtjVar);
        this.i.l(bbtjVar);
        cqkx.p(this.g);
        cqkx.p(this.i);
    }

    @Override // defpackage.bdol
    public void c(bbtj bbtjVar) {
        this.h.j(bbtjVar);
        this.i.m(bbtjVar);
        cqkx.p(this.g);
        cqkx.p(this.i);
    }

    @Override // defpackage.bdol
    public void d(bbtj bbtjVar, boolean z) {
        this.k.h(bbtjVar, z);
    }

    @Override // defpackage.bdol
    public void e() {
        cqkx.p(this.h);
        cqkx.p(this.i);
        cqkx.p(this.g);
    }

    @Override // defpackage.bdrv
    public void f() {
        this.f.s();
    }

    @Override // defpackage.bdrv
    public void g() {
        this.p.q();
    }

    @Override // defpackage.bdrv
    public boolean h(final cjqm cjqmVar) {
        bcpc bcpcVar = bcpc.SELECT_AND_RETURN;
        int ordinal = this.l.ordinal();
        boolean z = false;
        if (ordinal == 0) {
            bcan bcanVar = this.b;
            bcanVar.a.a(this.f, bcanVar.p());
            return false;
        } else if (ordinal != 1) {
            return true;
        } else {
            if (((ges) this.a).aD) {
                if (this.b.f() == null) {
                    if (!this.q.getPhotoUploadParameters().k) {
                        Toast.makeText(this.f, (int) R.string.UGC_PHOTO_UPLOAD_PLACE_NOT_SELECTED, 0).show();
                    } else {
                        g();
                    }
                } else {
                    this.u.a(akeu.j(new akeo(this, cjqmVar) { // from class: bdtw
                        private final bdua a;
                        private final cjqm b;

                        {
                            this.a = this;
                            this.b = cjqmVar;
                        }

                        @Override // defpackage.akeo
                        public final void a(gga ggaVar, btlu btluVar) {
                            ilo iloVar;
                            bdua bduaVar = this.a;
                            cjqm cjqmVar2 = this.b;
                            bdka bdkaVar = new bdka();
                            bdkaVar.a(aeui.b);
                            String t = btluVar.t();
                            dbsk.s(t);
                            bdkaVar.a = t;
                            bdkaVar.c = bduaVar.b;
                            if (cjqmVar2 != null) {
                                bdkaVar.d = cjqmVar2;
                                bdkaVar.e = dtyi.B;
                                bdkaVar.f = dtyd.be;
                                bdkaVar.a(bduaVar.d);
                                String str = "";
                                String str2 = bdkaVar.a == null ? " accountName" : str;
                                if (bdkaVar.b == null) {
                                    str2 = str2.concat(" IAmHereState");
                                }
                                if (bdkaVar.c == null) {
                                    str2 = String.valueOf(str2).concat(" photoSelectionContext");
                                }
                                if (bdkaVar.d == null) {
                                    str2 = String.valueOf(str2).concat(" loggedInteraction");
                                }
                                if (bdkaVar.e == null) {
                                    str2 = String.valueOf(str2).concat(" genericPublishButtonVE");
                                }
                                if (bdkaVar.f == null) {
                                    str2 = String.valueOf(str2).concat(" specificPublishButtonVE");
                                }
                                if (!str2.isEmpty()) {
                                    String valueOf = String.valueOf(str2);
                                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                                }
                                bdkb bdkbVar = new bdkb(bdkaVar.a, bdkaVar.b, bdkaVar.c, bdkaVar.d, bdkaVar.e, bdkaVar.f);
                                bdqk bdqkVar = bduaVar.c;
                                bcan c = bdkbVar.c();
                                dcbg b = dcbg.b(c.l());
                                bbtk bbtkVar = bdqkVar.b;
                                bbtkVar.getClass();
                                dcdc z2 = b.s(new dbrn(bbtkVar) { // from class: bdqf
                                    private final bbtk a;

                                    {
                                        this.a = bbtkVar;
                                    }

                                    @Override // defpackage.dbrn
                                    public final Object a(Object obj) {
                                        return this.a.b((bbtm) obj);
                                    }
                                }).z();
                                bcan c2 = bdkbVar.c();
                                dwyd dwydVar = c2.b;
                                bbud f = c2.f();
                                if (f == null || !f.b()) {
                                    iloVar = null;
                                } else {
                                    iloVar = ((bbsp) f).a.b();
                                    ddho e = bdkbVar.e();
                                    aesb aesbVar = bdqkVar.c;
                                    if (dwydVar != dwyd.SHARE_INTENT) {
                                        aesbVar.D(iloVar, 6, e);
                                    }
                                }
                                boolean g = c2.g();
                                ddho f2 = bdkbVar.f();
                                cjqy cjqyVar = bdqkVar.f;
                                dwyd dwydVar2 = dwyd.UNKNOWN_ENTRY_POINT;
                                ddcu ddcuVar = dwydVar.ordinal() != 8 ? null : ddcu.aF;
                                if (ddcuVar != null) {
                                    cjta c3 = cjtd.c(cjtd.a(f2));
                                    c3.g(cjrx.a(ddcuVar.a));
                                    cjqyVar.m(new cjte(deaf.AUTOMATED), c3.a());
                                }
                                aujx aujxVar = bdqkVar.d;
                                if (dwydVar.ordinal() == 8) {
                                    aujxVar.c(ddos.PHOTO_TAKEN).a(iloVar != null ? iloVar.ai() : null);
                                }
                                if (dwyd.PHOTO_TAKEN_NOTIFICATION.equals(dwydVar) && g) {
                                    ((ckco) bdqkVar.a.a(ckdz.v)).a(z2.size());
                                }
                                bcan c4 = bdkbVar.c();
                                bbud f3 = c4.f();
                                dbsg h = f3 == null ? dbpy.a : ((bbsp) f3).a.h(new dbrn(bdkbVar, c4) { // from class: bdqh
                                    private final bdqa a;
                                    private final bcan b;

                                    {
                                        this.a = bdkbVar;
                                        this.b = c4;
                                    }

                                    @Override // defpackage.dbrn
                                    public final Object a(Object obj) {
                                        akqi ai;
                                        bdqa bdqaVar = this.a;
                                        bcan bcanVar2 = this.b;
                                        ilo iloVar2 = (ilo) obj;
                                        bbvh e2 = bbvh.e(iloVar2);
                                        aeue i = bdqaVar.b().i();
                                        crtr crtrVar = null;
                                        if (bcanVar2.b.equals(dwyd.PHOTO_TAKEN_NOTIFICATION) && (ai = iloVar2.ai()) != null && i != null && ai.p(i.c())) {
                                            crtq bZ = crtr.d.bZ();
                                            float h2 = i.h();
                                            if (bZ.c) {
                                                bZ.bF();
                                                bZ.c = false;
                                            }
                                            crtr crtrVar2 = (crtr) bZ.b;
                                            crtrVar2.a |= 1;
                                            crtrVar2.b = h2;
                                            crtrVar = bZ.bK();
                                        }
                                        if (crtrVar != null) {
                                            bbvg d = e2.d();
                                            d.b(crtrVar);
                                            return d.a();
                                        }
                                        return e2;
                                    }
                                });
                                if (h.a()) {
                                    bdqg bdqgVar = new bdqg(bdqkVar, bdkbVar, c, h);
                                    bvrj.UI_THREAD.c();
                                    bdqkVar.i.execute(new Runnable(bdqkVar, z2, bdkbVar, bdqgVar) { // from class: bdqi
                                        private final bdqk a;
                                        private final List b;
                                        private final bdqa c;
                                        private final bdqg d;

                                        {
                                            this.a = bdqkVar;
                                            this.b = z2;
                                            this.c = bdkbVar;
                                            this.d = bdqgVar;
                                        }

                                        /* JADX WARN: Code restructure failed: missing block: B:101:0x02c2, code lost:
                                            r5 = r2;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:102:0x02c3, code lost:
                                            r0 = defpackage.appz.a;
                                            r16 = r16;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
                                            r0 = defpackage.dcbg.b(r0).o(new defpackage.appx(r10)).z();
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:44:0x0134, code lost:
                                            if (r10.a().a() == false) goto L141;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:46:0x0144, code lost:
                                            r10 = r10.a().b().longValue() * 1000;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:47:0x0147, code lost:
                                            r10 = Long.MAX_VALUE;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:48:0x014c, code lost:
                                            r3 = new android.media.MediaMuxer(r12, 0);
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:49:0x0152, code lost:
                                            r12 = new java.util.HashMap();
                                            r15 = r0.iterator();
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:51:0x015f, code lost:
                                            if (r15.hasNext() == false) goto L85;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:53:0x0165, code lost:
                                            r23 = r4;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:54:0x0167, code lost:
                                            r4 = (defpackage.appy) r15.next();
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:55:0x016b, code lost:
                                            r22 = r7;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:56:0x016d, code lost:
                                            r12.put(java.lang.Integer.valueOf(r4.b), r4);
                                            r7 = r22;
                                            r4 = r23;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:57:0x017b, code lost:
                                            r23 = r4;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:58:0x017d, code lost:
                                            r22 = r7;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:59:0x0181, code lost:
                                            r23 = r4;
                                            r22 = r7;
                                            r4 = r0.iterator();
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:61:0x018d, code lost:
                                            if (r4.hasNext() == false) goto L90;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:62:0x018f, code lost:
                                            r7 = (defpackage.appy) r4.next();
                                            r13.selectTrack(r7.b);
                                            r7.c = r3.addTrack(r7.a);
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:64:0x01a3, code lost:
                                            r4 = r8;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:65:0x01a7, code lost:
                                            r13.seekTo(0, 0);
                                            r7 = java.nio.ByteBuffer.allocate(2097152);
                                            r8 = new android.media.MediaCodec.BufferInfo();
                                            r0 = r0.iterator();
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:67:0x01bd, code lost:
                                            if (r0.hasNext() == false) goto L102;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:68:0x01bf, code lost:
                                            r15 = (defpackage.appy) r0.next();
                                            r24 = r0;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:69:0x01cd, code lost:
                                            if (r15.a.containsKey(r1) == false) goto L101;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:70:0x01cf, code lost:
                                            r0 = r15.a.getInteger(r1);
                                            r15 = r15.b;
                                            r3.setOrientationHint(r0);
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:71:0x01da, code lost:
                                            r0 = r24;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:72:0x01dd, code lost:
                                            r0 = new java.util.HashMap();
                                            r3.start();
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:73:0x01e5, code lost:
                                            r24 = r1;
                                            r5 = r5;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:75:0x01e8, code lost:
                                            r1 = r13.readSampleData(r7, 0);
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:76:0x01ec, code lost:
                                            if (r1 >= 0) goto L109;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:77:0x01ee, code lost:
                                            r3.stop();
                                            r3.release();
                                            r1 = defpackage.appw.c();
                                            ((defpackage.appr) r1).b = 1;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:78:0x0202, code lost:
                                            if (r0.isEmpty() != false) goto L131;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:79:0x0204, code lost:
                                            ((defpackage.appr) r1).a = defpackage.dbsg.i(java.lang.Long.valueOf(((java.lang.Long) java.util.Collections.max(r0.values())).longValue()));
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:80:0x021f, code lost:
                                            r0 = r1.a();
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:81:0x0223, code lost:
                                            r25 = r4;
                                            r16 = r5;
                                            r5 = r2;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:82:0x022a, code lost:
                                            r25 = r4;
                                            r16 = r5;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:83:0x022f, code lost:
                                            r8.presentationTimeUs = r13.getSampleTime();
                                            r8.flags = r13.getSampleFlags();
                                            r8.size = r1;
                                            r8.offset = 0;
                                            r4 = r13.getSampleTrackIndex();
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:84:0x0244, code lost:
                                            r5 = r2;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:85:0x0245, code lost:
                                            r1 = r8.presentationTimeUs;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:86:0x024b, code lost:
                                            if (r8.presentationTimeUs < r10) goto L119;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:87:0x024d, code lost:
                                            r1 = java.lang.Integer.valueOf(r4);
                                            r26 = r10;
                                            r10 = r8.presentationTimeUs;
                                            r13.unselectTrack(r4);
                                            r0.put(r1, java.lang.Long.valueOf(r8.presentationTimeUs / 1000));
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:88:0x0264, code lost:
                                            r26 = r10;
                                            r1 = (defpackage.appy) r12.get(java.lang.Integer.valueOf(r4));
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:89:0x0270, code lost:
                                            if (r1 == null) goto L123;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:90:0x0272, code lost:
                                            r3.writeSampleData(r1.c, r7, r8);
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:91:0x0277, code lost:
                                            r13.advance();
                                            r2 = r5;
                                            r5 = r16;
                                            r4 = r25;
                                            r10 = r26;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:92:0x0283, code lost:
                                            r24 = r1;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:93:0x0285, code lost:
                                            r25 = r4;
                                            r16 = r5;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:94:0x028a, code lost:
                                            r24 = r1;
                                            r16 = r5;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:95:0x028f, code lost:
                                            r24 = r1;
                                            r23 = r4;
                                            r16 = r5;
                                            r22 = r7;
                                            r25 = r8;
                                            r5 = r2;
                                            r0 = defpackage.appz.a;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:97:0x029d, code lost:
                                            r24 = r1;
                                            r23 = r4;
                                            r16 = r5;
                                            r22 = r7;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:98:0x02a5, code lost:
                                            r25 = r8;
                                         */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Removed duplicated region for block: B:105:0x02cb  */
                                        /* JADX WARN: Removed duplicated region for block: B:149:0x0315 A[SYNTHETIC] */
                                        /* JADX WARN: Removed duplicated region for block: B:151:0x0313 A[SYNTHETIC] */
                                        /* JADX WARN: Removed duplicated region for block: B:152:0x0086 A[SYNTHETIC] */
                                        /* JADX WARN: Type inference failed for: r5v11 */
                                        /* JADX WARN: Type inference failed for: r5v12 */
                                        /* JADX WARN: Type inference failed for: r5v9 */
                                        @Override // java.lang.Runnable
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final void run() {
                                            /*
                                                Method dump skipped, instructions count: 811
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: defpackage.bdqi.run():void");
                                        }
                                    });
                                }
                                bdru bdruVar = bduaVar.a;
                                bdqq bdqqVar = ((bdsd) bdruVar).f;
                                btvo a = bdqqVar.a.a();
                                bdqq.a(a, 1);
                                dxio a2 = ((dxjh) bdqqVar.b).a();
                                bdqq.a(a2, 2);
                                bbtk a3 = bdqqVar.c.a();
                                bdqq.a(a3, 3);
                                bhhf a4 = bdqqVar.d.a();
                                bdqq.a(a4, 4);
                                dxio a5 = ((dxjh) bdqqVar.e).a();
                                bdqq.a(a5, 5);
                                bdqq.a(bdqqVar.f.a(), 6);
                                bdqq.a(bdruVar, 7);
                                bdqp bdqpVar = new bdqp(a, a2, a3, a4, a5, bdruVar);
                                bcan c5 = bdkbVar.c();
                                bbud f4 = c5.f();
                                if (f4 == null) {
                                    bvoo.h("No location in the PhotoSelectionContext.", new Object[0]);
                                    return;
                                }
                                dcdc r = dcdc.r(c5.l());
                                dcbg b2 = dcbg.b(r);
                                bbtk bbtkVar2 = bdqpVar.d;
                                bbtkVar2.getClass();
                                bbvj bbvjVar = new bbvj(f4, b2.s(new dbrn(bbtkVar2) { // from class: bdqm
                                    private final bbtk a;

                                    {
                                        this.a = bbtkVar2;
                                    }

                                    @Override // defpackage.dbrn
                                    public final Object a(Object obj) {
                                        return this.a.b((bbtm) obj);
                                    }
                                }));
                                if (((Boolean) ((bbsp) f4).a.h(new dbrn(bdqpVar, bdkbVar, r, c5, bbvjVar) { // from class: bdqn
                                    private final bdqp a;
                                    private final bdqa b;
                                    private final dcdc c;
                                    private final bcan d;
                                    private final bbvj e;

                                    {
                                        this.a = bdqpVar;
                                        this.b = bdkbVar;
                                        this.c = r;
                                        this.d = c5;
                                        this.e = bbvjVar;
                                    }

                                    @Override // defpackage.dbrn
                                    public final Object a(Object obj) {
                                        bdqp bdqpVar2 = this.a;
                                        bdqa bdqaVar = this.b;
                                        dcdc<bbtm> dcdcVar = this.c;
                                        bcan bcanVar2 = this.d;
                                        bbvj bbvjVar2 = this.e;
                                        ilo iloVar2 = (ilo) obj;
                                        aeui b3 = bdqaVar.b();
                                        if (iln.UNRESOLVED.equals(iloVar2.be())) {
                                            Iterator<aeue> it = b3.g.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    ilo iloVar3 = (ilo) bwrs.b(it.next().f());
                                                    dbsk.s(iloVar3);
                                                    if (iloVar2.ai().p(iloVar3.ai())) {
                                                        iloVar2 = iloVar3;
                                                        break;
                                                    }
                                                } else {
                                                    bvoo.j(new Exception("Failed resolving a placemark, the labelling flow might not trigger."));
                                                    break;
                                                }
                                            }
                                        }
                                        dwyd dwydVar3 = bcanVar2.b;
                                        boolean z3 = false;
                                        if (!bdqpVar2.b.getUgcOfferingsParameters().e().contains(Integer.valueOf(dwydVar3.Z))) {
                                            dcdc<ccwi> e2 = bdqpVar2.c.a().e(iloVar2, dcdcVar);
                                            if (!e2.isEmpty() && !bdqpVar2.e.a(iloVar2)) {
                                                bdqpVar2.g.h();
                                                bdqpVar2.c.a().p(e2, bbvjVar2);
                                                z3 = true;
                                            }
                                        }
                                        return Boolean.valueOf(z3);
                                    }
                                }).c(false)).booleanValue()) {
                                    return;
                                }
                                chhs a6 = bdqp.a(bdqpVar.f.a(), c5.b);
                                bdqo bdqoVar = bdqpVar.g;
                                dcdc e2 = dcdc.e();
                                djgx bZ = djhq.j.bZ();
                                djgw a7 = chiw.a();
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                djhq djhqVar = (djhq) bZ.b;
                                a7.getClass();
                                djhqVar.b = a7;
                                int i = djhqVar.a | 1;
                                djhqVar.a = i;
                                djhqVar.c = a6.a.d;
                                djhqVar.a = i | 2;
                                bbud bbudVar = bbvjVar.a;
                                if (bbudVar != null) {
                                    dbsg<ilo> a8 = bbudVar.a();
                                    if (a8.a()) {
                                        akqi ai = a8.b().ai();
                                        dbuh.d(ai);
                                        str = ai.o();
                                    }
                                }
                                djhg bZ2 = djhh.b.bZ();
                                djha bZ3 = djhd.e.bZ();
                                if (bZ3.c) {
                                    bZ3.bF();
                                    bZ3.c = false;
                                }
                                djhd djhdVar = (djhd) bZ3.b;
                                str.getClass();
                                int i2 = djhdVar.a | 1;
                                djhdVar.a = i2;
                                djhdVar.b = str;
                                int i3 = bbvjVar.b;
                                djhdVar.a = i2 | 2;
                                djhdVar.c = i3;
                                djhd djhdVar2 = (djhd) bZ3.b;
                                dsrj<djhc> dsrjVar = djhdVar2.d;
                                if (!dsrjVar.a()) {
                                    djhdVar2.d = dsqw.cl(dsrjVar);
                                }
                                dsod.bv(e2, djhdVar2.d);
                                bZ2.a(bZ3);
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                djhq djhqVar2 = (djhq) bZ.b;
                                djhh bK = bZ2.bK();
                                bK.getClass();
                                djhqVar2.d = bK;
                                djhqVar2.a |= 4;
                                if (a6.d.a().b()) {
                                    djho bZ4 = djhp.b.bZ();
                                    djhe bZ5 = djhf.d.bZ();
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    djhf djhfVar = (djhf) bZ5.b;
                                    str.getClass();
                                    int i4 = 1 | djhfVar.a;
                                    djhfVar.a = i4;
                                    djhfVar.b = str;
                                    int i5 = bbvjVar.c;
                                    djhfVar.a = i4 | 2;
                                    djhfVar.c = i5;
                                    bZ4.a(bZ5);
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    djhq djhqVar3 = (djhq) bZ.b;
                                    djhp bK2 = bZ4.bK();
                                    bK2.getClass();
                                    djhqVar3.f = bK2;
                                    djhqVar3.a |= 32;
                                }
                                bdqoVar.g(bZ.bK());
                                return;
                            }
                            throw new NullPointerException("Null loggedInteraction");
                        }

                        @Override // defpackage.akeo
                        public final void b(gga ggaVar, btlu btluVar) {
                        }
                    }).b());
                    z = this.v.j().l();
                }
            }
            return !z;
        }
    }

    @Override // defpackage.bdtp
    public bdtk i() {
        return this.g;
    }

    @Override // defpackage.bdtp
    public bdks j() {
        return this.h;
    }

    @Override // defpackage.bdtp
    public bdoq k() {
        return this.i;
    }

    @Override // defpackage.bdtp
    public bduj l() {
        return this.j;
    }

    @Override // defpackage.bdtp
    public bdrc m() {
        return this.k;
    }

    @Override // defpackage.bdtp
    public cjtd n() {
        bbud f = this.b.f();
        if (f == null) {
            return cjtd.b;
        }
        return (cjtd) ((bbsp) f).a.h(bdtr.a).c(cjtd.b);
    }

    @Override // defpackage.bdtp
    public CharSequence o() {
        dbsg j;
        if (q().booleanValue()) {
            bbud f = this.b.f();
            dbsk.s(f);
            j = ((bbsp) f).a.h(bdts.a);
        } else {
            j = dbsg.j(this.e.v());
        }
        return (CharSequence) j.c("");
    }

    @Override // defpackage.bdtp
    public String p() {
        dbsg j;
        if (q().booleanValue()) {
            j = C().h(bdtt.a);
        } else {
            j = dbsg.j(this.e.i);
        }
        return (String) j.c("");
    }

    @Override // defpackage.bdtp
    public Boolean q() {
        return (Boolean) C().h(bdtu.a).c(false);
    }

    @Override // defpackage.bdtp
    public Boolean r() {
        return Boolean.valueOf(this.s.a);
    }

    @Override // defpackage.bdtp
    public Boolean s() {
        return Boolean.valueOf(this.b.c().a());
    }

    @Override // defpackage.bdtp
    public String t() {
        int intValue = this.b.c().c(0).intValue();
        return this.f.getResources().getQuantityString(R.plurals.UGC_PHOTO_UPLOAD_MAX_SELECTION_LIMIT, intValue, Integer.valueOf(intValue));
    }

    public void u(bbua bbuaVar) {
        this.h.h(bbuaVar);
    }

    public void v(gds gdsVar) {
        this.u.a(akeu.j(new bdtx(this)).b());
    }

    public void w(m mVar) {
        k Nh = mVar.Nh();
        PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl = this.r;
        dbsk.s(publicDisclosureLayout$PublicDisclosureViewModelImpl);
        Nh.a(publicDisclosureLayout$PublicDisclosureViewModelImpl);
    }

    @Override // defpackage.caye
    public cayf x() {
        return this.r;
    }

    public void y() {
        if (this.l != bcpc.SELECT_AND_RETURN || !this.q.getPhotoUploadParameters().h) {
            bdqd bdqdVar = this.y;
            final bdty bdtyVar = new bdty(this);
            if (bdqdVar.c.getEnableFeatureParameters().R) {
                dwyd dwydVar = bdqdVar.f.b;
                dsrf dsrfVar = bdqdVar.c.getPhotoUploadParameters().c;
                if ((dsrfVar.contains(-1) || (dwydVar != null && dsrfVar.contains(Integer.valueOf(dwydVar.Z)))) && !bdqdVar.f.j() && bdqdVar.f.i()) {
                    fd K = bdqdVar.e.K();
                    dbsk.s(K);
                    if (K.o != null && bcaj.d(K)) {
                        iii iiiVar = new iii();
                        iiiVar.b = bdqdVar.a.getString(R.string.PHOTO_UPLOAD_CONFIRM_BEFORE_EXIT_DIALOG_TITLE);
                        iiiVar.d(bdqdVar.a.getString(R.string.YES_BUTTON), new View.OnClickListener(bdtyVar) { // from class: bbrz
                            private final bdty a;

                            {
                                this.a = bdtyVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                bdua bduaVar = this.a.a;
                                if (((ges) bduaVar.a).aD) {
                                    bduaVar.B();
                                }
                            }
                        }, cjtd.a(dtxy.cU));
                        iiiVar.c(bdqdVar.a.getString(R.string.NO_BUTTON), new View.OnClickListener() { // from class: bbsa
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                            }
                        }, cjtd.a(dtxy.cV));
                        iiiVar.a(bdqdVar.a, bdqdVar.d).k();
                        bdqdVar.b.g().d(cjtd.a(dtxy.cT));
                        return;
                    }
                }
            }
            bdua bduaVar = bdtyVar.a;
            if (!((ges) bduaVar.a).aD) {
                return;
            }
            bduaVar.B();
            return;
        }
        B();
    }

    public aeui z() {
        return this.d;
    }
}
