package defpackage;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdsd  reason: default package */
/* loaded from: classes3.dex */
public final class bdsd extends ges implements btzi, bwrr, bdru {
    private static final dcqe aA = dcqe.c("bdsd");
    public bdub a;
    private cqkf<bdtp> aB;
    private bcpc aC;
    private boolean aO;
    private bcan aP;
    private bdof aQ;
    private bdmb aR;
    private bdmb aS;
    private chhs aT;
    private akqq aU;
    private aeui aV;
    private djhq aW;
    private ProgressDialog aX;
    public ckcw ad;
    public ahjq ae;
    public gfq af;
    public bwqv ag;
    public btrm ah;
    public bbtk ai;
    public buqs aj;
    public chhr ak;
    public chht al;
    public cjqq am;
    public Executor an;
    public Executor ao;
    public btvo ap;
    public dxio<cafi> aq;
    public dxio<begg> ar;
    public dxio<bbut> as;
    public dxio<bhhf> at;
    public btpc au;
    public bdua av;
    public bbve aw;
    public bwrs<bcan> ax;
    public djhs ay;
    public Object az;
    public cqkj b;
    public efg c;
    public bdog d;
    public bdmc e;
    public bdqq f;
    public ff g;

    private final djhs aJ() {
        djhr bZ = djhs.d.bZ();
        chhs chhsVar = this.aT;
        if (chhsVar == null) {
            chhsVar = bdqp.a(this.al, this.aP.b);
            this.aT = chhsVar;
        }
        djgk bZ2 = djgl.g.bZ();
        djfu bZ3 = djfx.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        djfx djfxVar = (djfx) bZ3.b;
        djfxVar.b = 2;
        djfxVar.a |= 1;
        djva bZ4 = djvd.d.bZ();
        djvc djvcVar = djvc.MAJOR_TYPE;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        djvd djvdVar = (djvd) bZ4.b;
        djvdVar.b = djvcVar.d;
        djvdVar.a |= 1;
        String string = chhsVar.b.getString(R.string.UGC_PHOTO_UPLOAD_THANKS);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        djvd djvdVar2 = (djvd) bZ4.b;
        string.getClass();
        djvdVar2.a |= 2;
        djvdVar2.c = string;
        bZ3.c(bZ4);
        djva bZ5 = djvd.d.bZ();
        djvc djvcVar2 = djvc.MINOR_TYPE;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        djvd djvdVar3 = (djvd) bZ5.b;
        djvdVar3.b = djvcVar2.d;
        djvdVar3.a |= 1;
        String string2 = chhsVar.b.getString(R.string.UGC_PHOTO_UPLOAD_THANKS_YOUR_CONTRIBUTION_SHORT);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        djvd djvdVar4 = (djvd) bZ5.b;
        string2.getClass();
        djvdVar4.a |= 2;
        djvdVar4.c = string2;
        bZ3.c(bZ5);
        djeq bZ6 = djev.h.bZ();
        String string3 = chhsVar.b.getString(R.string.UGC_PHOTO_UPLOAD_CONTRIBUTE_MORE);
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        djev djevVar = (djev) bZ6.b;
        string3.getClass();
        djevVar.a |= 1;
        djevVar.b = string3;
        djdo bZ7 = djep.c.bZ();
        djdz bZ8 = djea.c.bZ();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        djep djepVar = (djep) bZ7.b;
        djea bK = bZ8.bK();
        bK.getClass();
        djepVar.b = bK;
        djepVar.a = 4;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        djev djevVar2 = (djev) bZ6.b;
        djep bK2 = bZ7.bK();
        bK2.getClass();
        djevVar2.c = bK2;
        djevVar2.a = 2 | djevVar2.a;
        bZ3.a(bZ6);
        bZ3.b(chhsVar.c);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djgl djglVar = (djgl) bZ2.b;
        djfx bK3 = bZ3.bK();
        bK3.getClass();
        djglVar.c = bK3;
        djglVar.b = 1;
        djgl bK4 = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djhs djhsVar = (djhs) bZ.b;
        bK4.getClass();
        djhsVar.b = bK4;
        djhsVar.a |= 1;
        return bZ.bK();
    }

    private final void aR() {
        ProgressDialog progressDialog = new ProgressDialog(this.g, 0);
        this.aX = progressDialog;
        progressDialog.setMessage(this.g.getString(R.string.SENDING));
        this.aX.show();
    }

    private final void aS() {
        bcaj bcajVar = this.aP.a;
        ff ffVar = this.g;
        dbsk.t(bcajVar.a, "popFragmentsUntilOutOfPhotoUploadFlow can't be called without calling pushFirstFragment(ForResult).");
        bcajVar.b(ffVar);
        ffVar.g().f();
    }

    private final void aT() {
        this.af.c();
    }

    private final void aU(ilo iloVar) {
        aV(iloVar, jjn.FULLY_EXPANDED, bege.PHOTOS);
    }

    private final void aV(ilo iloVar, jjn jjnVar, bege begeVar) {
        dspd dspdVar;
        begj begjVar = new begj();
        begjVar.b(iloVar);
        begjVar.e = begeVar;
        begjVar.c = jjnVar;
        this.at.a();
        if (this.at.a().n(iloVar)) {
            dixe dixeVar = iloVar.h().bo;
            if (dixeVar == null) {
                dixeVar = dixe.b;
            }
            dspdVar = null;
            for (dweu dweuVar : dixeVar.a) {
                int a = dpoe.a(dweuVar.l);
                if (a != 0 && a == 2) {
                    dspdVar = dweuVar.d;
                }
            }
        } else {
            dspdVar = null;
        }
        this.ar.a().o(begjVar, false, null);
        if (begeVar != bege.PHOTOS || dspdVar == null) {
            this.ar.a().k(begeVar);
        } else {
            this.as.a().G(bwrs.a(iloVar), dspdVar);
        }
    }

    private final void aX(cdhl cdhlVar) {
        ((ckcn) this.ad.a(ckdz.aI)).a();
        if (this.aw.a() == null) {
            bo(7);
            bvoo.h("PlacePickerOptions was null and so the place picker dialog should not be shown!", new Object[0]);
            return;
        }
        bcan c = this.ax.c();
        dbsk.s(c);
        this.aP = c;
        akqi a = cdhlVar.a();
        akqq b = cdhlVar.b();
        if (!a.equals(akqi.a)) {
            bo(2);
            this.aP.a(bbud.c(cdhlVar.a));
            cqkx.p(this.av);
            this.aQ.d();
            return;
        }
        if (b != null) {
            bo(4);
        } else {
            bo(5);
        }
        ff ffVar = this.g;
        Toast.makeText(ffVar, ffVar.getString(R.string.UGC_PLACE_PICKER_SELECT_POI), 1).show();
        q();
    }

    private static ilo bn(bcan bcanVar) {
        bbud f = bcanVar.f();
        if (f == null || !f.b()) {
            return null;
        }
        return ((bbsp) f).a.b();
    }

    private final void bo(int i) {
        ((ckco) this.ad.a(ckdz.aJ)).a(i - 1);
    }

    public static bdsd i(bbve bbveVar, bcpc bcpcVar, boolean z, bwrs<bcan> bwrsVar, bwqv bwqvVar, aeui aeuiVar, akqq akqqVar) {
        bcan c = bwrsVar.c();
        dbsk.s(c);
        dchl.k(c.l(), bdrw.a).toString();
        bdsd bdsdVar = new bdsd();
        Bundle bundle = new Bundle();
        if (akqqVar != null) {
            bundle.putSerializable("latLng", akqqVar);
        }
        bbveVar.c();
        bundle.putSerializable("unifiedPhotoUploadFlowProperties", bbveVar);
        bundle.putSerializable("photoUploadFlowIntention", bcpcVar);
        bundle.putBoolean("placeChangeable", z);
        bundle.putSerializable("storagePermissionRequestState", bdma.NOT_STARTED);
        bundle.putSerializable("storagePermissionDetailedState", bdlz.UNKNOWN);
        if (Build.VERSION.SDK_INT >= 29) {
            bundle.putSerializable("mediaLocationPermissionRequestState", bdma.NOT_STARTED);
            bundle.putSerializable("mediaLocationPermissionDetailedState", bdlz.UNKNOWN);
        }
        bwqvVar.c(bundle, "iAmHereState", aeuiVar);
        bwqvVar.c(bundle, "photoSelectionContext", bwrsVar);
        bdsdVar.B(bundle);
        return bdsdVar;
    }

    @Override // defpackage.ges, defpackage.gfr
    public final /* bridge */ /* synthetic */ fd Ny() {
        return this;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(Object obj) {
        ilo iloVar = (ilo) obj;
        if (iloVar != null) {
            this.aP.a(bbud.c(iloVar));
            bdua bduaVar = this.av;
            if (bduaVar == null) {
                return;
            }
            cqkx.p(bduaVar);
        }
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djhq> btzrVar, btzy btzyVar) {
        bvrj.UI_THREAD.c();
        if (this.aD) {
            w(aJ());
        } else {
            this.ay = aJ();
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr btzrVar, Object obj) {
        djhs djhsVar = (djhs) obj;
        bvrj.UI_THREAD.c();
        if ((djhsVar.a & 1) == 0) {
            djhsVar = aJ();
        }
        if (this.aD) {
            w(djhsVar);
        } else {
            this.ay = djhsVar;
        }
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(Object obj) {
        if (obj == null) {
            return;
        }
        bdua bduaVar = this.av;
        if (bduaVar == null) {
            this.az = obj;
        } else if (obj instanceof bbua) {
            bduaVar.u((bbua) obj);
        } else if (obj instanceof bcpb) {
        } else {
            if (obj instanceof aeuf) {
                aX(cdhl.e((aeuf) obj));
            } else if (obj instanceof cdil) {
                aX(((cdil) obj).a());
            } else {
                bvoo.h("Unknown result: %s", obj);
            }
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cqkf<bdtp> c = this.b.c(new bdsu(), viewGroup);
        this.aB = c;
        return c.c();
    }

    @Override // defpackage.fd
    public final void ah(View view, Bundle bundle) {
        bdua bduaVar = this.av;
        if (bduaVar != null) {
            bduaVar.w(x());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        this.ao.execute(new Runnable(this) { // from class: bdry
            private final bdsd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final bdsd bdsdVar = this.a;
                final bcan c = bdsdVar.ax.c();
                dbsk.s(c);
                bdsdVar.an.execute(new Runnable(bdsdVar, c) { // from class: bdrz
                    private final bdsd a;
                    private final bcan b;

                    {
                        this.a = bdsdVar;
                        this.b = c;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        final bdsd bdsdVar2 = this.a;
                        final bcan bcanVar = this.b;
                        final dcep B = dcbg.b(bcanVar.l()).s(new dbrn(bdsdVar2) { // from class: bdsa
                            private final bdsd a;

                            {
                                this.a = bdsdVar2;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj) {
                                return this.a.ai.b((bbtm) obj);
                            }
                        }).o(new dbsl(bdsdVar2) { // from class: bdsb
                            private final bdsd a;

                            {
                                this.a = bdsdVar2;
                            }

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj) {
                                char c2;
                                bdsd bdsdVar3 = this.a;
                                bbtj bbtjVar = (bbtj) obj;
                                if (bbtjVar.p()) {
                                    return false;
                                }
                                Uri a = bbtjVar.a();
                                String scheme = a.getScheme();
                                if (scheme == null) {
                                    scheme = "";
                                }
                                int hashCode = scheme.hashCode();
                                if (hashCode != 99617003) {
                                    if (hashCode == 951530617 && scheme.equals("content")) {
                                        c2 = 0;
                                    }
                                    c2 = 65535;
                                } else {
                                    if (scheme.equals("https")) {
                                        c2 = 1;
                                    }
                                    c2 = 65535;
                                }
                                if (c2 != 0) {
                                    return c2 != 1;
                                }
                                try {
                                    InputStream a2 = cxnp.a(bdsdVar3.g, a);
                                    if (a2 != null) {
                                        a2.close();
                                        return false;
                                    }
                                } catch (Exception unused) {
                                }
                                return true;
                            }
                        }).B();
                        if (!B.isEmpty()) {
                            bdsdVar2.ao.execute(new Runnable(bdsdVar2, B, bcanVar) { // from class: bdsc
                                private final bdsd a;
                                private final Set b;
                                private final bcan c;

                                {
                                    this.a = bdsdVar2;
                                    this.b = B;
                                    this.c = bcanVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    bdsd bdsdVar3 = this.a;
                                    Set<bbtj> set = this.b;
                                    bcan bcanVar2 = this.c;
                                    for (bbtj bbtjVar : set) {
                                        bcanVar2.H(bbtjVar);
                                    }
                                    cqkx.p(bdsdVar3.av.i());
                                    cqkx.p(bdsdVar3.av.j());
                                }
                            });
                        }
                    }
                });
            }
        });
        cqkf<bdtp> cqkfVar = this.aB;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.av);
        btrm btrmVar = this.ah;
        bdua bduaVar = this.av;
        dceq a = dcet.a();
        a.b(gds.class, new bduc(gds.class, bduaVar, bvrj.UI_THREAD));
        btrmVar.g(bduaVar, a.a());
        efg efgVar = this.c;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.J(new egq(this) { // from class: bdrx
            private final bdsd a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                bdsd bdsdVar = this.a;
                Object obj = bdsdVar.az;
                if (obj != null) {
                    bdsdVar.Qn(obj);
                    bdsdVar.az = null;
                }
                djhs djhsVar = bdsdVar.ay;
                if (djhsVar != null) {
                    bdsdVar.w(djhsVar);
                }
                bbvd a2 = bdsdVar.aw.a();
                if (a2 != null && a2.c()) {
                    bbuz l = bdsdVar.aw.l();
                    bbvc d = a2.d();
                    d.c(false);
                    l.h(d.a());
                    bdsdVar.aw = l.a();
                    bdsdVar.q();
                }
            }
        });
        efgVar.a(egjVar.a());
        ilo bn = bn(this.aP);
        if (bn != null && dbsj.d(bn.n())) {
            bwrs<ilo> a2 = bwrs.a(bn);
            this.ag.f(a2, this, false);
            this.ar.a().q(a2, false);
        }
        this.aQ.d();
        cqkx.p(this.av.j());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        this.ah.a(this.av);
        cqkf<bdtp> cqkfVar = this.aB;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        super.al();
    }

    @Override // defpackage.jmo
    public final void c() {
        bdof bdofVar = this.aQ;
        bvrj.UI_THREAD.c();
        if (bdofVar.f() && bdofVar.b <= bdofVar.a.get() && bdofVar.g()) {
            bdofVar.b += 500;
            bdofVar.e();
        }
    }

    @Override // defpackage.bcpd
    public final void d(int i) {
        View view = this.P;
        dbsk.s(view);
        ckos.b(view, i, 0).c();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        this.av.y();
        return true;
    }

    @Override // defpackage.bdqo
    public final void g(djhq djhqVar) {
        bvrj.UI_THREAD.c();
        aR();
        this.aW = djhqVar;
        this.aj.a(djhqVar, this, bvrj.UI_THREAD);
    }

    @Override // defpackage.bdqo
    public final void h() {
        bbuy c = this.aw.c();
        bbuy bbuyVar = bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW;
        int ordinal = c.ordinal();
        if (ordinal == 0) {
            aS();
        } else if (ordinal == 1) {
            aT();
            this.aq.a().k(null, dkcp.REVIEW);
        } else if (ordinal == 2) {
            aT();
            ilo bn = bn(this.aP);
            if (bn != null) {
                aV(bn, jjn.FULLY_EXPANDED, bege.OVERVIEW);
            }
        } else if (ordinal == 3) {
            aS();
            this.g.g().e();
        } else if (ordinal == 4) {
            aT();
            ilo bn2 = bn(this.aP);
            if (bn2 != null) {
                aU(bn2);
            }
        } else if (ordinal == 5) {
            aT();
            ilo bn3 = bn(this.aP);
            if (bn3 != null) {
                aU(bn3);
                if (this.au.i()) {
                    ckos.a(this.g.findViewById(16908290), this.g.getResources().getQuantityString(R.plurals.MERCHANT_PHOTO_IN_REVIEW_MESSAGE, this.aP.l().size()), 0).c();
                    cjqp g = this.am.g();
                    cjta c2 = cjtd.c(bn3.bZ());
                    c2.d = dtxv.dh;
                    g.d(c2.a());
                }
            }
        } else {
            bvoo.h("Unsupported AfterUploadBehavior: %s", c);
        }
        if (this.aP.b == dwyd.SHARE_INTENT) {
            ((ckco) this.ad.a(ckdz.T)).a(ckdr.a(7));
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = (Bundle) dbsc.a(bundle, this.o);
        this.aU = (akqq) bundle2.getSerializable("latLng");
        this.aC = (bcpc) bundle2.getSerializable("photoUploadFlowIntention");
        bbve bbveVar = (bbve) bundle2.getSerializable("unifiedPhotoUploadFlowProperties");
        this.aw = bbveVar;
        this.aO = bbveVar.a() != null;
        int i = bundle2.getInt("photoLoadLimit", this.ap.getPhotoUploadParameters().d);
        try {
            bwrs<bcan> e = this.ag.e(bcan.class, bundle2, "photoSelectionContext");
            dbsk.s(e);
            this.ax = e;
            bcan c = e.c();
            dbsk.s(c);
            this.aP = c;
            c.h();
            this.aP.b(this.aw.k());
            try {
                aeui aeuiVar = (aeui) this.ag.d(aeui.class, bundle2, "iAmHereState");
                if (aeuiVar == null) {
                    aeuiVar = aeui.b;
                }
                this.aV = aeuiVar;
            } catch (IOException unused) {
                bvoo.h("IOException deserializing IAmHereState.", new Object[0]);
            }
            if (bundle != null) {
                this.aW = (djhq) bvrs.b(bundle.getByteArray("thanksPageRequest"), (dssr) djhq.j.cu(7));
            }
            if (this.ay == null && this.aW != null) {
                aR();
                buqs buqsVar = this.aj;
                djhq djhqVar = this.aW;
                dbsk.s(djhqVar);
                buqsVar.a(djhqVar, this, bvrj.UI_THREAD);
            }
            this.aR = this.e.a("android.permission.READ_EXTERNAL_STORAGE", (bdma) bundle2.getSerializable("storagePermissionRequestState"), (bdlz) bundle2.getSerializable("storagePermissionDetailedState"));
            if (Build.VERSION.SDK_INT >= 29) {
                this.aS = this.e.a("android.permission.ACCESS_MEDIA_LOCATION", (bdma) bundle2.getSerializable("mediaLocationPermissionRequestState"), (bdlz) bundle2.getSerializable("mediaLocationPermissionDetailedState"));
            } else {
                this.aS = null;
            }
            bdub bdubVar = this.a;
            bbve bbveVar2 = this.aw;
            bcpc bcpcVar = this.aC;
            boolean z = this.aO;
            bwrs<bcan> bwrsVar = this.ax;
            bdmb bdmbVar = this.aR;
            bdmb bdmbVar2 = this.aS;
            aeui aeuiVar2 = this.aV;
            akqq akqqVar = this.aU;
            bdub.a(this, 1);
            bdub.a(bbveVar2, 2);
            bdub.a(bcpcVar, 3);
            bdub.a(bwrsVar, 5);
            bdub.a(bdmbVar, 6);
            bdub.a(aeuiVar2, 8);
            bdub.a(this, 9);
            gga a = bdubVar.a.a();
            bdub.a(a, 11);
            aesb a2 = bdubVar.b.a();
            bdub.a(a2, 12);
            ahjq a3 = bdubVar.c.a();
            bdub.a(a3, 13);
            bbtk a4 = bdubVar.d.a();
            bdub.a(a4, 14);
            bwqv a5 = bdubVar.e.a();
            bdub.a(a5, 15);
            akfa a6 = bdubVar.f.a();
            bdub.a(a6, 16);
            akfc a7 = bdubVar.g.a();
            bdub.a(a7, 17);
            anhp a8 = bdubVar.h.a();
            bdub.a(a8, 18);
            bdqe a9 = bdubVar.i.a();
            bdub.a(a9, 19);
            bdto a10 = bdubVar.j.a();
            bdub.a(a10, 20);
            bdlc a11 = bdubVar.k.a();
            bdub.a(a11, 21);
            bdpf a12 = bdubVar.l.a();
            bdub.a(a12, 22);
            bduo a13 = bdubVar.m.a();
            bdub.a(a13, 23);
            bdrf a14 = bdubVar.n.a();
            bdub.a(a14, 24);
            bdql a15 = bdubVar.o.a();
            bdub.a(a15, 25);
            bdub.a(bdubVar.p.a(), 26);
            btvo a16 = bdubVar.q.a();
            bdub.a(a16, 27);
            PublicDisclosureLayout$PublicDisclosureViewModelImpl a17 = bdubVar.r.a();
            bdub.a(a17, 28);
            caxn a18 = bdubVar.s.a();
            bdub.a(a18, 29);
            cqkj a19 = bdubVar.t.a();
            bdub.a(a19, 30);
            this.av = new bdua(this, bbveVar2, bcpcVar, z, bwrsVar, bdmbVar, bdmbVar2, aeuiVar2, this, akqqVar, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19);
            this.aQ = this.d.a(this.aR, dbsg.j(this.aS), this.av, i, 0, bdur.a(this.aP.b));
            jmw.d(this.g, null);
        } catch (IOException unused2) {
            dbsb b = dbsc.b(this);
            b.b("photoSelectionContextRef", this.ax);
            bvoo.h("IOException deserializing item from bundle: %s", b.toString());
            gn gnVar = this.A;
            dbsk.s(gnVar);
            gnVar.e();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyd.ba;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        dbsg dbsgVar;
        GmmLocation a;
        bbvd a2 = this.aw.a();
        if (a2 == null) {
            bvoo.h("PlacePickerOptions was null and so the place picker dialog should not be shown!", new Object[0]);
            return;
        }
        akqq a3 = a2.a();
        if (a2.b()) {
            Iterator<bbtm> it = this.av.j().e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dbsg j = dbsg.j(this.ai.b(it.next()).j());
                if (j.a()) {
                    a3 = (akqq) j.b();
                    break;
                }
            }
        }
        if (a3 == null && this.ae.s() && this.ae.d() && (a = this.ae.a()) != null) {
            a3 = a.B();
        }
        if (this.ap.getPhotoUploadParameters().k) {
            dbsgVar = dbsg.i(Integer.valueOf((int) R.string.UGC_PHOTO_UPLOAD_PLACE_NOT_SELECTED));
        } else {
            dbsgVar = dbpy.a;
        }
        aZ(cdhp.g(a3, dbsgVar));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putSerializable("unifiedPhotoUploadFlowProperties", this.aw);
        bundle.putSerializable("photoUploadFlowIntention", this.aC);
        bundle.putBoolean("placeChangeable", this.aO);
        bundle.putSerializable("storagePermissionRequestState", this.aR.a);
        bundle.putSerializable("storagePermissionDetailedState", this.aR.b);
        if (Build.VERSION.SDK_INT >= 29) {
            dbsk.s(this.aS);
            bundle.putSerializable("mediaLocationPermissionRequestState", this.aS.a);
            bundle.putSerializable("mediaLocationPermissionDetailedState", this.aS.b);
        }
        bundle.putInt("photoLoadLimit", this.aQ.b);
        bundle.putSerializable("latLng", this.aU);
        djhq djhqVar = this.aW;
        bundle.putByteArray("thanksPageRequest", djhqVar != null ? djhqVar.bS() : null);
        this.ag.c(bundle, "photoSelectionContext", this.ax);
        this.ag.c(bundle, "iAmHereState", this.av.z());
    }

    public final void w(djhs djhsVar) {
        h();
        ProgressDialog progressDialog = this.aX;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.aX = null;
        }
        bcan c = this.ax.c();
        dbsk.s(c);
        ilo bn = bn(c);
        chhr chhrVar = this.ak;
        djgl djglVar = djhsVar.b;
        if (djglVar == null) {
            djglVar = djgl.g;
        }
        chhrVar.b(djglVar, dtxy.cW, dtxy.cX, bn);
        this.aW = null;
        this.ay = null;
    }
}
