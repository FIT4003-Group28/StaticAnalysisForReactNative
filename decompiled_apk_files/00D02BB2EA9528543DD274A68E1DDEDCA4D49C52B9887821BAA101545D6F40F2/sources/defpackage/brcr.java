package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: brcr  reason: default package */
/* loaded from: classes4.dex */
public final class brcr extends gen {
    private static final dcqe ad = dcqe.c("brcr");
    public cqkj a;
    private brdl ag;
    @dzsi
    private String ah;
    @dzsi
    private brgb aj;
    @dzsi
    private cqkf<brgo> ak;
    public brba b;
    public brdi c;
    public brda d;
    public cqhn e;
    public Executor g;
    private boolean ae = false;
    private dgba af = dgba.b;
    private final brga ai = new brcq(this);

    public static brcr g(@dzsi String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("ev-profile-id-key", str);
        bundle.putBoolean("trigger-search-on-apply-key", z);
        brcr brcrVar = new brcr();
        brcrVar.B(bundle);
        return brcrVar;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<brgo> cqkfVar = this.ak;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        this.ak = null;
        super.Qe();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<brgo> c = this.a.c(new brdp(), viewGroup);
        this.ak = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.aj = null;
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        brcy a;
        brlk G;
        Ra(null);
        if (this.ae && (a = this.c.a(this.ag.a)) != null) {
            this.c.d(a.a());
            if (!this.af.equals(a.g()) && (G = this.b.G()) != null) {
                brln d = G.d();
                brlu e = G.e();
                if (d != null && e != null) {
                    dwir b = d.b();
                    dsqp dsqpVar = (dsqp) b.cu(5);
                    dsqpVar.bC(b);
                    dwim dwimVar = (dwim) dsqpVar;
                    bsjm bsjmVar = new bsjm(e.o);
                    bsjmVar.u(25, bsji.a, 2);
                    djmy djmyVar = ((dwir) dwimVar.b).K;
                    if (djmyVar == null) {
                        djmyVar = djmy.e;
                    }
                    dsqp dsqpVar2 = (dsqp) djmyVar.cu(5);
                    dsqpVar2.bC(djmyVar);
                    djmw djmwVar = (djmw) dsqpVar2;
                    djnk b2 = bsjmVar.b();
                    if (djmwVar.c) {
                        djmwVar.bF();
                        djmwVar.c = false;
                    }
                    djmy djmyVar2 = (djmy) djmwVar.b;
                    b2.getClass();
                    djmyVar2.b = b2;
                    djmyVar2.a |= 1;
                    if (dwimVar.c) {
                        dwimVar.bF();
                        dwimVar.c = false;
                    }
                    dwir dwirVar = (dwir) dwimVar.b;
                    djmy bK = djmwVar.bK();
                    bK.getClass();
                    dwirVar.K = bK;
                    dwirVar.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                    this.b.m(dwimVar, null);
                }
            }
        }
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        brcy c;
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        this.ae = bundle.getBoolean("trigger-search-on-apply-key");
        this.ah = bundle.getString("ev-profile-id-key");
        if (bundle.getByteArray("electric-vehicle-options-key") == null) {
            brcy c2 = this.c.c();
            this.af = c2 != null ? c2.g() : dgba.b;
        } else {
            try {
                byte[] byteArray = bundle.getByteArray("electric-vehicle-options-key");
                if (byteArray != null) {
                    this.af = (dgba) dsqw.cr(dgba.b, byteArray, dsqa.a());
                }
            } catch (dsrm e) {
                bvoo.f(new RuntimeException("Failed to parse ElectricVehicleOptions", e));
            }
        }
        try {
            String str = this.ah;
            brdi brdiVar = this.c;
            brda brdaVar = this.d;
            if (str != null) {
                c = brdiVar.a(str);
                if (c == null) {
                    throw new IOException("Could not find requested profile");
                }
            } else {
                c = brdiVar.c();
                if (c == null) {
                    dcdc<brcy> b = brdiVar.b();
                    if (!b.isEmpty()) {
                        c = b.get(0);
                    }
                    if (c == null) {
                        c = brdi.f();
                    }
                }
            }
            this.ag = brdl.a(brdaVar, c);
        } catch (IOException e2) {
            bvoo.f(new RuntimeException("Failed to get or create EvProfile", e2));
            Ra(null);
        }
        brgb brgbVar = new brgb(this.ai, this.c, this.ag, this.e, this.g, J());
        this.aj = brgbVar;
        brgbVar.a();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxo.aj;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        cqkf<brgo> cqkfVar;
        super.s();
        brgb brgbVar = this.aj;
        if (brgbVar == null || (cqkfVar = this.ak) == null) {
            aT();
            Object[] objArr = new Object[2];
            boolean z = false;
            objArr[0] = Boolean.valueOf(this.aj == null);
            if (this.ak == null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            bvoo.h("Cannot display Fragment: editViewModel == null is %b, viewHierarchy == null is %b", objArr);
            return;
        }
        cqkfVar.e(brgbVar);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putString("ev-profile-id-key", this.ah);
        bundle.putBoolean("trigger-search-on-apply-key", this.ae);
        bundle.putByteArray("electric-vehicle-options-key", this.af.bS());
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<brgo> cqkfVar = this.ak;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.u();
    }
}
