package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: bccs  reason: default package */
/* loaded from: classes3.dex */
public final class bccs extends bcce {
    @dzsi
    private cqkf<jar> aA;
    private bcbs aC;
    public boolean ad;
    public bwqv ae;
    public cjqy af;
    public cqkj ag;
    public efg ah;
    public bvrb ai;
    public btvo aj;
    public dxio<amfi> ak;
    public dxio<bbut> al;
    public dxio<apni> am;
    public bcbt an;
    public bcni ao;
    public bckt ap;
    public bckz aq;
    @dzsi
    private ViewGroup at;
    @dzsi
    private cqkf<bcma> au;
    private bckv aw;
    private bcku ax;
    private bcky ay;
    private cjtd az;
    @dzsi
    public bwrs<ilo> c;
    public bcma d;
    @dzsi
    public dwfl e;
    public bcbn f;
    public bcmn g;
    public boolean b = false;
    private boolean as = false;
    private HashMap<String, Parcelable> av = new HashMap<>();
    private final bccp aB = new bccp(this);

    private final void bn() {
        this.ad = false;
        gn gnVar = this.A;
        dbsk.s(gnVar);
        gnVar.g(bc(), 1);
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            cjxu.j(ggaVar, this.ai, Rp(R.string.UNKNOWN_ERROR));
        }
    }

    public static Bundle w(bwqv bwqvVar, bbuq bbuqVar, @dzsi bwrs<ilo> bwrsVar, @dzsi dwfl dwflVar) {
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "photoUrlOverviewManager", bbuqVar);
        if (bwrsVar != null) {
            bwqvVar.c(bundle, "placemark", bwrsVar);
        }
        if (dwflVar != null) {
            bvrs.k(bundle, "photo", dwflVar);
        }
        return bundle;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        if (!this.ad) {
            super.Qe();
            return;
        }
        this.av.clear();
        if (this.au != null) {
            ArrayList arrayList = new ArrayList();
            cqkx.g(this.au.c(), bcfw.a, RecyclerView.class, arrayList);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                cqkp i2 = cqkx.i(recyclerView);
                if (i2 instanceof bclv) {
                    bclv bclvVar = (bclv) i2;
                    this.av.put(bclvVar.a(), ((aag) recyclerView.l).B());
                    recyclerView.k();
                    abw m = bclvVar.m(recyclerView);
                    if (m != null) {
                        recyclerView.E(m);
                    }
                }
            }
        }
        cqkf<bcma> cqkfVar = this.au;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            ViewGroup viewGroup = this.at;
            if (viewGroup != null) {
                viewGroup.removeView(this.au.c());
            }
            this.au = null;
        }
        cqkf<jar> cqkfVar2 = this.aA;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
            this.aA = null;
        }
        this.at = null;
        super.Qe();
    }

    final View aJ(View view, gga ggaVar) {
        if (!this.b) {
            bwrs<ilo> bwrsVar = this.c;
            jib jibVar = null;
            ilo c = bwrsVar != null ? bwrsVar.c() : null;
            if (c != null) {
                jhz e = jib.g(ggaVar, c.n()).e();
                e.x = true;
                e.o = cjtd.a(dtxy.bN);
                jibVar = e.b();
            }
            if (jibVar == null) {
                return view;
            }
            hxg hxgVar = new hxg((Context) ggaVar, false);
            hxgVar.setContentView(view);
            hxgVar.setToolbarProperties(jibVar);
            return hxgVar;
        }
        return view;
    }

    @Override // defpackage.begd
    public final bege aR() {
        return bege.PHOTOS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aS(@dzsi bclv bclvVar) {
        if (bclvVar == null || !bclvVar.v().booleanValue()) {
            return false;
        }
        bwrs<ilo> bwrsVar = this.c;
        ilo c = bwrsVar != null ? bwrsVar.c() : null;
        return c != null && c.aX(this.aj.getEnableFeatureParameters());
    }

    @Override // defpackage.bfdi, defpackage.begd
    public final void aT() {
        final RecyclerView aU = aU();
        if (aU == null) {
            return;
        }
        aU.post(new Runnable(aU) { // from class: bcco
            private final RecyclerView a;

            {
                this.a = aU;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.l(0);
            }
        });
    }

    @dzsi
    public final RecyclerView aU() {
        if (this.au == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        cqkx.g(this.au.c(), bcfw.a, RecyclerView.class, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
            cqkp i2 = cqkx.i(recyclerView);
            if ((i2 instanceof bclv) && i2 == this.d.f()) {
                return recyclerView;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bfdi
    public final bwrs<ilo> aV() {
        bwrs<ilo> bwrsVar = this.c;
        return bwrsVar != null ? bwrsVar : bwrs.a(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<bclv> aX() {
        return this.d.g();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.at = viewGroup;
        gga ggaVar = this.aE;
        if (!this.ad || ggaVar == null) {
            return null;
        }
        cqkf<bcma> c = this.ag.c(new bcgh(), null);
        bcma bcmaVar = this.d;
        bwrs<ilo> bwrsVar = this.c;
        bcmaVar.e(bwrsVar != null ? bwrsVar.c() : null);
        View c2 = c.c();
        this.au = c;
        c.e(this.d);
        bwrs<ilo> bwrsVar2 = this.c;
        ilo c3 = bwrsVar2 != null ? bwrsVar2.c() : null;
        if (c3 != null) {
            cjta b = cjtd.b();
            b.d = dtxy.ce;
            b.b = c3.a().e;
            cqkx.d(c2, bcgh.a).setOnTouchListener(this.ap.a(b.a()));
            ViewGroup e = gwu.e(c2);
            cqkf<jar> c4 = this.ag.c(new gvs(), e);
            this.aA = c4;
            bcmn bcmnVar = new bcmn(c3, this.al.a(), ggaVar, ivu.FIXED, jaq.DAY_NIGHT_WHITE_ON_BLUE, 2131231769, ggaVar.getString(R.string.UPLOAD_PHOTO), cjtd.a(dtxy.bK), aS(this.d.f()), R.id.photo_gallery_add_a_photo_button);
            this.g = bcmnVar;
            c4.e(bcmnVar);
            return aJ(e, ggaVar);
        }
        FrameLayout frameLayout = new FrameLayout(ggaVar);
        frameLayout.addView(c2);
        return aJ(frameLayout, ggaVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        if (this.ad) {
            View view = this.P;
            if (view != null) {
                this.ak.a().g((ViewGroup) view);
            }
            super.am();
            return;
        }
        super.am();
    }

    @Override // defpackage.bcce
    public final bckv g() {
        if (this.aw == null) {
            this.aw = new bccr(this);
        }
        return this.aw;
    }

    @Override // defpackage.bcce
    public final bcku i() {
        if (this.ax == null) {
            this.ax = new bccq();
        }
        return this.ax;
    }

    @Override // defpackage.bfdi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        bbur bburVar;
        dcdc<dweu> e;
        HashMap hashMap = new HashMap();
        try {
            Bundle bundle2 = this.o;
            this.b = bundle2.getBoolean("isDisplayedAsPlacePageTab");
            this.as = this.am.a().a();
            bwrs<ilo> e2 = this.ae.e(ilo.class, bundle2, "placemark");
            this.c = e2;
            String str = null;
            ilo c = e2 != null ? e2.c() : null;
            if (bundle2.containsKey("photo")) {
                dwfl dwflVar = (dwfl) bvrs.f(bundle2, "photo", (dssr) dwfl.w.cu(7));
                dbsk.s(dwflVar);
                this.e = dwflVar;
            }
            bcbn bcbnVar = (bcbn) bundle2.getSerializable("autoOpenCollection");
            this.f = bcbnVar;
            if (bcbnVar == null) {
                this.f = bcbn.a;
            }
            cjta b = cjtd.b();
            b.d = dtxy.bI;
            if (c != null) {
                str = c.a().e;
            }
            b.b = str;
            this.az = b.a();
            if (bundle != null) {
                HashMap hashMap2 = (HashMap) bundle.getSerializable("photoUrlManagers");
                if (hashMap2 != null) {
                    hashMap.putAll(hashMap2);
                }
                HashMap<String, Parcelable> hashMap3 = (HashMap) bundle.getSerializable("layoutState");
                if (hashMap3 != null) {
                    this.av = hashMap3;
                }
            }
            bbuq bbuqVar = (bbuq) this.ae.d(bbuq.class, bundle2, "photoUrlOverviewManager");
            if (bbuqVar != null) {
                hashMap.put(bcbv.b, bbuqVar);
            }
            gga ggaVar = this.aE;
            if (ggaVar == null) {
                bn();
                return;
            }
            this.ad = true;
            bcbt bcbtVar = this.an;
            if (this.f.b().a()) {
                bburVar = this.f.b().b();
            } else {
                bburVar = bbur.DEFAULT;
            }
            dwfl dwflVar2 = this.e;
            boolean z = this.as;
            cjtd cjtdVar = this.az;
            bcbt.a(hashMap, 2);
            bcbt.a(bburVar, 3);
            bcbt.a(cjtdVar, 6);
            Activity activity = (Activity) ((dxjd) bcbtVar.a).a;
            bcbt.a(activity, 7);
            btvo a = bcbtVar.b.a();
            bcbt.a(a, 8);
            bckv a2 = bcbtVar.c.a();
            bcbt.a(a2, 9);
            bcmv a3 = bcbtVar.d.a();
            bcbt.a(a3, 10);
            bcoi a4 = bcbtVar.e.a();
            bcbt.a(a4, 11);
            bcol a5 = bcbtVar.f.a();
            bcbt.a(a5, 12);
            bcot a6 = bcbtVar.g.a();
            bcbt.a(a6, 13);
            bcoq a7 = bcbtVar.h.a();
            bcbt.a(a7, 14);
            bcbs bcbsVar = new bcbs(c, hashMap, bburVar, dwflVar2, z, cjtdVar, activity, a, a2, a3, a4, a5, a6, a7);
            dbuh.d(bcbsVar);
            this.aC = bcbsVar;
            int a8 = cknv.a(ggaVar.getWindowManager());
            dcpd<bbuq> it = this.aC.a.values().iterator();
            while (it.hasNext()) {
                it.next().a(a8, a8);
            }
            super.l(bundle);
            this.ay = this.aq.a(bcgn.a, bclb.a(g()));
            dcdc<bclv> e3 = this.aC.e();
            int size = e3.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                e3.get(i2).o(this.ay);
            }
            try {
                e = this.aC.a().get();
            } catch (InterruptedException | ExecutionException unused) {
                bvoo.h("Future with relevant collection couldn't be properly evaluated.", new Object[0]);
                e = dcdc.e();
            }
            int size2 = e.size();
            int i3 = 0;
            int i4 = 1;
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                if (this.aC.c(e.get(i3))) {
                    i = i4;
                    break;
                } else {
                    i4++;
                    i3++;
                }
            }
            bcni bcniVar = this.ao;
            cjqy cjqyVar = this.af;
            cjtd cjtdVar2 = this.az;
            bcni.a(e3, 1);
            bckv a9 = bcniVar.a.a();
            bcni.a(a9, 2);
            bcni.a(cjqyVar, 3);
            bcni.a(cjtdVar2, 4);
            bcnh bcnhVar = new bcnh(e3, a9, cjqyVar, cjtdVar2);
            this.d = bcnhVar;
            bcnhVar.a(i);
        } catch (IOException | ClassCastException | NullPointerException unused2) {
            super.l(bundle);
            bn();
        }
    }

    @Override // defpackage.bcce
    @dzsi
    public final bcbx q() {
        return this.aC;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (!this.ad) {
            return;
        }
        if (!this.b) {
            egj egjVar = new egj(this);
            egjVar.w(this.P);
            egjVar.ag(null);
            egjVar.e(this);
            egjVar.f(true);
            this.ah.a(egjVar.a());
        }
        this.d.h(this.av);
        View view = this.P;
        if (view != null) {
            view.setBackgroundColor(-1);
        }
        bwrs<ilo> bwrsVar = this.c;
        if (bwrsVar == null) {
            return;
        }
        this.ae.g(bwrsVar, this.aB);
        this.aB.a = true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bcbs bcbsVar = this.aC;
        if (bcbsVar != null) {
            bundle.putSerializable("photoUrlManagers", bcbsVar.a);
        }
        bundle.putSerializable("layoutState", this.av);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        bwrs<ilo> bwrsVar;
        if (this.ad && (bwrsVar = this.c) != null) {
            bwqv.t(bwrsVar, this.aB);
            this.aB.a = false;
        }
        super.u();
    }
}
