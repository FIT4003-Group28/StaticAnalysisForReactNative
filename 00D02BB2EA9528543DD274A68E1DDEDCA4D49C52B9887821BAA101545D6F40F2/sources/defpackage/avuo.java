package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gmm.base.views.map.MapViewContainer;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avuo  reason: default package */
/* loaded from: classes3.dex */
public final class avuo extends ges implements avvo, ggg {
    public gfq a;
    private cqkf<? super avvp> ad;
    public cqkj b;
    public dxio<akzh> c;
    public efg d;
    public avvv e;
    public avyc f;
    public avvp g;

    public static avuo g(dltm dltmVar) {
        avuo avuoVar = new avuo();
        Bundle bundle = new Bundle();
        bundle.putByteArray("region", dltmVar.bS());
        avuoVar.B(bundle);
        return avuoVar;
    }

    private final void i() {
        cqkf<? super avvp> c;
        cqkf<? super avvp> cqkfVar = this.ad;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        if (Rn().getConfiguration().orientation != 2) {
            c = this.b.c(new avvm(), null);
        } else {
            c = this.b.c(new avvj(), null);
        }
        this.ad = c;
        c.e(this.g);
        efg efgVar = this.d;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.ad.c());
        egjVar.f(false);
        egjVar.j(true);
        egjVar.J(new egq(this) { // from class: avum
            private final avuo a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                avuo avuoVar = this.a;
                View view = eguVar.y;
                if (view == null) {
                    return;
                }
                View a = cqhu.a(view, avsw.a);
                dbsk.s(a);
                akox l = ((MapViewContainer) a).l();
                if (l == null) {
                    return;
                }
                dcdc<akqs> c2 = avuoVar.g.c();
                akqs b = avuoVar.g.b();
                if (b == null) {
                    return;
                }
                View a2 = cqhu.a(view, avsw.b);
                dbsk.s(a2);
                akyc n = akyt.n(b, 20, 20, 20, 20);
                n.b = 0;
                l.q(n, new avun(avuoVar, (awni) a2, c2));
            }
        });
        egf g = egf.g();
        g.h = ardz.NONE;
        egjVar.A(g);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges
    protected final void Nv() {
        dxix.a(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        byte[] byteArray = this.o.getByteArray("region");
        if (byteArray != null) {
            try {
                dltm dltmVar = (dltm) ((dssr) dltm.t.cu(7)).j(byteArray);
                avvv avvvVar = this.e;
                fd fdVar = (fd) ((dxjd) avvvVar.a).a;
                avvv.a(fdVar, 1);
                avij a = avvvVar.b.a();
                avvv.a(a, 2);
                Executor a2 = avvvVar.c.a();
                avvv.a(a2, 3);
                Executor a3 = avvvVar.d.a();
                avvv.a(a3, 4);
                cjqy a4 = avvvVar.e.a();
                avvv.a(a4, 5);
                cjqq a5 = avvvVar.f.a();
                avvv.a(a5, 6);
                avik a6 = avvvVar.g.a();
                avvv.a(a6, 7);
                btvo a7 = avvvVar.h.a();
                avvv.a(a7, 8);
                away a8 = avvvVar.i.a();
                avvv.a(a8, 9);
                akfa a9 = avvvVar.j.a();
                avvv.a(a9, 10);
                avuk a10 = avvvVar.k.a();
                avvv.a(a10, 11);
                avzo a11 = avvvVar.l.a();
                avvv.a(a11, 12);
                avzm a12 = avvvVar.m.a();
                avvv.a(a12, 13);
                avzp a13 = avvvVar.n.a();
                avvv.a(a13, 14);
                avvv.a(dltmVar, 15);
                avvv.a(this, 16);
                try {
                    try {
                        this.g = new avvu(fdVar, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, dltmVar, this);
                        return;
                    } catch (dsrm unused) {
                        return;
                    }
                } catch (dsrm unused2) {
                    return;
                }
            } catch (dsrm unused3) {
                return;
            }
        }
        byte[] byteArray2 = this.o.getByteArray("geometry");
        if (byteArray2 == null) {
            return;
        }
        try {
            dlug dlugVar = (dlug) ((dssr) dlug.c.cu(7)).j(byteArray2);
            avyc avycVar = this.f;
            fd fdVar2 = (fd) ((dxjd) avycVar.a).a;
            avyc.a(fdVar2, 1);
            Executor a14 = avycVar.b.a();
            avyc.a(a14, 2);
            cjqy a15 = avycVar.c.a();
            avyc.a(a15, 3);
            cjqq a16 = avycVar.d.a();
            avyc.a(a16, 4);
            avik a17 = avycVar.e.a();
            avyc.a(a17, 5);
            away a18 = avycVar.f.a();
            avyc.a(a18, 6);
            avzm a19 = avycVar.g.a();
            avyc.a(a19, 7);
            avyc.a(dlugVar, 8);
            this.g = new avyb(fdVar2, a14, a15, a16, a17, a18, a19, dlugVar);
        } catch (dsrm unused4) {
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.a;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.g.s();
        i();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ad.e(null);
        this.g.t();
        super.u();
    }
}
