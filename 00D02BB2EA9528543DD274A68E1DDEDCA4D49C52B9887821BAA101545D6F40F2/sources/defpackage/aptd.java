package defpackage;

import android.view.View;
import com.google.android.apps.gmm.merchantmode.webview.CreatePostsWebViewCallbacks;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aptd  reason: default package */
/* loaded from: classes2.dex */
public final class aptd extends itb implements apup {
    private static final dcqe c = dcqe.c("aptd");
    public final gga a;
    private final akfa d;
    private final dxio<bbul> e;
    private final dxio<begg> f;
    private final ckcw g;
    @dzsi
    private akqi i;
    private final List<Long> h = new ArrayList();
    final Set<apuo> b = new HashSet();

    public aptd(gga ggaVar, akfa akfaVar, dxio<bbul> dxioVar, dxio<begg> dxioVar2, ckcw ckcwVar) {
        this.a = ggaVar;
        this.d = akfaVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        this.g = ckcwVar;
    }

    static dbsg<ddho> q(@dzsi dboe dboeVar) {
        if (dboeVar == null) {
            return dbpy.a;
        }
        cruf crufVar = cruf.PRECHECK_STATUS_UNKNOWN;
        int ordinal = dboeVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return dbsg.i(dtxv.ci);
            }
            if (ordinal == 3) {
                return dbsg.i(dtxv.cl);
            }
            if (ordinal == 4) {
                return dbsg.i(dtxv.cm);
            }
            if (ordinal != 6) {
                return dbpy.a;
            }
        }
        return dbsg.i(dtxv.cn);
    }

    private final bvxu s(String str) {
        bvxn bZ = bvxu.A.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        str.getClass();
        bvxuVar.a |= 1;
        bvxuVar.b = str;
        dkyw bZ2 = dkyx.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dkyx.b((dkyx) bZ2.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        dkyx bK = bZ2.bK();
        bK.getClass();
        bvxuVar2.j = bK;
        bvxuVar2.a |= 256;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        bvxuVar3.a |= 32;
        bvxuVar3.g = true;
        bvxu.b(bvxuVar3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        int i = bvxuVar4.a | 512;
        bvxuVar4.a = i;
        bvxuVar4.k = true;
        bvxuVar4.a = i | 4;
        bvxuVar4.d = true;
        bvxp f = bvoa.f(ibm.b(), this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar5 = (bvxu) bZ.b;
        f.getClass();
        bvxuVar5.x = f;
        int i2 = bvxuVar5.a | 4194304;
        bvxuVar5.a = i2;
        bvxuVar5.a = i2 | 2048;
        bvxuVar5.m = true;
        return bZ.bK();
    }

    @Override // defpackage.apup
    public final void e(bwrs<ilo> bwrsVar, dboe dboeVar) {
        dbsg dbsgVar;
        ilo c2 = bwrsVar.c();
        if (c2 == null || (c2.bf().a & 16777216) == 0) {
            bvoo.h("Merchant info doesn't exist.", new Object[0]);
            dbsgVar = dbpy.a;
        } else {
            dvwi dvwiVar = c2.bf().v;
            if (dvwiVar == null) {
                dvwiVar = dvwi.m;
            }
            cruf crufVar = cruf.PRECHECK_STATUS_UNKNOWN;
            dboe dboeVar2 = dboe.POST_TOPIC_TYPE_UNSPECIFIED;
            int ordinal = dboeVar.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    dnpq dnpqVar = dvwiVar.d;
                    if (dnpqVar == null) {
                        dnpqVar = dnpq.g;
                    }
                    dbsgVar = dbsg.i(dnpqVar);
                } else if (ordinal == 3) {
                    dnpq dnpqVar2 = dvwiVar.e;
                    if (dnpqVar2 == null) {
                        dnpqVar2 = dnpq.g;
                    }
                    dbsgVar = dbsg.i(dnpqVar2);
                } else if (ordinal == 4) {
                    dnpq dnpqVar3 = dvwiVar.f;
                    if (dnpqVar3 == null) {
                        dnpqVar3 = dnpq.g;
                    }
                    dbsgVar = dbsg.i(dnpqVar3);
                } else if (ordinal != 6) {
                    dbsgVar = dbpy.a;
                }
            }
            dnpq dnpqVar4 = dvwiVar.g;
            if (dnpqVar4 == null) {
                dnpqVar4 = dnpq.g;
            }
            dbsgVar = dbsg.i(dnpqVar4);
        }
        if (!dbsgVar.a()) {
            return;
        }
        dbsg<ddho> q = q(dboeVar);
        if (!q.a()) {
            return;
        }
        ((ckhe) this.g.a(ckgp.i)).a();
        ((ckhe) this.g.a(ckgp.h)).a();
        this.a.D(aptb.g(s(((dnpq) dbsgVar.b()).c), new CreatePostsWebViewCallbacks(bwrsVar), q.b()));
    }

    @Override // defpackage.apup
    public final void f(bwrs<ilo> bwrsVar, dipk dipkVar) {
        if (!dipkVar.s.isEmpty()) {
            int a = dgce.a(dipkVar.f);
            if (a == 0) {
                a = 1;
            }
            dbsg<ddho> q = q(dboe.b(a - 1));
            if (!q.a()) {
                return;
            }
            String str = dipkVar.s;
            ((ckhe) this.g.a(ckgp.i)).a();
            ((ckhe) this.g.a(ckgp.h)).a();
            this.a.D(aptb.g(s(str), new CreatePostsWebViewCallbacks(bwrsVar), q.b()));
        }
    }

    @Override // defpackage.apup
    public final void i(bwrs<ilo> bwrsVar, bbtj bbtjVar, String str) {
        btlu j = this.d.j();
        if (j == null) {
            bvoo.h("Can't upload photo. Gmm system account is null", new Object[0]);
        } else {
            j.s();
        }
        bwrsVar.c();
        dbsk.s(j);
        String str2 = j.s().name;
        bbui k = bbuj.k();
        k.g(str2);
        k.h(dwyd.MERCHANT_MODE_CREATE_POST_WEBVIEW);
        k.l(new aptc(this, bbtjVar, str));
        ilo c2 = bwrsVar.c();
        dbsk.s(c2);
        k.n(bbtjVar, bbvh.e(c2));
        bbss bbssVar = (bbss) k;
        bbssVar.b = dbsg.i(0);
        bbssVar.c = dbsg.i(false);
        this.e.a().d(k.m());
    }

    @Override // defpackage.apup
    public final void j(dbnb dbnbVar) {
        bwce bwceVar;
        dbsg<aptb> k = k();
        if (k.a() && (bwceVar = k.b().w().a) != null) {
            bvxi k2 = bwceVar.k();
            dbmq bZ = dbmr.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dbmr dbmrVar = (dbmr) bZ.b;
            dbnbVar.getClass();
            dbmrVar.b = dbnbVar;
            dbmrVar.a |= 1;
            k2.j("pa.pra", bZ.bK(), (dssr) dbmt.a.cu(7));
        }
    }

    public final dbsg<aptb> k() {
        ges gesVar = (ges) this.a.K();
        return gesVar instanceof aptb ? dbsg.i((aptb) gesVar) : dbpy.a;
    }

    @Override // defpackage.apup
    public final void l(apuo apuoVar) {
        this.b.add(apuoVar);
    }

    @Override // defpackage.apup
    public final void m(apuo apuoVar) {
        this.b.remove(apuoVar);
    }

    @Override // defpackage.apup
    public final void n(ilo iloVar, dipk dipkVar) {
        String str;
        if (this.f.a() != null) {
            begj begjVar = new begj();
            begjVar.b(iloVar);
            begjVar.c = jjn.FULLY_EXPANDED;
            this.f.a().k(bege.UPDATES);
            this.f.a().o(begjVar, false, null);
        }
        if (!iloVar.ai().equals(this.i)) {
            this.h.clear();
        }
        for (apuo apuoVar : this.b) {
            apuoVar.a(dipkVar);
        }
        this.h.add(0, Long.valueOf(dipkVar.d));
        this.i = iloVar.ai();
        View findViewById = this.a.findViewById(16908290);
        gga ggaVar = this.a;
        Object[] objArr = new Object[1];
        cruf crufVar = cruf.PRECHECK_STATUS_UNKNOWN;
        dboe dboeVar = dboe.POST_TOPIC_TYPE_UNSPECIFIED;
        int a = dgce.a(dipkVar.f);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            if (i == 2) {
                str = "event";
            } else if (i == 3) {
                str = "offer";
            } else if (i == 4) {
                str = "product";
            } else if (i != 6) {
                str = "post";
            }
            objArr[0] = str;
            ckos.a(findViewById, ggaVar.getString(R.string.POST_CREATED_TOAST, objArr), 4000).c();
        }
        str = "update";
        objArr[0] = str;
        ckos.a(findViewById, ggaVar.getString(R.string.POST_CREATED_TOAST, objArr), 4000).c();
    }

    @Override // defpackage.apup
    public final void o(ilo iloVar, long j) {
        ckos.a(this.a.findViewById(16908290), this.a.getString(R.string.POST_DELETED_TOAST), 4000).c();
        if (!iloVar.ai().equals(this.i)) {
            this.h.clear();
        }
        for (apuo apuoVar : this.b) {
            apuoVar.b(j);
        }
        this.h.remove(Long.valueOf(j));
        this.i = iloVar.ai();
    }

    @Override // defpackage.apup
    public final dcdc<Long> p() {
        return dcdc.r(this.h);
    }

    @Override // defpackage.apup
    public final void r(dipk dipkVar) {
        if (this.b.isEmpty()) {
            return;
        }
        for (apuo apuoVar : this.b) {
            apuoVar.c(dipkVar);
        }
    }
}
