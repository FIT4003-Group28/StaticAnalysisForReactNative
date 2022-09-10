package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cgsy  reason: default package */
/* loaded from: classes4.dex */
public final class cgsy {
    public static final /* synthetic */ int d = 0;
    private static final bvjk e = bvjk.hD;
    private static final long f = TimeUnit.HOURS.toMillis(2);
    public final cgte a;
    public final cqat b;
    public final cgtn c;
    private final bvjj g;
    private final axwq h;

    public cgsy(bvjj bvjjVar, cgte cgteVar, cqat cqatVar, cgtn cgtnVar, axwq axwqVar) {
        this.g = bvjjVar;
        this.a = cgteVar;
        this.b = cqatVar;
        this.c = cgtnVar;
        this.h = axwqVar;
    }

    public static boolean a(cgug cgugVar, GmmLocation gmmLocation) {
        float f2 = cgugVar.b;
        float f3 = cgugVar.c;
        double d2 = f2;
        Double.isNaN(d2);
        double d3 = f3;
        Double.isNaN(d3);
        return ((float) cgugVar.d) > gmmLocation.F(akqq.c((int) (d2 * 1000000.0d), (int) (d3 * 1000000.0d)));
    }

    private final dbsg<cgug> f(Collection<azva> collection, dndr dndrVar) {
        akqq akqqVar;
        if (dndrVar != dndr.HOME || this.g.m(bvjk.hB, true)) {
            if (dndrVar != dndr.WORK || this.g.m(bvjk.hC, true)) {
                azva g = azva.g(collection, dndrVar);
                if (g != null && (akqqVar = g.e) != null) {
                    cgud bZ = cgug.f.bZ();
                    float f2 = (float) akqqVar.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    cgug cgugVar = (cgug) bZ.b;
                    int i = 1 | cgugVar.a;
                    cgugVar.a = i;
                    cgugVar.b = f2;
                    double d2 = akqqVar.b;
                    cgugVar.a = i | 2;
                    cgugVar.c = (float) d2;
                    cgug cgugVar2 = (cgug) bZ.b;
                    cgugVar2.e = 2;
                    cgugVar2.a |= 8;
                    return dbsg.i(bZ.bK());
                }
                return dbpy.a;
            }
            return dbpy.a;
        }
        return dbpy.a;
    }

    public final cgti b(double d2, GmmLocation gmmLocation) {
        cguj c = c();
        cgui cguiVar = c.c;
        if (cguiVar == null) {
            cguiVar = cgui.c;
        }
        if (cguiVar.b <= d2) {
            for (cgug cgugVar : c.d) {
                if (a(cgugVar, gmmLocation)) {
                    c();
                    int a = cguf.a(cgugVar.e);
                    if (a == 0 || a != 3) {
                        return cgti.LOCATION_SNOOZE;
                    }
                    return cgti.EXCLUDED_PLACES;
                }
            }
            if (!this.h.d()) {
                this.h.r();
                deha.s(this.h.e());
            }
            dcdc dcdcVar = (dcdc) deha.s(this.h.m());
            dbsg<cgug> f2 = f(dcdcVar, dndr.HOME);
            if (!f2.a() || !a(f2.b(), gmmLocation)) {
                dbsg<cgug> f3 = f(dcdcVar, dndr.WORK);
                if (!f3.a() || !a(f3.b(), gmmLocation)) {
                    int s = this.g.s(bvjk.hz, 480);
                    int s2 = this.g.s(bvjk.hA, 1200);
                    eaol eaolVar = new eaol((long) d2, eaou.i());
                    int C = (eaolVar.C() * 60) + eaolVar.D();
                    boolean z = false;
                    if (s >= s2 ? C <= s2 || s <= C : s < C && C < s2) {
                        z = true;
                    }
                    if (z) {
                        return cgti.OK;
                    }
                    return cgti.INACTIVE_HOURS;
                }
                return cgti.EXCLUDED_PLACES_WORK;
            }
            return cgti.EXCLUDED_PLACES_HOME;
        }
        c();
        return cgti.TIME_SNOOZE;
    }

    public final cguj c() {
        return (cguj) this.g.L(e, (dssr) cguj.e.cu(7), cguj.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(cgsx cgsxVar) {
        synchronized (this) {
            cgty ca = cguj.e.ca(c());
            cgsxVar.a(ca);
            this.g.al(e, ca.bK());
        }
    }

    public final void e(akqq akqqVar, int i) {
        cgud bZ = cgug.f.bZ();
        float f2 = (float) akqqVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cgug cgugVar = (cgug) bZ.b;
        int i2 = cgugVar.a | 1;
        cgugVar.a = i2;
        cgugVar.b = f2;
        double d2 = akqqVar.b;
        int i3 = i2 | 2;
        cgugVar.a = i3;
        cgugVar.c = (float) d2;
        cgugVar.e = i - 1;
        cgugVar.a = i3 | 8;
        final cgug bK = bZ.bK();
        d(new cgsx(bK) { // from class: cgsu
            private final cgug a;

            {
                this.a = bK;
            }

            @Override // defpackage.cgsx
            public final void a(cgty cgtyVar) {
                cgug cgugVar2 = this.a;
                int i4 = cgsy.d;
                if (cgtyVar.c) {
                    cgtyVar.bF();
                    cgtyVar.c = false;
                }
                cguj cgujVar = (cguj) cgtyVar.b;
                cguj cgujVar2 = cguj.e;
                cgugVar2.getClass();
                cgujVar.b();
                cgujVar.d.add(cgugVar2);
            }
        });
        cguh bZ2 = cgui.c.bZ();
        long b = this.b.b() + f;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        cgui cguiVar = (cgui) bZ2.b;
        cguiVar.a |= 1;
        cguiVar.b = b;
        final cgui bK2 = bZ2.bK();
        d(new cgsx(bK2) { // from class: cgst
            private final cgui a;

            {
                this.a = bK2;
            }

            @Override // defpackage.cgsx
            public final void a(cgty cgtyVar) {
                cgui cguiVar2 = this.a;
                int i4 = cgsy.d;
                if (cgtyVar.c) {
                    cgtyVar.bF();
                    cgtyVar.c = false;
                }
                cguj cgujVar = (cguj) cgtyVar.b;
                cguj cgujVar2 = cguj.e;
                cguiVar2.getClass();
                cgujVar.c = cguiVar2;
                cgujVar.a |= 1;
            }
        });
    }
}
