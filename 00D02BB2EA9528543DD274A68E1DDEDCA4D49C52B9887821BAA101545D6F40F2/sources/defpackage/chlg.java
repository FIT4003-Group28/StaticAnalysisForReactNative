package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: chlg  reason: default package */
/* loaded from: classes4.dex */
public class chlg implements chmy {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final chgz b;
    public final chby c;
    public final chlf d;
    public final List<chmv> e;
    public final List<WeakReference<View>> f;
    @dzsi
    public final bwrs<ilo> g;
    public final chis h;
    private final cafi i;
    private final chnm j;
    private final Resources k;
    private final chkv l;
    private final PublicDisclosureLayout$PublicDisclosureViewModelImpl m;
    private final caxn n;

    public chlg(cafi cafiVar, chnm chnmVar, Resources resources, chkv chkvVar, chgz chgzVar, PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl, caxn caxnVar, chby chbyVar, chlf chlfVar, chit chitVar, @dzsi bwrs<ilo> bwrsVar) {
        this.i = cafiVar;
        this.j = chnmVar;
        this.k = resources;
        this.l = chkvVar;
        this.b = chgzVar;
        this.m = publicDisclosureLayout$PublicDisclosureViewModelImpl;
        this.n = caxnVar;
        publicDisclosureLayout$PublicDisclosureViewModelImpl.o(cayd.TOOLTIP);
        this.c = chbyVar;
        this.d = chlfVar;
        dsqp dsqpVar = (dsqp) chitVar.cu(5);
        dsqpVar.bC(chitVar);
        this.h = (chis) dsqpVar;
        this.g = bwrsVar;
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    public chlg a() {
        b();
        return this;
    }

    public final void b() {
        this.e.clear();
        Iterator it = Collections.unmodifiableList(((chit) this.h.b).b).iterator();
        boolean z = false;
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            chik chikVar = (chik) it.next();
            chkv chkvVar = this.l;
            if (((chit) this.h.b).f == null) {
                chir chirVar = chir.c;
            }
            dbsg<chmv> a = chkvVar.a(new chle(this, chikVar, this.m, this.n));
            if (a.a()) {
                this.e.add(a.b());
                int i = chikVar.a;
                boolean z3 = z | (i == 1);
                if (i != 3) {
                    z2 = false;
                }
                z = z3 | z2;
            }
        }
        if (!z) {
            chkv chkvVar2 = this.l;
            chij bZ = chik.c.bZ();
            chhv bZ2 = chhy.e.bZ();
            djdb bZ3 = djdm.c.bZ();
            djde bZ4 = djdf.e.bZ();
            String string = chkvVar2.a.getString(R.string.THANKS_PAGE_DEFAULT_TITLE);
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            djdf djdfVar = (djdf) bZ4.b;
            string.getClass();
            djdfVar.a |= 1;
            djdfVar.b = string;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            djdm djdmVar = (djdm) bZ3.b;
            djdf bK = bZ4.bK();
            bK.getClass();
            djdmVar.b = bK;
            djdmVar.a = 2;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            chhy chhyVar = (chhy) bZ2.b;
            djdm bK2 = bZ3.bK();
            bK2.getClass();
            chhyVar.b = bK2;
            chhyVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chik chikVar2 = (chik) bZ.b;
            chhy bK3 = bZ2.bK();
            bK3.getClass();
            chikVar2.b = bK3;
            chikVar2.a = 1;
            chik bK4 = bZ.bK();
            if (((chit) this.h.b).f == null) {
                chir chirVar2 = chir.c;
            }
            dbsg<chmv> a2 = chkvVar2.a(new chle(this, bK4, this.m, this.n));
            dbsk.l(a2.a());
            this.e.add(0, a2.b());
        }
    }

    @Override // defpackage.chmy
    public dcdc<chmv> c() {
        return dcdc.r(this.e);
    }

    @Override // defpackage.chmy
    public Boolean d() {
        return Boolean.valueOf(((chit) this.h.b).c);
    }

    @Override // defpackage.chmy
    public String e() {
        return this.k.getString(R.string.IMPACT_INTERSTITIAL_CONTRIBUTE_MORE);
    }

    @Override // defpackage.chmy
    public cqkl f() {
        this.d.q();
        chir chirVar = ((chit) this.h.b).f;
        if (chirVar == null) {
            chirVar = chir.c;
        }
        int a = chip.a(chirVar.b);
        if (a == 0) {
            a = 2;
        }
        if (a - 1 == 1) {
            if (this.j.n()) {
                this.j.e(((chit) this.h.b).g);
                this.j.k();
            } else {
                this.i.k(null, null);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.chmy
    public cqkl g() {
        this.d.q();
        return cqkl.a;
    }

    @Override // defpackage.chmy
    public cjtd h() {
        cjta b = cjtd.b();
        b.g(((chit) this.h.b).e);
        b.d = dddv.KU;
        return b.a();
    }

    @Override // defpackage.chmy
    public cjtd i() {
        cjta b = cjtd.b();
        b.g(((chit) this.h.b).e);
        b.d = dddv.KW;
        return b.a();
    }

    @Override // defpackage.chmy
    public cjtd j() {
        cjta b = cjtd.b();
        b.g(((chit) this.h.b).e);
        b.d = dddv.KV;
        return b.a();
    }

    @Override // defpackage.chmy
    public cqfd k() {
        this.f.clear();
        return new cqfd(this) { // from class: chlc
            private final chlg a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfd
            public final boolean a(View view) {
                final chlg chlgVar = this.a;
                int i = 0;
                while (true) {
                    if (i < chlgVar.f.size()) {
                        if (chlgVar.f.get(i).get() == view) {
                            break;
                        }
                        i++;
                    } else {
                        chlgVar.f.add(new WeakReference<>(view));
                        int a = chim.a(((chit) chlgVar.h.b).h);
                        if (a == 0) {
                            a = 1;
                        }
                        long a2 = chgz.a(view, a);
                        if ((((chit) chlgVar.h.b).a & 2) == 0) {
                            chlgVar.a.postDelayed(new Runnable(chlgVar) { // from class: chld
                                private final chlg a;

                                {
                                    this.a = chlgVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    chlg chlgVar2 = this.a;
                                    chis chisVar = chlgVar2.h;
                                    if ((((chit) chisVar.b).a & 2) != 0) {
                                        return;
                                    }
                                    if (chisVar.c) {
                                        chisVar.bF();
                                        chisVar.c = false;
                                    }
                                    chit chitVar = (chit) chisVar.b;
                                    chitVar.h = 0;
                                    chitVar.a |= 32;
                                    chis chisVar2 = chlgVar2.h;
                                    if (chisVar2.c) {
                                        chisVar2.bF();
                                        chisVar2.c = false;
                                    }
                                    chit chitVar2 = (chit) chisVar2.b;
                                    chitVar2.a |= 2;
                                    chitVar2.d = 0;
                                    if (chlgVar2.e.isEmpty()) {
                                        return;
                                    }
                                    chlgVar2.e.get(0).g();
                                }
                            }, a2);
                        }
                    }
                }
                return true;
            }
        };
    }

    public void l(m mVar) {
        mVar.Nh().a(this.m);
    }

    public chit m() {
        chis chisVar = this.h;
        if (chisVar.c) {
            chisVar.bF();
            chisVar.c = false;
        }
        chit chitVar = chit.i;
        ((chit) chisVar.b).b = chit.ck();
        for (chmv chmvVar : this.e) {
            chis chisVar2 = this.h;
            chik e = chmvVar.e();
            if (chisVar2.c) {
                chisVar2.bF();
                chisVar2.c = false;
            }
            chit chitVar2 = (chit) chisVar2.b;
            e.getClass();
            chitVar2.b();
            chitVar2.b.add(e);
        }
        return this.h.bK();
    }

    public void n() {
        for (chmv chmvVar : this.e) {
            if (chmvVar instanceof chlz) {
                chmr b = ((chlz) chmvVar).b();
                if (b instanceof chjk) {
                    ((chjk) b).m();
                }
            }
        }
    }

    public void o() {
        for (chmv chmvVar : this.e) {
            if (chmvVar instanceof chlz) {
                chmr b = ((chlz) chmvVar).b();
                if (b instanceof chjk) {
                    ((chjk) b).n();
                }
            }
        }
    }

    public void p(Object obj) {
        if (obj instanceof cdil) {
            cdil cdilVar = (cdil) obj;
            for (chmv chmvVar : this.e) {
                if (chmvVar instanceof chmp) {
                    ((chmp) chmvVar).r(cdilVar);
                }
            }
        } else if (obj instanceof aeuf) {
            aeuf aeufVar = (aeuf) obj;
            for (chmv chmvVar2 : this.e) {
                if (chmvVar2 instanceof chmp) {
                    ((chmp) chmvVar2).s(aeufVar);
                }
            }
        } else if (obj instanceof bbua) {
            bbua bbuaVar = (bbua) obj;
            for (chmv chmvVar3 : this.e) {
                if (chmvVar3 instanceof chmp) {
                    ((chmp) chmvVar3).n(bbuaVar);
                }
            }
        } else if (obj instanceof ccwy) {
            ccwy ccwyVar = (ccwy) obj;
            for (chmv chmvVar4 : this.e) {
                if (chmvVar4 instanceof chjm) {
                    ((chjm) chmvVar4).b(ccwyVar);
                }
            }
        }
    }
}
