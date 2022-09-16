package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: xkg  reason: default package */
/* loaded from: classes7.dex */
public final class xkg {
    private static final cqss a = irg.H();
    private static final int b = R.color.directions_express_non_local_text;

    private static List<jhk> A(List<douj> list) {
        if (list.isEmpty()) {
            return dcdc.e();
        }
        ArrayList arrayList = new ArrayList();
        for (douj doujVar : list) {
            jhk z = z(doujVar);
            if (z != null) {
                arrayList.add(z);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static int B(dooa dooaVar) {
        dgaw dgawVar = dooaVar.c;
        if (dgawVar == null) {
            dgawVar = dgaw.g;
        }
        if ((dgawVar.a & 16) != 0) {
            dgaw dgawVar2 = dooaVar.d;
            if (dgawVar2 == null) {
                dgawVar2 = dgaw.g;
            }
            if ((dgawVar2.a & 16) != 0) {
                dgaw dgawVar3 = dooaVar.c;
                if (dgawVar3 == null) {
                    dgawVar3 = dgaw.g;
                }
                long j = dgawVar3.f;
                dgaw dgawVar4 = dooaVar.d;
                if (dgawVar4 == null) {
                    dgawVar4 = dgaw.g;
                }
                return (int) (j - dgawVar4.f);
            }
        }
        dgaw dgawVar5 = dooaVar.c;
        if (dgawVar5 == null) {
            dgawVar5 = dgaw.g;
        }
        long j2 = dgawVar5.b / 60;
        dgaw dgawVar6 = dooaVar.d;
        if (dgawVar6 == null) {
            dgawVar6 = dgaw.g;
        }
        return ((int) (j2 - (dgawVar6.b / 60))) * 60;
    }

    private static void C(dopf dopfVar, List<dopf> list, Set<dopf> set) {
        for (Integer num : dopfVar.g) {
            C(list.get(num.intValue()), list, set);
        }
        set.add(dopfVar);
    }

    @dzsi
    public static jhk b(doom doomVar) {
        return y(doomVar.a);
    }

    @dzsi
    public static jhk c(doph dophVar) {
        return y(dophVar.c);
    }

    public static List<jhk> d(doom doomVar) {
        return A(doomVar.a);
    }

    public static List<jhk> e(doph dophVar) {
        return A(dophVar.c);
    }

    public static List<jhk> f(doom doomVar) {
        return A(doomVar.b);
    }

    @dzsi
    public static String g(Context context, dooa dooaVar) {
        return h(context, dooaVar.i);
    }

    @dzsi
    public static String h(Context context, @dzsi String str) {
        if (dbsj.d(str)) {
            return null;
        }
        return context.getString(R.string.TRANSIT_DETAILS_TRAIN_PLATFORM, str);
    }

    @dzsi
    public static donz i(dooa dooaVar) {
        donz b2;
        if ((dooaVar.a & 1) == 0 || dooaVar.g) {
            return null;
        }
        donz b3 = donz.b(dooaVar.b);
        if (b3 == null) {
            b3 = donz.ON_TIME;
        }
        return ((b3 == donz.CHANGED && (dooaVar.a & 4) != 0 && B(dooaVar) == 0) || (b2 = donz.b(dooaVar.b)) == null) ? donz.ON_TIME : b2;
    }

    @dzsi
    public static String j(List<doog> list) {
        for (doog doogVar : list) {
            String str = doogVar.b;
            if (!dbsj.d(str)) {
                return str;
            }
        }
        return null;
    }

    @dzsi
    public static CharSequence k(Context context, dooa dooaVar) {
        boolean z;
        for (dpce dpceVar : dooaVar.l) {
            int a2 = dpcd.a(dpceVar.b);
            if (a2 != 0 && a2 == 16 && (dpceVar.a & 2) != 0) {
                doul doulVar = dpceVar.c;
                if (doulVar == null) {
                    doulVar = doul.f;
                }
                if ((doulVar.a & 1) != 0) {
                    dsqp dsqpVar = (dsqp) dpceVar.cu(5);
                    dsqpVar.bC(dpceVar);
                    dpcb dpcbVar = (dpcb) dsqpVar;
                    dbsg dbsgVar = dbpy.a;
                    doul doulVar2 = dpceVar.c;
                    if (doulVar2 == null) {
                        doulVar2 = doul.f;
                    }
                    if ((doulVar2.a & 8) != 0) {
                        doul doulVar3 = dpceVar.c;
                        if (doulVar3 == null) {
                            doulVar3 = doul.f;
                        }
                        dbsgVar = dbsg.i(Integer.valueOf(Color.parseColor(doulVar3.e)));
                        z = ((Integer) ((dbsu) dbsgVar).a).equals(-16777216);
                    } else {
                        z = false;
                    }
                    String e = bvoa.e(a.b(context));
                    String e2 = bvoa.e(context.getResources().getColor(b));
                    doul doulVar4 = dpceVar.c;
                    if (doulVar4 == null) {
                        doulVar4 = doul.f;
                    }
                    dsqp dsqpVar2 = (dsqp) doulVar4.cu(5);
                    dsqpVar2.bC(doulVar4);
                    douk doukVar = (douk) dsqpVar2;
                    if (!z && dbsgVar.a()) {
                        e = e2;
                    }
                    if (doukVar.c) {
                        doukVar.bF();
                        doukVar.c = false;
                    }
                    doul doulVar5 = (doul) doukVar.b;
                    e.getClass();
                    doulVar5.a |= 8;
                    doulVar5.e = e;
                    if (dpcbVar.c) {
                        dpcbVar.bF();
                        dpcbVar.c = false;
                    }
                    dpce dpceVar2 = (dpce) dpcbVar.b;
                    doul bK = doukVar.bK();
                    bK.getClass();
                    dpceVar2.c = bK;
                    dpceVar2.a |= 2;
                    alcb a3 = alcc.a();
                    a3.a = context;
                    CharSequence c = a3.a().c(dpcbVar.bK());
                    if (!TextUtils.isEmpty(c)) {
                        return c;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    @dzsi
    public static String l(dooa dooaVar) {
        for (dpce dpceVar : dooaVar.l) {
            int a2 = dpcd.a(dpceVar.b);
            if (a2 != 0 && a2 == 17) {
                doul doulVar = dpceVar.c;
                if (doulVar == null) {
                    doulVar = doul.f;
                }
                String str = doulVar.b;
                if (!dbsj.d(str)) {
                    return str;
                }
            }
        }
        return null;
    }

    public static dcdc<dpce> m(dopk dopkVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (doph dophVar : dopkVar.e) {
            for (dooo doooVar : dophVar.d) {
                if (doooVar.c.size() > 0) {
                    linkedHashSet.add(doooVar.c.get(0));
                }
            }
        }
        return dcdc.q(alcf.o(linkedHashSet));
    }

    @dzsi
    public static cqtd n(@dzsi doza dozaVar) {
        if (dozaVar == null) {
            return null;
        }
        return cqrt.f(alca.a(dozaVar));
    }

    @dzsi
    public static String o(Context context, doof doofVar) {
        if ((doofVar.a & 4) != 0) {
            dgas dgasVar = doofVar.d;
            if (dgasVar == null) {
                dgasVar = dgas.e;
            }
            return context.getString(R.string.TRANSIT_EVERY, (dgasVar.a & 2) != 0 ? dgasVar.c : bvtb.c(context.getResources(), dgasVar, bvsz.MINIMAL));
        }
        return null;
    }

    public static Set<dopf> p(dopf dopfVar, List<dopf> list) {
        HashSet c = dcnm.c();
        C(dopfVar, list, c);
        c.remove(dopfVar);
        return c;
    }

    @dzsi
    static dopf q(dopk dopkVar, dooo doooVar) {
        if ((doooVar.a & 16) != 0) {
            return dopkVar.w.get(doooVar.h);
        }
        return null;
    }

    public static Iterable<dood> r(Context context, doog doogVar) {
        if (doogVar.e.size() != 0) {
            dood doodVar = doogVar.e.get(0);
            if (doodVar.b != 2) {
                return doogVar.e;
            }
            return dcft.o(doogVar.d, new xkf(o(context, (doof) doodVar.c)));
        }
        return dcdc.e();
    }

    public static Iterable<dood> s(doog doogVar) {
        if (doogVar.e.size() == 0) {
            if (doogVar.d.size() != 0) {
                return dcft.o(doogVar.d, xkf.a);
            }
            return Collections.emptyList();
        }
        return doogVar.e;
    }

    public static dcep<dozz> t(dopk dopkVar) {
        dcen N = dcep.N();
        N.i(dopkVar.l);
        for (doom doomVar : dopkVar.f) {
            N.i(doomVar.e);
        }
        return N.f();
    }

    public static boolean u(dopk dopkVar) {
        if ((dopkVar.a & 131072) != 0) {
            int a2 = dope.a(dopkVar.w.get(dopkVar.v).b);
            return a2 != 0 && a2 == 3;
        }
        return false;
    }

    public static String v(dopk dopkVar, dooo doooVar) {
        dopf q = q(dopkVar, doooVar);
        return q != null ? q.c : dopkVar.b;
    }

    public static String w(dopk dopkVar, dooo doooVar) {
        dopf q = q(dopkVar, doooVar);
        return q != null ? q.e : dopkVar.d;
    }

    @dzsi
    public static String x(Context context, dooa dooaVar, boolean z) {
        if ((dooaVar.a & 16) != 0) {
            return dooaVar.f;
        }
        if (dooaVar.g) {
            return null;
        }
        if (i(dooaVar) == null) {
            if (z) {
                return context.getString(R.string.TRANSIT_DEPARTURE_STATUS_DEPARTED);
            }
            return context.getString(R.string.TRANSIT_REALTIME_INFORMATION_ABSENT);
        }
        donz i = i(dooaVar);
        if (i == null) {
            return null;
        }
        int ordinal = i.ordinal();
        if (ordinal == 0) {
            if (z) {
                return context.getString(R.string.TRANSIT_REALTIME_INFORMATION_DEPARTED_ON_TIME);
            }
            return context.getString(R.string.TRANSIT_REALTIME_INFORMATION_ON_TIME);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return context.getString(R.string.TRANSIT_REALTIME_INFORMATION_CANCELED);
            }
            return null;
        } else if ((dooaVar.a & 4) == 0) {
            if (z) {
                return context.getString(R.string.TRANSIT_DEPARTURE_STATUS_DEPARTED);
            }
            return context.getString(R.string.TRANSIT_REALTIME_INFORMATION_TIME_UPDATED);
        } else {
            int B = B(dooaVar);
            if (!z) {
                return context.getString(B > 0 ? R.string.TRANSIT_REALTIME_INFORMATION_DELAYED_BY_AMOUNT : R.string.TRANSIT_REALTIME_INFORMATION_EARLY_BY_AMOUNT, bvtb.e(context.getResources(), Math.abs(B), bvsz.ABBREVIATED));
            } else if (B > 0) {
                return context.getString(R.string.TRANSIT_REALTIME_INFORMATION_DEPARTED_LATE);
            } else {
                return context.getString(R.string.TRANSIT_REALTIME_INFORMATION_DEPARTED_EARLY);
            }
        }
    }

    @dzsi
    private static jhk y(List<douj> list) {
        for (douj doujVar : list) {
            jhk z = z(doujVar);
            if (z != null) {
                return z;
            }
        }
        return null;
    }

    @dzsi
    private static jhk z(douj doujVar) {
        dbsg dbsgVar;
        int a2 = doug.a(doujVar.b);
        if (a2 == 0 || a2 != 4 || (doujVar.a & 2) == 0) {
            return null;
        }
        String str = doujVar.c;
        vtj vtjVar = vtj.TRANSIT_AUTO;
        dbsg j = dbsg.j(dbsj.f(doujVar.e));
        dbsg j2 = dbsg.j(dbsj.f(doujVar.f));
        if ((doujVar.a & 16) != 0) {
            dbsgVar = dbsg.i(Float.valueOf(doujVar.g));
        } else {
            dbsgVar = dbpy.a;
        }
        return new jhk(str, vtjVar, j, j2, dbsgVar);
    }

    public static String a(bvsl bvslVar, dvwc dvwcVar) {
        int a2 = dvwe.a(dvwcVar.d);
        dowa dowaVar = null;
        if (a2 != 0 && a2 == 2) {
            dowaVar = dowa.KILOMETERS;
        } else {
            int a3 = dvwe.a(dvwcVar.d);
            if (a3 != 0 && a3 == 3) {
                dowaVar = dowa.MILES;
            }
        }
        return bvslVar.c(dvwcVar.b, dowaVar, false, true);
    }
}
