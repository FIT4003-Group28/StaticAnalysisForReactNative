package defpackage;

import android.net.Uri;
import java.util.List;
/* compiled from: PG */
/* renamed from: abez  reason: default package */
/* loaded from: classes.dex */
public final class abez implements abfc {
    private final dxio<abfa> a;

    public abez(dxio<abfa> dxioVar) {
        this.a = dxioVar;
    }

    private static dqfo d() {
        dqfk bZ = dqfo.j.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqfo dqfoVar = (dqfo) bZ.b;
        dqfoVar.a |= 4;
        dqfoVar.e = "Events";
        String e = e("explore", "events");
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqfo dqfoVar2 = (dqfo) bZ.b;
        e.getClass();
        dqfoVar2.a |= 128;
        dqfoVar2.f = e;
        dqfn dqfnVar = dqfn.EVENTS;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqfo dqfoVar3 = (dqfo) bZ.b;
        dqfoVar3.h = dqfnVar.ah;
        dqfoVar3.a |= 1024;
        dprs bZ2 = dprx.h.bZ();
        dpsg bZ3 = dpsh.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dpsh.b((dpsh) bZ3.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dprx dprxVar = (dprx) bZ2.b;
        dpsh bK = bZ3.bK();
        bK.getClass();
        dprxVar.f = bK;
        dprxVar.a |= 16;
        dprx bK2 = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqfo dqfoVar4 = (dqfo) bZ.b;
        bK2.getClass();
        dqfoVar4.c = bK2;
        dqfoVar4.b = 6;
        return bZ.bK();
    }

    private static String e(String str, String str2) {
        return new Uri.Builder().scheme("https").authority("ssl.gstatic.com").appendPath("local").appendPath(str).appendPath(str2.concat(".png")).toString();
    }

    @Override // defpackage.abfc
    public final boolean a() {
        int a;
        abfa a2 = this.a.a();
        return (!a2.d() || (a = dkix.a(a2.a.getEnableFeatureParameters().bd)) == 0 || a != 2) && !this.a.a().d() && !this.a.a().g() && !this.a.a().f();
    }

    @Override // defpackage.abfc
    public final boolean b() {
        return a() || this.a.a().m();
    }

    @Override // defpackage.abfc
    public final List<dqfq> c() {
        dcdc f;
        if (a()) {
            return dcdc.e();
        }
        dqfp bZ = dqfq.h.bZ();
        dccx dccxVar = new dccx();
        if (!a()) {
            dqfk bZ2 = dqfo.j.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqfo dqfoVar = (dqfo) bZ2.b;
            dqfoVar.a |= 4;
            dqfoVar.e = "Restaurants";
            String e = e("dining", "restaurants");
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqfo dqfoVar2 = (dqfo) bZ2.b;
            e.getClass();
            dqfoVar2.a |= 128;
            dqfoVar2.f = e;
            dqfn dqfnVar = dqfn.RESTAURANTS;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqfo dqfoVar3 = (dqfo) bZ2.b;
            dqfoVar3.h = dqfnVar.ah;
            dqfoVar3.a |= 1024;
            dpvd bZ3 = dpvg.d.bZ();
            dpvf dpvfVar = dpvf.RESTAURANTS;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dpvg dpvgVar = (dpvg) bZ3.b;
            dpvgVar.b = dpvfVar.an;
            int i = dpvgVar.a | 1;
            dpvgVar.a = i;
            dpvgVar.a = i | 2;
            dpvgVar.c = "Restaurants";
            dpvg bK = bZ3.bK();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dqfo dqfoVar4 = (dqfo) bZ2.b;
            bK.getClass();
            dqfoVar4.c = bK;
            dqfoVar4.b = 7;
            dccxVar.g(bZ2.bK());
            dqfk bZ4 = dqfo.j.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dqfo dqfoVar5 = (dqfo) bZ4.b;
            dqfoVar5.a |= 4;
            dqfoVar5.e = "Coffee";
            String e2 = e("dining", "coffee");
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dqfo dqfoVar6 = (dqfo) bZ4.b;
            e2.getClass();
            dqfoVar6.a |= 128;
            dqfoVar6.f = e2;
            dqfn dqfnVar2 = dqfn.COFFEE;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dqfo dqfoVar7 = (dqfo) bZ4.b;
            dqfoVar7.h = dqfnVar2.ah;
            dqfoVar7.a |= 1024;
            dpvd bZ5 = dpvg.d.bZ();
            dpvf dpvfVar2 = dpvf.COFFEE;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dpvg dpvgVar2 = (dpvg) bZ5.b;
            dpvgVar2.b = dpvfVar2.an;
            int i2 = dpvgVar2.a | 1;
            dpvgVar2.a = i2;
            dpvgVar2.a = i2 | 2;
            dpvgVar2.c = "Coffee";
            dpvg bK2 = bZ5.bK();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dqfo dqfoVar8 = (dqfo) bZ4.b;
            bK2.getClass();
            dqfoVar8.c = bK2;
            dqfoVar8.b = 7;
            dccxVar.g(bZ4.bK());
            if (this.a.a().d()) {
                if (this.a.a().e()) {
                    dqfk bZ6 = dqfo.j.bZ();
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dqfo dqfoVar9 = (dqfo) bZ6.b;
                    dqfoVar9.a |= 4;
                    dqfoVar9.e = "Bars";
                    String e3 = e("dining", "drinks");
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dqfo dqfoVar10 = (dqfo) bZ6.b;
                    e3.getClass();
                    dqfoVar10.a |= 128;
                    dqfoVar10.f = e3;
                    dqfn dqfnVar3 = dqfn.BARS;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dqfo dqfoVar11 = (dqfo) bZ6.b;
                    dqfoVar11.h = dqfnVar3.ah;
                    dqfoVar11.a |= 1024;
                    dpvd bZ7 = dpvg.d.bZ();
                    dpvf dpvfVar3 = dpvf.BARS;
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    dpvg dpvgVar3 = (dpvg) bZ7.b;
                    dpvgVar3.b = dpvfVar3.an;
                    int i3 = dpvgVar3.a | 1;
                    dpvgVar3.a = i3;
                    dpvgVar3.a = i3 | 2;
                    dpvgVar3.c = "Bars";
                    dpvg bK3 = bZ7.bK();
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dqfo dqfoVar12 = (dqfo) bZ6.b;
                    bK3.getClass();
                    dqfoVar12.c = bK3;
                    dqfoVar12.b = 7;
                    dccxVar.g(bZ6.bK());
                    dccxVar.g(d());
                    dqfk bZ8 = dqfo.j.bZ();
                    if (bZ8.c) {
                        bZ8.bF();
                        bZ8.c = false;
                    }
                    dqfo dqfoVar13 = (dqfo) bZ8.b;
                    dqfoVar13.a |= 4;
                    dqfoVar13.e = "Attractions";
                    String e4 = e("explore", "attractions");
                    if (bZ8.c) {
                        bZ8.bF();
                        bZ8.c = false;
                    }
                    dqfo dqfoVar14 = (dqfo) bZ8.b;
                    e4.getClass();
                    dqfoVar14.a |= 128;
                    dqfoVar14.f = e4;
                    dqfn dqfnVar4 = dqfn.ATTRACTIONS;
                    if (bZ8.c) {
                        bZ8.bF();
                        bZ8.c = false;
                    }
                    dqfo dqfoVar15 = (dqfo) bZ8.b;
                    dqfoVar15.h = dqfnVar4.ah;
                    dqfoVar15.a |= 1024;
                    dpvd bZ9 = dpvg.d.bZ();
                    dpvf dpvfVar4 = dpvf.ATTRACTIONS;
                    if (bZ9.c) {
                        bZ9.bF();
                        bZ9.c = false;
                    }
                    dpvg dpvgVar4 = (dpvg) bZ9.b;
                    dpvgVar4.b = dpvfVar4.an;
                    int i4 = dpvgVar4.a | 1;
                    dpvgVar4.a = i4;
                    dpvgVar4.a = i4 | 2;
                    dpvgVar4.c = "attractions";
                    dpvg bK4 = bZ9.bK();
                    if (bZ8.c) {
                        bZ8.bF();
                        bZ8.c = false;
                    }
                    dqfo dqfoVar16 = (dqfo) bZ8.b;
                    bK4.getClass();
                    dqfoVar16.c = bK4;
                    dqfoVar16.b = 7;
                    dccxVar.g(bZ8.bK());
                    dqfk bZ10 = dqfo.j.bZ();
                    if (bZ10.c) {
                        bZ10.bF();
                        bZ10.c = false;
                    }
                    dqfo dqfoVar17 = (dqfo) bZ10.b;
                    dqfoVar17.a |= 4;
                    dqfoVar17.e = "Hotels";
                    String e5 = e("explore", "hotel");
                    if (bZ10.c) {
                        bZ10.bF();
                        bZ10.c = false;
                    }
                    dqfo dqfoVar18 = (dqfo) bZ10.b;
                    e5.getClass();
                    dqfoVar18.a |= 128;
                    dqfoVar18.f = e5;
                    dqfn dqfnVar5 = dqfn.HOTELS;
                    if (bZ10.c) {
                        bZ10.bF();
                        bZ10.c = false;
                    }
                    dqfo dqfoVar19 = (dqfo) bZ10.b;
                    dqfoVar19.h = dqfnVar5.ah;
                    dqfoVar19.a |= 1024;
                    dpvd bZ11 = dpvg.d.bZ();
                    dpvf dpvfVar5 = dpvf.HOTELS;
                    if (bZ11.c) {
                        bZ11.bF();
                        bZ11.c = false;
                    }
                    dpvg dpvgVar5 = (dpvg) bZ11.b;
                    dpvgVar5.b = dpvfVar5.an;
                    int i5 = dpvgVar5.a | 1;
                    dpvgVar5.a = i5;
                    dpvgVar5.a = i5 | 2;
                    dpvgVar5.c = "Hotels";
                    dpvg bK5 = bZ11.bK();
                    if (bZ10.c) {
                        bZ10.bF();
                        bZ10.c = false;
                    }
                    dqfo dqfoVar20 = (dqfo) bZ10.b;
                    bK5.getClass();
                    dqfoVar20.c = bK5;
                    dqfoVar20.b = 7;
                    dccxVar.g(bZ10.bK());
                    dqfk bZ12 = dqfo.j.bZ();
                    if (bZ12.c) {
                        bZ12.bF();
                        bZ12.c = false;
                    }
                    dqfo dqfoVar21 = (dqfo) bZ12.b;
                    dqfoVar21.a |= 4;
                    dqfoVar21.e = "Parks";
                    String e6 = e("explore", "parks");
                    if (bZ12.c) {
                        bZ12.bF();
                        bZ12.c = false;
                    }
                    dqfo dqfoVar22 = (dqfo) bZ12.b;
                    e6.getClass();
                    dqfoVar22.a |= 128;
                    dqfoVar22.f = e6;
                    dqfn dqfnVar6 = dqfn.PARKS;
                    if (bZ12.c) {
                        bZ12.bF();
                        bZ12.c = false;
                    }
                    dqfo dqfoVar23 = (dqfo) bZ12.b;
                    dqfoVar23.h = dqfnVar6.ah;
                    dqfoVar23.a |= 1024;
                    dpvd bZ13 = dpvg.d.bZ();
                    dpvf dpvfVar6 = dpvf.PARKS;
                    if (bZ13.c) {
                        bZ13.bF();
                        bZ13.c = false;
                    }
                    dpvg dpvgVar6 = (dpvg) bZ13.b;
                    dpvgVar6.b = dpvfVar6.an;
                    int i6 = dpvgVar6.a | 1;
                    dpvgVar6.a = i6;
                    dpvgVar6.a = i6 | 2;
                    dpvgVar6.c = "parks";
                    dpvg bK6 = bZ13.bK();
                    if (bZ12.c) {
                        bZ12.bF();
                        bZ12.c = false;
                    }
                    dqfo dqfoVar24 = (dqfo) bZ12.b;
                    bK6.getClass();
                    dqfoVar24.c = bK6;
                    dqfoVar24.b = 7;
                    dccxVar.g(bZ12.bK());
                } else {
                    dccxVar.g(d());
                }
            } else if (this.a.a().f()) {
                if (!this.a.a().g()) {
                    dqfk bZ14 = dqfo.j.bZ();
                    if (bZ14.c) {
                        bZ14.bF();
                        bZ14.c = false;
                    }
                    dqfo dqfoVar25 = (dqfo) bZ14.b;
                    dqfoVar25.a |= 4;
                    dqfoVar25.e = "Movies";
                    String e7 = e("explore", "movies");
                    if (bZ14.c) {
                        bZ14.bF();
                        bZ14.c = false;
                    }
                    dqfo dqfoVar26 = (dqfo) bZ14.b;
                    e7.getClass();
                    dqfoVar26.a |= 128;
                    dqfoVar26.f = e7;
                    dqfn dqfnVar7 = dqfn.MOVIES;
                    if (bZ14.c) {
                        bZ14.bF();
                        bZ14.c = false;
                    }
                    dqfo dqfoVar27 = (dqfo) bZ14.b;
                    dqfoVar27.h = dqfnVar7.ah;
                    dqfoVar27.a |= 1024;
                    dpvd bZ15 = dpvg.d.bZ();
                    dpvf dpvfVar7 = dpvf.MOVIES;
                    if (bZ15.c) {
                        bZ15.bF();
                        bZ15.c = false;
                    }
                    dpvg dpvgVar7 = (dpvg) bZ15.b;
                    dpvgVar7.b = dpvfVar7.an;
                    int i7 = dpvgVar7.a | 1;
                    dpvgVar7.a = i7;
                    dpvgVar7.a = i7 | 2;
                    dpvgVar7.c = "movies";
                    dpvg bK7 = bZ15.bK();
                    if (bZ14.c) {
                        bZ14.bF();
                        bZ14.c = false;
                    }
                    dqfo dqfoVar28 = (dqfo) bZ14.b;
                    bK7.getClass();
                    dqfoVar28.c = bK7;
                    dqfoVar28.b = 7;
                    dccxVar.g(bZ14.bK());
                } else {
                    dccxVar.g(d());
                }
            }
            f = dccxVar.f();
        } else {
            f = dccxVar.f();
        }
        bZ.a(f);
        return dcdc.f(bZ.bK());
    }
}
