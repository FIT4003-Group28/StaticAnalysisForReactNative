package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wkr  reason: default package */
/* loaded from: classes4.dex */
public final class wkr {
    public final wvc a;
    public final wrj b;
    public final wpn c;
    public final Map d;
    public final azqb e;
    public final amvn f;
    final Map g = new HashMap();

    public wkr(wvc wvcVar, wrj wrjVar, wpn wpnVar, Map map, azqb azqbVar, amvn amvnVar) {
        this.a = wvcVar;
        this.b = wrjVar;
        this.c = wpnVar;
        this.d = map;
        this.e = azqbVar;
        this.f = amvnVar;
    }

    public static String d(wks wksVar, String str) {
        String a = wksVar.a();
        StringBuilder sb = new StringBuilder(a.length() + 37 + str.length());
        sb.append("Slot status was ");
        sb.append(a);
        sb.append(" when calling method ");
        sb.append(str);
        return sb.toString();
    }

    public static final void s(wks wksVar, List list) {
        amzt listIterator = ((amuk) list).listIterator();
        while (listIterator.hasNext()) {
            xek xekVar = (xek) listIterator.next();
            wvs wvsVar = (wvs) wksVar.e.remove(xekVar.c());
            if (wvsVar != null) {
                wvsVar.qO(xekVar);
            }
        }
    }

    public static final void t(wks wksVar, String str) {
        String str2;
        xdu xduVar = wksVar.a;
        int i = wksVar.p;
        if (i == 0) {
            str2 = "FILL_NOT_REQUESTED";
        } else if (i == 1) {
            str2 = "FILL_REQUESTED";
        } else if (i != 2) {
            throw new IllegalStateException();
        } else {
            str2 = "FILLED";
        }
        StringBuilder sb = new StringBuilder(str2.length() + 44 + str.length());
        sb.append("Fulfillment status was ");
        sb.append(str2);
        sb.append(" when calling method ");
        sb.append(str);
        wwf.a(xduVar, sb.toString());
    }

    public static final void u(wks wksVar, String str) {
        wwf.a(wksVar.a, d(wksVar, str));
    }

    public final wks a(xdu xduVar) {
        return (wks) e(xduVar).get(xduVar.a);
    }

    public final xcb b(xdu xduVar) {
        wks a = a(xduVar);
        if (a != null) {
            return a.b;
        }
        return null;
    }

    public final xci c(xdu xduVar) {
        wks a = a(xduVar);
        if (a == null) {
            return null;
        }
        return a.n;
    }

    public final Map e(xdu xduVar) {
        ampr amprVar = xduVar.b;
        if (this.f.contains(xduVar.c()) && !this.g.containsKey(amprVar)) {
            this.g.put(amprVar, new HashMap());
        }
        return (Map) this.g.get(amprVar);
    }

    public final void f(xdu xduVar) {
        a(xduVar).l = true;
    }

    public final void g(xdu xduVar) {
        a(xduVar).m = true;
    }

    public final void h(wks wksVar, xci xciVar, List list, int i) {
        amzt listIterator = ((amuk) list).listIterator();
        while (listIterator.hasNext()) {
            xek xekVar = (xek) listIterator.next();
            wvs wvsVar = (wvs) ((azqb) this.d.get(xekVar.b())).get();
            wvsVar.qN(i, xekVar, wksVar.a, xciVar);
            wksVar.e.put(xekVar.c(), wvsVar);
        }
    }

    public final void i(xdu xduVar, xci xciVar) {
        amzs it = xciVar.g.keySet().iterator();
        while (it.hasNext()) {
            xek xekVar = (xek) it.next();
            ((wvs) ((azqb) this.d.get(xekVar.b())).get()).qN(0, xekVar, xduVar, xciVar);
        }
    }

    public final void j(xci xciVar) {
        amzs it = xciVar.g.keySet().iterator();
        while (it.hasNext()) {
            xek xekVar = (xek) it.next();
            ((wvs) ((azqb) this.d.get(xekVar.b())).get()).qO(xekVar);
        }
    }

    public final void k(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            xek xekVar = (xek) it.next();
            if (this.d.get(xekVar.b()) == null) {
                String valueOf = String.valueOf(xekVar.b().name());
                throw new wuo(valueOf.length() != 0 ? "No trigger adapter registered for layout with trigger of type: ".concat(valueOf) : new String("No trigger adapter registered for layout with trigger of type: "));
            }
        }
    }

    public final boolean l(xdu xduVar) {
        wks a = a(xduVar);
        return (a == null || a.n == null || a.k == null) ? false : true;
    }

    public final boolean m(xdu xduVar) {
        return e(xduVar).containsKey(xduVar.a);
    }

    public final boolean n(xdu xduVar) {
        return a(xduVar).m;
    }

    public final boolean o(xdu xduVar, xci xciVar) {
        xci xciVar2;
        wks a = a(xduVar);
        if (a == null || (xciVar2 = a.n) == null) {
            return false;
        }
        return TextUtils.equals(xciVar2.a, xciVar.a);
    }

    public final boolean p(xdu xduVar) {
        wks a = a(xduVar);
        return a != null && a.d();
    }

    public final boolean q(xdu xduVar) {
        wks a = a(xduVar);
        if (a != null) {
            int i = a.o;
            return i == 3 || i == 4 || i == 5 || i == 6;
        }
        return false;
    }

    public final boolean r(xdu xduVar) {
        wks a = a(xduVar);
        return a != null && a.f();
    }
}
