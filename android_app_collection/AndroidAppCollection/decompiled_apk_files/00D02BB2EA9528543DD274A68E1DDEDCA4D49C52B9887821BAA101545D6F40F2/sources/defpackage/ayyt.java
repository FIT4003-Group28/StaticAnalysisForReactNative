package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayyt  reason: default package */
/* loaded from: classes3.dex */
public class ayyt extends brwd implements ayyg {
    public ilo a;
    private final begg b;
    private final befw c;
    private final bwqv d;
    private final bvqg<ilo> e;
    private final cjtd f;

    public ayyt(Application application, bvjj bvjjVar, dxio<akfa> dxioVar, aeqg aeqgVar, brvm brvmVar, bmmq bmmqVar, bfhu bfhuVar, bfgx bfgxVar, ahjq ahjqVar, begg beggVar, befw befwVar, bwqv bwqvVar, bruu bruuVar, bnjs bnjsVar, ilo iloVar, bvqg<ilo> bvqgVar, cjtd cjtdVar) {
        super(application, bvjjVar, dxioVar, aeqgVar, bmmqVar, bfhuVar, null, bfgxVar, ahjqVar, bnjsVar, null, ayyr.a, dtyb.dL, null, null, true, null, null, dtyb.dL, bruuVar);
        this.b = beggVar;
        this.c = befwVar;
        this.d = bwqvVar;
        this.a = iloVar;
        this.e = bvqgVar;
        this.f = cjtdVar;
    }

    @Override // defpackage.brwd, defpackage.brvd
    public Integer Qy() {
        return 1;
    }

    @Override // defpackage.ayyg
    @dzsi
    public jic a() {
        bwrs<ilo> a = bwrs.a(this.a);
        this.d.f(a, new bwrr(this) { // from class: ayys
            private final ayyt a;

            {
                this.a = this;
            }

            @Override // defpackage.bwrr
            public final void PV(Object obj) {
                ayyt ayytVar = this.a;
                ilo iloVar = (ilo) obj;
                if (iloVar == null || iloVar.equals(ayytVar.a)) {
                    return;
                }
                ayytVar.a = iloVar;
                cqkx.p(ayytVar);
            }
        }, true);
        befw befwVar = this.c;
        befu p = befv.p();
        p.j(a);
        String str = null;
        ((befp) p).a = null;
        p.l(false);
        p.k(true);
        befwVar.d(p.m());
        ilo iloVar = this.a;
        if (iloVar.aE().isEmpty() || (iloVar.aE().get(0).a & 128) == 0 || !ckqj.e(iloVar.aE().get(0).h)) {
            if ((iloVar.bJ().a & 128) == 0 || !ckqj.e(iloVar.bJ().h)) {
                if (iloVar.bF().a.size() > 0 && (iloVar.bF().a.get(0).a & 128) != 0 && ckqj.e(iloVar.bF().a.get(0).h)) {
                    str = iloVar.bF().a.get(0).h;
                }
            } else {
                str = iloVar.bJ().h;
            }
        } else {
            str = iloVar.aE().get(0).h;
        }
        return new jic(str, ckqc.FIFE, iup.e(R.raw.own_list), 250);
    }

    @Override // defpackage.brvd
    public Boolean d() {
        return false;
    }

    @Override // defpackage.brvd
    public cqtv e() {
        return cqrp.d(102.0d);
    }

    @Override // defpackage.brvd
    public Boolean f() {
        return false;
    }

    @Override // defpackage.brvd
    public Boolean g() {
        return false;
    }

    @Override // defpackage.brwd
    protected final float h() {
        return 2.14748365E9f;
    }

    @Override // defpackage.brwd
    @dzsi
    protected final dkee i() {
        return dkee.RICH;
    }

    @Override // defpackage.ayyg
    public cqkl l() {
        this.e.NU(this.a);
        return cqkl.a;
    }

    @Override // defpackage.ayyg
    public CharSequence n() {
        return this.a.n();
    }

    @Override // defpackage.ayyg
    public cjtd o() {
        return this.f;
    }

    @Override // defpackage.brwd, defpackage.brvd
    public Boolean p() {
        return true;
    }

    @Override // defpackage.brwd, defpackage.brvd
    public cqkl q() {
        if (this.a != null) {
            begg beggVar = this.b;
            begj begjVar = new begj();
            begjVar.b(this.a);
            begjVar.n = true;
            begjVar.c = jjn.EXPANDED;
            begjVar.H = false;
            begjVar.c(false);
            beggVar.n(begjVar, false, null);
        }
        return cqkl.a;
    }
}
