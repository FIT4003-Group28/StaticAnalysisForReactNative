package defpackage;

import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: phc  reason: default package */
/* loaded from: classes4.dex */
public final class phc extends pkt {
    public final int a;
    public final pkt[] b;
    private final int d;
    private final prl e;
    private final int f;
    private final int[] g;
    private final int[] h;
    private final Object[] i;
    private final HashMap j;

    public phc(Collection collection, prl prlVar) {
        this.e = prlVar;
        this.d = prlVar.a();
        int size = collection.size();
        this.g = new int[size];
        this.h = new int[size];
        this.b = new pkt[size];
        this.i = new Object[size];
        this.j = new HashMap();
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            pjj pjjVar = (pjj) it.next();
            this.b[i3] = pjjVar.a();
            this.h[i3] = i;
            this.g[i3] = i2;
            i += this.b[i3].q();
            i2 += this.b[i3].p();
            this.i[i3] = pjjVar.b();
            this.j.put(this.i[i3], Integer.valueOf(i3));
            i3++;
        }
        this.a = i;
        this.f = i2;
    }

    private final int A(int i, boolean z) {
        if (!z) {
            if (i < this.d - 1) {
                return i + 1;
            }
            return -1;
        }
        prl prlVar = this.e;
        int i2 = prlVar.c[i] + 1;
        int[] iArr = prlVar.b;
        if (i2 >= iArr.length) {
            return -1;
        }
        return iArr[i2];
    }

    private final int B(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        prl prlVar = this.e;
        int i2 = prlVar.c[i] - 1;
        if (i2 < 0) {
            return -1;
        }
        return prlVar.b[i2];
    }

    public static Object h(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object i(Object obj) {
        return ((Pair) obj).first;
    }

    @Override // defpackage.pkt
    public final int a(boolean z) {
        if (this.d == 0) {
            return -1;
        }
        int i = 0;
        if (z) {
            int[] iArr = this.e.b;
            i = iArr.length > 0 ? iArr[0] : -1;
        }
        while (r(i).z()) {
            i = A(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return o(i) + r(i).a(z);
    }

    @Override // defpackage.pkt
    public final int b(Object obj) {
        int b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object i = i(obj);
        Object h = h(obj);
        int k = k(i);
        if (k != -1 && (b = r(k).b(h)) != -1) {
            return n(k) + b;
        }
        return -1;
    }

    @Override // defpackage.pkt
    public final int c(boolean z) {
        int i;
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = this.e.b;
            int length = iArr.length;
            i = length > 0 ? iArr[length - 1] : -1;
        } else {
            i = i2 - 1;
        }
        while (r(i).z()) {
            i = B(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return o(i) + r(i).c(z);
    }

    @Override // defpackage.pkt
    public final int d(int i, int i2, boolean z) {
        int m = m(i);
        int o = o(m);
        int d = r(m).d(i - o, i2 == 2 ? 0 : i2, z);
        if (d != -1) {
            return o + d;
        }
        int A = A(m, z);
        while (A != -1 && r(A).z()) {
            A = A(A, z);
        }
        if (A != -1) {
            return o(A) + r(A).a(z);
        }
        if (i2 != 2) {
            return -1;
        }
        return a(z);
    }

    @Override // defpackage.pkt
    public final pkr e(int i, pkr pkrVar, boolean z) {
        int l = l(i);
        int o = o(l);
        r(l).e(i - n(l), pkrVar, z);
        pkrVar.c += o;
        if (z) {
            Object s = s(l);
            Object obj = pkrVar.b;
            ptx.a(obj);
            pkrVar.b = Pair.create(s, obj);
        }
        return pkrVar;
    }

    @Override // defpackage.pkt
    public final pkr f(Object obj, pkr pkrVar) {
        Object i = i(obj);
        Object h = h(obj);
        int k = k(i);
        int o = o(k);
        r(k).f(h, pkrVar);
        pkrVar.c += o;
        pkrVar.b = obj;
        return pkrVar;
    }

    @Override // defpackage.pkt
    public final pks g(int i, pks pksVar, long j) {
        int m = m(i);
        int o = o(m);
        int n = n(m);
        r(m).g(i - o, pksVar, j);
        Object s = s(m);
        if (!pks.a.equals(pksVar.b)) {
            s = Pair.create(s, pksVar.b);
        }
        pksVar.b = s;
        pksVar.o += n;
        pksVar.p += n;
        return pksVar;
    }

    @Override // defpackage.pkt
    public final Object j(int i) {
        int l = l(i);
        return Pair.create(s(l), r(l).j(i - n(l)));
    }

    protected final int k(Object obj) {
        Integer num = (Integer) this.j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    protected final int l(int i) {
        return pxi.ag(this.g, i + 1);
    }

    protected final int m(int i) {
        return pxi.ag(this.h, i + 1);
    }

    protected final int n(int i) {
        return this.g[i];
    }

    protected final int o(int i) {
        return this.h[i];
    }

    @Override // defpackage.pkt
    public final int p() {
        return this.f;
    }

    @Override // defpackage.pkt
    public final int q() {
        return this.a;
    }

    protected final pkt r(int i) {
        return this.b[i];
    }

    protected final Object s(int i) {
        return this.i[i];
    }

    @Override // defpackage.pkt
    public final int t(int i, int i2) {
        int m = m(i);
        int o = o(m);
        int t = r(m).t(i - o, i2 == 2 ? 0 : i2);
        if (t != -1) {
            return o + t;
        }
        int B = B(m, false);
        while (B != -1 && r(B).z()) {
            B = B(B, false);
        }
        if (B != -1) {
            return o(B) + r(B).c(false);
        }
        if (i2 != 2) {
            return -1;
        }
        return c(false);
    }
}
