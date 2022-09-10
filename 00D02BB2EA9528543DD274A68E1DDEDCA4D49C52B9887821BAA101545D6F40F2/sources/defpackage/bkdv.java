package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bkdv  reason: default package */
/* loaded from: classes3.dex */
public class bkdv implements bega, bkde {
    public final bkea b;
    public final bkdn c;
    private final Activity f;
    private final bken g;
    private final btvo h;
    private boolean i;
    private final bkdo m;
    @dzsi
    private bkdj o;
    private dgis j = dgis.d;
    private dcdc<bkdh> k = dcdc.e();
    public boolean d = false;
    private dcdc<bkdd> l = dcdc.e();
    public dcdc<bkdd> e = dcdc.e();
    private int p = 1;
    private final bked n = new bked();

    public bkdv(gga ggaVar, cqhn cqhnVar, bkdp bkdpVar, bkea bkeaVar, bken bkenVar, bkdn bkdnVar, btvo btvoVar) {
        this.f = ggaVar;
        this.b = bkeaVar;
        this.c = bkdnVar;
        this.g = bkenVar;
        this.h = btvoVar;
        dgis dgisVar = this.j;
        Activity activity = (Activity) ((dxjd) bkdpVar.a).a;
        bkdp.a(activity, 1);
        bkdc a = bkdpVar.b.a();
        bkdp.a(a, 2);
        bkdp.a(dgisVar, 3);
        this.m = new bkdo(activity, a, dgisVar);
    }

    @Override // defpackage.bkde
    public Boolean c() {
        return Boolean.valueOf(bkdc.a(this.j));
    }

    @Override // defpackage.bkde
    public abiu d() {
        return this.m;
    }

    @Override // defpackage.bkde
    @dzsi
    public bkdj f() {
        return this.o;
    }

    @Override // defpackage.bkde
    public View.OnAttachStateChangeListener g() {
        return this.n;
    }

    public Boolean h() {
        return false;
    }

    @Override // defpackage.bkde
    /* renamed from: i */
    public dcdc<bkdh> b() {
        return this.k;
    }

    @Override // defpackage.bkde
    /* renamed from: j */
    public dcdc<bkdd> e() {
        return this.e;
    }

    public final dcdc<bkdd> k() {
        if (this.d || this.l.size() <= 6) {
            return this.l;
        }
        return dcbg.b(this.l).x(5).n(new bkdl(this.l.size() - 5, new Runnable(this) { // from class: bkdu
            private final bkdv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bkdv bkdvVar = this.a;
                bkdvVar.d = true;
                bkdvVar.e = bkdvVar.k();
                cqkx.p(bkdvVar);
            }
        })).z();
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        dgje dgjeVar;
        ilo c = bwrsVar.c();
        if (c == null) {
            dgjeVar = dgje.f;
        } else {
            drdq drdqVar = c.bf().y;
            if (drdqVar == null) {
                drdqVar = drdq.c;
            }
            dgjeVar = drdqVar.a;
            if (dgjeVar == null) {
                dgjeVar = dgje.f;
            }
        }
        dgjc dgjcVar = dgjeVar.b;
        if (dgjcVar == null) {
            dgjcVar = dgjc.d;
        }
        dgio dgioVar = dgjeVar.c;
        if (dgioVar == null) {
            dgioVar = dgio.b;
        }
        dgis dgisVar = dgjcVar.c;
        if (dgisVar == null) {
            dgisVar = dgis.d;
        }
        this.j = dgisVar;
        int a = dgja.a(dgjeVar.e);
        if (a == 0) {
            a = 1;
        }
        this.p = a;
        this.i = dgjcVar.b.size() > 0 && !h().booleanValue();
        final int i = this.p;
        final boolean p = dcbg.b(dgjcVar.b).p(bkdq.a);
        final boolean p2 = dcbg.b(dgjcVar.b).p(bkdr.a);
        this.k = dcbg.b(dgjcVar.b).s(new dbrn(this, i, p, p2) { // from class: bkds
            private final bkdv a;
            private final boolean b;
            private final boolean c;
            private final int d;

            {
                this.a = this;
                this.d = i;
                this.b = p;
                this.c = p2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bkdv bkdvVar = this.a;
                int i2 = this.d;
                boolean z = this.b;
                boolean z2 = this.c;
                dgiy dgiyVar = (dgiy) obj;
                bkea bkeaVar = bkdvVar.b;
                if (i2 == 0) {
                    throw null;
                }
                return bkeaVar.a(dgiyVar, i2 == 3 ? dtxy.ov : dtxy.ow, z, z2);
            }
        }).z();
        this.d = false;
        final int i2 = this.p;
        this.l = dcbg.b(dgioVar.a).s(new dbrn(this, i2) { // from class: bkdt
            private final bkdv a;
            private final int b;

            {
                this.a = this;
                this.b = i2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bkdv bkdvVar = this.a;
                int i3 = this.b;
                dgim dgimVar = (dgim) obj;
                bkdn bkdnVar = bkdvVar.c;
                if (i3 != 0) {
                    ddho ddhoVar = i3 == 3 ? dtxy.or : dtxy.os;
                    bkdn.a(dgimVar, 1);
                    bkdn.a(ddhoVar, 2);
                    bkdc a2 = bkdnVar.a.a();
                    bkdn.a(a2, 3);
                    return new bkdm(dgimVar, ddhoVar, a2);
                }
                throw null;
            }
        }).z();
        this.e = k();
        this.m.a(this.j);
        if ((dgjeVar.a & 4) != 0) {
            bken bkenVar = this.g;
            dgjm dgjmVar = dgjeVar.d;
            if (dgjmVar == null) {
                dgjmVar = dgjm.c;
            }
            dgjm dgjmVar2 = dgjmVar;
            bken.a(dgjmVar2, 1);
            gga a2 = bkenVar.a.a();
            bken.a(a2, 2);
            busu a3 = bkenVar.b.a();
            bken.a(a3, 3);
            Executor a4 = bkenVar.c.a();
            bken.a(a4, 4);
            bkdc a5 = bkenVar.d.a();
            bken.a(a5, 5);
            jkf a6 = bkenVar.e.a();
            bken.a(a6, 6);
            bken.a(bkenVar.f.a(), 7);
            bken.a(bkenVar.g.a(), 8);
            cjqy a7 = bkenVar.h.a();
            bken.a(a7, 9);
            this.o = new bkem(dgjmVar2, a2, a3, a4, a5, a6, a7);
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.i = false;
        this.j = dgis.d;
        this.k = dcdc.e();
        this.d = false;
        this.l = dcdc.e();
        this.e = dcdc.e();
        this.m.a(this.j);
        this.p = 1;
        this.o = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.bkde
    public String a() {
        int i = this.p;
        if (i == 0) {
            throw null;
        }
        if (i != 3 || !this.h.getPlaceOfferingsParameters().j()) {
            return this.f.getString(R.string.PRODUCT_CAROUSEL_TITLE);
        }
        return this.f.getString(R.string.PRODUCT_CAROUSEL_TITLE_HIGH_FIDELITY);
    }
}
