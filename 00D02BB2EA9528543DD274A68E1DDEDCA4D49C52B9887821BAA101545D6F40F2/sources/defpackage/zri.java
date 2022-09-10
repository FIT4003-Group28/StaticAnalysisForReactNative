package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: zri  reason: default package */
/* loaded from: classes7.dex */
public class zri implements Serializable, zbt {
    public final ArrayList<zrn> a;
    private transient vxo b;
    private transient vpd c;
    private transient cklf d;
    private transient Activity e;
    private final bvrt<dwao> f;
    private final ArrayList<zra> g;
    private final ArrayList<zra> h;
    @dzsi
    private final vrj i;
    @dzsi
    private final vrd j;
    @dzsi
    private final vrq k;
    private transient zrz l;
    private final dqvj m;

    protected zri(vxo vxoVar, Activity activity, vpd vpdVar, cklf cklfVar, vrk vrkVar, vre vreVar, vrr vrrVar, dqvj dqvjVar, dwao dwaoVar, zrz zrzVar) {
        this.m = dqvjVar;
        this.b = vxoVar;
        this.c = vpdVar;
        this.d = cklfVar;
        this.e = activity;
        this.f = bvrt.b(dwaoVar);
        this.l = zrzVar;
        ArrayList<zra> arrayList = new ArrayList<>();
        this.g = arrayList;
        ArrayList<zrn> arrayList2 = new ArrayList<>();
        this.a = arrayList2;
        if (vpdVar.c(vpc.JAKARTA) && dqvjVar == dqvj.DRIVE) {
            vux vuxVar = vux.AVOID_ODD_EVEN_ROADS;
            String string = activity.getString(R.string.DIRECTIONS_OPTIONS_AVOID_ODD_PLATE_ROADS);
            vpc vpcVar = vpc.JAKARTA;
            dowr dowrVar = dwaoVar.g;
            arrayList2.add(new zrn(vuxVar, string, vph.e(vpcVar, (dowrVar == null ? dowr.m : dowrVar).i) == dowl.JAKARTA_EVEN, new zrb(), new zrc(this), dtya.ep));
            vux vuxVar2 = vux.AVOID_ODD_EVEN_ROADS;
            String string2 = activity.getString(R.string.DIRECTIONS_OPTIONS_AVOID_EVEN_PLATE_ROADS);
            vpc vpcVar2 = vpc.JAKARTA;
            dowr dowrVar2 = dwaoVar.g;
            arrayList2.add(new zrn(vuxVar2, string2, vph.e(vpcVar2, (dowrVar2 == null ? dowr.m : dowrVar2).i) == dowl.JAKARTA_ODD, new zrd(), new zre(this), dtya.em));
        }
        if (!vpdVar.c(vpc.SAO_PAULO) || dqvjVar != dqvj.DRIVE) {
            this.i = null;
        } else {
            dowr dowrVar3 = dwaoVar.g;
            this.i = vrkVar.a((dowrVar3 == null ? dowr.m : dowrVar3).i, true, cjtd.a(dtya.ei));
        }
        if (!vpdVar.c(vpc.MANILA) || dqvjVar != dqvj.DRIVE) {
            this.j = null;
        } else {
            dowr dowrVar4 = dwaoVar.g;
            this.j = vreVar.a((dowrVar4 == null ? dowr.m : dowrVar4).i, true, cjtd.a(dtya.ei));
        }
        if (!vpdVar.c(vpc.SANTIAGO) || dqvjVar != dqvj.DRIVE) {
            this.k = null;
        } else {
            dowr dowrVar5 = dwaoVar.g;
            this.k = vrrVar.a((dowrVar5 == null ? dowr.m : dowrVar5).i, true, cjtd.a(dtya.ei));
        }
        if (dqvjVar == dqvj.DRIVE || dqvjVar == dqvj.TWO_WHEELER) {
            vux vuxVar3 = vux.AVOID_HIGHWAYS;
            String string3 = activity.getString(R.string.DIRECTIONS_OPTIONS_AVOID_HIGHWAYS);
            dowr dowrVar6 = dwaoVar.g;
            arrayList.add(new zra(vuxVar3, string3, (dowrVar6 == null ? dowr.m : dowrVar6).b, new zrf(), dtya.eo));
            vux vuxVar4 = vux.AVOID_TOLLS;
            String string4 = activity.getString(R.string.DIRECTIONS_OPTIONS_AVOID_TOLLS);
            dowr dowrVar7 = dwaoVar.g;
            arrayList.add(new zra(vuxVar4, string4, (dowrVar7 == null ? dowr.m : dowrVar7).c, new zrg(), dtya.eq));
        }
        if (dqvjVar == dqvj.DRIVE || dqvjVar == dqvj.BICYCLE || dqvjVar == dqvj.WALK || dqvjVar == dqvj.TWO_WHEELER) {
            arrayList.add(new zra(vux.AVOID_FERRIES, activity.getString(R.string.DIRECTIONS_OPTIONS_AVOID_FERRIES), dwaoVar.o, new zrh(), dtya.en));
        }
        ArrayList<zra> arrayList3 = new ArrayList<>();
        this.h = arrayList3;
        arrayList3.addAll(arrayList);
    }

    public static zri m(zrj zrjVar, dqvj dqvjVar, dwao dwaoVar, zrz zrzVar) {
        vxo a = zrjVar.a.a();
        zrj.a(a, 1);
        Activity activity = (Activity) ((dxjd) zrjVar.b).a;
        zrj.a(activity, 2);
        vpd a2 = zrjVar.c.a();
        zrj.a(a2, 3);
        cklf a3 = zrjVar.d.a();
        zrj.a(a3, 4);
        vrk a4 = zrjVar.e.a();
        zrj.a(a4, 5);
        vre a5 = zrjVar.f.a();
        zrj.a(a5, 6);
        vrr a6 = zrjVar.g.a();
        zrj.a(a6, 7);
        zrj.a(dqvjVar, 8);
        zrj.a(dwaoVar, 9);
        zrj.a(zrzVar, 10);
        return new zri(a, activity, a2, a3, a4, a5, a6, dqvjVar, dwaoVar, zrzVar);
    }

    public static boolean n(dqvj dqvjVar, dwao dwaoVar, @dzsi dwak dwakVar) {
        int a;
        if (dwakVar == null || (a = dwaj.a(dwakVar.a)) == 0 || a != 3) {
            if (dqvjVar == dqvj.DRIVE) {
                if (r(dwaoVar)) {
                    return true;
                }
                dowr dowrVar = dwaoVar.g;
                if (dowrVar == null) {
                    dowrVar = dowr.m;
                }
                return vph.f(dowrVar.i, vpf.a) != dowl.UNSET;
            } else if (dqvjVar == dqvj.TWO_WHEELER) {
                return r(dwaoVar);
            } else {
                if (dqvjVar != dqvj.BICYCLE && dqvjVar != dqvj.WALK) {
                    return false;
                }
                return dwaoVar.o;
            }
        }
        return false;
    }

    public static final dwao q(dwao dwaoVar, dowl dowlVar) {
        dwal ca = dwao.R.ca(dwaoVar);
        vpc vpcVar = vpc.JAKARTA;
        dowr dowrVar = dwaoVar.g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        dowi ca2 = dowr.m.ca(dowrVar);
        vph.h(vpcVar, ca2, dowlVar);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dwao dwaoVar2 = (dwao) ca.b;
        dowr bK = ca2.bK();
        bK.getClass();
        dwaoVar2.g = bK;
        dwaoVar2.a |= 4;
        return ca.bK();
    }

    private static boolean r(dwao dwaoVar) {
        dowr dowrVar = dwaoVar.g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        if (!dowrVar.b) {
            dowr dowrVar2 = dwaoVar.g;
            if (dowrVar2 == null) {
                dowrVar2 = dowr.m;
            }
            return dowrVar2.c || dwaoVar.o;
        }
        return true;
    }

    @Override // defpackage.zbt
    public dcdc<jae> a() {
        dccx dccxVar = new dccx();
        dccxVar.i(this.g);
        return dccxVar.f();
    }

    @Override // defpackage.zbt
    public dcdc<jae> b() {
        dccx dccxVar = new dccx();
        dccxVar.i(this.a);
        return dccxVar.f();
    }

    @Override // defpackage.zbt
    @dzsi
    public vqy c() {
        return this.i;
    }

    @Override // defpackage.zbt
    @dzsi
    public vqy d() {
        return this.j;
    }

    @Override // defpackage.zbt
    public Boolean e() {
        boolean z = false;
        if (this.c.c(vpc.JAKARTA) && !this.a.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbt
    public Boolean f() {
        boolean z = false;
        if (this.c.c(vpc.SAO_PAULO) && this.i != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbt
    public Boolean g() {
        boolean z = false;
        if (this.c.c(vpc.MANILA) && this.j != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbt
    @dzsi
    public zez h() {
        return null;
    }

    @Override // defpackage.zbt
    public String i() {
        if (this.m == dqvj.DRIVE) {
            return this.e.getString(R.string.DIRECTIONS_DRIVING_OPTIONS_TITLE);
        }
        return this.e.getString(R.string.DIRECTIONS_OPTIONS_TITLE_QUANTUM);
    }

    @Override // defpackage.zbt
    public cqkl j() {
        vpc[] values;
        dwao e = this.f.e((dssr) dwao.R.cu(7), dwao.R);
        ArrayList<zra> arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e = arrayList.get(i).j(e);
        }
        ArrayList<zrn> arrayList2 = this.a;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            e = arrayList2.get(i2).j(e);
        }
        if (this.i != null) {
            dowr dowrVar = e.g;
            if (dowrVar == null) {
                dowrVar = dowr.m;
            }
            dowi ca = dowr.m.ca(dowrVar);
            vph.h(vpc.SAO_PAULO, ca, this.i.e());
            dwal ca2 = dwao.R.ca(e);
            dowr bK = ca.bK();
            if (ca2.c) {
                ca2.bF();
                ca2.c = false;
            }
            dwao dwaoVar = (dwao) ca2.b;
            bK.getClass();
            dwaoVar.g = bK;
            dwaoVar.a |= 4;
            e = ca2.bK();
        }
        if (this.j != null) {
            dowr dowrVar2 = e.g;
            if (dowrVar2 == null) {
                dowrVar2 = dowr.m;
            }
            dowi ca3 = dowr.m.ca(dowrVar2);
            vph.h(vpc.MANILA, ca3, this.j.e());
            dwal ca4 = dwao.R.ca(e);
            dowr bK2 = ca3.bK();
            if (ca4.c) {
                ca4.bF();
                ca4.c = false;
            }
            dwao dwaoVar2 = (dwao) ca4.b;
            bK2.getClass();
            dwaoVar2.g = bK2;
            dwaoVar2.a |= 4;
            e = ca4.bK();
        }
        if (this.k != null) {
            dowr dowrVar3 = e.g;
            if (dowrVar3 == null) {
                dowrVar3 = dowr.m;
            }
            dowi ca5 = dowr.m.ca(dowrVar3);
            vph.h(vpc.SANTIAGO, ca5, this.k.e());
            dwal ca6 = dwao.R.ca(e);
            dowr bK3 = ca5.bK();
            if (ca6.c) {
                ca6.bF();
                ca6.c = false;
            }
            dwao dwaoVar3 = (dwao) ca6.b;
            bK3.getClass();
            dwaoVar3.g = bK3;
            dwaoVar3.a |= 4;
            e = ca6.bK();
        }
        if (!p().isEmpty()) {
            vxo vxoVar = this.b;
            vxoVar.d(vxi.c(e));
            if (vxoVar.a != null) {
                for (vpc vpcVar : vpc.values()) {
                    vpd a = vxoVar.a.a();
                    dowr dowrVar4 = e.g;
                    if (dowrVar4 == null) {
                        dowrVar4 = dowr.m;
                    }
                    a.g(vpcVar, vph.e(vpcVar, dowrVar4.i));
                }
            }
        }
        this.l.w(e);
        return cqkl.a;
    }

    @Override // defpackage.zbt
    public cqkl k() {
        this.l.x();
        return cqkl.a;
    }

    @Override // defpackage.zbt
    public cqkl l() {
        this.d.a("license_plate_android");
        return cqkl.a;
    }

    public void o(zrz zrzVar, vxo vxoVar, vpd vpdVar, cklf cklfVar, Activity activity) {
        this.l = zrzVar;
        this.b = vxoVar;
        this.c = vpdVar;
        this.d = cklfVar;
        this.e = activity;
        vrj vrjVar = this.i;
        if (vrjVar != null) {
            vrjVar.h(activity);
        }
        vrd vrdVar = this.j;
        if (vrdVar != null) {
            vrdVar.h(activity);
        }
        vrq vrqVar = this.k;
        if (vrqVar != null) {
            vrqVar.h(activity);
        }
    }

    public EnumMap<vux, Integer> p() {
        EnumMap<vux, Integer> k = dcjz.k(vux.class);
        ArrayList<zra> arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zra zraVar = arrayList.get(i);
            if (zraVar.b().booleanValue() != zraVar.k()) {
                k.put((EnumMap<vux, Integer>) zraVar.l(), (vux) Integer.valueOf(zraVar.b().booleanValue() ? 1 : 0));
            }
        }
        if (this.a.size() >= 2) {
            zrn zrnVar = this.a.get(1);
            zrn zrnVar2 = this.a.get(0);
            if (!zrnVar.b().booleanValue() || zrnVar.k()) {
                if (!zrnVar2.b().booleanValue() || zrnVar2.k()) {
                    if ((!zrnVar.b().booleanValue() && zrnVar.k()) || (!zrnVar2.b().booleanValue() && zrnVar2.k())) {
                        k.put((EnumMap<vux, Integer>) vux.AVOID_ODD_EVEN_ROADS, (vux) Integer.valueOf(dowl.UNSET.t));
                    }
                } else {
                    k.put((EnumMap<vux, Integer>) vux.AVOID_ODD_EVEN_ROADS, (vux) Integer.valueOf(dowl.JAKARTA_EVEN.t));
                }
            } else {
                k.put((EnumMap<vux, Integer>) vux.AVOID_ODD_EVEN_ROADS, (vux) Integer.valueOf(dowl.JAKARTA_ODD.t));
            }
        }
        if (this.i != null) {
            dowr dowrVar = this.f.e((dssr) dwao.R.cu(7), dwao.R).g;
            if (dowrVar == null) {
                dowrVar = dowr.m;
            }
            dsrj<dowm> dsrjVar = dowrVar.i;
            dowj bZ = dowm.c.bZ();
            dowl e = this.i.e();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dowm dowmVar = (dowm) bZ.b;
            dowmVar.b = e.t;
            dowmVar.a |= 1;
            if (!dsrjVar.contains(bZ.bK())) {
                k.put((EnumMap<vux, Integer>) vux.AVOID_RODIZIO_AREAS, (vux) Integer.valueOf(this.i.e().t));
            }
        }
        if (this.j != null) {
            dowr dowrVar2 = this.f.e((dssr) dwao.R.cu(7), dwao.R).g;
            if (dowrVar2 == null) {
                dowrVar2 = dowr.m;
            }
            dsrj<dowm> dsrjVar2 = dowrVar2.i;
            dowj bZ2 = dowm.c.bZ();
            dowl e2 = this.j.e();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dowm dowmVar2 = (dowm) bZ2.b;
            dowmVar2.b = e2.t;
            dowmVar2.a |= 1;
            if (!dsrjVar2.contains(bZ2.bK())) {
                k.put((EnumMap<vux, Integer>) vux.AVOID_MANILA_NUMBER_CODING_ROADS, (vux) Integer.valueOf(this.j.e().t));
            }
        }
        if (this.k != null) {
            dowr dowrVar3 = this.f.e((dssr) dwao.R.cu(7), dwao.R).g;
            if (dowrVar3 == null) {
                dowrVar3 = dowr.m;
            }
            dsrj<dowm> dsrjVar3 = dowrVar3.i;
            dowj bZ3 = dowm.c.bZ();
            dowl e3 = this.k.e();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dowm dowmVar3 = (dowm) bZ3.b;
            dowmVar3.b = e3.t;
            dowmVar3.a = 1 | dowmVar3.a;
            if (!dsrjVar3.contains(bZ3.bK())) {
                k.put((EnumMap<vux, Integer>) vux.AVOID_SANTIAGO_SELLO_VERDE_ROADS, (vux) Integer.valueOf(this.k.e().t));
            }
        }
        return k;
    }
}
