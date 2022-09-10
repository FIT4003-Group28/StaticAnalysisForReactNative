package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.animation.Interpolator;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: asla  reason: default package */
/* loaded from: classes2.dex */
public final class asla extends askq implements atcv {
    private static final EnumMap<dqvj, Float> q;
    private static final EnumMap<dqvj, Float> r;
    private static final EnumMap<dqvj, Float> s;
    private final boolean A;
    private final boolean t;
    private final akzm u;
    private boolean v;
    private cray w;
    private cray[] x;
    private amuo y;
    @dzsi
    private aslk z;

    static {
        EnumMap<dqvj, Float> k = dcjz.k(dqvj.class);
        q = k;
        dqvj dqvjVar = dqvj.DRIVE;
        Float valueOf = Float.valueOf(50000.0f);
        k.put((EnumMap<dqvj, Float>) dqvjVar, (dqvj) valueOf);
        k.put((EnumMap<dqvj, Float>) dqvj.TAXICAB, (dqvj) valueOf);
        k.put((EnumMap<dqvj, Float>) dqvj.TWO_WHEELER, (dqvj) valueOf);
        k.put((EnumMap<dqvj, Float>) dqvj.BICYCLE, (dqvj) Float.valueOf(12000.0f));
        k.put((EnumMap<dqvj, Float>) dqvj.WALK, (dqvj) Float.valueOf(3000.0f));
        EnumMap<dqvj, Float> k2 = dcjz.k(dqvj.class);
        r = k2;
        dqvj dqvjVar2 = dqvj.DRIVE;
        Float valueOf2 = Float.valueOf(250.0f);
        k2.put((EnumMap<dqvj, Float>) dqvjVar2, (dqvj) valueOf2);
        k2.put((EnumMap<dqvj, Float>) dqvj.TAXICAB, (dqvj) valueOf2);
        k2.put((EnumMap<dqvj, Float>) dqvj.TWO_WHEELER, (dqvj) valueOf2);
        k2.put((EnumMap<dqvj, Float>) dqvj.BICYCLE, (dqvj) Float.valueOf(100.0f));
        k2.put((EnumMap<dqvj, Float>) dqvj.WALK, (dqvj) Float.valueOf(50.0f));
        EnumMap<dqvj, Float> k3 = dcjz.k(dqvj.class);
        s = k3;
        dqvj dqvjVar3 = dqvj.DRIVE;
        Float valueOf3 = Float.valueOf(2500.0f);
        k3.put((EnumMap<dqvj, Float>) dqvjVar3, (dqvj) valueOf3);
        k3.put((EnumMap<dqvj, Float>) dqvj.TAXICAB, (dqvj) valueOf3);
        k3.put((EnumMap<dqvj, Float>) dqvj.TWO_WHEELER, (dqvj) valueOf3);
        k3.put((EnumMap<dqvj, Float>) dqvj.BICYCLE, (dqvj) Float.valueOf(1000.0f));
        k3.put((EnumMap<dqvj, Float>) dqvj.WALK, (dqvj) Float.valueOf(500.0f));
    }

    public asla(btvo btvoVar, cjqq cjqqVar, bvnx bvnxVar, Resources resources, akox akoxVar, gll gllVar, atcw atcwVar, arbu arbuVar, asvx asvxVar, asky askyVar, boolean z) {
        super(resources, akoxVar, gllVar, arbuVar, asvxVar, atcwVar, askyVar, btvoVar, cjqqVar, arym.GUIDED_NAV);
        this.t = z;
        this.u = new akzm(bvnxVar);
        this.A = btvoVar.getNavigationParameters().I();
    }

    static akru B(float f, cray crayVar) {
        akru e = crayVar.e(f);
        return e == null ? new akru(crayVar.a.w(), 0) : e;
    }

    private final void C(akqq akqqVar, boolean z) {
        akyc m;
        this.j = asld.FREE_MOVEMENT;
        int i = 0;
        this.k = false;
        l();
        float f = this.d.n().k;
        if (!this.p || z) {
            m = akyt.m(akqqVar, f, this.e.b());
        } else {
            m = new askz(akqqVar, f, this.g.f().g() + 180.0f, this.e.b());
        }
        if (true != z) {
            i = -1;
        }
        m.b = i;
        m.c = a;
        x(m);
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, atlq atlqVar2) {
        if (atlqVar.b()) {
            crqf crqfVar = atlqVar.m;
            dbsk.s(crqfVar);
            aslf aslfVar = atlqVar.c;
            if (!crqfVar.j) {
                this.w = crqfVar.g();
                this.x = crqfVar.h();
                amub amubVar = this.w.a;
                this.m = amubVar.h;
                this.v = crqfVar.g;
                this.y = atlqVar.o;
                if (aslfVar instanceof aslk) {
                    this.z = (aslk) aslfVar;
                }
                k(atlqVar, amubVar.h, crqfVar.a);
                if (atlqVar.v) {
                    this.d.aj().Y(false);
                    this.d.aj().X(10L);
                    return;
                }
                this.d.aj().Y(true);
                return;
            }
            C(crqfVar.g().a.l().e, aslfVar.c);
            if (!this.A) {
                return;
            }
            this.d.aj().Y(false);
            return;
        }
        ilo iloVar = atlqVar.q;
        if (iloVar != null) {
            akqq aj = iloVar.aj();
            if (aj != null) {
                C(aj, true);
            }
        } else {
            m();
        }
        this.d.aj().Y(false);
        l();
        this.g.f().B(true);
    }

    @Override // defpackage.askq
    protected final void p(boolean z) {
        if (this.n == null) {
            return;
        }
        Point i = this.e.i();
        aslg z2 = z();
        GmmLocation gmmLocation = this.n;
        cray crayVar = this.w;
        v(z, z2.c(gmmLocation, crayVar != null ? crayVar.b : null, crayVar, this.e.b(), this.o, i.x, i.y, this.f.getDisplayMetrics().density));
    }

    @Override // defpackage.askq
    protected final void q(boolean z) {
        akru[] akruVarArr;
        cray[] crayVarArr;
        int length;
        if (this.d.k().a == 0) {
            float floatValue = this.t ? q.get(this.m).floatValue() : -1.0f;
            int i = 0;
            if (this.n != null && (crayVarArr = this.x) != null && (length = crayVarArr.length) != 0 && !this.v) {
                akruVarArr = new akru[length];
                while (true) {
                    cray[] crayVarArr2 = this.x;
                    if (i >= crayVarArr2.length) {
                        break;
                    }
                    akruVarArr[i] = B(floatValue, crayVarArr2[i]);
                    i++;
                }
            } else {
                akruVarArr = new akru[0];
            }
            y(z, t(true, akruVarArr), a);
        }
    }

    @Override // defpackage.askq
    protected final void r(boolean z) {
        Point i = this.e.i();
        w(z, z().e(this.y, this.e.b(), i.x, i.y));
    }

    @Override // defpackage.askq
    protected final void s(boolean z) {
        cray crayVar;
        float floatValue;
        aslk aslkVar = this.z;
        if (aslkVar == null) {
            return;
        }
        amub amubVar = aslkVar.f;
        float f = aslkVar.g;
        cray[] crayVarArr = this.x;
        int length = crayVarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                crayVar = null;
                break;
            }
            crayVar = crayVarArr[i2];
            if (crayVar.a == amubVar) {
                break;
            }
            i2++;
        }
        Float f2 = this.o;
        if (f2 != null) {
            floatValue = (float) (4.003023014070891E7d / Math.pow(2.0d, f2.floatValue()));
        } else if (crayVar != null) {
            floatValue = akn.a((f - (amubVar.D - crayVar.g)) / 4.0f, r.get(this.m).floatValue(), s.get(this.m).floatValue());
        } else {
            floatValue = r.get(this.m).floatValue();
        }
        float f3 = floatValue;
        Point i3 = this.e.i();
        alad f4 = z().f(amubVar, f, f3, this.e.b(), i3.x, i3.y, this.f.getDisplayMetrics().density);
        if (f4 == null) {
            return;
        }
        alaa b = alad.b(f4);
        alad n = this.d.n();
        aslk aslkVar2 = this.z;
        if (!aslkVar2.h) {
            b.e = n.m;
        }
        if (!aslkVar2.i) {
            b.c(n.i);
        }
        if (!this.z.j) {
            b.c = n.k;
        } else {
            Float f5 = this.o;
            if (f5 != null) {
                b.c = f5.floatValue();
            }
        }
        alad a = b.a();
        akzm akzmVar = this.u;
        if (true != z) {
            i = 750;
        }
        Interpolator interpolator = irf.a;
        akzmVar.a(this.d.n(), a);
        akzmVar.p(i);
        akzmVar.b(interpolator);
        this.d.r(akzmVar);
    }

    @Override // defpackage.askq
    @dzsi
    protected final alad u() {
        dcdc<akra> dcdcVar = this.i.f;
        if (dcdcVar.isEmpty()) {
            return null;
        }
        Point i = this.e.i();
        if (this.i.a == asld.INSPECT_RESULTS_ON_MAP_WITHOUT_LOCATION) {
            return z().i(dcdcVar, this.i.i, this.e.b(), i.x, i.y, this.f.getDisplayMetrics().density);
        }
        return z().g(dcdcVar, this.i.i, B(1000.0f, this.w), this.e.b(), i.x, i.y, this.f.getDisplayMetrics().density);
    }
}
