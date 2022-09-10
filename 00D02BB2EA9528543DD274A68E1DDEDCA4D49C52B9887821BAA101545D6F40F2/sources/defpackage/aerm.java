package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aerm  reason: default package */
/* loaded from: classes2.dex */
public class aerm implements aeyn {
    private static final dcqe h = dcqe.c("aerm");
    public final aerf a;
    public final dzsj<ache> b;
    public final dzsj<araj> c;
    public final dzsj<aesb> d;
    public final dzsj<cqg> e;
    public final boolean f;
    public final boolean g;
    @dzsi
    private final aeue i;
    private final List<aeuf> j;
    private final eeu k;
    private final btvo l;
    private final dzsj<begg> m;
    private final Activity n;
    private final int o;

    public aerm(Activity activity, eeu eeuVar, bvjj bvjjVar, dzsj<ache> dzsjVar, dzsj<araj> dzsjVar2, dzsj<arag> dzsjVar3, dzsj<aesb> dzsjVar4, dzsj<begg> dzsjVar5, dzsj<cqg> dzsjVar6, btvo btvoVar, aerf aerfVar, aeui aeuiVar, boolean z, boolean z2) {
        this.n = activity;
        this.k = eeuVar;
        this.b = dzsjVar;
        this.c = dzsjVar2;
        this.d = dzsjVar4;
        this.m = dzsjVar5;
        this.e = dzsjVar6;
        dbsk.s(aerfVar);
        this.a = aerfVar;
        dtaq d = aeuiVar.d();
        if (d != null && (d.a & 16) != 0) {
            dtak dtakVar = d.e;
            akqq l = akqq.l(dtakVar == null ? dtak.d : dtakVar);
            if (l != null) {
                String akqqVar = l.toString();
                float f = d.g;
                long j = d.d;
                StringBuilder sb = new StringBuilder(39);
                sb.append(f / 1000.0f);
                sb.append("m ");
                sb.append(j);
                sb.append("ms");
                dcdc.g(akqqVar, sb.toString());
            }
        }
        this.i = aeuiVar.i();
        this.f = z;
        this.g = z2;
        this.l = btvoVar;
        dccx F = dcdc.F();
        for (aeue aeueVar : aeuiVar.g) {
            if (!z2 || !aeueVar.equals(this.i)) {
                F.g((aeuf) aeueVar);
            }
        }
        this.j = F.f();
        aeuh aeuhVar = aeuh.NEUTRAL;
        switch (aeuiVar.f.ordinal()) {
            case 0:
                this.o = 1;
                return;
            case 1:
            case 2:
            case 3:
            case 7:
                this.o = 3;
                return;
            case 4:
                this.o = 2;
                return;
            case 5:
                this.o = 4;
                return;
            case 6:
                this.o = 5;
                return;
            default:
                this.o = 1;
                bvoo.h("Unhandled state: %s", aeuiVar.f);
                return;
        }
    }

    private final boolean s() {
        return this.o == 2;
    }

    private final boolean t() {
        return this.o == 4;
    }

    private final boolean u() {
        return this.o == 5;
    }

    @Override // defpackage.aeyn
    @dzsi
    /* renamed from: a */
    public aerg r() {
        if (!this.g) {
            return null;
        }
        aeue aeueVar = this.i;
        if (!(aeueVar instanceof aeuf)) {
            return null;
        }
        return new aerg(this.k, this.d, this.m, aeueVar, this.a, this.f, true);
    }

    @Override // defpackage.aeyn
    public Boolean b() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.aeyn
    /* renamed from: c */
    public aerg q(int i) {
        return new aerg(this.k, this.d, this.m, this.j.get(i), this.a, this.f, this.g);
    }

    @Override // defpackage.aeyn
    public Integer d() {
        return Integer.valueOf(this.j.size());
    }

    @Override // defpackage.aeyn
    public Runnable e() {
        return new Runnable(this) { // from class: aerh
            private final aerm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aerm aermVar = this.a;
                aerf aerfVar = aermVar.a;
                if (aerfVar.aD) {
                    aerfVar.aT();
                    aermVar.d.a().m(aermVar.f, aermVar.g, aermVar.a.ba());
                }
            }
        };
    }

    @Override // defpackage.aeyn
    public Runnable f() {
        return new Runnable(this) { // from class: aeri
            private final aerm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aerm aermVar = this.a;
                aerf aerfVar = aermVar.a;
                if (aerfVar.aD) {
                    aerfVar.aT();
                    aermVar.b.a().n();
                }
            }
        };
    }

    @Override // defpackage.aeyn
    public Runnable g() {
        return new Runnable(this) { // from class: aerj
            private final aerm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.g();
            }
        };
    }

    @Override // defpackage.aeyn
    public Runnable h() {
        return new Runnable(this) { // from class: aerk
            private final aerm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aerm aermVar = this.a;
                aermVar.n();
                aermVar.c.a().q();
            }
        };
    }

    @Override // defpackage.aeyn
    public Boolean i() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.aeyn
    public Boolean j() {
        boolean z = true;
        if (this.o != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aeyn
    public Boolean k() {
        boolean z = true;
        if (!s() && !t() && !u()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aeyn
    public cqkl l() {
        aerf aerfVar = this.a;
        if (!aerfVar.aD) {
            return cqkl.a;
        }
        aerfVar.Nw(null);
        this.a.aT();
        return cqkl.a;
    }

    @Override // defpackage.aeyn
    public String m() {
        int i;
        if (u()) {
            i = R.string.DATA_REQUEST_ERROR_GAIA;
        } else {
            i = t() ? R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY : s() ? R.string.DATA_REQUEST_ERROR : R.string.UNKNOWN_ERROR;
        }
        return this.n.getString(i);
    }

    public Integer n() {
        return Integer.valueOf(this.c.a().k());
    }

    @Override // defpackage.aeyn
    public Runnable o() {
        return new Runnable(this) { // from class: aerl
            private final aerm a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aerm aermVar = this.a;
                aerf aerfVar = aermVar.a;
                if (aerfVar.aD) {
                    aerfVar.aT();
                    akra akraVar = new akra();
                    aermVar.e.a().b(cqf.b(dnqb.BLUE_DOT_MENU, aermVar.c.a().m().f().f(akraVar) ? akraVar.S() : null), true);
                }
            }
        };
    }

    @Override // defpackage.aeyn
    public Boolean p() {
        boolean z = false;
        if (btpf.b(this.n)) {
            return false;
        }
        if (this.l.getLocationParameters().c || this.l.getCompassCalibrationParameters().a) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
