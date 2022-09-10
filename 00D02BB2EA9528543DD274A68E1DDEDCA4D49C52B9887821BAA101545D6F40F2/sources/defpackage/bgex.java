package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bgex  reason: default package */
/* loaded from: classes3.dex */
public final class bgex extends ges {
    public cqkj a;
    public cqkf<bgob> ad;
    private cqkf<jbk> ae;
    private bgob af;
    private dipk ag;
    private diov ah;
    private boolean ai;
    private boolean aj;
    private int ak;
    @dzsi
    private bwrs<ilo> al;
    private int am;
    public bgqe b;
    public dxio<efg> c;
    public bgpx d;
    public bwqv e;
    public dxio<begg> f;
    public cpv g;

    public static bgex g(bwqv bwqvVar, dipk dipkVar, diov diovVar, boolean z, boolean z2, int i, bwrs<ilo> bwrsVar, int i2) {
        bgex bgexVar = new bgex();
        Bundle bundle = new Bundle();
        bundle.putByteArray("LocalPostKey", dipkVar.bS());
        bundle.putByteArray("MediaKey", diovVar.bS());
        bundle.putBoolean("PlayingKey", z);
        bundle.putBoolean("MutedKey", z2);
        bundle.putInt("ProgressKey", i);
        bwqvVar.c(bundle, "Placemark", bwrsVar);
        bundle.putInt("ActiveLocalPostIndex", i2);
        bgexVar.B(bundle);
        return bgexVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<bgob> cqkfVar = this.ad;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        cqkf<jbk> cqkfVar2 = this.ae;
        dbsk.s(cqkfVar2);
        cqkfVar2.e(null);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        this.ae = this.a.d(new hxj(), viewGroup, false);
        this.ad = this.a.d(new bgml(), viewGroup, false);
        bgpw a = this.d.a(this, this.ae.c(), this.ad.c(), bgml.a);
        bwrs<ilo> bwrsVar = this.al;
        dbsk.s(bwrsVar);
        bgqe bgqeVar = this.b;
        dipk dipkVar = this.ag;
        diov diovVar = this.ah;
        int i = this.am;
        boolean z = this.ai;
        boolean z2 = this.aj;
        int i2 = this.ak;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        Activity activity = (Activity) ((dxjd) bgqeVar.a).a;
        bgqe.a(activity, 1);
        cqhn a2 = bgqeVar.b.a();
        bgqe.a(a2, 2);
        apqe a3 = bgqeVar.c.a();
        bgqe.a(a3, 3);
        cjqy a4 = bgqeVar.d.a();
        bgqe.a(a4, 4);
        gga a5 = bgqeVar.e.a();
        bgqe.a(a5, 5);
        bgos a6 = bgqeVar.f.a();
        bgqe.a(a6, 6);
        bgnj a7 = bgqeVar.g.a();
        bgqe.a(a7, 7);
        bgqe.a(dipkVar, 8);
        bgqe.a(diovVar, 9);
        bgqe.a(a, 14);
        bgqe.a(c, 15);
        bgqd bgqdVar = new bgqd(activity, a2, a3, a4, a5, a6, a7, dipkVar, diovVar, i, z, z2, i2, a, c);
        this.af = bgqdVar;
        this.ae.e(bgqdVar.g());
        this.ad.e(this.af);
        new Handler().postDelayed(new Runnable(this) { // from class: bgew
            private final bgex a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bgex bgexVar = this.a;
                bgexVar.g.f(cqhu.a(bgexVar.ad.c(), bgml.a), bgexVar.i());
            }
        }, 1000L);
        return null;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        gga ggaVar = this.aE;
        bwrs<ilo> bwrsVar = this.al;
        if (ggaVar == null || bwrsVar == null || this.am == -1 || ggaVar.z(bdyb.class) == null) {
            return false;
        }
        this.f.a().l(bege.UPDATES, bgev.g(this.e, bwrsVar, this.am));
        return true;
    }

    public final CharSequence i() {
        return J().getResources().getQuantityString(R.plurals.VIDEO_FOR_POST_FULL_SCREEN, this.ag.m.size(), Integer.valueOf(this.am + 1), Integer.valueOf(this.ag.m.indexOf(this.ah) + 1));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            this.ag = (dipk) dsqw.cq(dipk.x, this.o.getByteArray("LocalPostKey"));
            this.ah = (diov) dsqw.cr(diov.d, this.o.getByteArray("MediaKey"), dsqa.c());
            this.ai = this.o.getBoolean("PlayingKey");
            this.aj = this.o.getBoolean("MutedKey");
            this.ak = this.o.getInt("ProgressKey");
            if (this.o.containsKey("Placemark")) {
                try {
                    this.al = this.e.e(ilo.class, this.o, "Placemark");
                } catch (IOException e) {
                    throw new RuntimeException("Can't create LocalPostsVideoFragment without a placemark", e);
                }
            }
            if (!this.o.containsKey("ActiveLocalPostIndex")) {
                return;
            }
            this.am = this.o.getInt("ActiveLocalPostIndex");
        } catch (dsrm unused) {
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxu.aP;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.ad.c());
        egjVar.G(this.ae.c(), 1);
        this.c.a().a(egjVar.a());
    }
}
