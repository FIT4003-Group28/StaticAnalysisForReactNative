package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ayat  reason: default package */
/* loaded from: classes2.dex */
public final class ayat {
    static final aneg b;
    public Object[] c;
    public int d;
    public static final azqc e = new azqc();
    public static final ayao a = new ayhe(1);

    static {
        aneg anegVar = aneg.d;
        anef anefVar = (anef) anegVar;
        if (anefVar.c != null) {
            anegVar = anefVar.b(anefVar.b, null);
        }
        b = anegVar;
    }

    public ayat() {
    }

    public ayat(int i, Object[] objArr) {
        this.d = i;
        this.c = objArr;
    }

    private final int i() {
        Object[] objArr = this.c;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void j(int i) {
        Object[] objArr = new Object[i];
        if (!l()) {
            System.arraycopy(this.c, 0, objArr, 0, a());
        }
        this.c = objArr;
    }

    private final void k(int i, byte[] bArr) {
        this.c[i + i] = bArr;
    }

    private final boolean l() {
        return this.d == 0;
    }

    public final int a() {
        int i = this.d;
        return i + i;
    }

    public final Object b(ayaq ayaqVar) {
        int i = this.d;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(ayaqVar.b, g(i)));
        Object c = c(i);
        if (c instanceof byte[]) {
            return ayaqVar.a((byte[]) c);
        }
        azos azosVar = (azos) c;
        throw null;
    }

    public final Object c(int i) {
        return this.c[i + i + 1];
    }

    public final void d(ayaq ayaqVar) {
        if (!l()) {
            int i = 0;
            for (int i2 = 0; i2 < this.d; i2++) {
                if (!Arrays.equals(ayaqVar.b, g(i2))) {
                    k(i, g(i2));
                    Object c = c(i2);
                    if (this.c instanceof byte[][]) {
                        j(i());
                    }
                    this.c[i + i + 1] = c;
                    i++;
                }
            }
            Arrays.fill(this.c, i + i, a(), (Object) null);
            this.d = i;
        }
    }

    public final void e(ayat ayatVar) {
        if (ayatVar.l()) {
            return;
        }
        int i = i() - a();
        if (l() || i < ayatVar.a()) {
            j(a() + ayatVar.a());
        }
        System.arraycopy(ayatVar.c, 0, this.c, a(), ayatVar.a());
        this.d += ayatVar.d;
    }

    public final void f(ayaq ayaqVar, Object obj) {
        ayaqVar.getClass();
        obj.getClass();
        if (a() == 0 || a() == i()) {
            int a2 = a();
            j(Math.max(a2 + a2, 8));
        }
        k(this.d, ayaqVar.b);
        int i = this.d;
        this.c[i + i + 1] = ayaqVar.b(obj);
        this.d++;
    }

    public final byte[] g(int i) {
        return (byte[]) this.c[i + i];
    }

    public final byte[] h(int i) {
        Object c = c(i);
        if (c instanceof byte[]) {
            return (byte[]) c;
        }
        azos azosVar = (azos) c;
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.d; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(g(i), amoz.a);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(b.i(h(i)));
            } else {
                sb.append(new String(h(i), amoz.a));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
