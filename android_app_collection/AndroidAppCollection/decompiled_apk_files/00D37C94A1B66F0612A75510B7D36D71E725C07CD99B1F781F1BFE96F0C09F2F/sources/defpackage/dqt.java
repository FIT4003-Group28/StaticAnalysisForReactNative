package defpackage;

import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dqt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dqt {
    public static dqz a(dqv dqvVar, dqz dqzVar, dpu dpuVar, List list) {
        drc drcVar = (drc) dqzVar;
        if (dqvVar.t(drcVar.a)) {
            dqz f = dqvVar.f(drcVar.a);
            if (f instanceof dqs) {
                return ((dqs) f).a(dpuVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", drcVar.a));
        } else if ("hasOwnProperty".equals(drcVar.a)) {
            l("hasOwnProperty", 1, list);
            return dqvVar.t(dpuVar.b((dqz) list.get(0)).i()) ? dqz.k : dqz.l;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", drcVar.a));
        }
    }

    public static Iterator b(Map map) {
        return new dqu(map.keySet().iterator());
    }

    public static dqz c(rqs rqsVar) {
        if (rqsVar == null) {
            return dqz.f;
        }
        int c = rqt.c(rqsVar.c);
        if (c == 0) {
            c = 1;
        }
        int i = c - 1;
        if (i == 1) {
            if ((rqsVar.b & 4) == 0) {
                return dqz.m;
            }
            return new drc(rqsVar.f);
        } else if (i == 2) {
            if ((rqsVar.b & 16) == 0) {
                return new dqr(null);
            }
            return new dqr(Double.valueOf(rqsVar.h));
        } else if (i == 3) {
            if ((rqsVar.b & 8) == 0) {
                return new dqp(null);
            }
            return new dqp(Boolean.valueOf(rqsVar.g));
        } else if (i == 4) {
            aopu<rqs> aopuVar = rqsVar.d;
            ArrayList arrayList = new ArrayList();
            for (rqs rqsVar2 : aopuVar) {
                arrayList.add(c(rqsVar2));
            }
            return new dra(rqsVar.e, arrayList);
        } else {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
    }

    public static dqz d(Object obj) {
        if (obj == null) {
            return dqz.g;
        }
        if (obj instanceof String) {
            return new drc((String) obj);
        }
        if (obj instanceof Double) {
            return new dqr((Double) obj);
        }
        if (obj instanceof Long) {
            return new dqr(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new dqr(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new dqp((Boolean) obj);
        }
        if (obj instanceof Map) {
            dqw dqwVar = new dqw();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                dqz d = d(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    dqwVar.r((String) obj2, d);
                }
            }
            return dqwVar;
        } else if (obj instanceof List) {
            dqo dqoVar = new dqo();
            for (Object obj3 : (List) obj) {
                dqoVar.n(d(obj3));
            }
            return dqoVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public static double e(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        double d2 = d > 0.0d ? 1 : -1;
        double floor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return d2 * floor;
    }

    public static int f(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        double d2 = d > 0.0d ? 1 : -1;
        double floor = Math.floor(Math.abs(d));
        Double.isNaN(d2);
        return (int) ((d2 * floor) % 4.294967296E9d);
    }

    public static long g(double d) {
        return f(d) & 4294967295L;
    }

    public static drr h(String str) {
        drr drrVar = null;
        if (str != null && !str.isEmpty()) {
            drrVar = (drr) drr.ao.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (drrVar != null) {
            return drrVar;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object i(dqz dqzVar) {
        if (dqz.g.equals(dqzVar)) {
            return null;
        }
        if (dqz.f.equals(dqzVar)) {
            return "";
        }
        if (dqzVar instanceof dqw) {
            return j((dqw) dqzVar);
        }
        if (dqzVar instanceof dqo) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((dqo) dqzVar).iterator();
            while (it.hasNext()) {
                Object i = i(((dqn) it).next());
                if (i != null) {
                    arrayList.add(i);
                }
            }
            return arrayList;
        } else if (!dqzVar.h().isNaN()) {
            return dqzVar.h();
        } else {
            return dqzVar.i();
        }
    }

    public static Map j(dqw dqwVar) {
        HashMap hashMap = new HashMap();
        for (String str : new ArrayList(dqwVar.a.keySet())) {
            Object i = i(dqwVar.f(str));
            if (i != null) {
                hashMap.put(str, i);
            }
        }
        return hashMap;
    }

    public static void k(drr drrVar, int i, List list) {
        l(drrVar.name(), i, list);
    }

    public static void l(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
    }

    public static void m(drr drrVar, int i, List list) {
        n(drrVar.name(), i, list);
    }

    public static void n(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
    }

    public static void o(String str, int i, List list) {
        if (list.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
    }

    public static boolean p(dqz dqzVar) {
        if (dqzVar == null) {
            return false;
        }
        Double h = dqzVar.h();
        return !h.isNaN() && h.doubleValue() >= 0.0d && h.equals(Double.valueOf(Math.floor(h.doubleValue())));
    }

    public static boolean q(dqz dqzVar, dqz dqzVar2) {
        if (!dqzVar.getClass().equals(dqzVar2.getClass())) {
            return false;
        }
        if ((dqzVar instanceof drd) || (dqzVar instanceof dqx)) {
            return true;
        }
        if (dqzVar instanceof dqr) {
            if (!Double.isNaN(dqzVar.h().doubleValue()) && !Double.isNaN(dqzVar2.h().doubleValue())) {
                return dqzVar.h().equals(dqzVar2.h());
            }
            return false;
        } else if (dqzVar instanceof drc) {
            return dqzVar.i().equals(dqzVar2.i());
        } else {
            if (dqzVar instanceof dqp) {
                return dqzVar.g().equals(dqzVar2.g());
            }
            return dqzVar == dqzVar2;
        }
    }

    public static void r(dpu dpuVar) {
        int f = f(dpuVar.d("runtime.counter").h().doubleValue() + 1.0d);
        if (f <= 1000000) {
            dpuVar.g("runtime.counter", new dqr(Double.valueOf(f)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static void s(Context context) {
        doh a = doh.a(context);
        synchronized (a.a) {
            a.b.add("1001680686");
            a.c.remove("1001680686");
        }
    }

    public static void t(cyv cyvVar, int i, int i2, ddj ddjVar, ComponentTree componentTree, cyr cyrVar, boolean z, boolean z2) {
        if (z && (!z2 || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE)) {
            dfa a = dfb.a(cyvVar);
            a.e(cyrVar);
            a.M(View.MeasureSpec.getSize(i2));
            cyrVar = a.a();
        }
        componentTree.p(cyrVar, i, View.MeasureSpec.makeMeasureSpec(0, 0), ddjVar);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            ddjVar.b = Math.min(View.MeasureSpec.getSize(i2), ddjVar.b);
        } else if (mode != 1073741824) {
        } else {
            ddjVar.b = View.MeasureSpec.getSize(i2);
        }
    }
}
