package defpackage;

import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chng  reason: default package */
/* loaded from: classes4.dex */
public final class chng extends ges implements gfw, gfo {
    private static final dcqe ai = dcqe.c("chng");
    public Executor a;
    public cjqy ad;
    public chrb ae;
    chof af;
    public chyy ag;
    private cqkf<chyf> aj;
    @dzsi
    private btlu ak;
    public cqhn b;
    public cqhu c;
    public efg d;
    public cqkj e;
    public chyr f;
    public akfa g;
    private chyq al = null;
    @dzsi
    public chts ah = null;

    public static chud i(@dzsi drry drryVar, @dzsi byte[] bArr, @dzsi dpyv dpyvVar, dwyd dwydVar) {
        drrx drrxVar;
        Iterable<? extends drrv> iterable;
        chud bZ = chuu.l.bZ();
        if (drryVar == null || drryVar.a.size() == 0) {
            drrxVar = drrx.UNKNOWN_MODE;
        } else {
            drrxVar = drry.b.a(Integer.valueOf(drryVar.a.f(0)));
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chuu chuuVar = (chuu) bZ.b;
        chuuVar.d = drrxVar.i;
        chuuVar.a |= 8;
        if (drryVar == null) {
            iterable = dcdc.f(drrv.c);
        } else {
            iterable = drryVar.c;
        }
        bZ.a(iterable);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chuu chuuVar2 = (chuu) bZ.b;
        chuuVar2.c = dwydVar.Z;
        int i = chuuVar2.a | 4;
        chuuVar2.a = i;
        if (dpyvVar != null) {
            chuuVar2.b = dpyvVar.dm;
            chuuVar2.a = i | 2;
        }
        if (bArr != null) {
            dspd x = dspd.x(bArr);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chuu chuuVar3 = (chuu) bZ.b;
            x.getClass();
            chuuVar3.a |= 16;
            chuuVar3.f = x;
        }
        return bZ;
    }

    private final void q(btlu btluVar, chuu chuuVar, boolean z) {
        chrb chrbVar = this.ae;
        chrb.a(chrbVar.a.a(), 1);
        chrl a = chrbVar.b.a();
        chrb.a(a, 2);
        btvo a2 = chrbVar.c.a();
        chrb.a(a2, 3);
        dzsj<bqji> dzsjVar = chrbVar.d;
        bvjj a3 = chrbVar.e.a();
        chrb.a(a3, 5);
        bvrb a4 = chrbVar.f.a();
        chrb.a(a4, 6);
        btrm a5 = chrbVar.g.a();
        chrb.a(a5, 7);
        anhk a6 = chrbVar.h.a();
        chrb.a(a6, 8);
        chnu a7 = chrbVar.i.a();
        chrb.a(a7, 9);
        buqp a8 = chrbVar.j.a();
        chrb.a(a8, 10);
        chnt a9 = chrbVar.k.a();
        chrb.a(a9, 11);
        chrv a10 = chrbVar.l.a();
        chrb.a(a10, 12);
        bunc a11 = chrbVar.m.a();
        chrb.a(a11, 13);
        bztp a12 = chrbVar.n.a();
        chrb.a(a12, 14);
        bbul a13 = chrbVar.o.a();
        chrb.a(a13, 15);
        bbtk a14 = chrbVar.p.a();
        chrb.a(a14, 16);
        bjgy a15 = chrbVar.q.a();
        chrb.a(a15, 17);
        aujx a16 = chrbVar.r.a();
        chrb.a(a16, 18);
        bumx a17 = chrbVar.s.a();
        chrb.a(a17, 19);
        cbqg a18 = chrbVar.t.a();
        chrb.a(a18, 20);
        ccsk a19 = chrbVar.u.a();
        chrb.a(a19, 21);
        dxio a20 = ((dxjh) chrbVar.v).a();
        chrb.a(a20, 22);
        chrb.a(chrbVar.w.a(), 23);
        dxio a21 = ((dxjh) chrbVar.x).a();
        chrb.a(a21, 24);
        dxio a22 = ((dxjh) chrbVar.y).a();
        chrb.a(a22, 25);
        dxio a23 = ((dxjh) chrbVar.z).a();
        chrb.a(a23, 26);
        dxio a24 = ((dxjh) chrbVar.A).a();
        chrb.a(a24, 27);
        dxio a25 = ((dxjh) chrbVar.B).a();
        chrb.a(a25, 28);
        dxio a26 = ((dxjh) chrbVar.C).a();
        chrb.a(a26, 29);
        dxio a27 = ((dxjh) chrbVar.D).a();
        chrb.a(a27, 30);
        chrb.a(((dxjh) chrbVar.E).a(), 31);
        chrb.a(((dxjh) chrbVar.F).a(), 32);
        chsh a28 = chrbVar.G.a();
        chrb.a(a28, 33);
        chrb.a(chrbVar.H.a(), 34);
        chtc a29 = chrbVar.I.a();
        chrb.a(a29, 35);
        bzyl a30 = chrbVar.J.a();
        chrb.a(a30, 36);
        chsf a31 = chrbVar.K.a();
        chrb.a(a31, 37);
        bvam a32 = chrbVar.L.a();
        chrb.a(a32, 38);
        chrb.a(btluVar, 39);
        chrb.a(this, 40);
        chra chraVar = new chra(a, a2, dzsjVar, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, btluVar, this, z);
        this.af = chraVar;
        chraVar.b(chuuVar);
        this.af.c().a(new crzp(this) { // from class: chnb
            private final chng a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                chng chngVar = this.a;
                chtq chtqVar = (chtq) crzmVar.l();
                dbsk.s(chtqVar);
                View view = chngVar.P;
                if (view == null) {
                    return;
                }
                cjqq cjqqVar = chngVar.aH;
                dbsg<cjqp> bd = chngVar.bd();
                if (!bd.a()) {
                    return;
                }
                cjqqVar.h(view);
                cjqp k = cjqqVar.k(new cjsz(chtqVar.i()), bd.b().b());
                chngVar.aG = k;
                cjqqVar.i(k, view);
            }
        }, this.a);
        ((chra) this.af).u.a.a(new crzp(this) { // from class: chnf
            private final chng a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                chng chngVar = this.a;
                View view = chngVar.P;
                chts chtsVar = (chts) crzmVar.l();
                if (chngVar.aD && view != null && chtsVar != null) {
                    chngVar.g(view, chtsVar);
                } else if (chtsVar == null) {
                } else {
                    chngVar.ah = chtsVar;
                }
            }
        }, this.a);
        chyr chyrVar = this.f;
        chof chofVar = this.af;
        chrm chrmVar = ((chra) chofVar).G;
        crzm<chtq> c = chofVar.c();
        chof chofVar2 = this.af;
        chra chraVar2 = (chra) chofVar2;
        chny chnyVar = chraVar2.E.f;
        crzn<chty> crznVar = chnyVar.a.a;
        crzn<chvi> crznVar2 = chnyVar.b.a;
        crzn<chtp> crznVar3 = chraVar2.t.a;
        crzm<chtu> d = chofVar2.d();
        chra chraVar3 = (chra) this.af;
        crzn<chuh> crznVar4 = ((chru) chraVar3.G).c.a;
        crzn<chum> crznVar5 = chraVar3.H.c.a;
        crzn<chua> crznVar6 = chraVar3.v.a;
        crzn<drnp> crznVar7 = chraVar3.w.a;
        Runnable runnable = new Runnable(this) { // from class: chnc
            private final chng a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                chng chngVar = this.a;
                chof chofVar3 = chngVar.af;
                dbsk.s(chofVar3);
                dbuh.a(true);
                bzyk bzykVar = ((chra) chofVar3).K;
                dbsk.s(bzykVar);
                bzykVar.b((gga) chngVar.J());
            }
        };
        Application a33 = chyrVar.a.a();
        chyr.a(a33, 1);
        Resources a34 = chyrVar.b.a();
        chyr.a(a34, 2);
        Executor a35 = chyrVar.c.a();
        chyr.a(a35, 3);
        cqhn a36 = chyrVar.d.a();
        chyr.a(a36, 4);
        cqhu a37 = chyrVar.e.a();
        chyr.a(a37, 5);
        cizn a38 = chyrVar.f.a();
        chyr.a(a38, 6);
        cisi a39 = chyrVar.g.a();
        chyr.a(a39, 7);
        cibe a40 = chyrVar.h.a();
        chyr.a(a40, 8);
        cjnx a41 = chyrVar.i.a();
        chyr.a(a41, 9);
        btvo a42 = chyrVar.j.a();
        chyr.a(a42, 10);
        PublicDisclosureLayout$PublicDisclosureViewModelImpl a43 = chyrVar.k.a();
        chyr.a(a43, 11);
        cjae a44 = chyrVar.l.a();
        chyr.a(a44, 12);
        chsf a45 = chyrVar.m.a();
        chyr.a(a45, 13);
        bvpe a46 = chyrVar.n.a();
        chyr.a(a46, 14);
        chyr.a(chofVar, 15);
        chyr.a(chrmVar, 16);
        chyr.a(c, 17);
        chyr.a(crznVar, 18);
        chyr.a(crznVar2, 19);
        chyr.a(crznVar3, 20);
        chyr.a(d, 21);
        chyr.a(crznVar4, 22);
        chyr.a(crznVar5, 23);
        chyr.a(crznVar6, 24);
        chyr.a(crznVar7, 25);
        chyr.a(btluVar, 26);
        chyr.a(runnable, 27);
        this.al = new chyq(a33, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43, a44, a45, a46, chofVar, chrmVar, c, crznVar, crznVar2, crznVar3, d, crznVar4, crznVar5, crznVar6, crznVar7, btluVar, runnable);
        chof chofVar3 = this.af;
        dbuh.a(true);
        bzyk bzykVar = ((chra) chofVar3).K;
        dbsk.s(bzykVar);
        x<cqeo> xVar = bzykVar.a;
        final chyq chyqVar = this.al;
        chyqVar.getClass();
        xVar.b(this, new aa(chyqVar) { // from class: chnd
            private final chyq a;

            {
                this.a = chyqVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.l((cqeo) obj);
            }
        });
        this.ak = btluVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        if (this.al != null) {
            this.aj.e(null);
        }
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        chof chofVar = this.af;
        if (chofVar == null) {
            bvoo.h("controller is null after onCreate", new Object[0]);
            return;
        }
        final chrk chrkVar = ((chra) chofVar).F;
        if (obj instanceof chve) {
            chve chveVar = (chve) obj;
            final chxr chxrVar = chveVar.c;
            if (chxrVar == null) {
                chxrVar = chxr.e;
            }
            chvd chvdVar = chvd.UNKNOWN;
            chvd b = chvd.b(chveVar.b);
            if (b == null) {
                b = chvd.UNKNOWN;
            }
            int ordinal = b.ordinal();
            if (ordinal == 1) {
                chrkVar.c.x(chxrVar);
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    return;
                }
                chrkVar.c.D(chxrVar);
                chrkVar.c.y(chxrVar);
            } else {
                dwjb dwjbVar = chveVar.d;
                if (dwjbVar == null) {
                    dwjbVar = dwjb.f;
                }
                dbsg<cdhl> d = cdhl.d(dwjbVar);
                if (d.a()) {
                    chrkVar.c.E(chxrVar, d.b());
                } else {
                    chrkVar.c.n(chxrVar, new bvqg(chrkVar, chxrVar) { // from class: chrj
                        private final chrk a;
                        private final chxr b;

                        {
                            this.a = chrkVar;
                            this.b = chxrVar;
                        }

                        @Override // defpackage.bvqg
                        public final void NU(Object obj2) {
                            this.a.c.E(this.b, (cdhl) obj2);
                        }
                    });
                }
            }
        } else if (obj instanceof cdil) {
            bvqg<cdhl> bvqgVar = chrkVar.n;
            if (bvqgVar == null) {
                bvoo.h("Received a PickedPlace but no callback is pending.", new Object[0]);
                return;
            }
            bvqgVar.NU(((cdil) obj).a());
            chrkVar.n = null;
        } else if (obj instanceof aeuf) {
            bvqg<cdhl> bvqgVar2 = chrkVar.n;
            if (bvqgVar2 == null) {
                bvoo.h("Received a HerePlace but no callback is pending.", new Object[0]);
                return;
            }
            bvqgVar2.NU(cdhl.e((aeuf) obj));
            chrkVar.n = null;
        } else if (obj instanceof ccwy) {
            if (chrkVar.o == null) {
                return;
            }
            ccwy ccwyVar = (ccwy) obj;
            ccwu ccwuVar = ccwyVar.b;
            if (ccwuVar == null) {
                ccwuVar = ccwu.d;
            }
            chpv chpvVar = chrkVar.o;
            dbsk.s(chpvVar);
            final String str = ccwuVar.b;
            if (ccwyVar.c == null) {
                dgfg dgfgVar = dgfg.d;
            }
            final chra chraVar = chpvVar.a;
            final chxr chxrVar2 = chpvVar.b;
            final chxg chxgVar = chpvVar.c;
            chraVar.d.b(new Runnable(chraVar, chxrVar2, chxgVar, str) { // from class: chqg
                private final chra a;
                private final chxr b;
                private final chxg c;
                private final String d;

                {
                    this.a = chraVar;
                    this.b = chxrVar2;
                    this.c = chxgVar;
                    this.d = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    chxl chxlVar;
                    chxh chxhVar;
                    chra chraVar2 = this.a;
                    chxr chxrVar3 = this.b;
                    chxg chxgVar2 = this.c;
                    String str2 = this.d;
                    bvrj.UI_THREAD.c();
                    if (!str2.isEmpty() && (chxlVar = chraVar2.k.get(chxrVar3)) != null) {
                        chxk ad = chra.ad(chxlVar);
                        if (ad.b == 5) {
                            if (((chxh) ad.c).a.indexOf(chxgVar2) == -1) {
                                Object[] objArr = new Object[1];
                                dwfl dwflVar = chxgVar2.b;
                                if (dwflVar == null) {
                                    dwflVar = dwfl.w;
                                }
                                objArr[0] = dwflVar.h;
                                bvoo.h("Attempted to tag a nonexistent photo, with image url=%s", objArr);
                                return;
                            }
                            chns chnsVar = chraVar2.E;
                            chnsVar.l += chnsVar.f().c(dpwe.PHOTO_ASSOCIATED_WITH_OFFERING);
                            chnsVar.g();
                            chnsVar.h();
                            if (chraVar2.r.a()) {
                                chrm chrmVar = chraVar2.G;
                                dwlh dwlhVar = chxlVar.d;
                                if (dwlhVar == null) {
                                    dwlhVar = dwlh.n;
                                }
                                dpsr dpsrVar = dwlhVar.f;
                                if (dpsrVar == null) {
                                    dpsrVar = dpsr.c;
                                }
                                String str3 = dpsrVar.a;
                                chru chruVar = (chru) chrmVar;
                                if (chruVar.b.containsKey(str3)) {
                                    chug chugVar = chruVar.b.get(str3);
                                    LinkedHashMap<String, chug> linkedHashMap = chruVar.b;
                                    dsqp dsqpVar = (dsqp) chugVar.cu(5);
                                    dsqpVar.bC(chugVar);
                                    chuf chufVar = (chuf) dsqpVar;
                                    int i = chugVar.g + 1;
                                    if (chufVar.c) {
                                        chufVar.bF();
                                        chufVar.c = false;
                                    }
                                    chug chugVar2 = (chug) chufVar.b;
                                    chugVar2.a |= 32;
                                    chugVar2.g = i;
                                    int c = chugVar.d + chruVar.e.c(dpwe.PHOTO_ASSOCIATED_WITH_OFFERING);
                                    if (chufVar.c) {
                                        chufVar.bF();
                                        chufVar.c = false;
                                    }
                                    chug chugVar3 = (chug) chufVar.b;
                                    chugVar3.a |= 4;
                                    chugVar3.d = c;
                                    linkedHashMap.put(str3, chufVar.bK());
                                    chruVar.i();
                                }
                            }
                            dsqp dsqpVar2 = (dsqp) ad.cu(5);
                            dsqpVar2.bC(ad);
                            chxi chxiVar = (chxi) dsqpVar2;
                            if (ad.b == 5) {
                                chxhVar = (chxh) ad.c;
                            } else {
                                chxhVar = chxh.b;
                            }
                            dwfl dwflVar2 = chxgVar2.b;
                            if (dwflVar2 == null) {
                                dwflVar2 = dwfl.w;
                            }
                            chxh ac = chra.ac(chxhVar, dcep.B(dwflVar2.q));
                            if (chxiVar.c) {
                                chxiVar.bF();
                                chxiVar.c = false;
                            }
                            chxk chxkVar = (chxk) chxiVar.b;
                            ac.getClass();
                            chxkVar.c = ac;
                            chxkVar.b = 5;
                            int indexOf = chxlVar.u.indexOf(ad);
                            dsqp dsqpVar3 = (dsqp) chxlVar.cu(5);
                            dsqpVar3.bC(chxlVar);
                            chvz chvzVar = (chvz) dsqpVar3;
                            chvzVar.f(indexOf, chxiVar.bK());
                            chraVar2.k.put(chxrVar3, chvzVar.bK());
                            chraVar2.af();
                            HashSet<String> hashSet = chraVar2.o;
                            dwfl dwflVar3 = chxgVar2.b;
                            if (dwflVar3 == null) {
                                dwflVar3 = dwfl.w;
                            }
                            hashSet.add(dwflVar3.q);
                            return;
                        }
                        bvoo.h("Attempted to set photo tag for item without tagging task, with key=%s", chxrVar3);
                    }
                }
            }, bvrj.UI_THREAD);
            chrkVar.o = null;
        } else if (obj instanceof baad) {
            chrkVar.c.X((baad) obj);
        } else if (obj instanceof baal) {
            chrkVar.c.Z((baal) obj);
        } else if (obj instanceof azrk) {
            chrkVar.c.aa((azrk) obj);
        } else if (obj instanceof bdhk) {
            bdhk bdhkVar = (bdhk) obj;
            chrkVar.c.an();
        } else if (obj instanceof cbtz) {
            chrkVar.c.s((cbtz) obj);
        } else if (obj instanceof bbua) {
            chrkVar.c.K((bbua) obj);
        } else if (!(obj instanceof bjhz)) {
        } else {
            chrkVar.c.C((bjhz) obj);
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        btlu j = this.g.j();
        if (btlu.i(this.ak) != btlt.SIGNED_OUT && btlu.i(j) != btlt.SIGNED_OUT && !btlu.g(this.ak, j)) {
            dbsk.s(j);
            q(j, chuu.l, false);
        }
        if (this.al == null) {
            return null;
        }
        ciad ciadVar = new ciad(this.b, this.c);
        this.ag.a = ciadVar;
        cqkf<chyf> d = this.e.d(new chye(ciadVar), viewGroup, false);
        this.aj = d;
        d.e(this.al);
        return this.aj.c();
    }

    @Override // defpackage.fd
    public final void ah(View view, @dzsi Bundle bundle) {
        chyq chyqVar = this.al;
        if (chyqVar != null) {
            chyqVar.n(x());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        chof chofVar = this.af;
        if (chofVar != null) {
            chra chraVar = (chra) chofVar;
            chraVar.I.a().d = chraVar.aj().a();
            chraVar.I.a().a();
        }
        chts chtsVar = this.ah;
        if (chtsVar != null) {
            View view = this.P;
            if (view != null) {
                dbsk.s(chtsVar);
                g(view, chtsVar);
            }
            this.ah = null;
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        chof chofVar = this.af;
        if (chofVar != null) {
            bvrj.UI_THREAD.c();
            chra chraVar = (chra) chofVar;
            chraVar.h.a(chofVar);
            chraVar.k.clear();
            chraVar.l.clear();
            chraVar.A.clear();
        }
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        chof chofVar = this.af;
        if (chofVar == null) {
            bvoo.h("controller is null after onCreate", new Object[0]);
            return false;
        }
        chra chraVar = (chra) chofVar;
        chtq h = chraVar.h();
        if (!h.equals(chraVar.c().l())) {
            chraVar.i(h);
            return true;
        }
        chraVar.j.a = chraVar.E.a();
        return false;
    }

    public final void g(View view, final chts chtsVar) {
        cjtd cjtdVar = (cjtd) dbsg.j(chtsVar.d()).c(cjtd.b);
        chof chofVar = this.af;
        int i = 0;
        if (chofVar == null) {
            bvoo.h("controller is null when trying to show messages.", new Object[0]);
            return;
        }
        chtq l = chofVar.c().l();
        dbsk.s(l);
        cjsz cjszVar = new cjsz(l.i());
        final cjql d = cjtd.b.equals(cjtdVar) ? null : this.aH.e(this.ad.r(cjszVar), cjszVar).d(cjtdVar);
        CharSequence a = chtsVar.a().a(H());
        CharSequence a2 = chtsVar.b().a(H());
        AccessibilityManager accessibilityManager = (AccessibilityManager) J().getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            i = 15000;
        }
        dafk a3 = ckos.a(view, a, i);
        a3.p(a2, new View.OnClickListener(this, d, chtsVar) { // from class: chne
            private final chng a;
            private final cjql b;
            private final chts c;

            {
                this.a = this;
                this.b = d;
                this.c = chtsVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                chng chngVar = this.a;
                cjql cjqlVar = this.b;
                chts chtsVar2 = this.c;
                if (cjqlVar != null) {
                    chngVar.ad.j(cjqlVar, chtsVar2.d());
                }
                chtsVar2.c().run();
            }
        });
        a3.u(iva.b(ibl.w(), ibl.z()).b(H()));
        a3.q(ibl.E().b(H()));
        a3.s(ibl.i().b(H()));
        a3.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        chuu chuuVar;
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        btlu k = this.g.k();
        btlt i = btlu.i(k);
        btlt btltVar = btlt.UNKNOWN;
        int ordinal = i.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                return;
            }
            bvoo.h("Account type is %s in TodolistFragment.onCreate", i);
            gn gnVar = this.A;
            dbsk.s(gnVar);
            gnVar.e();
            return;
        }
        chxt chxtVar = (chxt) bvrs.e(bundle, chxt.class, (dssr) chxt.c.cu(7));
        if (chxtVar != null) {
            chuuVar = chxtVar.b;
            if (chuuVar == null) {
                chuuVar = chuu.l;
            }
        } else {
            chuuVar = chuu.l;
        }
        boolean z = bundle.getBoolean("S");
        dbsk.s(k);
        q(k, chuuVar, z);
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        chxt chxtVar = (chxt) bvrs.e(this.o, chxt.class, (dssr) chxt.c.cu(7));
        if (chxtVar == null) {
            return dtxl.gt;
        }
        chuu chuuVar = chxtVar.b;
        if (chuuVar == null) {
            chuuVar = chuu.l;
        }
        drrx b = drrx.b(chuuVar.d);
        if (b == null) {
            b = drrx.UNKNOWN_MODE;
        }
        return chtq.q(b).i();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.d;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.e(this);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        if (this.af == null) {
            bvoo.h("controller is null after onCreate", new Object[0]);
            return;
        }
        chxs bZ = chxt.c.bZ();
        chof chofVar = this.af;
        bvrj.UI_THREAD.c();
        chud bZ2 = chuu.l.bZ();
        chra chraVar = (chra) chofVar;
        drrx a = chraVar.aj().a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        chuu chuuVar = (chuu) bZ2.b;
        chuuVar.d = a.i;
        chuuVar.a |= 8;
        Collection<chxl> values = chraVar.k.values();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        chuu chuuVar2 = (chuu) bZ2.b;
        dsrj<chxl> dsrjVar = chuuVar2.h;
        if (!dsrjVar.a()) {
            chuuVar2.h = dsqw.cl(dsrjVar);
        }
        dsod.bv(values, chuuVar2.h);
        for (Map.Entry<chtq, chqz> entry : chraVar.l.entrySet()) {
            chqz value = entry.getValue();
            if (!value.a().isEmpty()) {
                chui bZ3 = chuj.e.bZ();
                drrx a2 = entry.getKey().a();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                chuj chujVar = (chuj) bZ3.b;
                chujVar.b = a2.i;
                chujVar.a |= 1;
                ArrayList<chxr> arrayList = value.a;
                chuj chujVar2 = (chuj) bZ3.b;
                dsrj<chxr> dsrjVar2 = chujVar2.c;
                if (!dsrjVar2.a()) {
                    chujVar2.c = dsqw.cl(dsrjVar2);
                }
                dsod.bv(arrayList, chujVar2.c);
                String e = dbsj.e(value.c);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                chuj chujVar3 = (chuj) bZ3.b;
                e.getClass();
                chujVar3.a |= 2;
                chujVar3.d = e;
                chuj bK = bZ3.bK();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                chuu chuuVar3 = (chuu) bZ2.b;
                bK.getClass();
                dsrj<chuj> dsrjVar3 = chuuVar3.g;
                if (!dsrjVar3.a()) {
                    chuuVar3.g = dsqw.cl(dsrjVar3);
                }
                chuuVar3.g.add(bK);
            }
        }
        chuc a3 = chraVar.E.a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        chuu chuuVar4 = (chuu) bZ2.b;
        a3.getClass();
        chuuVar4.i = a3;
        chuuVar4.a |= 32;
        if (chraVar.r.a()) {
            chuh l = ((chru) chraVar.G).c.a.l();
            if (l == null) {
                l = chuh.e;
            }
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            chuu chuuVar5 = (chuu) bZ2.b;
            l.getClass();
            chuuVar5.j = l;
            chuuVar5.a |= 64;
        }
        bZ2.a(chraVar.x);
        if (chraVar.y.a()) {
            dpyv b = chraVar.y.b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            chuu chuuVar6 = (chuu) bZ2.b;
            chuuVar6.b = b.dm;
            chuuVar6.a |= 2;
        }
        dwyd dwydVar = chraVar.z;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        chuu chuuVar7 = (chuu) bZ2.b;
        chuuVar7.c = dwydVar.Z;
        chuuVar7.a |= 4;
        if (chraVar.r.c()) {
            chtb chtbVar = chraVar.H;
            chuk bZ4 = chut.e.bZ();
            dcdc z = dcbg.b(chtbVar.a.entrySet()).s(chsw.a).z();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            chut chutVar = (chut) bZ4.b;
            dsrj<chum> dsrjVar4 = chutVar.b;
            if (!dsrjVar4.a()) {
                chutVar.b = dsqw.cl(dsrjVar4);
            }
            dsod.bv(z, chutVar.b);
            chta chtaVar = chtbVar.e;
            int i = chtbVar.d;
            chup bZ5 = chus.e.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            chus chusVar = (chus) bZ5.b;
            chusVar.a |= 2;
            chusVar.d = i;
            if (!dbsj.d(chtaVar.b)) {
                String str = chtaVar.b;
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                chus chusVar2 = (chus) bZ5.b;
                str.getClass();
                chusVar2.a |= 1;
                chusVar2.c = str;
            }
            for (Map.Entry<Integer, ArrayList<chxr>> entry2 : chtaVar.c.entrySet()) {
                int intValue = entry2.getKey().intValue();
                ArrayList<chxr> value2 = entry2.getValue();
                chuq bZ6 = chur.d.bZ();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                chur churVar = (chur) bZ6.b;
                churVar.a |= 1;
                churVar.b = intValue;
                chur churVar2 = (chur) bZ6.b;
                dsrj<chxr> dsrjVar5 = churVar2.c;
                if (!dsrjVar5.a()) {
                    churVar2.c = dsqw.cl(dsrjVar5);
                }
                dsod.bv(value2, churVar2.c);
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                chus chusVar3 = (chus) bZ5.b;
                chur bK2 = bZ6.bK();
                bK2.getClass();
                dsrj<chur> dsrjVar6 = chusVar3.b;
                if (!dsrjVar6.a()) {
                    chusVar3.b = dsqw.cl(dsrjVar6);
                }
                chusVar3.b.add(bK2);
            }
            chus bK3 = bZ5.bK();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            chut chutVar2 = (chut) bZ4.b;
            bK3.getClass();
            chutVar2.c = bK3;
            chutVar2.a |= 1;
            dcbg s = dcbg.b(chtbVar.b.entrySet()).s(chsx.a);
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            chut chutVar3 = (chut) bZ4.b;
            dsrj<chuo> dsrjVar7 = chutVar3.d;
            if (!dsrjVar7.a()) {
                chutVar3.d = dsqw.cl(dsrjVar7);
            }
            dsod.bv(s, chutVar3.d);
            chut bK4 = bZ4.bK();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            chuu chuuVar8 = (chuu) bZ2.b;
            bK4.getClass();
            chuuVar8.k = bK4;
            chuuVar8.a |= 128;
        }
        chuu bK5 = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chxt chxtVar = (chxt) bZ.b;
        bK5.getClass();
        chxtVar.b = bK5;
        chxtVar.a |= 1;
        chxt bK6 = bZ.bK();
        int length = bK6.bS().length;
        bvrs.l(bundle, bK6);
    }
}
