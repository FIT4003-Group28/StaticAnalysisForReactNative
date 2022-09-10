package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: csie  reason: default package */
/* loaded from: classes5.dex */
public final class csie {
    public final Set<csgt> a = new LinkedHashSet();
    public final Set<csgt> b = new LinkedHashSet();
    private final Map<cshb, csid> i = new HashMap();
    public final List<csid> c = new ArrayList();
    public final List<csgt> d = new ArrayList();
    public final Map<csgt, Collection<cshb>> e = new HashMap();
    public Collection<cshb> f = null;
    public final boolean g = true;
    public final Set<Integer> h = dcmr.a;

    private final csid e(csgt csgtVar) {
        csid csidVar = new csid(this.c.size(), this.a.size());
        cshb b = csidVar.b(csgtVar, -1);
        ArrayList arrayList = new ArrayList(1);
        cshv.a(csgtVar, arrayList);
        ddxx ddxxVar = b.c;
        if (ddxxVar == null) {
            ddxxVar = ddxx.j;
        }
        csidVar.a(new csip(1, arrayList, ddxxVar.b));
        this.c.add(csidVar);
        this.i.put(b, csidVar);
        return csidVar;
    }

    public final List<csgc> a() {
        dazk a = dbaa.a("GIL:LogBatch");
        try {
            ArrayList arrayList = new ArrayList(this.c.size());
            for (csid csidVar : this.c) {
                arrayList.add(new csiq(csidVar.a, csidVar.b, csidVar.c, csidVar.d, csidVar.e, csidVar.f));
            }
            this.c.clear();
            this.i.clear();
            a.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                deki.a(th, th2);
            }
            throw th;
        }
    }

    public final csid b(csgt csgtVar) {
        int i = csgtVar.d;
        if (i != -1) {
            if (i != -2) {
                return this.c.get(i);
            }
            return null;
        }
        dbsk.l(csgtVar.d());
        this.d.add(csgtVar);
        csht<csgt> cshtVar = csgtVar.c;
        if (cshtVar.c()) {
            return e(csgtVar);
        }
        csgt i2 = cshtVar.i();
        if (i2 == null) {
            cshb b = csgtVar.b();
            dsqv<cshb, cski> dsqvVar = cskj.a;
            b.f(dsqvVar);
            if (!b.V.k(dsqvVar.d)) {
                int i3 = cshd.e;
                csht<csgt> cshtVar2 = csgtVar.c;
                View view = cshtVar2 instanceof cshd ? ((cshd) cshtVar2).a : null;
                while (true) {
                    if (view != null) {
                        if (!cshd.b(view)) {
                            ViewParent parent = view.getParent();
                            if (!(parent instanceof View)) {
                                break;
                            }
                            view = (View) parent;
                        } else {
                            String valueOf = String.valueOf(csgtVar);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 180);
                            sb.append("Unexpected visual element (");
                            sb.append(valueOf);
                            sb.append(") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/impressions#requirements.");
                            sb.toString();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                csgtVar.d = -2;
                return null;
            }
            return e(csgtVar);
        } else if (i2.d != -1 || !i2.e()) {
            csid b2 = b(i2);
            if (b2 == null) {
                return null;
            }
            ddxx ddxxVar = ((cshb) i2.a.b).c;
            if (ddxxVar == null) {
                ddxxVar = ddxx.j;
            }
            b2.b(csgtVar, ddxxVar.b);
            return b2;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(null);
            cshv.a(i2, arrayList);
            dbsk.l(arrayList.size() > 1);
            csid c = c(arrayList, this.a.size());
            cshb b3 = c.b(csgtVar, -1);
            arrayList.set(0, b3);
            ddxx ddxxVar2 = b3.c;
            if (ddxxVar2 == null) {
                ddxxVar2 = ddxx.j;
            }
            c.a(new csip(1, arrayList, ddxxVar2.b));
            return c;
        }
    }

    public final csid c(List<cshb> list, int i) {
        cshb cshbVar = (cshb) dcft.s(list);
        csid csidVar = this.i.get(cshbVar);
        if (csidVar == null) {
            csid csidVar2 = new csid(this.c.size(), i);
            this.c.add(csidVar2);
            this.i.put(cshbVar, csidVar2);
            return csidVar2;
        }
        return csidVar;
    }

    public final boolean d(csgt csgtVar, ddhj ddhjVar) {
        if (!this.a.contains(csgtVar)) {
            ddhj b = ddhj.b(((cshb) csgtVar.a.b).d);
            if (b == null) {
                b = ddhj.VISIBILITY_VISIBLE;
            }
            if (b == ddhjVar) {
                this.b.remove(csgtVar);
                return false;
            }
            this.b.add(csgtVar);
            return true;
        }
        return false;
    }
}
