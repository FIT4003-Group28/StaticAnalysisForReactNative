package defpackage;

import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: sct  reason: default package */
/* loaded from: classes4.dex */
public final class sct extends scm implements scs {
    private float b;
    private float c;
    private float d;

    @Override // defpackage.scm
    protected final void A(Object obj, Object obj2, Double d, Double d2, int i, set setVar, set setVar2, set setVar3, set setVar4, TreeMap treeMap, scl sclVar) {
        float a;
        float f;
        float a2;
        Comparable comparable = (Comparable) obj2;
        boolean o = this.a.o(obj2);
        float a3 = this.a.a(obj2);
        Map.Entry lowerEntry = treeMap.lowerEntry(comparable);
        if (lowerEntry == null) {
            lowerEntry = treeMap.higherEntry(comparable);
        }
        if (lowerEntry != null) {
            if (!o) {
                a3 = h(((Integer) lowerEntry.getValue()).intValue());
            }
            f = j(((Integer) lowerEntry.getValue()).intValue());
            a = i(((Integer) lowerEntry.getValue()).intValue());
        } else {
            if (!o) {
                a3 = setVar.a(obj2);
            }
            Double valueOf = Double.valueOf(0.0d);
            float a4 = setVar2.a(valueOf);
            a = setVar2.a(valueOf);
            f = a4;
        }
        sclVar.a.d(obj, 0.0f, 0.0f, 1);
        sclVar.b.d(obj2, a3, setVar.a(obj2), 1);
        scg scgVar = sclVar.c;
        if (d != null) {
            a2 = setVar2.b(d, d2);
        } else {
            a2 = setVar2.a(d2);
        }
        scgVar.d(d, f, a2, 1);
        sclVar.d.d(d2, a, setVar2.a(d2), 1);
        sclVar.e.a(i, i, 1);
    }

    @Override // defpackage.scs
    public final scu a() {
        if (this.a == null) {
            return null;
        }
        return new scu(o(), p(), this.c);
    }

    @Override // defpackage.scs
    public final void b(scu scuVar) {
        if (scuVar == null) {
            return;
        }
        v(scuVar.a);
        w(scuVar.b);
        this.b = this.c;
        float f = scuVar.c;
        this.c = f;
        this.d = f;
    }

    @Override // defpackage.scs
    public final void c(float f) {
        this.b = this.c;
        this.d = f;
    }

    @Override // defpackage.scs
    public final void d() {
    }

    @Override // defpackage.scm
    protected final scl f(sgt sgtVar) {
        return n(sgtVar);
    }

    @Override // defpackage.scm, defpackage.sco
    public final synchronized void g(float f) {
        super.g(f);
        this.c = scf.a(this.b, this.d, f);
    }

    @Override // defpackage.scm
    protected final void y(Object obj, Object obj2, set setVar, set setVar2, TreeMap treeMap, scl sclVar) {
        int i;
        float h;
        if (obj != null) {
            Map.Entry higherEntry = treeMap.higherEntry((Comparable) obj2);
            if (higherEntry == null) {
                return;
            }
            i = ((Integer) higherEntry.getValue()).intValue();
        } else {
            i = 0;
        }
        int l = l();
        while (i < l) {
            Object t = t(i);
            Double r = r(i);
            Double q = q(i);
            int k = k(i);
            if (setVar.o(t)) {
                h = setVar.a(t);
            } else {
                h = h(i) + setVar.e();
            }
            Double d = null;
            if (r != null && obj != null) {
                d = r;
            }
            sclVar.a.d(s(i), 0.0f, 0.0f, 0);
            sclVar.b.d(t(i), h(i), h, 0);
            sclVar.c.d(r, j(i), setVar2.b(d, q), 0);
            sclVar.d.d(q, i(i), setVar2.a(q), 0);
            sclVar.e.a(k, k, 0);
            i++;
        }
    }

    @Override // defpackage.scm
    protected final void z(Object obj, set setVar, set setVar2, TreeMap treeMap, scl sclVar) {
        float h;
        Map.Entry lowerEntry = treeMap.lowerEntry((Comparable) obj);
        if (lowerEntry != null) {
            for (int i = 0; i <= ((Integer) lowerEntry.getValue()).intValue(); i++) {
                Object t = t(i);
                Double r = r(i);
                Double q = q(i);
                int k = k(i);
                if (setVar.o(t)) {
                    h = setVar.a(t);
                } else {
                    h = h(i) - setVar.e();
                }
                sclVar.a.d(s(i), 0.0f, 0.0f, 0);
                sclVar.b.d(t(i), h(i), h, 0);
                sclVar.c.d(r, j(i), setVar2.b(r, q), 0);
                sclVar.d.d(q, i(i), setVar2.a(q), 0);
                sclVar.e.a(k, k, 0);
            }
        }
    }
}
