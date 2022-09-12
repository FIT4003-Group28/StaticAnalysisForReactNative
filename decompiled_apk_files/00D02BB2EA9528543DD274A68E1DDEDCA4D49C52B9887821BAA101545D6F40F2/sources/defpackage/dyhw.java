package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dyhw  reason: default package */
/* loaded from: classes6.dex */
public final class dyhw {
    public static final dyhp<byte[]> a = new dyhk();
    public static final dyhn<String> b = new dyhl();
    static final ddae c = ddae.d.h();
    public Object[] d;
    public int e;

    public dyhw() {
    }

    public dyhw(int i, Object[] objArr) {
        this.e = i;
        this.d = objArr;
    }

    private final void m(int i, byte[] bArr) {
        this.d[i + i] = bArr;
    }

    private final void n(int i, Object obj) {
        if (this.d instanceof byte[][]) {
            p(o());
        }
        this.d[i + i + 1] = obj;
    }

    private final int o() {
        Object[] objArr = this.d;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void p(int i) {
        Object[] objArr = new Object[i];
        if (!f()) {
            System.arraycopy(this.d, 0, objArr, 0, e());
        }
        this.d = objArr;
    }

    public final byte[] a(int i) {
        return (byte[]) this.d[i + i];
    }

    public final Object b(int i) {
        return this.d[i + i + 1];
    }

    public final byte[] c(int i) {
        Object b2 = b(i);
        if (b2 instanceof byte[]) {
            return (byte[]) b2;
        }
        dyht dyhtVar = (dyht) b2;
        throw null;
    }

    public final <T> T d(int i, dyhs<T> dyhsVar) {
        Object b2 = b(i);
        if (b2 instanceof byte[]) {
            return dyhsVar.b((byte[]) b2);
        }
        dyht dyhtVar = (dyht) b2;
        throw null;
    }

    public final int e() {
        int i = this.e;
        return i + i;
    }

    public final boolean f() {
        return this.e == 0;
    }

    public final boolean g(dyhs<?> dyhsVar) {
        for (int i = 0; i < this.e; i++) {
            if (Arrays.equals(dyhsVar.b, a(i))) {
                return true;
            }
        }
        return false;
    }

    @dzsi
    public final <T> T h(dyhs<T> dyhsVar) {
        int i = this.e;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(dyhsVar.b, a(i)));
        return (T) d(i, dyhsVar);
    }

    public final <T> void i(dyhs<T> dyhsVar, T t) {
        dbsk.t(dyhsVar, "key");
        dbsk.t(t, "value");
        if (e() == 0 || e() == o()) {
            int e = e();
            p(Math.max(e + e, 8));
        }
        m(this.e, dyhsVar.b);
        int i = this.e;
        this.d[i + i + 1] = dyhsVar.a(t);
        this.e++;
    }

    public final <T> void j(dyhs<T> dyhsVar) {
        if (!f()) {
            int i = 0;
            for (int i2 = 0; i2 < this.e; i2++) {
                if (!Arrays.equals(dyhsVar.b, a(i2))) {
                    m(i, a(i2));
                    n(i, b(i2));
                    i++;
                }
            }
            Arrays.fill(this.d, i + i, e(), (Object) null);
            this.e = i;
        }
    }

    public final void k(dyhw dyhwVar) {
        if (dyhwVar.f()) {
            return;
        }
        int o = o() - e();
        if (f() || o < dyhwVar.e()) {
            p(e() + dyhwVar.e());
        }
        System.arraycopy(dyhwVar.d, 0, this.d, e(), dyhwVar.e());
        this.e += dyhwVar.e;
    }

    public final <T> void l(dyhs<T> dyhsVar) {
        if (!f()) {
            ArrayList arrayList = null;
            int i = 0;
            for (int i2 = 0; i2 < this.e; i2++) {
                if (Arrays.equals(dyhsVar.b, a(i2))) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(d(i2, dyhsVar));
                } else {
                    m(i, a(i2));
                    n(i, b(i2));
                    i++;
                }
            }
            Arrays.fill(this.d, i + i, e(), (Object) null);
            this.e = i;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.e; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(a(i), dbrc.a);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(c.i(c(i)));
            } else {
                sb.append(new String(c(i), dbrc.a));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
