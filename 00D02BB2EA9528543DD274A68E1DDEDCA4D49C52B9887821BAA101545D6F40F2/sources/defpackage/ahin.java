package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahin  reason: default package */
/* loaded from: classes2.dex */
public class ahin implements ahac, cqrh, jbt {
    public static final dcqe a = dcqe.c("ahin");
    private final ania A;
    private final boolean B;
    @dzsi
    private final btlu C;
    private final boolean D;
    private final agak E;
    private final ahil F;
    private final agzi G;
    private final ahjh H;
    private final agzi I;
    private final View.OnAttachStateChangeListener J;
    @dzsi
    private aheh K;
    @dzsi
    private cryz<afzy> L;
    private boolean M;
    private boolean N;
    private int O;
    private boolean P;
    private int Q;
    public final gdc b;
    public final dzsj<gga> c;
    public final agxf d;
    public final agal e;
    public final agbj f;
    public final axjh g;
    public final cpv h;
    public final cklq i;
    public final agbq j;
    public final agyk k;
    public final List<ahim> l;
    public final WeakReference<ges> m;
    public final ahgu n;
    public final Set<String> o;
    @dzsi
    public WeakReference<RecyclerView> p;
    private final agwa q;
    private final bvjj r;
    private final afzs s;
    private final dehq t;
    private final ahei u;
    @dzsi
    private final agad v;
    private final ahhj w;
    private final agwp x;
    private final agbr y;
    private final bvpe z;

    public ahin(cqat cqatVar, cqhn cqhnVar, cqhu cqhuVar, agwa agwaVar, gdc gdcVar, dzsj<gga> dzsjVar, bvjj bvjjVar, afzs afzsVar, dehq dehqVar, ahei aheiVar, ahhb ahhbVar, agal agalVar, ahhj ahhjVar, agwp agwpVar, agbj agbjVar, agbr agbrVar, agbq agbqVar, dxio<ahhc> dxioVar, bvpe bvpeVar, dxio<ahjh> dxioVar2, dxio<ahiy> dxioVar3, ahgu ahguVar, axjh axjhVar, ania aniaVar, cpv cpvVar, cklq cklqVar, agyj agyjVar, ges gesVar, agxf agxfVar, @dzsi agad agadVar, @dzsi btlu btluVar, boolean z, agak agakVar, @dzsi agyp agypVar, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.l = arrayList;
        ahil ahilVar = new ahil(this);
        this.F = ahilVar;
        this.o = new HashSet();
        this.O = 0;
        this.q = agwaVar;
        this.b = gdcVar;
        this.c = dzsjVar;
        this.r = bvjjVar;
        this.s = afzsVar;
        this.t = dehqVar;
        this.u = aheiVar;
        this.d = agxfVar;
        this.v = agadVar;
        this.n = ahguVar;
        this.e = agalVar;
        this.w = ahhjVar;
        this.x = agwpVar;
        this.f = agbjVar;
        this.y = agbrVar;
        this.G = dxioVar.a();
        this.z = bvpeVar;
        this.H = dxioVar2.a();
        this.I = dxioVar3.a();
        this.g = axjhVar;
        this.A = aniaVar;
        this.h = cpvVar;
        this.i = cklqVar;
        this.j = agbqVar;
        this.B = z2;
        this.Q = 0;
        if (agypVar == null || TimeUnit.SECONDS.toMillis(agypVar.f) < cqatVar.e()) {
            agyk bZ = agyp.r.bZ();
            dirb S = S(agyjVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            agyp agypVar2 = (agyp) bZ.b;
            S.getClass();
            agypVar2.b = S;
            agypVar2.a |= 1;
            long b = cqatVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            agyp agypVar3 = (agyp) bZ.b;
            agypVar3.a |= 4;
            agypVar3.d = b;
            this.k = bZ;
        } else {
            dsqp dsqpVar = (dsqp) agypVar.cu(5);
            dsqpVar.bC(agypVar);
            this.k = (agyk) dsqpVar;
        }
        this.m = new WeakReference<>(gesVar);
        this.C = btluVar;
        this.D = z;
        this.E = agakVar;
        this.J = new ahie(this);
        if (axjhVar.e() && axjhVar.j() && ((agyp) this.k.b).q.size() > 0) {
            axjhVar.D(Collections.unmodifiableList(((agyp) this.k.b).q));
        }
        U(Collections.unmodifiableList(((agyp) this.k.b).e));
        agyk agykVar = this.k;
        if (agykVar.c) {
            agykVar.bF();
            agykVar.c = false;
        }
        ((agyp) agykVar.b).e = agyp.ck();
        agyp agypVar4 = (agyp) this.k.b;
        if ((agypVar4.a & 16) == 0 || agypVar4.g >= arrayList.size()) {
            return;
        }
        ahilVar.a = ((ahim) arrayList.get(((agyp) this.k.b).g)).b;
    }

    private static dirb S(agyj agyjVar) {
        dira diraVar = (dira) dirb.l.bZ();
        dnqg bZ = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        if (diraVar.c) {
            diraVar.bF();
            diraVar.c = false;
        }
        dirb dirbVar = (dirb) diraVar.b;
        dnqh bK = bZ.bK();
        bK.getClass();
        dirbVar.b = bK;
        dirbVar.a |= 1;
        if ((agyjVar.a & 1) != 0) {
            dspd dspdVar = agyjVar.b;
            if (diraVar.c) {
                diraVar.bF();
                diraVar.c = false;
            }
            dirb dirbVar2 = (dirb) diraVar.b;
            dspdVar.getClass();
            dirbVar2.a |= 4;
            dirbVar2.d = dspdVar;
        }
        if ((agyjVar.a & 2) != 0) {
            dspd dspdVar2 = agyjVar.c;
            if (diraVar.c) {
                diraVar.bF();
                diraVar.c = false;
            }
            dirb dirbVar3 = (dirb) diraVar.b;
            dspdVar2.getClass();
            dirbVar3.a |= 128;
            dirbVar3.g = dspdVar2;
        }
        return (dirb) diraVar.bK();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(boolean z) {
        this.M = z;
        StringBuilder sb = new StringBuilder(33);
        sb.append("StreamFragment.setIsLoading:");
        sb.append(z);
        sb.toString();
    }

    private final void U(Iterable<agym> iterable) {
        int size;
        boolean z;
        Iterator<agym> it;
        agym agymVar;
        ahhv a2;
        ahhv ahdlVar;
        ahhv ahiwVar;
        ddzg ddzgVar;
        bbty bbtyVar;
        ahff ahffVar;
        ahhv ahhvVar;
        ahin ahinVar = this;
        boolean a3 = ahinVar.E.a();
        Iterator<agym> it2 = iterable.iterator();
        while (it2.hasNext()) {
            agym next = it2.next();
            dlcv dlcvVar = next.b;
            if (dlcvVar == null) {
                dlcvVar = dlcv.j;
            }
            dlam dlamVar = dlcvVar.g;
            if (dlamVar == null) {
                dlamVar = dlam.d;
            }
            if (dlamVar.a != 4 || a3) {
                agyh agyhVar = next.c;
                if (agyhVar == null) {
                    agyhVar = agyh.k;
                }
                axjh axjhVar = ahinVar.g;
                dbsk.s(axjhVar);
                if (axjhVar.f()) {
                    size = ahinVar.Q;
                    ahinVar.Q = size + 1;
                } else {
                    size = ahinVar.l.size();
                }
                int i = size;
                ahhj ahhjVar = ahinVar.w;
                dlcv dlcvVar2 = next.b;
                if (dlcvVar2 == null) {
                    dlcvVar2 = dlcv.j;
                }
                dlcv dlcvVar3 = dlcvVar2;
                agxf agxfVar = ahinVar.d;
                btlu btluVar = ahinVar.C;
                int a4 = dlcu.a(dlcvVar3.b);
                int i2 = a4 - 1;
                if (a4 == 0) {
                    throw null;
                }
                switch (i2) {
                    case 2:
                        z = a3;
                        it = it2;
                        agymVar = next;
                        a2 = ahhjVar.f.a(dlcvVar3, i, agyhVar);
                        break;
                    case 3:
                        z = a3;
                        it = it2;
                        agymVar = next;
                        ahdk ahdkVar = ahhjVar.e;
                        dlbe dlbeVar = dlcvVar3.b == 6 ? (dlbe) dlcvVar3.c : dlbe.g;
                        if ((dlbeVar.a & 4) != 0 && dlbeVar.f.size() != 0 && (dlbeVar.a & 8) != 0) {
                            ddzf bZ = ddzg.t.bZ();
                            ddyt bZ2 = ddyu.i.bZ();
                            boolean z2 = agyhVar.b;
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            ddyu ddyuVar = (ddyu) bZ2.b;
                            int i3 = ddyuVar.a | 4;
                            ddyuVar.a = i3;
                            ddyuVar.c = z2;
                            dspd dspdVar = dlcvVar3.d;
                            dspdVar.getClass();
                            int i4 = i3 | 512;
                            ddyuVar.a = i4;
                            ddyuVar.h = dspdVar;
                            int i5 = i4 | 8;
                            ddyuVar.a = i5;
                            ddyuVar.d = i;
                            ddyuVar.a = i5 | 16;
                            ddyuVar.e = 45642;
                            ddyu bK = bZ2.bK();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            ddzg ddzgVar2 = (ddzg) bZ.b;
                            bK.getClass();
                            ddzgVar2.k = bK;
                            ddzgVar2.b |= 1;
                            ddzg bK2 = bZ.bK();
                            cjta z3 = ahhv.z(dlbeVar.b, i, bK2, agyhVar);
                            ahfo ahfoVar = ahdkVar.d;
                            dlcx dlcxVar = dlbeVar.d;
                            if (dlcxVar == null) {
                                dlcxVar = dlcx.e;
                            }
                            ahfn a5 = ahfoVar.a(dlcxVar, 0, bK2, null, false);
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            int i6 = 0;
                            while (i6 < dlbeVar.f.size()) {
                                dipk dipkVar = dlbeVar.f.get(i6);
                                ahdp ahdpVar = ahdkVar.c;
                                dlaz bZ3 = dlba.d.bZ();
                                dlcx dlcxVar2 = dlbeVar.d;
                                if (dlcxVar2 == null) {
                                    dlcxVar2 = dlcx.e;
                                }
                                if (bZ3.c) {
                                    bZ3.bF();
                                    bZ3.c = false;
                                }
                                dlba dlbaVar = (dlba) bZ3.b;
                                dlcxVar2.getClass();
                                dlbaVar.b = dlcxVar2;
                                int i7 = dlbaVar.a | 1;
                                dlbaVar.a = i7;
                                dipkVar.getClass();
                                dlbaVar.c = dipkVar;
                                dlbaVar.a = i7 | 2;
                                dlba bK3 = bZ3.bK();
                                bmdq a6 = ahdpVar.a.a();
                                ahdp.a(a6, 1);
                                cqat a7 = ahdpVar.b.a();
                                ahdp.a(a7, 2);
                                gga a8 = ahdpVar.c.a();
                                agyh agyhVar2 = agyhVar;
                                ahdp.a(a8, 3);
                                ahfo a9 = ahdpVar.d.a();
                                dlcv dlcvVar4 = dlcvVar3;
                                ahdp.a(a9, 4);
                                agaw a10 = ahdpVar.e.a();
                                dlbe dlbeVar2 = dlbeVar;
                                ahdp.a(a10, 5);
                                dxio a11 = ((dxjh) ahdpVar.f).a();
                                ahdp.a(a11, 6);
                                ahdp.a(bK3, 7);
                                ahdp.a(bK2, 8);
                                arrayList2.add(new ahdo(a6, a7, a8, a9, a10, a11, bK3, bK2, i6));
                                i6++;
                                agyhVar = agyhVar2;
                                dlcvVar3 = dlcvVar4;
                                dlbeVar = dlbeVar2;
                            }
                            dlbe dlbeVar3 = dlbeVar;
                            agyh agyhVar3 = agyhVar;
                            dlcv dlcvVar5 = dlcvVar3;
                            boolean j = dcft.j(arrayList2, ahdj.a);
                            agcc agccVar = new agcc();
                            agccVar.b(false);
                            agccVar.c(false);
                            agccVar.b(j);
                            agccVar.c(arrayList2.size() != 1);
                            agccVar.a = dtxu.bB;
                            aghb aghbVar = new aghb(agccVar.a());
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList2.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                arrayList3.add(cqgr.fT(aghbVar, (ahdo) arrayList2.get(i8)));
                            }
                            aged agedVar = new aged();
                            ahbd ahbdVar = ahdkVar.a;
                            z3.d = dtxu.bL;
                            arrayList.add(agxa.a(agedVar, new ahat(ahbdVar.a(arrayList3, z3.a()).a())));
                            agoa h = agob.h();
                            h.e(true);
                            arrayList.add(agxa.a(new agdj(h.a()), new ahfl(a5)));
                            dioz diozVar = dlbeVar3.f.get(0).n;
                            if (diozVar == null) {
                                diozVar = dioz.d;
                            }
                            String str = diozVar.b;
                            ahdm ahdmVar = ahdkVar.b;
                            dlbd dlbdVar = dlbeVar3.e;
                            if (dlbdVar == null) {
                                dlbdVar = dlbd.d;
                            }
                            dlbd dlbdVar2 = dlbdVar;
                            String str2 = dlbeVar3.c;
                            ahas a12 = ahdmVar.a.a();
                            ahdm.a(a12, 1);
                            ahht a13 = ahdmVar.b.a();
                            ahdm.a(a13, 2);
                            dxio a14 = ((dxjh) ahdmVar.c).a();
                            ahdm.a(a14, 3);
                            ahdm.a(dlcvVar5, 4);
                            ahdm.a(agyhVar3, 5);
                            ahdm.a(arrayList, 6);
                            ahdm.a(a5, 7);
                            ahdm.a(dlbdVar2, 8);
                            ahdm.a(str, 9);
                            ahdm.a(str2, 10);
                            ahdm.a(z3, 11);
                            ahdlVar = new ahdl(a12, a13, a14, dlcvVar5, agyhVar3, arrayList, a5, dlbdVar2, str, str2, z3);
                            a2 = ahdlVar;
                            break;
                        }
                        a2 = null;
                        break;
                    case 4:
                        z = a3;
                        it = it2;
                        agymVar = next;
                        ahiv ahivVar = ahhjVar.m;
                        dldh dldhVar = dlcvVar3.b == 10 ? (dldh) dlcvVar3.c : dldh.d;
                        if (dldhVar.c.size() != 0) {
                            ddzf bZ4 = ddzg.t.bZ();
                            ddyt bZ5 = ddyu.i.bZ();
                            boolean z4 = agyhVar.b;
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            ddyu ddyuVar2 = (ddyu) bZ5.b;
                            int i9 = ddyuVar2.a | 4;
                            ddyuVar2.a = i9;
                            ddyuVar2.c = z4;
                            dspd dspdVar2 = dlcvVar3.d;
                            dspdVar2.getClass();
                            int i10 = i9 | 512;
                            ddyuVar2.a = i10;
                            ddyuVar2.h = dspdVar2;
                            ddyuVar2.a = 8 | i10;
                            ddyuVar2.d = i;
                            int i11 = ddcu.JT.a;
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            ddyu ddyuVar3 = (ddyu) bZ5.b;
                            ddyuVar3.a |= 16;
                            ddyuVar3.e = i11;
                            ddyu bK4 = bZ5.bK();
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            ddzg ddzgVar3 = (ddzg) bZ4.b;
                            bK4.getClass();
                            ddzgVar3.k = bK4;
                            ddzgVar3.b |= 1;
                            ddzg bK5 = bZ4.bK();
                            ArrayList arrayList4 = new ArrayList();
                            for (dldg dldgVar : dldhVar.c.get(0).b) {
                                ahfo ahfoVar2 = ahivVar.b;
                                dlcx dlcxVar3 = dldgVar.a;
                                if (dlcxVar3 == null) {
                                    dlcxVar3 = dlcx.e;
                                }
                                ahfn a15 = ahfoVar2.a(dlcxVar3, arrayList4.size(), bK5, null, false);
                                a15.r(Integer.toString(arrayList4.size() + 1));
                                arrayList4.add(a15);
                            }
                            ahix ahixVar = ahivVar.a;
                            cjta z5 = ahhv.z(dldhVar.a, i, bK5, agyhVar);
                            ahbd a16 = ahixVar.a.a();
                            ahix.a(a16, 1);
                            ahas a17 = ahixVar.b.a();
                            ahix.a(a17, 2);
                            ahht a18 = ahixVar.c.a();
                            ahix.a(a18, 3);
                            ahix.a(dlcvVar3, 4);
                            ahix.a(arrayList4, 5);
                            ahix.a(agyhVar, 6);
                            ahix.a(z5, 7);
                            ahiwVar = new ahiw(a16, a17, a18, dlcvVar3, arrayList4, agyhVar, z5);
                            a2 = ahiwVar;
                            break;
                        }
                        a2 = null;
                        break;
                    case 5:
                        z = a3;
                        it = it2;
                        agymVar = next;
                        ahgs ahgsVar = ahhjVar.k;
                        ahas a19 = ahgsVar.a.a();
                        ahgs.a(a19, 1);
                        ahgn a20 = ahgsVar.b.a();
                        ahgs.a(a20, 2);
                        ahht a21 = ahgsVar.c.a();
                        ahgs.a(a21, 3);
                        ahfo a22 = ahgsVar.d.a();
                        ahgs.a(a22, 4);
                        dxio a23 = ((dxjh) ahgsVar.e).a();
                        ahgs.a(a23, 5);
                        ahgs.a(agxfVar, 6);
                        ahgs.a(dlcvVar3, 7);
                        ahgs.a(agyhVar, 9);
                        ahiwVar = new ahgr(a19, a20, a21, a22, a23, agxfVar, dlcvVar3, i, agyhVar);
                        a2 = ahiwVar;
                        break;
                    case 6:
                        z = a3;
                        it = it2;
                        agymVar = next;
                        ahda ahdaVar = ahhjVar.d;
                        ahht a24 = ahdaVar.a.a();
                        ahda.a(a24, 1);
                        ahas a25 = ahdaVar.b.a();
                        ahda.a(a25, 2);
                        ahdg a26 = ahdaVar.c.a();
                        ahda.a(a26, 3);
                        ahfo a27 = ahdaVar.d.a();
                        ahda.a(a27, 4);
                        ahda.a(dlcvVar3, 5);
                        ahda.a(agyhVar, 7);
                        ahiwVar = new ahcz(a24, a25, a26, a27, dlcvVar3, i, agyhVar);
                        a2 = ahiwVar;
                        break;
                    case 7:
                        z = a3;
                        it = it2;
                        agymVar = next;
                        dlam dlamVar2 = dlcvVar3.g;
                        if (dlamVar2 == null) {
                            dlamVar2 = dlam.d;
                        }
                        if (dlamVar2.a != 4 || ahhjVar.a.c()) {
                            ahgi ahgiVar = ahhjVar.i;
                            Activity activity = (Activity) ((dxjd) ahgiVar.a).a;
                            ahgi.a(activity, 1);
                            ahas a28 = ahgiVar.b.a();
                            ahgi.a(a28, 2);
                            ahht a29 = ahgiVar.c.a();
                            ahgi.a(a29, 3);
                            dxio a30 = ((dxjh) ahgiVar.d).a();
                            ahgi.a(a30, 4);
                            dxio a31 = ((dxjh) ahgiVar.e).a();
                            ahgi.a(a31, 5);
                            ahbd a32 = ahgiVar.f.a();
                            ahgi.a(a32, 6);
                            ahfo a33 = ahgiVar.g.a();
                            ahgi.a(a33, 7);
                            ahgi.a(dlcvVar3, 8);
                            ahgi.a(agyhVar, 10);
                            ahiwVar = new ahgh(activity, a28, a29, a30, a31, a32, a33, dlcvVar3, i, agyhVar);
                            a2 = ahiwVar;
                            break;
                        }
                        int i12 = dlcvVar3.b;
                        a2 = null;
                        break;
                    case 8:
                        z = a3;
                        it = it2;
                        if (ahhjVar.a.c()) {
                            ahis ahisVar = ahhjVar.l;
                            dldb dldbVar = dlcvVar3.b == 15 ? (dldb) dlcvVar3.c : dldb.d;
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            ddzf bZ6 = ddzg.t.bZ();
                            ddyt bZ7 = ddyu.i.bZ();
                            boolean z6 = agyhVar.b;
                            if (bZ7.c) {
                                bZ7.bF();
                                bZ7.c = false;
                            }
                            ddyu ddyuVar4 = (ddyu) bZ7.b;
                            int i13 = ddyuVar4.a | 4;
                            ddyuVar4.a = i13;
                            ddyuVar4.c = z6;
                            dspd dspdVar3 = dlcvVar3.d;
                            dspdVar3.getClass();
                            int i14 = i13 | 512;
                            ddyuVar4.a = i14;
                            ddyuVar4.h = dspdVar3;
                            ddyuVar4.a = i14 | 8;
                            ddyuVar4.d = i;
                            if (bZ6.c) {
                                bZ6.bF();
                                bZ6.c = false;
                            }
                            ddzg ddzgVar4 = (ddzg) bZ6.b;
                            ddyu bK6 = bZ7.bK();
                            bK6.getClass();
                            ddzgVar4.k = bK6;
                            ddzgVar4.b |= 1;
                            ddzg bK7 = bZ6.bK();
                            cjta z7 = ahhv.z(dldbVar.a, i, bK7, agyhVar);
                            if (dldbVar.c.isEmpty()) {
                                dldbVar.c.size();
                                agymVar = next;
                                a2 = null;
                                break;
                            } else {
                                agoa h2 = agob.h();
                                h2.e(true);
                                h2.c(true);
                                agoc agocVar = new agoc(h2.a());
                                for (int i15 = 0; i15 < dldbVar.c.size(); i15++) {
                                    ahfn a34 = ahisVar.b.a(dldbVar.c.get(i15), i15, bK7, null, true);
                                    arrayList6.add(cqgr.fT(agocVar, a34));
                                    arrayList7.add(a34);
                                }
                                agymVar = next;
                                arrayList5.add(agxa.a(new agve(agvd.c().a()), new ahip(new ahiq(dldbVar.b, null, null, cjtd.b))));
                                agdh agdhVar = new agdh();
                                ahbd ahbdVar2 = ahisVar.a;
                                z7.d = dtxu.bE;
                                arrayList5.add(agxa.a(agdhVar, new ahat(ahbdVar2.a(arrayList6, z7.a()).a())));
                                ahiu ahiuVar = ahisVar.c;
                                cjta z8 = ahhv.z(dldbVar.a, i, bK7, agyhVar);
                                String str3 = dldbVar.b;
                                ahas a35 = ahiuVar.a.a();
                                ahiu.a(a35, 1);
                                ahht a36 = ahiuVar.b.a();
                                ahiu.a(a36, 2);
                                dxio a37 = ((dxjh) ahiuVar.c).a();
                                ahiu.a(a37, 3);
                                ahiu.a(dlcvVar3, 4);
                                ahiu.a(agyhVar, 5);
                                ahiu.a(arrayList5, 6);
                                ahiu.a(arrayList7, 7);
                                ahiu.a(z8, 8);
                                ahiu.a(str3, 9);
                                ahdlVar = new ahit(a35, a36, a37, dlcvVar3, agyhVar, arrayList5, arrayList7, z8, str3);
                                a2 = ahdlVar;
                                break;
                            }
                        }
                        agymVar = next;
                        int i122 = dlcvVar3.b;
                        a2 = null;
                    case 9:
                    case 10:
                    case 13:
                    default:
                        z = a3;
                        it = it2;
                        agymVar = next;
                        int i1222 = dlcvVar3.b;
                        a2 = null;
                        break;
                    case 11:
                        z = a3;
                        final ahja ahjaVar = ahhjVar.n;
                        dldp dldpVar = dlcvVar3.b == 18 ? (dldp) dlcvVar3.c : dldp.d;
                        ddzf bZ8 = ddzg.t.bZ();
                        ddyt bZ9 = ddyu.i.bZ();
                        boolean z9 = agyhVar.b;
                        if (bZ9.c) {
                            bZ9.bF();
                            bZ9.c = false;
                        }
                        ddyu ddyuVar5 = (ddyu) bZ9.b;
                        int i16 = ddyuVar5.a | 4;
                        ddyuVar5.a = i16;
                        ddyuVar5.c = z9;
                        dspd dspdVar4 = dlcvVar3.d;
                        dspdVar4.getClass();
                        int i17 = i16 | 512;
                        ddyuVar5.a = i17;
                        ddyuVar5.h = dspdVar4;
                        ddyuVar5.a = i17 | 8;
                        ddyuVar5.d = i;
                        if (bZ8.c) {
                            bZ8.bF();
                            bZ8.c = false;
                        }
                        ddzg ddzgVar5 = (ddzg) bZ8.b;
                        ddyu bK8 = bZ9.bK();
                        bK8.getClass();
                        ddzgVar5.k = bK8;
                        ddzgVar5.b |= 1;
                        ddzg bK9 = bZ8.bK();
                        cjta z10 = ahhv.z(dldpVar.a, i, bK9, agyhVar);
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        bbtv v = bbty.v();
                        v.e(false);
                        v.k(true);
                        v.u(true);
                        final bbty a38 = v.a();
                        int i18 = 0;
                        while (i18 < dldpVar.c.size()) {
                            dldo dldoVar = dldpVar.c.get(i18);
                            ahfo ahfoVar3 = ahjaVar.d;
                            dlcx dlcxVar4 = dldoVar.a;
                            if (dlcxVar4 == null) {
                                dlcxVar4 = dlcx.e;
                            }
                            final ahfn a39 = ahfoVar3.a(dlcxVar4, i18, bK9, dldoVar.b, false);
                            final dwfl dwflVar = dldoVar.b.get(0);
                            jic f = agxk.f(dwflVar);
                            Iterator<agym> it3 = it2;
                            if (f != null) {
                                ddzgVar = bK9;
                                bbtyVar = a38;
                                arrayList9.add(new ahfh(ahdh.b(f), new cqkn(ahjaVar, dwflVar, a38, a39) { // from class: ahiz
                                    private final ahja a;
                                    private final dwfl b;
                                    private final bbty c;
                                    private final ahfn d;

                                    {
                                        this.a = ahjaVar;
                                        this.b = dwflVar;
                                        this.c = a38;
                                        this.d = a39;
                                    }

                                    @Override // defpackage.cqkn
                                    public final void a(cqkp cqkpVar, View view) {
                                        ahja ahjaVar2 = this.a;
                                        dwfl dwflVar2 = this.b;
                                        ahjaVar2.c.a().p(new ckni(dcdc.f(dwflVar2)), 0, this.c, bwrs.a(this.d.b()), null);
                                    }
                                }, a39.p(dtxu.cm), ahjaVar.a.getString(R.string.LOCALSTREAM_ACCESSIBILITY_SEE_PHOTOS, new Object[]{a39.b().n()}), a39));
                                arrayList8.add(a39);
                            } else {
                                ddzgVar = bK9;
                                bbtyVar = a38;
                            }
                            i18++;
                            bK9 = ddzgVar;
                            a38 = bbtyVar;
                            it2 = it3;
                        }
                        it = it2;
                        if (!arrayList9.isEmpty()) {
                            ArrayList arrayList10 = new ArrayList();
                            agcg agcgVar = new agcg();
                            agcgVar.a(false);
                            agcgVar.a(arrayList10.size() != 1);
                            String str4 = agcgVar.a == null ? " useFixedLayoutHeight" : "";
                            if (!str4.isEmpty()) {
                                throw new IllegalStateException(str4.length() != 0 ? "Missing required properties:".concat(str4) : new String("Missing required properties:"));
                            }
                            agml agmlVar = new agml(new agch(agcgVar.a.booleanValue()));
                            int size3 = arrayList9.size();
                            for (int i19 = 0; i19 < size3; i19++) {
                                arrayList10.add(cqgr.fT(agmlVar, (agzr) arrayList9.get(i19)));
                            }
                            agdh agdhVar2 = new agdh();
                            ahbd ahbdVar3 = ahjaVar.b;
                            z10.d = dtxu.bE;
                            dcdc f2 = dcdc.f(agxa.a(agdhVar2, new ahat(ahbdVar3.a(arrayList10, z10.a()).a())));
                            ahjc ahjcVar = ahjaVar.e;
                            String str5 = dldpVar.b;
                            ahht a40 = ahjcVar.a.a();
                            ahjc.a(a40, 1);
                            ahas a41 = ahjcVar.b.a();
                            ahjc.a(a41, 2);
                            ahjc.a(dlcvVar3, 3);
                            ahjc.a(agyhVar, 4);
                            ahjc.a(f2, 5);
                            ahjc.a(arrayList8, 6);
                            ahjc.a(z10, 7);
                            ahjc.a(str5, 8);
                            ahhvVar = new ahjb(a40, a41, dlcvVar3, agyhVar, f2, arrayList8, z10, str5);
                            agymVar = next;
                            a2 = ahhvVar;
                            break;
                        }
                        agymVar = next;
                        a2 = null;
                        break;
                    case 12:
                        z = a3;
                        a2 = ahhjVar.c.a(dlcvVar3, i, agyhVar);
                        it = it2;
                        agymVar = next;
                        break;
                    case 14:
                        z = a3;
                        ahjk ahjkVar = ahhjVar.p;
                        Activity activity2 = (Activity) ((dxjd) ahjkVar.a).a;
                        ahjk.a(activity2, 1);
                        ahas a42 = ahjkVar.b.a();
                        ahjk.a(a42, 2);
                        ahbd a43 = ahjkVar.c.a();
                        ahjk.a(a43, 3);
                        ahht a44 = ahjkVar.d.a();
                        ahjk.a(a44, 4);
                        dxio a45 = ((dxjh) ahjkVar.e).a();
                        ahjk.a(a45, 5);
                        ahfo a46 = ahjkVar.f.a();
                        ahjk.a(a46, 6);
                        ahjn a47 = ahjkVar.g.a();
                        ahjk.a(a47, 7);
                        ahjk.a(dlcvVar3, 8);
                        ahjk.a(agyhVar, 10);
                        it = it2;
                        agymVar = next;
                        a2 = new ahjj(activity2, a42, a43, a44, a45, a46, a47, dlcvVar3, i, agyhVar);
                        break;
                    case 15:
                        z = a3;
                        ahjg ahjgVar = ahhjVar.o;
                        ahht a48 = ahjgVar.a.a();
                        ahjg.a(a48, 1);
                        ahhi a49 = ahjgVar.b.a();
                        ahjg.a(a49, 2);
                        ahfo a50 = ahjgVar.c.a();
                        ahjg.a(a50, 3);
                        bkpi a51 = ahjgVar.d.a();
                        ahjg.a(a51, 4);
                        ahjg.a(dlcvVar3, 5);
                        ahjg.a(agyhVar, 7);
                        it = it2;
                        agymVar = next;
                        a2 = new ahjf(a48, a49, a50, a51, dlcvVar3, i, agyhVar);
                        break;
                    case 16:
                        z = a3;
                        if (ahhjVar.b.e()) {
                            ahev ahevVar = ahhjVar.g;
                            if (dlcvVar3.b == 23) {
                                ahex ahexVar = ahevVar.a;
                                ahht a52 = ahexVar.a.a();
                                ahex.a(a52, 1);
                                ahfo a53 = ahexVar.b.a();
                                ahex.a(a53, 2);
                                aheu a54 = ahexVar.c.a();
                                ahex.a(a54, 3);
                                ahex.a(((dxjh) ahexVar.d).a(), 4);
                                ahex.a(dlcvVar3, 5);
                                ahex.a(agyhVar, 7);
                                it = it2;
                                agymVar = next;
                                a2 = new ahew(a52, a53, a54, dlcvVar3, i, agyhVar);
                                break;
                            } else {
                                it = it2;
                                agymVar = next;
                                a2 = null;
                                break;
                            }
                        }
                        it = it2;
                        agymVar = next;
                        int i12222 = dlcvVar3.b;
                        a2 = null;
                    case 17:
                        z = a3;
                        if (ahhjVar.b.e()) {
                            ahfg ahfgVar = ahhjVar.h.a;
                            ahht a55 = ahfgVar.a.a();
                            ahfg.a(a55, 1);
                            ahbd a56 = ahfgVar.b.a();
                            ahfg.a(a56, 2);
                            ahez a57 = ahfgVar.c.a();
                            ahfg.a(a57, 3);
                            axnt a58 = ahfgVar.d.a();
                            ahfg.a(a58, 4);
                            axjh a59 = ahfgVar.e.a();
                            ahfg.a(a59, 5);
                            Executor a60 = ahfgVar.f.a();
                            ahfg.a(a60, 6);
                            ahfg.a(ahfgVar.g.a(), 7);
                            ahfg.a(dlcvVar3, 8);
                            ahfg.a(agyhVar, 10);
                            ahffVar = r13;
                            ahff ahffVar2 = new ahff(a55, a56, a57, a58, a59, a60, dlcvVar3, i, agyhVar);
                            agrw agrwVar = new agrw();
                            ahez ahezVar = ahffVar.c;
                            dlam dlamVar3 = ahffVar.l.g;
                            if (dlamVar3 == null) {
                                dlamVar3 = dlam.d;
                            }
                            String str6 = ahffVar.a.c;
                            Activity activity3 = (Activity) ((dxjd) ahezVar.a).a;
                            ahez.a(activity3, 1);
                            ahez.a(dlamVar3, 2);
                            ahez.a(ahffVar, 3);
                            ahez.a(str6, 4);
                            ahffVar.h = cqgr.fT(agrwVar, new ahey(activity3, dlamVar3, ahffVar, str6));
                            ahaz a61 = ahffVar.b.a(ahffVar.s(ahffVar.g.a()), cjtd.a(dtxu.ce));
                            ahfa ahfaVar = new ahfa(ahffVar);
                            a61.a = null;
                            a61.f = null;
                            a61.c = cjtd.b;
                            a61.e = ahfaVar;
                            a61.d = true;
                            ahffVar.j = a61.a();
                            ahffVar.f.add(agxa.a(new aged(), new ahat(ahffVar.j)));
                            a2 = ahffVar;
                            it = it2;
                            agymVar = next;
                            break;
                        }
                        it = it2;
                        agymVar = next;
                        int i122222 = dlcvVar3.b;
                        a2 = null;
                        break;
                    case 18:
                        ahge ahgeVar = ahhjVar.j;
                        btvo a62 = ahgeVar.a.a();
                        ahge.a(a62, 1);
                        cqat a63 = ahgeVar.b.a();
                        ahge.a(a63, 2);
                        bvjj a64 = ahgeVar.c.a();
                        ahge.a(a64, 3);
                        ahfz a65 = ahgeVar.d.a();
                        ahge.a(a65, 4);
                        ahht a66 = ahgeVar.e.a();
                        ahge.a(a66, 5);
                        ahge.a(dlcvVar3, 6);
                        ahge.a(agyhVar, 8);
                        z = a3;
                        ahffVar = null;
                        ahgd ahgdVar = r12;
                        ahgd ahgdVar2 = new ahgd(a62, a63, a64, a65, a66, dlcvVar3, i, agyhVar);
                        if (!ahgdVar.s(btluVar)) {
                            it = it2;
                            ahhvVar = ahgdVar;
                            agymVar = next;
                            a2 = ahhvVar;
                            break;
                        }
                        a2 = ahffVar;
                        it = it2;
                        agymVar = next;
                        break;
                }
                if (a2 != null) {
                    dlcv dlcvVar6 = agymVar.b;
                    if (dlcvVar6 == null) {
                        dlcvVar6 = dlcv.j;
                    }
                    this.l.add(new ahim(dlcvVar6, a2));
                    a2.n = this;
                    a2.p();
                    ahinVar = this;
                } else {
                    ahinVar = this;
                }
                a3 = z;
                it2 = it;
            }
        }
    }

    private final boolean V() {
        return this.q.f(this.C);
    }

    private final boolean W() {
        if (x().booleanValue()) {
            btlu btluVar = this.C;
            if (Boolean.valueOf(btluVar == null || btlu.i(btluVar) == btlt.SIGNED_OUT).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void X(boolean z) {
        dirb dirbVar;
        bvrj.UI_THREAD.c();
        int a2 = agyo.a(((agyp) this.k.b).c);
        if (a2 == 0 || a2 == 1) {
            dirb dirbVar2 = ((agyp) this.k.b).b;
            if (dirbVar2 == null) {
                dirbVar2 = dirb.l;
            }
            dsqp dsqpVar = (dsqp) dirbVar2.cu(5);
            dsqpVar.bC(dirbVar2);
            dira diraVar = (dira) dsqpVar;
            this.e.b(diraVar);
            agyk agykVar = this.k;
            if (agykVar.c) {
                agykVar.bF();
                agykVar.c = false;
            }
            agyp agypVar = (agyp) agykVar.b;
            dirb dirbVar3 = (dirb) diraVar.bK();
            dirbVar3.getClass();
            agypVar.b = dirbVar3;
            agypVar.a |= 1;
            agyk agykVar2 = this.k;
            if (agykVar2.c) {
                agykVar2.bF();
                agykVar2.c = false;
            }
            agyp agypVar2 = (agyp) agykVar2.b;
            agypVar2.c = 1;
            agypVar2.a |= 2;
        }
        if (!b().booleanValue()) {
            T(true);
            if (z) {
                F(false);
            }
            agyp agypVar3 = (agyp) this.k.b;
            if ((agypVar3.a & 128) != 0) {
                dirb dirbVar4 = agypVar3.b;
                if (dirbVar4 == null) {
                    dirbVar4 = dirb.l;
                }
                dsqp dsqpVar2 = (dsqp) dirbVar4.cu(5);
                dsqpVar2.bC(dirbVar4);
                dira diraVar2 = (dira) dsqpVar2;
                dspd dspdVar = ((agyp) this.k.b).j;
                if (diraVar2.c) {
                    diraVar2.bF();
                    diraVar2.c = false;
                }
                dirb dirbVar5 = (dirb) diraVar2.b;
                dspdVar.getClass();
                dirbVar5.a |= 4;
                dirbVar5.d = dspdVar;
                dirbVar = (dirb) diraVar2.bK();
            } else {
                dirbVar = agypVar3.b;
                if (dirbVar == null) {
                    dirbVar = dirb.l;
                }
            }
            this.L = new cryz<>(new ahif(this, dirbVar));
            agyp agypVar4 = (agyp) this.k.b;
            dehn<afzy> a3 = this.e.a(dirbVar, this.C, this.E, (agypVar4.a & 256) != 0 ? agypVar4.k : null);
            cryz<afzy> cryzVar = this.L;
            dbsk.s(cryzVar);
            deha.q(a3, cryzVar, this.t);
        }
    }

    @Override // defpackage.ahac
    public View.OnAttachStateChangeListener A() {
        return this.J;
    }

    @Override // defpackage.ahac
    public Boolean B() {
        return Boolean.valueOf(this.B);
    }

    @Override // defpackage.ahac
    public View.OnAttachStateChangeListener C() {
        return this.z.b;
    }

    public agyp D() {
        agyk agykVar = this.k;
        if (agykVar.c) {
            agykVar.bF();
            agykVar.c = false;
        }
        agyp agypVar = agyp.r;
        ((agyp) agykVar.b).e = agyp.ck();
        agyk agykVar2 = this.k;
        dcbg s = dcbg.b(this.l).s(ahhw.a);
        if (agykVar2.c) {
            agykVar2.bF();
            agykVar2.c = false;
        }
        agyp agypVar2 = (agyp) agykVar2.b;
        dsrj<agym> dsrjVar = agypVar2.e;
        if (!dsrjVar.a()) {
            agypVar2.e = dsqw.cl(dsrjVar);
        }
        dsod.bv(s, agypVar2.e);
        agyk agykVar3 = this.k;
        if (agykVar3.c) {
            agykVar3.bF();
            agykVar3.c = false;
        }
        agyp agypVar3 = (agyp) agykVar3.b;
        agypVar3.a &= -17;
        agypVar3.g = 0;
        agxe agxeVar = this.F.a;
        if (agxeVar != null) {
            for (int i = 0; i < this.l.size(); i++) {
                if (this.l.get(i).b == agxeVar) {
                    agyk agykVar4 = this.k;
                    if (agykVar4.c) {
                        agykVar4.bF();
                        agykVar4.c = false;
                    }
                    agyp agypVar4 = (agyp) agykVar4.b;
                    agypVar4.a |= 16;
                    agypVar4.g = i;
                }
            }
        }
        aheh ahehVar = this.K;
        if (ahehVar == null) {
            agyk agykVar5 = this.k;
            if (agykVar5.c) {
                agykVar5.bF();
                agykVar5.c = false;
            }
            agyp agypVar5 = (agyp) agykVar5.b;
            agypVar5.n = null;
            agypVar5.a &= -2049;
        } else {
            agyk agykVar6 = this.k;
            agxn e = ahehVar.e();
            if (agykVar6.c) {
                agykVar6.bF();
                agykVar6.c = false;
            }
            agyp agypVar6 = (agyp) agykVar6.b;
            e.getClass();
            agypVar6.n = e;
            agypVar6.a |= 2048;
        }
        return this.k.bK();
    }

    public void E() {
        cryz<afzy> cryzVar = this.L;
        if (cryzVar != null) {
            cryzVar.c();
            this.L = null;
        }
        this.l.clear();
        agyk agykVar = this.k;
        if (agykVar.c) {
            agykVar.bF();
            agykVar.c = false;
        }
        agyp agypVar = agyp.r;
        ((agyp) agykVar.b).e = agyp.ck();
        if (agykVar.c) {
            agykVar.bF();
            agykVar.c = false;
        }
        agyp agypVar2 = (agyp) agykVar.b;
        int i = agypVar2.a & (-9);
        agypVar2.a = i;
        agypVar2.f = Long.MAX_VALUE;
        int i2 = i & (-3);
        agypVar2.a = i2;
        agypVar2.c = 0;
        int i3 = i2 & (-5);
        agypVar2.a = i3;
        agypVar2.d = 0L;
        int i4 = i3 & (-17);
        agypVar2.a = i4;
        agypVar2.g = 0;
        int i5 = i4 & (-33);
        agypVar2.a = i5;
        agypVar2.h = 0;
        int i6 = i5 & (-65);
        agypVar2.a = i6;
        agypVar2.i = 0;
        agypVar2.a = i6 & (-129);
        agypVar2.j = agyp.r.j;
        if (agykVar.c) {
            agykVar.bF();
            agykVar.c = false;
        }
        ((agyp) agykVar.b).q = dsqw.ck();
        if (agykVar.c) {
            agykVar.bF();
            agykVar.c = false;
        }
        agyp agypVar3 = (agyp) agykVar.b;
        agypVar3.a &= -513;
        agypVar3.l = false;
    }

    public void F(boolean z) {
        this.N = z;
        cqkx.p(this);
    }

    @dzsi
    public btlu G() {
        return this.C;
    }

    @Override // defpackage.ahac
    @dzsi
    /* renamed from: H */
    public aheh r() {
        if (W()) {
            return null;
        }
        aheh ahehVar = this.K;
        if (ahehVar != null) {
            return ahehVar;
        }
        int t = this.r.t(bvjk.aI, this.C, 0);
        if (!V()) {
            agyk agykVar = this.k;
            if (agykVar.c) {
                agykVar.bF();
                agykVar.c = false;
            }
            agyp agypVar = (agyp) agykVar.b;
            agyp agypVar2 = agyp.r;
            agypVar.a |= 4096;
            agypVar.o = true;
        } else if (!((agyp) this.k.b).o && t > 0 && t < this.s.a.a().k().a) {
            agyk agykVar2 = this.k;
            if (agykVar2.c) {
                agykVar2.bF();
                agykVar2.c = false;
            }
            agyp agypVar3 = (agyp) agykVar2.b;
            agypVar3.a |= 4096;
            agypVar3.o = true;
            this.r.ap(bvjk.aI, this.C);
        }
        agyp agypVar4 = (agyp) this.k.b;
        if (agypVar4.o) {
            ahei aheiVar = this.u;
            btlu btluVar = this.C;
            agxn agxnVar = agypVar4.n;
            if (agxnVar == null) {
                agxnVar = agxn.c;
            }
            agxn agxnVar2 = agxnVar;
            ahhz ahhzVar = new ahhz(this);
            Activity activity = (Activity) ((dxjd) aheiVar.a).a;
            ahei.a(activity, 1);
            cqhn a2 = aheiVar.b.a();
            ahei.a(a2, 2);
            agwa a3 = aheiVar.c.a();
            ahei.a(a3, 3);
            bvjj a4 = aheiVar.d.a();
            ahei.a(a4, 4);
            dxio a5 = ((dxjh) aheiVar.e).a();
            ahei.a(a5, 5);
            ahei.a(agxnVar2, 7);
            ahei.a(ahhzVar, 8);
            this.K = new aheh(activity, a2, a3, a4, a5, btluVar, agxnVar2, ahhzVar);
        }
        return this.K;
    }

    public void I(int i) {
        this.O = i;
    }

    public void J() {
        int a2;
        bvrj.UI_THREAD.c();
        if ((btlu.i(this.C) != btlt.GOOGLE && !V() && !W()) || ((a2 = agyo.a(((agyp) this.k.b).c)) != 0 && a2 == 3)) {
            this.i.c(cklt.UPDATES_RESTORE_FRAGMENT_LIST);
        } else {
            X(true);
        }
    }

    public final void K(afzy afzyVar) {
        final String str;
        dird a2 = afzyVar.a();
        if (!V() && i().booleanValue() && a2.d.size() > 0) {
            agwp agwpVar = this.x;
            btlu btluVar = this.C;
            dirb dirbVar = ((agyp) this.k.b).b;
            if (dirbVar == null) {
                dirbVar = dirb.l;
            }
            boolean z = !dirbVar.g.u();
            if (btlu.q(btluVar).l() && !agwpVar.a(btluVar)) {
                agwpVar.b.aa(bvjk.aK, btluVar, TimeUnit.MILLISECONDS.toSeconds(agwpVar.a.b()));
                agwpVar.b.T(bvjk.aL, btluVar, z);
                cjsx i = cjsy.i();
                i.b(ddda.cQ);
                agwpVar.c.a().k(i.a());
            }
        }
        dlau dlauVar = a2.i;
        if (dlauVar == null) {
            dlauVar = dlau.e;
        }
        if ((dlauVar.a & 1) != 0) {
            dlau dlauVar2 = a2.i;
            if (dlauVar2 == null) {
                dlauVar2 = dlau.e;
            }
            int i2 = dlauVar2.b;
            agad agadVar = this.v;
            if (agadVar != null) {
                agadVar.e.e().h(i2);
                cqkx.p(agadVar.e);
            }
        }
        boolean z2 = !((afzyVar.b().a.a & 4) != 0);
        if (this.g.e()) {
            dlau dlauVar3 = a2.i;
            if (dlauVar3 == null) {
                dlauVar3 = dlau.e;
            }
            List<String> d = cpwi.d(dlauVar3.c, ahia.a);
            if (z2) {
                this.g.t(d);
            }
            if (this.g.j() && !d.isEmpty()) {
                this.g.D(d);
            }
            agyk agykVar = this.k;
            if (agykVar.c) {
                agykVar.bF();
                agykVar.c = false;
            }
            agyp agypVar = (agyp) agykVar.b;
            agyp agypVar2 = agyp.r;
            dsrj<String> dsrjVar = agypVar.q;
            if (!dsrjVar.a()) {
                agypVar.q = dsqw.cl(dsrjVar);
            }
            dsod.bv(d, agypVar.q);
        }
        int a3 = agyo.a(((agyp) this.k.b).c);
        if (a3 == 0 || a3 != 3) {
            agyk agykVar2 = this.k;
            dspd dspdVar = afzyVar.b().a.e;
            if (agykVar2.c) {
                agykVar2.bF();
                agykVar2.c = false;
            }
            agyp agypVar3 = (agyp) agykVar2.b;
            dspdVar.getClass();
            agypVar3.a |= 256;
            agypVar3.k = dspdVar;
        }
        this.r.an(bvjk.aP, this.C, a2.f);
        agyk agykVar3 = this.k;
        if (agykVar3.c) {
            agykVar3.bF();
            agykVar3.c = false;
        }
        agyp agypVar4 = (agyp) agykVar3.b;
        agypVar4.c = 2;
        agypVar4.a = 2 | agypVar4.a;
        agyk agykVar4 = this.k;
        if (agykVar4.c) {
            agykVar4.bF();
            agykVar4.c = false;
        }
        agyp agypVar5 = (agyp) agykVar4.b;
        agypVar5.a |= 512;
        agypVar5.l = false;
        long c = afzyVar.c();
        agyk agykVar5 = this.k;
        if (c < ((agyp) agykVar5.b).f) {
            long c2 = afzyVar.c();
            if (agykVar5.c) {
                agykVar5.bF();
                agykVar5.c = false;
            }
            agyp agypVar6 = (agyp) agykVar5.b;
            agypVar6.a |= 8;
            agypVar6.f = c2;
        }
        dirb dirbVar2 = afzyVar.b().a;
        dird a4 = afzyVar.a();
        String str2 = null;
        final dspd dspdVar2 = (dirbVar2.a & 128) != 0 ? dirbVar2.g : null;
        dnqh dnqhVar = dirbVar2.b;
        if (dnqhVar == null) {
            dnqhVar = dnqh.p;
        }
        if (!dnqhVar.j) {
            str = "";
        } else if ((a4.a & 1) != 0) {
            str = a4.b;
        } else {
            ddxx c3 = cjrx.c(a4.c);
            if (c3 != null) {
                ddxz ddxzVar = c3.i;
                if (ddxzVar == null) {
                    ddxzVar = ddxz.d;
                }
                str2 = cjra.b(ddxzVar);
            }
            str = dbsj.e(str2);
        }
        U(dcbg.b(a4.d).s(new dbrn(this, dspdVar2, str) { // from class: ahhy
            private final ahin a;
            private final dspd b;
            private final String c;

            {
                this.a = this;
                this.b = dspdVar2;
                this.c = str;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ahin ahinVar = this.a;
                dspd dspdVar3 = this.b;
                String str3 = this.c;
                dlcv dlcvVar = (dlcv) obj;
                agyl bZ = agym.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                agym agymVar = (agym) bZ.b;
                dlcvVar.getClass();
                agymVar.b = dlcvVar;
                agymVar.a |= 1;
                agxs bZ2 = agyh.k.bZ();
                boolean z3 = dlcvVar.e > ((agyp) ahinVar.k.b).m || dbsd.a(dlcvVar.d, dspdVar3);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                agyh agyhVar = (agyh) bZ2.b;
                agyhVar.a = 1 | agyhVar.a;
                agyhVar.b = z3;
                boolean a5 = dbsd.a(dlcvVar.d, dspdVar3);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                agyh agyhVar2 = (agyh) bZ2.b;
                int i3 = agyhVar2.a | 2;
                agyhVar2.a = i3;
                agyhVar2.c = a5;
                str3.getClass();
                agyhVar2.a = i3 | 4;
                agyhVar2.d = str3;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                agym agymVar2 = (agym) bZ.b;
                agyh bK = bZ2.bK();
                bK.getClass();
                agymVar2.c = bK;
                agymVar2.a |= 2;
                return bZ.bK();
            }
        }));
        if (a2.e.u()) {
            agyk agykVar6 = this.k;
            if (agykVar6.c) {
                agykVar6.bF();
                agykVar6.c = false;
            }
            agyp agypVar7 = (agyp) agykVar6.b;
            agypVar7.a &= -129;
            agypVar7.j = agyp.r.j;
        } else {
            agyk agykVar7 = this.k;
            dspd dspdVar3 = a2.e;
            if (agykVar7.c) {
                agykVar7.bF();
                agykVar7.c = false;
            }
            agyp agypVar8 = (agyp) agykVar7.b;
            dspdVar3.getClass();
            agypVar8.a |= 128;
            agypVar8.j = dspdVar3;
        }
        if (!this.P || btlu.i(this.C) != btlt.GOOGLE) {
            return;
        }
        agbr agbrVar = this.y;
        btlu btluVar2 = this.C;
        dbsk.s(btluVar2);
        agbrVar.h(btluVar2, a2.g);
    }

    public void L() {
        if (!this.P) {
            if (btlu.i(this.C) == btlt.GOOGLE) {
                agyk agykVar = this.k;
                if ((((agyp) agykVar.b).a & 1024) == 0) {
                    agbr agbrVar = this.y;
                    btlu btluVar = this.C;
                    dbsk.s(btluVar);
                    long a2 = agbrVar.a(btluVar);
                    if (agykVar.c) {
                        agykVar.bF();
                        agykVar.c = false;
                    }
                    agyp agypVar = (agyp) agykVar.b;
                    agypVar.a |= 1024;
                    agypVar.m = a2;
                }
                agbr agbrVar2 = this.y;
                btlu btluVar2 = this.C;
                dbsk.s(btluVar2);
                agbr agbrVar3 = this.y;
                btlu btluVar3 = this.C;
                dbsk.s(btluVar3);
                agbrVar2.h(btluVar2, agbrVar3.f(btluVar3));
            }
            this.P = true;
        }
        this.y.k(this.C, false);
        for (ahhv ahhvVar : e()) {
            ahhvVar.p();
        }
    }

    public void M() {
        for (ahhv ahhvVar : e()) {
            ahhvVar.q();
        }
        this.P = false;
    }

    public void N(List<String> list) {
        if (!this.g.f()) {
            return;
        }
        dirb S = S(agyj.d);
        dsqp dsqpVar = (dsqp) S.cu(5);
        dsqpVar.bC(S);
        dira diraVar = (dira) dsqpVar;
        if (diraVar.c) {
            diraVar.bF();
            diraVar.c = false;
        }
        dirb dirbVar = (dirb) diraVar.b;
        dirb dirbVar2 = dirb.l;
        dsrj<String> dsrjVar = dirbVar.h;
        if (!dsrjVar.a()) {
            dirbVar.h = dsqw.cl(dsrjVar);
        }
        dsod.bv(list, dirbVar.h);
        this.e.b(diraVar);
        deha.q(this.e.a((dirb) diraVar.bK(), this.C, this.E, null), new ahii(this, list), this.t);
    }

    public void O(dspd dspdVar) {
        ahim ahimVar;
        byte[] G;
        Iterator<ahim> it = this.l.iterator();
        while (true) {
            if (!it.hasNext()) {
                ahimVar = null;
                break;
            }
            ahimVar = it.next();
            if (dspdVar.equals(ahimVar.b.l.d)) {
                break;
            }
        }
        if (ahimVar == null) {
            bvoo.h("Attempted to delete a non-existent item", new Object[0]);
        } else if (!ahimVar.a.i) {
            Object[] objArr = new Object[1];
            dspd dspdVar2 = ahimVar.a.d;
            StringBuilder sb = new StringBuilder(dspdVar2.c());
            for (byte b : dspdVar2.G()) {
                if (b < 32 || b > 126) {
                    sb.append(String.format("\\%03o", Byte.valueOf(b)));
                } else {
                    sb.append((char) b);
                }
            }
            objArr[0] = sb.toString();
            bvoo.h("Attempted to delete a non deletable item: %s", objArr);
        } else {
            P(ahimVar);
        }
    }

    public final void P(ahim ahimVar) {
        ahhv ahhvVar = ahimVar.b;
        ahhvVar.t = true;
        cqkx.p(ahhvVar);
        agal agalVar = this.e;
        dlcv dlcvVar = ahimVar.a;
        deig d = deig.d();
        dlbh bZ = dlbi.d.bZ();
        dspd dspdVar = dlcvVar.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlbi dlbiVar = (dlbi) bZ.b;
        dlbiVar.b = dspdVar.J();
        dlbiVar.a = 1 | dlbiVar.a;
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
        dlbi dlbiVar2 = (dlbi) bZ.b;
        dnqh bK = bZ2.bK();
        bK.getClass();
        dlbiVar2.c = bK;
        dlbiVar2.a |= 2;
        agalVar.c.c().b(bZ.bK(), new agai(agalVar, d), agalVar.e);
        deha.q(d, new ahij(this, ahimVar), this.t);
    }

    @dzsi
    public cjql Q() {
        View findViewById = this.c.a().findViewById(R.id.for_you_page);
        if (findViewById == null) {
            return null;
        }
        cjql e = cjqg.e(findViewById);
        if (e == null || k().equals(cjqg.k(findViewById))) {
            return e;
        }
        bvoo.f(new IllegalStateException());
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        if ((r4 instanceof defpackage.agtd) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        X(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r5 != r0.get(r0.size() - 5).b) goto L10;
     */
    @Override // defpackage.cqrh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Rz(defpackage.cqiw<?> r4, defpackage.cqkp r5) {
        /*
            r3 = this;
            java.lang.Boolean r0 = r3.c()
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L37
            java.lang.Boolean r0 = r3.d()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L37
            java.util.List<ahim> r0 = r3.l
            int r0 = r0.size()
            r2 = 5
            if (r0 < r2) goto L30
            java.util.List<ahim> r0 = r3.l
            int r2 = r0.size()
            int r2 = r2 + (-5)
            java.lang.Object r0 = r0.get(r2)
            ahim r0 = (defpackage.ahim) r0
            ahhv r0 = r0.b
            if (r5 == r0) goto L34
        L30:
            boolean r4 = r4 instanceof defpackage.agtd
            if (r4 == 0) goto L37
        L34:
            r3.X(r1)
        L37:
            cpv r4 = r3.h
            dzsj<gga> r5 = r3.c
            java.lang.Object r5 = r5.a()
            android.content.Context r5 = (android.content.Context) r5
            boolean r4 = r4.e(r5)
            if (r4 != 0) goto L60
            boolean r4 = r3.V()
            if (r4 == 0) goto L60
            bvjj r4 = r3.r
            bvjk r5 = defpackage.bvjk.aN
            btlu r0 = r3.C
            boolean r4 = r4.o(r5, r0, r1)
            if (r4 != 0) goto L60
            java.util.List r4 = r3.e()
            r4.size()
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahin.Rz(cqiw, cqkp):void");
    }

    @Override // defpackage.agzy
    public cqkl a() {
        X(true);
        return cqkl.a;
    }

    @Override // defpackage.ahac
    public Boolean b() {
        return Boolean.valueOf(this.M);
    }

    @Override // defpackage.ahac
    public Boolean c() {
        return Boolean.valueOf((((agyp) this.k.b).a & 128) != 0);
    }

    @Override // defpackage.ahac
    public Boolean d() {
        return Boolean.valueOf(((agyp) this.k.b).l);
    }

    @Override // defpackage.ahac
    public List<ahhv> e() {
        return dcbg.b(this.l).s(ahhx.a).z();
    }

    @Override // defpackage.ahac
    public Boolean g() {
        return Boolean.valueOf(this.N);
    }

    @Override // defpackage.ahac
    public Boolean h() {
        return Boolean.valueOf(!this.F.a().booleanValue());
    }

    @Override // defpackage.ahac
    public Boolean i() {
        return Boolean.valueOf(btlu.i(this.C) == btlt.GOOGLE);
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new agun(true), this);
    }

    @Override // defpackage.ahac, defpackage.jbt
    public cjtd k() {
        return cjtd.a(dtxr.bb);
    }

    @Override // defpackage.ahac
    public agzi l() {
        return this.G;
    }

    @Override // defpackage.ahac
    public Boolean m() {
        if (this.A.a() || W()) {
            agyk agykVar = this.k;
            if (agykVar.c) {
                agykVar.bF();
                agykVar.c = false;
            }
            agyp agypVar = (agyp) agykVar.b;
            agyp agypVar2 = agyp.r;
            agypVar.a |= 8192;
            agypVar.p = false;
            return false;
        }
        agyp agypVar3 = (agyp) this.k.b;
        if ((agypVar3.a & 8192) == 0) {
            this.r.ap(bvjk.aO, this.C);
            int t = this.r.t(bvjk.aO, this.C, 0);
            boolean z = true;
            if (t != 1 && t != 2 && t != 4 && t != 8 && t % 20 != 0) {
                z = false;
            }
            agyk agykVar2 = this.k;
            if (agykVar2.c) {
                agykVar2.bF();
                agykVar2.c = false;
            }
            agyp agypVar4 = (agyp) agykVar2.b;
            agypVar4.a |= 8192;
            agypVar4.p = z;
            return Boolean.valueOf(z);
        }
        return Boolean.valueOf(agypVar3.p);
    }

    @Override // defpackage.ahac
    public ahaf n() {
        return this.H;
    }

    @Override // defpackage.ahac
    public Boolean o() {
        return Boolean.valueOf(this.D);
    }

    @Override // defpackage.ahac
    public agzi p() {
        return this.I;
    }

    @Override // defpackage.ahac
    public Boolean q() {
        return Boolean.valueOf(this.s.a());
    }

    @Override // defpackage.ahac
    public void s(@dzsi agxe agxeVar) {
        this.F.a = agxeVar;
    }

    @Override // defpackage.ahac
    @dzsi
    public agxe t() {
        return this.F.a;
    }

    @Override // defpackage.ahac
    public ahaa u() {
        return this.F;
    }

    @Override // defpackage.ahac
    public cqtv v() {
        return cqrp.c(this.O + jmj.a(this.c.a(), 8));
    }

    @Override // defpackage.ahac
    public long w() {
        return ((agyp) this.k.b).d;
    }

    @Override // defpackage.ahac
    public Boolean x() {
        return Boolean.valueOf(this.s.d());
    }

    @Override // defpackage.ahac
    public Boolean y() {
        if (W()) {
            return false;
        }
        return Boolean.valueOf(this.s.a.a().m());
    }

    @Override // defpackage.ahac
    @dzsi
    public ahab z() {
        if (this.g.e()) {
            return this.n;
        }
        return null;
    }
}
