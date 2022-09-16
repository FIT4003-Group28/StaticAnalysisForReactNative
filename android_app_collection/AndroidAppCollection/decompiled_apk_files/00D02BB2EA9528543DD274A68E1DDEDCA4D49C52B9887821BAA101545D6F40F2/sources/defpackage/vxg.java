package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: vxg  reason: default package */
/* loaded from: classes7.dex */
public final class vxg {
    private static final dcqe b = dcqe.c("vxg");
    @dzsi
    public final vxe a;
    private final amve c;

    public vxg(amve amveVar) {
        int i;
        int i2;
        this.c = amveVar;
        vxe vxeVar = null;
        if (amveVar.c()) {
            dqvj c = dqvj.c(amveVar.b().b);
            if ((c == null ? dqvj.DRIVE : c) == dqvj.TRANSIT && amveVar.e() > 0) {
                amtr d = amveVar.d(0);
                vxf k = k(d, true);
                vxf k2 = k(d, false);
                if (k != null && k2 != null && (i = ((vwq) k).b) <= (i2 = ((vwq) k2).b)) {
                    while (true) {
                        if (i < i2) {
                            vxd d2 = vxd.d(d.d(i));
                            if (d2 != vxd.UNKNOWN && d2.a()) {
                                break;
                            }
                            i++;
                        } else {
                            if (amveVar.e() > 1) {
                                bvoo.h("Multimodal trip should not have multiple paths.", new Object[0]);
                            }
                            vxeVar = new vxe(k, k2);
                        }
                    }
                }
            }
        }
        this.a = vxeVar;
    }

    public static boolean g(amuq amuqVar) {
        vxd d = vxd.d(amuqVar);
        if (!d.a()) {
            return false;
        }
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = d.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4) {
            return true;
        }
        if (ordinal != 5) {
            throw new AssertionError();
        }
        return false;
    }

    public static dpej i(amuq amuqVar) {
        doxd doxdVar = amuqVar.a().k;
        if (doxdVar == null) {
            doxdVar = doxd.l;
        }
        if ((doxdVar.a & 4) == 0) {
            return dpej.DELAY_NODATA;
        }
        dpej b2 = dpej.b(doxdVar.c);
        return b2 == null ? dpej.DELAY_NODATA : b2;
    }

    @dzsi
    private static vxf k(amtr amtrVar, boolean z) {
        int e = z ? 0 : amtrVar.e() - 1;
        if (amtrVar.e() == 0) {
            return null;
        }
        amuq d = amtrVar.d(e);
        amuq amuqVar = null;
        amuq amuqVar2 = null;
        while (true) {
            dqvj c = dqvj.c(d.a().b);
            if (c == null) {
                c = dqvj.DRIVE;
            }
            if (c == dqvj.TRANSIT) {
                break;
            }
            vxd d2 = vxd.d(d);
            dqvj c2 = dqvj.c(d.a().b);
            if (c2 == null) {
                c2 = dqvj.DRIVE;
            }
            if (c2 == dqvj.WALK && amuqVar == null) {
                amuqVar = d;
            } else if (d2 != vxd.UNKNOWN && d2.a()) {
                if (amuqVar2 != null) {
                    return null;
                }
                amuqVar2 = d;
            }
            e = z ? e + 1 : e - 1;
            if (e >= amtrVar.e() || e < 0) {
                break;
            }
            d = amtrVar.d(e);
        }
        if (amuqVar2 != null) {
            amuqVar = amuqVar2;
        }
        return new vwq(amuqVar, e);
    }

    private final dbsg<dpic> l(int i) {
        for (dpic dpicVar : d(i)) {
            if (dpicVar.d) {
                return dbsg.i(dpicVar);
            }
        }
        return dbpy.a;
    }

    public final boolean a() {
        vxe vxeVar = this.a;
        if (vxeVar == null) {
            return false;
        }
        amuq amuqVar = vxeVar.a;
        boolean z = (amuqVar == null || vxd.d(amuqVar) == vxd.UNKNOWN) ? false : true;
        amuq amuqVar2 = this.a.b;
        return z || (amuqVar2 != null && vxd.d(amuqVar2) != vxd.UNKNOWN);
    }

    public final dbsg<Integer> b() {
        amuq amuqVar;
        vxe vxeVar = this.a;
        return (vxeVar == null || (amuqVar = vxeVar.a) == null) ? dbpy.a : dbsg.i(Integer.valueOf(amuqVar.b));
    }

    public final dbsg<Integer> c() {
        amuq amuqVar;
        vxe vxeVar = this.a;
        return (vxeVar == null || (amuqVar = vxeVar.b) == null) ? dbpy.a : dbsg.i(Integer.valueOf(amuqVar.b));
    }

    public final List<dpic> d(int i) {
        if (i == b().c(-1).intValue()) {
            dpid dpidVar = this.c.a.w;
            if (dpidVar == null) {
                dpidVar = dpid.h;
            }
            return dpidVar.e;
        } else if (i != c().c(-1).intValue()) {
            return dcdc.e();
        } else {
            dpid dpidVar2 = this.c.a.w;
            if (dpidVar2 == null) {
                dpidVar2 = dpid.h;
            }
            return dpidVar2.f;
        }
    }

    public final dbsg<dpic> e() {
        return b().a() ? l(b().b().intValue()) : dbpy.a;
    }

    public final dbsg<dpic> f() {
        return c().a() ? l(c().b().intValue()) : dbpy.a;
    }

    public final boolean h(boolean z) {
        amuq amuqVar;
        amuq amuqVar2;
        vxe vxeVar = this.a;
        return vxeVar != null && ((amuqVar = vxeVar.a) == null || !g(amuqVar)) && (amuqVar2 = this.a.b) != null && g(amuqVar2) && (!z || i(this.a.b) != dpej.DELAY_NODATA);
    }

    @dzsi
    public final dpah j() {
        vxe vxeVar = this.a;
        if (vxeVar == null) {
            return null;
        }
        amuq amuqVar = vxeVar.a;
        if (amuqVar == null || vxd.d(amuqVar) != vxd.RICKSHAW) {
            amuq amuqVar2 = this.a.b;
            if (amuqVar2 != null && vxd.d(amuqVar2) == vxd.RICKSHAW) {
                return this.a.b.o();
            }
            return null;
        }
        return this.a.a.o();
    }
}
