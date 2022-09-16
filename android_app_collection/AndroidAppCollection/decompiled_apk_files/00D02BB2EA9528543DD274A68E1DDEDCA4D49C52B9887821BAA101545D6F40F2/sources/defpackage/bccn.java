package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bccn  reason: default package */
/* loaded from: classes3.dex */
public final class bccn extends bcce implements begp {
    public cqkj ad;
    public efg ae;
    public bvrb af;
    public dxio<amfi> ag;
    public dxio<apni> ah;
    public bclj ai;
    public btvo aj;
    public bccd ak;
    public bcly al;
    public begg am;
    @dzsi
    private cqkf<bcly> an;
    private bckv ao;
    private bcku ap;
    private bcbx at;
    public bcbn b;
    @dzsi
    public bwrs<ilo> d;
    @dzsi
    public dwfl e;
    public boolean f;
    public bwqv g;
    public boolean c = false;
    private final bcck aq = new bcck(this);
    private boolean as = false;

    private final void aX() {
        this.f = false;
        gn gnVar = this.A;
        dbsk.s(gnVar);
        gnVar.g(bc(), 1);
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            cjxu.j(ggaVar, this.af, Rp(R.string.UNKNOWN_ERROR));
        }
    }

    public static bccn w(bwqv bwqvVar, bwrs<ilo> bwrsVar, @dzsi dwfl dwflVar, bcbn bcbnVar, boolean z) {
        bccn bccnVar = new bccn();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "placemark", bwrsVar);
        if (dwflVar != null) {
            bvrs.k(bundle, "photo", dwflVar);
        }
        bundle.putBoolean("isDisplayedAsPlacePageTab", z);
        bundle.putSerializable("autoOpenCollection", bcbnVar);
        bccnVar.B(bundle);
        return bccnVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        if (!this.f) {
            super.Qe();
            return;
        }
        cqkf<bcly> cqkfVar = this.an;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.an = null;
        }
        bcly bclyVar = this.al;
        if (bclyVar != null) {
            bclyVar.o();
        }
        super.Qe();
    }

    final View aJ(View view, gga ggaVar) {
        if (!this.c) {
            bwrs<ilo> bwrsVar = this.d;
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

    @dzsi
    public final RecyclerView aS() {
        View view = this.P;
        if (view == null) {
            return null;
        }
        View a = cqhu.a(view, bcjo.a);
        if (a instanceof RecyclerView) {
            return (RecyclerView) a;
        }
        return null;
    }

    @Override // defpackage.bfdi, defpackage.begd
    public final void aT() {
        final RecyclerView aS = aS();
        if (aS == null) {
            return;
        }
        aS.post(new Runnable(aS) { // from class: bccj
            private final RecyclerView a;

            {
                this.a = aS;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.l(0);
            }
        });
    }

    @Override // defpackage.begp
    public final void aU() {
        bcly bclyVar = this.al;
        if (bclyVar != null) {
            bclyVar.j();
        }
        this.as = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bfdi
    public final bwrs<ilo> aV() {
        bwrs<ilo> bwrsVar = this.d;
        return bwrsVar != null ? bwrsVar : bwrs.a(null);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        gga ggaVar = this.aE;
        ilo iloVar = null;
        if (!this.f || ggaVar == null) {
            return null;
        }
        cqkf<bcly> c = this.ad.c(new bcjo(), null);
        bcly bclyVar = this.al;
        bwrs<ilo> bwrsVar = this.d;
        bclyVar.e(bwrsVar != null ? bwrsVar.c() : null);
        View c2 = c.c();
        this.an = c;
        c.e(this.al);
        bwrs<ilo> bwrsVar2 = this.d;
        if (bwrsVar2 != null) {
            iloVar = bwrsVar2.c();
        }
        if (iloVar != null) {
            return aJ(c2, ggaVar);
        }
        FrameLayout frameLayout = new FrameLayout(ggaVar);
        frameLayout.addView(c2);
        return aJ(frameLayout, ggaVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        if (this.f) {
            View view = this.P;
            if (view != null) {
                this.ag.a().g((ViewGroup) view);
            }
            super.am();
            return;
        }
        super.am();
    }

    @Override // defpackage.bcce
    public final bckv g() {
        if (this.ao == null) {
            this.ao = new bccm(this);
        }
        return this.ao;
    }

    @Override // defpackage.bcce
    public final bcku i() {
        if (this.ap == null) {
            this.ap = new bccl(this);
        }
        return this.ap;
    }

    @Override // defpackage.bfdi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        try {
            Bundle bundle2 = this.o;
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bcbn bcbnVar = (bcbn) bundle2.getSerializable("autoOpenCollection");
            if (bcbnVar == null) {
                bcbnVar = bcbn.a;
            }
            this.b = bcbnVar;
            if (bundle2.containsKey("photo")) {
                this.e = (dwfl) bvrs.f(bundle2, "photo", (dssr) dwfl.w.cu(7));
            }
            this.c = bundle2.getBoolean("isDisplayedAsPlacePageTab");
            bwrs<ilo> e = this.g.e(ilo.class, bundle2, "placemark");
            this.d = e;
            String str = null;
            ilo c = e != null ? e.c() : null;
            dcdn<Object, Object> dcdnVar = (dcdn) this.g.d(dcdn.class, bundle2, "photoUrlManagers");
            if (dcdnVar == null) {
                dcdnVar = dcmn.a;
            }
            dcdn<Object, Object> dcdnVar2 = dcdnVar;
            gga ggaVar = this.aE;
            if (ggaVar == null) {
                aX();
                return;
            }
            this.f = true;
            cjta b = cjtd.b();
            b.d = dtxy.bI;
            if (c != null) {
                str = c.a().e;
            }
            b.b = str;
            cjtd a = b.a();
            bccd bccdVar = this.ak;
            boolean a2 = this.ah.a().a();
            int a3 = cknv.a(ggaVar.getWindowManager());
            bcli l = this.al.l();
            bcku i = i();
            bclj bcljVar = this.ai;
            bccd.a(dcdnVar2, 2);
            bccd.a(a, 3);
            bccd.a(l, 6);
            bccd.a(i, 7);
            bccd.a(bcljVar, 8);
            Activity activity = (Activity) ((dxjd) bccdVar.a).a;
            bccd.a(activity, 9);
            bccd.a(bccdVar.b.a(), 10);
            buti a4 = bccdVar.c.a();
            bccd.a(a4, 11);
            bcmm a5 = bccdVar.d.a();
            bccd.a(a5, 12);
            bccd.a(bccdVar.e.a(), 13);
            bcmv a6 = bccdVar.f.a();
            bccd.a(a6, 14);
            bcof a7 = bccdVar.g.a();
            bccd.a(a7, 15);
            btvo a8 = bccdVar.h.a();
            bccd.a(a8, 16);
            bckv a9 = bccdVar.i.a();
            bccd.a(a9, 17);
            bhhf a10 = bccdVar.j.a();
            bccd.a(a10, 18);
            afxw a11 = bccdVar.k.a();
            bccd.a(a11, 19);
            this.at = new bccc(c, dcdnVar2, a, a2, a3, l, i, bcljVar, activity, a4, a5, a6, a7, a8, a9, a10, a11);
            super.l(bundle);
            if (this.c && !this.as) {
                return;
            }
            this.al.j();
        } catch (IOException | ClassCastException | NullPointerException unused) {
            super.l(bundle);
            aX();
        }
    }

    @Override // defpackage.bcce
    @dzsi
    public final bcbx q() {
        return this.at;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (!this.f) {
            return;
        }
        if (!this.c) {
            egj egjVar = new egj(this);
            egjVar.w(this.P);
            egjVar.ag(null);
            egjVar.e(this);
            egjVar.f(true);
            this.ae.a(egjVar.a());
        }
        bwrs<ilo> bwrsVar = this.d;
        if (bwrsVar != null) {
            this.g.g(bwrsVar, this.aq);
            this.aq.a = true;
        }
        if (!bege.PHOTOS.equals(this.am.j())) {
            return;
        }
        this.al.j();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bcbu b = this.at.b();
        if (b != null) {
            this.g.c(bundle, "photoUrlManagers", b.f());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        bwrs<ilo> bwrsVar;
        if (this.f && (bwrsVar = this.d) != null) {
            bwqv.t(bwrsVar, this.aq);
            this.aq.a = false;
        }
        super.u();
    }
}
