package defpackage;

import android.content.Context;
import android.location.Location;
/* compiled from: PG */
/* renamed from: zba  reason: default package */
/* loaded from: classes7.dex */
public final class zba {
    private static final dcep<dqvj> a = dcep.E(dqvj.DRIVE, dqvj.TAXI, dqvj.BICYCLE, dqvj.TWO_WHEELER);

    public static String a(bvsl bvslVar, dowb dowbVar) {
        return bvslVar.i(dowbVar);
    }

    @dzsi
    public static String b(dpec dpecVar) {
        dowb dowbVar = dpecVar.d;
        if (dowbVar == null) {
            dowbVar = dowb.d;
        }
        return c(dowbVar);
    }

    @dzsi
    public static String c(dowb dowbVar) {
        if ((dowbVar.a & 1) != 0) {
            return ((bvph) btsr.a(bvph.class)).sA().i(dowbVar);
        }
        return null;
    }

    public static boolean d(Context context, bvjj bvjjVar, btth btthVar, amte amteVar, int i, vwv vwvVar) {
        return j(amteVar.b(i, context), btthVar, k(bvjjVar), vwvVar, false);
    }

    public static boolean e(@dzsi amub amubVar, btth btthVar, bvjj bvjjVar, vwv vwvVar) {
        return j(amubVar, btthVar, k(bvjjVar), vwvVar, false);
    }

    public static boolean f(@dzsi amub amubVar, btth btthVar, bvjj bvjjVar, vwv vwvVar) {
        return j(amubVar, btthVar, k(bvjjVar), vwvVar, true);
    }

    public static boolean g(amub amubVar, @dzsi Integer num, btth btthVar, vwv vwvVar) {
        return h(amubVar, num, btthVar, vwvVar, false);
    }

    public static boolean h(amub amubVar, @dzsi Integer num, btth btthVar, vwv vwvVar, boolean z) {
        int length;
        if (btthVar.s() && btthVar.r()) {
            Location y = btthVar.y();
            if (y == null) {
                return true;
            }
            int i = vwvVar.f ? (int) vwvVar.g : 500;
            akra e = akra.e(y.getLatitude(), y.getLongitude());
            double r = e.r();
            double d = i;
            Double.isNaN(d);
            double d2 = r * d;
            akrn akrnVar = null;
            if (num == null) {
                akrnVar = amubVar.W(e, d2);
            } else if (z) {
                amuo[] q = amubVar.q(num.intValue());
                int length2 = q.length;
                if (length2 != 0) {
                    akrnVar = amubVar.m.d(e, d2, q[0].j, q[length2 - 1].j);
                }
            } else {
                int intValue = num.intValue();
                amuo[] p = amubVar.p();
                int i2 = 0;
                int i3 = -1;
                int i4 = 0;
                while (true) {
                    length = p.length;
                    if (i2 >= length) {
                        break;
                    }
                    amuo amuoVar = p[i2];
                    amuq amuqVar = amuoVar.b;
                    int i5 = amuqVar != null ? amuqVar.b : -1;
                    if (i3 >= 0) {
                        if (i5 != intValue) {
                            break;
                        }
                    } else if (i5 == intValue) {
                        i4 = amuoVar.j;
                    } else {
                        i2++;
                    }
                    i3 = i2;
                    i2++;
                }
                if (i3 >= 0) {
                    if (i3 < length - 1) {
                        i3++;
                    }
                    akrnVar = amubVar.m.d(e, d2, i4, p[i3].j);
                }
            }
            return akrnVar != null;
        }
        return false;
    }

    public static boolean i(vwn vwnVar) {
        amte p;
        return vwnVar.a() || (p = vwnVar.p()) == null || !p.a.t();
    }

    private static boolean j(@dzsi amub amubVar, btth btthVar, boolean z, vwv vwvVar, boolean z2) {
        amuo[] amuoVarArr;
        dpec a2;
        amuo[] amuoVarArr2;
        if (amubVar == null) {
            return false;
        }
        if (amubVar.l() != null && amubVar.l().k()) {
            return false;
        }
        if (!z2 && !vxx.f(amubVar.h)) {
            return false;
        }
        if (amubVar.h == dqvj.WALK) {
            int i = 0;
            for (amuo amuoVar : amubVar.k) {
                if (amuoVar.i >= 2) {
                    amuo amuoVar2 = amuoVar.R;
                    dbsk.s(amuoVar2);
                    if (amuoVar2.H == null) {
                        i = 0;
                    } else {
                        i += amuoVar.k;
                        if (i > 300) {
                            return false;
                        }
                    }
                }
            }
        }
        if (!z2 && !amubVar.L) {
            return false;
        }
        if (z2) {
            dcep<dqvj> dcepVar = a;
            for (amuo amuoVar3 : amubVar.k) {
                dpec dpecVar = amuoVar3.a;
                if (dpecVar != null && (dpecVar.a & 1) != 0) {
                    dqvj c = dqvj.c(dpecVar.b);
                    if (c == null) {
                        c = dqvj.DRIVE;
                    }
                    if (dcepVar.contains(c)) {
                        return false;
                    }
                }
                amuq amuqVar = amuoVar3.b;
                if (amuqVar != null && (a2 = amuqVar.a()) != null) {
                    dqvj c2 = dqvj.c(a2.b);
                    if (c2 == null) {
                        c2 = dqvj.DRIVE;
                    }
                    if (dcepVar.contains(c2)) {
                        return false;
                    }
                }
            }
        }
        if (amubVar.j().k()) {
            return true;
        }
        if (!z2 && z) {
            return true;
        }
        return g(amubVar, null, btthVar, vwvVar);
    }

    private static boolean k(bvjj bvjjVar) {
        return !"0".equals(bvjjVar.z(bvjk.au, "0"));
    }
}
