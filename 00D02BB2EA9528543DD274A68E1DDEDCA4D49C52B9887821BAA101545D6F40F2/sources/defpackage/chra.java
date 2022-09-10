package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.DisplayMetrics;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chra  reason: default package */
/* loaded from: classes4.dex */
public final class chra implements chrx, chof, crzp {
    public static final dcqe a = dcqe.c("chra");
    public static final dcep<chxj> b = dcep.D(chxj.BULK_PHOTO_UPLOAD, chxj.DEVICE_PHOTO_UPLOAD, chxj.TAG_PUBLISHED_PHOTOS);
    public static final dcdc<chxj> c = dcdc.g(chxj.ADD_LIST_ITEM_NOTE, chxj.ADD_LIST_ITEMS);
    public final HashSet<chxr> A;
    public final dzsj<bqji> B;
    public final bbtk C;
    public final cbqg D;
    public final chns E;
    public final chrk F;
    public final chrm G;
    public final chtb H;
    public final dxio<chrg> I;
    public final dxio<chnm> J;
    @dzsi
    public final bzyk K;
    private final btlu L;
    @dzsi
    private cctr M;
    private final HashMap<chtq, drnp> N;
    private crzo<chtq> R;
    @dzsi
    private byte[] S;
    private final chsh V;
    private final bztp W;
    private final bunc X;
    private final dxio<angp> Y;
    private final dxio<bbut> Z;
    private final dxio<begg> aa;
    private final dxio<axwo> ab;
    private final dxio<axwi> ac;
    private final dxio<baju> ad;
    private final bbul ae;
    private final bjgy af;
    private final aujx ag;
    private final HashMap<chtq, dehn<?>> ah;
    private final buqp ai;
    private final bumx aj;
    private final bvam ak;
    public final bvrb d;
    public final Executor e;
    public final btvo f;
    public final ges g;
    public final btrm h;
    public final anhk i;
    public final chnu j;
    public final HashMap<chxr, chxl> k;
    public final HashMap<chtq, chqz> l;
    public final HashMap<chtq, chua> m;
    public final HashSet<chxr> n;
    public final chsf r;
    public final HashMap<chxr, chxo> s;
    public crzo<chtp> t;
    public final crzo<chts> u;
    public final crzo<chua> v;
    public final crzo<drnp> w;
    public dcdc<drrv> x;
    public dbsg<dpyv> y;
    public dwyd z;
    public final HashSet<String> o = new HashSet<>();
    private final HashSet<String> O = new HashSet<>();
    public final HashSet<chtq> p = new HashSet<>();
    public final HashMap<String, docg> q = new HashMap<>();
    private final chqx<chqy, baal> P = new chqx<>(chog.a);
    private final chqx<String, baad> Q = new chqx<>(chor.a);
    private boolean T = false;
    private boolean U = false;

    public chra(chrl chrlVar, btvo btvoVar, dzsj dzsjVar, bvjj bvjjVar, bvrb bvrbVar, btrm btrmVar, anhk anhkVar, chnu chnuVar, buqp buqpVar, chnt chntVar, chrv chrvVar, bunc buncVar, bztp bztpVar, bbul bbulVar, bbtk bbtkVar, bjgy bjgyVar, aujx aujxVar, bumx bumxVar, cbqg cbqgVar, ccsk ccskVar, dxio dxioVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, dxio dxioVar5, dxio dxioVar6, dxio dxioVar7, dxio dxioVar8, chsh chshVar, chtc chtcVar, bzyl bzylVar, chsf chsfVar, bvam bvamVar, btlu btluVar, ges gesVar, boolean z) {
        this.f = btvoVar;
        this.d = bvrbVar;
        this.e = bvrbVar.h();
        this.g = gesVar;
        this.L = btluVar;
        this.h = btrmVar;
        this.i = anhkVar;
        this.j = chnuVar;
        bvjjVar.m(bvjk.hF, false);
        this.V = chshVar;
        this.ai = buqpVar;
        this.k = new HashMap<>(100);
        this.l = new HashMap<>();
        this.m = new HashMap<>();
        this.N = new HashMap<>();
        this.n = new HashSet<>();
        this.s = new HashMap<>();
        this.ah = new HashMap<>();
        this.R = new crzo<>();
        this.t = new crzo<>();
        this.u = new crzo<>();
        this.v = new crzo<>();
        this.w = new crzo<>(drnp.j);
        this.B = dzsjVar;
        buva a2 = chntVar.a.a();
        chnt.a(a2, 1);
        chnz a3 = chntVar.b.a();
        chnt.a(a3, 2);
        chrz a4 = chntVar.c.a();
        chnt.a(a4, 3);
        chnt.a(chntVar.d.a(), 4);
        chnt.a(chntVar.e.a(), 5);
        btvo a5 = chntVar.f.a();
        chnt.a(a5, 6);
        Resources a6 = chntVar.g.a();
        chnt.a(a6, 7);
        Executor a7 = chntVar.h.a();
        chnt.a(a7, 8);
        chnt.a(btluVar, 9);
        chns chnsVar = new chns(a2, a3, a4, a5, a6, a7, btluVar, z);
        this.E = chnsVar;
        crzm<chtr> e = chnsVar.e();
        bvrb a8 = chrvVar.a.a();
        chrv.a(a8, 1);
        Executor a9 = chrvVar.b.a();
        chrv.a(a9, 2);
        chrv.a(this, 3);
        chrv.a(e, 4);
        this.G = new chru(a8, a9, this, e);
        this.X = buncVar;
        this.Y = dxioVar;
        this.W = bztpVar;
        this.A = new HashSet<>();
        this.Z = dxioVar2;
        this.aa = dxioVar3;
        this.ab = dxioVar5;
        this.ac = dxioVar6;
        this.ad = dxioVar7;
        this.I = dxioVar4;
        this.ae = bbulVar;
        this.C = bbtkVar;
        this.af = bjgyVar;
        this.ag = aujxVar;
        this.D = cbqgVar;
        this.aj = bumxVar;
        bvrb a10 = chrlVar.a.a();
        chrl.a(a10, 1);
        dxio a11 = ((dxjh) chrlVar.b).a();
        chrl.a(a11, 2);
        dxio a12 = ((dxjh) chrlVar.c).a();
        chrl.a(a12, 3);
        dxio a13 = ((dxjh) chrlVar.d).a();
        chrl.a(a13, 4);
        dxio a14 = ((dxjh) chrlVar.e).a();
        chrl.a(a14, 5);
        dxio a15 = ((dxjh) chrlVar.f).a();
        chrl.a(a15, 6);
        chrl.a(((dxjh) chrlVar.g).a(), 7);
        dxio a16 = ((dxjh) chrlVar.h).a();
        chrl.a(a16, 8);
        chrl.a(this, 9);
        chrl.a(gesVar, 10);
        this.F = new chrk(a10, a11, a12, a13, a14, a15, a16, this, gesVar);
        this.x = dcdc.e();
        this.y = dbpy.a;
        this.z = dwyd.PUBLISH_PRIVATE_PHOTO;
        ccskVar.a(chpc.a);
        this.J = dxioVar8;
        crzm<chtr> e2 = chnsVar.e();
        Executor a17 = chtcVar.a.a();
        chtc.a(a17, 1);
        btvo a18 = chtcVar.b.a();
        chtc.a(a18, 2);
        chsf a19 = chtcVar.c.a();
        chtc.a(a19, 3);
        ckcw a20 = chtcVar.d.a();
        chtc.a(a20, 4);
        chtc.a(e2, 5);
        this.H = new chtb(a17, a18, a19, a20, e2);
        bzyk a21 = bzylVar.a(dgyd.MAPS_CREATOR_ZONE);
        this.K = a21;
        a21.a(btluVar);
        this.r = chsfVar;
        this.ak = bvamVar;
    }

    public static chxh ac(chxh chxhVar, final Set<String> set) {
        dsqp dsqpVar = (dsqp) chxhVar.cu(5);
        dsqpVar.bC(chxhVar);
        chww chwwVar = (chww) dsqpVar;
        if (chwwVar.c) {
            chwwVar.bF();
            chwwVar.c = false;
        }
        chxh chxhVar2 = chxh.b;
        ((chxh) chwwVar.b).a = chxh.ck();
        chwwVar.a(dcbg.b(chxhVar.a).o(new dbsl(set) { // from class: chpp
            private final Set a;

            {
                this.a = set;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                Set set2 = this.a;
                dcqe dcqeVar = chra.a;
                dwfl dwflVar = ((chxg) obj).b;
                if (dwflVar == null) {
                    dwflVar = dwfl.w;
                }
                return !set2.contains(dwflVar.q);
            }
        }));
        return chwwVar.bK();
    }

    public static chxk ad(chxl chxlVar) {
        for (chxk chxkVar : chxlVar.u) {
            if (chxj.a(chxkVar.b).equals(chxj.TAG_PUBLISHED_PHOTOS)) {
                return chxkVar;
            }
        }
        return chxk.g;
    }

    public static boolean ai(bztl bztlVar) {
        String uri = bztlVar.a().toString();
        String valueOf = String.valueOf(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
        sb.append(valueOf);
        sb.append("/");
        return uri.startsWith(sb.toString());
    }

    private final chtq ap(drrx drrxVar) {
        if (drrxVar == drrx.UNKNOWN_MODE) {
            return h();
        }
        return chtq.q(drrxVar);
    }

    private final void aq(chxl chxlVar, jjn jjnVar) {
        bvrj.UI_THREAD.c();
        if ((chxlVar.a & 4) != 0) {
            m(ak(chxlVar), null, jjnVar, false);
        }
    }

    private static chxl ar(dpvc dpvcVar, chxl chxlVar) {
        dpvc d;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= chxlVar.u.size() || (d = chtk.d(chxlVar.u.get(i))) == null) {
                break;
            }
            d.getClass();
            if (d.b.equals(dpvcVar.b)) {
                dsqp dsqpVar = (dsqp) chxlVar.cu(5);
                dsqpVar.bC(chxlVar);
                chvz chvzVar = (chvz) dsqpVar;
                chvzVar.e(i);
                chxlVar = chvzVar.bK();
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            String str = dpvcVar.b;
            if (chxlVar.b == null) {
                chxr chxrVar = chxr.e;
            }
        }
        return chxlVar;
    }

    private static chxl as(chxl chxlVar, final String str) {
        chvy chvyVar;
        chvy chvyVar2;
        dsqp dsqpVar = (dsqp) chxlVar.cu(5);
        dsqpVar.bC(chxlVar);
        chvz chvzVar = (chvz) dsqpVar;
        int i = 0;
        while (true) {
            if (i >= chxlVar.u.size()) {
                break;
            }
            chxk chxkVar = chxlVar.u.get(i);
            if (chxkVar.b != 9 || dcbg.b(((chvy) chxkVar.c).a).q(new dbsl(str) { // from class: chop
                private final String a;

                {
                    this.a = str;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    String str2 = this.a;
                    dcqe dcqeVar = chra.a;
                    djam djamVar = ((djao) obj).b;
                    if (djamVar == null) {
                        djamVar = djam.m;
                    }
                    return !djamVar.b.equals(str2);
                }
            })) {
                i++;
            } else {
                dsqp dsqpVar2 = (dsqp) chxkVar.cu(5);
                dsqpVar2.bC(chxkVar);
                chxi chxiVar = (chxi) dsqpVar2;
                if (chxkVar.b == 9) {
                    chvyVar = (chvy) chxkVar.c;
                } else {
                    chvyVar = chvy.b;
                }
                dsqp dsqpVar3 = (dsqp) chvyVar.cu(5);
                dsqpVar3.bC(chvyVar);
                chvx chvxVar = (chvx) dsqpVar3;
                if (chvxVar.c) {
                    chvxVar.bF();
                    chvxVar.c = false;
                }
                ((chvy) chvxVar.b).a = chvy.ck();
                if (chxkVar.b == 9) {
                    chvyVar2 = (chvy) chxkVar.c;
                } else {
                    chvyVar2 = chvy.b;
                }
                chvxVar.a(dcbg.b(chvyVar2.a).o(new dbsl(str) { // from class: choq
                    private final String a;

                    {
                        this.a = str;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        String str2 = this.a;
                        dcqe dcqeVar = chra.a;
                        djam djamVar = ((djao) obj).b;
                        if (djamVar == null) {
                            djamVar = djam.m;
                        }
                        return !djamVar.b.equals(str2);
                    }
                }));
                if (chxiVar.c) {
                    chxiVar.bF();
                    chxiVar.c = false;
                }
                chxk chxkVar2 = (chxk) chxiVar.b;
                chvy bK = chvxVar.bK();
                bK.getClass();
                chxkVar2.c = bK;
                chxkVar2.b = 9;
                chvzVar.f(i, chxiVar.bK());
            }
        }
        return chvzVar.bK();
    }

    @dzsi
    private final chxl at(chxr chxrVar) {
        this.n.add(chxrVar);
        return ax(chxrVar);
    }

    private static chxl au(chxl chxlVar, chwj chwjVar) {
        final String str = chwjVar.b;
        dsqp dsqpVar = (dsqp) chxlVar.cu(5);
        dsqpVar.bC(chxlVar);
        chvz chvzVar = (chvz) dsqpVar;
        if (chvzVar.c) {
            chvzVar.bF();
            chvzVar.c = false;
        }
        ((chxl) chvzVar.b).r = chxl.ck();
        chvzVar.a(dcbg.b(chxlVar.r).o(new dbsl(str) { // from class: chpo
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                String str2 = this.a;
                dcqe dcqeVar = chra.a;
                return !((chwj) obj).b.equals(str2);
            }
        }));
        return chvzVar.bK();
    }

    private final bqjf av(chxl chxlVar) {
        dbsg i;
        bqjf r = bqjh.r();
        dnqh c2 = bzwi.c(blpk.TODO_LIST);
        dsqp dsqpVar = (dsqp) c2.cu(5);
        dsqpVar.bC(c2);
        dnqg dnqgVar = (dnqg) dsqpVar;
        String str = chxlVar.c;
        if (dnqgVar.c) {
            dnqgVar.bF();
            dnqgVar.c = false;
        }
        dnqh dnqhVar = (dnqh) dnqgVar.b;
        dnqh dnqhVar2 = dnqh.p;
        str.getClass();
        dnqhVar.a |= 8;
        dnqhVar.e = str;
        r.f(dnqgVar.bK());
        r.n(chbv.NEVER_SHOW);
        r.c(dhpj.TODO_LIST);
        final bztn g = this.W.g();
        dcdc z = dcbg.b(chxlVar.g).o(chpq.a).s(chpr.a).s(new dbrn(g) { // from class: chps
            private final bztn a;

            {
                this.a = g;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dcqe dcqeVar = chra.a;
                return this.a.c((eape) obj);
            }
        }).z();
        if (z.isEmpty()) {
            i = dbpy.a;
        } else {
            dcdc z2 = dcbg.b((Iterable) deha.s(this.W.b(dcdc.g(g.f(), g.d(z))))).o(chpt.a).s(new dbrn(this) { // from class: chpu
                private final chra a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return this.a.C.a(((bztl) obj).a()).q();
                }
            }).z();
            i = z2.isEmpty() ? dbpy.a : dbsg.i(z2);
        }
        if (i.a()) {
            r.p((List) i.b());
        }
        return r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r3 != false) goto L24;
     */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.chxl aw(defpackage.chxr r10, defpackage.chtq r11) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chra.aw(chxr, chtq):chxl");
    }

    @dzsi
    private final chxl ax(chxr chxrVar) {
        chxl remove = this.k.remove(chxrVar);
        if (remove == null) {
            return null;
        }
        for (chqz chqzVar : this.l.values()) {
            bvrj.UI_THREAD.c();
            chqzVar.a.remove(chxrVar);
            chqzVar.b.remove(chxrVar);
        }
        if (chxrVar.b == 1) {
            this.q.remove((String) chxrVar.c);
        }
        return remove;
    }

    private final void ay(String str, String str2, int i) {
        bunc buncVar = this.X;
        dwcn bZ = dwco.f.bZ();
        dqju bZ2 = dqjw.i.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqjw dqjwVar = (dqjw) bZ2.b;
        dqjwVar.b = i - 1;
        int i2 = dqjwVar.a | 1;
        dqjwVar.a = i2;
        str.getClass();
        int i3 = i2 | 8;
        dqjwVar.a = i3;
        dqjwVar.f = str;
        str2.getClass();
        dqjwVar.a = i3 | 16;
        dqjwVar.g = str2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwco dwcoVar = (dwco) bZ.b;
        dqjw bK = bZ2.bK();
        bK.getClass();
        dwcoVar.e = bK;
        dwcoVar.a |= 16;
        String str3 = this.i.a().d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwco dwcoVar2 = (dwco) bZ.b;
        str3.getClass();
        dwcoVar2.a |= 4;
        dwcoVar2.d = str3;
        buncVar.b(bZ.bK(), new chqq(this), this.e);
    }

    private final void az(int i, Collection<String> collection) {
        if (collection.isEmpty()) {
            return;
        }
        bumx bumxVar = this.aj;
        dupc bZ = dupe.e.bZ();
        bZ.a(collection);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dupe dupeVar = (dupe) bZ.b;
        dupeVar.b = i - 1;
        dupeVar.a |= 2;
        bumxVar.b(bZ.bK(), new chql(), this.e);
    }

    @Override // defpackage.chrx
    public final void A(chxr chxrVar, djao djaoVar) {
        djam djamVar = djaoVar.b;
        if (djamVar == null) {
            djamVar = djam.m;
        }
        String str = djamVar.b;
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        this.k.put(chxrVar, as(chxlVar, str));
        bunc buncVar = this.X;
        dwcn bZ = dwco.f.bZ();
        dqju bZ2 = dqjw.i.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqjw dqjwVar = (dqjw) bZ2.b;
        dqjwVar.b = 3;
        dqjwVar.a |= 1;
        dwlh dwlhVar = chxlVar.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dniu dniuVar = dwlhVar.b;
        if (dniuVar == null) {
            dniuVar = dniu.i;
        }
        String str2 = dniuVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqjw dqjwVar2 = (dqjw) bZ2.b;
        str2.getClass();
        dqjwVar2.a |= 2;
        dqjwVar2.c = str2;
        dwlh dwlhVar2 = chxlVar.d;
        if (dwlhVar2 == null) {
            dwlhVar2 = dwlh.n;
        }
        dniu dniuVar2 = dwlhVar2.b;
        if (dniuVar2 == null) {
            dniuVar2 = dniu.i;
        }
        String str3 = dniuVar2.f;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqjw dqjwVar3 = (dqjw) bZ2.b;
        str3.getClass();
        int i = dqjwVar3.a | 4;
        dqjwVar3.a = i;
        dqjwVar3.d = str3;
        str.getClass();
        dqjwVar3.a = i | 32;
        dqjwVar3.h = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwco dwcoVar = (dwco) bZ.b;
        dqjw bK = bZ2.bK();
        bK.getClass();
        dwcoVar.e = bK;
        dwcoVar.a |= 16;
        buncVar.b(bZ.bK(), new chqr(), this.e);
        af();
    }

    @Override // defpackage.chrx
    public final void B(djao djaoVar) {
        bjgy bjgyVar = this.af;
        djam djamVar = djaoVar.b;
        if (djamVar == null) {
            djamVar = djam.m;
        }
        String str = djamVar.b;
        djam djamVar2 = djaoVar.b;
        if (djamVar2 == null) {
            djamVar2 = djam.m;
        }
        bjgyVar.a(1, str, djamVar2.k);
    }

    @Override // defpackage.chrx
    public final void C(bjhz bjhzVar) {
        chxr a2;
        final chxl chxlVar;
        int a3 = bjhy.a(bjhzVar.d);
        if (a3 == 0 || a3 != 2 || (chxlVar = this.k.get((a2 = chsp.a(bjhzVar.b, dbpy.a)))) == null) {
            return;
        }
        final String str = bjhzVar.c;
        final dbsg r = dcbg.b(chxlVar.u).o(chom.a).t(chon.a).r(new dbsl(str) { // from class: choo
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                String str2 = this.a;
                dcqe dcqeVar = chra.a;
                djam djamVar = ((djao) obj).b;
                if (djamVar == null) {
                    djamVar = djam.m;
                }
                return djamVar.b.equals(str2);
            }
        });
        this.u.a(chts.e(cqrt.l(R.string.ANSWER_QUESTION_TASK_THANK_YOU_SNACK_BAR_TEXT), cqrt.l(R.string.ANSWER_QUESTION_TASK_THANK_YOU_SNACK_BAR_ACTION_TEXT), new Runnable(this, r, chxlVar) { // from class: chol
            private final chra a;
            private final dbsg b;
            private final chxl c;

            {
                this.a = this;
                this.b = r;
                this.c = chxlVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                chra chraVar = this.a;
                dbsg dbsgVar = this.b;
                chxl chxlVar2 = this.c;
                if (dbsgVar.a()) {
                    chraVar.F.a(bwrs.a(chraVar.ak(chxlVar2)), (djao) dbsgVar.b(), false);
                }
            }
        }, cjtd.a(dtxl.gk)));
        chns chnsVar = this.E;
        chnsVar.l += chnsVar.f().c(dpwe.PLACE_QA_ANSWER);
        chnsVar.g();
        chnsVar.h();
        if (this.r.a()) {
            chrm chrmVar = this.G;
            dwlh dwlhVar = chxlVar.d;
            if (dwlhVar == null) {
                dwlhVar = dwlh.n;
            }
            dpsr dpsrVar = dwlhVar.f;
            if (dpsrVar == null) {
                dpsrVar = dpsr.c;
            }
            String str2 = dpsrVar.a;
            chru chruVar = (chru) chrmVar;
            if (chruVar.b.containsKey(str2)) {
                chug chugVar = chruVar.b.get(str2);
                LinkedHashMap<String, chug> linkedHashMap = chruVar.b;
                dsqp dsqpVar = (dsqp) chugVar.cu(5);
                dsqpVar.bC(chugVar);
                chuf chufVar = (chuf) dsqpVar;
                int i = chugVar.i + 1;
                if (chufVar.c) {
                    chufVar.bF();
                    chufVar.c = false;
                }
                chug chugVar2 = (chug) chufVar.b;
                chugVar2.a |= 128;
                chugVar2.i = i;
                int c2 = chugVar.d + chruVar.e.c(dpwe.PLACE_QA_ANSWER);
                if (chufVar.c) {
                    chufVar.bF();
                    chufVar.c = false;
                }
                chug chugVar3 = (chug) chufVar.b;
                chugVar3.a |= 4;
                chugVar3.d = c2;
                linkedHashMap.put(str2, chufVar.bK());
                chruVar.i();
            }
        }
        this.k.put(a2, as(chxlVar, bjhzVar.c));
        af();
    }

    @Override // defpackage.chrx
    public final void D(chxr chxrVar) {
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        dwlh dwlhVar = chxlVar.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dniu dniuVar = dwlhVar.b;
        if (dniuVar == null) {
            dniuVar = dniu.i;
        }
        dvya bZ = dvyw.bv.bZ();
        String str = dniuVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvyw dvywVar = (dvyw) bZ.b;
        str.getClass();
        int i = dvywVar.a | 4;
        dvywVar.a = i;
        dvywVar.g = str;
        String str2 = dniuVar.f;
        str2.getClass();
        dvywVar.a = i | 8;
        dvywVar.h = str2;
        dhjy bZ2 = dhjz.e.bZ();
        dnoh dnohVar = dniuVar.g;
        if (dnohVar == null) {
            dnohVar = dnoh.d;
        }
        double d = dnohVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ2.b;
        dhjzVar.a |= 2;
        dhjzVar.c = d;
        dnoh dnohVar2 = dniuVar.g;
        if (dnohVar2 == null) {
            dnohVar2 = dnoh.d;
        }
        double d2 = dnohVar2.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjz dhjzVar2 = (dhjz) bZ2.b;
        dhjzVar2.a |= 1;
        dhjzVar2.b = d2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvyw dvywVar2 = (dvyw) bZ.b;
        dhjz bK = bZ2.bK();
        bK.getClass();
        dvywVar2.e = bK;
        dvywVar2.a |= 1;
        this.Y.a().g(dbpy.a, dbpy.a, bZ.bK(), dbpy.a, dnqh.p, dbpy.a, dbsg.i(new chqs(this)));
    }

    @Override // defpackage.chrx
    public final void E(final chxr chxrVar, final cdhl cdhlVar) {
        bvrj.UI_THREAD.c();
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        akqi a2 = cdhlVar.a();
        if (a2.equals(akqi.a) || cdhlVar.b() == null) {
            cjxu.h(this.e, this.g.H(), this.g.Rp(R.string.UGC_PLACE_PICKER_SELECT_POI));
            return;
        }
        dwlh dwlhVar = chxlVar.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dniu dniuVar = dwlhVar.b;
        if (dniuVar == null) {
            dniuVar = dniu.i;
        }
        if (dniuVar.b.equals(a2.o())) {
            return;
        }
        dbsk.l(this.M == null);
        cctr aJ = cctr.aJ(R.string.LOADING);
        this.M = aJ;
        gn gnVar = this.g.A;
        dbsk.s(gnVar);
        aJ.e(gnVar, gfu.DIALOG_FRAGMENT.c);
        buqp buqpVar = this.ai;
        DisplayMetrics displayMetrics = this.g.Rn().getDisplayMetrics();
        akqq b2 = cdhlVar.b();
        dbsk.s(b2);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        dhjy bZ = dhjz.e.bZ();
        bZ.bC(b2.i());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ.b;
        dhjzVar.a |= 4;
        dhjzVar.d = 10000.0d;
        dhjz bK = bZ.bK();
        dhjw bZ2 = dhjx.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjx dhjxVar = (dhjx) bZ2.b;
        bK.getClass();
        dhjxVar.b = bK;
        dhjxVar.a |= 1;
        dhkc bZ3 = dhkd.d.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ3.b;
        int i3 = dhkdVar.a | 1;
        dhkdVar.a = i3;
        dhkdVar.b = i;
        dhkdVar.a = i3 | 2;
        dhkdVar.c = i2;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjx dhjxVar2 = (dhjx) bZ2.b;
        dhkd bK2 = bZ3.bK();
        bK2.getClass();
        dhjxVar2.d = bK2;
        dhjxVar2.a |= 4;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjx dhjxVar3 = (dhjx) bZ2.b;
        dhjxVar3.a |= 8;
        dhjxVar3.e = 30.0f;
        bgei bgeiVar = new bgei(bZ2.bK(), 12, new Point(i, i2));
        dvzi dvziVar = (dvzi) dvzj.y.bZ();
        String o = cdhlVar.a().o();
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar = (dvzj) dvziVar.b;
        o.getClass();
        dvzjVar.a |= 1;
        dvzjVar.b = o;
        dhjz i4 = b2.i();
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar2 = (dvzj) dvziVar.b;
        i4.getClass();
        dvzjVar2.d = i4;
        dvzjVar2.a |= 4;
        String c2 = cdhlVar.c();
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar3 = (dvzj) dvziVar.b;
        c2.getClass();
        dvzjVar3.a |= 2;
        dvzjVar3.c = c2;
        dnyc bZ4 = dnzj.Z.bZ();
        dnyd bZ5 = dnye.d.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dnye dnyeVar = (dnye) bZ5.b;
        dnyeVar.a = 1 | dnyeVar.a;
        dnyeVar.b = false;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnzj dnzjVar = (dnzj) bZ4.b;
        dnye bK3 = bZ5.bK();
        bK3.getClass();
        dnzjVar.B = bK3;
        dnzjVar.b |= 4096;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnzj.j((dnzj) bZ4.b);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnzj.d((dnzj) bZ4.b);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnzj.k((dnzj) bZ4.b);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnzj dnzjVar2 = (dnzj) bZ4.b;
        int i5 = dnzjVar2.b | 33554432;
        dnzjVar2.b = i5;
        dnzjVar2.H = false;
        dnzjVar2.b = i5 | 134217728;
        dnzjVar2.I = false;
        dnzj.l(dnzjVar2);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnzj dnzjVar3 = (dnzj) bZ4.b;
        dnzjVar3.a |= 512;
        dnzjVar3.j = false;
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar4 = (dvzj) dvziVar.b;
        dnzj bK4 = bZ4.bK();
        bK4.getClass();
        dvzjVar4.m = bK4;
        dvzjVar4.a |= 16384;
        dhjx dhjxVar4 = bgeiVar.a;
        if (dvziVar.c) {
            dvziVar.bF();
            dvziVar.c = false;
        }
        dvzj dvzjVar5 = (dvzj) dvziVar.b;
        dhjxVar4.getClass();
        dvzjVar5.e = dhjxVar4;
        dvzjVar5.a |= 8;
        buqpVar.b((dvzj) dvziVar.bK(), new ccts(new bvqg(this, chxrVar, cdhlVar) { // from class: chos
            private final chra a;
            private final chxr b;
            private final cdhl c;

            {
                this.a = this;
                this.b = chxrVar;
                this.c = cdhlVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                chra chraVar = this.a;
                chxr chxrVar2 = this.b;
                cdhl cdhlVar2 = this.c;
                chraVar.al();
                dvyw dvywVar = ((dvzl) obj).b;
                if (dvywVar == null) {
                    dvywVar = dvyw.bv;
                }
                chraVar.F(chxrVar2, cdhlVar2, dvywVar);
            }
        }, new bvqg(this, chxrVar, cdhlVar) { // from class: chot
            private final chra a;
            private final chxr b;
            private final cdhl c;

            {
                this.a = this;
                this.b = chxrVar;
                this.c = cdhlVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                chra chraVar = this.a;
                chxr chxrVar2 = this.b;
                cdhl cdhlVar2 = this.c;
                btzy btzyVar = (btzy) obj;
                chraVar.al();
                chraVar.F(chxrVar2, cdhlVar2, null);
            }
        }), this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(chxr chxrVar, cdhl cdhlVar, @dzsi dvyw dvywVar) {
        chxl bK;
        int i;
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        String o = cdhlVar.a().o();
        if (dvywVar != null) {
            dbsk.l(o.equals(dvywVar.g));
            dsqp dsqpVar = (dsqp) chxlVar.cu(5);
            dsqpVar.bC(chxlVar);
            chvz chvzVar = (chvz) dsqpVar;
            chxr chxrVar2 = chxlVar.b;
            if (chxrVar2 == null) {
                chxrVar2 = chxr.e;
            }
            dsqp dsqpVar2 = (dsqp) chxrVar2.cu(5);
            dsqpVar2.bC(chxrVar2);
            chxq chxqVar = (chxq) dsqpVar2;
            String str = dvywVar.g;
            if (chxqVar.c) {
                chxqVar.bF();
                chxqVar.c = false;
            }
            chxr chxrVar3 = (chxr) chxqVar.b;
            str.getClass();
            chxrVar3.b = 1;
            chxrVar3.c = str;
            if (chvzVar.c) {
                chvzVar.bF();
                chvzVar.c = false;
            }
            chxl chxlVar2 = (chxl) chvzVar.b;
            chxr bK2 = chxqVar.bK();
            bK2.getClass();
            chxlVar2.b = bK2;
            chxlVar2.a |= 1;
            dwlh e = chsp.e(dvywVar);
            if (chvzVar.c) {
                chvzVar.bF();
                chvzVar.c = false;
            }
            chxl chxlVar3 = (chxl) chvzVar.b;
            e.getClass();
            chxlVar3.d = e;
            chxlVar3.a |= 4;
            dvxb dvxbVar = dvywVar.V;
            if (dvxbVar == null) {
                dvxbVar = dvxb.d;
            }
            String str2 = dvxbVar.c;
            if (chvzVar.c) {
                chvzVar.bF();
                chvzVar.c = false;
            }
            chxl chxlVar4 = (chxl) chvzVar.b;
            str2.getClass();
            chxlVar4.a |= 2;
            chxlVar4.c = str2;
            dvxh dvxhVar = dvywVar.z;
            if (dvxhVar == null) {
                dvxhVar = dvxh.B;
            }
            doco docoVar = dvxhVar.d;
            if (docoVar == null) {
                docoVar = doco.k;
            }
            docg docgVar = docoVar.c;
            if (docgVar == null) {
                docgVar = docg.M;
            }
            docg docgVar2 = docoVar.d;
            if (docgVar2 == null) {
                docgVar2 = docg.M;
            }
            boolean z = !docgVar.r.isEmpty();
            if (chvzVar.c) {
                chvzVar.bF();
                chvzVar.c = false;
            }
            chxl chxlVar5 = (chxl) chvzVar.b;
            int i2 = chxlVar5.a | 512;
            chxlVar5.a = i2;
            chxlVar5.l = z;
            if ((docgVar.a & 512) != 0) {
                int i3 = docgVar.q;
                i = i2 | 256;
                chxlVar5.a = i;
                chxlVar5.k = i3;
            } else {
                i = i2 & (-257);
                chxlVar5.a = i;
                chxlVar5.k = 0;
            }
            if ((docgVar.a & 67108864) != 0) {
                dqwy dqwyVar = docgVar.G;
                if (dqwyVar == null) {
                    dqwyVar = dqwy.c;
                }
                if (chvzVar.c) {
                    chvzVar.bF();
                    chvzVar.c = false;
                }
                chxl chxlVar6 = (chxl) chvzVar.b;
                dqwyVar.getClass();
                chxlVar6.s = dqwyVar;
                chxlVar6.a |= 8192;
            } else {
                chxlVar5.s = null;
                chxlVar5.a = i & (-8193);
            }
            if ((docgVar2.a & 512) != 0) {
                int i4 = docgVar2.q;
                chxl chxlVar7 = (chxl) chvzVar.b;
                chxlVar7.a |= 128;
                chxlVar7.j = i4;
            } else {
                chxl chxlVar8 = (chxl) chvzVar.b;
                chxlVar8.a &= -129;
                chxlVar8.j = 0;
            }
            if ((docgVar2.a & 1024) != 0) {
                String str3 = docgVar2.r;
                chxl chxlVar9 = (chxl) chvzVar.b;
                str3.getClass();
                chxlVar9.a |= 1024;
                chxlVar9.m = str3;
            } else {
                chxl chxlVar10 = (chxl) chvzVar.b;
                chxlVar10.a &= -1025;
                chxlVar10.m = chxl.x.m;
            }
            if ((docgVar2.a & 67108864) != 0) {
                dqwy dqwyVar2 = docgVar2.G;
                if (dqwyVar2 == null) {
                    dqwyVar2 = dqwy.c;
                }
                if (chvzVar.c) {
                    chvzVar.bF();
                    chvzVar.c = false;
                }
                chxl chxlVar11 = (chxl) chvzVar.b;
                dqwyVar2.getClass();
                chxlVar11.t = dqwyVar2;
                chxlVar11.a |= 16384;
            } else {
                if (chvzVar.c) {
                    chvzVar.bF();
                    chvzVar.c = false;
                }
                chxl chxlVar12 = (chxl) chvzVar.b;
                chxlVar12.t = null;
                chxlVar12.a &= -16385;
            }
            bK = chvzVar.bK();
        } else {
            dbsg dbsgVar = dbpy.a;
            chxr chxrVar4 = chxlVar.b;
            if (chxrVar4 == null) {
                chxrVar4 = chxr.e;
            }
            if (!chxrVar4.d.isEmpty()) {
                chxr chxrVar5 = chxlVar.b;
                if (chxrVar5 == null) {
                    chxrVar5 = chxr.e;
                }
                dbsgVar = dbsg.i(chxrVar5.d);
            }
            dsqp dsqpVar3 = (dsqp) chxlVar.cu(5);
            dsqpVar3.bC(chxlVar);
            chvz chvzVar2 = (chvz) dsqpVar3;
            chxr a2 = chsp.a(o, dbsgVar);
            if (chvzVar2.c) {
                chvzVar2.bF();
                chvzVar2.c = false;
            }
            chxl chxlVar13 = (chxl) chvzVar2.b;
            a2.getClass();
            chxlVar13.b = a2;
            chxlVar13.a |= 1;
            chxl bK3 = chvzVar2.bK();
            dsqp dsqpVar4 = (dsqp) bK3.cu(5);
            dsqpVar4.bC(bK3);
            chvz chvzVar3 = (chvz) dsqpVar4;
            dwlc bZ = dwlh.n.bZ();
            dnip bZ2 = dniu.i.bZ();
            String c2 = cdhlVar.c();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwlh dwlhVar = (dwlh) bZ.b;
            c2.getClass();
            dwlhVar.a |= 2;
            dwlhVar.c = c2;
            String o2 = cdhlVar.a().o();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dniu dniuVar = (dniu) bZ2.b;
            o2.getClass();
            dniuVar.a |= 1;
            dniuVar.b = o2;
            akqq b2 = cdhlVar.b();
            dbsk.s(b2);
            dpum h = b2.h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwlh dwlhVar2 = (dwlh) bZ.b;
            h.getClass();
            dwlhVar2.d = h;
            dwlhVar2.a |= 8;
            dnoh g = b2.g();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dniu dniuVar2 = (dniu) bZ2.b;
            g.getClass();
            dniuVar2.g = g;
            dniuVar2.a |= 64;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwlh dwlhVar3 = (dwlh) bZ.b;
            dniu bK4 = bZ2.bK();
            bK4.getClass();
            dwlhVar3.b = bK4;
            dwlhVar3.a |= 1;
            dwlh bK5 = bZ.bK();
            if (chvzVar3.c) {
                chvzVar3.bF();
                chvzVar3.c = false;
            }
            chxl chxlVar14 = (chxl) chvzVar3.b;
            bK5.getClass();
            chxlVar14.d = bK5;
            chxlVar14.a |= 4;
            bK = chvzVar3.bK();
        }
        chxr chxrVar6 = bK.b;
        if (chxrVar6 == null) {
            chxrVar6 = chxr.e;
        }
        ax(chxrVar6);
        this.k.remove(chxrVar);
        this.k.put(chxrVar6, bK);
        for (chqz chqzVar : this.l.values()) {
            bvrj.UI_THREAD.c();
            int indexOf = chqzVar.a.indexOf(chxrVar);
            if (indexOf != -1) {
                chqzVar.a.set(indexOf, chxrVar6);
                chqzVar.b.remove(chxrVar);
                chqzVar.b.add(chxrVar6);
            }
        }
        if (this.r.c()) {
            chtb chtbVar = this.H;
            chtbVar.e.b(chxrVar6);
            chta chtaVar = chtbVar.e;
            bvrj.UI_THREAD.c();
            for (Map.Entry<Integer, ArrayList<chxr>> entry : chtaVar.c.entrySet()) {
                ArrayList<chxr> value = entry.getValue();
                int indexOf2 = value.indexOf(chxrVar);
                if (indexOf2 != -1) {
                    value.set(indexOf2, chxrVar6);
                }
            }
            chtaVar.a.remove(chxrVar);
            chtaVar.a.add(chxrVar6);
        }
        af();
    }

    @Override // defpackage.chrx
    public final void G(chxr chxrVar, int i) {
        bvrj.UI_THREAD.c();
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        this.E.b();
        if (this.r.c()) {
            this.H.c(chxrVar);
        }
        if (this.r.a()) {
            this.G.d(chxlVar);
        }
        chqu chquVar = new chqu(this, chxrVar, i);
        bqji a2 = this.B.a();
        bqku c2 = bqla.c();
        bqkw k = bqkx.k();
        dwlh dwlhVar = chxlVar.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dniu dniuVar = dwlhVar.b;
        if (dniuVar == null) {
            dniuVar = dniu.i;
        }
        k.c(akqi.b(dniuVar.b));
        k.f(i);
        k.e("");
        c2.b(k.h());
        bqky h = bqkz.h();
        h.d(bzwi.c(blpk.TODO_LIST));
        h.g(chbv.NEVER_SHOW);
        h.c(dhpj.TODO_LIST);
        c2.c(h.a());
        a2.c(c2.d(), bwrs.a(ak(chxlVar)), chquVar);
        dsqp dsqpVar = (dsqp) chxlVar.cu(5);
        dsqpVar.bC(chxlVar);
        chvz chvzVar = (chvz) dsqpVar;
        if (chvzVar.c) {
            chvzVar.bF();
            chvzVar.c = false;
        }
        chxl chxlVar2 = (chxl) chvzVar.b;
        chxlVar2.a |= 256;
        chxlVar2.k = i;
        this.k.put(chxrVar, chvzVar.bK());
        chqz chqzVar = this.l.get(chtq.g());
        if (chqzVar != null) {
            chqzVar.c(chxrVar);
        }
        af();
    }

    @Override // defpackage.chrx
    public final void H(chxr chxrVar) {
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        int i = chxlVar.k;
        if (i <= 0) {
            i = chxlVar.j;
        }
        bwrs<ilo> a2 = bwrs.a(ak(chxlVar));
        bqjf av = av(chxlVar);
        av.j(i);
        av.l(!this.J.a().q());
        av.k(chxlVar.m);
        this.B.a().b(a2, av.o());
    }

    @Override // defpackage.chrx
    public final void I(chxr chxrVar, int i) {
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        bwrs<ilo> a2 = bwrs.a(ak(chxlVar));
        bqjf av = av(chxlVar);
        av.j(i);
        av.l(!this.J.a().q());
        this.B.a().b(a2, av.o());
        chqz chqzVar = this.l.get(chtq.g());
        if (chqzVar == null) {
            return;
        }
        chqzVar.c(chxrVar);
    }

    @Override // defpackage.chrx
    public final void J(dcdc<dwfl> dcdcVar, int i, chxr chxrVar) {
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        chxp chxpVar = chxlVar.i;
        if (chxpVar == null) {
            chxpVar = chxp.k;
        }
        final dcep K = dcep.K(chxpVar.c);
        ckni ckniVar = new ckni(dcdcVar, null, null, dcbg.b(dcdcVar).o(new dbsl(K) { // from class: chou
            private final dcep a;

            {
                this.a = K;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dcep dcepVar = this.a;
                dcqe dcqeVar = chra.a;
                return dcepVar.contains(((dwfl) obj).q);
            }
        }).s(chov.a).B());
        bbtv v = bbty.v();
        v.m(true);
        this.Z.a().o(ckniVar, i, v.a(), this.g);
    }

    @Override // defpackage.chrx
    public final void K(bbua bbuaVar) {
        dbsg i;
        dcdc<dwfl> a2 = bbuaVar.a();
        if (a2.isEmpty()) {
            return;
        }
        final String str = a2.get(0).q;
        Collection values = dcjz.x(this.k, new dbsl(str) { // from class: chpb
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                String str2 = this.a;
                chxr chxrVar = (chxr) obj;
                dcqe dcqeVar = chra.a;
                return !chxrVar.d.isEmpty() && chxrVar.d.equals(str2);
            }
        }).values();
        if (values.isEmpty()) {
            i = dbpy.a;
        } else {
            i = values.size() > 1 ? dbpy.a : dbsg.i((chxl) dcft.c(values));
        }
        if (!i.a()) {
            String str2 = a2.get(0).q;
            return;
        }
        final dcep K = dcep.K(dcjz.z(bbuaVar.c(), chow.a).keySet());
        dcdc z = dcbg.b(a2).o(new dbsl(K) { // from class: chox
            private final dcep a;

            {
                this.a = K;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dcep dcepVar = this.a;
                dcqe dcqeVar = chra.a;
                return dcepVar.contains(((dwfl) obj).d);
            }
        }).s(choy.a).z();
        final dcep<String> d = bbuaVar.d();
        dcdc z2 = dcbg.b(a2).o(new dbsl(d) { // from class: choz
            private final dcep a;

            {
                this.a = d;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dcep dcepVar = this.a;
                dcqe dcqeVar = chra.a;
                return dcepVar.contains(((dwfl) obj).d);
            }
        }).s(chpa.a).z();
        chxp chxpVar = ((chxl) i.b()).i;
        if (chxpVar == null) {
            chxpVar = chxp.k;
        }
        dsqp dsqpVar = (dsqp) chxpVar.cu(5);
        dsqpVar.bC(chxpVar);
        chxm chxmVar = (chxm) dsqpVar;
        if (chxmVar.c) {
            chxmVar.bF();
            chxmVar.c = false;
        }
        ((chxp) chxmVar.b).c = dsqw.ck();
        chxmVar.a(z);
        if (chxmVar.c) {
            chxmVar.bF();
            chxmVar.c = false;
        }
        chxp chxpVar2 = (chxp) chxmVar.b;
        dsrj<String> dsrjVar = chxpVar2.e;
        if (!dsrjVar.a()) {
            chxpVar2.e = dsqw.cl(dsrjVar);
        }
        dsod.bv(z2, chxpVar2.e);
        chxp bK = chxmVar.bK();
        HashMap<chxr, chxl> hashMap = this.k;
        chxr chxrVar = ((chxl) i.b()).b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        chxl chxlVar = (chxl) i.b();
        dsqp dsqpVar2 = (dsqp) chxlVar.cu(5);
        dsqpVar2.bC(chxlVar);
        chvz chvzVar = (chvz) dsqpVar2;
        if (chvzVar.c) {
            chvzVar.bF();
            chvzVar.c = false;
        }
        chxl chxlVar2 = (chxl) chvzVar.b;
        bK.getClass();
        chxlVar2.i = bK;
        chxlVar2.a |= 64;
        hashMap.put(chxrVar, chvzVar.bK());
        af();
    }

    @Override // defpackage.chrx
    public final void L(chxr chxrVar, Collection<chxg> collection) {
        chxh chxhVar;
        bvrj.UI_THREAD.c();
        dcep B = dcbg.b(collection).s(chpd.a).B();
        this.o.addAll(B);
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        chxk ad = ad(chxlVar);
        if (ad.b == 5) {
            dsqp dsqpVar = (dsqp) ad.cu(5);
            dsqpVar.bC(ad);
            chxi chxiVar = (chxi) dsqpVar;
            if (ad.b == 5) {
                chxhVar = (chxh) ad.c;
            } else {
                chxhVar = chxh.b;
            }
            chxh ac = ac(chxhVar, B);
            if (chxiVar.c) {
                chxiVar.bF();
                chxiVar.c = false;
            }
            chxk chxkVar = (chxk) chxiVar.b;
            ac.getClass();
            chxkVar.c = ac;
            chxkVar.b = 5;
            int indexOf = chxlVar.u.indexOf(ad);
            dsqp dsqpVar2 = (dsqp) chxlVar.cu(5);
            dsqpVar2.bC(chxlVar);
            chvz chvzVar = (chvz) dsqpVar2;
            chvzVar.f(indexOf, chxiVar.bK());
            this.k.put(chxrVar, chvzVar.bK());
            af();
            dwcn bZ = dwco.f.bZ();
            dqju bZ2 = dqjw.i.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqjw dqjwVar = (dqjw) bZ2.b;
            dqjwVar.b = 1;
            dqjwVar.a |= 1;
            bZ2.a(dcbg.b(collection).s(chpe.a).z());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwco dwcoVar = (dwco) bZ.b;
            dqjw bK = bZ2.bK();
            bK.getClass();
            dwcoVar.e = bK;
            dwcoVar.a |= 16;
            String str = this.i.a().d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwco dwcoVar2 = (dwco) bZ.b;
            str.getClass();
            dwcoVar2.a |= 4;
            dwcoVar2.d = str;
            dwco bK2 = bZ.bK();
            this.X.b(bK2, new chqw(this, bK2), this.e);
            return;
        }
        bvoo.h("Attempted to dismiss photos for item without tagging task, with key=%s", chxrVar);
    }

    @Override // defpackage.chrx
    public final void M(chxr chxrVar, chwj chwjVar) {
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        bbul bbulVar = this.ae;
        bbui k = bbuj.k();
        k.p(this.L);
        k.h(dwyd.TODO_LIST);
        k.n(this.C.a(Uri.parse(chwjVar.b)), bbvh.e(ak(chxlVar)));
        bbulVar.d(k.m());
        this.k.put(chxrVar, au(chxlVar, chwjVar));
        this.E.c(1);
        if (this.r.a()) {
            this.G.e(chxlVar, 1);
        }
        af();
    }

    @Override // defpackage.chrx
    public final void N(chxr chxrVar, chwj chwjVar) {
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        bztp bztpVar = this.W;
        dcdc f = dcdc.f(Uri.parse(chwjVar.b));
        this.W.k();
        final dehn<Integer> e = bztpVar.e(f, bzsy.b("was_dismissed_in_todo_list"), new bzto[0]);
        e.Pk(new Runnable(e) { // from class: chpf
            private final dehn a;

            {
                this.a = e;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Integer num = (Integer) deha.s(this.a);
            }
        }, this.e);
        this.k.put(chxrVar, au(chxlVar, chwjVar));
        af();
    }

    @Override // defpackage.chrx
    public final void O(chxr chxrVar, Collection<dwmz> collection) {
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        bbui k = bbuj.k();
        k.p(this.L);
        k.h(this.z);
        bbvh e = bbvh.e(ak(chxlVar));
        for (dwmz dwmzVar : collection) {
            try {
                dwfl dwflVar = dwmzVar.b;
                if (dwflVar == null) {
                    dwflVar = dwfl.w;
                }
                k.o(bbtn.d(decs.b(dwflVar.d), ""), e);
            } catch (NumberFormatException unused) {
            }
        }
        this.ae.d(k.m());
        if (this.y.f() == dpyv.TODO_PHOTO) {
            this.ag.c(ddos.TODO_PHOTO).a(null);
        }
        dcep B = dcbg.b(chxlVar.p).s(chpg.a).B();
        dcep B2 = dcbg.b(collection).s(chph.a).B();
        az(2, B2);
        az(4, dcnm.p(B, B2));
        HashMap<chxr, chxl> hashMap = this.k;
        dsqp dsqpVar = (dsqp) chxlVar.cu(5);
        dsqpVar.bC(chxlVar);
        chvz chvzVar = (chvz) dsqpVar;
        if (chvzVar.c) {
            chvzVar.bF();
            chvzVar.c = false;
        }
        chxl.d((chxl) chvzVar.b);
        hashMap.put(chxrVar, chvzVar.bK());
        af();
        this.E.c(collection.size());
        if (!this.r.a()) {
            return;
        }
        this.G.e(chxlVar, collection.size());
    }

    @Override // defpackage.crzp
    public final void On(crzm<chtq> crzmVar) {
        chtq l = crzmVar.l();
        dbsk.s(l);
        e(l);
        if (this.N.containsKey(l)) {
            this.w.a(this.N.get(l));
        } else {
            this.w.a(drnp.j);
        }
        if (this.m.containsKey(l)) {
            this.v.a(this.m.get(l));
        } else {
            this.v.a(chua.c);
        }
    }

    @Override // defpackage.chrx
    public final void P(chxr chxrVar) {
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        az(3, dcbg.b(chxlVar.p).s(chpi.a).z());
        HashMap<chxr, chxl> hashMap = this.k;
        dsqp dsqpVar = (dsqp) chxlVar.cu(5);
        dsqpVar.bC(chxlVar);
        chvz chvzVar = (chvz) dsqpVar;
        if (chvzVar.c) {
            chvzVar.bF();
            chvzVar.c = false;
        }
        chxl.d((chxl) chvzVar.b);
        hashMap.put(chxrVar, chvzVar.bK());
        af();
    }

    @Override // defpackage.chrx
    public final void Q(chxr chxrVar, dbrn<chxp, chxp> dbrnVar) {
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        HashMap<chxr, chxl> hashMap = this.k;
        dsqp dsqpVar = (dsqp) chxlVar.cu(5);
        dsqpVar.bC(chxlVar);
        chvz chvzVar = (chvz) dsqpVar;
        chxp chxpVar = chxlVar.i;
        if (chxpVar == null) {
            chxpVar = chxp.k;
        }
        chxp a2 = dbrnVar.a(chxpVar);
        if (chvzVar.c) {
            chvzVar.bF();
            chvzVar.c = false;
        }
        chxl chxlVar2 = (chxl) chvzVar.b;
        a2.getClass();
        chxlVar2.i = a2;
        chxlVar2.a |= 64;
        hashMap.put(chxrVar, chvzVar.bK());
    }

    @Override // defpackage.chrx
    public final void R(baad baadVar, Runnable runnable, final Runnable runnable2) {
        axwm f = axwn.f();
        axvs axvsVar = (axvs) f;
        axvsVar.a = dtxl.hp;
        axvsVar.b = dtxl.hq;
        f.b(2);
        axvsVar.c = runnable;
        axvsVar.d = chpj.a;
        bvqj.e(this.ab.a().m(baadVar, f.a()), new bvqg(this, runnable2) { // from class: chpk
            private final chra a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable2;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                chra chraVar = this.a;
                Runnable runnable3 = this.b;
                baad baadVar2 = (baad) obj;
                if (baadVar2 != null && baadVar2.t() == baac.PUBLISHED) {
                    chraVar.S(baadVar2);
                }
                runnable3.run();
            }
        }, this.e);
    }

    @dzsi
    public final synchronized baad S(baad baadVar) {
        chxr b2 = chsp.b(baadVar.l());
        chxl chxlVar = this.k.get(b2);
        if (chxlVar != null) {
            dpot dpotVar = chxlVar.e;
            if (dpotVar == null) {
                dpotVar = dpot.m;
            }
            if (!dpotVar.equals(baadVar.p())) {
                dsqp dsqpVar = (dsqp) chxlVar.cu(5);
                dsqpVar.bC(chxlVar);
                chvz chvzVar = (chvz) dsqpVar;
                dpot p = baadVar.p();
                if (chvzVar.c) {
                    chvzVar.bF();
                    chvzVar.c = false;
                }
                chxl chxlVar2 = (chxl) chvzVar.b;
                p.getClass();
                chxlVar2.e = p;
                chxlVar2.a |= 8;
                chxl bK = chvzVar.bK();
                if (!baadVar.x() && !chtk.c(chxlVar) && chtk.c(bK) && !dcbg.b(chxlVar.u).p(chpl.a)) {
                    dbsk.s(baadVar);
                    String m = baadVar.m();
                    if (m != null) {
                        chxi bZ = chxk.g.bZ();
                        chwo bZ2 = chwp.c.bZ();
                        dpvb bZ3 = dpvc.c.bZ();
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dpvc dpvcVar = (dpvc) bZ3.b;
                        m.getClass();
                        dpvcVar.a |= 1;
                        dpvcVar.b = m;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        chwp chwpVar = (chwp) bZ2.b;
                        dpvc bK2 = bZ3.bK();
                        bK2.getClass();
                        chwpVar.b = bK2;
                        chwpVar.a |= 1;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        chxk chxkVar = (chxk) bZ.b;
                        chwp bK3 = bZ2.bK();
                        bK3.getClass();
                        chxkVar.c = bK3;
                        chxkVar.b = 7;
                        dsqp dsqpVar2 = (dsqp) bK.cu(5);
                        dsqpVar2.bC(bK);
                        chvz chvzVar2 = (chvz) dsqpVar2;
                        chvzVar2.d(bZ.bK());
                        bK = chvzVar2.bK();
                    }
                }
                axwi a2 = this.ac.a();
                dpot dpotVar2 = chxlVar.e;
                if (dpotVar2 == null) {
                    dpotVar2 = dpot.m;
                }
                baad c2 = a2.c(dpotVar2);
                this.k.put(b2, bK);
                af();
                return c2;
            }
        }
        return null;
    }

    @Override // defpackage.chrx
    public final void T(baad baadVar) {
        bvrj.UI_THREAD.c();
        this.ab.a().d(baadVar, this.g);
    }

    @Override // defpackage.chrx
    public final void U(baad baadVar) {
        bvrj.UI_THREAD.c();
        this.ab.a().o(baadVar, this.g);
    }

    @Override // defpackage.chrx
    public final void V(baal baalVar, bvqg<baal> bvqgVar) {
        bvrj.UI_THREAD.c();
        this.P.a(baalVar, bvqgVar);
        this.ab.a().b(this.g, baalVar);
    }

    @Override // defpackage.chrx
    public final void W(baad baadVar, bvqg<baad> bvqgVar) {
        bvrj.UI_THREAD.c();
        this.Q.a(baadVar, bvqgVar);
        this.ab.a().c(this.g, baadVar);
    }

    @Override // defpackage.chrx
    public final void X(baad baadVar) {
        this.Q.b(baadVar);
        S(baadVar);
    }

    @Override // defpackage.chrx
    public final void Y(int i) {
        chtb chtbVar = this.H;
        dbsk.a(i >= 0);
        Map<Integer, chum> map = chtbVar.a;
        Integer valueOf = Integer.valueOf(i);
        chum chumVar = map.get(valueOf);
        if (chumVar == null) {
            chul bZ = chum.p.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chum chumVar2 = (chum) bZ.b;
            int i2 = 1 | chumVar2.a;
            chumVar2.a = i2;
            chumVar2.b = i;
            chumVar2.a = i2 | 2048;
            chumVar2.m = false;
            chumVar = bZ.bK();
            chtbVar.a.put(valueOf, chumVar);
        }
        chtbVar.d = i;
        chtbVar.c.a(chumVar);
        boolean z = chumVar.m;
        af();
        if (!z) {
            f(aj(), chpm.a);
        }
    }

    @Override // defpackage.chrx
    public final void Z(baal baalVar) {
        baad b2 = baalVar.b();
        if (b2 == null) {
            baalVar.a();
            return;
        }
        this.P.b(baalVar);
        S(b2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r4.a() == null) goto L18;
     */
    @Override // defpackage.chrx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aa(defpackage.azrk r15) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chra.aa(azrk):void");
    }

    @Override // defpackage.chrx
    public final void ab(chxr chxrVar, dosk doskVar) {
        chwf chwfVar;
        bvrj.UI_THREAD.c();
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        chns chnsVar = this.E;
        chnsVar.l += chnsVar.f().c(dpwe.MODERATION_VOTE);
        chnsVar.g();
        chnsVar.h();
        bvam bvamVar = this.ak;
        dwju bZ = dwjv.e.bZ();
        bZ.a(doskVar);
        dnpr bZ2 = dnqf.c.bZ();
        dnps bZ3 = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.CREATOR_ZONE;
        int i = 0;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ3.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqf dnqfVar = (dnqf) bZ2.b;
        dnqe bK = bZ3.bK();
        bK.getClass();
        dnqfVar.b = bK;
        dnqfVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjv dwjvVar = (dwjv) bZ.b;
        dnqf bK2 = bZ2.bK();
        bK2.getClass();
        dwjvVar.c = bK2;
        dwjvVar.a |= 1;
        bvamVar.b(bZ.bK(), new chqm(), this.e);
        while (true) {
            if (i >= chxlVar.u.size()) {
                i = -1;
                break;
            }
            chxk chxkVar = chxlVar.u.get(i);
            if (chxj.a(chxkVar.b).equals(chxj.FACTUAL_MODERATION_TASK)) {
                if (chxkVar.b == 20) {
                    chwfVar = (chwf) chxkVar.c;
                } else {
                    chwfVar = chwf.c;
                }
                dnjp dnjpVar = chwfVar.b;
                if (dnjpVar == null) {
                    dnjpVar = dnjp.b;
                }
                dnvs dnvsVar = dnjpVar.a;
                if (dnvsVar == null) {
                    dnvsVar = dnvs.d;
                }
                if (dnvsVar.a.equals(doskVar.b)) {
                    break;
                }
            }
            i++;
        }
        if (i == -1) {
            return;
        }
        dsqp dsqpVar = (dsqp) chxlVar.cu(5);
        dsqpVar.bC(chxlVar);
        chvz chvzVar = (chvz) dsqpVar;
        chvzVar.e(i);
        this.k.put(chxrVar, chvzVar.bK());
        af();
    }

    @Override // defpackage.chrx
    public final void ae(chxr chxrVar, chxg chxgVar, String str) {
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        ccxa a2 = cclt.a(ak(chxlVar));
        chrk chrkVar = this.F;
        ccwj bZ = ccwk.m.bZ();
        dgfb b2 = dgfb.b(chxgVar.c);
        if (b2 == null) {
            b2 = dgfb.UNKNOWN_OFFERING_TYPE;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwk ccwkVar = (ccwk) bZ.b;
        ccwkVar.b = b2.f;
        int i = ccwkVar.a | 1;
        ccwkVar.a = i;
        a2.getClass();
        ccwkVar.c = a2;
        ccwkVar.a = i | 2;
        dwfl dwflVar = chxgVar.b;
        if (dwflVar == null) {
            dwflVar = dwfl.w;
        }
        String str2 = dwflVar.q;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwk ccwkVar2 = (ccwk) bZ.b;
        str2.getClass();
        dsrj<String> dsrjVar = ccwkVar2.e;
        if (!dsrjVar.a()) {
            ccwkVar2.e = dsqw.cl(dsrjVar);
        }
        ccwkVar2.e.add(str2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ccwk ccwkVar3 = (ccwk) bZ.b;
        ccwkVar3.k = 2;
        ccwkVar3.a |= 128;
        ccwk bK = bZ.bK();
        ccmb bZ2 = ccme.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ccme ccmeVar = (ccme) bZ2.b;
        ccmeVar.b = 2;
        ccmeVar.a |= 1;
        ccme ccmeVar2 = (ccme) bZ2.b;
        ccmeVar2.d = 8;
        int i2 = ccmeVar2.a | 4;
        ccmeVar2.a = i2;
        ccmeVar2.a = 8 | i2;
        ccmeVar2.e = false;
        ccme bK2 = bZ2.bK();
        chrkVar.o = new chpv(this, chxrVar, chxgVar);
        cclq a3 = chrkVar.e.a();
        dwfl dwflVar2 = chxgVar.b;
        if (dwflVar2 == null) {
            dwflVar2 = dwfl.w;
        }
        a3.f("", dwflVar2.h, bK, bK2, chrkVar.l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0179, code lost:
        if (r12.SI() != false) goto L144;
     */
    @Override // defpackage.chrx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void af() {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chra.af():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ag(chtq chtqVar, List<chxl> list, String str, String str2, @dzsi Integer num) {
        bvrj.UI_THREAD.c();
        chqz chqzVar = this.l.get(chtqVar);
        if (chqzVar == null) {
            chqzVar = new chqz();
            this.l.put(chtqVar, chqzVar);
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList<chxl> arrayList2 = new ArrayList(list.size());
        for (chxl chxlVar : list) {
            chxr chxrVar = chxlVar.b;
            if (chxrVar == null) {
                chxrVar = chxr.e;
            }
            if (!this.n.contains(chxrVar)) {
                ah(chxlVar);
                arrayList.add(chxrVar);
                if (!this.A.contains(chxrVar) && dcbg.b(chxlVar.u).p(chpw.a)) {
                    arrayList2.add(chxlVar);
                }
            } else if (num != null) {
                this.H.f(num.intValue());
            }
        }
        final bvqg bvqgVar = new bvqg(this) { // from class: chqa
            private final chra a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                boolean z;
                chra chraVar = this.a;
                for (Map.Entry entry : ((dcha) obj).L().entrySet()) {
                    chxl chxlVar2 = chraVar.k.get(entry.getKey());
                    if (chxlVar2 != null) {
                        chraVar.s.remove(entry.getKey());
                        ArrayList arrayList3 = new ArrayList(((Collection) entry.getValue()).size());
                        Iterator<E> it = dcbg.b((Iterable) entry.getValue()).x(6).iterator();
                        int i = 0;
                        while (true) {
                            z = true;
                            if (!it.hasNext()) {
                                break;
                            }
                            chwj chwjVar = (chwj) it.next();
                            dsqp dsqpVar = (dsqp) chwjVar.cu(5);
                            dsqpVar.bC(chwjVar);
                            chwi chwiVar = (chwi) dsqpVar;
                            if (chwiVar.c) {
                                chwiVar.bF();
                                chwiVar.c = false;
                            }
                            chwj chwjVar2 = (chwj) chwiVar.b;
                            chwj chwjVar3 = chwj.d;
                            chwjVar2.a |= 2;
                            chwjVar2.c = i;
                            arrayList3.add(chwiVar.bK());
                            i++;
                        }
                        HashMap<chxr, chxl> hashMap = chraVar.k;
                        chxr chxrVar2 = (chxr) entry.getKey();
                        dsqp dsqpVar2 = (dsqp) chxlVar2.cu(5);
                        dsqpVar2.bC(chxlVar2);
                        chvz chvzVar = (chvz) dsqpVar2;
                        chvzVar.a(arrayList3);
                        chxp chxpVar = chxlVar2.i;
                        if (chxpVar == null) {
                            chxpVar = chxp.k;
                        }
                        dsqp dsqpVar3 = (dsqp) chxpVar.cu(5);
                        dsqpVar3.bC(chxpVar);
                        chxm chxmVar = (chxm) dsqpVar3;
                        if (arrayList3.size() != 1) {
                            z = false;
                        }
                        if (chxmVar.c) {
                            chxmVar.bF();
                            chxmVar.c = false;
                        }
                        chxp chxpVar2 = (chxp) chxmVar.b;
                        chxpVar2.a |= 16;
                        chxpVar2.h = z;
                        if (chvzVar.c) {
                            chvzVar.bF();
                            chvzVar.c = false;
                        }
                        chxl chxlVar3 = (chxl) chvzVar.b;
                        chxp bK = chxmVar.bK();
                        bK.getClass();
                        chxlVar3.i = bK;
                        chxlVar3.a |= 64;
                        hashMap.put(chxrVar2, chvzVar.bK());
                    }
                }
                chraVar.af();
            }
        };
        bztn g = this.W.g();
        ArrayList arrayList3 = new ArrayList();
        final dcpc a2 = dcpc.a();
        for (chxl chxlVar2 : arrayList2) {
            chxr chxrVar2 = chxlVar2.b;
            if (chxrVar2 == null) {
                chxrVar2 = chxr.e;
            }
            for (dosf dosfVar : chxlVar2.g) {
                int i = dosfVar.a;
                if ((i & 1) != 0 && (i & 2) != 0) {
                    eapd eapdVar = new eapd(dosfVar.b);
                    eapd eapdVar2 = new eapd(dosfVar.c);
                    a2.b(dclz.g(eapdVar, eapdVar2), chxrVar2);
                    arrayList3.add(g.c(new eape(eapdVar, eapdVar2)));
                    chqzVar = chqzVar;
                }
            }
            this.A.add(chxrVar2);
        }
        chqz chqzVar2 = chqzVar;
        if (!arrayList3.isEmpty()) {
            arrayList3.size();
            bztm e = g.e(g.j(), g.h(), g.d(arrayList3));
            if (this.J.a().r()) {
                e = g.e(e, g.f(), new bztm[0]);
            }
            final dehn<List<bztl>> c2 = this.W.c(e);
            c2.Pk(new Runnable(c2, a2, bvqgVar) { // from class: chqb
                private final dehn a;
                private final dcpc b;
                private final bvqg c;

                {
                    this.a = c2;
                    this.b = a2;
                    this.c = bvqgVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dehn dehnVar = this.a;
                    dcpc dcpcVar = this.b;
                    bvqg bvqgVar2 = this.c;
                    deha.s(dehnVar);
                    dbyv N = dbyv.N();
                    Iterator<E> it = dcbg.b((Iterable) deha.s(dehnVar)).o(chqf.a).iterator();
                    while (it.hasNext()) {
                        bztl bztlVar = (bztl) it.next();
                        eaol b2 = bztlVar.b();
                        Map.Entry floorEntry = dcpcVar.a.floorEntry(dcak.j(b2));
                        Object obj = null;
                        Map.Entry entry = (floorEntry == null || !((dcpb) floorEntry.getValue()).a.a(b2)) ? null : (Map.Entry) floorEntry.getValue();
                        if (entry != null) {
                            obj = entry.getValue();
                        }
                        chxr chxrVar3 = (chxr) obj;
                        if (chxrVar3 == null) {
                            bztlVar.b();
                        } else {
                            chwi bZ = chwj.d.bZ();
                            String uri = bztlVar.a().toString();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            chwj chwjVar = (chwj) bZ.b;
                            uri.getClass();
                            chwjVar.a |= 1;
                            chwjVar.b = uri;
                            N.n(chxrVar3, bZ.bK());
                        }
                    }
                    bvqgVar2.NU(N);
                }
            }, this.e);
        }
        if (!this.r.d(chtqVar) || num == null) {
            if (!chqzVar2.b(arrayList, str, str2)) {
                return false;
            }
        } else {
            chtb chtbVar = this.H;
            chtbVar.e.a(num.intValue(), arrayList);
            if (!dbsj.d(str2)) {
                chtbVar.e.b = str2;
            }
        }
        af();
        return true;
    }

    public final void ah(chxl chxlVar) {
        chxr chxrVar = chxlVar.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        if ((chxlVar.a & 8) != 0) {
            for (chxk chxkVar : chxlVar.u) {
                dpvc d = chtk.d(chxkVar);
                if (d != null) {
                    String str = d.b;
                    if (!str.isEmpty() && this.O.contains(str)) {
                        chxlVar = ar(d, chxlVar);
                    }
                }
            }
        } else {
            int n = dcft.n(chxlVar.u, chpx.a);
            if (n >= 0) {
                chxk chxkVar2 = chxlVar.u.get(n);
                dsqp dsqpVar = (dsqp) chxlVar.cu(5);
                dsqpVar.bC(chxlVar);
                chvz chvzVar = (chvz) dsqpVar;
                dsqp dsqpVar2 = (dsqp) chxkVar2.cu(5);
                dsqpVar2.bC(chxkVar2);
                chxi chxiVar = (chxi) dsqpVar2;
                chxh ac = ac(chxkVar2.b == 5 ? (chxh) chxkVar2.c : chxh.b, this.o);
                if (chxiVar.c) {
                    chxiVar.bF();
                    chxiVar.c = false;
                }
                chxk chxkVar3 = (chxk) chxiVar.b;
                ac.getClass();
                chxkVar3.c = ac;
                chxkVar3.b = 5;
                if (chvzVar.c) {
                    chvzVar.bF();
                    chvzVar.c = false;
                }
                chxl chxlVar2 = (chxl) chvzVar.b;
                chxk bK = chxiVar.bK();
                bK.getClass();
                chxlVar2.c();
                chxlVar2.u.set(n, bK);
                chxlVar = chvzVar.bK();
            }
        }
        chxl chxlVar3 = this.k.get(chxrVar);
        boolean z = true;
        if (chxlVar3 != null) {
            dsqp dsqpVar3 = (dsqp) chxlVar.cu(5);
            dsqpVar3.bC(chxlVar);
            chvz chvzVar2 = (chvz) dsqpVar3;
            chxp chxpVar = chxlVar3.i;
            if (chxpVar == null) {
                chxpVar = chxp.k;
            }
            if (chvzVar2.c) {
                chvzVar2.bF();
                chvzVar2.c = false;
            }
            chxl chxlVar4 = (chxl) chvzVar2.b;
            chxpVar.getClass();
            chxlVar4.i = chxpVar;
            chxlVar4.a |= 64;
            chxr chxrVar2 = chxlVar3.b;
            if (chxrVar2 == null) {
                chxrVar2 = chxr.e;
            }
            chxr chxrVar3 = ((chxl) chvzVar2.b).b;
            if (chxrVar3 == null) {
                chxrVar3 = chxr.e;
            }
            dbsk.a(chxrVar2.equals(chxrVar3));
            dbsk.a(chxlVar3.w == ((chxl) chvzVar2.b).w);
            dbsk.a(chxlVar3.v == ((chxl) chvzVar2.b).v);
            if (chvzVar2.c) {
                chvzVar2.bF();
                chvzVar2.c = false;
            }
            ((chxl) chvzVar2.b).r = chxl.ck();
            chvzVar2.a(chxlVar3.r);
            for (final chxk chxkVar4 : chxlVar3.u) {
                if (chsp.f(chxkVar4) && !dcbg.b(Collections.unmodifiableList(((chxl) chvzVar2.b).u)).p(new dbsl(chxkVar4) { // from class: chsl
                    private final chxk a;

                    {
                        this.a = chxkVar4;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        chwf chwfVar;
                        chwf chwfVar2;
                        chxk chxkVar5 = this.a;
                        chxk chxkVar6 = (chxk) obj;
                        if (!chsp.f(chxkVar5) || !chsp.f(chxkVar6)) {
                            return false;
                        }
                        if (chxkVar5.b == 20) {
                            chwfVar = (chwf) chxkVar5.c;
                        } else {
                            chwfVar = chwf.c;
                        }
                        dnjp dnjpVar = chwfVar.b;
                        if (dnjpVar == null) {
                            dnjpVar = dnjp.b;
                        }
                        dnvs dnvsVar = dnjpVar.a;
                        if (dnvsVar == null) {
                            dnvsVar = dnvs.d;
                        }
                        dqgh b2 = dqgh.b(dnvsVar.b.get(0).b);
                        if (b2 == null) {
                            b2 = dqgh.UNDEFINED;
                        }
                        if (chxkVar6.b == 20) {
                            chwfVar2 = (chwf) chxkVar6.c;
                        } else {
                            chwfVar2 = chwf.c;
                        }
                        dnjp dnjpVar2 = chwfVar2.b;
                        if (dnjpVar2 == null) {
                            dnjpVar2 = dnjp.b;
                        }
                        dnvs dnvsVar2 = dnjpVar2.a;
                        if (dnvsVar2 == null) {
                            dnvsVar2 = dnvs.d;
                        }
                        dqgh b3 = dqgh.b(dnvsVar2.b.get(0).b);
                        if (b3 == null) {
                            b3 = dqgh.UNDEFINED;
                        }
                        return b2.equals(b3);
                    }
                })) {
                    chvzVar2.d(chxkVar4);
                }
            }
            dwlh dwlhVar = ((chxl) chvzVar2.b).d;
            if (dwlhVar == null) {
                dwlhVar = dwlh.n;
            }
            dsqp dsqpVar4 = (dsqp) dwlhVar.cu(5);
            dsqpVar4.bC(dwlhVar);
            dwlc dwlcVar = (dwlc) dsqpVar4;
            dwlh dwlhVar2 = chxlVar3.d;
            if (dwlhVar2 == null) {
                dwlhVar2 = dwlh.n;
            }
            if ((dwlhVar2.a & 512) != 0) {
                dwlh dwlhVar3 = ((chxl) chvzVar2.b).d;
                if (dwlhVar3 == null) {
                    dwlhVar3 = dwlh.n;
                }
                if ((dwlhVar3.a & 512) == 0) {
                    dwlh dwlhVar4 = chxlVar3.d;
                    if (dwlhVar4 == null) {
                        dwlhVar4 = dwlh.n;
                    }
                    dwlg dwlgVar = dwlhVar4.l;
                    if (dwlgVar == null) {
                        dwlgVar = dwlg.c;
                    }
                    if (dwlcVar.c) {
                        dwlcVar.bF();
                        dwlcVar.c = false;
                    }
                    dwlh dwlhVar5 = (dwlh) dwlcVar.b;
                    dwlgVar.getClass();
                    dwlhVar5.l = dwlgVar;
                    dwlhVar5.a |= 512;
                }
            }
            dwlh dwlhVar6 = chxlVar3.d;
            if (dwlhVar6 == null) {
                dwlhVar6 = dwlh.n;
            }
            if ((dwlhVar6.a & 1024) != 0) {
                dwlh dwlhVar7 = ((chxl) chvzVar2.b).d;
                if (dwlhVar7 == null) {
                    dwlhVar7 = dwlh.n;
                }
                if ((dwlhVar7.a & 1024) == 0) {
                    dwlh dwlhVar8 = chxlVar3.d;
                    if (dwlhVar8 == null) {
                        dwlhVar8 = dwlh.n;
                    }
                    String str2 = dwlhVar8.m;
                    if (dwlcVar.c) {
                        dwlcVar.bF();
                        dwlcVar.c = false;
                    }
                    dwlh dwlhVar9 = (dwlh) dwlcVar.b;
                    str2.getClass();
                    dwlhVar9.a |= 1024;
                    dwlhVar9.m = str2;
                }
            }
            if (chvzVar2.c) {
                chvzVar2.bF();
                chvzVar2.c = false;
            }
            chxl chxlVar5 = (chxl) chvzVar2.b;
            dwlh bK2 = dwlcVar.bK();
            bK2.getClass();
            chxlVar5.d = bK2;
            chxlVar5.a |= 4;
            chxlVar = chvzVar2.bK();
        }
        if ((chxlVar.a & 8) != 0) {
            dsqp dsqpVar5 = (dsqp) chxlVar.cu(5);
            dsqpVar5.bC(chxlVar);
            chvz chvzVar3 = (chvz) dsqpVar5;
            chxp chxpVar2 = chxlVar.i;
            if (chxpVar2 == null) {
                chxpVar2 = chxp.k;
            }
            dsqp dsqpVar6 = (dsqp) chxpVar2.cu(5);
            dsqpVar6.bC(chxpVar2);
            chxm chxmVar = (chxm) dsqpVar6;
            dcep B = dcbg.b(chxlVar.u).s(chpy.a).B();
            if (B.size() <= 1 || dcbg.b(B).q(chpz.a)) {
                z = false;
            }
            if (chxmVar.c) {
                chxmVar.bF();
                chxmVar.c = false;
            }
            chxp chxpVar3 = (chxp) chxmVar.b;
            chxpVar3.a |= 64;
            chxpVar3.j = z;
            if (chvzVar3.c) {
                chvzVar3.bF();
                chvzVar3.c = false;
            }
            chxl chxlVar6 = (chxl) chvzVar3.b;
            chxp bK3 = chxmVar.bK();
            bK3.getClass();
            chxlVar6.i = bK3;
            chxlVar6.a |= 64;
            chxlVar = chvzVar3.bK();
        }
        this.k.put(chxrVar, chxlVar);
    }

    public final chtq aj() {
        chtq l = this.R.a.l();
        dbsk.s(l);
        return l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ilo ak(chxl chxlVar) {
        dqwy dqwyVar;
        dwlh dwlhVar = chxlVar.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dniu dniuVar = dwlhVar.b;
        if (dniuVar == null) {
            dniuVar = dniu.i;
        }
        String str = dniuVar.b;
        ily ilyVar = new ily();
        ilyVar.k(str);
        dniu dniuVar2 = dwlhVar.b;
        if (dniuVar2 == null) {
            dniuVar2 = dniu.i;
        }
        ilyVar.p(dniuVar2.f);
        ilyVar.F(dwlhVar.c);
        for (dwle dwleVar : dwlhVar.g) {
            if (!dwleVar.c.isEmpty()) {
                ilyVar.e(dwleVar.c);
            }
        }
        if (this.f.getEnableFeatureParameters().aB) {
            dpum dpumVar = dwlhVar.d;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            ilyVar.q(akqq.f(dpumVar));
        }
        ilyVar.H(dwlhVar.j);
        if ((chxlVar.a & 2048) != 0) {
            doch bZ = docm.i.bZ();
            String str2 = chxlVar.n;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            docm docmVar = (docm) bZ.b;
            str2.getClass();
            docmVar.a |= 8;
            docmVar.e = str2;
            ilyVar.B(bZ.bK());
        }
        int i = chxlVar.a;
        int i2 = i & 16384;
        if (i2 != 0 || (i & 8192) != 0) {
            if (i2 != 0) {
                dqwyVar = chxlVar.t;
                if (dqwyVar == null) {
                    dqwyVar = dqwy.c;
                }
            } else {
                dqwyVar = chxlVar.s;
                if (dqwyVar == null) {
                    dqwyVar = dqwy.c;
                }
            }
            docc bZ2 = docg.M.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            docg docgVar = (docg) bZ2.b;
            dqwyVar.getClass();
            docgVar.G = dqwyVar;
            docgVar.a |= 67108864;
            ilyVar.u(bZ2.bK());
        } else if (this.q.containsKey(str)) {
            ilyVar.u(this.q.get(str));
        }
        if ((chxlVar.a & 256) != 0 && chxlVar.k != 0) {
            docc bZ3 = docg.M.bZ();
            int i3 = chxlVar.k;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            docg docgVar2 = (docg) bZ3.b;
            docgVar2.a |= 512;
            docgVar2.q = i3;
            ilyVar.v(bZ3.bK());
        }
        ilyVar.q = dwlhVar.k;
        return ilyVar.d();
    }

    public final void al() {
        cctr cctrVar = this.M;
        if (cctrVar != null) {
            cctrVar.f();
            this.M = null;
        }
    }

    @Override // defpackage.chrx
    public final void am(dcdc<dwfl> dcdcVar) {
        this.Z.a().o(new ckne(dcdcVar), 0, bbty.v().a(), null);
    }

    @Override // defpackage.chrx
    public final void an() {
    }

    @Override // defpackage.chrx
    public final void ao(chxr chxrVar, dpvc dpvcVar, int i) {
        chxl chxlVar;
        bvrj.UI_THREAD.c();
        String str = dpvcVar.b;
        if (!str.isEmpty() && (chxlVar = this.k.get(chxrVar)) != null) {
            this.O.add(dpvcVar.b);
            HashMap<chxr, chxl> hashMap = this.k;
            chxr chxrVar2 = chxlVar.b;
            if (chxrVar2 == null) {
                chxrVar2 = chxr.e;
            }
            hashMap.put(chxrVar2, ar(dpvcVar, chxlVar));
            ay(str, chxrVar.b == 3 ? (String) chxrVar.c : "", 6);
            af();
        }
    }

    @Override // defpackage.chof
    public final void b(chuu chuuVar) {
        chtq h;
        chuc chucVar;
        dbsg<dpyv> dbsgVar;
        bvrj.UI_THREAD.c();
        if (!this.T) {
            btrm btrmVar = this.h;
            dceq a2 = dcet.a();
            a2.b(bqje.class, new chrc(0, bqje.class, this, bvrj.UI_THREAD));
            a2.b(azrc.class, new chrc(1, azrc.class, this, bvrj.UI_THREAD));
            a2.b(azrb.class, new chrc(2, azrb.class, this, bvrj.UI_THREAD));
            btrmVar.g(this, a2.a());
            this.T = true;
        }
        try {
            if ((chuuVar.a & 2) != 0) {
                dpyv b2 = dpyv.b(chuuVar.b);
                if (b2 == null) {
                    b2 = dpyv.UNKNOWN_NOTIFICATION_ID;
                }
                dbsgVar = dbsg.i(b2);
            } else {
                dbsgVar = dbpy.a;
            }
            this.y = dbsgVar;
        } catch (IllegalArgumentException e) {
            bvoo.i(e);
        }
        dwyd b3 = dwyd.b(chuuVar.c);
        if (b3 == null) {
            b3 = dwyd.UNKNOWN_ENTRY_POINT;
        }
        if (!b3.equals(dwyd.UNKNOWN_ENTRY_POINT)) {
            this.z = b3;
        } else {
            this.z = this.y.f() == dpyv.TODO_PHOTO ? dwyd.PUBLISH_PRIVATE_PHOTO_NOTIFICATION : dwyd.PUBLISH_PRIVATE_PHOTO;
        }
        for (chxl chxlVar : chuuVar.h) {
            HashMap<chxr, chxl> hashMap = this.k;
            chxr chxrVar = chxlVar.b;
            if (chxrVar == null) {
                chxrVar = chxr.e;
            }
            hashMap.put(chxrVar, chxlVar);
        }
        for (chuj chujVar : chuuVar.g) {
            chqz chqzVar = new chqz();
            dbsk.l(chqzVar.b(chujVar.c, "", chujVar.d));
            HashMap<chtq, chqz> hashMap2 = this.l;
            drrx b4 = drrx.b(chujVar.b);
            if (b4 == null) {
                b4 = drrx.UNKNOWN_MODE;
            }
            hashMap2.put(ap(b4), chqzVar);
        }
        if (this.r.c()) {
            chut chutVar = chuuVar.k;
            if (chutVar == null) {
                chutVar = chut.e;
            }
            if (!chutVar.b.isEmpty()) {
                chtb chtbVar = this.H;
                chut chutVar2 = chuuVar.k;
                if (chutVar2 == null) {
                    chutVar2 = chut.e;
                }
                dsrj<chum> dsrjVar = chutVar2.b;
                chus chusVar = chutVar2.c;
                if (chusVar == null) {
                    chusVar = chus.e;
                }
                chtbVar.a.clear();
                for (chum chumVar : dsrjVar) {
                    chtbVar.a.put(Integer.valueOf(chumVar.b), chumVar);
                }
                chta chtaVar = chtbVar.e;
                chtaVar.a.clear();
                chtaVar.c.clear();
                for (chur churVar : chusVar.b) {
                    chtaVar.a(churVar.b, churVar.c);
                }
                chtaVar.b = chusVar.c;
                int i = chusVar.d;
                chtbVar.d = i;
                chum chumVar2 = chtbVar.a.get(Integer.valueOf(i));
                if (chumVar2 != null) {
                    chtbVar.c.a(chumVar2);
                }
                chtbVar.b.clear();
                for (chuo chuoVar : chutVar2.d) {
                    Map<chxr, Integer> map = chtbVar.b;
                    chxr chxrVar2 = chuoVar.b;
                    if (chxrVar2 == null) {
                        chxrVar2 = chxr.e;
                    }
                    map.put(chxrVar2, Integer.valueOf(chuoVar.c));
                }
            }
        }
        this.x = dcdc.r(chuuVar.e);
        this.S = (chuuVar.a & 16) != 0 ? chuuVar.f.G() : null;
        if ((chuuVar.a & 8) != 0) {
            drrx b5 = drrx.b(chuuVar.d);
            if (b5 == null) {
                b5 = drrx.UNKNOWN_MODE;
            }
            h = ap(b5);
        } else {
            h = h();
        }
        chtq chtqVar = h;
        crzo<chtq> crzoVar = new crzo<>(chtqVar);
        this.R = crzoVar;
        crzoVar.a.a(this, this.e);
        this.t = new crzo<>(chtp.f(chtqVar, dcdc.e(), dcdc.e(), false, false, this.J.a().B()));
        af();
        chns chnsVar = this.E;
        if ((chuuVar.a & 32) != 0) {
            chucVar = chuuVar.i;
            if (chucVar == null) {
                chucVar = chuc.f;
            }
        } else {
            chucVar = (chuc) dbsg.j(this.j.a).c(chuc.f);
        }
        dpoj dpojVar = chucVar.c;
        if (dpojVar == null) {
            dpojVar = dpoj.e;
        }
        if (dpojVar.equals(chnr.a()) && chucVar.d.equals(chnsVar.d.j())) {
            chnsVar.l = chucVar.b;
            if ((chucVar.a & 8) != 0) {
                dpoj dpojVar2 = chucVar.e;
                if (dpojVar2 == null) {
                    dpojVar2 = dpoj.e;
                }
                chnsVar.o = dbsg.i(dpojVar2);
            }
        }
        chnsVar.q.b(dwtm.l, new chnp(chnsVar), chnsVar.c);
        if (this.r.a()) {
            chrm chrmVar = this.G;
            chuh chuhVar = chuuVar.j;
            if (chuhVar == null) {
                chuhVar = chuh.e;
            }
            for (chug chugVar : chuhVar.b) {
                ((chru) chrmVar).b.put(chugVar.b, chugVar);
            }
            ((chru) chrmVar).c.a(chuhVar);
        }
    }

    @Override // defpackage.chof
    public final crzm<chtq> c() {
        return this.R.a;
    }

    @Override // defpackage.chof
    public final crzm<chtu> d() {
        return this.E.a.a;
    }

    @Override // defpackage.chrx
    public final void e(chtq chtqVar) {
        if (!(this.r.d(chtqVar) ? this.U : this.l.containsKey(chtqVar))) {
            f(chtqVar, chpn.a);
        }
    }

    @Override // defpackage.chrx
    public final void f(final chtq chtqVar, final Runnable runnable) {
        chqz chqzVar;
        final String str;
        dehn<?> dehnVar = this.ah.get(chtqVar);
        if (dehnVar == null || dehnVar.isDone()) {
            if (this.l.containsKey(chtqVar)) {
                chqzVar = this.l.get(chtqVar);
                if (chqzVar.d()) {
                    return;
                }
            } else {
                chqzVar = new chqz();
                this.l.put(chtqVar, chqzVar);
            }
            chqz chqzVar2 = chqzVar;
            if (this.r.d(chtqVar)) {
                this.U = true;
            }
            if (this.r.d(chtqVar)) {
                str = this.H.d();
            } else {
                str = chqzVar2.c;
            }
            if (chtqVar.j() != null) {
                if (chtqVar.a().equals(drrx.LIST)) {
                    baju a2 = this.ad.a();
                    deha.q(a2.b.j(), new bajt(a2, new bvqg(this, chtqVar, str, runnable) { // from class: chqh
                        private final chra a;
                        private final chtq b;
                        private final String c;
                        private final Runnable d;

                        {
                            this.a = this;
                            this.b = chtqVar;
                            this.c = str;
                            this.d = runnable;
                        }

                        @Override // defpackage.bvqg
                        public final void NU(Object obj) {
                            Boolean bool = (Boolean) obj;
                            this.a.g(this.b, this.c, this.d);
                        }
                    }), dege.a);
                    return;
                }
                g(chtqVar, str, runnable);
            } else if (!chtqVar.k()) {
            } else {
                String str2 = chqzVar2.c;
                chsh chshVar = this.V;
                btlu btluVar = this.L;
                byte[] bArr = this.S;
                dehn<btzx<dwnd, dwnf>> a3 = chshVar.e.a(chsa.d(btluVar, str2, bArr));
                if (a3 != null) {
                    chshVar.e.e();
                } else {
                    a3 = chshVar.b(str2, bArr);
                }
                this.ah.put(chtqVar, a3);
                deha.q(a3, new chqo(this, chtqVar, str2, runnable, chqzVar2), this.e);
            }
        }
    }

    public final void g(chtq chtqVar, @dzsi String str, @dzsi Runnable runnable) {
        boolean d = this.r.d(chtqVar);
        Integer valueOf = d ? Integer.valueOf(this.H.d) : null;
        chsh chshVar = this.V;
        btlu btluVar = this.L;
        dbsg<dpyv> dbsgVar = this.y;
        dcdc<drrv> dcdcVar = this.x;
        dehn<btzx<dwmp, dwmt>> a2 = chshVar.d.a(chsq.f(btluVar, chtqVar, str, dbsgVar, dcdcVar));
        if (a2 != null) {
            chshVar.d.e();
        } else {
            a2 = chshVar.a(btluVar, chtqVar, str, dbsgVar, dcdcVar, valueOf);
        }
        this.ah.put(chtqVar, a2);
        deha.q(a2, new chqn(this, chtqVar, d, str, runnable), this.e);
    }

    public final chtq h() {
        if (this.r.c()) {
            chtb chtbVar = this.H;
            if (!chtbVar.g.c()) {
                throw new IllegalStateException("weekly todolist is not enabled");
            }
            dhpt dhptVar = chtbVar.f.getContributionsPageParameters().h;
            if (dhptVar == null) {
                dhptVar = dhpt.w;
            }
            dcep B = dcbg.b(dhptVar.q).s(chsv.a).o(dbss.NOT_NULL).B();
            dcen N = dcep.N();
            if (B.contains(dhps.RATING_TASK)) {
                N.b(chxj.RATING);
            }
            if (B.contains(dhps.REVIEW_TASK)) {
                N.b(chxj.REVIEW);
            }
            return new chtm(drrx.UNKNOWN_MODE, N.f(), true);
        }
        return chtq.d();
    }

    @Override // defpackage.chrx
    public final void i(chtq chtqVar) {
        if (chtqVar.equals(aj())) {
            return;
        }
        this.R.a(chtqVar);
        this.s.clear();
        af();
    }

    @Override // defpackage.chrx
    public final void j(chxl chxlVar) {
        bvrj.UI_THREAD.c();
        ArrayList arrayList = new ArrayList(aj().o());
        if (!aj().equals(chtq.h())) {
            boolean z = true;
            if (chxlVar.j <= 0 && chxlVar.k <= 0 && chxlVar.o.size() <= 0) {
                z = false;
            }
            boolean a2 = dcbg.b(chxlVar.u).r(chqk.a).a();
            boolean b2 = chtk.b(chxlVar);
            if (!chxlVar.h || z || a2 || b2) {
                arrayList.remove(chvd.CHANGE_PLACE);
                arrayList.remove(chvd.REMOVE_FROM_TIMELINE);
            }
        }
        chrk chrkVar = this.F;
        chxr chxrVar = chxlVar.b;
        if (chxrVar == null) {
            chxrVar = chxr.e;
        }
        String str = chxlVar.c;
        dwlh dwlhVar = chxlVar.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        ciwj.aP(chxrVar, str, dwlhVar, arrayList).aJ(chrkVar.m, chrkVar.l);
    }

    @Override // defpackage.chrx
    public final void k(chxl chxlVar) {
        aq(chxlVar, jjn.EXPANDED);
    }

    @Override // defpackage.chrx
    public final void l(chxl chxlVar) {
        aq(chxlVar, jjn.COLLAPSED);
    }

    public final void m(ilo iloVar, @dzsi bege begeVar, jjn jjnVar, boolean z) {
        begj begjVar = new begj();
        begjVar.b(iloVar);
        begjVar.c = jjnVar;
        begjVar.e = begeVar;
        begjVar.n = true;
        begjVar.A = z;
        this.aa.a().n(begjVar, false, null);
    }

    @Override // defpackage.chrx
    public final void n(chxr chxrVar, bvqg<cdhl> bvqgVar) {
        bvrj.UI_THREAD.c();
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        chrk chrkVar = this.F;
        dwlh dwlhVar = chxlVar.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dpum dpumVar = dwlhVar.d;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        akqq f = akqq.f(dpumVar);
        chrkVar.n = bvqgVar;
        chrkVar.l.aZ(cdhp.g(f, dbpy.a));
    }

    @Override // defpackage.chrx
    public final void o() {
        bvrj.UI_THREAD.c();
        chrk chrkVar = this.F;
        chtu l = d().l();
        dbsk.s(l);
        if (chrkVar.m.H(chrk.b) != null) {
            return;
        }
        ciwk ciwkVar = new ciwk();
        Bundle bundle = new Bundle();
        bvrs.l(bundle, l);
        ciwkVar.B(bundle);
        ciwkVar.e(chrkVar.m, chrk.b);
    }

    @Override // defpackage.chrx
    public final void p(dspd dspdVar) {
        this.F.f.a().e(dspdVar, cgem.CONTRIBUTIONS_PAGE);
    }

    @Override // defpackage.chrx
    public final void q() {
        this.F.i.a().a();
    }

    @Override // defpackage.chrx
    public final void r(chxl chxlVar, djao djaoVar, boolean z) {
        this.F.a(bwrs.a(ak(chxlVar)), djaoVar, z);
    }

    @Override // defpackage.chrx
    public final void s(cbtz cbtzVar) {
        chwt chwtVar;
        chwt chwtVar2;
        chxr a2 = chsp.a(cbtzVar.b, dbpy.a);
        chxl chxlVar = this.k.get(a2);
        dbsk.s(chxlVar);
        dbsg r = dcbg.b(chxlVar.u).r(choh.a);
        if (!r.a()) {
            return;
        }
        chxk chxkVar = (chxk) r.b();
        final dcep B = dcbg.b(cbtzVar.c).B();
        if (chxkVar.b == 16) {
            chwtVar = (chwt) chxkVar.c;
        } else {
            chwtVar = chwt.c;
        }
        dqgp dqgpVar = chwtVar.b;
        if (dqgpVar == null) {
            dqgpVar = dqgp.b;
        }
        dcdc z = dcbg.b(dqgpVar.a).s(new dbrn(B) { // from class: choi
            private final dcep a;

            {
                this.a = B;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final dcep dcepVar = this.a;
                dqgo dqgoVar = (dqgo) obj;
                dcqe dcqeVar = chra.a;
                dcdc z2 = dcbg.b(dqgoVar.a).o(new dbsl(dcepVar) { // from class: choj
                    private final dcep a;

                    {
                        this.a = dcepVar;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj2) {
                        dcep dcepVar2 = this.a;
                        dcqe dcqeVar2 = chra.a;
                        docg docgVar = ((dqgm) obj2).b;
                        if (docgVar == null) {
                            docgVar = docg.M;
                        }
                        return !dcepVar2.contains(docgVar.i);
                    }
                }).z();
                dsqp dsqpVar = (dsqp) dqgoVar.cu(5);
                dsqpVar.bC(dqgoVar);
                dqgn dqgnVar = (dqgn) dsqpVar;
                if (dqgnVar.c) {
                    dqgnVar.bF();
                    dqgnVar.c = false;
                }
                ((dqgo) dqgnVar.b).a = dqgo.ck();
                if (dqgnVar.c) {
                    dqgnVar.bF();
                    dqgnVar.c = false;
                }
                dqgo dqgoVar2 = (dqgo) dqgnVar.b;
                dsrj<dqgm> dsrjVar = dqgoVar2.a;
                if (!dsrjVar.a()) {
                    dqgoVar2.a = dsqw.cl(dsrjVar);
                }
                dsod.bv(z2, dqgoVar2.a);
                return dqgnVar.bK();
            }
        }).z();
        dsqp dsqpVar = (dsqp) dqgpVar.cu(5);
        dsqpVar.bC(dqgpVar);
        dqgk dqgkVar = (dqgk) dsqpVar;
        if (dqgkVar.c) {
            dqgkVar.bF();
            dqgkVar.c = false;
        }
        ((dqgp) dqgkVar.b).a = dqgp.ck();
        if (dqgkVar.c) {
            dqgkVar.bF();
            dqgkVar.c = false;
        }
        dqgp dqgpVar2 = (dqgp) dqgkVar.b;
        dsrj<dqgo> dsrjVar = dqgpVar2.a;
        if (!dsrjVar.a()) {
            dqgpVar2.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(z, dqgpVar2.a);
        dqgp bK = dqgkVar.bK();
        dsqp dsqpVar2 = (dsqp) chxkVar.cu(5);
        dsqpVar2.bC(chxkVar);
        chxi chxiVar = (chxi) dsqpVar2;
        if (chxkVar.b == 16) {
            chwtVar2 = (chwt) chxkVar.c;
        } else {
            chwtVar2 = chwt.c;
        }
        dsqp dsqpVar3 = (dsqp) chwtVar2.cu(5);
        dsqpVar3.bC(chwtVar2);
        chws chwsVar = (chws) dsqpVar3;
        if (chwsVar.c) {
            chwsVar.bF();
            chwsVar.c = false;
        }
        chwt chwtVar3 = (chwt) chwsVar.b;
        bK.getClass();
        chwtVar3.b = bK;
        chwtVar3.a |= 1;
        if (chxiVar.c) {
            chxiVar.bF();
            chxiVar.c = false;
        }
        chxk chxkVar2 = (chxk) chxiVar.b;
        chwt bK2 = chwsVar.bK();
        bK2.getClass();
        chxkVar2.c = bK2;
        chxkVar2.b = 16;
        int indexOf = chxlVar.u.indexOf(chxkVar);
        dsqp dsqpVar4 = (dsqp) chxlVar.cu(5);
        dsqpVar4.bC(chxlVar);
        chvz chvzVar = (chvz) dsqpVar4;
        chvzVar.f(indexOf, chxiVar.bK());
        this.k.put(a2, chvzVar.bK());
        af();
        chxj chxjVar = chxj.RATING;
        int a3 = cbuh.a(cbtzVar.d);
        if (a3 == 0) {
            return;
        }
        if (a3 == 2) {
            I(a2, cbtzVar.e);
        } else if (a3 != 3) {
        } else {
            H(a2);
        }
    }

    @Override // defpackage.chrx
    public final void t(chxr chxrVar, blpo blpoVar) {
        chwl chwlVar;
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        dbsg r = dcbg.b(chxlVar.u).r(chok.a);
        if (!r.a()) {
            return;
        }
        chxk chxkVar = (chxk) r.b();
        if (blpoVar != blpo.YES) {
            dsqp dsqpVar = (dsqp) chxlVar.cu(5);
            dsqpVar.bC(chxlVar);
            chvz chvzVar = (chvz) dsqpVar;
            if (chvzVar.c) {
                chvzVar.bF();
                chvzVar.c = false;
            }
            ((chxl) chvzVar.b).u = chxl.ck();
            this.k.put(chxrVar, chvzVar.bK());
        } else {
            int indexOf = chxlVar.u.indexOf(chxkVar);
            dsqp dsqpVar2 = (dsqp) chxlVar.cu(5);
            dsqpVar2.bC(chxlVar);
            chvz chvzVar2 = (chvz) dsqpVar2;
            chvzVar2.e(indexOf);
            this.k.put(chxrVar, chvzVar2.bK());
        }
        chns chnsVar = this.E;
        chnsVar.l += chnsVar.f().c(dpwe.QUESTION);
        chnsVar.g();
        chnsVar.h();
        chrk chrkVar = this.F;
        blvs d = blvu.d();
        if (chxkVar.b == 17) {
            chwlVar = (chwl) chxkVar.c;
        } else {
            chwlVar = chwl.c;
        }
        d.a = chwlVar.b;
        d.n = chxkVar.e;
        chrkVar.h.a().m(d.a(), blpoVar, blpk.TODO_LIST_PLACE_REOPEN_TASK);
        af();
    }

    @Override // defpackage.chrx
    public final void u(chxl chxlVar) {
        bvrj.UI_THREAD.c();
        if ((chxlVar.a & 8) != 0) {
            axwo a2 = this.ab.a();
            dpot dpotVar = chxlVar.e;
            if (dpotVar == null) {
                dpotVar = dpot.m;
            }
            dpov dpovVar = dpotVar.b;
            if (dpovVar == null) {
                dpovVar = dpov.f;
            }
            a2.f(dpovVar.b);
        }
    }

    @Override // defpackage.chrx
    public final void w(String str) {
        this.F.g.a().e(str, cfpl.CONTRIBUTIONS_TAB_ENTRY_POINT_NONPREFETCH);
    }

    @Override // defpackage.chrx
    public final void x(chxr chxrVar) {
        chxh chxhVar;
        bvrj.UI_THREAD.c();
        chxl chxlVar = this.k.get(chxrVar);
        if (chxlVar == null) {
            return;
        }
        dcdc<chxk> a2 = chtk.a(chxlVar, aj());
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            chxk chxkVar = a2.get(i);
            chxj chxjVar = chxj.RATING;
            if (chxj.a(chxkVar.b).ordinal() == 4) {
                if (chxkVar.b == 5) {
                    chxhVar = (chxh) chxkVar.c;
                } else {
                    chxhVar = chxh.b;
                }
                L(chxrVar, chxhVar.a);
            }
        }
        if (aj().equals(chtq.e())) {
            return;
        }
        y(chxrVar);
    }

    @Override // defpackage.chrx
    public final void y(chxr chxrVar) {
        bvrj.UI_THREAD.c();
        chxl at = at(chxrVar);
        if (at == null) {
            return;
        }
        if (this.r.c()) {
            chtb chtbVar = this.H;
            dbsg<Integer> b2 = chtbVar.e.b(chxrVar);
            if (b2.a()) {
                chtbVar.f(b2.b().intValue());
            }
            Integer remove = chtbVar.b.remove(chxrVar);
            if (remove != null && chtbVar.a.get(remove) != null) {
                chtbVar.f(remove.intValue());
            }
        }
        bunc buncVar = this.X;
        dwcn bZ = dwco.f.bZ();
        dwlh dwlhVar = at.d;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dniu dniuVar = dwlhVar.b;
        if (dniuVar == null) {
            dniuVar = dniu.i;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwco dwcoVar = (dwco) bZ.b;
        dniuVar.getClass();
        dwcoVar.b = dniuVar;
        dwcoVar.a |= 1;
        dpkx bZ2 = dpky.b.bZ();
        bZ2.a(dpla.REVIEW);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwco dwcoVar2 = (dwco) bZ.b;
        dpky bK = bZ2.bK();
        bK.getClass();
        dwcoVar2.c = bK;
        dwcoVar2.a |= 2;
        String str = this.i.a().d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwco dwcoVar3 = (dwco) bZ.b;
        str.getClass();
        dwcoVar3.a |= 4;
        dwcoVar3.d = str;
        buncVar.b(bZ.bK(), new chqp(this), this.e);
        af();
    }

    @Override // defpackage.chrx
    public final void z(chxr chxrVar) {
        String str;
        bvrj.UI_THREAD.c();
        if (at(chxrVar) != null) {
            int i = chxrVar.b;
            String str2 = "";
            if (i == 3) {
                str = (String) chxrVar.c;
                i = 3;
            } else {
                str = str2;
            }
            if (i == 3) {
                str2 = (String) chxrVar.c;
            }
            ay(str, str2, 3);
            af();
        }
    }

    @Override // defpackage.chrx
    public final void v(String str) {
        chrk chrkVar = this.F;
        if (chrkVar.j == null || !chrkVar.k.equals(str)) {
            dbsk.s(str);
            chrkVar.h.a().i(str, 1, blpq.CONTRIBUTIONS_TAB_PERMANENT_ENTRY_POINT_NONPREFETCH);
        } else {
            bvxh bvxhVar = chrkVar.j;
            dbsk.s(bvxhVar);
            chrkVar.h.a().j(bvxhVar, blpq.CONTRIBUTIONS_TAB_PERMANENT_ENTRY_POINT_PREFETCH);
        }
        chrkVar.j = null;
    }
}
