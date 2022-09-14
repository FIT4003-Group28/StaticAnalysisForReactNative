package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
/* compiled from: PG */
/* renamed from: bcpz  reason: default package */
/* loaded from: classes3.dex */
public final class bcpz extends ges implements bcpd {
    private static final dcqe ao = dcqe.c("bcpz");
    public cqkj a;
    public bcri ad;
    public bcrm ae;
    public bdek af;
    public bdpw ag;
    public bcqs ah;
    public bcqy ai;
    public afxv aj;
    public bdej ak;
    public bdcn al;
    public bbty am;
    public bbuq an;
    private cqkf<bdau> ap;
    private ViewPager aq;
    private bdpk ar;
    @dzsi
    private ilo as;
    @dzsi
    private String at;
    @dzsi
    private Bitmap au;
    private bbup av;
    public efg b;
    public eeu c;
    public bwqv d;
    public gfq e;
    public btvo f;
    public buti g;

    private final void aJ() {
        bbuq g = g();
        int intValue = this.ak.e().intValue();
        if (intValue < g.d()) {
            int d = g.d() - 1;
            g.i(intValue);
            this.ak.o(intValue);
            if (g.d() == 0) {
                e();
            } else if (intValue == d) {
                this.aq.setCurrentItem(g.d() - 1);
            } else {
                cqkx.p(this.ak);
            }
        }
    }

    private final void aR(int i) {
        bbuq g = g();
        bbtz g2 = bbua.g();
        int d = g.d();
        ArrayList arrayList = new ArrayList(d);
        for (int i2 = 0; i2 < d; i2++) {
            dwfl e = g.e(i2);
            dbsk.s(e);
            arrayList.add(e);
        }
        g2.e(arrayList);
        int d2 = g.d();
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < d2; i3++) {
            dwfl e2 = g.e(i3);
            dbsk.s(e2);
            if ((e2.a & 512) != 0) {
                if (g.a.b(e2.h)) {
                    hashSet.add(e2);
                }
            }
        }
        g2.d(hashSet);
        int d3 = g.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet2 = new HashSet();
        for (int i4 = 0; i4 < d3; i4++) {
            dwfl e3 = g.e(i4);
            dbsk.s(e3);
            if (!linkedHashMap.containsKey(e3.d)) {
                linkedHashMap.put(e3.d, g.b.a(e3));
            } else {
                hashSet2.add(e3.d);
            }
        }
        linkedHashMap.keySet().removeAll(hashSet2);
        g2.c(linkedHashMap);
        g2.b(i);
        if (this.am.p()) {
            int d4 = g.d();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (int i5 = 0; i5 < d4; i5++) {
                dwfl e4 = g.e(i5);
                dbsk.s(e4);
                String str = e4.d;
                Boolean o = g.o(str);
                if (o != null) {
                    linkedHashMap2.put(str, o);
                }
            }
            g2.f(linkedHashMap2);
        }
        Nw(g2.a());
        fd fdVar = this.D;
        if (fdVar instanceof bcqw) {
            ((bcqw) fdVar).w();
        } else {
            gfq.l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static View q(ViewGroup viewGroup, @dzsi Object obj) {
        View q;
        if (obj != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (obj.equals(childAt.getTag(R.id.lightbox_photo_tag))) {
                    return childAt;
                }
                if ((childAt instanceof ViewGroup) && (q = q((ViewGroup) childAt, obj)) != null) {
                    return q;
                }
            }
        }
        return null;
    }

    private final bdej w(int i) {
        Bitmap bitmap = this.au;
        cqtd a = bitmap != null ? cqtt.a(bitmap) : null;
        bcqs bcqsVar = this.ah;
        bbuq g = g();
        bdpk bdpkVar = this.ar;
        gga a2 = bcqsVar.a.a();
        bcqs.a(a2, 1);
        bwqv a3 = bcqsVar.b.a();
        bcqs.a(a3, 2);
        dxio a4 = ((dxjh) bcqsVar.c).a();
        bcqs.a(a4, 3);
        bcqs.a(bcqsVar.d.a(), 4);
        cqkj a5 = bcqsVar.e.a();
        bcqs.a(a5, 5);
        ccst a6 = bcqsVar.f.a();
        bcqs.a(a6, 6);
        bvrb a7 = bcqsVar.g.a();
        bcqs.a(a7, 7);
        bcqs.a(g, 8);
        bcqs.a(this, 9);
        bcqs.a(bdpkVar, 10);
        bcqr bcqrVar = new bcqr(a2, a3, a4, a5, a6, a7, g, this, bdpkVar);
        ilo iloVar = this.as;
        bcqx a8 = (iloVar == null || !iloVar.aX(this.f.getEnableFeatureParameters()) || !this.am.m() || !this.f.getEnableFeatureParameters().p) ? null : this.ai.a(iloVar);
        bcrh a9 = this.ad.a(this.am.w(), this.f, iloVar);
        bcrl a10 = this.ae.a(this.am.q(), this);
        bdek bdekVar = this.af;
        bbuq bbuqVar = this.an;
        bbty bbtyVar = this.am;
        String str = this.at;
        bcpy bcpyVar = new bcpy(this);
        bdek.a(bbuqVar, 1);
        bdek.a(bbtyVar, 2);
        bdek.a(bcpyVar, 5);
        bdek.a(bcqrVar, 6);
        bdek.a(a9, 8);
        bdek.a(a10, 9);
        Activity activity = (Activity) ((dxjd) bdekVar.a).a;
        bdek.a(activity, 12);
        btvo a11 = bdekVar.b.a();
        bdek.a(a11, 13);
        ckcw a12 = bdekVar.c.a();
        bdek.a(a12, 14);
        bvrb a13 = bdekVar.d.a();
        bdek.a(a13, 15);
        cjqy a14 = bdekVar.e.a();
        bdek.a(a14, 16);
        cjqq a15 = bdekVar.f.a();
        bdek.a(a15, 17);
        bwsh a16 = bdekVar.g.a();
        bdek.a(a16, 18);
        bdfe a17 = bdekVar.h.a();
        bdek.a(a17, 19);
        bdbx a18 = bdekVar.i.a();
        bdek.a(a18, 20);
        bdch a19 = bdekVar.j.a();
        bdek.a(a19, 21);
        bdcj a20 = bdekVar.k.a();
        bdek.a(a20, 22);
        cqhn a21 = bdekVar.l.a();
        bdek.a(a21, 23);
        ckmm a22 = bdekVar.m.a();
        bdek.a(a22, 24);
        bddb a23 = bdekVar.n.a();
        bdek.a(a23, 25);
        bdej bdejVar = new bdej(bbuqVar, bbtyVar, i, str, bcpyVar, bcqrVar, a8, a9, a10, a, iloVar, activity, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23);
        this.av = new bcpv(this, bdejVar);
        g().r(this.av);
        bdejVar.h();
        return bdejVar;
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof bdgu) {
            bdgu bdguVar = (bdgu) obj;
            if (bdguVar.a) {
                Toast.makeText(J(), true != bdguVar.b ? R.string.DELETE_USER_PHOTO_SUCCESS : R.string.DELETE_USER_VIDEO_SUCCESS, 1).show();
                aJ();
                return;
            }
            Toast.makeText(J(), true != bdguVar.b ? R.string.DELETE_USER_PHOTO_FAILED : R.string.DELETE_USER_VIDEO_FAILED, 1).show();
        } else if (obj instanceof anhe) {
            aJ();
        } else if (obj instanceof bcbc) {
            bcbc bcbcVar = (bcbc) obj;
            String a = bcbcVar.a();
            bbuq g = g();
            g.k(a, bcbcVar.b().a());
            if (!bcbcVar.b().a().isEmpty()) {
                g.n(a, true);
            }
            bdej w = w(i(null));
            this.ap.e(w);
            cqkx.p(w);
        } else if (obj instanceof anhc) {
            e();
        } else if (obj instanceof anhd) {
            Nw(obj);
        } else if (obj instanceof bdvs) {
            bdvs bdvsVar = (bdvs) obj;
            g().b.b(bdvsVar.a(), bdvsVar.b());
            cqkx.p(this.ak);
        } else if (obj instanceof bbua) {
            aR(((bbua) obj).f());
        } else if (!(obj instanceof bdgg)) {
        } else {
            bdgg bdggVar = (bdgg) obj;
            g().l(bdggVar.a(), bdggVar.b());
            cqkx.p(this.ak);
        }
    }

    @Override // defpackage.fd
    public final void Z(int i, int i2, Intent intent) {
        this.ar.d(i, i2, intent);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.ap = this.a.c(new bcze(), null);
        this.al = new bdcn(this, this.ap.c(), bcze.b, bctq.a);
        this.ak = w(i(bundle));
        ViewPager viewPager = (ViewPager) cqkx.e(this.ap.c(), bcze.a, ViewPager.class);
        this.aq = viewPager;
        viewPager.setOffscreenPageLimit(2);
        ViewPager viewPager2 = this.aq;
        final Context context = viewPager2.getContext();
        if (context != null) {
            viewPager2.setOnTouchListener(new bdvi(viewPager2, new bcpw(this, viewPager2), ViewConfiguration.get(context).getScaledDoubleTapSlop(), Rn().getInteger(17694720), new bcpx(this), new dbrn(context) { // from class: bcpr
                private final Context a;

                {
                    this.a = context;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return new aljd(this.a.getApplicationContext(), (aliy) obj);
                }
            }));
        }
        return this.ap.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        this.aj.m(new Runnable(this) { // from class: bcps
            private final bcpz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a.ak);
            }
        });
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        this.aj.a();
    }

    @Override // defpackage.bcpd
    public final void d(int i) {
        View view = this.P;
        if (view != null) {
            ckos.b(view, i, -1).c();
        }
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        aR(1);
        return true;
    }

    public final bbuq g() {
        try {
            if (this.an == null) {
                bbuq bbuqVar = (bbuq) this.d.d(bbuq.class, this.o, "PHOTO_URL_MANAGER");
                dbsk.s(bbuqVar);
                this.an = bbuqVar;
            }
        } catch (IOException e) {
            bvoo.h("Failed to unpack options from getArguments() %s", e);
        }
        return this.an;
    }

    final int i(@dzsi Bundle bundle) {
        bdej bdejVar = this.ak;
        if (bdejVar == null) {
            int i = this.o.getInt("INITIAL_INDEX", 0);
            return bundle != null ? bundle.getInt("INITIAL_INDEX", i) : i;
        }
        return bdejVar.e().intValue();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        int a = (int) (cknv.a(J().getWindowManager()) * J().getResources().getDisplayMetrics().density);
        g().a(a, a);
        try {
            bbty bbtyVar = (bbty) this.d.d(bbty.class, this.o, "PHOTO_ACTIONS_KEY");
            dbsk.s(bbtyVar);
            this.am = bbtyVar;
            this.as = (ilo) this.d.d(ilo.class, this.o, "placemark");
        } catch (IOException e) {
            bvoo.h("Failed to unpack options from getArguments() %s", e);
        }
        this.au = (Bitmap) this.o.getParcelable("TRANSITION_BITMAP");
        this.at = this.o.getString("CUSTOM_TITLE");
        this.o.remove("TRANSITION_BITMAP");
        this.ar = this.ag.a(this, new bcpt(this));
        if (bundle == null) {
            bundle = this.o;
        }
        this.ar.a(bundle);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.fk;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ak.i();
        this.ap.e(this.ak);
        if (this.D == null && this.c.h()) {
            efg efgVar = this.b;
            egj egjVar = new egj(this);
            egjVar.w(this.P);
            egjVar.x(egr.b);
            egjVar.ag(null);
            egjVar.e(this.ak);
            egjVar.f(false);
            egf a = egf.a();
            a.s = this.ak.k().booleanValue();
            egjVar.A(a);
            egjVar.J(new bcpu(this));
            efgVar.a(egjVar.a());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("INITIAL_INDEX", this.ak.e().intValue());
        this.ar.b(bundle);
        String str = this.at;
        if (str != null) {
            bundle.putString("CUSTOM_TITLE", str);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ak.j();
        this.ap.e(null);
        this.al.f();
        super.u();
    }
}
