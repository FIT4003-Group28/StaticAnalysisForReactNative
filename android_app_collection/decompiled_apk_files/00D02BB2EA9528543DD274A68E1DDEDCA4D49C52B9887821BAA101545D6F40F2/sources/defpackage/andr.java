package defpackage;

import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: andr  reason: default package */
/* loaded from: classes2.dex */
public class andr extends ancv implements bnyn<dwhf, dwhj> {
    @dzsi
    private akqq a;
    public cpv aA;
    protected bomy aB;
    protected andq aC;
    @dzsi
    protected ilo aO;
    @dzsi
    private bomn aP;
    private boolean aQ;
    private dosc aR;
    private final bomx aS = new andp(this);
    private akzy aT;
    @dzsi
    protected akqq au;
    @dzsi
    bnyp av;
    public bomz aw;
    public bnyo ax;
    public dxio<akpm> ay;
    public bpsq az;

    public static andr bt(@dzsi akqq akqqVar, boolean z, boolean z2, dosc doscVar, anee aneeVar) {
        Bundle bundle = new Bundle();
        andr andrVar = new andr();
        if (akqqVar != null) {
            ily ilyVar = new ily();
            ilyVar.q(akqqVar);
            bundle.putSerializable("placemark", ilyVar.d());
        }
        bundle.putBoolean("shouldReverseGeocodeKey", z);
        bundle.putBoolean("openInSatelliteMode", z2);
        bundle.putInt("viewportMetadataType", doscVar.l);
        bundle.putSerializable("args", aneeVar);
        andrVar.B(bundle);
        return andrVar;
    }

    public static final bnyw bw() {
        return new bnyw();
    }

    @Override // defpackage.ges
    public void Nv() {
        ((ands) btsx.b(ands.class, this)).bY(this);
    }

    @Override // defpackage.ancv
    protected final void aS(akpm akpmVar) {
        akqq akqqVar = this.a;
        if (akqqVar != null) {
            akyc i = akyt.i(akqqVar, 18.0f);
            i.b = aR();
            akpmVar.p(i);
            this.a = null;
        }
    }

    @Override // defpackage.ancv
    protected final boolean aV() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean bu(akqq akqqVar) {
        bnyp bnypVar;
        this.au = akqqVar;
        if (!this.aD) {
            return false;
        }
        if (this.aQ && (bnypVar = this.av) != null) {
            double d = akqqVar.a;
            double d2 = akqqVar.b;
            btzc btzcVar = bnypVar.a;
            if (btzcVar != null) {
                btzcVar.a();
            }
            dwhe bZ = dwhf.i.bZ();
            dhjy bZ2 = dhjz.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ2.b;
            int i = dhjzVar.a | 2;
            dhjzVar.a = i;
            dhjzVar.c = d;
            dhjzVar.a = i | 1;
            dhjzVar.b = d2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwhf dwhfVar = (dwhf) bZ.b;
            dhjz bK = bZ2.bK();
            bK.getClass();
            dwhfVar.b = bK;
            dwhfVar.a |= 1;
            dhjx Z = bnypVar.c.a().Z();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwhf dwhfVar2 = (dwhf) bZ.b;
            Z.getClass();
            dwhfVar2.c = Z;
            dwhfVar2.a |= 2;
            dwhf dwhfVar3 = (dwhf) bZ.b;
            dwhfVar3.e = 1;
            dwhfVar3.a |= 8;
            dnyc bZ3 = dnzj.Z.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnzj.g((dnzj) bZ3.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwhf dwhfVar4 = (dwhf) bZ.b;
            dnzj bK2 = bZ3.bK();
            bK2.getClass();
            dwhfVar4.d = bK2;
            dwhfVar4.a |= 4;
            bnypVar.a = bnypVar.b.b(bZ.bK(), this);
            this.aC.G();
            this.aC.H(true);
        }
        this.aC.c(false);
        bomy bomyVar = this.aB;
        dosc doscVar = this.aR;
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        bomyVar.a(doscVar, ggaVar, bw(), this.ax, this);
        return true;
    }

    public final void bv(boolean z) {
        String g = g();
        andq andqVar = this.aC;
        if (andqVar.g.aO == null) {
            andqVar.e = "";
        } else {
            andqVar.e = g;
            andqVar.a = false;
            cqkx.p(andqVar);
        }
        if (z) {
            this.aA.f(this.e.c(), g);
        }
    }

    @Override // defpackage.ancv, defpackage.ges, defpackage.gfo
    public final boolean e() {
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            ggaVar.g().f();
            return true;
        }
        return true;
    }

    protected String g() {
        ilo iloVar = this.aO;
        dbsk.s(iloVar);
        doay doayVar = doay.TYPE_ROAD;
        int ordinal = iloVar.ce().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return iloVar.ch();
            }
            if (ordinal == 2) {
                return iloVar.ci();
            }
            if (ordinal == 3) {
                return iloVar.cj();
            }
            if (ordinal == 4) {
                return iloVar.cf();
            }
            return iloVar.n();
        }
        return iloVar.cg();
    }

    @Override // defpackage.ancv, defpackage.ges, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.aB = this.aw.a(this.aS);
        this.aT = new akzy(this) { // from class: ando
            private final andr a;

            {
                this.a = this;
            }

            @Override // defpackage.akzy
            public final void a(alad aladVar) {
                this.a.bu(aladVar.i);
            }
        };
        Bundle bundle2 = bundle != null ? bundle : this.o;
        if (bundle2 != null) {
            this.au = (akqq) bundle2.getSerializable("selectedLatLngKey");
            this.aP = (bomn) bundle2.getSerializable("addressFieldInfoKey");
        }
        andq andqVar = new andq(this, (anee) this.o.getSerializable("args"));
        this.aC = andqVar;
        this.g = andqVar;
        andqVar.G();
        Bundle bundle3 = this.o;
        if (bundle3 != null) {
            ilo iloVar = (ilo) bundle3.getSerializable("placemark");
            this.aO = iloVar;
            if (iloVar != null && bundle == null) {
                this.a = iloVar.aj();
            }
            this.aQ = bundle3.getBoolean("shouldReverseGeocodeKey");
            this.aR = dosc.b(bundle3.getInt("viewportMetadataType"));
            this.az.d(bundle);
            this.av = new bnyp(this.ax, this.ay);
            return;
        }
        throw new RuntimeException();
    }

    @Override // defpackage.ancv, defpackage.ges
    public ddho p() {
        return dtya.aq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        akqq akqqVar = this.au;
        if (akqqVar != null) {
            Nw(new bomo(akqqVar, this.aP));
        }
        Nz(null);
        aU();
    }

    @Override // defpackage.ancv, defpackage.ges, defpackage.fd
    public void s() {
        bpso c = bpsp.c();
        Bundle bundle = this.o;
        dbsk.s(bundle);
        boolean z = true;
        if (bundle.getBoolean("openInSatelliteMode")) {
            c.b(true);
        }
        this.az.a(c.a());
        super.s();
        btrm btrmVar = this.ao;
        dceq a = dcet.a();
        a.b(alia.class, new andt(alia.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        if (this.aT != null) {
            this.ay.a().ab(this.aT);
        }
        bomy bomyVar = this.aB;
        dosc doscVar = this.aR;
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        bomyVar.a(doscVar, ggaVar, bw(), this.ax, this);
        ilo iloVar = this.aO;
        if (iloVar != null && iloVar.aj() != null) {
            bu(this.aO.aj());
        }
        andq andqVar = this.aC;
        if (this.au == null) {
            z = false;
        }
        andqVar.c(z);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.az.c(bundle);
        akqq akqqVar = this.au;
        if (akqqVar != null) {
            bundle.putSerializable("selectedLatLngKey", akqqVar);
        }
        bomn bomnVar = this.aP;
        if (bomnVar != null) {
            bundle.putSerializable("addressFieldInfoKey", bomnVar);
        }
    }

    @Override // defpackage.ancv, defpackage.ges, defpackage.fd
    public final void u() {
        this.ao.a(this);
        if (this.aT != null) {
            this.ay.a().ac(this.aT);
        }
        this.az.b();
        super.u();
    }

    @Override // defpackage.bnyn
    /* renamed from: i */
    public void Rb(dwhf dwhfVar, @dzsi dwhj dwhjVar) {
        if (!this.aD) {
            return;
        }
        if (dwhjVar == null || (dwhjVar.a & 4) == 0) {
            Toast.makeText(J(), (int) R.string.LOCATION_DATA_ERROR, 0).show();
            return;
        }
        dvyw dvywVar = dwhjVar.d;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        ily ilyVar = new ily();
        ilyVar.E(dvywVar);
        akqq akqqVar = this.au;
        dbsk.s(akqqVar);
        ilyVar.q(akqqVar);
        this.aO = ilyVar.d();
        String str = dvywVar.r;
        this.aP = new bomn(str, dvywVar.g, str, bomm.a(dwhjVar));
        bv(true);
    }
}
